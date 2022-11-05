package b.b.a.a.c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.transformation.FabTransformationBehavior;

/* loaded from: classes.dex */
public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.l.c f1387a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f1388b;

    public b(FabTransformationBehavior fabTransformationBehavior, b.b.a.a.l.c cVar, Drawable drawable) {
        this.f1387a = cVar;
        this.f1388b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1387a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f1387a.setCircularRevealOverlayDrawable(this.f1388b);
    }
}
