package b.b.a.a.q;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends d {
    public f(FloatingActionButton floatingActionButton, b.b.a.a.v.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // b.b.a.a.q.d
    public float e() {
        return this.r.getElevation();
    }

    @Override // b.b.a.a.q.d
    public void f(Rect rect) {
        if (FloatingActionButton.this.k) {
            super.f(rect);
            return;
        }
        int i = 0;
        if (!t()) {
            i = (0 - this.r.getSizeDimension()) / 2;
        }
        rect.set(i, i, i, i);
    }

    @Override // b.b.a.a.q.d
    public void i() {
    }

    @Override // b.b.a.a.q.d
    public void j() {
        v();
        throw null;
    }

    @Override // b.b.a.a.q.d
    public void k(int[] iArr) {
    }

    @Override // b.b.a.a.q.d
    public void l(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(d.z, w(f, f3));
        stateListAnimator.addState(d.A, w(f, f2));
        stateListAnimator.addState(d.B, w(f, f2));
        stateListAnimator.addState(d.C, w(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.r, "elevation", f).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.r, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(d.y);
        stateListAnimator.addState(d.D, animatorSet);
        stateListAnimator.addState(d.E, w(0.0f, 0.0f));
        this.r.setStateListAnimator(stateListAnimator);
        if (!r()) {
            return;
        }
        v();
        throw null;
    }

    @Override // b.b.a.a.q.d
    public boolean o() {
        return false;
    }

    @Override // b.b.a.a.q.d
    public void q(ColorStateList colorStateList) {
    }

    @Override // b.b.a.a.q.d
    public boolean r() {
        return FloatingActionButton.this.k || !t();
    }

    @Override // b.b.a.a.q.d
    public void u() {
    }

    public final Animator w(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.r, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.r, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(d.y);
        return animatorSet;
    }
}
