package a.r;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {
    public static volatile a d;
    public static final Object e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Context f1075c;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<? extends b<?>>> f1074b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f1073a = new HashMap();

    public a(Context context) {
        this.f1075c = context.getApplicationContext();
    }

    public static a b(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    d = new a(context);
                }
            }
        }
        return d;
    }

    public <T> T a(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t;
        synchronized (e) {
            if (c.a()) {
                Trace.beginSection(cls.getSimpleName());
            }
            if (set.contains(cls)) {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
            if (!this.f1073a.containsKey(cls)) {
                set.add(cls);
                try {
                    b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends b<?>>> a2 = newInstance.a();
                    if (!a2.isEmpty()) {
                        for (Class<? extends b<?>> cls2 : a2) {
                            if (!this.f1073a.containsKey(cls2)) {
                                a(cls2, set);
                            }
                        }
                    }
                    t = (T) newInstance.b(this.f1075c);
                    set.remove(cls);
                    this.f1073a.put(cls, t);
                } catch (Throwable th) {
                    throw new d(th);
                }
            } else {
                t = (T) this.f1073a.get(cls);
            }
            Trace.endSection();
        }
        return t;
    }
}
