package a.h.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final a.e.f<String, Typeface> f567a = new a.e.f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f568b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f569c;
    public static final a.e.h<String, ArrayList<a.h.i.a<a>>> d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f570a;

        /* renamed from: b  reason: collision with root package name */
        public final int f571b;

        public a(int i) {
            this.f570a = null;
            this.f571b = i;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f570a = typeface;
            this.f571b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f568b = threadPoolExecutor;
        f569c = new Object();
        d = new a.e.h<>();
    }

    public static a a(String str, Context context, e eVar, int i) {
        int i2;
        Typeface a2 = f567a.a(str);
        if (a2 != null) {
            return new a(a2);
        }
        try {
            k a3 = d.a(context, eVar, null);
            int i3 = a3.f572a;
            int i4 = 1;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = -2;
                }
                i2 = -3;
            } else {
                l[] lVarArr = a3.f573b;
                if (lVarArr != null && lVarArr.length != 0) {
                    for (l lVar : lVarArr) {
                        int i5 = lVar.e;
                        if (i5 != 0) {
                            if (i5 >= 0) {
                                i2 = i5;
                            }
                            i2 = -3;
                        }
                    }
                    i4 = 0;
                }
                i2 = i4;
            }
            if (i2 != 0) {
                return new a(i2);
            }
            Typeface b2 = a.h.d.e.f539a.b(context, null, a3.f573b, i);
            if (b2 == null) {
                return new a(-3);
            }
            f567a.b(str, b2);
            return new a(b2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }
}
