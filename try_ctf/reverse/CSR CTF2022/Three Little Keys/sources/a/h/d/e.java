package a.h.d;

import a.h.c.b.h;
import a.h.g.m;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final k f539a;

    /* renamed from: b  reason: collision with root package name */
    public static final a.e.f<String, Typeface> f540b;

    /* loaded from: classes.dex */
    public static class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public h.c f541a;

        public a(h.c cVar) {
            this.f541a = cVar;
        }
    }

    static {
        f539a = Build.VERSION.SDK_INT >= 29 ? new i() : new h();
        f540b = new a.e.f<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.equals(r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r5, a.h.c.b.d r6, android.content.res.Resources r7, int r8, int r9, a.h.c.b.h.c r10, android.os.Handler r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.d.e.a(android.content.Context, a.h.c.b.d, android.content.res.Resources, int, int, a.h.c.b.h$c, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Context context, Resources resources, int i, String str, int i2) {
        Typeface c2 = f539a.c(context, resources, i, str, i2);
        if (c2 != null) {
            f540b.b(c(resources, i, i2), c2);
        }
        return c2;
    }

    public static String c(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
