package a.f.a.i;

import a.f.a.i.c;
import a.f.a.i.d;

/* loaded from: classes.dex */
public class f extends d {
    public float r0 = -1.0f;
    public int s0 = -1;
    public int t0 = -1;
    public c u0 = this.K;
    public int v0 = 0;
    public boolean w0;

    public f() {
        this.S.clear();
        this.S.add(this.u0);
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i] = this.u0;
        }
    }

    @Override // a.f.a.i.d
    public boolean D() {
        return this.w0;
    }

    @Override // a.f.a.i.d
    public boolean E() {
        return this.w0;
    }

    @Override // a.f.a.i.d
    public void U(a.f.a.d dVar, boolean z) {
        if (this.V == null) {
            return;
        }
        int o = dVar.o(this.u0);
        if (this.v0 == 1) {
            this.a0 = o;
            this.b0 = 0;
            N(this.V.l());
            S(0);
            return;
        }
        this.a0 = 0;
        this.b0 = o;
        S(this.V.u());
        N(0);
    }

    public void V(int i) {
        c cVar = this.u0;
        cVar.f391b = i;
        cVar.f392c = true;
        this.w0 = true;
    }

    public void W(int i) {
        if (this.v0 == i) {
            return;
        }
        this.v0 = i;
        this.S.clear();
        this.u0 = this.v0 == 1 ? this.J : this.K;
        this.S.add(this.u0);
        int length = this.R.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.R[i2] = this.u0;
        }
    }

    @Override // a.f.a.i.d
    public void d(a.f.a.d dVar, boolean z) {
        a.f.a.g l;
        a.f.a.g l2;
        a.f.a.g l3;
        d.a aVar = d.a.WRAP_CONTENT;
        e eVar = (e) this.V;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(c.a.LEFT);
        Object i2 = eVar.i(c.a.RIGHT);
        d dVar2 = this.V;
        boolean z2 = true;
        boolean z3 = dVar2 != null && dVar2.U[0] == aVar;
        if (this.v0 == 0) {
            i = eVar.i(c.a.TOP);
            i2 = eVar.i(c.a.BOTTOM);
            d dVar3 = this.V;
            if (dVar3 == null || dVar3.U[1] != aVar) {
                z2 = false;
            }
            z3 = z2;
        }
        if (this.w0) {
            c cVar = this.u0;
            if (cVar.f392c) {
                a.f.a.g l4 = dVar.l(cVar);
                dVar.e(l4, this.u0.c());
                if (this.s0 != -1) {
                    if (z3) {
                        l3 = dVar.l(i2);
                        dVar.f(l3, l4, 0, 5);
                    }
                    this.w0 = false;
                    return;
                }
                if (this.t0 != -1 && z3) {
                    l3 = dVar.l(i2);
                    dVar.f(l4, dVar.l(i), 0, 5);
                    dVar.f(l3, l4, 0, 5);
                }
                this.w0 = false;
                return;
            }
        }
        if (this.s0 != -1) {
            l = dVar.l(this.u0);
            dVar.d(l, dVar.l(i), this.s0, 8);
            if (!z3) {
                return;
            }
            l2 = dVar.l(i2);
        } else if (this.t0 == -1) {
            if (this.r0 == -1.0f) {
                return;
            }
            a.f.a.g l5 = dVar.l(this.u0);
            a.f.a.g l6 = dVar.l(i2);
            float f = this.r0;
            a.f.a.b m = dVar.m();
            m.d.j(l5, -1.0f);
            m.d.j(l6, f);
            dVar.c(m);
            return;
        } else {
            l = dVar.l(this.u0);
            l2 = dVar.l(i2);
            dVar.d(l, l2, -this.t0, 8);
            if (!z3) {
                return;
            }
            dVar.f(l, dVar.l(i), 0, 5);
        }
        dVar.f(l2, l, 0, 5);
    }

    @Override // a.f.a.i.d
    public boolean e() {
        return true;
    }

    @Override // a.f.a.i.d
    public c i(c.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.v0 != 0) {
                return null;
            }
            return this.u0;
        }
        if (this.v0 == 1) {
            return this.u0;
        }
        return null;
    }
}
