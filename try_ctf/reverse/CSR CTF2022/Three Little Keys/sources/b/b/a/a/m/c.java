package b.b.a.a.m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f1458a;

    /* renamed from: b  reason: collision with root package name */
    public final b f1459b;

    /* renamed from: c  reason: collision with root package name */
    public final b f1460c;
    public final b d;
    public final b e;
    public final b f;
    public final b g;
    public final Paint h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.b.a.a.a.y(context, R.attr.materialCalendarStyle, g.class.getCanonicalName()), b.b.a.a.b.n);
        this.f1458a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f1459b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f1460c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList g = b.b.a.a.a.g(context, obtainStyledAttributes, 6);
        this.d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(g.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
