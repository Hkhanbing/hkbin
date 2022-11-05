package a.b.f;

import a.h.j.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final View f203a;
    public b1 d;
    public b1 e;
    public b1 f;

    /* renamed from: c  reason: collision with root package name */
    public int f205c = -1;

    /* renamed from: b  reason: collision with root package name */
    public final l f204b = l.a();

    public f(View view) {
        this.f203a = view;
    }

    public void a() {
        Drawable background = this.f203a.getBackground();
        if (background != null) {
            boolean z = true;
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new b1();
                }
                b1 b1Var = this.f;
                b1Var.f177a = null;
                b1Var.d = false;
                b1Var.f178b = null;
                b1Var.f179c = false;
                View view = this.f203a;
                AtomicInteger atomicInteger = a.h.j.w.f667a;
                ColorStateList g = w.i.g(view);
                if (g != null) {
                    b1Var.d = true;
                    b1Var.f177a = g;
                }
                PorterDuff.Mode h = w.i.h(this.f203a);
                if (h != null) {
                    b1Var.f179c = true;
                    b1Var.f178b = h;
                }
                if (b1Var.d || b1Var.f179c) {
                    l.f(background, b1Var, this.f203a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            b1 b1Var2 = this.e;
            if (b1Var2 != null) {
                l.f(background, b1Var2, this.f203a.getDrawableState());
                return;
            }
            b1 b1Var3 = this.d;
            if (b1Var3 == null) {
                return;
            }
            l.f(background, b1Var3, this.f203a.getDrawableState());
        }
    }

    public ColorStateList b() {
        b1 b1Var = this.e;
        if (b1Var != null) {
            return b1Var.f177a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        b1 b1Var = this.e;
        if (b1Var != null) {
            return b1Var.f178b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        Context context = this.f203a.getContext();
        int[] iArr = a.b.b.z;
        d1 q = d1.q(context, attributeSet, iArr, i, 0);
        View view = this.f203a;
        a.h.j.w.o(view, view.getContext(), iArr, attributeSet, q.f193b, i, 0);
        try {
            if (q.o(0)) {
                this.f205c = q.l(0, -1);
                ColorStateList d = this.f204b.d(this.f203a.getContext(), this.f205c);
                if (d != null) {
                    g(d);
                }
            }
            if (q.o(1)) {
                w.i.q(this.f203a, q.c(1));
            }
            if (q.o(2)) {
                w.i.r(this.f203a, k0.d(q.j(2, -1), null));
            }
        } finally {
            q.f193b.recycle();
        }
    }

    public void e() {
        this.f205c = -1;
        g(null);
        a();
    }

    public void f(int i) {
        this.f205c = i;
        l lVar = this.f204b;
        g(lVar != null ? lVar.d(this.f203a.getContext(), i) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new b1();
            }
            b1 b1Var = this.d;
            b1Var.f177a = colorStateList;
            b1Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new b1();
        }
        b1 b1Var = this.e;
        b1Var.f177a = colorStateList;
        b1Var.d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new b1();
        }
        b1 b1Var = this.e;
        b1Var.f178b = mode;
        b1Var.f179c = true;
        a();
    }
}
