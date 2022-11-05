package a.l.b;

import a.l.b.b0;
import a.l.b.m;
import a.l.b.q0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class s extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f907a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f908b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f909c;
    public final /* synthetic */ q0.a d;
    public final /* synthetic */ a.h.f.a e;

    public s(ViewGroup viewGroup, View view, m mVar, q0.a aVar, a.h.f.a aVar2) {
        this.f907a = viewGroup;
        this.f908b = view;
        this.f909c = mVar;
        this.d = aVar;
        this.e = aVar2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f907a.endViewTransition(this.f908b);
        m mVar = this.f909c;
        m.b bVar = mVar.H;
        Animator animator2 = bVar == null ? null : bVar.f872b;
        mVar.m0(null);
        if (animator2 == null || this.f907a.indexOfChild(this.f908b) >= 0) {
            return;
        }
        ((b0.d) this.d).a(this.f909c, this.e);
    }
}
