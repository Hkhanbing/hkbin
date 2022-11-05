package b.b.a.a.m;

import a.h.j.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f1454a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f1455b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f1456c;
    public final ColorStateList d;
    public final int e;
    public final b.b.a.a.w.j f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, b.b.a.a.w.j jVar, Rect rect) {
        a.h.b.b.e(rect.left);
        a.h.b.b.e(rect.top);
        a.h.b.b.e(rect.right);
        a.h.b.b.e(rect.bottom);
        this.f1454a = rect;
        this.f1455b = colorStateList2;
        this.f1456c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = jVar;
    }

    public static b a(Context context, int i) {
        a.h.b.b.d(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, b.b.a.a.b.o);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList g = b.b.a.a.a.g(context, obtainStyledAttributes, 4);
        ColorStateList g2 = b.b.a.a.a.g(context, obtainStyledAttributes, 9);
        ColorStateList g3 = b.b.a.a.a.g(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        b.b.a.a.w.j a2 = b.b.a.a.w.j.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new b.b.a.a.w.a(0)).a();
        obtainStyledAttributes.recycle();
        return new b(g, g2, g3, dimensionPixelSize, a2, rect);
    }

    public void b(TextView textView) {
        b.b.a.a.w.g gVar = new b.b.a.a.w.g();
        b.b.a.a.w.g gVar2 = new b.b.a.a.w.g();
        gVar.setShapeAppearanceModel(this.f);
        gVar2.setShapeAppearanceModel(this.f);
        gVar.q(this.f1456c);
        gVar.t(this.e, this.d);
        textView.setTextColor(this.f1455b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f1455b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f1454a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        AtomicInteger atomicInteger = a.h.j.w.f667a;
        w.d.q(textView, insetDrawable);
    }
}
