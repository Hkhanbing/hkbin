package a.p.b;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class k extends y {
    public static TimeInterpolator s;
    public ArrayList<RecyclerView.z> h = new ArrayList<>();
    public ArrayList<RecyclerView.z> i = new ArrayList<>();
    public ArrayList<b> j = new ArrayList<>();
    public ArrayList<a> k = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.z>> l = new ArrayList<>();
    public ArrayList<ArrayList<b>> m = new ArrayList<>();
    public ArrayList<ArrayList<a>> n = new ArrayList<>();
    public ArrayList<RecyclerView.z> o = new ArrayList<>();
    public ArrayList<RecyclerView.z> p = new ArrayList<>();
    public ArrayList<RecyclerView.z> q = new ArrayList<>();
    public ArrayList<RecyclerView.z> r = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.z f1031a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.z f1032b;

        /* renamed from: c  reason: collision with root package name */
        public int f1033c;
        public int d;
        public int e;
        public int f;

        public a(RecyclerView.z zVar, RecyclerView.z zVar2, int i, int i2, int i3, int i4) {
            this.f1031a = zVar;
            this.f1032b = zVar2;
            this.f1033c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        public String toString() {
            StringBuilder f = b.a.a.a.a.f("ChangeInfo{oldHolder=");
            f.append(this.f1031a);
            f.append(", newHolder=");
            f.append(this.f1032b);
            f.append(", fromX=");
            f.append(this.f1033c);
            f.append(", fromY=");
            f.append(this.d);
            f.append(", toX=");
            f.append(this.e);
            f.append(", toY=");
            f.append(this.f);
            f.append('}');
            return f.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.z f1034a;

        /* renamed from: b  reason: collision with root package name */
        public int f1035b;

        /* renamed from: c  reason: collision with root package name */
        public int f1036c;
        public int d;
        public int e;

        public b(RecyclerView.z zVar, int i, int i2, int i3, int i4) {
            this.f1034a = zVar;
            this.f1035b = i;
            this.f1036c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void e(RecyclerView.z zVar) {
        View view = zVar.f1338a;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.j.get(size).f1034a == zVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(zVar);
                this.j.remove(size);
            }
        }
        l(this.k, zVar);
        if (this.h.remove(zVar)) {
            view.setAlpha(1.0f);
            c(zVar);
        }
        if (this.i.remove(zVar)) {
            view.setAlpha(1.0f);
            c(zVar);
        }
        int size2 = this.n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<a> arrayList = this.n.get(size2);
            l(arrayList, zVar);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        int size3 = this.m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<b> arrayList2 = this.m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f1034a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(zVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.l.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.q.remove(zVar);
                this.o.remove(zVar);
                this.r.remove(zVar);
                this.p.remove(zVar);
                k();
                return;
            }
            ArrayList<RecyclerView.z> arrayList3 = this.l.get(size5);
            if (arrayList3.remove(zVar)) {
                view.setAlpha(1.0f);
                c(zVar);
                if (arrayList3.isEmpty()) {
                    this.l.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public void f() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.j.get(size);
            View view = bVar.f1034a.f1338a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f1034a);
            this.j.remove(size);
        }
        int size2 = this.h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.z zVar = this.i.get(size3);
            zVar.f1338a.setAlpha(1.0f);
            c(zVar);
            this.i.remove(size3);
        }
        int size4 = this.k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.k.get(size4);
            RecyclerView.z zVar2 = aVar.f1031a;
            if (zVar2 != null) {
                m(aVar, zVar2);
            }
            RecyclerView.z zVar3 = aVar.f1032b;
            if (zVar3 != null) {
                m(aVar, zVar3);
            }
        }
        this.k.clear();
        if (!g()) {
            return;
        }
        int size5 = this.m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<b> arrayList = this.m.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f1034a.f1338a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(bVar2.f1034a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.m.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.l.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.z> arrayList2 = this.l.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.z zVar4 = arrayList2.get(size8);
                    zVar4.f1338a.setAlpha(1.0f);
                    c(zVar4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.l.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.n.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                j(this.q);
                j(this.p);
                j(this.o);
                j(this.r);
                d();
                return;
            }
            ArrayList<a> arrayList3 = this.n.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    a aVar2 = arrayList3.get(size10);
                    RecyclerView.z zVar5 = aVar2.f1031a;
                    if (zVar5 != null) {
                        m(aVar2, zVar5);
                    }
                    RecyclerView.z zVar6 = aVar2.f1032b;
                    if (zVar6 != null) {
                        m(aVar2, zVar6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean g() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    @Override // a.p.b.y
    public boolean i(RecyclerView.z zVar, int i, int i2, int i3, int i4) {
        View view = zVar.f1338a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) zVar.f1338a.getTranslationY());
        n(zVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(zVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.j.add(new b(zVar, translationX, translationY, i3, i4));
        return true;
    }

    public void j(List<RecyclerView.z> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                list.get(size).f1338a.animate().cancel();
            } else {
                return;
            }
        }
    }

    public void k() {
        if (!g()) {
            d();
        }
    }

    public final void l(List<a> list, RecyclerView.z zVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                a aVar = list.get(size);
                if (m(aVar, zVar) && aVar.f1031a == null && aVar.f1032b == null) {
                    list.remove(aVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean m(a aVar, RecyclerView.z zVar) {
        if (aVar.f1032b == zVar) {
            aVar.f1032b = null;
        } else if (aVar.f1031a != zVar) {
            return false;
        } else {
            aVar.f1031a = null;
        }
        zVar.f1338a.setAlpha(1.0f);
        zVar.f1338a.setTranslationX(0.0f);
        zVar.f1338a.setTranslationY(0.0f);
        c(zVar);
        return true;
    }

    public final void n(RecyclerView.z zVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        zVar.f1338a.animate().setInterpolator(s);
        e(zVar);
    }
}
