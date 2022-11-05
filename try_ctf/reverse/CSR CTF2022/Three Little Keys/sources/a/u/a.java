package a.u;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final a.e.a<String, Method> f1133a;

    /* renamed from: b  reason: collision with root package name */
    public final a.e.a<String, Method> f1134b;

    /* renamed from: c  reason: collision with root package name */
    public final a.e.a<String, Class> f1135c;

    public a(a.e.a<String, Method> aVar, a.e.a<String, Method> aVar2, a.e.a<String, Class> aVar3) {
        this.f1133a = aVar;
        this.f1134b = aVar2;
        this.f1135c = aVar3;
    }

    public abstract void a();

    public abstract a b();

    public final Class c(Class<? extends c> cls) {
        Class orDefault = this.f1135c.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f1135c.put(cls.getName(), cls2);
            return cls2;
        }
        return orDefault;
    }

    public final Method d(String str) {
        Method orDefault = this.f1133a.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            this.f1133a.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public final Method e(Class cls) {
        Method orDefault = this.f1134b.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class c2 = c(cls);
            System.currentTimeMillis();
            Method declaredMethod = c2.getDeclaredMethod("write", cls, a.class);
            this.f1134b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public abstract boolean f();

    public abstract byte[] g();

    public abstract CharSequence h();

    public abstract boolean i(int i);

    public abstract int j();

    public int k(int i, int i2) {
        return !i(i2) ? i : j();
    }

    public abstract <T extends Parcelable> T l();

    public <T extends Parcelable> T m(T t, int i) {
        return !i(i) ? t : (T) l();
    }

    public abstract String n();

    public <T extends c> T o() {
        String n = n();
        if (n == null) {
            return null;
        }
        try {
            return (T) d(n).invoke(null, b());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public abstract void p(int i);

    public abstract void q(boolean z);

    public abstract void r(byte[] bArr);

    public abstract void s(CharSequence charSequence);

    public abstract void t(int i);

    public abstract void u(Parcelable parcelable);

    public abstract void v(String str);

    /* JADX WARN: Multi-variable type inference failed */
    public void w(c cVar) {
        if (cVar == null) {
            v(null);
            return;
        }
        try {
            v(c(cVar.getClass()).getName());
            a b2 = b();
            try {
                e(cVar.getClass()).invoke(null, cVar, b2);
                b2.a();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}
