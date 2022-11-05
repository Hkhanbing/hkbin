package a.p.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.z f1019a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1020b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1021c;
    public final /* synthetic */ k d;

    public g(k kVar, RecyclerView.z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = kVar;
        this.f1019a = zVar;
        this.f1020b = view;
        this.f1021c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f1020b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1021c.setListener(null);
        this.d.c(this.f1019a);
        this.d.o.remove(this.f1019a);
        this.d.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.d);
    }
}
