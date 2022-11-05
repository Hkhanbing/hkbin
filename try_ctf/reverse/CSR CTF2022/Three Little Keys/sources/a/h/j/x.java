package a.h.j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f678a;

    /* renamed from: b  reason: collision with root package name */
    public int f679b = -1;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y f680a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f681b;

        public a(x xVar, y yVar, View view) {
            this.f680a = yVar;
            this.f681b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f680a.c(this.f681b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f680a.a(this.f681b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f680a.b(this.f681b);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a0 f682a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f683b;

        public b(x xVar, a0 a0Var, View view) {
            this.f682a = a0Var;
            this.f683b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) a.b.c.s.this.d.getParent()).invalidate();
        }
    }

    public x(View view) {
        this.f678a = new WeakReference<>(view);
    }

    public x a(float f) {
        View view = this.f678a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void b() {
        View view = this.f678a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public x c(long j) {
        View view = this.f678a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public x d(y yVar) {
        View view = this.f678a.get();
        if (view != null) {
            e(view, yVar);
        }
        return this;
    }

    public final void e(View view, y yVar) {
        if (yVar != null) {
            view.animate().setListener(new a(this, yVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public x f(a0 a0Var) {
        View view = this.f678a.get();
        if (view != null) {
            b bVar = null;
            if (a0Var != null) {
                bVar = new b(this, a0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public x g(float f) {
        View view = this.f678a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
