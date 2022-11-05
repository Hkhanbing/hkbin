package a.s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a.e.a f1100a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f1101b;

    public i(h hVar, a.e.a aVar) {
        this.f1101b = hVar;
        this.f1100a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1100a.remove(animator);
        this.f1101b.m.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f1101b.m.add(animator);
    }
}
