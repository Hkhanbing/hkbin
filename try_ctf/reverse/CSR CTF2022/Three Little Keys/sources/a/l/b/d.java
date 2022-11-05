package a.l.b;

import a.l.b.c;
import a.l.b.x0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f817a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f818b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f819c;
    public final /* synthetic */ x0.d d;
    public final /* synthetic */ c.b e;

    public d(c cVar, ViewGroup viewGroup, View view, boolean z, x0.d dVar, c.b bVar) {
        this.f817a = viewGroup;
        this.f818b = view;
        this.f819c = z;
        this.d = dVar;
        this.e = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f817a.endViewTransition(this.f818b);
        if (this.f819c) {
            this.d.f936a.a(this.f818b);
        }
        this.e.a();
    }
}
