package b.b.a.a.r;

import a.h.h.d;
import a.h.j.w;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e {
    public b.b.a.a.t.a A;
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f1531a;
    public float a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1532b;
    public float b0;

    /* renamed from: c  reason: collision with root package name */
    public float f1533c;
    public CharSequence c0;
    public float d;
    public final Rect e;
    public final Rect f;
    public final RectF g;
    public int h = 16;
    public int i = 16;
    public float j = 15.0f;
    public float k = 15.0f;
    public ColorStateList l;
    public ColorStateList m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public Typeface t;
    public Typeface u;
    public Typeface v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public Typeface z;

    public e(View view) {
        this.f1531a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f = new Rect();
        this.e = new Rect();
        this.g = new RectF();
        this.d = 0.5f;
        i(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float h(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return b.b.a.a.c.a.a(f, f2, f3);
    }

    public static boolean l(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    public final boolean b(CharSequence charSequence) {
        View view = this.f1531a;
        AtomicInteger atomicInteger = w.f667a;
        boolean z = true;
        if (w.e.d(view) != 1) {
            z = false;
        }
        return ((d.c) (z ? a.h.h.d.d : a.h.h.d.f596c)).b(charSequence, 0, charSequence.length());
    }

    public final void c(float f) {
        TextPaint textPaint;
        int f2;
        this.g.left = h(this.e.left, this.f.left, f, this.P);
        this.g.top = h(this.n, this.o, f, this.P);
        this.g.right = h(this.e.right, this.f.right, f, this.P);
        this.g.bottom = h(this.e.bottom, this.f.bottom, f, this.P);
        this.r = h(this.p, this.q, f, this.P);
        this.s = h(this.n, this.o, f, this.P);
        q(f);
        TimeInterpolator timeInterpolator = b.b.a.a.c.a.f1371b;
        this.a0 = 1.0f - h(0.0f, 1.0f, 1.0f - f, timeInterpolator);
        View view = this.f1531a;
        AtomicInteger atomicInteger = w.f667a;
        w.d.k(view);
        this.b0 = h(1.0f, 0.0f, f, timeInterpolator);
        w.d.k(this.f1531a);
        ColorStateList colorStateList = this.m;
        ColorStateList colorStateList2 = this.l;
        if (colorStateList != colorStateList2) {
            textPaint = this.N;
            f2 = a(g(colorStateList2), f(), f);
        } else {
            textPaint = this.N;
            f2 = f();
        }
        textPaint.setColor(f2);
        float f3 = this.V;
        float f4 = this.W;
        if (f3 != f4) {
            this.N.setLetterSpacing(h(f4, f3, f, timeInterpolator));
        } else {
            this.N.setLetterSpacing(f3);
        }
        this.H = h(0.0f, this.R, f, null);
        this.I = h(0.0f, this.S, f, null);
        this.J = h(0.0f, this.T, f, null);
        int a2 = a(g(null), g(this.U), f);
        this.K = a2;
        this.N.setShadowLayer(this.H, this.I, this.J, a2);
        w.d.k(this.f1531a);
    }

    public final void d(float f, boolean z) {
        boolean z2;
        float f2;
        float f3;
        StaticLayout staticLayout;
        if (this.B == null) {
            return;
        }
        float width = this.f.width();
        float width2 = this.e.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.k;
            f3 = this.V;
            this.F = 1.0f;
            Typeface typeface = this.z;
            Typeface typeface2 = this.t;
            if (typeface != typeface2) {
                this.z = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f4 = this.j;
            float f5 = this.W;
            Typeface typeface3 = this.z;
            Typeface typeface4 = this.w;
            if (typeface3 != typeface4) {
                this.z = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.j, this.k, f, this.Q) / this.j;
            }
            float f6 = this.k / this.j;
            width = (!z && width2 * f6 > width) ? Math.min(width / f6, width2) : width2;
            f2 = f4;
            f3 = f5;
        }
        if (width > 0.0f) {
            z2 = ((this.G > f2 ? 1 : (this.G == f2 ? 0 : -1)) != 0) || ((this.X > f3 ? 1 : (this.X == f3 ? 0 : -1)) != 0) || this.M || z2;
            this.G = f2;
            this.X = f3;
            this.M = false;
        }
        if (this.C != null && !z2) {
            return;
        }
        this.N.setTextSize(this.G);
        this.N.setTypeface(this.z);
        this.N.setLetterSpacing(this.X);
        this.N.setLinearText(this.F != 1.0f);
        this.D = b(this.B);
        boolean z3 = this.D;
        try {
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            CharSequence charSequence = this.B;
            TextPaint textPaint = this.N;
            int length = charSequence.length();
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            int max = Math.max(0, (int) width);
            CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, max, truncateAt);
            int min = Math.min(ellipsize.length(), length);
            if (z3) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(ellipsize, 0, min, textPaint, max);
            obtain.setAlignment(alignment);
            obtain.setIncludePad(false);
            obtain.setTextDirection(z3 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(1);
            staticLayout = obtain.build();
        } catch (k e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        Objects.requireNonNull(staticLayout);
        this.Y = staticLayout;
        this.C = staticLayout.getText();
    }

    public float e() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.k);
        textPaint.setTypeface(this.t);
        textPaint.setLetterSpacing(this.V);
        return -this.O.ascent();
    }

    public int f() {
        return g(this.m);
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.v;
            if (typeface != null) {
                this.u = b.b.a.a.a.r(configuration, typeface);
            }
            Typeface typeface2 = this.y;
            if (typeface2 != null) {
                this.x = b.b.a.a.a.r(configuration, typeface2);
            }
            Typeface typeface3 = this.u;
            if (typeface3 == null) {
                typeface3 = this.v;
            }
            this.t = typeface3;
            Typeface typeface4 = this.x;
            if (typeface4 == null) {
                typeface4 = this.y;
            }
            this.w = typeface4;
            k(true);
        }
    }

    public void j() {
        this.f1532b = this.f.width() > 0 && this.f.height() > 0 && this.e.width() > 0 && this.e.height() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(boolean r11) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.r.e.k(boolean):void");
    }

    public void m(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            k(false);
        }
    }

    public void n(int i) {
        if (this.i != i) {
            this.i = i;
            k(false);
        }
    }

    public final boolean o(Typeface typeface) {
        b.b.a.a.t.a aVar = this.A;
        if (aVar != null) {
            aVar.f1561c = true;
        }
        if (this.v != typeface) {
            this.v = typeface;
            Typeface r = b.b.a.a.a.r(this.f1531a.getContext().getResources().getConfiguration(), typeface);
            this.u = r;
            if (r == null) {
                r = this.v;
            }
            this.t = r;
            return true;
        }
        return false;
    }

    public void p(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f1533c) {
            this.f1533c = f;
            c(f);
        }
    }

    public final void q(float f) {
        d(f, false);
        View view = this.f1531a;
        AtomicInteger atomicInteger = w.f667a;
        w.d.k(view);
    }

    public void r(Typeface typeface) {
        boolean z;
        boolean o = o(typeface);
        if (this.y != typeface) {
            this.y = typeface;
            Typeface r = b.b.a.a.a.r(this.f1531a.getContext().getResources().getConfiguration(), typeface);
            this.x = r;
            if (r == null) {
                r = this.y;
            }
            this.w = r;
            z = true;
        } else {
            z = false;
        }
        if (o || z) {
            k(false);
        }
    }

    public final boolean s() {
        return false;
    }
}
