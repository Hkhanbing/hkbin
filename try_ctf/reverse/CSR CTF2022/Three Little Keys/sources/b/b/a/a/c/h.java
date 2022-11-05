package b.b.a.a.c;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public long f1383a;

    /* renamed from: b  reason: collision with root package name */
    public long f1384b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f1385c;
    public int d;
    public int e;

    public h(long j, long j2) {
        this.f1383a = 0L;
        this.f1384b = 300L;
        this.f1385c = null;
        this.d = 0;
        this.e = 1;
        this.f1383a = j;
        this.f1384b = j2;
    }

    public h(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f1383a = 0L;
        this.f1384b = 300L;
        this.f1385c = null;
        this.d = 0;
        this.e = 1;
        this.f1383a = j;
        this.f1384b = j2;
        this.f1385c = timeInterpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.f1383a);
        animator.setDuration(this.f1384b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.d);
            valueAnimator.setRepeatMode(this.e);
        }
    }

    public TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f1385c;
        return timeInterpolator != null ? timeInterpolator : a.f1371b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f1383a != hVar.f1383a || this.f1384b != hVar.f1384b || this.d != hVar.d || this.e != hVar.e) {
            return false;
        }
        return b().getClass().equals(hVar.b().getClass());
    }

    public int hashCode() {
        long j = this.f1383a;
        long j2 = this.f1384b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        return '\n' + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f1383a + " duration: " + this.f1384b + " interpolator: " + b().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.e + "}\n";
    }
}
