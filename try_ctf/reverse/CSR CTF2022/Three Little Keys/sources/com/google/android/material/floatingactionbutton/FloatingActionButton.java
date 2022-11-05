package com.google.android.material.floatingactionbutton;

import a.b.f.l;
import a.h.j.w;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.c.g;
import b.b.a.a.c.j;
import b.b.a.a.q.d;
import b.b.a.a.q.e;
import b.b.a.a.r.f;
import b.b.a.a.r.u;
import b.b.a.a.w.n;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class FloatingActionButton extends u implements b.b.a.a.p.a, n, CoordinatorLayout.b {

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1727b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1728c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public ColorStateList f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public d l;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f1729a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1730b;

        public BaseBehavior() {
            this.f1730b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.a.a.b.h);
            this.f1730b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public boolean B(FloatingActionButton floatingActionButton, Rect rect) {
            Objects.requireNonNull(floatingActionButton);
            floatingActionButton.getLeft();
            throw null;
        }

        public final boolean C(View view, FloatingActionButton floatingActionButton) {
            return this.f1730b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!C(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f1729a == null) {
                this.f1729a = new Rect();
            }
            Rect rect = this.f1729a;
            f.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        public final boolean E(View view, FloatingActionButton floatingActionButton) {
            if (!C(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return B((FloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void f(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1241a instanceof BottomSheetBehavior : false) {
                    E(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> d = coordinatorLayout.d(floatingActionButton);
            int size = d.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = d.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1241a instanceof BottomSheetBehavior : false) && E(view2, floatingActionButton)) {
                        break;
                    }
                } else if (D(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(floatingActionButton, i);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.b.a.a.v.b {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c<T extends FloatingActionButton> implements d.f {

        /* renamed from: a  reason: collision with root package name */
        public final j<T> f1732a;

        public c(j<T> jVar) {
            this.f1732a = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.b.a.a.q.d.f
        public void a() {
            this.f1732a.a(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.b.a.a.q.d.f
        public void b() {
            this.f1732a.b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).f1732a.equals(this.f1732a);
        }

        public int hashCode() {
            return this.f1732a.hashCode();
        }
    }

    private d getImpl() {
        if (this.l == null) {
            this.l = new b.b.a.a.q.f(this, new b());
        }
        return this.l;
    }

    @Override // b.b.a.a.p.a
    public boolean a() {
        throw null;
    }

    public void d(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.p == null) {
            impl.p = new ArrayList<>();
        }
        impl.p.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().k(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.o == null) {
            impl.o = new ArrayList<>();
        }
        impl.o.add(animatorListener);
    }

    public void f(j<? extends FloatingActionButton> jVar) {
        d impl = getImpl();
        c cVar = new c(null);
        if (impl.q == null) {
            impl.q = new ArrayList<>();
        }
        impl.q.add(cVar);
    }

    @Deprecated
    public boolean g(Rect rect) {
        AtomicInteger atomicInteger = w.f667a;
        if (!w.g.c(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        throw null;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f1727b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f1728c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* renamed from: getBehavior */
    public CoordinatorLayout.c<FloatingActionButton> mo19getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f;
    }

    public Drawable getContentBackground() {
        Objects.requireNonNull(getImpl());
        return null;
    }

    public int getCustomSize() {
        return this.h;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public g getHideMotionSpec() {
        return getImpl().j;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f;
    }

    public b.b.a.a.w.j getShapeAppearanceModel() {
        b.b.a.a.w.j jVar = getImpl().f1516a;
        Objects.requireNonNull(jVar);
        return jVar;
    }

    public g getShowMotionSpec() {
        return getImpl().i;
    }

    public int getSize() {
        return this.g;
    }

    public int getSizeDimension() {
        return h(this.g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.k;
    }

    public final int h(int i) {
        int i2 = this.h;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return resources.getDimensionPixelSize(i != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
    }

    public void i(a aVar, boolean z) {
        d impl = getImpl();
        b.b.a.a.q.a aVar2 = aVar == null ? null : new b.b.a.a.q.a(this, aVar);
        if (impl.g()) {
            return;
        }
        Animator animator = impl.h;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.s()) {
            impl.r.b(z ? 8 : 4, z);
            if (aVar2 == null) {
                return;
            }
            aVar2.f1508a.a(aVar2.f1509b);
            return;
        }
        g gVar = impl.j;
        AnimatorSet b2 = gVar != null ? impl.b(gVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f);
        b2.addListener(new b.b.a.a.q.b(impl, z, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.p;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b2.addListener(it.next());
            }
        }
        b2.start();
    }

    public boolean j() {
        return getImpl().g();
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().i();
    }

    public boolean k() {
        return getImpl().h();
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(l.c(colorForState, mode));
    }

    public void m(a aVar, boolean z) {
        d impl = getImpl();
        b.b.a.a.q.a aVar2 = aVar == null ? null : new b.b.a.a.q.a(this, aVar);
        if (impl.h()) {
            return;
        }
        Animator animator = impl.h;
        if (animator != null) {
            animator.cancel();
        }
        boolean z2 = impl.i == null;
        if (!impl.s()) {
            impl.r.b(0, z);
            impl.r.setAlpha(1.0f);
            impl.r.setScaleY(1.0f);
            impl.r.setScaleX(1.0f);
            impl.p(1.0f);
            if (aVar2 == null) {
                return;
            }
            aVar2.f1508a.b(aVar2.f1509b);
            return;
        }
        if (impl.r.getVisibility() != 0) {
            float f = 0.0f;
            impl.r.setAlpha(0.0f);
            impl.r.setScaleY(z2 ? 0.4f : 0.0f);
            impl.r.setScaleX(z2 ? 0.4f : 0.0f);
            if (z2) {
                f = 0.4f;
            }
            impl.p(f);
        }
        g gVar = impl.i;
        AnimatorSet b2 = gVar != null ? impl.b(gVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f);
        b2.addListener(new b.b.a.a.q.c(impl, z, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.o;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b2.addListener(it.next());
            }
        }
        b2.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        if (impl.o()) {
            ViewTreeObserver viewTreeObserver = impl.r.getViewTreeObserver();
            if (impl.x == null) {
                impl.x = new e(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.x);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.r.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.x;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.x = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        this.i = (getSizeDimension() - this.j) / 2;
        getImpl().v();
        throw null;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b.b.a.a.y.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b.b.a.a.y.a aVar = (b.b.a.a.y.a) parcelable;
        super.onRestoreInstanceState(aVar.f701a);
        Objects.requireNonNull(aVar.f1615c.getOrDefault("expandableWidgetHelper", null));
        throw null;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        a.j.a.a aVar = a.j.a.a.f700b;
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g(null);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1727b != colorStateList) {
            this.f1727b = colorStateList;
            Objects.requireNonNull(getImpl());
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1728c != mode) {
            this.f1728c = mode;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setCompatElevation(float f) {
        d impl = getImpl();
        if (impl.d != f) {
            impl.d = f;
            impl.l(f, impl.e, impl.f);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.e != f) {
            impl.e = f;
            impl.l(impl.d, f, impl.f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.f != f) {
            impl.f = f;
            impl.l(impl.d, impl.e, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            if (i == this.h) {
                return;
            }
            this.h = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Objects.requireNonNull(getImpl());
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f1517b) {
            getImpl().f1517b = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().j = gVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(g.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            impl.p(impl.l);
            if (this.d == null) {
                return;
            }
            l();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        throw null;
    }

    public void setMaxImageSize(int i) {
        this.j = i;
        d impl = getImpl();
        if (impl.m != i) {
            impl.m = i;
            impl.p(impl.l);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f != colorStateList) {
            this.f = colorStateList;
            getImpl().q(this.f);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m();
    }

    public void setShadowPaddingEnabled(boolean z) {
        d impl = getImpl();
        impl.f1518c = z;
        impl.v();
        throw null;
    }

    @Override // b.b.a.a.w.n
    public void setShapeAppearanceModel(b.b.a.a.w.j jVar) {
        getImpl().f1516a = jVar;
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().i = gVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(g.b(getContext(), i));
    }

    public void setSize(int i) {
        this.h = 0;
        if (i != this.g) {
            this.g = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().n();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().n();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().n();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.k != z) {
            this.k = z;
            getImpl().j();
        }
    }

    @Override // b.b.a.a.r.u, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
