package com.google.android.material.snackbar;

import a.h.j.w;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f1736a = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        public final b i = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean B(View view) {
            Objects.requireNonNull(this.i);
            return view instanceof c;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            Objects.requireNonNull(this.i);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    b.b.a.a.x.b a2 = b.b.a.a.x.b.a();
                    synchronized (a2.f1611a) {
                        a2.b(null);
                    }
                }
            } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                b.b.a.a.x.b a3 = b.b.a.a.x.b.a();
                synchronized (a3.f1611a) {
                    a3.b(null);
                }
            }
            return super.j(coordinatorLayout, view, motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                Objects.requireNonNull((BaseTransientBottomBar) message.obj);
                throw null;
            } else if (i != 1) {
                return false;
            } else {
                Objects.requireNonNull((BaseTransientBottomBar) message.obj);
                throw null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.f = SwipeDismissBehavior.C(0.0f, 0.1f, 1.0f);
            swipeDismissBehavior.g = SwipeDismissBehavior.C(0.0f, 0.6f, 1.0f);
            swipeDismissBehavior.d = 0;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends FrameLayout {
        public static final View.OnTouchListener k = new a();

        /* renamed from: a  reason: collision with root package name */
        public BaseTransientBottomBar<?> f1737a;

        /* renamed from: b  reason: collision with root package name */
        public int f1738b;

        /* renamed from: c  reason: collision with root package name */
        public final float f1739c;
        public final float d;
        public final int e;
        public final int f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public boolean j;

        /* loaded from: classes.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(b.b.a.a.a0.a.a.a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, b.b.a.a.b.y);
            if (obtainStyledAttributes.hasValue(6)) {
                AtomicInteger atomicInteger = w.f667a;
                w.i.s(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f1738b = obtainStyledAttributes.getInt(2, 0);
            this.f1739c = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(b.b.a.a.a.g(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(b.b.a.a.a.t(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.d = obtainStyledAttributes.getFloat(1, 1.0f);
            this.e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(k);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(b.b.a.a.a.p(b.b.a.a.a.f(this, R.attr.colorSurface), b.b.a.a.a.f(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
                ColorStateList colorStateList = this.g;
                if (colorStateList != null) {
                    gradientDrawable.setTintList(colorStateList);
                }
                AtomicInteger atomicInteger2 = w.f667a;
                w.d.q(this, gradientDrawable);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f1737a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.d;
        }

        public int getAnimationMode() {
            return this.f1738b;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f1739c;
        }

        public int getMaxInlineActionWidth() {
            return this.f;
        }

        public int getMaxWidth() {
            return this.e;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f1737a;
            if (baseTransientBottomBar != null) {
                Objects.requireNonNull(baseTransientBottomBar);
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
            }
            AtomicInteger atomicInteger = w.f667a;
            w.h.c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f1737a;
            if (baseTransientBottomBar != null) {
                Objects.requireNonNull(baseTransientBottomBar);
                b.b.a.a.x.b a2 = b.b.a.a.x.b.a();
                synchronized (a2.f1611a) {
                    a2.b(null);
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f1737a;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.e;
                if (measuredWidth <= i3) {
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        public void setAnimationMode(int i) {
            this.f1738b = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.g != null) {
                drawable = drawable.mutate();
                drawable.setTintList(this.g);
                drawable.setTintMode(this.h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.g = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintList(colorStateList);
                mutate.setTintMode(this.h);
                if (mutate == getBackground()) {
                    return;
                }
                super.setBackgroundDrawable(mutate);
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.h = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                mutate.setTintMode(mode);
                if (mutate == getBackground()) {
                    return;
                }
                super.setBackgroundDrawable(mutate);
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.j || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f1737a;
            if (baseTransientBottomBar == null) {
                return;
            }
            Handler handler = BaseTransientBottomBar.f1736a;
            Objects.requireNonNull(baseTransientBottomBar);
            throw null;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : k);
            super.setOnClickListener(onClickListener);
        }
    }
}
