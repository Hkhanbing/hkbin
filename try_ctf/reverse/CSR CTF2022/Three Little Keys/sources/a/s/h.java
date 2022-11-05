package a.s;

import a.h.j.w;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class h implements Cloneable {
    public static final int[] u = {2, 1, 3, 4};
    public static final e v = new a();
    public static ThreadLocal<a.e.a<Animator, b>> w = new ThreadLocal<>();
    public ArrayList<o> k;
    public ArrayList<o> l;
    public c s;

    /* renamed from: a  reason: collision with root package name */
    public String f1094a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    public long f1095b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f1096c = -1;
    public TimeInterpolator d = null;
    public ArrayList<Integer> e = new ArrayList<>();
    public ArrayList<View> f = new ArrayList<>();
    public p g = new p();
    public p h = new p();
    public n i = null;
    public int[] j = u;
    public ArrayList<Animator> m = new ArrayList<>();
    public int n = 0;
    public boolean o = false;
    public boolean p = false;
    public ArrayList<d> q = null;
    public ArrayList<Animator> r = new ArrayList<>();
    public e t = v;

    /* loaded from: classes.dex */
    public static class a extends e {
        @Override // a.s.e
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f1097a;

        /* renamed from: b  reason: collision with root package name */
        public String f1098b;

        /* renamed from: c  reason: collision with root package name */
        public o f1099c;
        public b0 d;
        public h e;

        public b(View view, String str, h hVar, b0 b0Var, o oVar) {
            this.f1097a = view;
            this.f1098b = str;
            this.f1099c = oVar;
            this.d = b0Var;
            this.e = hVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(h hVar);

        void b(h hVar);

        void c(h hVar);

        void d(h hVar);

        void e(h hVar);
    }

    public static void c(p pVar, View view, o oVar) {
        pVar.f1115a.put(view, oVar);
        int id = view.getId();
        if (id >= 0) {
            if (pVar.f1116b.indexOfKey(id) >= 0) {
                pVar.f1116b.put(id, null);
            } else {
                pVar.f1116b.put(id, view);
            }
        }
        AtomicInteger atomicInteger = a.h.j.w.f667a;
        String k = w.i.k(view);
        if (k != null) {
            if (pVar.d.e(k) >= 0) {
                pVar.d.put(k, null);
            } else {
                pVar.d.put(k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (!listView.getAdapter().hasStableIds()) {
                return;
            }
            long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
            a.e.e<View> eVar = pVar.f1117c;
            if (eVar.f338a) {
                eVar.c();
            }
            if (a.e.d.b(eVar.f339b, eVar.d, itemIdAtPosition) >= 0) {
                View d2 = pVar.f1117c.d(itemIdAtPosition);
                if (d2 == null) {
                    return;
                }
                w.d.r(d2, false);
                pVar.f1117c.f(itemIdAtPosition, null);
                return;
            }
            w.d.r(view, true);
            pVar.f1117c.f(itemIdAtPosition, view);
        }
    }

    public static a.e.a<Animator, b> o() {
        a.e.a<Animator, b> aVar = w.get();
        if (aVar == null) {
            a.e.a<Animator, b> aVar2 = new a.e.a<>();
            w.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static boolean t(o oVar, o oVar2, String str) {
        Object obj = oVar.f1112a.get(str);
        Object obj2 = oVar2.f1112a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return true ^ obj.equals(obj2);
        }
        return true;
    }

    public void A(c cVar) {
        this.s = cVar;
    }

    public h B(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
        return this;
    }

    public void C(e eVar) {
        if (eVar == null) {
            eVar = v;
        }
        this.t = eVar;
    }

    public void D(m mVar) {
    }

    public h E(long j) {
        this.f1095b = j;
        return this;
    }

    public void F() {
        if (this.n == 0) {
            ArrayList<d> arrayList = this.q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.q.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((d) arrayList2.get(i)).a(this);
                }
            }
            this.p = false;
        }
        this.n++;
    }

    public String G(String str) {
        StringBuilder f = b.a.a.a.a.f(str);
        f.append(getClass().getSimpleName());
        f.append("@");
        f.append(Integer.toHexString(hashCode()));
        f.append(": ");
        String sb = f.toString();
        if (this.f1096c != -1) {
            sb = sb + "dur(" + this.f1096c + ") ";
        }
        if (this.f1095b != -1) {
            sb = sb + "dly(" + this.f1095b + ") ";
        }
        if (this.d != null) {
            sb = sb + "interp(" + this.d + ") ";
        }
        if (this.e.size() > 0 || this.f.size() > 0) {
            String d2 = b.a.a.a.a.d(sb, "tgts(");
            if (this.e.size() > 0) {
                for (int i = 0; i < this.e.size(); i++) {
                    if (i > 0) {
                        d2 = b.a.a.a.a.d(d2, ", ");
                    }
                    StringBuilder f2 = b.a.a.a.a.f(d2);
                    f2.append(this.e.get(i));
                    d2 = f2.toString();
                }
            }
            if (this.f.size() > 0) {
                for (int i2 = 0; i2 < this.f.size(); i2++) {
                    if (i2 > 0) {
                        d2 = b.a.a.a.a.d(d2, ", ");
                    }
                    StringBuilder f3 = b.a.a.a.a.f(d2);
                    f3.append(this.f.get(i2));
                    d2 = f3.toString();
                }
            }
            return b.a.a.a.a.d(d2, ")");
        }
        return sb;
    }

    public h a(d dVar) {
        if (this.q == null) {
            this.q = new ArrayList<>();
        }
        this.q.add(dVar);
        return this;
    }

    public h b(View view) {
        this.f.add(view);
        return this;
    }

    public abstract void d(o oVar);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            o oVar = new o(view);
            if (z) {
                g(oVar);
            } else {
                d(oVar);
            }
            oVar.f1114c.add(this);
            f(oVar);
            c(z ? this.g : this.h, view, oVar);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            e(viewGroup.getChildAt(i), z);
        }
    }

    public void f(o oVar) {
    }

    public abstract void g(o oVar);

    public void h(ViewGroup viewGroup, boolean z) {
        i(z);
        if (this.e.size() <= 0 && this.f.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < this.e.size(); i++) {
            View findViewById = viewGroup.findViewById(this.e.get(i).intValue());
            if (findViewById != null) {
                o oVar = new o(findViewById);
                if (z) {
                    g(oVar);
                } else {
                    d(oVar);
                }
                oVar.f1114c.add(this);
                f(oVar);
                c(z ? this.g : this.h, findViewById, oVar);
            }
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            View view = this.f.get(i2);
            o oVar2 = new o(view);
            if (z) {
                g(oVar2);
            } else {
                d(oVar2);
            }
            oVar2.f1114c.add(this);
            f(oVar2);
            c(z ? this.g : this.h, view, oVar2);
        }
    }

    public void i(boolean z) {
        p pVar;
        if (z) {
            this.g.f1115a.clear();
            this.g.f1116b.clear();
            pVar = this.g;
        } else {
            this.h.f1115a.clear();
            this.h.f1116b.clear();
            pVar = this.h;
        }
        pVar.f1117c.a();
    }

    @Override // 
    /* renamed from: j */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.r = new ArrayList<>();
            hVar.g = new p();
            hVar.h = new p();
            hVar.k = null;
            hVar.l = null;
            return hVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, o oVar, o oVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, p pVar, p pVar2, ArrayList<o> arrayList, ArrayList<o> arrayList2) {
        Animator k;
        int i;
        View view;
        Animator animator;
        o oVar;
        Animator animator2;
        o oVar2;
        a.e.a<Animator, b> o = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            o oVar3 = arrayList.get(i2);
            o oVar4 = arrayList2.get(i2);
            if (oVar3 != null && !oVar3.f1114c.contains(this)) {
                oVar3 = null;
            }
            if (oVar4 != null && !oVar4.f1114c.contains(this)) {
                oVar4 = null;
            }
            if (oVar3 != null || oVar4 != null) {
                if ((oVar3 == null || oVar4 == null || r(oVar3, oVar4)) && (k = k(viewGroup, oVar3, oVar4)) != null) {
                    if (oVar4 != null) {
                        View view2 = oVar4.f1113b;
                        String[] p = p();
                        if (p != null && p.length > 0) {
                            oVar2 = new o(view2);
                            o oVar5 = pVar2.f1115a.get(view2);
                            if (oVar5 != null) {
                                int i3 = 0;
                                while (i3 < p.length) {
                                    oVar2.f1112a.put(p[i3], oVar5.f1112a.get(p[i3]));
                                    i3++;
                                    k = k;
                                    size = size;
                                    oVar5 = oVar5;
                                }
                            }
                            Animator animator3 = k;
                            i = size;
                            int i4 = o.f358c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator2 = animator3;
                                    break;
                                }
                                b bVar = o.get(o.h(i5));
                                if (bVar.f1099c != null && bVar.f1097a == view2 && bVar.f1098b.equals(this.f1094a) && bVar.f1099c.equals(oVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator2 = k;
                            oVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        oVar = oVar2;
                    } else {
                        i = size;
                        view = oVar3.f1113b;
                        animator = k;
                        oVar = null;
                    }
                    if (animator != null) {
                        String str = this.f1094a;
                        x xVar = r.f1119a;
                        o.put(animator, new b(view, str, this, new a0(viewGroup), oVar));
                        this.r.add(animator);
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.r.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay(animator4.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public void m() {
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            ArrayList<d> arrayList = this.q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.q.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).c(this);
                }
            }
            for (int i3 = 0; i3 < this.g.f1117c.g(); i3++) {
                View h = this.g.f1117c.h(i3);
                if (h != null) {
                    AtomicInteger atomicInteger = a.h.j.w.f667a;
                    w.d.r(h, false);
                }
            }
            for (int i4 = 0; i4 < this.h.f1117c.g(); i4++) {
                View h2 = this.h.f1117c.h(i4);
                if (h2 != null) {
                    AtomicInteger atomicInteger2 = a.h.j.w.f667a;
                    w.d.r(h2, false);
                }
            }
            this.p = true;
        }
    }

    public o n(View view, boolean z) {
        n nVar = this.i;
        if (nVar != null) {
            return nVar.n(view, z);
        }
        ArrayList<o> arrayList = z ? this.k : this.l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            o oVar = arrayList.get(i2);
            if (oVar == null) {
                return null;
            }
            if (oVar.f1113b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.l : this.k).get(i);
    }

    public String[] p() {
        return null;
    }

    public o q(View view, boolean z) {
        n nVar = this.i;
        if (nVar != null) {
            return nVar.q(view, z);
        }
        return (z ? this.g : this.h).f1115a.getOrDefault(view, null);
    }

    public boolean r(o oVar, o oVar2) {
        if (oVar == null || oVar2 == null) {
            return false;
        }
        String[] p = p();
        if (p == null) {
            for (String str : oVar.f1112a.keySet()) {
                if (t(oVar, oVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : p) {
            if (!t(oVar, oVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean s(View view) {
        return (this.e.size() == 0 && this.f.size() == 0) || this.e.contains(Integer.valueOf(view.getId())) || this.f.contains(view);
    }

    public String toString() {
        return G("");
    }

    public void u(View view) {
        if (!this.p) {
            a.e.a<Animator, b> o = o();
            int i = o.f358c;
            x xVar = r.f1119a;
            a0 a0Var = new a0(view);
            for (int i2 = i - 1; i2 >= 0; i2--) {
                b k = o.k(i2);
                if (k.f1097a != null && a0Var.equals(k.d)) {
                    o.h(i2).pause();
                }
            }
            ArrayList<d> arrayList = this.q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.q.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((d) arrayList2.get(i3)).d(this);
                }
            }
            this.o = true;
        }
    }

    public h v(d dVar) {
        ArrayList<d> arrayList = this.q;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.q.size() == 0) {
            this.q = null;
        }
        return this;
    }

    public h w(View view) {
        this.f.remove(view);
        return this;
    }

    public void x(View view) {
        if (this.o) {
            if (!this.p) {
                a.e.a<Animator, b> o = o();
                int i = o.f358c;
                x xVar = r.f1119a;
                a0 a0Var = new a0(view);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    b k = o.k(i2);
                    if (k.f1097a != null && a0Var.equals(k.d)) {
                        o.h(i2).resume();
                    }
                }
                ArrayList<d> arrayList = this.q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.q.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((d) arrayList2.get(i3)).e(this);
                    }
                }
            }
            this.o = false;
        }
    }

    public void y() {
        F();
        a.e.a<Animator, b> o = o();
        Iterator<Animator> it = this.r.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (o.containsKey(next)) {
                F();
                if (next != null) {
                    next.addListener(new i(this, o));
                    long j = this.f1096c;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.f1095b;
                    if (j2 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new j(this));
                    next.start();
                }
            }
        }
        this.r.clear();
        m();
    }

    public h z(long j) {
        this.f1096c = j;
        return this;
    }
}
