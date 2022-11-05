package a.f.a.i.l;

import a.f.a.i.d;
import a.f.a.i.l.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public a.f.a.i.e f409a;
    public a.f.a.i.e d;
    public b.InterfaceC0008b f;
    public b.a g;
    public ArrayList<l> h;

    /* renamed from: b  reason: collision with root package name */
    public boolean f410b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f411c = true;
    public ArrayList<o> e = new ArrayList<>();

    public e(a.f.a.i.e eVar) {
        new ArrayList();
        this.f = null;
        this.g = new b.a();
        this.h = new ArrayList<>();
        this.f409a = eVar;
        this.d = eVar;
    }

    public final void a(f fVar, int i, int i2, f fVar2, ArrayList<l> arrayList, l lVar) {
        o oVar = fVar.d;
        if (oVar.f429c == null) {
            a.f.a.i.e eVar = this.f409a;
            if (oVar == eVar.d || oVar == eVar.e) {
                return;
            }
            if (lVar == null) {
                lVar = new l(oVar, i2);
                arrayList.add(lVar);
            }
            oVar.f429c = lVar;
            lVar.f423b.add(oVar);
            for (d dVar : oVar.h.k) {
                if (dVar instanceof f) {
                    a((f) dVar, i, 0, fVar2, arrayList, lVar);
                }
            }
            for (d dVar2 : oVar.i.k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i, 1, fVar2, arrayList, lVar);
                }
            }
            if (i == 1 && (oVar instanceof m)) {
                for (d dVar3 : ((m) oVar).k.k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i, 2, fVar2, arrayList, lVar);
                    }
                }
            }
            for (f fVar3 : oVar.h.l) {
                a(fVar3, i, 0, fVar2, arrayList, lVar);
            }
            for (f fVar4 : oVar.i.l) {
                a(fVar4, i, 1, fVar2, arrayList, lVar);
            }
            if (i != 1 || !(oVar instanceof m)) {
                return;
            }
            for (f fVar5 : ((m) oVar).k.l) {
                a(fVar5, i, 2, fVar2, arrayList, lVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
        if (r15.s == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(a.f.a.i.e r20) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.i.l.e.b(a.f.a.i.e):boolean");
    }

    public void c() {
        o iVar;
        ArrayList<o> arrayList = this.e;
        arrayList.clear();
        this.d.d.f();
        this.d.e.f();
        arrayList.add(this.d.d);
        arrayList.add(this.d.e);
        Iterator<a.f.a.i.d> it = this.d.r0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            a.f.a.i.d next = it.next();
            if (next instanceof a.f.a.i.f) {
                iVar = new i(next);
            } else {
                if (next.A()) {
                    if (next.f397b == null) {
                        next.f397b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f397b);
                } else {
                    arrayList.add(next.d);
                }
                if (next.B()) {
                    if (next.f398c == null) {
                        next.f398c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f398c);
                } else {
                    arrayList.add(next.e);
                }
                if (next instanceof a.f.a.i.h) {
                    iVar = new j(next);
                }
            }
            arrayList.add(iVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<o> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<o> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o next2 = it3.next();
            if (next2.f428b != this.d) {
                next2.d();
            }
        }
        this.h.clear();
        l.f421c = 0;
        e(this.f409a.d, 0, this.h);
        e(this.f409a.e, 1, this.h);
        this.f410b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(a.f.a.i.e r17, int r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.i.l.e.d(a.f.a.i.e, int):int");
    }

    public final void e(o oVar, int i, ArrayList<l> arrayList) {
        for (d dVar : oVar.h.k) {
            if (dVar instanceof f) {
                a((f) dVar, i, 0, oVar.i, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).h, i, 0, oVar.i, arrayList, null);
            }
        }
        for (d dVar2 : oVar.i.k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i, 1, oVar.h, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).i, i, 1, oVar.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (d dVar3 : ((m) oVar).k.k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void f(a.f.a.i.d dVar, d.a aVar, int i, d.a aVar2, int i2) {
        b.a aVar3 = this.g;
        aVar3.f406a = aVar;
        aVar3.f407b = aVar2;
        aVar3.f408c = i;
        aVar3.d = i2;
        ((ConstraintLayout.b) this.f).b(dVar, aVar3);
        dVar.S(this.g.e);
        dVar.N(this.g.f);
        b.a aVar4 = this.g;
        dVar.E = aVar4.h;
        dVar.K(aVar4.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
        if (r12 == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
        r0.m = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
        r0.c(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r10 == r7) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            r14 = this;
            a.f.a.i.d$a r6 = a.f.a.i.d.a.FIXED
            a.f.a.i.d$a r7 = a.f.a.i.d.a.MATCH_CONSTRAINT
            a.f.a.i.e r0 = r14.f409a
            java.util.ArrayList<a.f.a.i.d> r0 = r0.r0
            java.util.Iterator r8 = r0.iterator()
        Lc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r0 = r8.next()
            r9 = r0
            a.f.a.i.d r9 = (a.f.a.i.d) r9
            boolean r0 = r9.f396a
            if (r0 == 0) goto L1e
            goto Lc
        L1e:
            a.f.a.i.d$a[] r0 = r9.U
            r1 = 0
            r10 = r0[r1]
            r11 = 1
            r12 = r0[r11]
            int r0 = r9.r
            int r2 = r9.s
            a.f.a.i.d$a r4 = a.f.a.i.d.a.WRAP_CONTENT
            if (r10 == r4) goto L35
            if (r10 != r7) goto L33
            if (r0 != r11) goto L33
            goto L35
        L33:
            r0 = r1
            goto L36
        L35:
            r0 = r11
        L36:
            if (r12 == r4) goto L3c
            if (r12 != r7) goto L3d
            if (r2 != r11) goto L3d
        L3c:
            r1 = r11
        L3d:
            a.f.a.i.l.k r2 = r9.d
            a.f.a.i.l.g r2 = r2.e
            boolean r3 = r2.j
            a.f.a.i.l.m r5 = r9.e
            a.f.a.i.l.g r5 = r5.e
            boolean r13 = r5.j
            if (r3 == 0) goto L5b
            if (r13 == 0) goto L5b
            int r3 = r2.g
            int r5 = r5.g
            r0 = r14
            r1 = r9
            r2 = r6
            r4 = r6
            r0.f(r1, r2, r3, r4, r5)
        L58:
            r9.f396a = r11
            goto L94
        L5b:
            if (r3 == 0) goto L7a
            if (r1 == 0) goto L7a
            int r3 = r2.g
            int r5 = r5.g
            r0 = r14
            r1 = r9
            r2 = r6
            r0.f(r1, r2, r3, r4, r5)
            a.f.a.i.l.m r0 = r9.e
            a.f.a.i.l.g r0 = r0.e
            int r1 = r9.l()
            if (r12 != r7) goto L76
        L73:
            r0.m = r1
            goto L94
        L76:
            r0.c(r1)
            goto L58
        L7a:
            if (r13 == 0) goto L94
            if (r0 == 0) goto L94
            int r3 = r2.g
            int r5 = r5.g
            r0 = r14
            r1 = r9
            r2 = r4
            r4 = r6
            r0.f(r1, r2, r3, r4, r5)
            a.f.a.i.l.k r0 = r9.d
            a.f.a.i.l.g r0 = r0.e
            int r1 = r9.u()
            if (r10 != r7) goto L76
            goto L73
        L94:
            boolean r0 = r9.f396a
            if (r0 == 0) goto Lc
            a.f.a.i.l.m r0 = r9.e
            a.f.a.i.l.g r0 = r0.l
            if (r0 == 0) goto Lc
            int r1 = r9.c0
            r0.c(r1)
            goto Lc
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.i.l.e.g():void");
    }
}
