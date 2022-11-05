package a.l.b;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public class u extends AnimationSet implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f917a;

    /* renamed from: b  reason: collision with root package name */
    public final View f918b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f919c;
    public boolean d;
    public boolean e;

    public u(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.e = true;
        this.f917a = viewGroup;
        this.f918b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation) {
        this.e = true;
        if (this.f919c) {
            return !this.d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f919c = true;
            a.h.j.r.a(this.f917a, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation, float f) {
        this.e = true;
        if (this.f919c) {
            return !this.d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f919c = true;
            a.h.j.r.a(this.f917a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f919c || !this.e) {
            this.f917a.endViewTransition(this.f918b);
            this.d = true;
            return;
        }
        this.e = false;
        this.f917a.post(this);
    }
}
