package a.l.b;

import a.e.g;
import a.h.j.w;
import a.l.b.m;
import a.l.b.x0;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class c extends x0 {

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f810a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ x0.d f811b;

        public a(List list, x0.d dVar) {
            this.f810a = list;
            this.f811b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f810a.contains(this.f811b)) {
                this.f810a.remove(this.f811b);
                c cVar = c.this;
                x0.d dVar = this.f811b;
                Objects.requireNonNull(cVar);
                dVar.f936a.a(dVar.f938c.E);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends C0025c {

        /* renamed from: c  reason: collision with root package name */
        public boolean f813c;
        public boolean d;
        public t e;

        public b(x0.d dVar, a.h.f.a aVar, boolean z) {
            super(dVar, aVar);
            this.d = false;
            this.f813c = z;
        }

        public t c(Context context) {
            if (this.d) {
                return this.e;
            }
            x0.d dVar = this.f814a;
            t C = a.h.b.b.C(context, dVar.f938c, dVar.f936a == x0.d.c.VISIBLE, this.f813c);
            this.e = C;
            this.d = true;
            return C;
        }
    }

    /* renamed from: a.l.b.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0025c {

        /* renamed from: a  reason: collision with root package name */
        public final x0.d f814a;

        /* renamed from: b  reason: collision with root package name */
        public final a.h.f.a f815b;

        public C0025c(x0.d dVar, a.h.f.a aVar) {
            this.f814a = dVar;
            this.f815b = aVar;
        }

        public void a() {
            x0.d dVar = this.f814a;
            if (!dVar.e.remove(this.f815b) || !dVar.e.isEmpty()) {
                return;
            }
            dVar.b();
        }

        public boolean b() {
            x0.d.c cVar;
            x0.d.c c2 = x0.d.c.c(this.f814a.f938c.E);
            x0.d.c cVar2 = this.f814a.f936a;
            return c2 == cVar2 || !(c2 == (cVar = x0.d.c.VISIBLE) || cVar2 == cVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends C0025c {

        /* renamed from: c  reason: collision with root package name */
        public final Object f816c;
        public final boolean d;
        public final Object e;

        public d(x0.d dVar, a.h.f.a aVar, boolean z, boolean z2) {
            super(dVar, aVar);
            Object obj;
            Object obj2;
            if (dVar.f936a == x0.d.c.VISIBLE) {
                if (z) {
                    obj2 = dVar.f938c.w();
                } else {
                    dVar.f938c.l();
                    obj2 = null;
                }
                this.f816c = obj2;
                if (z) {
                    m.b bVar = dVar.f938c.H;
                } else {
                    m.b bVar2 = dVar.f938c.H;
                }
            } else {
                if (z) {
                    obj = dVar.f938c.y();
                } else {
                    dVar.f938c.o();
                    obj = null;
                }
                this.f816c = obj;
            }
            this.d = true;
            if (z2) {
                if (z) {
                    this.e = dVar.f938c.A();
                    return;
                }
                dVar.f938c.z();
            }
            this.e = null;
        }

        public final s0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            s0 s0Var = q0.f890b;
            if (obj instanceof Transition) {
                return s0Var;
            }
            s0 s0Var2 = q0.f891c;
            if (s0Var2 != null && s0Var2.e(obj)) {
                return s0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f814a.f938c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.l.b.x0
    public void b(List<x0.d> list, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        x0.d.c cVar;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        Iterator it;
        x0.d dVar;
        Object obj;
        x0.d.c cVar2;
        View view;
        x0.d.c cVar3;
        View view2;
        Object m;
        Object obj2;
        x0.d dVar2;
        ArrayList<View> arrayList3;
        x0.d.c cVar4;
        a.e.a aVar;
        ArrayList arrayList4;
        ArrayList arrayList5;
        HashMap hashMap2;
        View view3;
        String str3;
        ArrayList<View> arrayList6;
        s0 s0Var;
        Rect rect;
        ArrayList<String> arrayList7;
        ArrayList<String> arrayList8;
        ArrayList<String> arrayList9;
        ArrayList<String> arrayList10;
        int i;
        View view4;
        StringBuilder sb;
        String str4;
        boolean z4;
        t c2;
        boolean z5 = z;
        x0.d.c cVar5 = x0.d.c.GONE;
        x0.d.c cVar6 = x0.d.c.VISIBLE;
        x0.d dVar3 = null;
        x0.d dVar4 = null;
        for (x0.d dVar5 : list) {
            x0.d.c c3 = x0.d.c.c(dVar5.f938c.E);
            int ordinal = dVar5.f936a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                    }
                } else if (c3 != cVar6) {
                    dVar4 = dVar5;
                }
            }
            if (c3 == cVar6 && dVar3 == null) {
                dVar3 = dVar5;
            }
        }
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(list);
        Iterator<x0.d> it2 = list.iterator();
        while (it2.hasNext()) {
            x0.d next = it2.next();
            a.h.f.a aVar2 = new a.h.f.a();
            next.d();
            next.e.add(aVar2);
            arrayList11.add(new b(next, aVar2, z5));
            a.h.f.a aVar3 = new a.h.f.a();
            next.d();
            next.e.add(aVar3);
            arrayList12.add(new d(next, aVar3, z5, !z5 ? next == dVar4 : next == dVar3));
            next.d.add(new a(arrayList13, next));
        }
        HashMap hashMap3 = new HashMap();
        Iterator it3 = arrayList12.iterator();
        s0 s0Var2 = null;
        while (it3.hasNext()) {
            d dVar6 = (d) it3.next();
            if (!dVar6.b()) {
                s0 c4 = dVar6.c(dVar6.f816c);
                s0 c5 = dVar6.c(dVar6.e);
                if (c4 != null && c5 != null && c4 != c5) {
                    StringBuilder f = b.a.a.a.a.f("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    f.append(dVar6.f814a.f938c);
                    f.append(" returned Transition ");
                    f.append(dVar6.f816c);
                    f.append(" which uses a different Transition  type than its shared element transition ");
                    f.append(dVar6.e);
                    throw new IllegalArgumentException(f.toString());
                }
                if (c4 == null) {
                    c4 = c5;
                }
                if (s0Var2 == null) {
                    s0Var2 = c4;
                } else if (c4 != null && s0Var2 != c4) {
                    StringBuilder f2 = b.a.a.a.a.f("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    f2.append(dVar6.f814a.f938c);
                    f2.append(" returned Transition ");
                    f2.append(dVar6.f816c);
                    f2.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(f2.toString());
                }
            }
        }
        if (s0Var2 == null) {
            Iterator it4 = arrayList12.iterator();
            while (it4.hasNext()) {
                d dVar7 = (d) it4.next();
                hashMap3.put(dVar7.f814a, Boolean.FALSE);
                dVar7.a();
            }
            z2 = false;
            z3 = true;
            str = "FragmentManager";
            cVar = cVar5;
            arrayList = arrayList11;
            arrayList2 = arrayList13;
            hashMap = hashMap3;
        } else {
            View view5 = new View(this.f929a.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList14 = new ArrayList<>();
            ArrayList<View> arrayList15 = new ArrayList<>();
            arrayList = arrayList11;
            a.e.a aVar4 = new a.e.a();
            Iterator it5 = arrayList12.iterator();
            Rect rect3 = rect2;
            Object obj3 = null;
            View view6 = null;
            boolean z6 = false;
            View view7 = view5;
            String str5 = "FragmentManager";
            x0.d dVar8 = dVar3;
            x0.d dVar9 = dVar4;
            while (it5.hasNext()) {
                x0.d.c cVar7 = cVar6;
                Object obj4 = ((d) it5.next()).e;
                if (!(obj4 != null) || dVar8 == null || dVar9 == null) {
                    arrayList3 = arrayList15;
                    cVar4 = cVar5;
                    aVar = aVar4;
                    arrayList4 = arrayList12;
                    arrayList5 = arrayList13;
                    hashMap2 = hashMap3;
                    view3 = view7;
                    str3 = str5;
                    arrayList6 = arrayList14;
                    s0Var = s0Var2;
                    rect = rect3;
                } else {
                    Object y = s0Var2.y(s0Var2.g(obj4));
                    m.b bVar = dVar9.f938c.H;
                    if (bVar == null || (arrayList7 = bVar.i) == null) {
                        arrayList7 = new ArrayList<>();
                    }
                    s0 s0Var3 = s0Var2;
                    m.b bVar2 = dVar8.f938c.H;
                    if (bVar2 == null || (arrayList8 = bVar2.i) == null) {
                        arrayList8 = new ArrayList<>();
                    }
                    arrayList5 = arrayList13;
                    m.b bVar3 = dVar8.f938c.H;
                    if (bVar3 == null || (arrayList9 = bVar3.j) == null) {
                        arrayList9 = new ArrayList<>();
                    }
                    cVar4 = cVar5;
                    arrayList4 = arrayList12;
                    int i2 = 0;
                    while (i2 < arrayList9.size()) {
                        int indexOf = arrayList7.indexOf(arrayList9.get(i2));
                        ArrayList<String> arrayList16 = arrayList9;
                        if (indexOf != -1) {
                            arrayList7.set(indexOf, arrayList8.get(i2));
                        }
                        i2++;
                        arrayList9 = arrayList16;
                    }
                    m.b bVar4 = dVar9.f938c.H;
                    if (bVar4 == null || (arrayList10 = bVar4.j) == null) {
                        arrayList10 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList17 = arrayList10;
                    if (!z5) {
                        dVar8.f938c.p();
                        dVar9.f938c.m();
                    } else {
                        dVar8.f938c.m();
                        dVar9.f938c.p();
                    }
                    int i3 = 0;
                    for (int size = arrayList7.size(); i3 < size; size = size) {
                        aVar4.put(arrayList7.get(i3), arrayList17.get(i3));
                        i3++;
                    }
                    a.e.a<String, View> aVar5 = new a.e.a<>();
                    k(aVar5, dVar8.f938c.E);
                    a.e.g.k(aVar5, arrayList7);
                    a.e.g.k(aVar4, aVar5.keySet());
                    a.e.a<String, View> aVar6 = new a.e.a<>();
                    k(aVar6, dVar9.f938c.E);
                    a.e.g.k(aVar6, arrayList17);
                    a.e.g.k(aVar6, aVar4.values());
                    q0.m(aVar4, aVar6);
                    l(aVar5, aVar4.keySet());
                    l(aVar6, aVar4.values());
                    if (aVar4.isEmpty()) {
                        arrayList14.clear();
                        arrayList15.clear();
                        obj3 = null;
                        rect = rect3;
                        arrayList3 = arrayList15;
                        aVar = aVar4;
                        hashMap2 = hashMap3;
                        view3 = view7;
                        str3 = str5;
                        s0Var = s0Var3;
                        arrayList6 = arrayList14;
                    } else {
                        q0.c(dVar9.f938c, dVar8.f938c, z5, aVar5, true);
                        arrayList3 = arrayList15;
                        aVar = aVar4;
                        arrayList6 = arrayList14;
                        HashMap hashMap4 = hashMap3;
                        Rect rect4 = rect3;
                        ArrayList<String> arrayList18 = arrayList7;
                        x0.d dVar10 = dVar4;
                        View view8 = view7;
                        x0.d dVar11 = dVar3;
                        str3 = str5;
                        s0Var = s0Var3;
                        a.h.j.r.a(this.f929a, new h(this, dVar4, dVar3, z, aVar6));
                        arrayList6.addAll(aVar5.values());
                        if (!arrayList18.isEmpty()) {
                            i = 0;
                            View view9 = aVar5.get(arrayList18.get(0));
                            s0Var.t(y, view9);
                            view6 = view9;
                        } else {
                            i = 0;
                        }
                        arrayList3.addAll(aVar6.values());
                        if (arrayList17.isEmpty() || (view4 = aVar6.get(arrayList17.get(i))) == null) {
                            rect = rect4;
                        } else {
                            rect = rect4;
                            a.h.j.r.a(this.f929a, new i(this, s0Var, view4, rect));
                            z6 = true;
                        }
                        view3 = view8;
                        s0Var.w(y, view3, arrayList6);
                        s0Var.r(y, null, null, null, null, y, arrayList3);
                        Boolean bool = Boolean.TRUE;
                        hashMap2 = hashMap4;
                        dVar3 = dVar11;
                        hashMap2.put(dVar3, bool);
                        dVar4 = dVar10;
                        hashMap2.put(dVar4, bool);
                        obj3 = y;
                        dVar8 = dVar3;
                        dVar9 = dVar4;
                    }
                }
                view7 = view3;
                rect3 = rect;
                arrayList15 = arrayList3;
                arrayList14 = arrayList6;
                s0Var2 = s0Var;
                cVar6 = cVar7;
                arrayList13 = arrayList5;
                arrayList12 = arrayList4;
                aVar4 = aVar;
                str5 = str3;
                z5 = z;
                hashMap3 = hashMap2;
                cVar5 = cVar4;
            }
            ArrayList<View> arrayList19 = arrayList15;
            x0.d.c cVar8 = cVar5;
            x0.d.c cVar9 = cVar6;
            a.e.a aVar7 = aVar4;
            ArrayList arrayList20 = arrayList12;
            arrayList2 = arrayList13;
            hashMap = hashMap3;
            View view10 = view7;
            String str6 = str5;
            ArrayList<View> arrayList21 = arrayList14;
            s0 s0Var4 = s0Var2;
            Rect rect5 = rect3;
            ArrayList arrayList22 = new ArrayList();
            Iterator it6 = arrayList20.iterator();
            Object obj5 = null;
            Object obj6 = null;
            while (it6.hasNext()) {
                d dVar12 = (d) it6.next();
                if (dVar12.b()) {
                    it = it6;
                    dVar = dVar4;
                    hashMap.put(dVar12.f814a, Boolean.FALSE);
                    dVar12.a();
                    view = view10;
                    obj = obj3;
                    dVar2 = dVar9;
                    obj2 = obj5;
                    view2 = view6;
                    cVar3 = cVar9;
                    cVar2 = cVar8;
                } else {
                    it = it6;
                    dVar = dVar4;
                    Object g = s0Var4.g(dVar12.f816c);
                    x0.d dVar13 = dVar12.f814a;
                    boolean z7 = obj3 != null && (dVar13 == dVar8 || dVar13 == dVar9);
                    if (g == null) {
                        if (!z7) {
                            hashMap.put(dVar13, Boolean.FALSE);
                            dVar12.a();
                        }
                        view = view10;
                        obj = obj3;
                        m = obj5;
                        view2 = view6;
                        cVar3 = cVar9;
                        cVar2 = cVar8;
                    } else {
                        obj = obj3;
                        ArrayList<View> arrayList23 = new ArrayList<>();
                        Object obj7 = obj5;
                        j(arrayList23, dVar13.f938c.E);
                        if (z7) {
                            if (dVar13 == dVar8) {
                                arrayList23.removeAll(arrayList21);
                            } else {
                                arrayList23.removeAll(arrayList19);
                            }
                        }
                        if (arrayList23.isEmpty()) {
                            s0Var4.a(g, view10);
                            view = view10;
                            cVar2 = cVar8;
                        } else {
                            s0Var4.b(g, arrayList23);
                            s0Var4.r(g, g, arrayList23, null, null, null, null);
                            cVar2 = cVar8;
                            if (dVar13.f936a == cVar2) {
                                arrayList2.remove(dVar13);
                                view = view10;
                                ArrayList arrayList24 = new ArrayList(arrayList23);
                                arrayList24.remove(dVar13.f938c.E);
                                s0Var4.q(g, dVar13.f938c.E, arrayList24);
                                a.h.j.r.a(this.f929a, new j(this, arrayList23));
                            } else {
                                view = view10;
                            }
                        }
                        cVar3 = cVar9;
                        if (dVar13.f936a == cVar3) {
                            arrayList22.addAll(arrayList23);
                            if (z6) {
                                s0Var4.s(g, rect5);
                            }
                            view2 = view6;
                        } else {
                            view2 = view6;
                            s0Var4.t(g, view2);
                        }
                        hashMap.put(dVar13, Boolean.TRUE);
                        if (dVar12.d) {
                            obj6 = s0Var4.m(obj6, g, null);
                            m = obj7;
                        } else {
                            m = s0Var4.m(obj7, g, null);
                        }
                    }
                    obj2 = m;
                    dVar2 = dVar;
                }
                it6 = it;
                view6 = view2;
                cVar9 = cVar3;
                cVar8 = cVar2;
                dVar4 = dVar;
                view10 = view;
                dVar9 = dVar2;
                obj5 = obj2;
                obj3 = obj;
            }
            Object obj8 = obj3;
            x0.d dVar14 = dVar4;
            Object obj9 = obj5;
            cVar = cVar8;
            Object l = s0Var4.l(obj6, obj9, obj8);
            Iterator it7 = arrayList20.iterator();
            while (it7.hasNext()) {
                d dVar15 = (d) it7.next();
                if (!dVar15.b()) {
                    Object obj10 = dVar15.f816c;
                    x0.d dVar16 = dVar15.f814a;
                    x0.d dVar17 = dVar14;
                    boolean z8 = obj8 != null && (dVar16 == dVar8 || dVar16 == dVar17);
                    if (obj10 != null || z8) {
                        ViewGroup viewGroup = this.f929a;
                        AtomicInteger atomicInteger = a.h.j.w.f667a;
                        if (!w.g.c(viewGroup)) {
                            if (b0.M(2)) {
                                StringBuilder f3 = b.a.a.a.a.f("SpecialEffectsController: Container ");
                                f3.append(this.f929a);
                                f3.append(" has not been laid out. Completing operation ");
                                f3.append(dVar16);
                                str2 = str6;
                                Log.v(str2, f3.toString());
                            } else {
                                str2 = str6;
                            }
                            dVar15.a();
                        } else {
                            s0Var4.u(dVar15.f814a.f938c, l, dVar15.f815b, new k(this, dVar15));
                            it7 = it7;
                            dVar14 = dVar17;
                        }
                    } else {
                        str2 = str6;
                    }
                    str6 = str2;
                    dVar14 = dVar17;
                }
            }
            str = str6;
            ViewGroup viewGroup2 = this.f929a;
            AtomicInteger atomicInteger2 = a.h.j.w.f667a;
            if (!w.g.c(viewGroup2)) {
                z2 = false;
            } else {
                q0.o(arrayList22, 4);
                ArrayList<String> n = s0Var4.n(arrayList19);
                s0Var4.c(this.f929a, l);
                s0Var4.v(this.f929a, arrayList21, arrayList19, n, aVar7);
                z2 = false;
                q0.o(arrayList22, 0);
                s0Var4.x(obj8, arrayList21, arrayList19);
            }
            z3 = true;
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup3 = this.f929a;
        Context context = viewGroup3.getContext();
        ArrayList arrayList25 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        boolean z9 = z2;
        while (it8.hasNext()) {
            b bVar5 = (b) it8.next();
            if (!bVar5.b() && (c2 = bVar5.c(context)) != null) {
                Animator animator = c2.f914b;
                if (animator == null) {
                    arrayList25.add(bVar5);
                    z4 = z2;
                    z2 = z4;
                } else {
                    x0.d dVar18 = bVar5.f814a;
                    m mVar = dVar18.f938c;
                    z4 = z2;
                    if (!Boolean.TRUE.equals(hashMap.get(dVar18))) {
                        boolean z10 = dVar18.f936a == cVar ? z3 : z4;
                        ArrayList arrayList26 = arrayList2;
                        if (z10) {
                            arrayList26.remove(dVar18);
                        }
                        View view11 = mVar.E;
                        viewGroup3.startViewTransition(view11);
                        animator.addListener(new a.l.b.d(this, viewGroup3, view11, z10, dVar18, bVar5));
                        animator.setTarget(view11);
                        animator.start();
                        bVar5.f815b.b(new e(this, animator));
                        z2 = false;
                        z9 = z3;
                        z3 = z9;
                        arrayList2 = arrayList26;
                        hashMap = hashMap;
                    } else if (b0.M(2)) {
                        Log.v(str, "Ignoring Animator set on " + mVar + " as this Fragment was involved in a Transition.");
                    }
                }
            } else {
                z4 = z2;
            }
            bVar5.a();
            z2 = z4;
        }
        ArrayList arrayList27 = arrayList2;
        Iterator it9 = arrayList25.iterator();
        while (it9.hasNext()) {
            b bVar6 = (b) it9.next();
            x0.d dVar19 = bVar6.f814a;
            m mVar2 = dVar19.f938c;
            if (containsValue) {
                if (b0.M(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(mVar2);
                    str4 = " as Animations cannot run alongside Transitions.";
                    sb.append(str4);
                    Log.v(str, sb.toString());
                }
                bVar6.a();
            } else if (z9) {
                if (b0.M(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(mVar2);
                    str4 = " as Animations cannot run alongside Animators.";
                    sb.append(str4);
                    Log.v(str, sb.toString());
                }
                bVar6.a();
            } else {
                View view12 = mVar2.E;
                t c6 = bVar6.c(context);
                Objects.requireNonNull(c6);
                Animation animation = c6.f913a;
                Objects.requireNonNull(animation);
                if (dVar19.f936a != x0.d.c.REMOVED) {
                    view12.startAnimation(animation);
                    bVar6.a();
                } else {
                    viewGroup3.startViewTransition(view12);
                    u uVar = new u(animation, viewGroup3, view12);
                    uVar.setAnimationListener(new f(this, viewGroup3, view12, bVar6));
                    view12.startAnimation(uVar);
                }
                bVar6.f815b.b(new g(this, view12, viewGroup3, bVar6));
            }
        }
        Iterator it10 = arrayList27.iterator();
        while (it10.hasNext()) {
            x0.d dVar20 = (x0.d) it10.next();
            dVar20.f936a.a(dVar20.f938c.E);
        }
        arrayList27.clear();
    }

    public void j(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                j(arrayList, childAt);
            }
        }
    }

    public void k(Map<String, View> map, View view) {
        AtomicInteger atomicInteger = a.h.j.w.f667a;
        String k = w.i.k(view);
        if (k != null) {
            map.put(k, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public void l(a.e.a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((g.b) aVar.entrySet()).iterator();
        while (true) {
            g.d dVar = (g.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                AtomicInteger atomicInteger = a.h.j.w.f667a;
                if (!collection.contains(w.i.k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }
}
