package b.b.a.a.m;

import android.view.View;

/* loaded from: classes.dex */
public class p implements a.h.j.o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1488a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1489b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1490c;

    public p(o oVar, int i, View view, int i2) {
        this.f1488a = i;
        this.f1489b = view;
        this.f1490c = i2;
    }

    @Override // a.h.j.o
    public a.h.j.b0 a(View view, a.h.j.b0 b0Var) {
        int i = b0Var.a(7).f534b;
        if (this.f1488a >= 0) {
            this.f1489b.getLayoutParams().height = this.f1488a + i;
            View view2 = this.f1489b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f1489b;
        view3.setPadding(view3.getPaddingLeft(), this.f1490c + i, this.f1489b.getPaddingRight(), this.f1489b.getPaddingBottom());
        return b0Var;
    }
}
