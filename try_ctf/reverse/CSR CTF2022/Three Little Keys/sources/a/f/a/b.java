package a.f.a;

import a.f.a.d;
import a.f.a.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements d.a {
    public a d;

    /* renamed from: a  reason: collision with root package name */
    public g f365a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f366b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<g> f367c = new ArrayList<>();
    public boolean e = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(int i);

        float b(g gVar);

        float c(g gVar, boolean z);

        void clear();

        g d(int i);

        void e(g gVar, float f, boolean z);

        boolean f(g gVar);

        void g(float f);

        float h(b bVar, boolean z);

        void i();

        void j(g gVar, float f);

        int k();
    }

    public b() {
    }

    public b(c cVar) {
        this.d = new a.f.a.a(this, cVar);
    }

    @Override // a.f.a.d.a
    public g a(d dVar, boolean[] zArr) {
        return i(zArr, null);
    }

    @Override // a.f.a.d.a
    public void b(g gVar) {
        float f;
        int i = gVar.d;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
            this.d.j(gVar, f);
        }
        f = 1.0f;
        this.d.j(gVar, f);
    }

    public b c(d dVar, int i) {
        this.d.j(dVar.k(i, "ep"), 1.0f);
        this.d.j(dVar.k(i, "em"), -1.0f);
        return this;
    }

    @Override // a.f.a.d.a
    public void clear() {
        this.d.clear();
        this.f365a = null;
        this.f366b = 0.0f;
    }

    public b d(g gVar, g gVar2, g gVar3, g gVar4, float f) {
        this.d.j(gVar, -1.0f);
        this.d.j(gVar2, 1.0f);
        this.d.j(gVar3, f);
        this.d.j(gVar4, -f);
        return this;
    }

    public b e(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f366b = i;
        }
        if (!z) {
            this.d.j(gVar, -1.0f);
            this.d.j(gVar2, 1.0f);
            this.d.j(gVar3, 1.0f);
        } else {
            this.d.j(gVar, 1.0f);
            this.d.j(gVar2, -1.0f);
            this.d.j(gVar3, -1.0f);
        }
        return this;
    }

    public b f(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f366b = i;
        }
        if (!z) {
            this.d.j(gVar, -1.0f);
            this.d.j(gVar2, 1.0f);
            this.d.j(gVar3, -1.0f);
        } else {
            this.d.j(gVar, 1.0f);
            this.d.j(gVar2, -1.0f);
            this.d.j(gVar3, 1.0f);
        }
        return this;
    }

    public b g(g gVar, g gVar2, g gVar3, g gVar4, float f) {
        this.d.j(gVar3, 0.5f);
        this.d.j(gVar4, 0.5f);
        this.d.j(gVar, -0.5f);
        this.d.j(gVar2, -0.5f);
        this.f366b = -f;
        return this;
    }

    public final boolean h(g gVar) {
        return gVar.l <= 1;
    }

    public final g i(boolean[] zArr, g gVar) {
        g.a aVar;
        int k = this.d.k();
        g gVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < k; i++) {
            float a2 = this.d.a(i);
            if (a2 < 0.0f) {
                g d = this.d.d(i);
                if ((zArr == null || !zArr[d.f379b]) && d != gVar && (((aVar = d.i) == g.a.SLACK || aVar == g.a.ERROR) && a2 < f)) {
                    f = a2;
                    gVar2 = d;
                }
            }
        }
        return gVar2;
    }

    @Override // a.f.a.d.a
    public boolean isEmpty() {
        return this.f365a == null && this.f366b == 0.0f && this.d.k() == 0;
    }

    public void j(g gVar) {
        g gVar2 = this.f365a;
        if (gVar2 != null) {
            this.d.j(gVar2, -1.0f);
            this.f365a.f380c = -1;
            this.f365a = null;
        }
        float c2 = this.d.c(gVar, true) * (-1.0f);
        this.f365a = gVar;
        if (c2 == 1.0f) {
            return;
        }
        this.f366b /= c2;
        this.d.g(c2);
    }

    public void k(d dVar, g gVar, boolean z) {
        if (!gVar.f) {
            return;
        }
        float b2 = this.d.b(gVar);
        this.f366b = (gVar.e * b2) + this.f366b;
        this.d.c(gVar, z);
        if (z) {
            gVar.b(this);
        }
        if (this.d.k() != 0) {
            return;
        }
        this.e = true;
        dVar.f371a = true;
    }

    public void l(d dVar, b bVar, boolean z) {
        float h = this.d.h(bVar, z);
        this.f366b = (bVar.f366b * h) + this.f366b;
        if (z) {
            bVar.f365a.b(this);
        }
        if (this.f365a == null || this.d.k() != 0) {
            return;
        }
        this.e = true;
        dVar.f371a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            a.f.a.g r0 = r10.f365a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = b.a.a.a.a.f(r0)
            a.f.a.g r1 = r10.f365a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = b.a.a.a.a.d(r0, r1)
            float r1 = r10.f366b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L34
            java.lang.StringBuilder r0 = b.a.a.a.a.f(r0)
            float r1 = r10.f366b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L35
        L34:
            r1 = r3
        L35:
            a.f.a.b$a r5 = r10.d
            int r5 = r5.k()
        L3b:
            if (r3 >= r5) goto La5
            a.f.a.b$a r6 = r10.d
            a.f.a.g r6 = r6.d(r3)
            if (r6 != 0) goto L46
            goto La2
        L46:
            a.f.a.b$a r7 = r10.d
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L51
            goto La2
        L51:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L64
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7e
            java.lang.StringBuilder r0 = b.a.a.a.a.f(r0)
            java.lang.String r1 = "- "
            goto L76
        L64:
            java.lang.StringBuilder r0 = b.a.a.a.a.f(r0)
            if (r8 <= 0) goto L74
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L7e
        L74:
            java.lang.String r1 = " - "
        L76:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r7 = r7 * r9
        L7e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L97
        L8a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L97:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        La2:
            int r3 = r3 + 1
            goto L3b
        La5:
            if (r1 != 0) goto Lad
            java.lang.String r1 = "0.0"
            java.lang.String r0 = b.a.a.a.a.d(r0, r1)
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.b.toString():java.lang.String");
    }
}
