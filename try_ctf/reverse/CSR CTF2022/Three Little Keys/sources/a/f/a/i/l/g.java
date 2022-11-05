package a.f.a.i.l;

import a.f.a.i.l.f;

/* loaded from: classes.dex */
public class g extends f {
    public int m;

    public g(o oVar) {
        super(oVar);
        this.e = oVar instanceof k ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // a.f.a.i.l.f
    public void c(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }
}
