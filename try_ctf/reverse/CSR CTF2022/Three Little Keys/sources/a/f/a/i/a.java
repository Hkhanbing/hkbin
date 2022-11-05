package a.f.a.i;

import a.f.a.i.c;
import a.f.a.i.d;

/* loaded from: classes.dex */
public class a extends h {
    public int t0 = 0;
    public boolean u0 = true;
    public int v0 = 0;
    public boolean w0 = false;

    @Override // a.f.a.i.d
    public boolean D() {
        return this.w0;
    }

    @Override // a.f.a.i.d
    public boolean E() {
        return this.w0;
    }

    public boolean W() {
        int i;
        c i2;
        c i3;
        c i4;
        int i5;
        int i6;
        c.a aVar = c.a.BOTTOM;
        c.a aVar2 = c.a.TOP;
        c.a aVar3 = c.a.RIGHT;
        c.a aVar4 = c.a.LEFT;
        int i7 = 0;
        boolean z = true;
        while (true) {
            i = this.s0;
            if (i7 >= i) {
                break;
            }
            d dVar = this.r0[i7];
            if ((this.u0 || dVar.e()) && ((((i5 = this.t0) == 0 || i5 == 1) && !dVar.D()) || (((i6 = this.t0) == 2 || i6 == 3) && !dVar.E()))) {
                z = false;
            }
            i7++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i8 = 0;
        boolean z2 = false;
        for (int i9 = 0; i9 < this.s0; i9++) {
            d dVar2 = this.r0[i9];
            if (this.u0 || dVar2.e()) {
                if (!z2) {
                    int i10 = this.t0;
                    if (i10 == 0) {
                        i4 = dVar2.i(aVar4);
                    } else if (i10 == 1) {
                        i4 = dVar2.i(aVar3);
                    } else if (i10 == 2) {
                        i4 = dVar2.i(aVar2);
                    } else {
                        if (i10 == 3) {
                            i4 = dVar2.i(aVar);
                        }
                        z2 = true;
                    }
                    i8 = i4.c();
                    z2 = true;
                }
                int i11 = this.t0;
                if (i11 == 0) {
                    i3 = dVar2.i(aVar4);
                } else {
                    if (i11 == 1) {
                        i2 = dVar2.i(aVar3);
                    } else if (i11 == 2) {
                        i3 = dVar2.i(aVar2);
                    } else if (i11 == 3) {
                        i2 = dVar2.i(aVar);
                    }
                    i8 = Math.max(i8, i2.c());
                }
                i8 = Math.min(i8, i3.c());
            }
        }
        int i12 = i8 + this.v0;
        int i13 = this.t0;
        if (i13 == 0 || i13 == 1) {
            L(i12, i12);
        } else {
            M(i12, i12);
        }
        this.w0 = true;
        return true;
    }

    public int X() {
        int i = this.t0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // a.f.a.i.d
    public void d(a.f.a.d dVar, boolean z) {
        Object[] objArr;
        boolean z2;
        a.f.a.g gVar;
        c cVar;
        int i;
        int i2;
        int i3;
        a.f.a.g gVar2;
        int i4;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        c[] cVarArr = this.R;
        cVarArr[0] = this.J;
        cVarArr[2] = this.K;
        cVarArr[1] = this.L;
        cVarArr[3] = this.M;
        int i5 = 0;
        while (true) {
            objArr = this.R;
            if (i5 >= objArr.length) {
                break;
            }
            objArr[i5].i = dVar.l(objArr[i5]);
            i5++;
        }
        int i6 = this.t0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        c cVar2 = objArr[i6];
        if (!this.w0) {
            W();
        }
        if (this.w0) {
            this.w0 = false;
            int i7 = this.t0;
            if (i7 == 0 || i7 == 1) {
                dVar.e(this.J.i, this.a0);
                gVar2 = this.L.i;
                i4 = this.a0;
            } else if (i7 != 2 && i7 != 3) {
                return;
            } else {
                dVar.e(this.K.i, this.b0);
                gVar2 = this.M.i;
                i4 = this.b0;
            }
            dVar.e(gVar2, i4);
            return;
        }
        for (int i8 = 0; i8 < this.s0; i8++) {
            d dVar2 = this.r0[i8];
            if ((this.u0 || dVar2.e()) && ((((i2 = this.t0) == 0 || i2 == 1) && dVar2.m() == aVar && dVar2.J.f != null && dVar2.L.f != null) || (((i3 = this.t0) == 2 || i3 == 3) && dVar2.t() == aVar && dVar2.K.f != null && dVar2.M.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.J.e() || this.L.e();
        boolean z4 = this.K.e() || this.M.e();
        boolean z5 = !z2 && (((i = this.t0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))));
        int i9 = 5;
        if (!z5) {
            i9 = 4;
        }
        for (int i10 = 0; i10 < this.s0; i10++) {
            d dVar3 = this.r0[i10];
            if (this.u0 || dVar3.e()) {
                a.f.a.g l = dVar.l(dVar3.R[this.t0]);
                c[] cVarArr2 = dVar3.R;
                int i11 = this.t0;
                cVarArr2[i11].i = l;
                int i12 = (cVarArr2[i11].f == null || cVarArr2[i11].f.d != this) ? 0 : cVarArr2[i11].g + 0;
                if (i11 != 0 && i11 != 2) {
                    a.f.a.b m = dVar.m();
                    a.f.a.g n = dVar.n();
                    n.d = 0;
                    m.e(cVar2.i, l, n, this.v0 + i12);
                    dVar.c(m);
                } else {
                    a.f.a.b m2 = dVar.m();
                    a.f.a.g n2 = dVar.n();
                    n2.d = 0;
                    m2.f(cVar2.i, l, n2, this.v0 - i12);
                    dVar.c(m2);
                }
                dVar.d(cVar2.i, l, this.v0 + i12, i9);
            }
        }
        int i13 = this.t0;
        if (i13 == 0) {
            dVar.d(this.L.i, this.J.i, 0, 8);
            dVar.d(this.J.i, this.V.L.i, 0, 4);
            gVar = this.J.i;
            cVar = this.V.J;
        } else if (i13 == 1) {
            dVar.d(this.J.i, this.L.i, 0, 8);
            dVar.d(this.J.i, this.V.J.i, 0, 4);
            gVar = this.J.i;
            cVar = this.V.L;
        } else if (i13 == 2) {
            dVar.d(this.M.i, this.K.i, 0, 8);
            dVar.d(this.K.i, this.V.M.i, 0, 4);
            gVar = this.K.i;
            cVar = this.V.K;
        } else if (i13 != 3) {
            return;
        } else {
            dVar.d(this.K.i, this.M.i, 0, 8);
            dVar.d(this.K.i, this.V.K.i, 0, 4);
            gVar = this.K.i;
            cVar = this.V.M;
        }
        dVar.d(gVar, cVar.i, 0, 0);
    }

    @Override // a.f.a.i.d
    public boolean e() {
        return true;
    }

    @Override // a.f.a.i.d
    public String toString() {
        StringBuilder f = b.a.a.a.a.f("[Barrier] ");
        f.append(this.j0);
        f.append(" {");
        String sb = f.toString();
        for (int i = 0; i < this.s0; i++) {
            d dVar = this.r0[i];
            if (i > 0) {
                sb = b.a.a.a.a.d(sb, ", ");
            }
            StringBuilder f2 = b.a.a.a.a.f(sb);
            f2.append(dVar.j0);
            sb = f2.toString();
        }
        return b.a.a.a.a.d(sb, "}");
    }
}
