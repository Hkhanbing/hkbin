package a.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f270a;

    /* renamed from: b  reason: collision with root package name */
    public b1 f271b;

    /* renamed from: c  reason: collision with root package name */
    public int f272c = 0;

    public q(ImageView imageView) {
        this.f270a = imageView;
    }

    public void a() {
        b1 b1Var;
        Drawable drawable = this.f270a.getDrawable();
        if (drawable != null) {
            k0.b(drawable);
        }
        if (drawable == null || (b1Var = this.f271b) == null) {
            return;
        }
        l.f(drawable, b1Var, this.f270a.getDrawableState());
    }

    public void b(AttributeSet attributeSet, int i) {
        int l;
        Context context = this.f270a.getContext();
        int[] iArr = a.b.b.f;
        d1 q = d1.q(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f270a;
        a.h.j.w.o(imageView, imageView.getContext(), iArr, attributeSet, q.f193b, i, 0);
        try {
            Drawable drawable = this.f270a.getDrawable();
            if (drawable == null && (l = q.l(1, -1)) != -1 && (drawable = a.b.a.e(this.f270a.getContext(), l)) != null) {
                this.f270a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                k0.b(drawable);
            }
            if (q.o(2)) {
                this.f270a.setImageTintList(q.c(2));
            }
            if (q.o(3)) {
                this.f270a.setImageTintMode(k0.d(q.j(3, -1), null));
            }
            q.f193b.recycle();
        } catch (Throwable th) {
            q.f193b.recycle();
            throw th;
        }
    }

    public void c(int i) {
        if (i != 0) {
            Drawable e = a.b.a.e(this.f270a.getContext(), i);
            if (e != null) {
                k0.b(e);
            }
            this.f270a.setImageDrawable(e);
        } else {
            this.f270a.setImageDrawable(null);
        }
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (this.f271b == null) {
            this.f271b = new b1();
        }
        b1 b1Var = this.f271b;
        b1Var.f177a = colorStateList;
        b1Var.d = true;
        a();
    }

    public void e(PorterDuff.Mode mode) {
        if (this.f271b == null) {
            this.f271b = new b1();
        }
        b1 b1Var = this.f271b;
        b1Var.f178b = mode;
        b1Var.f179c = true;
        a();
    }
}
