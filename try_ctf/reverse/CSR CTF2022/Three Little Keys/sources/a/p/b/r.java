package a.p.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class r extends s {
    public r(RecyclerView.l lVar) {
        super(lVar, null);
    }

    @Override // a.p.b.s
    public int b(View view) {
        return this.f1058a.B(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).bottomMargin;
    }

    @Override // a.p.b.s
    public int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return this.f1058a.E(view) + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // a.p.b.s
    public int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return this.f1058a.F(view) + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // a.p.b.s
    public int e(View view) {
        return this.f1058a.H(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).topMargin;
    }

    @Override // a.p.b.s
    public int f() {
        return this.f1058a.q;
    }

    @Override // a.p.b.s
    public int g() {
        RecyclerView.l lVar = this.f1058a;
        return lVar.q - lVar.N();
    }

    @Override // a.p.b.s
    public int h() {
        return this.f1058a.N();
    }

    @Override // a.p.b.s
    public int i() {
        return this.f1058a.o;
    }

    @Override // a.p.b.s
    public int j() {
        return this.f1058a.n;
    }

    @Override // a.p.b.s
    public int k() {
        return this.f1058a.Q();
    }

    @Override // a.p.b.s
    public int l() {
        RecyclerView.l lVar = this.f1058a;
        return (lVar.q - lVar.Q()) - this.f1058a.N();
    }

    @Override // a.p.b.s
    public int n(View view) {
        this.f1058a.V(view, true, this.f1060c);
        return this.f1060c.bottom;
    }

    @Override // a.p.b.s
    public int o(View view) {
        this.f1058a.V(view, true, this.f1060c);
        return this.f1060c.top;
    }

    @Override // a.p.b.s
    public void p(int i) {
        this.f1058a.c0(i);
    }
}
