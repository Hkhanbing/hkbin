package com.google.android.material.timepicker;

import a.h.j.w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ClockHandView extends View {
    public static final /* synthetic */ int p = 0;

    /* renamed from: a  reason: collision with root package name */
    public ValueAnimator f1755a;

    /* renamed from: b  reason: collision with root package name */
    public float f1756b;

    /* renamed from: c  reason: collision with root package name */
    public float f1757c;
    public boolean d;
    public int e;
    public final List<c> f;
    public final int g;
    public final float h;
    public final Paint i;
    public final RectF j;
    public final int k;
    public float l;
    public boolean m;
    public double n;
    public int o;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClockHandView clockHandView = ClockHandView.this;
            int i = ClockHandView.p;
            clockHandView.c(floatValue, true);
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public b(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f = new ArrayList();
        Paint paint = new Paint();
        this.i = paint;
        this.j = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.a.a.b.f, R.attr.materialClockStyle, 2131821587);
        this.o = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.k = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.h = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f, false);
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
        AtomicInteger atomicInteger = w.f667a;
        w.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public void b(float f, boolean z) {
        ValueAnimator valueAnimator = this.f1755a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            c(f, false);
            return;
        }
        float f2 = this.l;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.f1755a = ofFloat;
        ofFloat.setDuration(200L);
        this.f1755a.addUpdateListener(new a());
        this.f1755a.addListener(new b(this));
        this.f1755a.start();
    }

    public final void c(float f, boolean z) {
        float f2 = f % 360.0f;
        this.l = f2;
        this.n = Math.toRadians(f2 - 90.0f);
        float cos = (this.o * ((float) Math.cos(this.n))) + (getWidth() / 2);
        float sin = (this.o * ((float) Math.sin(this.n))) + (getHeight() / 2);
        RectF rectF = this.j;
        int i = this.g;
        rectF.set(cos - i, sin - i, cos + i, sin + i);
        for (c cVar : this.f) {
            cVar.a(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.i.setStrokeWidth(0.0f);
        canvas.drawCircle((this.o * ((float) Math.cos(this.n))) + width2, (this.o * ((float) Math.sin(this.n))) + f, this.g, this.i);
        double sin = Math.sin(this.n);
        double cos = Math.cos(this.n);
        this.i.setStrokeWidth(this.k);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.i);
        canvas.drawCircle(width2, f, this.h, this.i);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b(this.l, false);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f1756b = x;
            this.f1757c = y;
            this.d = true;
            this.m = false;
            z = false;
            z2 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.f1756b);
            int i2 = (int) (y - this.f1757c);
            this.d = (i2 * i2) + (i * i) > this.e;
            z = this.m;
            if (actionMasked == 1) {
            }
            z2 = false;
        } else {
            z = false;
            z2 = false;
        }
        boolean z4 = this.m;
        float a2 = a(x, y);
        boolean z5 = this.l != a2;
        if (!z2 || !z5) {
            if (z5 || z) {
                b(a2, false);
            }
            this.m = z4 | z3;
            return true;
        }
        z3 = true;
        this.m = z4 | z3;
        return true;
    }
}
