package a.p.b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.z f1022a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1023b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1024c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ k f;

    public h(k kVar, RecyclerView.z zVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = kVar;
        this.f1022a = zVar;
        this.f1023b = i;
        this.f1024c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.f1023b != 0) {
            this.f1024c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.f1024c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        this.f.c(this.f1022a);
        this.f.p.remove(this.f1022a);
        this.f.k();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f);
    }
}
