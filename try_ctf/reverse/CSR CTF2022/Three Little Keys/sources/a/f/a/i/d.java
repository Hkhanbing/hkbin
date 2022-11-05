package a.f.a.i;

import a.f.a.i.c;
import a.f.a.i.l.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public c J;
    public c K;
    public c L;
    public c M;
    public c N;
    public c O;
    public c P;
    public c Q;
    public c[] R;
    public ArrayList<c> S;
    public boolean[] T;
    public a[] U;
    public d V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public int a0;

    /* renamed from: b  reason: collision with root package name */
    public a.f.a.i.l.c f397b;
    public int b0;

    /* renamed from: c  reason: collision with root package name */
    public a.f.a.i.l.c f398c;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public float g0;
    public Object h0;
    public int i0;
    public String j;
    public String j0;
    public boolean k;
    public int k0;
    public boolean l;
    public int l0;
    public boolean m;
    public float[] m0;
    public boolean n;
    public d[] n0;
    public int o;
    public d[] o0;
    public int p;
    public int p0;
    public int q;
    public int q0;
    public int r;
    public int s;
    public int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f396a = false;
    public a.f.a.i.l.k d = null;
    public m e = null;
    public boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    /* loaded from: classes.dex */
    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public d() {
        new HashMap();
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        c cVar = new c(this, c.a.LEFT);
        this.J = cVar;
        c cVar2 = new c(this, c.a.TOP);
        this.K = cVar2;
        c cVar3 = new c(this, c.a.RIGHT);
        this.L = cVar3;
        c cVar4 = new c(this, c.a.BOTTOM);
        this.M = cVar4;
        c cVar5 = new c(this, c.a.BASELINE);
        this.N = cVar5;
        this.O = new c(this, c.a.CENTER_X);
        this.P = new c(this, c.a.CENTER_Y);
        c cVar6 = new c(this, c.a.CENTER);
        this.Q = cVar6;
        this.R = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar6};
        ArrayList<c> arrayList = new ArrayList<>();
        this.S = arrayList;
        this.T = new boolean[2];
        a aVar = a.FIXED;
        this.U = new a[]{aVar, aVar};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = null;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = new float[]{-1.0f, -1.0f};
        this.n0 = new d[]{null, null};
        this.o0 = new d[]{null, null};
        this.p0 = -1;
        this.q0 = -1;
        arrayList.add(this.J);
        this.S.add(this.K);
        this.S.add(this.L);
        this.S.add(this.M);
        this.S.add(this.O);
        this.S.add(this.P);
        this.S.add(this.Q);
        this.S.add(this.N);
    }

    public boolean A() {
        c cVar = this.J;
        c cVar2 = cVar.f;
        if (cVar2 == null || cVar2.f != cVar) {
            c cVar3 = this.L;
            c cVar4 = cVar3.f;
            return cVar4 != null && cVar4.f == cVar3;
        }
        return true;
    }

    public boolean B() {
        c cVar = this.K;
        c cVar2 = cVar.f;
        if (cVar2 == null || cVar2.f != cVar) {
            c cVar3 = this.M;
            c cVar4 = cVar3.f;
            return cVar4 != null && cVar4.f == cVar3;
        }
        return true;
    }

    public boolean C() {
        return this.g && this.i0 != 8;
    }

    public boolean D() {
        return this.k || (this.J.f392c && this.L.f392c);
    }

    public boolean E() {
        return this.l || (this.K.f392c && this.M.f392c);
    }

    public void F() {
        this.J.h();
        this.K.h();
        this.L.h();
        this.M.h();
        this.N.h();
        this.O.h();
        this.P.h();
        this.Q.h();
        this.V = null;
        this.D = 0.0f;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        a[] aVarArr = this.U;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.h0 = null;
        this.i0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        float[] fArr = this.m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public void G() {
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = false;
        int size = this.S.size();
        for (int i = 0; i < size; i++) {
            c cVar = this.S.get(i);
            cVar.f392c = false;
            cVar.f391b = 0;
        }
    }

    public void H(a.f.a.c cVar) {
        this.J.i();
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.Q.i();
        this.O.i();
        this.P.i();
    }

    public final void I(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public final void J(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public void K(int i) {
        this.c0 = i;
        this.E = i > 0;
    }

    public void L(int i, int i2) {
        if (this.k) {
            return;
        }
        c cVar = this.J;
        cVar.f391b = i;
        cVar.f392c = true;
        c cVar2 = this.L;
        cVar2.f391b = i2;
        cVar2.f392c = true;
        this.a0 = i;
        this.W = i2 - i;
        this.k = true;
    }

    public void M(int i, int i2) {
        if (this.l) {
            return;
        }
        c cVar = this.K;
        cVar.f391b = i;
        cVar.f392c = true;
        c cVar2 = this.M;
        cVar2.f391b = i2;
        cVar2.f392c = true;
        this.b0 = i;
        this.X = i2 - i;
        if (this.E) {
            this.N.j(i + this.c0);
        }
        this.l = true;
    }

    public void N(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public void O(a aVar) {
        this.U[0] = aVar;
    }

    public void P(int i) {
        if (i < 0) {
            i = 0;
        }
        this.e0 = i;
    }

    public void Q(int i) {
        if (i < 0) {
            i = 0;
        }
        this.d0 = i;
    }

    public void R(a aVar) {
        this.U[1] = aVar;
    }

    public void S(int i) {
        this.W = i;
        int i2 = this.d0;
        if (i < i2) {
            this.W = i2;
        }
    }

    public void T(boolean z, boolean z2) {
        int i;
        int i2;
        a aVar = a.FIXED;
        a.f.a.i.l.k kVar = this.d;
        boolean z3 = z & kVar.g;
        m mVar = this.e;
        boolean z4 = z2 & mVar.g;
        int i3 = kVar.h.g;
        int i4 = mVar.h.g;
        int i5 = kVar.i.g;
        int i6 = mVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.a0 = i3;
        }
        if (z4) {
            this.b0 = i4;
        }
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z3) {
            if (this.U[0] == aVar && i8 < (i2 = this.W)) {
                i8 = i2;
            }
            this.W = i8;
            int i10 = this.d0;
            if (i8 < i10) {
                this.W = i10;
            }
        }
        if (!z4) {
            return;
        }
        if (this.U[1] == aVar && i9 < (i = this.X)) {
            i9 = i;
        }
        this.X = i9;
        int i11 = this.e0;
        if (i9 >= i11) {
            return;
        }
        this.X = i11;
    }

    public void U(a.f.a.d dVar, boolean z) {
        int i;
        int i2;
        m mVar;
        a.f.a.i.l.k kVar;
        int o = dVar.o(this.J);
        int o2 = dVar.o(this.K);
        int o3 = dVar.o(this.L);
        int o4 = dVar.o(this.M);
        if (z && (kVar = this.d) != null) {
            a.f.a.i.l.f fVar = kVar.h;
            if (fVar.j) {
                a.f.a.i.l.f fVar2 = kVar.i;
                if (fVar2.j) {
                    o = fVar.g;
                    o3 = fVar2.g;
                }
            }
        }
        if (z && (mVar = this.e) != null) {
            a.f.a.i.l.f fVar3 = mVar.h;
            if (fVar3.j) {
                a.f.a.i.l.f fVar4 = mVar.i;
                if (fVar4.j) {
                    o2 = fVar3.g;
                    o4 = fVar4.g;
                }
            }
        }
        int i3 = o4 - o2;
        if (o3 - o < 0 || i3 < 0 || o == Integer.MIN_VALUE || o == Integer.MAX_VALUE || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE) {
            o4 = 0;
            o = 0;
            o2 = 0;
            o3 = 0;
        }
        a aVar = a.MATCH_CONSTRAINT;
        int i4 = o3 - o;
        int i5 = o4 - o2;
        this.a0 = o;
        this.b0 = o2;
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        a[] aVarArr = this.U;
        a aVar2 = aVarArr[0];
        a aVar3 = a.FIXED;
        if (aVar2 == aVar3 && i4 < (i2 = this.W)) {
            i4 = i2;
        }
        if (aVarArr[1] == aVar3 && i5 < (i = this.X)) {
            i5 = i;
        }
        this.W = i4;
        this.X = i5;
        int i6 = this.e0;
        if (i5 < i6) {
            this.X = i6;
        }
        int i7 = this.d0;
        if (i4 < i7) {
            this.W = i7;
        }
        int i8 = this.v;
        if (i8 > 0 && aVarArr[0] == aVar) {
            this.W = Math.min(this.W, i8);
        }
        int i9 = this.y;
        if (i9 > 0 && this.U[1] == aVar) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.W;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.X;
        if (i5 == i11) {
            return;
        }
        this.i = i11;
    }

    public void b(e eVar, a.f.a.d dVar, HashSet<d> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            i.a(eVar, dVar, this);
            hashSet.remove(this);
            d(dVar, eVar.f0(64));
        }
        if (i == 0) {
            HashSet<c> hashSet2 = this.J.f390a;
            if (hashSet2 != null) {
                Iterator<c> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().d.b(eVar, dVar, hashSet, i, true);
                }
            }
            HashSet<c> hashSet3 = this.L.f390a;
            if (hashSet3 == null) {
                return;
            }
            Iterator<c> it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                it2.next().d.b(eVar, dVar, hashSet, i, true);
            }
            return;
        }
        HashSet<c> hashSet4 = this.K.f390a;
        if (hashSet4 != null) {
            Iterator<c> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().d.b(eVar, dVar, hashSet, i, true);
            }
        }
        HashSet<c> hashSet5 = this.M.f390a;
        if (hashSet5 != null) {
            Iterator<c> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().d.b(eVar, dVar, hashSet, i, true);
            }
        }
        HashSet<c> hashSet6 = this.N.f390a;
        if (hashSet6 == null) {
            return;
        }
        Iterator<c> it5 = hashSet6.iterator();
        while (it5.hasNext()) {
            it5.next().d.b(eVar, dVar, hashSet, i, true);
        }
    }

    public boolean c() {
        return (this instanceof j) || (this instanceof f);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(a.f.a.d r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.i.d.d(a.f.a.d, boolean):void");
    }

    public boolean e() {
        return this.i0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:353:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(a.f.a.d r36, boolean r37, boolean r38, boolean r39, boolean r40, a.f.a.g r41, a.f.a.g r42, a.f.a.i.d.a r43, boolean r44, a.f.a.i.c r45, a.f.a.i.c r46, int r47, int r48, int r49, int r50, float r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, int r57, int r58, int r59, int r60, float r61, boolean r62) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.i.d.f(a.f.a.d, boolean, boolean, boolean, boolean, a.f.a.g, a.f.a.g, a.f.a.i.d$a, boolean, a.f.a.i.c, a.f.a.i.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void g(a.f.a.d dVar) {
        dVar.l(this.J);
        dVar.l(this.K);
        dVar.l(this.L);
        dVar.l(this.M);
        if (this.c0 > 0) {
            dVar.l(this.N);
        }
    }

    public void h() {
        if (this.d == null) {
            this.d = new a.f.a.i.l.k(this);
        }
        if (this.e == null) {
            this.e = new m(this);
        }
    }

    public c i(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public int j() {
        return w() + this.X;
    }

    public a k(int i) {
        if (i == 0) {
            return m();
        }
        if (i != 1) {
            return null;
        }
        return t();
    }

    public int l() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public a m() {
        return this.U[0];
    }

    public d n(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i != 1 || (cVar2 = (cVar = this.M).f) == null || cVar2.f != cVar) {
                return null;
            }
            return cVar2.d;
        }
        c cVar3 = this.L;
        c cVar4 = cVar3.f;
        if (cVar4 != null && cVar4.f == cVar3) {
            return cVar4.d;
        }
        return null;
    }

    public d o(int i) {
        c cVar;
        c cVar2;
        if (i != 0) {
            if (i != 1 || (cVar2 = (cVar = this.K).f) == null || cVar2.f != cVar) {
                return null;
            }
            return cVar2.d;
        }
        c cVar3 = this.J;
        c cVar4 = cVar3.f;
        if (cVar4 != null && cVar4.f == cVar3) {
            return cVar4.d;
        }
        return null;
    }

    public int p() {
        return v() + this.W;
    }

    public void q(StringBuilder sb) {
        StringBuilder f = b.a.a.a.a.f("  ");
        f.append(this.j);
        f.append(":{\n");
        sb.append(f.toString());
        sb.append("    actualWidth:" + this.W);
        sb.append("\n");
        sb.append("    actualHeight:" + this.X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.a0);
        sb.append("\n");
        sb.append("    actualTop:" + this.b0);
        sb.append("\n");
        s(sb, "left", this.J);
        s(sb, "top", this.K);
        s(sb, "right", this.L);
        s(sb, "bottom", this.M);
        s(sb, "baseline", this.N);
        s(sb, "centerX", this.O);
        s(sb, "centerY", this.P);
        int i = this.W;
        int i2 = this.d0;
        int i3 = this.C[0];
        int i4 = this.u;
        int i5 = this.r;
        float f2 = this.w;
        float f3 = this.m0[0];
        r(sb, "    width", i, i2, i3, i4, i5, f2);
        int i6 = this.X;
        int i7 = this.e0;
        int i8 = this.C[1];
        int i9 = this.x;
        int i10 = this.s;
        float f4 = this.z;
        float f5 = this.m0[1];
        r(sb, "    height", i6, i7, i8, i9, i10, f4);
        float f6 = this.Y;
        int i11 = this.Z;
        if (f6 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f6);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        I(sb, "    horizontalBias", this.f0, 0.5f);
        I(sb, "    verticalBias", this.g0, 0.5f);
        J(sb, "    horizontalChainStyle", this.k0, 0);
        J(sb, "    verticalChainStyle", this.l0, 0);
        sb.append("  }");
    }

    public final void r(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        J(sb, "      size", i, 0);
        J(sb, "      min", i2, 0);
        J(sb, "      max", i3, Integer.MAX_VALUE);
        J(sb, "      matchMin", i4, 0);
        J(sb, "      matchDef", i5, 0);
        I(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public final void s(StringBuilder sb, String str, c cVar) {
        if (cVar.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f);
        sb.append("'");
        if (cVar.h != Integer.MIN_VALUE || cVar.g != 0) {
            sb.append(",");
            sb.append(cVar.g);
            if (cVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public a t() {
        return this.U[1];
    }

    public String toString() {
        String str = "";
        StringBuilder f = b.a.a.a.a.f(str);
        if (this.j0 != null) {
            StringBuilder f2 = b.a.a.a.a.f("id: ");
            f2.append(this.j0);
            f2.append(" ");
            str = f2.toString();
        }
        f.append(str);
        f.append("(");
        f.append(this.a0);
        f.append(", ");
        f.append(this.b0);
        f.append(") - (");
        f.append(this.W);
        f.append(" x ");
        f.append(this.X);
        f.append(")");
        return f.toString();
    }

    public int u() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public int v() {
        d dVar = this.V;
        return (dVar == null || !(dVar instanceof e)) ? this.a0 : ((e) dVar).y0 + this.a0;
    }

    public int w() {
        d dVar = this.V;
        return (dVar == null || !(dVar instanceof e)) ? this.b0 : ((e) dVar).z0 + this.b0;
    }

    public boolean x(int i) {
        if (i == 0) {
            return (this.J.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2;
        }
        return ((this.K.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0)) + (this.N.f != null ? 1 : 0) < 2;
    }

    public boolean y(int i, int i2) {
        c cVar;
        c cVar2;
        if (i == 0) {
            c cVar3 = this.J.f;
            if (cVar3 != null && cVar3.f392c && (cVar2 = this.L.f) != null && cVar2.f392c) {
                return (cVar2.c() - this.L.d()) - (this.J.d() + this.J.f.c()) >= i2;
            }
        } else {
            c cVar4 = this.K.f;
            if (cVar4 != null && cVar4.f392c && (cVar = this.M.f) != null && cVar.f392c) {
                return (cVar.c() - this.M.d()) - (this.K.d() + this.K.f.c()) >= i2;
            }
        }
        return false;
    }

    public final boolean z(int i) {
        int i2 = i * 2;
        c[] cVarArr = this.R;
        if (cVarArr[i2].f != null && cVarArr[i2].f.f != cVarArr[i2]) {
            int i3 = i2 + 1;
            if (cVarArr[i3].f != null && cVarArr[i3].f.f == cVarArr[i3]) {
                return true;
            }
        }
        return false;
    }
}
