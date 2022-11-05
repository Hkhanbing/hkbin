package a.s;

import a.l.b.s0;
import a.s.h;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class d extends s0 {

    /* loaded from: classes.dex */
    public class a extends h.c {
        public a(d dVar, Rect rect) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1089a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1090b;

        public b(d dVar, View view, ArrayList arrayList) {
            this.f1089a = view;
            this.f1090b = arrayList;
        }

        @Override // a.s.h.d
        public void a(h hVar) {
        }

        @Override // a.s.h.d
        public void b(h hVar) {
        }

        @Override // a.s.h.d
        public void c(h hVar) {
            hVar.v(this);
            this.f1089a.setVisibility(8);
            int size = this.f1090b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f1090b.get(i)).setVisibility(0);
            }
        }

        @Override // a.s.h.d
        public void d(h hVar) {
        }

        @Override // a.s.h.d
        public void e(h hVar) {
        }
    }

    /* loaded from: classes.dex */
    public class c extends k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f1091a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1092b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f1093c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1091a = obj;
            this.f1092b = arrayList;
            this.f1093c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // a.s.k, a.s.h.d
        public void a(h hVar) {
            Object obj = this.f1091a;
            if (obj != null) {
                d.this.p(obj, this.f1092b, null);
            }
            Object obj2 = this.f1093c;
            if (obj2 != null) {
                d.this.p(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                d.this.p(obj3, this.f, null);
            }
        }

        @Override // a.s.h.d
        public void c(h hVar) {
            hVar.v(this);
        }
    }

    /* renamed from: a.s.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0032d extends h.c {
        public C0032d(d dVar, Rect rect) {
        }
    }

    public static boolean z(h hVar) {
        return !s0.k(hVar.e) || !s0.k(null) || !s0.k(null);
    }

    @Override // a.l.b.s0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((h) obj).b(view);
        }
    }

    @Override // a.l.b.s0
    public void b(Object obj, ArrayList<View> arrayList) {
        h hVar = (h) obj;
        if (hVar == null) {
            return;
        }
        int i = 0;
        if (hVar instanceof n) {
            n nVar = (n) hVar;
            int size = nVar.x.size();
            while (i < size) {
                b(nVar.I(i), arrayList);
                i++;
            }
        } else if (z(hVar) || !s0.k(hVar.f)) {
        } else {
            int size2 = arrayList.size();
            while (i < size2) {
                hVar.b(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // a.l.b.s0
    public void c(ViewGroup viewGroup, Object obj) {
        l.a(viewGroup, (h) obj);
    }

    @Override // a.l.b.s0
    public boolean e(Object obj) {
        return obj instanceof h;
    }

    @Override // a.l.b.s0
    public Object g(Object obj) {
        if (obj != null) {
            return ((h) obj).clone();
        }
        return null;
    }

    @Override // a.l.b.s0
    public Object l(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        h hVar2 = (h) obj2;
        h hVar3 = (h) obj3;
        if (hVar != null && hVar2 != null) {
            n nVar = new n();
            nVar.H(hVar);
            nVar.H(hVar2);
            nVar.J(1);
            hVar = nVar;
        } else if (hVar == null) {
            hVar = hVar2 != null ? hVar2 : null;
        }
        if (hVar3 != null) {
            n nVar2 = new n();
            if (hVar != null) {
                nVar2.H(hVar);
            }
            nVar2.H(hVar3);
            return nVar2;
        }
        return hVar;
    }

    @Override // a.l.b.s0
    public Object m(Object obj, Object obj2, Object obj3) {
        n nVar = new n();
        if (obj != null) {
            nVar.H((h) obj);
        }
        if (obj2 != null) {
            nVar.H((h) obj2);
        }
        if (obj3 != null) {
            nVar.H((h) obj3);
        }
        return nVar;
    }

    @Override // a.l.b.s0
    public void o(Object obj, View view) {
        if (obj != null) {
            ((h) obj).w(view);
        }
    }

    @Override // a.l.b.s0
    public void p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        h hVar = (h) obj;
        int i = 0;
        if (hVar instanceof n) {
            n nVar = (n) hVar;
            int size = nVar.x.size();
            while (i < size) {
                p(nVar.I(i), arrayList, arrayList2);
                i++;
            }
        } else if (z(hVar)) {
        } else {
            ArrayList<View> arrayList3 = hVar.f;
            if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
                return;
            }
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size2) {
                hVar.b(arrayList2.get(i));
                i++;
            }
            int size3 = arrayList.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    return;
                }
                hVar.w(arrayList.get(size3));
            }
        }
    }

    @Override // a.l.b.s0
    public void q(Object obj, View view, ArrayList<View> arrayList) {
        ((h) obj).a(new b(this, view, arrayList));
    }

    @Override // a.l.b.s0
    public void r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((h) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // a.l.b.s0
    public void s(Object obj, Rect rect) {
        if (obj != null) {
            ((h) obj).A(new C0032d(this, rect));
        }
    }

    @Override // a.l.b.s0
    public void t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            j(view, rect);
            ((h) obj).A(new a(this, rect));
        }
    }

    @Override // a.l.b.s0
    public void w(Object obj, View view, ArrayList<View> arrayList) {
        n nVar = (n) obj;
        ArrayList<View> arrayList2 = nVar.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s0.d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(nVar, arrayList);
    }

    @Override // a.l.b.s0
    public void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.f.clear();
            nVar.f.addAll(arrayList2);
            p(nVar, arrayList, arrayList2);
        }
    }

    @Override // a.l.b.s0
    public Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        n nVar = new n();
        nVar.H((h) obj);
        return nVar;
    }
}
