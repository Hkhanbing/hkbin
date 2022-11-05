package a.s;

import a.h.j.w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class c extends z {

    /* loaded from: classes.dex */
    public class a extends k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1086a;

        public a(c cVar, View view) {
            this.f1086a = view;
        }

        @Override // a.s.h.d
        public void c(h hVar) {
            View view = this.f1086a;
            x xVar = r.f1119a;
            xVar.e(view, 1.0f);
            xVar.a(this.f1086a);
            hVar.v(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f1087a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1088b = false;

        public b(View view) {
            this.f1087a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            r.f1119a.e(this.f1087a, 1.0f);
            if (this.f1088b) {
                this.f1087a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.f1087a;
            AtomicInteger atomicInteger = a.h.j.w.f667a;
            if (!w.d.h(view) || this.f1087a.getLayerType() != 0) {
                return;
            }
            this.f1088b = true;
            this.f1087a.setLayerType(2, null);
        }
    }

    public c() {
    }

    public c(int i) {
        if ((i & (-4)) == 0) {
            this.x = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // a.s.z
    public Animator J(ViewGroup viewGroup, View view, o oVar, o oVar2) {
        r.f1119a.c(view);
        Float f = (Float) oVar.f1112a.get("android:fade:transitionAlpha");
        return K(view, f != null ? f.floatValue() : 1.0f, 0.0f);
    }

    public final Animator K(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        r.f1119a.e(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, r.f1120b, f2);
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    @Override // a.s.h
    public void g(o oVar) {
        H(oVar);
        oVar.f1112a.put("android:fade:transitionAlpha", Float.valueOf(r.a(oVar.f1113b)));
    }
}
