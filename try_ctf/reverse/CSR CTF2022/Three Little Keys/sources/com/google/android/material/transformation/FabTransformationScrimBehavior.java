package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.c.h;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final h f1772c;
    public final h d;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f1773a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1774b;

        public a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f1773a = z;
            this.f1774b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f1773a) {
                this.f1774b.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f1773a) {
                this.f1774b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f1772c = new h(75L, 150L);
        this.d = new h(0L, 150L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1772c = new h(75L, 150L);
        this.d = new h(0L, 150L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet D(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        E(view2, z, z2, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        b.b.a.a.a.u(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z, view2));
        return animatorSet;
    }

    public final void E(View view, boolean z, boolean z2, List list) {
        ObjectAnimator ofFloat;
        h hVar = z ? this.f1772c : this.d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        hVar.a(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
