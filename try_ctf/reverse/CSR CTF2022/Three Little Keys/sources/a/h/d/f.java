package a.h.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class f extends k {

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f542b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor<?> f543c = null;
    public static Method d = null;
    public static Method e = null;
    public static boolean f = false;

    public static boolean e(Object obj, String str, int i, boolean z) {
        f();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void f() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f) {
            return;
        }
        f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f543c = constructor;
        f542b = cls;
        d = method2;
        e = method;
    }

    @Override // a.h.d.k
    public Typeface a(Context context, a.h.c.b.e eVar, Resources resources, int i) {
        a.h.c.b.f[] fVarArr;
        f();
        try {
            Object newInstance = f543c.newInstance(new Object[0]);
            for (a.h.c.b.f fVar : eVar.f508a) {
                File y = a.h.b.b.y(context);
                if (y == null) {
                    return null;
                }
                try {
                    if (!a.h.b.b.o(y, resources, fVar.f)) {
                        return null;
                    }
                    if (!e(newInstance, y.getPath(), fVar.f510b, fVar.f511c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    y.delete();
                }
            }
            f();
            try {
                Object newInstance2 = Array.newInstance(f542b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
