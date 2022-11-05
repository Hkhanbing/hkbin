package b.b.a.a.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b.b.a.a.q.d;

/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f1513a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.g f1514b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f1515c;

    public c(d dVar, boolean z, d.g gVar) {
        this.f1515c = dVar;
        this.f1513a = z;
        this.f1514b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        d dVar = this.f1515c;
        dVar.n = 0;
        dVar.h = null;
        d.g gVar = this.f1514b;
        if (gVar != null) {
            a aVar = (a) gVar;
            aVar.f1508a.b(aVar.f1509b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f1515c.r.b(0, this.f1513a);
        d dVar = this.f1515c;
        dVar.n = 2;
        dVar.h = animator;
    }
}
