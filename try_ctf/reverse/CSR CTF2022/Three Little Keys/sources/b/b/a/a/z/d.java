package b.b.a.a.z;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f1625a;

    public d(a aVar) {
        this.f1625a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1625a.f1645c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
