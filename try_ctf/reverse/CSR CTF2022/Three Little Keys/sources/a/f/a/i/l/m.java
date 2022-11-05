package a.f.a.i.l;

import a.f.a.i.d;
import a.f.a.i.l.f;

/* loaded from: classes.dex */
public class m extends o {
    public f k;
    public g l;

    public m(a.f.a.i.d dVar) {
        super(dVar);
        f fVar = new f(this);
        this.k = fVar;
        this.l = null;
        this.h.e = f.a.TOP;
        this.i.e = f.a.BOTTOM;
        fVar.e = f.a.BASELINE;
        this.f = 1;
    }

    @Override // a.f.a.i.l.o, a.f.a.i.l.d
    public void a(d dVar) {
        float f;
        float f2;
        float f3;
        int i;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        int ordinal = this.j.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal == 3) {
            a.f.a.i.d dVar2 = this.f428b;
            l(dVar2.K, dVar2.M, 1);
            return;
        }
        g gVar = this.e;
        if (gVar.f414c && !gVar.j && this.d == aVar) {
            a.f.a.i.d dVar3 = this.f428b;
            int i2 = dVar3.s;
            if (i2 == 2) {
                a.f.a.i.d dVar4 = dVar3.V;
                if (dVar4 != null) {
                    g gVar2 = dVar4.e.e;
                    if (gVar2.j) {
                        f = dVar3.z;
                        f2 = gVar2.g;
                        f3 = f2 * f;
                    }
                }
            } else if (i2 == 3) {
                g gVar3 = dVar3.d.e;
                if (gVar3.j) {
                    int i3 = dVar3.Z;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f2 = gVar3.g;
                            f = dVar3.Y;
                            f3 = f2 * f;
                        } else if (i3 != 1) {
                            i = 0;
                            gVar.c(i);
                        }
                    }
                    f3 = gVar3.g / dVar3.Y;
                }
            }
            i = (int) (f3 + 0.5f);
            gVar.c(i);
        }
        f fVar = this.h;
        if (!fVar.f414c) {
            return;
        }
        f fVar2 = this.i;
        if (!fVar2.f414c) {
            return;
        }
        if (fVar.j && fVar2.j && this.e.j) {
            return;
        }
        if (!this.e.j && this.d == aVar) {
            a.f.a.i.d dVar5 = this.f428b;
            if (dVar5.r == 0 && !dVar5.B()) {
                int i4 = this.h.l.get(0).g;
                f fVar3 = this.h;
                int i5 = i4 + fVar3.f;
                int i6 = this.i.l.get(0).g + this.i.f;
                fVar3.c(i5);
                this.i.c(i6);
                this.e.c(i6 - i5);
                return;
            }
        }
        if (!this.e.j && this.d == aVar && this.f427a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
            int i7 = (this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f);
            g gVar4 = this.e;
            int i8 = gVar4.m;
            if (i7 < i8) {
                gVar4.c(i7);
            } else {
                gVar4.c(i8);
            }
        }
        if (!this.e.j || this.h.l.size() <= 0 || this.i.l.size() <= 0) {
            return;
        }
        f fVar4 = this.h.l.get(0);
        f fVar5 = this.i.l.get(0);
        int i9 = fVar4.g;
        f fVar6 = this.h;
        int i10 = fVar6.f + i9;
        int i11 = fVar5.g;
        int i12 = this.i.f + i11;
        float f4 = this.f428b.g0;
        if (fVar4 == fVar5) {
            f4 = 0.5f;
        } else {
            i9 = i10;
            i11 = i12;
        }
        fVar6.c((int) ((((i11 - i9) - this.e.g) * f4) + i9 + 0.5f));
        this.i.c(this.h.g + this.e.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0320, code lost:
        if (r10.f428b.E != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0322, code lost:
        r0 = r10.k;
        r1 = r10.h;
        r2 = r10.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x037c, code lost:
        if (r0.d == r2) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03b5, code lost:
        if (r10.f428b.E != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0423, code lost:
        if (r0.d == r2) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0425, code lost:
        r0.e.k.add(r10.e);
        r10.e.l.add(r10.f428b.d.e);
        r10.e.f412a = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    @Override // a.f.a.i.l.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.i.l.m.d():void");
    }

    @Override // a.f.a.i.l.o
    public void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.f428b.b0 = fVar.g;
        }
    }

    @Override // a.f.a.i.l.o
    public void f() {
        this.f429c = null;
        this.h.b();
        this.i.b();
        this.k.b();
        this.e.b();
        this.g = false;
    }

    @Override // a.f.a.i.l.o
    public boolean k() {
        return this.d != d.a.MATCH_CONSTRAINT || this.f428b.s == 0;
    }

    public void m() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.k.b();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        StringBuilder f = b.a.a.a.a.f("VerticalRun ");
        f.append(this.f428b.j0);
        return f.toString();
    }
}
