package a.p.b;

import a.p.b.k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f1025a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1026b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1027c;
    public final /* synthetic */ k d;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = kVar;
        this.f1025a = aVar;
        this.f1026b = viewPropertyAnimator;
        this.f1027c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1026b.setListener(null);
        this.f1027c.setAlpha(1.0f);
        this.f1027c.setTranslationX(0.0f);
        this.f1027c.setTranslationY(0.0f);
        this.d.c(this.f1025a.f1031a);
        this.d.r.remove(this.f1025a.f1031a);
        this.d.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        k kVar = this.d;
        RecyclerView.z zVar = this.f1025a.f1031a;
        Objects.requireNonNull(kVar);
    }
}
