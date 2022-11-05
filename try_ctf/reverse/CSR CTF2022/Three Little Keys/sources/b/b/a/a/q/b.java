package b.b.a.a.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b.b.a.a.q.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes.dex */
public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1510a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f1511b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.g f1512c;
    public final /* synthetic */ d d;

    public b(d dVar, boolean z, d.g gVar) {
        this.d = dVar;
        this.f1511b = z;
        this.f1512c = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f1510a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        d dVar = this.d;
        dVar.n = 0;
        dVar.h = null;
        if (!this.f1510a) {
            FloatingActionButton floatingActionButton = dVar.r;
            boolean z = this.f1511b;
            floatingActionButton.b(z ? 8 : 4, z);
            d.g gVar = this.f1512c;
            if (gVar == null) {
                return;
            }
            a aVar = (a) gVar;
            aVar.f1508a.a(aVar.f1509b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.d.r.b(0, this.f1511b);
        d dVar = this.d;
        dVar.n = 1;
        dVar.h = animator;
        this.f1510a = false;
    }
}
