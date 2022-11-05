package a.f.a.i;

import a.f.a.i.d;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static boolean[] f402a = new boolean[3];

    public static void a(e eVar, a.f.a.d dVar, d dVar2) {
        d.a aVar = d.a.MATCH_PARENT;
        dVar2.o = -1;
        dVar2.p = -1;
        d.a aVar2 = eVar.U[0];
        d.a aVar3 = d.a.WRAP_CONTENT;
        if (aVar2 != aVar3 && dVar2.U[0] == aVar) {
            int i = dVar2.J.g;
            int u = eVar.u() - dVar2.L.g;
            c cVar = dVar2.J;
            cVar.i = dVar.l(cVar);
            c cVar2 = dVar2.L;
            cVar2.i = dVar.l(cVar2);
            dVar.e(dVar2.J.i, i);
            dVar.e(dVar2.L.i, u);
            dVar2.o = 2;
            dVar2.a0 = i;
            int i2 = u - i;
            dVar2.W = i2;
            int i3 = dVar2.d0;
            if (i2 < i3) {
                dVar2.W = i3;
            }
        }
        if (eVar.U[1] == aVar3 || dVar2.U[1] != aVar) {
            return;
        }
        int i4 = dVar2.K.g;
        int l = eVar.l() - dVar2.M.g;
        c cVar3 = dVar2.K;
        cVar3.i = dVar.l(cVar3);
        c cVar4 = dVar2.M;
        cVar4.i = dVar.l(cVar4);
        dVar.e(dVar2.K.i, i4);
        dVar.e(dVar2.M.i, l);
        if (dVar2.c0 > 0 || dVar2.i0 == 8) {
            c cVar5 = dVar2.N;
            cVar5.i = dVar.l(cVar5);
            dVar.e(dVar2.N.i, dVar2.c0 + i4);
        }
        dVar2.p = 2;
        dVar2.b0 = i4;
        int i5 = l - i4;
        dVar2.X = i5;
        int i6 = dVar2.e0;
        if (i5 >= i6) {
            return;
        }
        dVar2.X = i6;
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
