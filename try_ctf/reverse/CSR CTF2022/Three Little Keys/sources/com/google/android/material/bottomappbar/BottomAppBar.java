package com.google.android.material.bottomappbar;

import a.h.j.w;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.f.b;
import b.b.a.a.f.c;
import b.b.a.a.f.d;
import b.b.a.a.f.f;
import b.b.a.a.f.g;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import de.cybersecurityrumble.threelittlekeys.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int c0 = 0;
    public Integer P;
    public Animator Q;
    public Animator R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public int W;
    public boolean a0;
    public Behavior b0;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect e;
        public WeakReference<BottomAppBar> f;
        public int g;
        public final View.OnLayoutChangeListener h;

        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (Behavior.this.f.get() != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Behavior.this.e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.h = new a();
            this.e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = new a();
            this.e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.c0;
            View A = bottomAppBar.A();
            if (A != null) {
                AtomicInteger atomicInteger = w.f667a;
                if (!w.g.c(A)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) A.getLayoutParams();
                    fVar.d = 49;
                    this.g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                    if (A instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) A;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.h);
                        floatingActionButton.d(null);
                        floatingActionButton.e(new f(bottomAppBar));
                        floatingActionButton.f(null);
                    }
                    bottomAppBar.E();
                    throw null;
                }
            }
            coordinatorLayout.r(bottomAppBar, i);
            this.f1680a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i == 2) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends a.j.a.a {
        public static final Parcelable.Creator<a> CREATOR = new C0047a();

        /* renamed from: c  reason: collision with root package name */
        public int f1694c;
        public boolean d;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0047a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new a[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1694c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f701a, i);
            parcel.writeInt(this.f1694c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return C(this.S);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f1425c;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private g getTopEdgeTreatment() {
        throw null;
    }

    public static void x(BottomAppBar bottomAppBar) {
        bottomAppBar.V--;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View A() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.e(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.A():android.view.View");
    }

    public int B(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean o = b.b.a.a.a.o(this);
        int measuredWidth = o ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f16a & 8388615) == 8388611) {
                measuredWidth = o ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((o ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }

    public final float C(int i) {
        boolean o = b.b.a.a.a.o(this);
        int i2 = 1;
        if (i == 1) {
            int measuredWidth = (getMeasuredWidth() / 2) + 0;
            if (o) {
                i2 = -1;
            }
            return measuredWidth * i2;
        }
        return 0.0f;
    }

    public final boolean D() {
        FloatingActionButton z = z();
        return z != null && z.k();
    }

    public final void E() {
        getTopEdgeTreatment().d = getFabTranslationX();
        A();
        if (this.a0) {
            D();
        }
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* renamed from: getBehavior  reason: collision with other method in class */
    public Behavior mo19getBehavior() {
        if (this.b0 == null) {
            this.b0 = new Behavior();
        }
        return this.b0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f1425c;
    }

    public int getFabAlignmentMode() {
        return this.S;
    }

    public int getFabAnimationMode() {
        return this.T;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f1424b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f1423a;
    }

    public boolean getHideOnScroll() {
        return this.U;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int B;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            Animator animator = this.R;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.Q;
            if (animator2 != null) {
                animator2.cancel();
            }
            E();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.R != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!D()) {
            B = B(actionMenuView, 0, false);
        } else {
            B = B(actionMenuView, this.S, this.a0);
        }
        actionMenuView.setTranslationX(B);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f701a);
        this.S = aVar.f1694c;
        this.a0 = aVar.d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f1694c = this.S;
        aVar.d = this.a0;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            g topEdgeTreatment = getTopEdgeTreatment();
            Objects.requireNonNull(topEdgeTreatment);
            if (f >= 0.0f) {
                topEdgeTreatment.f1425c = f;
                throw null;
            }
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        throw null;
    }

    public void setFabAlignmentMode(int i) {
        int i2;
        this.W = 0;
        boolean z = this.a0;
        AtomicInteger atomicInteger = w.f667a;
        if (!w.g.c(this)) {
            int i3 = this.W;
            if (i3 != 0) {
                this.W = 0;
                getMenu().clear();
                n(i3);
            }
        } else {
            Animator animator = this.R;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!D()) {
                z = false;
                i2 = 0;
            } else {
                i2 = i;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - B(actionMenuView, i2, z)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.addListener(new d(this, actionMenuView, i2, z));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.R = animatorSet2;
            animatorSet2.addListener(new c(this));
            this.R.start();
        }
        if (this.S != i && w.g.c(this)) {
            Animator animator2 = this.Q;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.T == 1) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(z(), "translationX", C(i));
                ofFloat3.setDuration(300L);
                arrayList2.add(ofFloat3);
            } else {
                y(i);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.Q = animatorSet3;
            animatorSet3.addListener(new b.b.a.a.f.a(this));
            this.Q.start();
        }
        this.S = i;
    }

    public void setFabAnimationMode(int i) {
        this.T = i;
    }

    public void setFabCornerSize(float f) {
        if (f == getTopEdgeTreatment().e) {
            return;
        }
        getTopEdgeTreatment().e = f;
        throw null;
    }

    public void setFabCradleMargin(float f) {
        if (f == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f1424b = f;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f1423a = f;
        throw null;
    }

    public void setHideOnScroll(boolean z) {
        this.U = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.P != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.P.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.P = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void y(int i) {
        FloatingActionButton z = z();
        if (z == null || z.j()) {
            return;
        }
        this.V++;
        z.i(new b(this, i), true);
    }

    public final FloatingActionButton z() {
        View A = A();
        if (A instanceof FloatingActionButton) {
            return (FloatingActionButton) A;
        }
        return null;
    }
}
