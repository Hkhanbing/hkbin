package b.b.a.a.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f1639a;

    public j(h hVar) {
        this.f1639a = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        h hVar = this.f1639a;
        hVar.f1645c.setChecked(hVar.m);
        this.f1639a.s.start();
    }
}
