package a.p.b;

import a.p.b.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f1028a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1029b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1030c;
    public final /* synthetic */ k d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kVar;
        this.f1028a = aVar;
        this.f1029b = viewPropertyAnimator;
        this.f1030c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1029b.setListener(null);
        this.f1030c.setAlpha(1.0f);
        this.f1030c.setTranslationX(0.0f);
        this.f1030c.setTranslationY(0.0f);
        this.d.c(this.f1028a.f1032b);
        this.d.r.remove(this.f1028a.f1032b);
        this.d.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        k kVar = this.d;
        RecyclerView.z zVar = this.f1028a.f1032b;
        Objects.requireNonNull(kVar);
    }
}
