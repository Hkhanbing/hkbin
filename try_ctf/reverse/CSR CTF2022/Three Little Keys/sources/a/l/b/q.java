package a.l.b;

import a.h.f.a;
import android.view.View;

/* loaded from: classes.dex */
public class q implements a.InterfaceC0014a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f888a;

    public q(m mVar) {
        this.f888a = mVar;
    }

    @Override // a.h.f.a.InterfaceC0014a
    public void a() {
        if (this.f888a.h() != null) {
            View h = this.f888a.h();
            this.f888a.k0(null);
            h.clearAnimation();
        }
        this.f888a.m0(null);
    }
}
