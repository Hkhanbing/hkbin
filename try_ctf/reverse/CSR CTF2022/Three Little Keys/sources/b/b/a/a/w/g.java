package b.b.a.a.w;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import b.b.a.a.w.k;
import b.b.a.a.w.m;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class g extends Drawable implements n {
    public static final String x = g.class.getSimpleName();
    public static final Paint y;

    /* renamed from: a  reason: collision with root package name */
    public b f1578a;

    /* renamed from: b  reason: collision with root package name */
    public final m.f[] f1579b;

    /* renamed from: c  reason: collision with root package name */
    public final m.f[] f1580c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public j m;
    public final Paint n;
    public final Paint o;
    public final b.b.a.a.v.a p;
    public final k.b q;
    public final k r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public int u;
    public final RectF v;
    public boolean w;

    /* loaded from: classes.dex */
    public class a implements k.b {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public j f1582a;

        /* renamed from: b  reason: collision with root package name */
        public b.b.a.a.o.a f1583b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f1584c;
        public ColorStateList d;
        public ColorStateList e;
        public ColorStateList f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public b(b bVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f1582a = bVar.f1582a;
            this.f1583b = bVar.f1583b;
            this.l = bVar.l;
            this.f1584c = bVar.f1584c;
            this.d = bVar.d;
            this.e = bVar.e;
            this.h = bVar.h;
            this.g = bVar.g;
            this.m = bVar.m;
            this.j = bVar.j;
            this.s = bVar.s;
            this.q = bVar.q;
            this.u = bVar.u;
            this.k = bVar.k;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.r = bVar.r;
            this.t = bVar.t;
            this.f = bVar.f;
            this.v = bVar.v;
            if (bVar.i != null) {
                this.i = new Rect(bVar.i);
            }
        }

        public b(j jVar, b.b.a.a.o.a aVar) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f1582a = jVar;
            this.f1583b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.e = true;
            return gVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new j());
    }

    public g(b bVar) {
        k kVar;
        this.f1579b = new m.f[4];
        this.f1580c = new m.f[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.o = paint2;
        this.p = new b.b.a.a.v.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            kVar = k.a.f1595a;
        } else {
            kVar = new k();
        }
        this.r = kVar;
        this.v = new RectF();
        this.w = true;
        this.f1578a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        w();
        v(getState());
        this.q = new a();
    }

    public g(j jVar) {
        this(new b(jVar, null));
    }

    public final void b(RectF rectF, Path path) {
        c(rectF, path);
        if (this.f1578a.j != 1.0f) {
            this.f.reset();
            Matrix matrix = this.f;
            float f = this.f1578a.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f);
        }
        path.computeBounds(this.v, true);
    }

    public final void c(RectF rectF, Path path) {
        k kVar = this.r;
        b bVar = this.f1578a;
        kVar.a(bVar.f1582a, bVar.k, rectF, this.q, path);
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = e(colorForState);
            }
            this.u = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z) {
            int color = paint.getColor();
            int e = e(color);
            this.u = e;
            if (e != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(e, PorterDuff.Mode.SRC_IN);
                return porterDuffColorFilter;
            }
        }
        porterDuffColorFilter = null;
        return porterDuffColorFilter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
        if ((!r2.f1582a.d(i()) && !r12.g.isConvex() && android.os.Build.VERSION.SDK_INT < 29) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.w.g.draw(android.graphics.Canvas):void");
    }

    public int e(int i) {
        int i2;
        b bVar = this.f1578a;
        float f = bVar.o + bVar.p + bVar.n;
        b.b.a.a.o.a aVar = bVar.f1583b;
        if (aVar == null || !aVar.f1505a) {
            return i;
        }
        if (!(a.h.d.a.e(i, 255) == aVar.d)) {
            return i;
        }
        float f2 = aVar.e;
        float min = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int p = b.b.a.a.a.p(a.h.d.a.e(i, 255), aVar.f1506b, min);
        if (min > 0.0f && (i2 = aVar.f1507c) != 0) {
            p = a.h.d.a.b(a.h.d.a.e(i2, b.b.a.a.o.a.f), p);
        }
        return a.h.d.a.e(p, alpha);
    }

    public final void f(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w(x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f1578a.s != 0) {
            canvas.drawPath(this.g, this.p.f1572a);
        }
        for (int i = 0; i < 4; i++) {
            m.f fVar = this.f1579b[i];
            b.b.a.a.v.a aVar = this.p;
            int i2 = this.f1578a.r;
            Matrix matrix = m.f.f1609a;
            fVar.a(matrix, aVar, i2, canvas);
            this.f1580c[i].a(matrix, this.p, this.f1578a.r, canvas);
        }
        if (this.w) {
            int j = j();
            int k = k();
            canvas.translate(-j, -k);
            canvas.drawPath(this.g, y);
            canvas.translate(j, k);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (!jVar.d(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float a2 = jVar.f.a(rectF) * this.f1578a.k;
        canvas.drawRoundRect(rectF, a2, a2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1578a.m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f1578a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f1578a;
        if (bVar.q == 2) {
            return;
        }
        if (bVar.f1582a.d(i())) {
            outline.setRoundRect(getBounds(), m() * this.f1578a.k);
            return;
        }
        b(i(), this.g);
        if (!this.g.isConvex() && Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            outline.setConvexPath(this.g);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f1578a.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.k.set(getBounds());
        b(i(), this.g);
        this.l.setPath(this.g, this.k);
        this.k.op(this.l, Region.Op.DIFFERENCE);
        return this.k;
    }

    public void h(Canvas canvas) {
        Paint paint = this.o;
        Path path = this.h;
        j jVar = this.m;
        this.j.set(i());
        float l = l();
        this.j.inset(l, l);
        g(canvas, paint, path, jVar, this.j);
    }

    public RectF i() {
        this.i.set(getBounds());
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f1578a.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f1578a.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f1578a.e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f1578a.d) != null && colorStateList4.isStateful())));
    }

    public int j() {
        b bVar = this.f1578a;
        return (int) (Math.sin(Math.toRadians(bVar.t)) * bVar.s);
    }

    public int k() {
        b bVar = this.f1578a;
        return (int) (Math.cos(Math.toRadians(bVar.t)) * bVar.s);
    }

    public final float l() {
        if (n()) {
            return this.o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float m() {
        return this.f1578a.f1582a.e.a(i());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1578a = new b(this.f1578a);
        return this;
    }

    public final boolean n() {
        Paint.Style style = this.f1578a.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    public void o(Context context) {
        this.f1578a.f1583b = new b.b.a.a.o.a(context);
        x();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, b.b.a.a.r.l.b
    public boolean onStateChange(int[] iArr) {
        boolean z = v(iArr) || w();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p(float f) {
        b bVar = this.f1578a;
        if (bVar.o != f) {
            bVar.o = f;
            x();
        }
    }

    public void q(ColorStateList colorStateList) {
        b bVar = this.f1578a;
        if (bVar.d != colorStateList) {
            bVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void r(float f) {
        b bVar = this.f1578a;
        if (bVar.k != f) {
            bVar.k = f;
            this.e = true;
            invalidateSelf();
        }
    }

    public void s(float f, int i) {
        this.f1578a.l = f;
        invalidateSelf();
        u(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        b bVar = this.f1578a;
        if (bVar.m != i) {
            bVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1578a.f1584c = colorFilter;
        super.invalidateSelf();
    }

    @Override // b.b.a.a.w.n
    public void setShapeAppearanceModel(j jVar) {
        this.f1578a.f1582a = jVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1578a.g = colorStateList;
        w();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f1578a;
        if (bVar.h != mode) {
            bVar.h = mode;
            w();
            super.invalidateSelf();
        }
    }

    public void t(float f, ColorStateList colorStateList) {
        this.f1578a.l = f;
        invalidateSelf();
        u(colorStateList);
    }

    public void u(ColorStateList colorStateList) {
        b bVar = this.f1578a;
        if (bVar.e != colorStateList) {
            bVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean v(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f1578a.d == null || color2 == (colorForState2 = this.f1578a.d.getColorForState(iArr, (color2 = this.n.getColor())))) {
            z = false;
        } else {
            this.n.setColor(colorForState2);
            z = true;
        }
        if (this.f1578a.e == null || color == (colorForState = this.f1578a.e.getColorForState(iArr, (color = this.o.getColor())))) {
            return z;
        }
        this.o.setColor(colorForState);
        return true;
    }

    public final boolean w() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        b bVar = this.f1578a;
        this.s = d(bVar.g, bVar.h, this.n, true);
        b bVar2 = this.f1578a;
        this.t = d(bVar2.f, bVar2.h, this.o, false);
        b bVar3 = this.f1578a;
        if (bVar3.u) {
            this.p.a(bVar3.g.getColorForState(getState(), 0));
        }
        return !Objects.equals(porterDuffColorFilter, this.s) || !Objects.equals(porterDuffColorFilter2, this.t);
    }

    public final void x() {
        b bVar = this.f1578a;
        float f = bVar.o + bVar.p;
        bVar.r = (int) Math.ceil(0.75f * f);
        this.f1578a.s = (int) Math.ceil(f * 0.25f);
        w();
        super.invalidateSelf();
    }
}
