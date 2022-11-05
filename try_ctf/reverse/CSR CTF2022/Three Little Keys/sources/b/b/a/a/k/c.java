package b.b.a.a.k;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import b.b.a.a.r.l;
import b.b.a.a.w.g;
import b.b.a.a.w.j;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c extends g implements Drawable.Callback, l.b {
    public static final int[] I0 = {16842910};
    public static final ShapeDrawable J0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public int[] A0;
    public float B;
    public boolean B0;
    public float C;
    public ColorStateList C0;
    public ColorStateList D;
    public WeakReference<a> D0;
    public float E;
    public TextUtils.TruncateAt E0;
    public ColorStateList F;
    public boolean F0;
    public CharSequence G;
    public int G0;
    public boolean H;
    public boolean H0;
    public Drawable I;
    public ColorStateList J;
    public float K;
    public boolean L;
    public boolean M;
    public Drawable N;
    public Drawable O;
    public ColorStateList P;
    public float Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public b.b.a.a.c.g W;
    public b.b.a.a.c.g X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public float e0;
    public float f0;
    public final Context g0;
    public final Paint h0;
    public final Paint.FontMetrics i0;
    public final RectF j0;
    public final PointF k0;
    public final Path l0;
    public final l m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public boolean t0;
    public int u0;
    public int v0;
    public ColorFilter w0;
    public PorterDuffColorFilter x0;
    public ColorStateList y0;
    public ColorStateList z;
    public PorterDuff.Mode z0;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public c(Context context, AttributeSet attributeSet, int i, int i2) {
        super(j.b(context, attributeSet, i, i2).a());
        this.C = -1.0f;
        this.h0 = new Paint(1);
        this.i0 = new Paint.FontMetrics();
        this.j0 = new RectF();
        this.k0 = new PointF();
        this.l0 = new Path();
        this.v0 = 255;
        this.z0 = PorterDuff.Mode.SRC_IN;
        this.D0 = new WeakReference<>(null);
        this.f1578a.f1583b = new b.b.a.a.o.a(context);
        x();
        this.g0 = context;
        l lVar = new l(this);
        this.m0 = lVar;
        this.G = "";
        lVar.f1545a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = I0;
        setState(iArr);
        e0(iArr);
        this.F0 = true;
        int[] iArr2 = b.b.a.a.u.a.f1570a;
        J0.setTint(-1);
    }

    public static boolean H(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean I(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public float A() {
        if (q0() || p0()) {
            return G() + this.Z + this.a0;
        }
        return 0.0f;
    }

    public final void B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (r0()) {
            float f = this.f0 + this.e0;
            if (getLayoutDirection() == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.Q;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.Q;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.Q;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public final void C(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (r0()) {
            float f = this.f0 + this.e0 + this.Q + this.d0 + this.c0;
            if (getLayoutDirection() == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public float D() {
        if (r0()) {
            return this.d0 + this.Q + this.e0;
        }
        return 0.0f;
    }

    public float E() {
        return this.H0 ? m() : this.C;
    }

    public Drawable F() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return drawable instanceof a.h.d.l.a ? ((a.h.d.l.a) drawable).a() : drawable;
        }
        return null;
    }

    public final float G() {
        Drawable drawable = this.t0 ? this.U : this.I;
        float f = this.K;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    public void J() {
        a aVar = this.D0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean K(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.z;
        int e = e(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.n0) : 0);
        boolean z3 = true;
        if (this.n0 != e) {
            this.n0 = e;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.A;
        int e2 = e(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.o0) : 0);
        if (this.o0 != e2) {
            this.o0 = e2;
            onStateChange = true;
        }
        int b2 = a.h.d.a.b(e2, e);
        if ((this.p0 != b2) | (this.f1578a.d == null)) {
            this.p0 = b2;
            q(ColorStateList.valueOf(b2));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.D;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.q0) : 0;
        if (this.q0 != colorForState) {
            this.q0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.C0 == null || !b.b.a.a.u.a.b(iArr)) ? 0 : this.C0.getColorForState(iArr, this.r0);
        if (this.r0 != colorForState2) {
            this.r0 = colorForState2;
            if (this.B0) {
                onStateChange = true;
            }
        }
        b.b.a.a.t.b bVar = this.m0.f;
        int colorForState3 = (bVar == null || (colorStateList = bVar.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.s0);
        if (this.s0 != colorForState3) {
            this.s0 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i : state) {
                if (i == 16842912) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z4 = z && this.S;
        if (this.t0 == z4 || this.U == null) {
            z2 = false;
        } else {
            float A = A();
            this.t0 = z4;
            if (A != A()) {
                onStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.y0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.u0) : 0;
        if (this.u0 != colorForState4) {
            this.u0 = colorForState4;
            this.x0 = b.b.a.a.a.C(this, this.y0, this.z0);
        } else {
            z3 = onStateChange;
        }
        if (I(this.I)) {
            z3 |= this.I.setState(iArr);
        }
        if (I(this.U)) {
            z3 |= this.U.setState(iArr);
        }
        if (I(this.N)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z3 |= this.N.setState(iArr3);
        }
        int[] iArr4 = b.b.a.a.u.a.f1570a;
        if (I(this.O)) {
            z3 |= this.O.setState(iArr2);
        }
        if (z3) {
            invalidateSelf();
        }
        if (z2) {
            J();
        }
        return z3;
    }

    public void L(boolean z) {
        if (this.S != z) {
            this.S = z;
            float A = A();
            if (!z && this.t0) {
                this.t0 = false;
            }
            float A2 = A();
            invalidateSelf();
            if (A == A2) {
                return;
            }
            J();
        }
    }

    public void M(Drawable drawable) {
        if (this.U != drawable) {
            float A = A();
            this.U = drawable;
            float A2 = A();
            s0(this.U);
            y(this.U);
            invalidateSelf();
            if (A == A2) {
                return;
            }
            J();
        }
    }

    public void N(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (this.T && this.U != null && this.S) {
                this.U.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void O(boolean z) {
        if (this.T != z) {
            boolean p0 = p0();
            this.T = z;
            boolean p02 = p0();
            if (!(p0 != p02)) {
                return;
            }
            if (p02) {
                y(this.U);
            } else {
                s0(this.U);
            }
            invalidateSelf();
            J();
        }
    }

    public void P(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    public void Q(float f) {
        if (this.C != f) {
            this.C = f;
            this.f1578a.f1582a = this.f1578a.f1582a.e(f);
            invalidateSelf();
        }
    }

    public void R(float f) {
        if (this.f0 != f) {
            this.f0 = f;
            invalidateSelf();
            J();
        }
    }

    public void S(Drawable drawable) {
        Drawable drawable2 = this.I;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof a.h.d.l.a) {
            drawable2 = ((a.h.d.l.a) drawable2).a();
        }
        if (drawable2 != drawable) {
            float A = A();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.I = drawable3;
            float A2 = A();
            s0(drawable2);
            if (q0()) {
                y(this.I);
            }
            invalidateSelf();
            if (A == A2) {
                return;
            }
            J();
        }
    }

    public void T(float f) {
        if (this.K != f) {
            float A = A();
            this.K = f;
            float A2 = A();
            invalidateSelf();
            if (A == A2) {
                return;
            }
            J();
        }
    }

    public void U(ColorStateList colorStateList) {
        this.L = true;
        if (this.J != colorStateList) {
            this.J = colorStateList;
            if (q0()) {
                this.I.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void V(boolean z) {
        if (this.H != z) {
            boolean q0 = q0();
            this.H = z;
            boolean q02 = q0();
            if (!(q0 != q02)) {
                return;
            }
            if (q02) {
                y(this.I);
            } else {
                s0(this.I);
            }
            invalidateSelf();
            J();
        }
    }

    public void W(float f) {
        if (this.B != f) {
            this.B = f;
            invalidateSelf();
            J();
        }
    }

    public void X(float f) {
        if (this.Y != f) {
            this.Y = f;
            invalidateSelf();
            J();
        }
    }

    public void Y(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.H0) {
                u(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Z(float f) {
        if (this.E != f) {
            this.E = f;
            this.h0.setStrokeWidth(f);
            if (this.H0) {
                this.f1578a.l = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    @Override // b.b.a.a.r.l.b
    public void a() {
        J();
        invalidateSelf();
    }

    public void a0(Drawable drawable) {
        Drawable F = F();
        if (F != drawable) {
            float D = D();
            this.N = drawable != null ? drawable.mutate() : null;
            int[] iArr = b.b.a.a.u.a.f1570a;
            this.O = new RippleDrawable(b.b.a.a.u.a.a(this.F), this.N, J0);
            float D2 = D();
            s0(F);
            if (r0()) {
                y(this.N);
            }
            invalidateSelf();
            if (D == D2) {
                return;
            }
            J();
        }
    }

    public void b0(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            if (!r0()) {
                return;
            }
            J();
        }
    }

    public void c0(float f) {
        if (this.Q != f) {
            this.Q = f;
            invalidateSelf();
            if (!r0()) {
                return;
            }
            J();
        }
    }

    public void d0(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (!r0()) {
                return;
            }
            J();
        }
    }

    @Override // b.b.a.a.w.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.v0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        if (!this.H0) {
            this.h0.setColor(this.n0);
            this.h0.setStyle(Paint.Style.FILL);
            this.j0.set(bounds);
            canvas.drawRoundRect(this.j0, E(), E(), this.h0);
        }
        if (!this.H0) {
            this.h0.setColor(this.o0);
            this.h0.setStyle(Paint.Style.FILL);
            Paint paint = this.h0;
            ColorFilter colorFilter = this.w0;
            if (colorFilter == null) {
                colorFilter = this.x0;
            }
            paint.setColorFilter(colorFilter);
            this.j0.set(bounds);
            canvas.drawRoundRect(this.j0, E(), E(), this.h0);
        }
        if (this.H0) {
            super.draw(canvas);
        }
        if (this.E > 0.0f && !this.H0) {
            this.h0.setColor(this.q0);
            this.h0.setStyle(Paint.Style.STROKE);
            if (!this.H0) {
                Paint paint2 = this.h0;
                ColorFilter colorFilter2 = this.w0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.x0;
                }
                paint2.setColorFilter(colorFilter2);
            }
            RectF rectF = this.j0;
            float f2 = this.E / 2.0f;
            rectF.set(bounds.left + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.C - (this.E / 2.0f);
            canvas.drawRoundRect(this.j0, f3, f3, this.h0);
        }
        this.h0.setColor(this.r0);
        this.h0.setStyle(Paint.Style.FILL);
        this.j0.set(bounds);
        if (!this.H0) {
            canvas.drawRoundRect(this.j0, E(), E(), this.h0);
        } else {
            c(new RectF(bounds), this.l0);
            g(canvas, this.h0, this.l0, this.f1578a.f1582a, i());
        }
        if (q0()) {
            z(bounds, this.j0);
            RectF rectF2 = this.j0;
            float f4 = rectF2.left;
            float f5 = rectF2.top;
            canvas.translate(f4, f5);
            this.I.setBounds(0, 0, (int) this.j0.width(), (int) this.j0.height());
            this.I.draw(canvas);
            canvas.translate(-f4, -f5);
        }
        if (p0()) {
            z(bounds, this.j0);
            RectF rectF3 = this.j0;
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.U.setBounds(0, 0, (int) this.j0.width(), (int) this.j0.height());
            this.U.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (!this.F0 || this.G == null) {
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.k0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.G != null) {
                float A = A() + this.Y + this.b0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + A;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - A;
                    align = Paint.Align.RIGHT;
                }
                this.m0.f1545a.getFontMetrics(this.i0);
                Paint.FontMetrics fontMetrics = this.i0;
                pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            RectF rectF4 = this.j0;
            rectF4.setEmpty();
            if (this.G != null) {
                float A2 = A() + this.Y + this.b0;
                float D = D() + this.f0 + this.c0;
                if (getLayoutDirection() == 0) {
                    rectF4.left = bounds.left + A2;
                    f = bounds.right - D;
                } else {
                    rectF4.left = bounds.left + D;
                    f = bounds.right - A2;
                }
                rectF4.right = f;
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            l lVar = this.m0;
            if (lVar.f != null) {
                lVar.f1545a.drawableState = getState();
                l lVar2 = this.m0;
                lVar2.f.e(this.g0, lVar2.f1545a, lVar2.f1546b);
            }
            this.m0.f1545a.setTextAlign(align);
            boolean z = Math.round(this.m0.a(this.G.toString())) > Math.round(this.j0.width());
            if (z) {
                i5 = canvas.save();
                canvas.clipRect(this.j0);
            } else {
                i5 = 0;
            }
            CharSequence charSequence = this.G;
            if (z && this.E0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.m0.f1545a, this.j0.width(), this.E0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF2 = this.k0;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence2, 0, length, pointF2.x, pointF2.y, this.m0.f1545a);
            if (z) {
                canvas.restoreToCount(i5);
            }
        }
        if (r0()) {
            B(bounds, this.j0);
            RectF rectF5 = this.j0;
            float f8 = rectF5.left;
            float f9 = rectF5.top;
            canvas.translate(f8, f9);
            this.N.setBounds(i3, i3, (int) this.j0.width(), (int) this.j0.height());
            int[] iArr = b.b.a.a.u.a.f1570a;
            this.O.setBounds(this.N.getBounds());
            this.O.jumpToCurrentState();
            this.O.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (this.v0 >= i4) {
            return;
        }
        canvas.restoreToCount(i2);
    }

    public boolean e0(int[] iArr) {
        if (!Arrays.equals(this.A0, iArr)) {
            this.A0 = iArr;
            if (!r0()) {
                return false;
            }
            return K(getState(), iArr);
        }
        return false;
    }

    public void f0(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (r0()) {
                this.N.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void g0(boolean z) {
        if (this.M != z) {
            boolean r0 = r0();
            this.M = z;
            boolean r02 = r0();
            if (!(r0 != r02)) {
                return;
            }
            if (r02) {
                y(this.N);
            } else {
                s0(this.N);
            }
            invalidateSelf();
            J();
        }
    }

    @Override // b.b.a.a.w.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.v0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.w0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(D() + this.m0.a(this.G.toString()) + A() + this.Y + this.b0 + this.c0 + this.f0), this.G0);
    }

    @Override // b.b.a.a.w.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // b.b.a.a.w.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.H0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.B, this.C);
        }
        outline.setAlpha(this.v0 / 255.0f);
    }

    public void h0(float f) {
        if (this.a0 != f) {
            float A = A();
            this.a0 = f;
            float A2 = A();
            invalidateSelf();
            if (A == A2) {
                return;
            }
            J();
        }
    }

    public void i0(float f) {
        if (this.Z != f) {
            float A = A();
            this.Z = f;
            float A2 = A();
            invalidateSelf();
            if (A == A2) {
                return;
            }
            J();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // b.b.a.a.w.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        if (!H(this.z) && !H(this.A) && !H(this.D) && (!this.B0 || !H(this.C0))) {
            b.b.a.a.t.b bVar = this.m0.f;
            if (!((bVar == null || (colorStateList = bVar.j) == null || !colorStateList.isStateful()) ? false : true)) {
                if (!(this.T && this.U != null && this.S) && !I(this.I) && !I(this.U) && !H(this.y0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void j0(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            this.C0 = this.B0 ? b.b.a.a.u.a.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void k0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.m0.d = true;
            invalidateSelf();
            J();
        }
    }

    public void l0(b.b.a.a.t.b bVar) {
        l lVar = this.m0;
        Context context = this.g0;
        if (lVar.f != bVar) {
            lVar.f = bVar;
            if (bVar != null) {
                bVar.f(context, lVar.f1545a, lVar.f1546b);
                l.b bVar2 = lVar.e.get();
                if (bVar2 != null) {
                    lVar.f1545a.drawableState = bVar2.getState();
                }
                bVar.e(context, lVar.f1545a, lVar.f1546b);
                lVar.d = true;
            }
            l.b bVar3 = lVar.e.get();
            if (bVar3 == null) {
                return;
            }
            bVar3.a();
            bVar3.onStateChange(bVar3.getState());
        }
    }

    public void m0(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            J();
        }
    }

    public void n0(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            invalidateSelf();
            J();
        }
    }

    public void o0(boolean z) {
        if (this.B0 != z) {
            this.B0 = z;
            this.C0 = z ? b.b.a.a.u.a.a(this.F) : null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (q0()) {
            onLayoutDirectionChanged |= this.I.setLayoutDirection(i);
        }
        if (p0()) {
            onLayoutDirectionChanged |= this.U.setLayoutDirection(i);
        }
        if (r0()) {
            onLayoutDirectionChanged |= this.N.setLayoutDirection(i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (q0()) {
            onLevelChange |= this.I.setLevel(i);
        }
        if (p0()) {
            onLevelChange |= this.U.setLevel(i);
        }
        if (r0()) {
            onLevelChange |= this.N.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // b.b.a.a.w.g, android.graphics.drawable.Drawable, b.b.a.a.r.l.b
    public boolean onStateChange(int[] iArr) {
        if (this.H0) {
            super.onStateChange(iArr);
        }
        return K(iArr, this.A0);
    }

    public final boolean p0() {
        return this.T && this.U != null && this.t0;
    }

    public final boolean q0() {
        return this.H && this.I != null;
    }

    public final boolean r0() {
        return this.M && this.N != null;
    }

    public final void s0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // b.b.a.a.w.g, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.v0 != i) {
            this.v0 = i;
            invalidateSelf();
        }
    }

    @Override // b.b.a.a.w.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.w0 != colorFilter) {
            this.w0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // b.b.a.a.w.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // b.b.a.a.w.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.z0 != mode) {
            this.z0 = mode;
            this.x0 = b.b.a.a.a.C(this, this.y0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (q0()) {
            visible |= this.I.setVisible(z, z2);
        }
        if (p0()) {
            visible |= this.U.setVisible(z, z2);
        }
        if (r0()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void y(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.N) {
            if (drawable.isStateful()) {
                drawable.setState(this.A0);
            }
            drawable.setTintList(this.P);
            return;
        }
        Drawable drawable2 = this.I;
        if (drawable == drawable2 && this.L) {
            drawable2.setTintList(this.J);
        }
        if (!drawable.isStateful()) {
            return;
        }
        drawable.setState(getState());
    }

    public final void z(Rect rect, RectF rectF) {
        float f;
        rectF.setEmpty();
        if (q0() || p0()) {
            float f2 = this.Y + this.Z;
            float G = G();
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + G;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - G;
            }
            Drawable drawable = this.t0 ? this.U : this.I;
            float f5 = this.K;
            if (f5 <= 0.0f && drawable != null) {
                f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.g0.getResources().getDisplayMetrics()));
                if (drawable.getIntrinsicHeight() <= f5) {
                    f = drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f;
                }
            }
            f = f5;
            float exactCenterY2 = rect.exactCenterY() - (f / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f;
        }
    }
}
