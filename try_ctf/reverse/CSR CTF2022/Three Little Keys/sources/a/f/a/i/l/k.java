package a.f.a.i.l;

import a.f.a.i.c;
import a.f.a.i.d;
import a.f.a.i.l.f;
import a.f.a.i.l.o;
import java.util.List;

/* loaded from: classes.dex */
public class k extends o {
    public static int[] k = new int[2];

    public k(a.f.a.i.d dVar) {
        super(dVar);
        this.h.e = f.a.LEFT;
        this.i.e = f.a.RIGHT;
        this.f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x026a, code lost:
        if (r15 != 1) goto L131;
     */
    @Override // a.f.a.i.l.o, a.f.a.i.l.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(a.f.a.i.l.d r18) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.i.l.k.a(a.f.a.i.l.d):void");
    }

    @Override // a.f.a.i.l.o
    public void d() {
        a.f.a.i.d dVar;
        a.f.a.i.d dVar2;
        f fVar;
        a.f.a.i.c cVar;
        List<d> list;
        d dVar3;
        f fVar2;
        f fVar3;
        f fVar4;
        int i;
        a.f.a.i.d dVar4;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        d.a aVar2 = d.a.MATCH_PARENT;
        d.a aVar3 = d.a.FIXED;
        a.f.a.i.d dVar5 = this.f428b;
        if (dVar5.f396a) {
            this.e.c(dVar5.u());
        }
        if (!this.e.j) {
            d.a m = this.f428b.m();
            this.d = m;
            if (m != aVar) {
                if (m == aVar2 && (dVar4 = this.f428b.V) != null && (dVar4.m() == aVar3 || dVar4.m() == aVar2)) {
                    int u = (dVar4.u() - this.f428b.J.d()) - this.f428b.L.d();
                    b(this.h, dVar4.d.h, this.f428b.J.d());
                    b(this.i, dVar4.d.i, -this.f428b.L.d());
                    this.e.c(u);
                    return;
                } else if (this.d == aVar3) {
                    this.e.c(this.f428b.u());
                }
            }
        } else if (this.d == aVar2 && (dVar = this.f428b.V) != null && (dVar.m() == aVar3 || dVar.m() == aVar2)) {
            b(this.h, dVar.d.h, this.f428b.J.d());
            b(this.i, dVar.d.i, -this.f428b.L.d());
            return;
        }
        g gVar = this.e;
        if (gVar.j) {
            a.f.a.i.d dVar6 = this.f428b;
            if (dVar6.f396a) {
                a.f.a.i.c[] cVarArr = dVar6.R;
                if (cVarArr[0].f != null && cVarArr[1].f != null) {
                    if (dVar6.A()) {
                        this.h.f = this.f428b.R[0].d();
                        fVar = this.i;
                        cVar = this.f428b.R[1];
                        fVar.f = -cVar.d();
                        return;
                    }
                    f h = h(this.f428b.R[0]);
                    if (h != null) {
                        f fVar5 = this.h;
                        int d = this.f428b.R[0].d();
                        fVar5.l.add(h);
                        fVar5.f = d;
                        h.k.add(fVar5);
                    }
                    f h2 = h(this.f428b.R[1]);
                    if (h2 != null) {
                        f fVar6 = this.i;
                        fVar6.l.add(h2);
                        fVar6.f = -this.f428b.R[1].d();
                        h2.k.add(fVar6);
                    }
                    this.h.f413b = true;
                    this.i.f413b = true;
                    return;
                }
                if (cVarArr[0].f != null) {
                    f h3 = h(cVarArr[0]);
                    if (h3 == null) {
                        return;
                    }
                    f fVar7 = this.h;
                    int d2 = this.f428b.R[0].d();
                    fVar7.l.add(h3);
                    fVar7.f = d2;
                    h3.k.add(fVar7);
                } else if (cVarArr[1].f != null) {
                    f h4 = h(cVarArr[1]);
                    if (h4 == null) {
                        return;
                    }
                    f fVar8 = this.i;
                    fVar8.l.add(h4);
                    fVar8.f = -this.f428b.R[1].d();
                    h4.k.add(fVar8);
                    fVar3 = this.h;
                    fVar4 = this.i;
                    i = -this.e.g;
                    b(fVar3, fVar4, i);
                    return;
                } else if ((dVar6 instanceof a.f.a.i.g) || dVar6.V == null || dVar6.i(c.a.CENTER).f != null) {
                    return;
                } else {
                    a.f.a.i.d dVar7 = this.f428b;
                    b(this.h, dVar7.V.d.h, dVar7.v());
                }
                fVar3 = this.i;
                fVar4 = this.h;
                i = this.e.g;
                b(fVar3, fVar4, i);
                return;
            }
        }
        if (this.d == aVar) {
            a.f.a.i.d dVar8 = this.f428b;
            int i2 = dVar8.r;
            if (i2 == 2) {
                a.f.a.i.d dVar9 = dVar8.V;
                if (dVar9 != null) {
                    g gVar2 = dVar9.e.e;
                    gVar.l.add(gVar2);
                    gVar2.k.add(this.e);
                    g gVar3 = this.e;
                    gVar3.f413b = true;
                    gVar3.k.add(this.h);
                    list = this.e.k;
                    dVar3 = this.i;
                    list.add(dVar3);
                }
            } else if (i2 == 3) {
                if (dVar8.s == 3) {
                    this.h.f412a = this;
                    this.i.f412a = this;
                    m mVar = dVar8.e;
                    mVar.h.f412a = this;
                    mVar.i.f412a = this;
                    gVar.f412a = this;
                    if (dVar8.B()) {
                        this.e.l.add(this.f428b.e.e);
                        this.f428b.e.e.k.add(this.e);
                        m mVar2 = this.f428b.e;
                        mVar2.e.f412a = this;
                        this.e.l.add(mVar2.h);
                        this.e.l.add(this.f428b.e.i);
                        this.f428b.e.h.k.add(this.e);
                        list = this.f428b.e.i.k;
                        dVar3 = this.e;
                        list.add(dVar3);
                    } else if (this.f428b.A()) {
                        this.f428b.e.e.l.add(this.e);
                        list = this.e.k;
                        dVar3 = this.f428b.e.e;
                        list.add(dVar3);
                    } else {
                        fVar2 = this.f428b.e.e;
                    }
                } else {
                    g gVar4 = dVar8.e.e;
                    gVar.l.add(gVar4);
                    gVar4.k.add(this.e);
                    this.f428b.e.h.k.add(this.e);
                    this.f428b.e.i.k.add(this.e);
                    g gVar5 = this.e;
                    gVar5.f413b = true;
                    gVar5.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    fVar2 = this.i;
                }
                list = fVar2.l;
                dVar3 = this.e;
                list.add(dVar3);
            }
            fVar.f = -cVar.d();
            return;
        }
        a.f.a.i.d dVar10 = this.f428b;
        a.f.a.i.c[] cVarArr2 = dVar10.R;
        if (cVarArr2[0].f != null && cVarArr2[1].f != null) {
            if (dVar10.A()) {
                this.h.f = this.f428b.R[0].d();
                fVar = this.i;
                cVar = this.f428b.R[1];
                fVar.f = -cVar.d();
                return;
            }
            f h5 = h(this.f428b.R[0]);
            f h6 = h(this.f428b.R[1]);
            if (h5 != null) {
                h5.k.add(this);
                if (h5.j) {
                    a(this);
                }
            }
            if (h6 != null) {
                h6.k.add(this);
                if (h6.j) {
                    a(this);
                }
            }
            this.j = o.a.CENTER;
            return;
        }
        if (cVarArr2[0].f != null) {
            f h7 = h(cVarArr2[0]);
            if (h7 == null) {
                return;
            }
            f fVar9 = this.h;
            int d3 = this.f428b.R[0].d();
            fVar9.l.add(h7);
            fVar9.f = d3;
            h7.k.add(fVar9);
        } else if (cVarArr2[1].f != null) {
            f h8 = h(cVarArr2[1]);
            if (h8 == null) {
                return;
            }
            f fVar10 = this.i;
            fVar10.l.add(h8);
            fVar10.f = -this.f428b.R[1].d();
            h8.k.add(fVar10);
            c(this.h, this.i, -1, this.e);
            return;
        } else if ((dVar10 instanceof a.f.a.i.g) || (dVar2 = dVar10.V) == null) {
            return;
        } else {
            b(this.h, dVar2.d.h, dVar10.v());
        }
        c(this.i, this.h, 1, this.e);
    }

    @Override // a.f.a.i.l.o
    public void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.f428b.a0 = fVar.g;
        }
    }

    @Override // a.f.a.i.l.o
    public void f() {
        this.f429c = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    @Override // a.f.a.i.l.o
    public boolean k() {
        return this.d != d.a.MATCH_CONSTRAINT || this.f428b.r == 0;
    }

    public final void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i6 > i6 || i9 > i7) {
        } else {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public void n() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        StringBuilder f = b.a.a.a.a.f("HorizontalRun ");
        f.append(this.f428b.j0);
        return f.toString();
    }
}
