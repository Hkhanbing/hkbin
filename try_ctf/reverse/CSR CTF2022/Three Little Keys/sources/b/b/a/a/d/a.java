package b.b.a.a.d;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.w.g f1390a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f1391b;

    public a(AppBarLayout appBarLayout, b.b.a.a.w.g gVar) {
        this.f1391b = appBarLayout;
        this.f1390a = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f1390a.p(floatValue);
        Drawable drawable = this.f1391b.o;
        if (drawable instanceof b.b.a.a.w.g) {
            ((b.b.a.a.w.g) drawable).p(floatValue);
        }
        Objects.requireNonNull(this.f1391b);
        throw null;
    }
}
