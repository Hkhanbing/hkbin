package a.l.b;

import a.h.j.w;
import a.l.b.m;
import a.l.b.x0;
import a.n.f;
import a.n.j;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f839a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f840b;

    /* renamed from: c  reason: collision with root package name */
    public final m f841c;
    public boolean d = false;
    public int e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f842a;

        public a(h0 h0Var, View view) {
            this.f842a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f842a.removeOnAttachStateChangeListener(this);
            View view2 = this.f842a;
            AtomicInteger atomicInteger = a.h.j.w.f667a;
            w.h.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public h0(a0 a0Var, i0 i0Var, m mVar) {
        this.f839a = a0Var;
        this.f840b = i0Var;
        this.f841c = mVar;
    }

    public h0(a0 a0Var, i0 i0Var, m mVar, g0 g0Var) {
        this.f839a = a0Var;
        this.f840b = i0Var;
        this.f841c = mVar;
        mVar.f869c = null;
        mVar.d = null;
        mVar.q = 0;
        mVar.n = false;
        mVar.k = false;
        m mVar2 = mVar.g;
        mVar.h = mVar2 != null ? mVar2.e : null;
        mVar.g = null;
        Bundle bundle = g0Var.m;
        mVar.f868b = bundle == null ? new Bundle() : bundle;
    }

    public h0(a0 a0Var, i0 i0Var, ClassLoader classLoader, x xVar, g0 g0Var) {
        this.f839a = a0Var;
        this.f840b = i0Var;
        m a2 = xVar.a(classLoader, g0Var.f833a);
        this.f841c = a2;
        Bundle bundle = g0Var.j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.n0(g0Var.j);
        a2.e = g0Var.f834b;
        a2.m = g0Var.f835c;
        a2.o = true;
        a2.v = g0Var.d;
        a2.w = g0Var.e;
        a2.x = g0Var.f;
        a2.A = g0Var.g;
        a2.l = g0Var.h;
        a2.z = g0Var.i;
        a2.y = g0Var.k;
        a2.M = f.b.values()[g0Var.l];
        Bundle bundle2 = g0Var.m;
        a2.f868b = bundle2 == null ? new Bundle() : bundle2;
        if (b0.M(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public void a() {
        if (b0.M(3)) {
            StringBuilder f = b.a.a.a.a.f("moveto ACTIVITY_CREATED: ");
            f.append(this.f841c);
            Log.d("FragmentManager", f.toString());
        }
        m mVar = this.f841c;
        Bundle bundle = mVar.f868b;
        mVar.t.T();
        mVar.f867a = 3;
        mVar.C = false;
        mVar.F();
        if (mVar.C) {
            if (b0.M(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + mVar);
            }
            View view = mVar.E;
            if (view != null) {
                Bundle bundle2 = mVar.f868b;
                SparseArray<Parcelable> sparseArray = mVar.f869c;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    mVar.f869c = null;
                }
                if (mVar.E != null) {
                    v0 v0Var = mVar.O;
                    v0Var.f924c.a(mVar.d);
                    mVar.d = null;
                }
                mVar.C = false;
                mVar.d0(bundle2);
                if (!mVar.C) {
                    throw new z0(b.a.a.a.a.c("Fragment ", mVar, " did not call through to super.onViewStateRestored()"));
                }
                if (mVar.E != null) {
                    mVar.O.b(f.a.ON_CREATE);
                }
            }
            mVar.f868b = null;
            b0 b0Var = mVar.t;
            b0Var.B = false;
            b0Var.C = false;
            b0Var.J.g = false;
            b0Var.w(4);
            a0 a0Var = this.f839a;
            m mVar2 = this.f841c;
            a0Var.a(mVar2, mVar2.f868b, false);
            return;
        }
        throw new z0(b.a.a.a.a.c("Fragment ", mVar, " did not call through to super.onActivityCreated()"));
    }

    public void b() {
        View view;
        View view2;
        i0 i0Var = this.f840b;
        m mVar = this.f841c;
        Objects.requireNonNull(i0Var);
        ViewGroup viewGroup = mVar.D;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = i0Var.f846a.indexOf(mVar);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= i0Var.f846a.size()) {
                            break;
                        }
                        m mVar2 = i0Var.f846a.get(indexOf);
                        if (mVar2.D == viewGroup && (view = mVar2.E) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    m mVar3 = i0Var.f846a.get(i2);
                    if (mVar3.D == viewGroup && (view2 = mVar3.E) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        m mVar4 = this.f841c;
        mVar4.D.addView(mVar4.E, i);
    }

    public void c() {
        if (b0.M(3)) {
            StringBuilder f = b.a.a.a.a.f("moveto ATTACHED: ");
            f.append(this.f841c);
            Log.d("FragmentManager", f.toString());
        }
        m mVar = this.f841c;
        m mVar2 = mVar.g;
        h0 h0Var = null;
        if (mVar2 != null) {
            h0 h = this.f840b.h(mVar2.e);
            if (h == null) {
                StringBuilder f2 = b.a.a.a.a.f("Fragment ");
                f2.append(this.f841c);
                f2.append(" declared target fragment ");
                f2.append(this.f841c.g);
                f2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(f2.toString());
            }
            m mVar3 = this.f841c;
            mVar3.h = mVar3.g.e;
            mVar3.g = null;
            h0Var = h;
        } else {
            String str = mVar.h;
            if (str != null && (h0Var = this.f840b.h(str)) == null) {
                StringBuilder f3 = b.a.a.a.a.f("Fragment ");
                f3.append(this.f841c);
                f3.append(" declared target fragment ");
                f3.append(this.f841c.h);
                f3.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(f3.toString());
            }
        }
        if (h0Var != null) {
            h0Var.k();
        }
        m mVar4 = this.f841c;
        b0 b0Var = mVar4.r;
        mVar4.s = b0Var.q;
        mVar4.u = b0Var.s;
        this.f839a.g(mVar4, false);
        m mVar5 = this.f841c;
        Iterator<m.d> it = mVar5.R.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        mVar5.R.clear();
        mVar5.t.b(mVar5.s, mVar5.b(), mVar5);
        mVar5.f867a = 0;
        mVar5.C = false;
        mVar5.I(mVar5.s.f947b);
        if (mVar5.C) {
            b0 b0Var2 = mVar5.r;
            Iterator<f0> it2 = b0Var2.o.iterator();
            while (it2.hasNext()) {
                it2.next().b(b0Var2, mVar5);
            }
            b0 b0Var3 = mVar5.t;
            b0Var3.B = false;
            b0Var3.C = false;
            b0Var3.J.g = false;
            b0Var3.w(0);
            this.f839a.b(this.f841c, false);
            return;
        }
        throw new z0(b.a.a.a.a.c("Fragment ", mVar5, " did not call through to super.onAttach()"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [a.l.b.x0$d$b] */
    /* JADX WARN: Type inference failed for: r8v6, types: [a.l.b.x0$d$b] */
    public int d() {
        m mVar = this.f841c;
        if (mVar.r == null) {
            return mVar.f867a;
        }
        int i = this.e;
        int ordinal = mVar.M.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        m mVar2 = this.f841c;
        if (mVar2.m) {
            if (mVar2.n) {
                i = Math.max(this.e, 2);
                View view = this.f841c.E;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, mVar2.f867a) : Math.min(i, 1);
            }
        }
        if (!this.f841c.k) {
            i = Math.min(i, 1);
        }
        m mVar3 = this.f841c;
        ViewGroup viewGroup = mVar3.D;
        x0.d dVar = null;
        if (viewGroup != null) {
            x0 g = x0.g(viewGroup, mVar3.s().K());
            Objects.requireNonNull(g);
            x0.d d = g.d(this.f841c);
            x0.d dVar2 = d != null ? d.f937b : null;
            m mVar4 = this.f841c;
            Iterator<x0.d> it = g.f931c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                x0.d next = it.next();
                if (next.f938c.equals(mVar4) && !next.f) {
                    dVar = next;
                    break;
                }
            }
            dVar = (dVar == null || !(dVar2 == null || dVar2 == x0.d.b.NONE)) ? dVar2 : dVar.f937b;
        }
        if (dVar == x0.d.b.ADDING) {
            i = Math.min(i, 6);
        } else if (dVar == x0.d.b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            m mVar5 = this.f841c;
            if (mVar5.l) {
                i = mVar5.C() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        m mVar6 = this.f841c;
        if (mVar6.F && mVar6.f867a < 5) {
            i = Math.min(i, 4);
        }
        if (b0.M(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.f841c);
        }
        return i;
    }

    public void e() {
        Parcelable parcelable;
        if (b0.M(3)) {
            StringBuilder f = b.a.a.a.a.f("moveto CREATED: ");
            f.append(this.f841c);
            Log.d("FragmentManager", f.toString());
        }
        m mVar = this.f841c;
        if (!mVar.L) {
            this.f839a.h(mVar, mVar.f868b, false);
            final m mVar2 = this.f841c;
            Bundle bundle = mVar2.f868b;
            mVar2.t.T();
            mVar2.f867a = 1;
            mVar2.C = false;
            mVar2.N.a(new a.n.h() { // from class: androidx.fragment.app.Fragment$5
                @Override // a.n.h
                public void g(j jVar, f.a aVar) {
                    View view;
                    if (aVar != f.a.ON_STOP || (view = m.this.E) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
            mVar2.Q.a(bundle);
            mVar2.L(bundle);
            mVar2.L = true;
            if (mVar2.C) {
                mVar2.N.d(f.a.ON_CREATE);
                a0 a0Var = this.f839a;
                m mVar3 = this.f841c;
                a0Var.c(mVar3, mVar3.f868b, false);
                return;
            }
            throw new z0(b.a.a.a.a.c("Fragment ", mVar2, " did not call through to super.onCreate()"));
        }
        Bundle bundle2 = mVar.f868b;
        if (bundle2 != null && (parcelable = bundle2.getParcelable("android:support:fragments")) != null) {
            mVar.t.Y(parcelable);
            mVar.t.m();
        }
        this.f841c.f867a = 1;
    }

    public void f() {
        String str;
        if (this.f841c.m) {
            return;
        }
        if (b0.M(3)) {
            StringBuilder f = b.a.a.a.a.f("moveto CREATE_VIEW: ");
            f.append(this.f841c);
            Log.d("FragmentManager", f.toString());
        }
        m mVar = this.f841c;
        LayoutInflater R = mVar.R(mVar.f868b);
        mVar.K = R;
        ViewGroup viewGroup = null;
        m mVar2 = this.f841c;
        ViewGroup viewGroup2 = mVar2.D;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = mVar2.w;
            if (i != 0) {
                if (i == -1) {
                    StringBuilder f2 = b.a.a.a.a.f("Cannot create fragment ");
                    f2.append(this.f841c);
                    f2.append(" for a container view with no id");
                    throw new IllegalArgumentException(f2.toString());
                }
                viewGroup = (ViewGroup) mVar2.r.r.f(i);
                if (viewGroup == null) {
                    m mVar3 = this.f841c;
                    if (!mVar3.o) {
                        try {
                            str = mVar3.x().getResourceName(this.f841c.w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        StringBuilder f3 = b.a.a.a.a.f("No view found for id 0x");
                        f3.append(Integer.toHexString(this.f841c.w));
                        f3.append(" (");
                        f3.append(str);
                        f3.append(") for fragment ");
                        f3.append(this.f841c);
                        throw new IllegalArgumentException(f3.toString());
                    }
                }
            }
        }
        m mVar4 = this.f841c;
        mVar4.D = viewGroup;
        mVar4.e0(R, viewGroup, mVar4.f868b);
        View view = this.f841c.E;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            m mVar5 = this.f841c;
            mVar5.E.setTag(R.id.fragment_container_view_tag, mVar5);
            if (viewGroup != null) {
                b();
            }
            m mVar6 = this.f841c;
            if (mVar6.y) {
                mVar6.E.setVisibility(8);
            }
            View view2 = this.f841c.E;
            AtomicInteger atomicInteger = a.h.j.w.f667a;
            if (w.g.b(view2)) {
                w.h.c(this.f841c.E);
            } else {
                View view3 = this.f841c.E;
                view3.addOnAttachStateChangeListener(new a(this, view3));
            }
            m mVar7 = this.f841c;
            mVar7.c0();
            mVar7.t.w(2);
            a0 a0Var = this.f839a;
            m mVar8 = this.f841c;
            a0Var.m(mVar8, mVar8.E, mVar8.f868b, false);
            int visibility = this.f841c.E.getVisibility();
            this.f841c.g().n = this.f841c.E.getAlpha();
            m mVar9 = this.f841c;
            if (mVar9.D != null && visibility == 0) {
                View findFocus = mVar9.E.findFocus();
                if (findFocus != null) {
                    this.f841c.g().o = findFocus;
                    if (b0.M(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f841c);
                    }
                }
                this.f841c.E.setAlpha(0.0f);
            }
        }
        this.f841c.f867a = 2;
    }

    public void g() {
        m d;
        boolean z;
        if (b0.M(3)) {
            StringBuilder f = b.a.a.a.a.f("movefrom CREATED: ");
            f.append(this.f841c);
            Log.d("FragmentManager", f.toString());
        }
        m mVar = this.f841c;
        boolean z2 = mVar.l && !mVar.C();
        if (!(z2 || this.f840b.f848c.c(this.f841c))) {
            String str = this.f841c.h;
            if (str != null && (d = this.f840b.d(str)) != null && d.A) {
                this.f841c.g = d;
            }
            this.f841c.f867a = 0;
            return;
        }
        y<?> yVar = this.f841c.s;
        if (yVar instanceof a.n.z) {
            z = this.f840b.f848c.f;
        } else {
            Context context = yVar.f947b;
            z = context instanceof Activity ? !((Activity) context).isChangingConfigurations() : true;
        }
        if (z2 || z) {
            e0 e0Var = this.f840b.f848c;
            m mVar2 = this.f841c;
            Objects.requireNonNull(e0Var);
            if (b0.M(3)) {
                Log.d("FragmentManager", "Clearing non-config state for " + mVar2);
            }
            e0 e0Var2 = e0Var.f825c.get(mVar2.e);
            if (e0Var2 != null) {
                e0Var2.a();
                e0Var.f825c.remove(mVar2.e);
            }
            a.n.y yVar2 = e0Var.d.get(mVar2.e);
            if (yVar2 != null) {
                yVar2.a();
                e0Var.d.remove(mVar2.e);
            }
        }
        m mVar3 = this.f841c;
        mVar3.t.o();
        mVar3.N.d(f.a.ON_DESTROY);
        mVar3.f867a = 0;
        mVar3.C = false;
        mVar3.L = false;
        mVar3.C = true;
        this.f839a.d(this.f841c, false);
        Iterator it = ((ArrayList) this.f840b.f()).iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            if (h0Var != null) {
                m mVar4 = h0Var.f841c;
                if (this.f841c.e.equals(mVar4.h)) {
                    mVar4.g = this.f841c;
                    mVar4.h = null;
                }
            }
        }
        m mVar5 = this.f841c;
        String str2 = mVar5.h;
        if (str2 != null) {
            mVar5.g = this.f840b.d(str2);
        }
        this.f840b.k(this);
    }

    public void h() {
        View view;
        if (b0.M(3)) {
            StringBuilder f = b.a.a.a.a.f("movefrom CREATE_VIEW: ");
            f.append(this.f841c);
            Log.d("FragmentManager", f.toString());
        }
        m mVar = this.f841c;
        ViewGroup viewGroup = mVar.D;
        if (viewGroup != null && (view = mVar.E) != null) {
            viewGroup.removeView(view);
        }
        this.f841c.f0();
        this.f839a.n(this.f841c, false);
        m mVar2 = this.f841c;
        mVar2.D = null;
        mVar2.E = null;
        mVar2.O = null;
        mVar2.P.g(null);
        this.f841c.n = false;
    }

    public void i() {
        if (b0.M(3)) {
            StringBuilder f = b.a.a.a.a.f("movefrom ATTACHED: ");
            f.append(this.f841c);
            Log.d("FragmentManager", f.toString());
        }
        m mVar = this.f841c;
        mVar.f867a = -1;
        mVar.C = false;
        mVar.Q();
        mVar.K = null;
        if (mVar.C) {
            b0 b0Var = mVar.t;
            if (!b0Var.D) {
                b0Var.o();
                mVar.t = new c0();
            }
            this.f839a.e(this.f841c, false);
            m mVar2 = this.f841c;
            mVar2.f867a = -1;
            mVar2.s = null;
            mVar2.u = null;
            mVar2.r = null;
            if (!(mVar2.l && !mVar2.C()) && !this.f840b.f848c.c(this.f841c)) {
                return;
            }
            if (b0.M(3)) {
                StringBuilder f2 = b.a.a.a.a.f("initState called for fragment: ");
                f2.append(this.f841c);
                Log.d("FragmentManager", f2.toString());
            }
            m mVar3 = this.f841c;
            Objects.requireNonNull(mVar3);
            mVar3.N = new a.n.k(mVar3);
            mVar3.Q = new a.q.b(mVar3);
            mVar3.e = UUID.randomUUID().toString();
            mVar3.k = false;
            mVar3.l = false;
            mVar3.m = false;
            mVar3.n = false;
            mVar3.o = false;
            mVar3.q = 0;
            mVar3.r = null;
            mVar3.t = new c0();
            mVar3.s = null;
            mVar3.v = 0;
            mVar3.w = 0;
            mVar3.x = null;
            mVar3.y = false;
            mVar3.z = false;
            return;
        }
        throw new z0(b.a.a.a.a.c("Fragment ", mVar, " did not call through to super.onDetach()"));
    }

    public void j() {
        m mVar = this.f841c;
        if (!mVar.m || !mVar.n || mVar.p) {
            return;
        }
        if (b0.M(3)) {
            StringBuilder f = b.a.a.a.a.f("moveto CREATE_VIEW: ");
            f.append(this.f841c);
            Log.d("FragmentManager", f.toString());
        }
        m mVar2 = this.f841c;
        LayoutInflater R = mVar2.R(mVar2.f868b);
        mVar2.K = R;
        mVar2.e0(R, null, this.f841c.f868b);
        View view = this.f841c.E;
        if (view == null) {
            return;
        }
        view.setSaveFromParentEnabled(false);
        m mVar3 = this.f841c;
        mVar3.E.setTag(R.id.fragment_container_view_tag, mVar3);
        m mVar4 = this.f841c;
        if (mVar4.y) {
            mVar4.E.setVisibility(8);
        }
        m mVar5 = this.f841c;
        mVar5.c0();
        mVar5.t.w(2);
        a0 a0Var = this.f839a;
        m mVar6 = this.f841c;
        a0Var.m(mVar6, mVar6.E, mVar6.f868b, false);
        this.f841c.f867a = 2;
    }

    public void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        x0.d.b bVar = x0.d.b.NONE;
        if (this.d) {
            if (!b0.M(2)) {
                return;
            }
            StringBuilder f = b.a.a.a.a.f("Ignoring re-entrant call to moveToExpectedState() for ");
            f.append(this.f841c);
            Log.v("FragmentManager", f.toString());
            return;
        }
        try {
            this.d = true;
            while (true) {
                int d = d();
                m mVar = this.f841c;
                int i = mVar.f867a;
                if (d == i) {
                    if (mVar.I) {
                        if (mVar.E != null && (viewGroup = mVar.D) != null) {
                            x0 g = x0.g(viewGroup, mVar.s().K());
                            if (this.f841c.y) {
                                Objects.requireNonNull(g);
                                if (b0.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f841c);
                                }
                                g.a(x0.d.c.GONE, bVar, this);
                            } else {
                                Objects.requireNonNull(g);
                                if (b0.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f841c);
                                }
                                g.a(x0.d.c.VISIBLE, bVar, this);
                            }
                        }
                        m mVar2 = this.f841c;
                        b0 b0Var = mVar2.r;
                        if (b0Var != null && mVar2.k && b0Var.N(mVar2)) {
                            b0Var.A = true;
                        }
                        m mVar3 = this.f841c;
                        mVar3.I = false;
                        mVar3.S();
                    }
                    return;
                } else if (d > i) {
                    switch (i + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (mVar.E != null && (viewGroup2 = mVar.D) != null) {
                                x0 g2 = x0.g(viewGroup2, mVar.s().K());
                                x0.d.c b2 = x0.d.c.b(this.f841c.E.getVisibility());
                                Objects.requireNonNull(g2);
                                if (b0.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f841c);
                                }
                                g2.a(b2, x0.d.b.ADDING, this);
                            }
                            this.f841c.f867a = 4;
                            continue;
                        case 5:
                            p();
                            continue;
                        case 6:
                            mVar.f867a = 6;
                            continue;
                        case 7:
                            n();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            g();
                            continue;
                        case 1:
                            h();
                            this.f841c.f867a = 1;
                            continue;
                        case 2:
                            mVar.n = false;
                            mVar.f867a = 2;
                            continue;
                        case 3:
                            if (b0.M(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f841c);
                            }
                            m mVar4 = this.f841c;
                            if (mVar4.E != null && mVar4.f869c == null) {
                                o();
                            }
                            m mVar5 = this.f841c;
                            if (mVar5.E != null && (viewGroup3 = mVar5.D) != null) {
                                x0 g3 = x0.g(viewGroup3, mVar5.s().K());
                                Objects.requireNonNull(g3);
                                if (b0.M(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f841c);
                                }
                                g3.a(x0.d.c.REMOVED, x0.d.b.REMOVING, this);
                            }
                            this.f841c.f867a = 3;
                            continue;
                        case 4:
                            q();
                            continue;
                        case 5:
                            mVar.f867a = 5;
                            continue;
                        case 6:
                            l();
                            continue;
                        default:
                            continue;
                    }
                }
            }
        } finally {
            this.d = false;
        }
    }

    public void l() {
        if (b0.M(3)) {
            StringBuilder f = b.a.a.a.a.f("movefrom RESUMED: ");
            f.append(this.f841c);
            Log.d("FragmentManager", f.toString());
        }
        m mVar = this.f841c;
        mVar.t.w(5);
        if (mVar.E != null) {
            mVar.O.b(f.a.ON_PAUSE);
        }
        mVar.N.d(f.a.ON_PAUSE);
        mVar.f867a = 6;
        mVar.C = false;
        mVar.C = true;
        this.f839a.f(this.f841c, false);
    }

    public void m(ClassLoader classLoader) {
        Bundle bundle = this.f841c.f868b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        m mVar = this.f841c;
        mVar.f869c = mVar.f868b.getSparseParcelableArray("android:view_state");
        m mVar2 = this.f841c;
        mVar2.d = mVar2.f868b.getBundle("android:view_registry_state");
        m mVar3 = this.f841c;
        mVar3.h = mVar3.f868b.getString("android:target_state");
        m mVar4 = this.f841c;
        if (mVar4.h != null) {
            mVar4.i = mVar4.f868b.getInt("android:target_req_state", 0);
        }
        m mVar5 = this.f841c;
        Objects.requireNonNull(mVar5);
        mVar5.G = mVar5.f868b.getBoolean("android:user_visible_hint", true);
        m mVar6 = this.f841c;
        if (mVar6.G) {
            return;
        }
        mVar6.F = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n() {
        /*
            r8 = this;
            r0 = 3
            boolean r0 = a.l.b.b0.M(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L1b
            java.lang.String r0 = "moveto RESUMED: "
            java.lang.StringBuilder r0 = b.a.a.a.a.f(r0)
            a.l.b.m r2 = r8.f841c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1b:
            a.l.b.m r0 = r8.f841c
            a.l.b.m$b r2 = r0.H
            r3 = 0
            if (r2 != 0) goto L24
            r2 = r3
            goto L26
        L24:
            android.view.View r2 = r2.o
        L26:
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L8d
            android.view.View r0 = r0.E
            if (r2 != r0) goto L2f
            goto L3b
        L2f:
            android.view.ViewParent r0 = r2.getParent()
        L33:
            if (r0 == 0) goto L42
            a.l.b.m r6 = r8.f841c
            android.view.View r6 = r6.E
            if (r0 != r6) goto L3d
        L3b:
            r0 = r4
            goto L43
        L3d:
            android.view.ViewParent r0 = r0.getParent()
            goto L33
        L42:
            r0 = r5
        L43:
            if (r0 == 0) goto L8d
            boolean r0 = r2.requestFocus()
            r6 = 2
            boolean r6 = a.l.b.b0.M(r6)
            if (r6 == 0) goto L8d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "requestFocus: Restoring focused view "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " "
            r6.append(r2)
            if (r0 == 0) goto L67
            java.lang.String r0 = "succeeded"
            goto L69
        L67:
            java.lang.String r0 = "failed"
        L69:
            r6.append(r0)
            java.lang.String r0 = " on Fragment "
            r6.append(r0)
            a.l.b.m r0 = r8.f841c
            r6.append(r0)
            java.lang.String r0 = " resulting in focused view "
            r6.append(r0)
            a.l.b.m r0 = r8.f841c
            android.view.View r0 = r0.E
            android.view.View r0 = r0.findFocus()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.v(r1, r0)
        L8d:
            a.l.b.m r0 = r8.f841c
            r0.o0(r3)
            a.l.b.m r0 = r8.f841c
            a.l.b.b0 r1 = r0.t
            r1.T()
            a.l.b.b0 r1 = r0.t
            r1.C(r4)
            r1 = 7
            r0.f867a = r1
            r0.C = r5
            r0.C = r4
            a.n.k r2 = r0.N
            a.n.f$a r4 = a.n.f.a.ON_RESUME
            r2.d(r4)
            android.view.View r2 = r0.E
            if (r2 == 0) goto Lb5
            a.l.b.v0 r2 = r0.O
            r2.b(r4)
        Lb5:
            a.l.b.b0 r0 = r0.t
            r0.B = r5
            r0.C = r5
            a.l.b.e0 r2 = r0.J
            r2.g = r5
            r0.w(r1)
            a.l.b.a0 r0 = r8.f839a
            a.l.b.m r1 = r8.f841c
            r0.i(r1, r5)
            a.l.b.m r0 = r8.f841c
            r0.f868b = r3
            r0.f869c = r3
            r0.d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.b.h0.n():void");
    }

    public void o() {
        if (this.f841c.E == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f841c.E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f841c.f869c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f841c.O.f924c.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f841c.d = bundle;
    }

    public void p() {
        if (b0.M(3)) {
            StringBuilder f = b.a.a.a.a.f("moveto STARTED: ");
            f.append(this.f841c);
            Log.d("FragmentManager", f.toString());
        }
        m mVar = this.f841c;
        mVar.t.T();
        mVar.t.C(true);
        mVar.f867a = 5;
        mVar.C = false;
        mVar.a0();
        if (mVar.C) {
            a.n.k kVar = mVar.N;
            f.a aVar = f.a.ON_START;
            kVar.d(aVar);
            if (mVar.E != null) {
                mVar.O.b(aVar);
            }
            b0 b0Var = mVar.t;
            b0Var.B = false;
            b0Var.C = false;
            b0Var.J.g = false;
            b0Var.w(5);
            this.f839a.k(this.f841c, false);
            return;
        }
        throw new z0(b.a.a.a.a.c("Fragment ", mVar, " did not call through to super.onStart()"));
    }

    public void q() {
        if (b0.M(3)) {
            StringBuilder f = b.a.a.a.a.f("movefrom STARTED: ");
            f.append(this.f841c);
            Log.d("FragmentManager", f.toString());
        }
        m mVar = this.f841c;
        b0 b0Var = mVar.t;
        b0Var.C = true;
        b0Var.J.g = true;
        b0Var.w(4);
        if (mVar.E != null) {
            mVar.O.b(f.a.ON_STOP);
        }
        mVar.N.d(f.a.ON_STOP);
        mVar.f867a = 4;
        mVar.C = false;
        mVar.b0();
        if (mVar.C) {
            this.f839a.l(this.f841c, false);
            return;
        }
        throw new z0(b.a.a.a.a.c("Fragment ", mVar, " did not call through to super.onStop()"));
    }
}
