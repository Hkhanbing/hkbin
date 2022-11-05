package b.b.a.a.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f1539a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public b f1540b = null;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f1541c = null;
    public final Animator.AnimatorListener d = new a();

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j jVar = j.this;
            if (jVar.f1541c == animator) {
                jVar.f1541c = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f1543a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f1544b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f1543a = iArr;
            this.f1544b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.f1539a.add(bVar);
    }
}
