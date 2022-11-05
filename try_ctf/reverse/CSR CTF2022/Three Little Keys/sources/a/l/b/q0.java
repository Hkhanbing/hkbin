package a.l.b;

import a.h.j.w;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f889a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    public static final s0 f890b = new r0();

    /* renamed from: c  reason: collision with root package name */
    public static final s0 f891c;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public m f892a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f893b;

        /* renamed from: c  reason: collision with root package name */
        public a.l.b.a f894c;
        public m d;
        public boolean e;
        public a.l.b.a f;
    }

    static {
        s0 s0Var;
        try {
            s0Var = (s0) Class.forName("a.s.d").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            s0Var = null;
        }
        f891c = s0Var;
    }

    public static void a(ArrayList<View> arrayList, a.e.a<String, View> aVar, Collection<String> collection) {
        for (int i = aVar.f358c - 1; i >= 0; i--) {
            View k = aVar.k(i);
            AtomicInteger atomicInteger = a.h.j.w.f667a;
            if (collection.contains(w.i.k(k))) {
                arrayList.add(k);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
        if (r0.k != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0075, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0087, code lost:
        if (r0.y != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0089, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(a.l.b.a r8, a.l.b.j0.a r9, android.util.SparseArray<a.l.b.q0.b> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.b.q0.b(a.l.b.a, a.l.b.j0$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(m mVar, m mVar2, boolean z, a.e.a<String, View> aVar, boolean z2) {
        if (z) {
            mVar2.m();
        } else {
            mVar.m();
        }
    }

    public static boolean d(s0 s0Var, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!s0Var.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static a.e.a<String, View> e(s0 s0Var, a.e.a<String, String> aVar, Object obj, b bVar) {
        ArrayList<String> arrayList;
        m mVar = bVar.f892a;
        View view = mVar.E;
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        a.e.a<String, View> aVar2 = new a.e.a<>();
        s0Var.i(aVar2, view);
        a.l.b.a aVar3 = bVar.f894c;
        if (bVar.f893b) {
            mVar.p();
            arrayList = aVar3.m;
        } else {
            mVar.m();
            arrayList = aVar3.n;
        }
        if (arrayList != null) {
            a.e.g.k(aVar2, arrayList);
            a.e.g.k(aVar2, aVar.values());
        }
        m(aVar, aVar2);
        return aVar2;
    }

    public static a.e.a<String, View> f(s0 s0Var, a.e.a<String, String> aVar, Object obj, b bVar) {
        ArrayList<String> arrayList;
        if (!aVar.isEmpty() && obj != null) {
            m mVar = bVar.d;
            a.e.a<String, View> aVar2 = new a.e.a<>();
            s0Var.i(aVar2, mVar.j0());
            a.l.b.a aVar3 = bVar.f;
            if (bVar.e) {
                mVar.m();
                arrayList = aVar3.n;
            } else {
                mVar.p();
                arrayList = aVar3.m;
            }
            if (arrayList != null) {
                a.e.g.k(aVar2, arrayList);
            }
            a.e.g.k(aVar, aVar2.keySet());
            return aVar2;
        }
        aVar.clear();
        return null;
    }

    public static s0 g(m mVar, m mVar2) {
        ArrayList arrayList = new ArrayList();
        if (mVar != null) {
            mVar.o();
            Object y = mVar.y();
            if (y != null) {
                arrayList.add(y);
            }
            Object A = mVar.A();
            if (A != null) {
                arrayList.add(A);
            }
        }
        if (mVar2 != null) {
            mVar2.l();
            Object w = mVar2.w();
            if (w != null) {
                arrayList.add(w);
            }
            mVar2.z();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        s0 s0Var = f890b;
        if (d(s0Var, arrayList)) {
            return s0Var;
        }
        s0 s0Var2 = f891c;
        if (s0Var2 != null && d(s0Var2, arrayList)) {
            return s0Var2;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList<View> h(s0 s0Var, Object obj, m mVar, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View view2 = mVar.E;
            if (view2 != null) {
                s0Var.f(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            s0Var.b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    public static Object i(s0 s0Var, m mVar, boolean z) {
        Object obj = null;
        if (mVar == null) {
            return null;
        }
        if (z) {
            obj = mVar.w();
        } else {
            mVar.l();
        }
        return s0Var.g(obj);
    }

    public static Object j(s0 s0Var, m mVar, boolean z) {
        Object obj = null;
        if (mVar == null) {
            return null;
        }
        if (z) {
            obj = mVar.y();
        } else {
            mVar.o();
        }
        return s0Var.g(obj);
    }

    public static View k(a.e.a<String, View> aVar, b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        a.l.b.a aVar2 = bVar.f894c;
        if (obj == null || aVar == null || (arrayList = aVar2.m) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.m : aVar2.n).get(0));
    }

    public static Object l(s0 s0Var, m mVar, m mVar2, boolean z) {
        Object obj;
        if (z) {
            obj = mVar2.A();
        } else {
            mVar.z();
            obj = null;
        }
        return s0Var.y(s0Var.g(obj));
    }

    public static void m(a.e.a<String, String> aVar, a.e.a<String, View> aVar2) {
        int i = aVar.f358c;
        while (true) {
            i--;
            if (i >= 0) {
                if (!aVar2.containsKey(aVar.k(i))) {
                    aVar.i(i);
                }
            } else {
                return;
            }
        }
    }

    public static void n(s0 s0Var, Object obj, Object obj2, a.e.a<String, View> aVar, boolean z, a.l.b.a aVar2) {
        ArrayList<String> arrayList = aVar2.m;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? aVar2.n : aVar2.m).get(0));
        s0Var.t(obj, view);
        if (obj2 == null) {
            return;
        }
        s0Var.t(obj2, view);
    }

    public static void o(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(android.content.Context r37, a.l.b.v r38, java.util.ArrayList<a.l.b.a> r39, java.util.ArrayList<java.lang.Boolean> r40, int r41, int r42, boolean r43, a.l.b.q0.a r44) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.b.q0.p(android.content.Context, a.l.b.v, java.util.ArrayList, java.util.ArrayList, int, int, boolean, a.l.b.q0$a):void");
    }
}
