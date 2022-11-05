package a.f.a.i.l;

import a.f.a.i.d;

/* loaded from: classes.dex */
public abstract class o implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f427a;

    /* renamed from: b  reason: collision with root package name */
    public a.f.a.i.d f428b;

    /* renamed from: c  reason: collision with root package name */
    public l f429c;
    public d.a d;
    public g e = new g(this);
    public int f = 0;
    public boolean g = false;
    public f h = new f(this);
    public f i = new f(this);
    public a j = a.NONE;

    /* loaded from: classes.dex */
    public enum a {
        NONE,
        START,
        END,
        CENTER
    }

    public o(a.f.a.i.d dVar) {
        this.f428b = dVar;
    }

    @Override // a.f.a.i.l.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i) {
        fVar.l.add(fVar2);
        fVar.f = i;
        fVar2.k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            a.f.a.i.d dVar = this.f428b;
            int i3 = dVar.v;
            max = Math.max(dVar.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            a.f.a.i.d dVar2 = this.f428b;
            int i4 = dVar2.y;
            max = Math.max(dVar2.x, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public final f h(a.f.a.i.c cVar) {
        o oVar;
        o oVar2;
        a.f.a.i.c cVar2 = cVar.f;
        if (cVar2 == null) {
            return null;
        }
        a.f.a.i.d dVar = cVar2.d;
        int ordinal = cVar2.e.ordinal();
        if (ordinal == 1) {
            oVar = dVar.d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                oVar2 = dVar.d;
            } else if (ordinal != 4) {
                if (ordinal == 5) {
                    return dVar.e.k;
                }
                return null;
            } else {
                oVar2 = dVar.e;
            }
            return oVar2.i;
        } else {
            oVar = dVar.e;
        }
        return oVar.h;
    }

    public final f i(a.f.a.i.c cVar, int i) {
        a.f.a.i.c cVar2 = cVar.f;
        if (cVar2 == null) {
            return null;
        }
        a.f.a.i.d dVar = cVar2.d;
        o oVar = i == 0 ? dVar.d : dVar.e;
        int ordinal = cVar2.e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return oVar.h;
        }
        if (ordinal != 3 && ordinal != 4) {
            return null;
        }
        return oVar.i;
    }

    public long j() {
        g gVar = this.e;
        if (gVar.j) {
            return gVar.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        if (r14.f427a == 3) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(a.f.a.i.c r18, a.f.a.i.c r19, int r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.i.l.o.l(a.f.a.i.c, a.f.a.i.c, int):void");
    }
}
