package a.h.d;

import a.h.g.l;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends f {
    public final Class<?> g;
    public final Constructor<?> h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public g() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = m(cls2);
            method4 = n(cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = o(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder f = b.a.a.a.a.f("Unable to collect necessary methods for class ");
            f.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", f.toString(), e);
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method3;
        this.j = method4;
        this.k = method5;
        this.l = method2;
        this.m = method;
    }

    private Object l() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a.h.d.f, a.h.d.k
    public Typeface a(Context context, a.h.c.b.e eVar, Resources resources, int i) {
        a.h.c.b.f[] fVarArr;
        if (!k()) {
            return super.a(context, eVar, resources, i);
        }
        Object l = l();
        if (l == null) {
            return null;
        }
        for (a.h.c.b.f fVar : eVar.f508a) {
            if (!h(context, l, fVar.f509a, fVar.e, fVar.f510b, fVar.f511c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.d))) {
                g(l);
                return null;
            }
        }
        if (j(l)) {
            return i(l);
        }
        return null;
    }

    @Override // a.h.d.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, l[] lVarArr, int i) {
        Typeface i2;
        boolean z;
        if (lVarArr.length < 1) {
            return null;
        }
        if (!k()) {
            l lVar = (l) k.d(lVarArr, i, new j(this));
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(lVar.f574a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(lVar.f576c).setItalic(lVar.d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (l lVar2 : lVarArr) {
            if (lVar2.e == 0) {
                Uri uri = lVar2.f574a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, a.h.b.b.F(context, cancellationSignal, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object l = l();
        if (l == null) {
            return null;
        }
        int length = lVarArr.length;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < length) {
            l lVar3 = lVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar3.f574a);
            if (byteBuffer != null) {
                try {
                    z = ((Boolean) this.j.invoke(l, byteBuffer, Integer.valueOf(lVar3.f575b), null, Integer.valueOf(lVar3.f576c), Integer.valueOf(lVar3.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z = false;
                }
                if (!z) {
                    g(l);
                    return null;
                }
                z2 = true;
            }
            i3++;
            z2 = z2;
        }
        if (!z2) {
            g(l);
            return null;
        } else if (j(l) && (i2 = i(l)) != null) {
            return Typeface.create(i2, i);
        } else {
            return null;
        }
    }

    @Override // a.h.d.k
    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        if (!k()) {
            return super.c(context, resources, i, str, i2);
        }
        Object l = l();
        if (l == null) {
            return null;
        }
        if (!h(context, l, str, 0, -1, -1, null)) {
            g(l);
            return null;
        } else if (j(l)) {
            return i(l);
        } else {
            return null;
        }
    }

    public final void g(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean h(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface i(Object obj) {
        throw null;
    }

    public final boolean j(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean k() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    public Method m(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method n(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method o(Class<?> cls) {
        throw null;
    }
}
