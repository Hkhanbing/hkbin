package b.b.a.a.o;

import android.content.Context;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public class a {
    public static final int f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1505a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1506b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1507c;
    public final int d;
    public final float e;

    public a(Context context) {
        boolean x = b.b.a.a.a.x(context, R.attr.elevationOverlayEnabled, false);
        int e = b.b.a.a.a.e(context, R.attr.elevationOverlayColor, 0);
        int e2 = b.b.a.a.a.e(context, R.attr.elevationOverlayAccentColor, 0);
        int e3 = b.b.a.a.a.e(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1505a = x;
        this.f1506b = e;
        this.f1507c = e2;
        this.d = e3;
        this.e = f2;
    }
}
