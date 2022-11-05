package a.f.a.i.l;

import a.f.a.i.c;
import a.f.a.i.d;
import a.f.a.i.l.b;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static b.a f418a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    public static int f419b;

    /* renamed from: c  reason: collision with root package name */
    public static int f420c;

    public static boolean a(a.f.a.i.d dVar) {
        d.a aVar = d.a.MATCH_CONSTRAINT;
        d.a aVar2 = d.a.WRAP_CONTENT;
        d.a aVar3 = d.a.FIXED;
        d.a m = dVar.m();
        d.a t = dVar.t();
        a.f.a.i.d dVar2 = dVar.V;
        a.f.a.i.e eVar = dVar2 != null ? (a.f.a.i.e) dVar2 : null;
        if (eVar != null) {
            eVar.m();
        }
        if (eVar != null) {
            eVar.t();
        }
        boolean z = m == aVar3 || dVar.D() || m == aVar2 || (m == aVar && dVar.r == 0 && dVar.Y == 0.0f && dVar.x(0)) || (m == aVar && dVar.r == 1 && dVar.y(0, dVar.u()));
        boolean z2 = t == aVar3 || dVar.E() || t == aVar2 || (t == aVar && dVar.s == 0 && dVar.Y == 0.0f && dVar.x(1)) || (t == aVar && dVar.s == 1 && dVar.y(1, dVar.l()));
        if (dVar.Y <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    public static void b(int i, a.f.a.i.d dVar, b.InterfaceC0008b interfaceC0008b, boolean z) {
        boolean z2;
        a.f.a.i.c cVar;
        a.f.a.i.c cVar2;
        a.f.a.i.c cVar3;
        a.f.a.i.c cVar4;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        if (dVar.m) {
            return;
        }
        f419b++;
        int i2 = 0;
        if (!(dVar instanceof a.f.a.i.e) && dVar.C() && a(dVar)) {
            a.f.a.i.e.e0(dVar, interfaceC0008b, new b.a(), 0);
        }
        a.f.a.i.c i3 = dVar.i(c.a.LEFT);
        a.f.a.i.c i4 = dVar.i(c.a.RIGHT);
        int c2 = i3.c();
        int c3 = i4.c();
        HashSet<a.f.a.i.c> hashSet = i3.f390a;
        if (hashSet != null && i3.f392c) {
            Iterator<a.f.a.i.c> it = hashSet.iterator();
            while (it.hasNext()) {
                a.f.a.i.c next = it.next();
                a.f.a.i.d dVar2 = next.d;
                int i5 = i + 1;
                boolean a2 = a(dVar2);
                if (dVar2.C() && a2) {
                    a.f.a.i.e.e0(dVar2, interfaceC0008b, new b.a(), i2);
                }
                a.f.a.i.c cVar5 = dVar2.J;
                boolean z3 = (next == cVar5 && (cVar4 = dVar2.L.f) != null && cVar4.f392c) || (next == dVar2.L && (cVar3 = cVar5.f) != null && cVar3.f392c);
                if (dVar2.m() != aVar || a2) {
                    if (!dVar2.C()) {
                        a.f.a.i.c cVar6 = dVar2.J;
                        if (next == cVar6 && dVar2.L.f == null) {
                            int d = cVar6.d() + c2;
                            dVar2.L(d, dVar2.u() + d);
                        } else {
                            a.f.a.i.c cVar7 = dVar2.L;
                            if (next == cVar7 && cVar6.f == null) {
                                int d2 = c2 - cVar7.d();
                                dVar2.L(d2 - dVar2.u(), d2);
                            } else if (z3 && !dVar2.A()) {
                                c(i5, interfaceC0008b, dVar2, z);
                            }
                        }
                        b(i5, dVar2, interfaceC0008b, z);
                    }
                } else if (dVar2.m() == aVar && dVar2.v >= 0 && dVar2.u >= 0 && ((dVar2.i0 == 8 || (dVar2.r == 0 && dVar2.Y == 0.0f)) && !dVar2.A() && !dVar2.G && z3 && !dVar2.A())) {
                    d(i5, dVar, interfaceC0008b, dVar2, z);
                }
                i2 = 0;
            }
        }
        if (dVar instanceof a.f.a.i.f) {
            return;
        }
        HashSet<a.f.a.i.c> hashSet2 = i4.f390a;
        if (hashSet2 != null && i4.f392c) {
            Iterator<a.f.a.i.c> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                a.f.a.i.c next2 = it2.next();
                a.f.a.i.d dVar3 = next2.d;
                int i6 = i + 1;
                boolean a3 = a(dVar3);
                if (!dVar3.C() || !a3) {
                    z2 = false;
                } else {
                    z2 = false;
                    a.f.a.i.e.e0(dVar3, interfaceC0008b, new b.a(), 0);
                }
                a.f.a.i.c cVar8 = dVar3.J;
                boolean z4 = ((next2 != cVar8 || (cVar2 = dVar3.L.f) == null || !cVar2.f392c) && (next2 != dVar3.L || (cVar = cVar8.f) == null || !cVar.f392c)) ? z2 : true;
                if (dVar3.m() != aVar || a3) {
                    if (!dVar3.C()) {
                        a.f.a.i.c cVar9 = dVar3.J;
                        if (next2 == cVar9 && dVar3.L.f == null) {
                            int d3 = cVar9.d() + c3;
                            dVar3.L(d3, dVar3.u() + d3);
                        } else {
                            a.f.a.i.c cVar10 = dVar3.L;
                            if (next2 == cVar10 && cVar9.f == null) {
                                int d4 = c3 - cVar10.d();
                                dVar3.L(d4 - dVar3.u(), d4);
                            } else if (z4 && !dVar3.A()) {
                                c(i6, interfaceC0008b, dVar3, z);
                            }
                        }
                        b(i6, dVar3, interfaceC0008b, z);
                    }
                } else if (dVar3.m() == aVar && dVar3.v >= 0 && dVar3.u >= 0 && (dVar3.i0 == 8 || (dVar3.r == 0 && dVar3.Y == 0.0f))) {
                    if (!dVar3.A() && !dVar3.G && z4 && !dVar3.A()) {
                        d(i6, dVar, interfaceC0008b, dVar3, z);
                    }
                }
            }
        }
        dVar.m = true;
    }

    public static void c(int i, b.InterfaceC0008b interfaceC0008b, a.f.a.i.d dVar, boolean z) {
        float f = dVar.f0;
        int c2 = dVar.J.f.c();
        int c3 = dVar.L.f.c();
        int d = dVar.J.d() + c2;
        int d2 = c3 - dVar.L.d();
        if (c2 == c3) {
            f = 0.5f;
        } else {
            c2 = d;
            c3 = d2;
        }
        int u = dVar.u();
        int i2 = (c3 - c2) - u;
        if (c2 > c3) {
            i2 = (c2 - c3) - u;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + c2;
        int i4 = i3 + u;
        if (c2 > c3) {
            i4 = i3 - u;
        }
        dVar.L(i3, i4);
        b(i + 1, dVar, interfaceC0008b, z);
    }

    public static void d(int i, a.f.a.i.d dVar, b.InterfaceC0008b interfaceC0008b, a.f.a.i.d dVar2, boolean z) {
        float f = dVar2.f0;
        int d = dVar2.J.d() + dVar2.J.f.c();
        int c2 = dVar2.L.f.c() - dVar2.L.d();
        if (c2 >= d) {
            int u = dVar2.u();
            if (dVar2.i0 != 8) {
                int i2 = dVar2.r;
                if (i2 == 2) {
                    if (!(dVar instanceof a.f.a.i.e)) {
                        dVar = dVar.V;
                    }
                    u = (int) (dVar2.f0 * 0.5f * dVar.u());
                } else if (i2 == 0) {
                    u = c2 - d;
                }
                u = Math.max(dVar2.u, u);
                int i3 = dVar2.v;
                if (i3 > 0) {
                    u = Math.min(i3, u);
                }
            }
            int i4 = d + ((int) ((f * ((c2 - d) - u)) + 0.5f));
            dVar2.L(i4, u + i4);
            b(i + 1, dVar2, interfaceC0008b, z);
        }
    }

    public static void e(int i, b.InterfaceC0008b interfaceC0008b, a.f.a.i.d dVar) {
        float f = dVar.g0;
        int c2 = dVar.K.f.c();
        int c3 = dVar.M.f.c();
        int d = dVar.K.d() + c2;
        int d2 = c3 - dVar.M.d();
        if (c2 == c3) {
            f = 0.5f;
        } else {
            c2 = d;
            c3 = d2;
        }
        int l = dVar.l();
        int i2 = (c3 - c2) - l;
        if (c2 > c3) {
            i2 = (c2 - c3) - l;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = c2 + i3;
        int i5 = i4 + l;
        if (c2 > c3) {
            i4 = c2 - i3;
            i5 = i4 - l;
        }
        dVar.M(i4, i5);
        g(i + 1, dVar, interfaceC0008b);
    }

    public static void f(int i, a.f.a.i.d dVar, b.InterfaceC0008b interfaceC0008b, a.f.a.i.d dVar2) {
        float f = dVar2.g0;
        int d = dVar2.K.d() + dVar2.K.f.c();
        int c2 = dVar2.M.f.c() - dVar2.M.d();
        if (c2 >= d) {
            int l = dVar2.l();
            if (dVar2.i0 != 8) {
                int i2 = dVar2.s;
                if (i2 == 2) {
                    if (!(dVar instanceof a.f.a.i.e)) {
                        dVar = dVar.V;
                    }
                    l = (int) (f * 0.5f * dVar.l());
                } else if (i2 == 0) {
                    l = c2 - d;
                }
                l = Math.max(dVar2.x, l);
                int i3 = dVar2.y;
                if (i3 > 0) {
                    l = Math.min(i3, l);
                }
            }
            int i4 = d + ((int) ((f * ((c2 - d) - l)) + 0.5f));
            dVar2.M(i4, l + i4);
            g(i + 1, dVar2, interfaceC0008b);
        }
    }

    public static void g(int i, a.f.a.i.d dVar, b.InterfaceC0008b interfaceC0008b) {
        a.f.a.i.c cVar;
        a.f.a.i.c cVar2;
        a.f.a.i.c cVar3;
        a.f.a.i.c cVar4;
        d.a aVar = d.a.MATCH_CONSTRAINT;
        if (dVar.n) {
            return;
        }
        f420c++;
        if (!(dVar instanceof a.f.a.i.e) && dVar.C() && a(dVar)) {
            a.f.a.i.e.e0(dVar, interfaceC0008b, new b.a(), 0);
        }
        a.f.a.i.c i2 = dVar.i(c.a.TOP);
        a.f.a.i.c i3 = dVar.i(c.a.BOTTOM);
        int c2 = i2.c();
        int c3 = i3.c();
        HashSet<a.f.a.i.c> hashSet = i2.f390a;
        if (hashSet != null && i2.f392c) {
            Iterator<a.f.a.i.c> it = hashSet.iterator();
            while (it.hasNext()) {
                a.f.a.i.c next = it.next();
                a.f.a.i.d dVar2 = next.d;
                int i4 = i + 1;
                boolean a2 = a(dVar2);
                if (dVar2.C() && a2) {
                    a.f.a.i.e.e0(dVar2, interfaceC0008b, new b.a(), 0);
                }
                a.f.a.i.c cVar5 = dVar2.K;
                boolean z = (next == cVar5 && (cVar4 = dVar2.M.f) != null && cVar4.f392c) || (next == dVar2.M && (cVar3 = cVar5.f) != null && cVar3.f392c);
                if (dVar2.t() != aVar || a2) {
                    if (!dVar2.C()) {
                        a.f.a.i.c cVar6 = dVar2.K;
                        if (next == cVar6 && dVar2.M.f == null) {
                            int d = cVar6.d() + c2;
                            dVar2.M(d, dVar2.l() + d);
                        } else {
                            a.f.a.i.c cVar7 = dVar2.M;
                            if (next == cVar7 && cVar6.f == null) {
                                int d2 = c2 - cVar7.d();
                                dVar2.M(d2 - dVar2.l(), d2);
                            } else if (z && !dVar2.B()) {
                                e(i4, interfaceC0008b, dVar2);
                            }
                        }
                        g(i4, dVar2, interfaceC0008b);
                    }
                } else if (dVar2.t() == aVar && dVar2.y >= 0 && dVar2.x >= 0 && ((dVar2.i0 == 8 || (dVar2.s == 0 && dVar2.Y == 0.0f)) && !dVar2.B() && !dVar2.G && z && !dVar2.B())) {
                    f(i4, dVar, interfaceC0008b, dVar2);
                }
            }
        }
        if (dVar instanceof a.f.a.i.f) {
            return;
        }
        HashSet<a.f.a.i.c> hashSet2 = i3.f390a;
        if (hashSet2 != null && i3.f392c) {
            Iterator<a.f.a.i.c> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                a.f.a.i.c next2 = it2.next();
                a.f.a.i.d dVar3 = next2.d;
                int i5 = i + 1;
                boolean a3 = a(dVar3);
                if (dVar3.C() && a3) {
                    a.f.a.i.e.e0(dVar3, interfaceC0008b, new b.a(), 0);
                }
                a.f.a.i.c cVar8 = dVar3.K;
                boolean z2 = (next2 == cVar8 && (cVar2 = dVar3.M.f) != null && cVar2.f392c) || (next2 == dVar3.M && (cVar = cVar8.f) != null && cVar.f392c);
                if (dVar3.t() != aVar || a3) {
                    if (!dVar3.C()) {
                        a.f.a.i.c cVar9 = dVar3.K;
                        if (next2 == cVar9 && dVar3.M.f == null) {
                            int d3 = cVar9.d() + c3;
                            dVar3.M(d3, dVar3.l() + d3);
                        } else {
                            a.f.a.i.c cVar10 = dVar3.M;
                            if (next2 == cVar10 && cVar9.f == null) {
                                int d4 = c3 - cVar10.d();
                                dVar3.M(d4 - dVar3.l(), d4);
                            } else if (z2 && !dVar3.B()) {
                                e(i5, interfaceC0008b, dVar3);
                            }
                        }
                        g(i5, dVar3, interfaceC0008b);
                    }
                } else if (dVar3.t() == aVar && dVar3.y >= 0 && dVar3.x >= 0 && (dVar3.i0 == 8 || (dVar3.s == 0 && dVar3.Y == 0.0f))) {
                    if (!dVar3.B() && !dVar3.G && z2 && !dVar3.B()) {
                        f(i5, dVar, interfaceC0008b, dVar3);
                    }
                }
            }
        }
        a.f.a.i.c i6 = dVar.i(c.a.BASELINE);
        if (i6.f390a != null && i6.f392c) {
            int c4 = i6.c();
            Iterator<a.f.a.i.c> it3 = i6.f390a.iterator();
            while (it3.hasNext()) {
                a.f.a.i.c next3 = it3.next();
                a.f.a.i.d dVar4 = next3.d;
                int i7 = i + 1;
                boolean a4 = a(dVar4);
                if (dVar4.C() && a4) {
                    a.f.a.i.e.e0(dVar4, interfaceC0008b, new b.a(), 0);
                }
                if (dVar4.t() != aVar || a4) {
                    if (!dVar4.C() && next3 == dVar4.N) {
                        int d5 = next3.d() + c4;
                        if (dVar4.E) {
                            int i8 = d5 - dVar4.c0;
                            int i9 = dVar4.X + i8;
                            dVar4.b0 = i8;
                            dVar4.K.j(i8);
                            dVar4.M.j(i9);
                            a.f.a.i.c cVar11 = dVar4.N;
                            cVar11.f391b = d5;
                            cVar11.f392c = true;
                            dVar4.l = true;
                        }
                        g(i7, dVar4, interfaceC0008b);
                    }
                }
            }
        }
        dVar.n = true;
    }
}
