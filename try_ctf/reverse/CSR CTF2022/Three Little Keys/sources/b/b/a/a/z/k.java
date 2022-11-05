package b.b.a.a.z;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f1640a;

    public k(h hVar) {
        this.f1640a = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1640a.f1645c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
