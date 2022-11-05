package a.f.a.i.l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class n {
    public static int f;

    /* renamed from: b  reason: collision with root package name */
    public int f425b;

    /* renamed from: c  reason: collision with root package name */
    public int f426c;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a.f.a.i.d> f424a = new ArrayList<>();
    public ArrayList<a> d = null;
    public int e = -1;

    /* loaded from: classes.dex */
    public class a {
        public a(n nVar, a.f.a.i.d dVar, a.f.a.d dVar2, int i) {
            new WeakReference(dVar);
            dVar2.o(dVar.J);
            dVar2.o(dVar.K);
            dVar2.o(dVar.L);
            dVar2.o(dVar.M);
            dVar2.o(dVar.N);
        }
    }

    public n(int i) {
        this.f425b = -1;
        this.f426c = 0;
        int i2 = f;
        f = i2 + 1;
        this.f425b = i2;
        this.f426c = i;
    }

    public boolean a(a.f.a.i.d dVar) {
        if (this.f424a.contains(dVar)) {
            return false;
        }
        this.f424a.add(dVar);
        return true;
    }

    public void b(ArrayList<n> arrayList) {
        int size = this.f424a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                n nVar = arrayList.get(i);
                if (this.e == nVar.f425b) {
                    d(this.f426c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c(a.f.a.d dVar, int i) {
        int o;
        a.f.a.i.c cVar;
        if (this.f424a.size() == 0) {
            return 0;
        }
        ArrayList<a.f.a.i.d> arrayList = this.f424a;
        a.f.a.i.e eVar = (a.f.a.i.e) arrayList.get(0).V;
        dVar.u();
        eVar.d(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).d(dVar, false);
        }
        if (i == 0 && eVar.A0 > 0) {
            a.b.a.a(eVar, dVar, arrayList, 0);
        }
        if (i == 1 && eVar.B0 > 0) {
            a.b.a.a(eVar, dVar, arrayList, 1);
        }
        try {
            dVar.q();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.d.add(new a(this, arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            o = dVar.o(eVar.J);
            cVar = eVar.L;
        } else {
            o = dVar.o(eVar.K);
            cVar = eVar.M;
        }
        int o2 = dVar.o(cVar);
        dVar.u();
        return o2 - o;
    }

    public void d(int i, n nVar) {
        Iterator<a.f.a.i.d> it = this.f424a.iterator();
        while (it.hasNext()) {
            a.f.a.i.d next = it.next();
            nVar.a(next);
            if (i == 0) {
                next.p0 = nVar.f425b;
            } else {
                next.q0 = nVar.f425b;
            }
        }
        this.e = nVar.f425b;
    }

    public String toString() {
        Iterator<a.f.a.i.d> it;
        StringBuilder sb = new StringBuilder();
        int i = this.f426c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f425b);
        sb.append("] <");
        String sb2 = sb.toString();
        while (this.f424a.iterator().hasNext()) {
            sb2 = sb2 + " " + it.next().j0;
        }
        return b.a.a.a.a.d(sb2, " >");
    }
}
