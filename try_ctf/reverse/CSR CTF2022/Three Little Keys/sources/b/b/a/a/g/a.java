package b.b.a.a.g;

import android.animation.ValueAnimator;
import b.b.a.a.w.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f1426a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f1426a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g gVar = this.f1426a.h;
        if (gVar != null) {
            gVar.r(floatValue);
        }
    }
}
