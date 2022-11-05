package a.f.a.i.l;

/* loaded from: classes.dex */
public class i extends o {
    public i(a.f.a.i.d dVar) {
        super(dVar);
        dVar.d.f();
        dVar.e.f();
        this.f = ((a.f.a.i.f) dVar).v0;
    }

    @Override // a.f.a.i.l.o, a.f.a.i.l.d
    public void a(d dVar) {
        f fVar = this.h;
        if (fVar.f414c && !fVar.j) {
            this.h.c((int) ((fVar.l.get(0).g * ((a.f.a.i.f) this.f428b).r0) + 0.5f));
        }
    }

    @Override // a.f.a.i.l.o
    public void d() {
        o oVar;
        a.f.a.i.d dVar = this.f428b;
        a.f.a.i.f fVar = (a.f.a.i.f) dVar;
        int i = fVar.s0;
        int i2 = fVar.t0;
        if (fVar.v0 == 1) {
            f fVar2 = this.h;
            if (i != -1) {
                fVar2.l.add(dVar.V.d.h);
                this.f428b.V.d.h.k.add(this.h);
                this.h.f = i;
            } else if (i2 != -1) {
                fVar2.l.add(dVar.V.d.i);
                this.f428b.V.d.i.k.add(this.h);
                this.h.f = -i2;
            } else {
                fVar2.f413b = true;
                fVar2.l.add(dVar.V.d.i);
                this.f428b.V.d.i.k.add(this.h);
            }
            m(this.f428b.d.h);
            oVar = this.f428b.d;
        } else {
            f fVar3 = this.h;
            if (i != -1) {
                fVar3.l.add(dVar.V.e.h);
                this.f428b.V.e.h.k.add(this.h);
                this.h.f = i;
            } else if (i2 != -1) {
                fVar3.l.add(dVar.V.e.i);
                this.f428b.V.e.i.k.add(this.h);
                this.h.f = -i2;
            } else {
                fVar3.f413b = true;
                fVar3.l.add(dVar.V.e.i);
                this.f428b.V.e.i.k.add(this.h);
            }
            m(this.f428b.e.h);
            oVar = this.f428b.e;
        }
        m(oVar.i);
    }

    @Override // a.f.a.i.l.o
    public void e() {
        a.f.a.i.d dVar = this.f428b;
        if (((a.f.a.i.f) dVar).v0 == 1) {
            dVar.a0 = this.h.g;
        } else {
            dVar.b0 = this.h.g;
        }
    }

    @Override // a.f.a.i.l.o
    public void f() {
        this.h.b();
    }

    @Override // a.f.a.i.l.o
    public boolean k() {
        return false;
    }

    public final void m(f fVar) {
        this.h.k.add(fVar);
        fVar.l.add(this.h);
    }
}
