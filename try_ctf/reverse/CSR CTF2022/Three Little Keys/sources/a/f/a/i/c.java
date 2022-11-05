package a.f.a.i;

import a.f.a.g;
import a.f.a.i.l.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public int f391b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f392c;
    public final d d;
    public final a e;
    public c f;
    public a.f.a.g i;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<c> f390a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, a aVar) {
        this.d = dVar;
        this.e = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r8.d.E == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r5 != r12) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r5 != r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
        if (r5 != r12) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0074, code lost:
        if (r5 != r2) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(a.f.a.i.c r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = 1
            if (r9 != 0) goto L7
            r8.h()
            return r0
        L7:
            if (r12 != 0) goto L7a
            a.f.a.i.c$a r12 = a.f.a.i.c.a.CENTER_Y
            a.f.a.i.c$a r1 = a.f.a.i.c.a.RIGHT
            a.f.a.i.c$a r2 = a.f.a.i.c.a.CENTER_X
            a.f.a.i.c$a r3 = a.f.a.i.c.a.LEFT
            a.f.a.i.c$a r4 = a.f.a.i.c.a.BASELINE
            a.f.a.i.c$a r5 = r9.e
            a.f.a.i.c$a r6 = r8.e
            r7 = 0
            if (r5 != r6) goto L29
            if (r6 != r4) goto L42
            a.f.a.i.d r12 = r9.d
            boolean r12 = r12.E
            if (r12 == 0) goto L44
            a.f.a.i.d r12 = r8.d
            boolean r12 = r12.E
            if (r12 != 0) goto L42
            goto L44
        L29:
            int r6 = r6.ordinal()
            switch(r6) {
                case 0: goto L44;
                case 1: goto L64;
                case 2: goto L4b;
                case 3: goto L64;
                case 4: goto L4b;
                case 5: goto L46;
                case 6: goto L3c;
                case 7: goto L44;
                case 8: goto L44;
                default: goto L30;
            }
        L30:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            a.f.a.i.c$a r10 = r8.e
            java.lang.String r10 = r10.name()
            r9.<init>(r10)
            throw r9
        L3c:
            if (r5 == r4) goto L44
            if (r5 == r2) goto L44
            if (r5 == r12) goto L44
        L42:
            r12 = r0
            goto L77
        L44:
            r12 = r7
            goto L77
        L46:
            if (r5 == r3) goto L44
            if (r5 != r1) goto L42
            goto L44
        L4b:
            a.f.a.i.c$a r1 = a.f.a.i.c.a.TOP
            if (r5 == r1) goto L56
            a.f.a.i.c$a r1 = a.f.a.i.c.a.BOTTOM
            if (r5 != r1) goto L54
            goto L56
        L54:
            r1 = r7
            goto L57
        L56:
            r1 = r0
        L57:
            a.f.a.i.d r2 = r9.d
            boolean r2 = r2 instanceof a.f.a.i.f
            if (r2 == 0) goto L62
            if (r1 != 0) goto L42
            if (r5 != r12) goto L44
            goto L42
        L62:
            r12 = r1
            goto L77
        L64:
            if (r5 == r3) goto L6b
            if (r5 != r1) goto L69
            goto L6b
        L69:
            r12 = r7
            goto L6c
        L6b:
            r12 = r0
        L6c:
            a.f.a.i.d r1 = r9.d
            boolean r1 = r1 instanceof a.f.a.i.f
            if (r1 == 0) goto L77
            if (r12 != 0) goto L42
            if (r5 != r2) goto L44
            goto L42
        L77:
            if (r12 != 0) goto L7a
            return r7
        L7a:
            r8.f = r9
            java.util.HashSet<a.f.a.i.c> r12 = r9.f390a
            if (r12 != 0) goto L87
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r9.f390a = r12
        L87:
            a.f.a.i.c r9 = r8.f
            java.util.HashSet<a.f.a.i.c> r9 = r9.f390a
            if (r9 == 0) goto L90
            r9.add(r8)
        L90:
            r8.g = r10
            r8.h = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.i.c.a(a.f.a.i.c, int, int, boolean):boolean");
    }

    public void b(int i, ArrayList<n> arrayList, n nVar) {
        HashSet<c> hashSet = this.f390a;
        if (hashSet != null) {
            Iterator<c> it = hashSet.iterator();
            while (it.hasNext()) {
                a.b.a.b(it.next().d, i, arrayList, nVar);
            }
        }
    }

    public int c() {
        if (!this.f392c) {
            return 0;
        }
        return this.f391b;
    }

    public int d() {
        c cVar;
        if (this.d.i0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (cVar = this.f) == null || cVar.d.i0 != 8) ? this.g : i;
    }

    public boolean e() {
        c cVar;
        HashSet<c> hashSet = this.f390a;
        if (hashSet == null) {
            return false;
        }
        Iterator<c> it = hashSet.iterator();
        while (it.hasNext()) {
            c next = it.next();
            switch (next.e.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    cVar = null;
                    break;
                case 1:
                    cVar = next.d.L;
                    break;
                case 2:
                    cVar = next.d.M;
                    break;
                case 3:
                    cVar = next.d.J;
                    break;
                case 4:
                    cVar = next.d.K;
                    break;
                default:
                    throw new AssertionError(next.e.name());
            }
            if (cVar.g()) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        HashSet<c> hashSet = this.f390a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean g() {
        return this.f != null;
    }

    public void h() {
        HashSet<c> hashSet;
        c cVar = this.f;
        if (cVar != null && (hashSet = cVar.f390a) != null) {
            hashSet.remove(this);
            if (this.f.f390a.size() == 0) {
                this.f.f390a = null;
            }
        }
        this.f390a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.f392c = false;
        this.f391b = 0;
    }

    public void i() {
        a.f.a.g gVar = this.i;
        if (gVar == null) {
            this.i = new a.f.a.g(g.a.UNRESTRICTED);
        } else {
            gVar.c();
        }
    }

    public void j(int i) {
        this.f391b = i;
        this.f392c = true;
    }

    public String toString() {
        return this.d.j0 + ":" + this.e.toString();
    }
}
