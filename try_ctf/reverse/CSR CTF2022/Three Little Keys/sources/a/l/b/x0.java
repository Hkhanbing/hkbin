package a.l.b;

import a.h.f.a;
import a.h.j.w;
import a.l.b.b0;
import a.l.b.m;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f929a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<d> f930b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<d> f931c = new ArrayList<>();
    public boolean d = false;
    public boolean e = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f932a;

        public a(c cVar) {
            this.f932a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (x0.this.f930b.contains(this.f932a)) {
                c cVar = this.f932a;
                cVar.f936a.a(cVar.f938c.E);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f934a;

        public b(c cVar) {
            this.f934a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.f930b.remove(this.f934a);
            x0.this.f931c.remove(this.f934a);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d {
        public final h0 h;

        public c(d.c cVar, d.b bVar, h0 h0Var, a.h.f.a aVar) {
            super(cVar, bVar, h0Var.f841c, aVar);
            this.h = h0Var;
        }

        @Override // a.l.b.x0.d
        public void b() {
            super.b();
            this.h.k();
        }

        @Override // a.l.b.x0.d
        public void d() {
            if (this.f937b == d.b.ADDING) {
                m mVar = this.h.f841c;
                View findFocus = mVar.E.findFocus();
                if (findFocus != null) {
                    mVar.g().o = findFocus;
                    if (b0.M(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + mVar);
                    }
                }
                View j0 = this.f938c.j0();
                if (j0.getParent() == null) {
                    this.h.b();
                    j0.setAlpha(0.0f);
                }
                if (j0.getAlpha() == 0.0f && j0.getVisibility() == 0) {
                    j0.setVisibility(4);
                }
                m.b bVar = mVar.H;
                j0.setAlpha(bVar == null ? 1.0f : bVar.n);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public c f936a;

        /* renamed from: b  reason: collision with root package name */
        public b f937b;

        /* renamed from: c  reason: collision with root package name */
        public final m f938c;
        public final List<Runnable> d = new ArrayList();
        public final HashSet<a.h.f.a> e = new HashSet<>();
        public boolean f = false;
        public boolean g = false;

        /* loaded from: classes.dex */
        public class a implements a.InterfaceC0014a {
            public a() {
            }

            @Override // a.h.f.a.InterfaceC0014a
            public void a() {
                d.this.a();
            }
        }

        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c b(int i) {
                if (i != 0) {
                    if (i == 4) {
                        return INVISIBLE;
                    }
                    if (i == 8) {
                        return GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i);
                }
                return VISIBLE;
            }

            public static c c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public void a(View view) {
                int i;
                int ordinal = ordinal();
                if (ordinal == 0) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup == null) {
                        return;
                    }
                    if (b0.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                    return;
                }
                if (ordinal == 1) {
                    if (b0.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i = 0;
                } else if (ordinal == 2) {
                    if (b0.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i = 8;
                } else if (ordinal != 3) {
                    return;
                } else {
                    if (b0.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    i = 4;
                }
                view.setVisibility(i);
            }
        }

        public d(c cVar, b bVar, m mVar, a.h.f.a aVar) {
            this.f936a = cVar;
            this.f937b = bVar;
            this.f938c = mVar;
            aVar.b(new a());
        }

        public final void a() {
            if (this.f) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(this.e).iterator();
            while (it.hasNext()) {
                ((a.h.f.a) it.next()).a();
            }
        }

        public void b() {
            if (this.g) {
                return;
            }
            if (b0.M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            for (Runnable runnable : this.d) {
                runnable.run();
            }
        }

        public final void c(c cVar, b bVar) {
            b bVar2;
            c cVar2 = c.REMOVED;
            int ordinal = bVar.ordinal();
            if (ordinal == 0) {
                if (this.f936a == cVar2) {
                    return;
                }
                if (b0.M(2)) {
                    StringBuilder f = b.a.a.a.a.f("SpecialEffectsController: For fragment ");
                    f.append(this.f938c);
                    f.append(" mFinalState = ");
                    f.append(this.f936a);
                    f.append(" -> ");
                    f.append(cVar);
                    f.append(". ");
                    Log.v("FragmentManager", f.toString());
                }
                this.f936a = cVar;
                return;
            }
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return;
                }
                if (b0.M(2)) {
                    StringBuilder f2 = b.a.a.a.a.f("SpecialEffectsController: For fragment ");
                    f2.append(this.f938c);
                    f2.append(" mFinalState = ");
                    f2.append(this.f936a);
                    f2.append(" -> REMOVED. mLifecycleImpact  = ");
                    f2.append(this.f937b);
                    f2.append(" to REMOVING.");
                    Log.v("FragmentManager", f2.toString());
                }
                this.f936a = cVar2;
                bVar2 = b.REMOVING;
            } else if (this.f936a != cVar2) {
                return;
            } else {
                if (b0.M(2)) {
                    StringBuilder f3 = b.a.a.a.a.f("SpecialEffectsController: For fragment ");
                    f3.append(this.f938c);
                    f3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    f3.append(this.f937b);
                    f3.append(" to ADDING.");
                    Log.v("FragmentManager", f3.toString());
                }
                this.f936a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f937b = bVar2;
        }

        public void d() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f936a + "} {mLifecycleImpact = " + this.f937b + "} {mFragment = " + this.f938c + "}";
        }
    }

    public x0(ViewGroup viewGroup) {
        this.f929a = viewGroup;
    }

    public static x0 f(ViewGroup viewGroup, b0 b0Var) {
        return g(viewGroup, b0Var.K());
    }

    public static x0 g(ViewGroup viewGroup, y0 y0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof x0) {
            return (x0) tag;
        }
        Objects.requireNonNull((b0.f) y0Var);
        a.l.b.c cVar = new a.l.b.c(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, cVar);
        return cVar;
    }

    public final void a(d.c cVar, d.b bVar, h0 h0Var) {
        synchronized (this.f930b) {
            a.h.f.a aVar = new a.h.f.a();
            d d2 = d(h0Var.f841c);
            if (d2 != null) {
                d2.c(cVar, bVar);
                return;
            }
            c cVar2 = new c(cVar, bVar, h0Var, aVar);
            this.f930b.add(cVar2);
            cVar2.d.add(new a(cVar2));
            cVar2.d.add(new b(cVar2));
        }
    }

    public abstract void b(List<d> list, boolean z);

    public void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.f929a;
        AtomicInteger atomicInteger = a.h.j.w.f667a;
        if (!w.g.b(viewGroup)) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.f930b) {
            if (!this.f930b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f931c);
                this.f931c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (b0.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar);
                    }
                    dVar.a();
                    if (!dVar.g) {
                        this.f931c.add(dVar);
                    }
                }
                i();
                ArrayList arrayList2 = new ArrayList(this.f930b);
                this.f930b.clear();
                this.f931c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).d();
                }
                b(arrayList2, this.d);
                this.d = false;
            }
        }
    }

    public final d d(m mVar) {
        Iterator<d> it = this.f930b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f938c.equals(mVar) && !next.f) {
                return next;
            }
        }
        return null;
    }

    public void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f929a;
        AtomicInteger atomicInteger = a.h.j.w.f667a;
        boolean b2 = w.g.b(viewGroup);
        synchronized (this.f930b) {
            i();
            Iterator<d> it = this.f930b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f931c).iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (b0.M(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (b2) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f929a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(dVar);
                    Log.v("FragmentManager", sb.toString());
                }
                dVar.a();
            }
            Iterator it3 = new ArrayList(this.f930b).iterator();
            while (it3.hasNext()) {
                d dVar2 = (d) it3.next();
                if (b0.M(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b2) {
                        str = "";
                    } else {
                        str = "Container " + this.f929a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(dVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                dVar2.a();
            }
        }
    }

    public void h() {
        synchronized (this.f930b) {
            i();
            this.e = false;
            int size = this.f930b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                d dVar = this.f930b.get(size);
                d.c c2 = d.c.c(dVar.f938c.E);
                d.c cVar = dVar.f936a;
                d.c cVar2 = d.c.VISIBLE;
                if (cVar == cVar2 && c2 != cVar2) {
                    this.e = dVar.f938c.D();
                    break;
                }
                size--;
            }
        }
    }

    public final void i() {
        Iterator<d> it = this.f930b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f937b == d.b.ADDING) {
                next.c(d.c.b(next.f938c.j0().getVisibility()), d.b.NONE);
            }
        }
    }
}
