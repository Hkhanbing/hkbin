package a.h.d;

import a.h.g.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class k {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Long, a.h.c.b.e> f544a = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public interface a<T> {
        int a(T t);

        boolean b(T t);
    }

    public static <T> T d(T[] tArr, int i, a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.a(t2) - i2) * 2) + (aVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    public Typeface a(Context context, a.h.c.b.e eVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, l[] lVarArr, int i) {
        throw null;
    }

    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        File y = a.h.b.b.y(context);
        if (y == null) {
            return null;
        }
        try {
            if (a.h.b.b.o(y, resources, i)) {
                return Typeface.createFromFile(y.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            y.delete();
        }
    }
}
