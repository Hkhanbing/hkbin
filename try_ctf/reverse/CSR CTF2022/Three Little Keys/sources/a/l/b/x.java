package a.l.b;

import a.l.b.m;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public static final a.e.h<ClassLoader, a.e.h<String, Class<?>>> f928a = new a.e.h<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        a.e.h<ClassLoader, a.e.h<String, Class<?>>> hVar = f928a;
        a.e.h<String, Class<?>> orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new a.e.h<>();
            hVar.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 == null) {
            Class<?> cls = Class.forName(str, false, classLoader);
            orDefault.put(str, cls);
            return cls;
        }
        return orDefault2;
    }

    public static Class<? extends m> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new m.c(b.a.a.a.a.e("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new m.c(b.a.a.a.a.e("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public m a(ClassLoader classLoader, String str) {
        throw null;
    }
}
