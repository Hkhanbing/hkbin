package a.l.b;

import a.l.b.b0;
import a.l.b.q0;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public class r implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f895a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f896b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q0.a f897c;
    public final /* synthetic */ a.h.f.a d;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (r.this.f896b.h() != null) {
                r.this.f896b.k0(null);
                r rVar = r.this;
                ((b0.d) rVar.f897c).a(rVar.f896b, rVar.d);
            }
        }
    }

    public r(ViewGroup viewGroup, m mVar, q0.a aVar, a.h.f.a aVar2) {
        this.f895a = viewGroup;
        this.f896b = mVar;
        this.f897c = aVar;
        this.d = aVar2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f895a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
