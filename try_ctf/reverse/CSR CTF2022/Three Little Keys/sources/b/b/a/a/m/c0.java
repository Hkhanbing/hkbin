package b.b.a.a.m;

import android.view.View;
import b.b.a.a.m.g;

/* loaded from: classes.dex */
public class c0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1461a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d0 f1462b;

    public c0(d0 d0Var, int i) {
        this.f1462b = d0Var;
        this.f1461a = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        t k = t.k(this.f1461a, this.f1462b.f1463c.X.f1494b);
        a aVar = this.f1462b.f1463c.W;
        if (k.compareTo(aVar.f1445a) < 0) {
            k = aVar.f1445a;
        } else if (k.compareTo(aVar.f1446b) > 0) {
            k = aVar.f1446b;
        }
        this.f1462b.f1463c.w0(k);
        this.f1462b.f1463c.x0(g.e.DAY);
    }
}
