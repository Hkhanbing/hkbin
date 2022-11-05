package b.b.a.a.q;

import a.h.j.w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import b.b.a.a.w.j;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public j f1516a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1517b;
    public float d;
    public float e;
    public float f;
    public final b.b.a.a.r.j g;
    public Animator h;
    public b.b.a.a.c.g i;
    public b.b.a.a.c.g j;
    public float k;
    public int m;
    public ArrayList<Animator.AnimatorListener> o;
    public ArrayList<Animator.AnimatorListener> p;
    public ArrayList<f> q;
    public final FloatingActionButton r;
    public final b.b.a.a.v.b s;
    public ViewTreeObserver.OnPreDrawListener x;
    public static final TimeInterpolator y = b.b.a.a.c.a.f1372c;
    public static final int[] z = {16842919, 16842910};
    public static final int[] A = {16843623, 16842908, 16842910};
    public static final int[] B = {16842908, 16842910};
    public static final int[] C = {16843623, 16842910};
    public static final int[] D = {16842910};
    public static final int[] E = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public boolean f1518c = true;
    public float l = 1.0f;
    public int n = 0;
    public final Rect t = new Rect();
    public final RectF u = new RectF();
    public final RectF v = new RectF();
    public final Matrix w = new Matrix();

    /* loaded from: classes.dex */
    public class a extends b.b.a.a.c.f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            d.this.l = f;
            matrix.getValues(this.f1378a);
            matrix2.getValues(this.f1379b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f1379b;
                float f2 = fArr[i];
                float[] fArr2 = this.f1378a;
                fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
            }
            this.f1380c.setValues(this.f1379b);
            return this.f1380c;
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f1519a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f1520b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f1521c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ float g;
        public final /* synthetic */ Matrix h;

        public b(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f1519a = f;
            this.f1520b = f2;
            this.f1521c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            this.g = f7;
            this.h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.r.setAlpha(b.b.a.a.c.a.b(this.f1519a, this.f1520b, 0.0f, 0.2f, floatValue));
            d.this.r.setScaleX(b.b.a.a.c.a.a(this.f1521c, this.d, floatValue));
            d.this.r.setScaleY(b.b.a.a.c.a.a(this.e, this.d, floatValue));
            d.this.l = b.b.a.a.c.a.a(this.f, this.g, floatValue);
            d.this.a(b.b.a.a.c.a.a(this.f, this.g, floatValue), this.h);
            d.this.r.setImageMatrix(this.h);
        }
    }

    /* loaded from: classes.dex */
    public class c extends i {
        public c(d dVar) {
            super(null);
        }

        @Override // b.b.a.a.q.d.i
        public float a() {
            return 0.0f;
        }
    }

    /* renamed from: b.b.a.a.q.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0039d extends i {
        public C0039d() {
            super(null);
        }

        @Override // b.b.a.a.q.d.i
        public float a() {
            d dVar = d.this;
            return dVar.d + dVar.e;
        }
    }

    /* loaded from: classes.dex */
    public class e extends i {
        public e() {
            super(null);
        }

        @Override // b.b.a.a.q.d.i
        public float a() {
            d dVar = d.this;
            return dVar.d + dVar.f;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h extends i {
        public h() {
            super(null);
        }

        @Override // b.b.a.a.q.d.i
        public float a() {
            return d.this.d;
        }
    }

    /* loaded from: classes.dex */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1522a;

        /* renamed from: b  reason: collision with root package name */
        public float f1523b;

        public i(b.b.a.a.q.b bVar) {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Objects.requireNonNull(d.this);
            this.f1522a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f1522a) {
                Objects.requireNonNull(d.this);
                this.f1523b = a();
                this.f1522a = true;
            }
            d dVar = d.this;
            valueAnimator.getAnimatedFraction();
            Objects.requireNonNull(dVar);
        }
    }

    public d(FloatingActionButton floatingActionButton, b.b.a.a.v.b bVar) {
        this.r = floatingActionButton;
        this.s = bVar;
        b.b.a.a.r.j jVar = new b.b.a.a.r.j();
        this.g = jVar;
        jVar.a(z, d(new e()));
        jVar.a(A, d(new C0039d()));
        jVar.a(B, d(new C0039d()));
        jVar.a(C, d(new C0039d()));
        jVar.a(D, d(new h()));
        jVar.a(E, d(new c(this)));
        this.k = floatingActionButton.getRotation();
    }

    public final void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.r.getDrawable();
        if (drawable == null || this.m == 0) {
            return;
        }
        RectF rectF = this.u;
        RectF rectF2 = this.v;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i2 = this.m;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.m;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    public final AnimatorSet b(b.b.a.a.c.g gVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.r, View.ALPHA, f2);
        gVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.r, View.SCALE_X, f3);
        gVar.d("scale").a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.r, View.SCALE_Y, f3);
        gVar.d("scale").a(ofFloat3);
        arrayList.add(ofFloat3);
        a(f4, this.w);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.r, new b.b.a.a.c.e(), new a(), new Matrix(this.w));
        gVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        b.b.a.a.a.u(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f2, float f3, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this.r.getAlpha(), f2, this.r.getScaleX(), f3, this.r.getScaleY(), this.l, f4, new Matrix(this.w)));
        arrayList.add(ofFloat);
        b.b.a.a.a.u(animatorSet, arrayList);
        Context context = this.r.getContext();
        int integer = this.r.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1);
        TypedValue w = b.b.a.a.a.w(context, R.attr.motionDurationLong1);
        if (w != null && w.type == 16) {
            integer = w.data;
        }
        animatorSet.setDuration(integer);
        Context context2 = this.r.getContext();
        TimeInterpolator timeInterpolator = b.b.a.a.c.a.f1371b;
        TypedValue typedValue = new TypedValue();
        if (context2.getTheme().resolveAttribute(R.attr.motionEasingStandard, typedValue, true)) {
            if (typedValue.type != 3) {
                throw new IllegalArgumentException("Motion easing theme attribute must be a string");
            }
            String valueOf = String.valueOf(typedValue.string);
            if (b.b.a.a.a.l(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    timeInterpolator = new PathInterpolator(b.b.a.a.a.i(split, 0), b.b.a.a.a.i(split, 1), b.b.a.a.a.i(split, 2), b.b.a.a.a.i(split, 3));
                } else {
                    StringBuilder f5 = b.a.a.a.a.f("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                    f5.append(split.length);
                    throw new IllegalArgumentException(f5.toString());
                }
            } else if (b.b.a.a.a.l(valueOf, "path")) {
                timeInterpolator = new PathInterpolator(a.h.b.b.t(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException(b.a.a.a.a.d("Invalid motion easing type: ", valueOf));
            }
        }
        animatorSet.setInterpolator(timeInterpolator);
        return animatorSet;
    }

    public final ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(y);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int i2 = 0;
        if (this.f1517b) {
            i2 = (0 - this.r.getSizeDimension()) / 2;
        }
        float e2 = this.f1518c ? e() + this.f : 0.0f;
        int max = Math.max(i2, (int) Math.ceil(e2));
        int max2 = Math.max(i2, (int) Math.ceil(e2 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public boolean g() {
        return this.r.getVisibility() == 0 ? this.n == 1 : this.n != 2;
    }

    public boolean h() {
        return this.r.getVisibility() != 0 ? this.n == 2 : this.n != 1;
    }

    public void i() {
        throw null;
    }

    public void j() {
        throw null;
    }

    public void k(int[] iArr) {
        throw null;
    }

    public void l(float f2, float f3, float f4) {
        throw null;
    }

    public void m() {
        ArrayList<f> arrayList = this.q;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void n() {
        ArrayList<f> arrayList = this.q;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public boolean o() {
        throw null;
    }

    public final void p(float f2) {
        this.l = f2;
        Matrix matrix = this.w;
        a(f2, matrix);
        this.r.setImageMatrix(matrix);
    }

    public void q(ColorStateList colorStateList) {
        throw null;
    }

    public boolean r() {
        throw null;
    }

    public final boolean s() {
        FloatingActionButton floatingActionButton = this.r;
        AtomicInteger atomicInteger = w.f667a;
        return w.g.c(floatingActionButton) && !this.r.isInEditMode();
    }

    public final boolean t() {
        return !this.f1517b || this.r.getSizeDimension() >= 0;
    }

    public void u() {
        throw null;
    }

    public final void v() {
        Rect rect = this.t;
        f(rect);
        a.h.b.b.g(null, "Didn't initialize content background");
        if (r()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.s;
            Objects.requireNonNull(bVar);
            super/*android.widget.ImageButton*/.setBackgroundDrawable(insetDrawable);
        } else {
            Objects.requireNonNull((FloatingActionButton.b) this.s);
        }
        b.b.a.a.v.b bVar2 = this.s;
        int i2 = rect.left;
        Objects.requireNonNull(FloatingActionButton.this);
        throw null;
    }
}
