package b.b.a.a.m;

import android.view.View;

/* loaded from: classes.dex */
public class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f1483a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f1484b;

    public m(g gVar, w wVar) {
        this.f1484b = gVar;
        this.f1483a = wVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int m1 = this.f1484b.u0().m1() - 1;
        if (m1 >= 0) {
            this.f1484b.w0(this.f1483a.e(m1));
        }
    }
}
