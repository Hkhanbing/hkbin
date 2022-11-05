package a.b.f;

import a.h.j.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class z extends u {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public z(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    @Override // a.b.f.u
    public void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        Context context = this.d.getContext();
        int[] iArr = a.b.b.g;
        d1 q = d1.q(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.d;
        a.h.j.w.o(seekBar, seekBar.getContext(), iArr, attributeSet, q.f193b, i, 0);
        Drawable h = q.h(0);
        if (h != null) {
            this.d.setThumb(h);
        }
        Drawable g = q.g(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = g;
        if (g != null) {
            g.setCallback(this.d);
            SeekBar seekBar2 = this.d;
            AtomicInteger atomicInteger = a.h.j.w.f667a;
            g.setLayoutDirection(w.e.d(seekBar2));
            if (g.isStateful()) {
                g.setState(this.d.getDrawableState());
            }
            c();
        }
        this.d.invalidate();
        if (q.o(3)) {
            this.g = k0.d(q.j(3, -1), this.g);
            this.i = true;
        }
        if (q.o(2)) {
            this.f = q.c(2);
            this.h = true;
        }
        q.f193b.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (!this.h && !this.i) {
                return;
            }
            Drawable mutate = drawable.mutate();
            this.e = mutate;
            if (this.h) {
                mutate.setTintList(this.f);
            }
            if (this.i) {
                this.e.setTintMode(this.g);
            }
            if (!this.e.isStateful()) {
                return;
            }
            this.e.setState(this.d.getDrawableState());
        }
    }

    public void d(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            int i = 1;
            if (max <= 1) {
                return;
            }
            int intrinsicWidth = this.e.getIntrinsicWidth();
            int intrinsicHeight = this.e.getIntrinsicHeight();
            int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
            if (intrinsicHeight >= 0) {
                i = intrinsicHeight / 2;
            }
            this.e.setBounds(-i2, -i, i2, i);
            float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
            int save = canvas.save();
            canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
            for (int i3 = 0; i3 <= max; i3++) {
                this.e.draw(canvas);
                canvas.translate(width, 0.0f);
            }
            canvas.restoreToCount(save);
        }
    }
}
