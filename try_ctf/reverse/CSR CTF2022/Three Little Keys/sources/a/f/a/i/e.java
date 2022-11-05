package a.f.a.i;

import a.f.a.i.d;
import a.f.a.i.l.b;
import a.f.a.i.l.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e extends k {
    public int u0;
    public int y0;
    public int z0;
    public a.f.a.i.l.b s0 = new a.f.a.i.l.b(this);
    public a.f.a.i.l.e t0 = new a.f.a.i.l.e(this);
    public b.InterfaceC0008b v0 = null;
    public boolean w0 = false;
    public a.f.a.d x0 = new a.f.a.d();
    public int A0 = 0;
    public int B0 = 0;
    public b[] C0 = new b[4];
    public b[] D0 = new b[4];
    public int E0 = 257;
    public boolean F0 = false;
    public boolean G0 = false;
    public WeakReference<c> H0 = null;
    public WeakReference<c> I0 = null;
    public WeakReference<c> J0 = null;
    public WeakReference<c> K0 = null;
    public HashSet<d> L0 = new HashSet<>();
    public b.a M0 = new b.a();

    public static boolean e0(d dVar, b.InterfaceC0008b interfaceC0008b, b.a aVar, int i) {
        int i2;
        int i3;
        d.a aVar2 = d.a.WRAP_CONTENT;
        d.a aVar3 = d.a.FIXED;
        if (interfaceC0008b == null) {
            return false;
        }
        if (dVar.i0 == 8 || (dVar instanceof f) || (dVar instanceof a)) {
            aVar.e = 0;
            aVar.f = 0;
            return false;
        }
        aVar.f406a = dVar.m();
        aVar.f407b = dVar.t();
        aVar.f408c = dVar.u();
        aVar.d = dVar.l();
        aVar.i = false;
        aVar.j = i;
        d.a aVar4 = aVar.f406a;
        d.a aVar5 = d.a.MATCH_CONSTRAINT;
        boolean z = aVar4 == aVar5;
        boolean z2 = aVar.f407b == aVar5;
        boolean z3 = z && dVar.Y > 0.0f;
        boolean z4 = z2 && dVar.Y > 0.0f;
        if (z && dVar.x(0) && dVar.r == 0 && !z3) {
            aVar.f406a = aVar2;
            if (z2 && dVar.s == 0) {
                aVar.f406a = aVar3;
            }
            z = false;
        }
        if (z2 && dVar.x(1) && dVar.s == 0 && !z4) {
            aVar.f407b = aVar2;
            if (z && dVar.r == 0) {
                aVar.f407b = aVar3;
            }
            z2 = false;
        }
        if (dVar.D()) {
            aVar.f406a = aVar3;
            z = false;
        }
        if (dVar.E()) {
            aVar.f407b = aVar3;
            z2 = false;
        }
        if (z3) {
            if (dVar.t[0] == 4) {
                aVar.f406a = aVar3;
            } else if (!z2) {
                if (aVar.f407b == aVar3) {
                    i3 = aVar.d;
                } else {
                    aVar.f406a = aVar2;
                    ((ConstraintLayout.b) interfaceC0008b).b(dVar, aVar);
                    i3 = aVar.f;
                }
                aVar.f406a = aVar3;
                aVar.f408c = (int) (dVar.Y * i3);
            }
        }
        if (z4) {
            if (dVar.t[1] == 4) {
                aVar.f407b = aVar3;
            } else if (!z) {
                if (aVar.f406a == aVar3) {
                    i2 = aVar.f408c;
                } else {
                    aVar.f407b = aVar2;
                    ((ConstraintLayout.b) interfaceC0008b).b(dVar, aVar);
                    i2 = aVar.e;
                }
                aVar.f407b = aVar3;
                aVar.d = dVar.Z == -1 ? (int) (i2 / dVar.Y) : (int) (dVar.Y * i2);
            }
        }
        ((ConstraintLayout.b) interfaceC0008b).b(dVar, aVar);
        dVar.S(aVar.e);
        dVar.N(aVar.f);
        dVar.E = aVar.h;
        dVar.K(aVar.g);
        aVar.j = 0;
        return aVar.i;
    }

    @Override // a.f.a.i.k, a.f.a.i.d
    public void F() {
        this.x0.u();
        this.y0 = 0;
        this.z0 = 0;
        super.F();
    }

    @Override // a.f.a.i.d
    public void T(boolean z, boolean z2) {
        super.T(z, z2);
        int size = this.r0.size();
        for (int i = 0; i < size; i++) {
            this.r0.get(i).T(z, z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:353:0x05ea, code lost:
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x066d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x081b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x090f  */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    @Override // a.f.a.i.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void V() {
        /*
            Method dump skipped, instructions count: 2335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.i.e.V():void");
    }

    public void W(d dVar, int i) {
        if (i == 0) {
            int i2 = this.A0 + 1;
            b[] bVarArr = this.D0;
            if (i2 >= bVarArr.length) {
                this.D0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.D0;
            int i3 = this.A0;
            bVarArr2[i3] = new b(dVar, 0, this.w0);
            this.A0 = i3 + 1;
        } else if (i != 1) {
        } else {
            int i4 = this.B0 + 1;
            b[] bVarArr3 = this.C0;
            if (i4 >= bVarArr3.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.C0;
            int i5 = this.B0;
            bVarArr4[i5] = new b(dVar, 1, this.w0);
            this.B0 = i5 + 1;
        }
    }

    public boolean X(a.f.a.d dVar) {
        boolean z;
        d.a aVar = d.a.FIXED;
        d.a aVar2 = d.a.WRAP_CONTENT;
        boolean f0 = f0(64);
        d(dVar, f0);
        int size = this.r0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            d dVar2 = this.r0.get(i);
            boolean[] zArr = dVar2.T;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                d dVar3 = this.r0.get(i2);
                if (dVar3 instanceof a) {
                    a aVar3 = (a) dVar3;
                    for (int i3 = 0; i3 < aVar3.s0; i3++) {
                        d dVar4 = aVar3.r0[i3];
                        if (aVar3.u0 || dVar4.e()) {
                            int i4 = aVar3.t0;
                            if (i4 == 0 || i4 == 1) {
                                dVar4.T[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                dVar4.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.L0.clear();
        for (int i5 = 0; i5 < size; i5++) {
            d dVar5 = this.r0.get(i5);
            if (dVar5.c()) {
                if (dVar5 instanceof j) {
                    this.L0.add(dVar5);
                } else {
                    dVar5.d(dVar, f0);
                }
            }
        }
        while (this.L0.size() > 0) {
            int size2 = this.L0.size();
            Iterator<d> it = this.L0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j jVar = (j) it.next();
                HashSet<d> hashSet = this.L0;
                int i6 = 0;
                while (true) {
                    if (i6 >= jVar.s0) {
                        z = false;
                        continue;
                        break;
                    } else if (hashSet.contains(jVar.r0[i6])) {
                        z = true;
                        continue;
                        break;
                    } else {
                        i6++;
                    }
                }
                if (z) {
                    jVar.d(dVar, f0);
                    this.L0.remove(jVar);
                    break;
                }
            }
            if (size2 == this.L0.size()) {
                Iterator<d> it2 = this.L0.iterator();
                while (it2.hasNext()) {
                    it2.next().d(dVar, f0);
                }
                this.L0.clear();
            }
        }
        if (a.f.a.d.p) {
            HashSet<d> hashSet2 = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar6 = this.r0.get(i7);
                if (!dVar6.c()) {
                    hashSet2.add(dVar6);
                }
            }
            b(this, dVar, hashSet2, m() == aVar2 ? 0 : 1, false);
            Iterator<d> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d next = it3.next();
                i.a(this, dVar, next);
                next.d(dVar, f0);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                d dVar7 = this.r0.get(i8);
                if (dVar7 instanceof e) {
                    d.a[] aVarArr = dVar7.U;
                    d.a aVar4 = aVarArr[0];
                    d.a aVar5 = aVarArr[1];
                    if (aVar4 == aVar2) {
                        aVarArr[0] = aVar;
                    }
                    if (aVar5 == aVar2) {
                        aVarArr[1] = aVar;
                    }
                    dVar7.d(dVar, f0);
                    if (aVar4 == aVar2) {
                        dVar7.O(aVar4);
                    }
                    if (aVar5 == aVar2) {
                        dVar7.R(aVar5);
                    }
                } else {
                    i.a(this, dVar, dVar7);
                    if (!dVar7.c()) {
                        dVar7.d(dVar, f0);
                    }
                }
            }
        }
        if (this.A0 > 0) {
            a.b.a.a(this, dVar, null, 0);
        }
        if (this.B0 > 0) {
            a.b.a.a(this, dVar, null, 1);
        }
        return true;
    }

    public void Y(c cVar) {
        WeakReference<c> weakReference = this.K0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.K0.get().c()) {
            this.K0 = new WeakReference<>(cVar);
        }
    }

    public void Z(c cVar) {
        WeakReference<c> weakReference = this.I0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.I0.get().c()) {
            this.I0 = new WeakReference<>(cVar);
        }
    }

    public void a0(c cVar) {
        WeakReference<c> weakReference = this.J0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.J0.get().c()) {
            this.J0 = new WeakReference<>(cVar);
        }
    }

    public void b0(c cVar) {
        WeakReference<c> weakReference = this.H0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.H0.get().c()) {
            this.H0 = new WeakReference<>(cVar);
        }
    }

    public boolean c0(boolean z, int i) {
        a.f.a.i.l.g gVar;
        int i2;
        boolean z2;
        a.f.a.i.l.g gVar2;
        int l;
        a.f.a.i.l.e eVar = this.t0;
        d.a aVar = d.a.MATCH_PARENT;
        d.a aVar2 = d.a.WRAP_CONTENT;
        d.a aVar3 = d.a.FIXED;
        boolean z3 = true;
        boolean z4 = z & true;
        d.a k = eVar.f409a.k(0);
        d.a k2 = eVar.f409a.k(1);
        int v = eVar.f409a.v();
        int w = eVar.f409a.w();
        if (z4 && (k == aVar2 || k2 == aVar2)) {
            Iterator<o> it = eVar.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o next = it.next();
                if (next.f == i && !next.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && k == aVar2) {
                    e eVar2 = eVar.f409a;
                    eVar2.U[0] = aVar3;
                    eVar2.S(eVar.d(eVar2, 0));
                    e eVar3 = eVar.f409a;
                    gVar2 = eVar3.d.e;
                    l = eVar3.u();
                    gVar2.c(l);
                }
            } else if (z4 && k2 == aVar2) {
                e eVar4 = eVar.f409a;
                eVar4.U[1] = aVar3;
                eVar4.N(eVar.d(eVar4, 1));
                e eVar5 = eVar.f409a;
                gVar2 = eVar5.e.e;
                l = eVar5.l();
                gVar2.c(l);
            }
        }
        e eVar6 = eVar.f409a;
        d.a[] aVarArr = eVar6.U;
        if (i == 0) {
            if (aVarArr[0] == aVar3 || aVarArr[0] == aVar) {
                int u = eVar6.u() + v;
                eVar.f409a.d.i.c(u);
                gVar = eVar.f409a.d.e;
                i2 = u - v;
                gVar.c(i2);
                z2 = true;
            }
            z2 = false;
        } else {
            if (aVarArr[1] == aVar3 || aVarArr[1] == aVar) {
                int l2 = eVar6.l() + w;
                eVar.f409a.e.i.c(l2);
                gVar = eVar.f409a.e.e;
                i2 = l2 - w;
                gVar.c(i2);
                z2 = true;
            }
            z2 = false;
        }
        eVar.g();
        Iterator<o> it2 = eVar.e.iterator();
        while (it2.hasNext()) {
            o next2 = it2.next();
            if (next2.f == i && (next2.f428b != eVar.f409a || next2.g)) {
                next2.e();
            }
        }
        Iterator<o> it3 = eVar.e.iterator();
        while (it3.hasNext()) {
            o next3 = it3.next();
            if (next3.f == i && (z2 || next3.f428b != eVar.f409a)) {
                if (!next3.h.j || !next3.i.j || (!(next3 instanceof a.f.a.i.l.c) && !next3.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        eVar.f409a.O(k);
        eVar.f409a.R(k2);
        return z3;
    }

    public void d0() {
        this.t0.f410b = true;
    }

    public boolean f0(int i) {
        return (this.E0 & i) == i;
    }

    public void g0(int i) {
        this.E0 = i;
        a.f.a.d.p = f0(512);
    }

    @Override // a.f.a.i.d
    public void q(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        sb.append("  actualWidth:" + this.W);
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        Iterator<d> it = this.r0.iterator();
        while (it.hasNext()) {
            it.next().q(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
