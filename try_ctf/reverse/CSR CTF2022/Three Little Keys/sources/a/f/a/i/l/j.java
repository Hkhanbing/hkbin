package a.f.a.i.l;

import a.f.a.i.l.f;

/* loaded from: classes.dex */
public class j extends o {
    public j(a.f.a.i.d dVar) {
        super(dVar);
    }

    @Override // a.f.a.i.l.o, a.f.a.i.l.d
    public void a(d dVar) {
        a.f.a.i.a aVar = (a.f.a.i.a) this.f428b;
        int i = aVar.t0;
        int i2 = 0;
        int i3 = -1;
        for (f fVar : this.h.l) {
            int i4 = fVar.g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i != 0 && i != 2) {
            this.h.c(i2 + aVar.v0);
        } else {
            this.h.c(i3 + aVar.v0);
        }
    }

    @Override // a.f.a.i.l.o
    public void d() {
        o oVar;
        a.f.a.i.d dVar = this.f428b;
        if (dVar instanceof a.f.a.i.a) {
            f fVar = this.h;
            fVar.f413b = true;
            a.f.a.i.a aVar = (a.f.a.i.a) dVar;
            int i = aVar.t0;
            boolean z = aVar.u0;
            int i2 = 0;
            if (i == 0) {
                fVar.e = f.a.LEFT;
                while (i2 < aVar.s0) {
                    a.f.a.i.d dVar2 = aVar.r0[i2];
                    if (z || dVar2.i0 != 8) {
                        f fVar2 = dVar2.d.h;
                        fVar2.k.add(this.h);
                        this.h.l.add(fVar2);
                    }
                    i2++;
                }
            } else if (i != 1) {
                if (i == 2) {
                    fVar.e = f.a.TOP;
                    while (i2 < aVar.s0) {
                        a.f.a.i.d dVar3 = aVar.r0[i2];
                        if (z || dVar3.i0 != 8) {
                            f fVar3 = dVar3.e.h;
                            fVar3.k.add(this.h);
                            this.h.l.add(fVar3);
                        }
                        i2++;
                    }
                } else if (i != 3) {
                    return;
                } else {
                    fVar.e = f.a.BOTTOM;
                    while (i2 < aVar.s0) {
                        a.f.a.i.d dVar4 = aVar.r0[i2];
                        if (z || dVar4.i0 != 8) {
                            f fVar4 = dVar4.e.i;
                            fVar4.k.add(this.h);
                            this.h.l.add(fVar4);
                        }
                        i2++;
                    }
                }
                m(this.f428b.e.h);
                oVar = this.f428b.e;
                m(oVar.i);
            } else {
                fVar.e = f.a.RIGHT;
                while (i2 < aVar.s0) {
                    a.f.a.i.d dVar5 = aVar.r0[i2];
                    if (z || dVar5.i0 != 8) {
                        f fVar5 = dVar5.d.i;
                        fVar5.k.add(this.h);
                        this.h.l.add(fVar5);
                    }
                    i2++;
                }
            }
            m(this.f428b.d.h);
            oVar = this.f428b.d;
            m(oVar.i);
        }
    }

    @Override // a.f.a.i.l.o
    public void e() {
        a.f.a.i.d dVar = this.f428b;
        if (dVar instanceof a.f.a.i.a) {
            int i = ((a.f.a.i.a) dVar).t0;
            if (i != 0 && i != 1) {
                dVar.b0 = this.h.g;
            } else {
                dVar.a0 = this.h.g;
            }
        }
    }

    @Override // a.f.a.i.l.o
    public void f() {
        this.f429c = null;
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
