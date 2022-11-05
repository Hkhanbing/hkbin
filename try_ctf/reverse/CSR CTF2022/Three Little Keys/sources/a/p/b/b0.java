package a.p.b;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final a.e.h<RecyclerView.z, a> f1005a = new a.e.h<>();

    /* renamed from: b  reason: collision with root package name */
    public final a.e.e<RecyclerView.z> f1006b = new a.e.e<>();

    /* loaded from: classes.dex */
    public static class a {
        public static a.h.i.c<a> d = new a.h.i.c<>(20);

        /* renamed from: a  reason: collision with root package name */
        public int f1007a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.i.c f1008b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.i.c f1009c;

        public static a a() {
            a a2 = d.a();
            return a2 == null ? new a() : a2;
        }

        public static void b(a aVar) {
            aVar.f1007a = 0;
            aVar.f1008b = null;
            aVar.f1009c = null;
            d.b(aVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public void a(RecyclerView.z zVar) {
        a orDefault = this.f1005a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f1005a.put(zVar, orDefault);
        }
        orDefault.f1007a |= 1;
    }

    public void b(RecyclerView.z zVar, RecyclerView.i.c cVar) {
        a orDefault = this.f1005a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f1005a.put(zVar, orDefault);
        }
        orDefault.f1009c = cVar;
        orDefault.f1007a |= 8;
    }

    public void c(RecyclerView.z zVar, RecyclerView.i.c cVar) {
        a orDefault = this.f1005a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f1005a.put(zVar, orDefault);
        }
        orDefault.f1008b = cVar;
        orDefault.f1007a |= 4;
    }

    public boolean d(RecyclerView.z zVar) {
        a orDefault = this.f1005a.getOrDefault(zVar, null);
        return (orDefault == null || (orDefault.f1007a & 1) == 0) ? false : true;
    }

    public final RecyclerView.i.c e(RecyclerView.z zVar, int i) {
        a k;
        RecyclerView.i.c cVar;
        int e = this.f1005a.e(zVar);
        if (e >= 0 && (k = this.f1005a.k(e)) != null) {
            int i2 = k.f1007a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                k.f1007a = i3;
                if (i == 4) {
                    cVar = k.f1008b;
                } else if (i != 8) {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                } else {
                    cVar = k.f1009c;
                }
                if ((i3 & 12) == 0) {
                    this.f1005a.i(e);
                    a.b(k);
                }
                return cVar;
            }
        }
        return null;
    }

    public void f(RecyclerView.z zVar) {
        a orDefault = this.f1005a.getOrDefault(zVar, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f1007a &= -2;
    }

    public void g(RecyclerView.z zVar) {
        int g = this.f1006b.g() - 1;
        while (true) {
            if (g < 0) {
                break;
            } else if (zVar == this.f1006b.h(g)) {
                a.e.e<RecyclerView.z> eVar = this.f1006b;
                Object[] objArr = eVar.f340c;
                Object obj = objArr[g];
                Object obj2 = a.e.e.e;
                if (obj != obj2) {
                    objArr[g] = obj2;
                    eVar.f338a = true;
                }
            } else {
                g--;
            }
        }
        a remove = this.f1005a.remove(zVar);
        if (remove != null) {
            a.b(remove);
        }
    }
}
