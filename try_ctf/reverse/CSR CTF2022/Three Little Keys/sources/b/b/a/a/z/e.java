package b.b.a.a.z;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f1626a;

    public e(a aVar) {
        this.f1626a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f1626a.f1645c.setScaleX(floatValue);
        this.f1626a.f1645c.setScaleY(floatValue);
    }
}
