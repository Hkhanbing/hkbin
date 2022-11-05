package a.p.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class q extends s {
    public q(RecyclerView.l lVar) {
        super(lVar, null);
    }

    @Override // a.p.b.s
    public int b(View view) {
        return this.f1058a.G(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).rightMargin;
    }

    @Override // a.p.b.s
    public int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return this.f1058a.F(view) + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // a.p.b.s
    public int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return this.f1058a.E(view) + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // a.p.b.s
    public int e(View view) {
        return this.f1058a.D(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.m) view.getLayoutParams())).leftMargin;
    }

    @Override // a.p.b.s
    public int f() {
        return this.f1058a.p;
    }

    @Override // a.p.b.s
    public int g() {
        RecyclerView.l lVar = this.f1058a;
        return lVar.p - lVar.P();
    }

    @Override // a.p.b.s
    public int h() {
        return this.f1058a.P();
    }

    @Override // a.p.b.s
    public int i() {
        return this.f1058a.n;
    }

    @Override // a.p.b.s
    public int j() {
        return this.f1058a.o;
    }

    @Override // a.p.b.s
    public int k() {
        return this.f1058a.O();
    }

    @Override // a.p.b.s
    public int l() {
        RecyclerView.l lVar = this.f1058a;
        return (lVar.p - lVar.O()) - this.f1058a.P();
    }

    @Override // a.p.b.s
    public int n(View view) {
        this.f1058a.V(view, true, this.f1060c);
        return this.f1060c.right;
    }

    @Override // a.p.b.s
    public int o(View view) {
        this.f1058a.V(view, true, this.f1060c);
        return this.f1060c.left;
    }

    @Override // a.p.b.s
    public void p(int i) {
        this.f1058a.b0(i);
    }
}
