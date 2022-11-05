package b.b.a.a.c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b.b.a.a.l.c;
import com.google.android.material.transformation.FabTransformationBehavior;

/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.l.c f1389a;

    public c(FabTransformationBehavior fabTransformationBehavior, b.b.a.a.l.c cVar) {
        this.f1389a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        c.e revealInfo = this.f1389a.getRevealInfo();
        revealInfo.f1444c = Float.MAX_VALUE;
        this.f1389a.setRevealInfo(revealInfo);
    }
}
