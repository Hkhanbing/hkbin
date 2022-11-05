package a.n;

import a.n.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f957c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, C0026a> f958a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Boolean> f959b = new HashMap();

    @Deprecated
    /* renamed from: a.n.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0026a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<f.a, List<b>> f960a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, f.a> f961b;

        public C0026a(Map<b, f.a> map) {
            this.f961b = map;
            for (Map.Entry<b, f.a> entry : map.entrySet()) {
                f.a value = entry.getValue();
                List<b> list = this.f960a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f960a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void a(List<b> list, j jVar, f.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    Objects.requireNonNull(bVar);
                    try {
                        int i = bVar.f962a;
                        if (i == 0) {
                            bVar.f963b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar.f963b.invoke(obj, jVar);
                        } else if (i == 2) {
                            bVar.f963b.invoke(obj, jVar, aVar);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f962a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f963b;

        public b(int i, Method method) {
            this.f962a = i;
            this.f963b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f962a == bVar.f962a && this.f963b.getName().equals(bVar.f963b.getName());
        }

        public int hashCode() {
            return this.f963b.getName().hashCode() + (this.f962a * 31);
        }
    }

    public final C0026a a(Class<?> cls, Method[] methodArr) {
        int i;
        C0026a b2;
        Class<?> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (b2 = b(superclass)) != null) {
            hashMap.putAll(b2.f961b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, f.a> entry : b(cls2).f961b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            q qVar = (q) method.getAnnotation(q.class);
            if (qVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(j.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                f.a value = qVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(f.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != f.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(hashMap, new b(i, method), value, cls);
                z = true;
            }
        }
        C0026a c0026a = new C0026a(hashMap);
        this.f958a.put(cls, c0026a);
        this.f959b.put(cls, Boolean.valueOf(z));
        return c0026a;
    }

    public C0026a b(Class<?> cls) {
        C0026a c0026a = this.f958a.get(cls);
        return c0026a != null ? c0026a : a(cls, null);
    }

    public final void c(Map<b, f.a> map, b bVar, f.a aVar, Class<?> cls) {
        f.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 != null) {
                return;
            }
            map.put(bVar, aVar);
            return;
        }
        Method method = bVar.f963b;
        StringBuilder f = b.a.a.a.a.f("Method ");
        f.append(method.getName());
        f.append(" in ");
        f.append(cls.getName());
        f.append(" already declared with different @OnLifecycleEvent value: previous value ");
        f.append(aVar2);
        f.append(", new value ");
        f.append(aVar);
        throw new IllegalArgumentException(f.toString());
    }
}
