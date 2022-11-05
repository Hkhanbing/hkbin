package b.b.a.a.m;

import android.view.View;
import b.b.a.a.m.g;

/* loaded from: classes.dex */
public class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f1480a;

    public k(g gVar) {
        this.f1480a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g gVar = this.f1480a;
        g.e eVar = g.e.DAY;
        g.e eVar2 = gVar.Y;
        g.e eVar3 = g.e.YEAR;
        if (eVar2 == eVar3) {
            gVar.x0(eVar);
        } else if (eVar2 != eVar) {
        } else {
            gVar.x0(eVar3);
        }
    }
}
