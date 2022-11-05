package b.b.a.a.m;

import android.view.View;

/* loaded from: classes.dex */
public class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f1481a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f1482b;

    public l(g gVar, w wVar) {
        this.f1482b = gVar;
        this.f1481a = wVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int k1 = this.f1482b.u0().k1() + 1;
        if (k1 < this.f1482b.b0.getAdapter().a()) {
            this.f1482b.w0(this.f1481a.e(k1));
        }
    }
}
