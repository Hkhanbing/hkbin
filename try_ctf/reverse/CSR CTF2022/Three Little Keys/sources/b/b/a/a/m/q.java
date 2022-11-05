package b.b.a.a.m;

import android.view.View;

/* loaded from: classes.dex */
public class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f1491a;

    public q(o oVar) {
        this.f1491a = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        o oVar = this.f1491a;
        oVar.C0.setEnabled(oVar.w0().b());
        this.f1491a.A0.toggle();
        o oVar2 = this.f1491a;
        oVar2.C0(oVar2.A0);
        this.f1491a.A0();
    }
}
