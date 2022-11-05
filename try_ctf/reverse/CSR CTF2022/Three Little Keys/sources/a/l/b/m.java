package a.l.b;

import a.l.b.b0;
import a.n.f;
import a.o.a.b;
import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import de.cybersecurityrumble.threelittlekeys.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class m implements ComponentCallbacks, View.OnCreateContextMenuListener, a.n.j, a.n.z, a.q.c {
    public static final Object S = new Object();
    public boolean A;
    public boolean C;
    public ViewGroup D;
    public View E;
    public boolean F;
    public b H;
    public boolean I;
    public float J;
    public LayoutInflater K;
    public boolean L;
    public a.n.k N;
    public v0 O;
    public a.q.b Q;
    public final ArrayList<d> R;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f868b;

    /* renamed from: c  reason: collision with root package name */
    public SparseArray<Parcelable> f869c;
    public Bundle d;
    public Bundle f;
    public m g;
    public int i;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public b0 r;
    public y<?> s;
    public m u;
    public int v;
    public int w;
    public String x;
    public boolean y;
    public boolean z;

    /* renamed from: a  reason: collision with root package name */
    public int f867a = -1;
    public String e = UUID.randomUUID().toString();
    public String h = null;
    public Boolean j = null;
    public b0 t = new c0();
    public boolean B = true;
    public boolean G = true;
    public f.b M = f.b.RESUMED;
    public a.n.o<a.n.j> P = new a.n.o<>();

    /* loaded from: classes.dex */
    public class a extends v {
        public a() {
        }

        @Override // a.l.b.v
        public View f(int i) {
            View view = m.this.E;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder f = b.a.a.a.a.f("Fragment ");
            f.append(m.this);
            f.append(" does not have a view");
            throw new IllegalStateException(f.toString());
        }

        @Override // a.l.b.v
        public boolean h() {
            return m.this.E != null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f871a;

        /* renamed from: b  reason: collision with root package name */
        public Animator f872b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f873c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public ArrayList<String> i;
        public ArrayList<String> j;
        public Object k;
        public Object l;
        public Object m;
        public float n;
        public View o;
        public e p;
        public boolean q;

        public b() {
            Object obj = m.S;
            this.k = obj;
            this.l = obj;
            this.m = obj;
            this.n = 1.0f;
            this.o = null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RuntimeException {
        public c(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public abstract void a();
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public m() {
        new AtomicInteger();
        this.R = new ArrayList<>();
        this.N = new a.n.k(this);
        this.Q = new a.q.b(this);
    }

    public Object A() {
        b bVar = this.H;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.m;
        if (obj != S) {
            return obj;
        }
        z();
        return null;
    }

    public final String B(int i) {
        return x().getString(i);
    }

    public final boolean C() {
        return this.q > 0;
    }

    public boolean D() {
        b bVar = this.H;
        return false;
    }

    public final boolean E() {
        m mVar = this.u;
        return mVar != null && (mVar.l || mVar.E());
    }

    @Deprecated
    public void F() {
        this.C = true;
    }

    @Deprecated
    public void G(int i, int i2, Intent intent) {
        if (b0.M(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @Deprecated
    public void H() {
        this.C = true;
    }

    public void I(Context context) {
        this.C = true;
        y<?> yVar = this.s;
        if ((yVar == null ? null : yVar.f946a) != null) {
            this.C = false;
            H();
        }
    }

    @Deprecated
    public void J() {
    }

    public boolean K() {
        return false;
    }

    public void L(Bundle bundle) {
        Parcelable parcelable;
        boolean z = true;
        this.C = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.t.Y(parcelable);
            this.t.m();
        }
        b0 b0Var = this.t;
        if (b0Var.p < 1) {
            z = false;
        }
        if (!z) {
            b0Var.m();
        }
    }

    public Animation M() {
        return null;
    }

    public Animator N() {
        return null;
    }

    public View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void P() {
        this.C = true;
    }

    public void Q() {
        this.C = true;
    }

    public LayoutInflater R(Bundle bundle) {
        return q();
    }

    public void S() {
    }

    @Deprecated
    public void T() {
        this.C = true;
    }

    public void U(AttributeSet attributeSet, Bundle bundle) {
        this.C = true;
        y<?> yVar = this.s;
        if ((yVar == null ? null : yVar.f946a) != null) {
            this.C = false;
            T();
        }
    }

    public void V() {
    }

    public void W() {
    }

    public void X() {
    }

    @Deprecated
    public void Y() {
    }

    public void Z(Bundle bundle) {
    }

    @Override // a.n.j
    public a.n.f a() {
        return this.N;
    }

    public void a0() {
        this.C = true;
    }

    public v b() {
        return new a();
    }

    public void b0() {
        this.C = true;
    }

    public void c0() {
    }

    @Override // a.q.c
    public final a.q.a d() {
        return this.Q.f1072b;
    }

    public void d0(Bundle bundle) {
        this.C = true;
    }

    @Override // a.n.z
    public a.n.y e() {
        if (this.r != null) {
            if (r() != 1) {
                e0 e0Var = this.r.J;
                a.n.y yVar = e0Var.d.get(this.e);
                if (yVar != null) {
                    return yVar;
                }
                a.n.y yVar2 = new a.n.y();
                e0Var.d.put(this.e, yVar2);
                return yVar2;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void e0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.t.T();
        boolean z = true;
        this.p = true;
        this.O = new v0(this, e());
        View O = O(layoutInflater, viewGroup, bundle);
        this.E = O;
        if (O != null) {
            this.O.f();
            this.E.setTag(R.id.view_tree_lifecycle_owner, this.O);
            this.E.setTag(R.id.view_tree_view_model_store_owner, this.O);
            this.E.setTag(R.id.view_tree_saved_state_registry_owner, this.O);
            this.P.g(this.O);
            return;
        }
        if (this.O.f923b == null) {
            z = false;
        }
        if (z) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.O = null;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.v));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.w));
        printWriter.print(" mTag=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f867a);
        printWriter.print(" mWho=");
        printWriter.print(this.e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.k);
        printWriter.print(" mRemoving=");
        printWriter.print(this.l);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.m);
        printWriter.print(" mInLayout=");
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.y);
        printWriter.print(" mDetached=");
        printWriter.print(this.z);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.B);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.A);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.G);
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.r);
        }
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.s);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.u);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f);
        }
        if (this.f868b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f868b);
        }
        if (this.f869c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f869c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.d);
        }
        m mVar = this.g;
        if (mVar == null) {
            b0 b0Var = this.r;
            mVar = (b0Var == null || (str2 = this.h) == null) ? null : b0Var.f793c.d(str2);
        }
        if (mVar != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(mVar);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.i);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(t());
        if (k() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(k());
        }
        if (n() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(n());
        }
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(u());
        }
        if (v() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(v());
        }
        if (this.D != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.D);
        }
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.E);
        }
        if (h() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(h());
        }
        if (j() != null) {
            a.o.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.t + ":");
        this.t.y(b.a.a.a.a.d(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public void f0() {
        this.t.w(1);
        if (this.E != null) {
            v0 v0Var = this.O;
            v0Var.f();
            if (v0Var.f923b.f969b.compareTo(f.b.CREATED) >= 0) {
                this.O.b(f.a.ON_DESTROY);
            }
        }
        this.f867a = 1;
        this.C = false;
        P();
        if (this.C) {
            b.C0027b c0027b = ((a.o.a.b) a.o.a.a.b(this)).f985b;
            int g = c0027b.f987b.g();
            for (int i = 0; i < g; i++) {
                Objects.requireNonNull(c0027b.f987b.h(i));
            }
            this.p = false;
            return;
        }
        throw new z0(b.a.a.a.a.c("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public final b g() {
        if (this.H == null) {
            this.H = new b();
        }
        return this.H;
    }

    public void g0() {
        onLowMemory();
        this.t.p();
    }

    public View h() {
        b bVar = this.H;
        if (bVar == null) {
            return null;
        }
        return bVar.f871a;
    }

    public boolean h0(Menu menu) {
        if (!this.y) {
            return false | this.t.v(menu);
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final b0 i() {
        if (this.s != null) {
            return this.t;
        }
        throw new IllegalStateException(b.a.a.a.a.c("Fragment ", this, " has not been attached yet."));
    }

    public final Context i0() {
        Context j = j();
        if (j != null) {
            return j;
        }
        throw new IllegalStateException(b.a.a.a.a.c("Fragment ", this, " not attached to a context."));
    }

    public Context j() {
        y<?> yVar = this.s;
        if (yVar == null) {
            return null;
        }
        return yVar.f947b;
    }

    public final View j0() {
        View view = this.E;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(b.a.a.a.a.c("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public int k() {
        b bVar = this.H;
        if (bVar == null) {
            return 0;
        }
        return bVar.d;
    }

    public void k0(View view) {
        g().f871a = view;
    }

    public Object l() {
        b bVar = this.H;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public void l0(int i, int i2, int i3, int i4) {
        if (this.H == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        g().d = i;
        g().e = i2;
        g().f = i3;
        g().g = i4;
    }

    public void m() {
        b bVar = this.H;
        if (bVar == null) {
            return;
        }
        Objects.requireNonNull(bVar);
    }

    public void m0(Animator animator) {
        g().f872b = animator;
    }

    public int n() {
        b bVar = this.H;
        if (bVar == null) {
            return 0;
        }
        return bVar.e;
    }

    public void n0(Bundle bundle) {
        b0 b0Var = this.r;
        if (b0Var != null) {
            if (b0Var == null ? false : b0Var.Q()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f = bundle;
    }

    public Object o() {
        b bVar = this.H;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public void o0(View view) {
        g().o = null;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        y<?> yVar = this.s;
        p pVar = yVar == null ? null : (p) yVar.f946a;
        if (pVar != null) {
            pVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException(b.a.a.a.a.c("Fragment ", this, " not attached to an activity."));
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.C = true;
    }

    public void p() {
        b bVar = this.H;
        if (bVar == null) {
            return;
        }
        Objects.requireNonNull(bVar);
    }

    public void p0(boolean z) {
        g().q = z;
    }

    @Deprecated
    public LayoutInflater q() {
        y<?> yVar = this.s;
        if (yVar != null) {
            LayoutInflater j = yVar.j();
            j.setFactory2(this.t.f);
            return j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void q0(e eVar) {
        g();
        e eVar2 = this.H.p;
        if (eVar == eVar2) {
            return;
        }
        if (eVar != null && eVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        } else if (eVar == null) {
        } else {
            ((b0.n) eVar).f809c++;
        }
    }

    public final int r() {
        f.b bVar = this.M;
        return (bVar == f.b.INITIALIZED || this.u == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.u.r());
    }

    public void r0(boolean z) {
        if (this.H == null) {
            return;
        }
        g().f873c = z;
    }

    public final b0 s() {
        b0 b0Var = this.r;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException(b.a.a.a.a.c("Fragment ", this, " not associated with a fragment manager."));
    }

    public void s0() {
        if (this.H != null) {
            Objects.requireNonNull(g());
        }
    }

    public boolean t() {
        b bVar = this.H;
        if (bVar == null) {
            return false;
        }
        return bVar.f873c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.e);
        if (this.v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.v));
        }
        if (this.x != null) {
            sb.append(" tag=");
            sb.append(this.x);
        }
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        b bVar = this.H;
        if (bVar == null) {
            return 0;
        }
        return bVar.f;
    }

    public int v() {
        b bVar = this.H;
        if (bVar == null) {
            return 0;
        }
        return bVar.g;
    }

    public Object w() {
        b bVar = this.H;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.l;
        if (obj != S) {
            return obj;
        }
        o();
        return null;
    }

    public final Resources x() {
        return i0().getResources();
    }

    public Object y() {
        b bVar = this.H;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.k;
        if (obj != S) {
            return obj;
        }
        l();
        return null;
    }

    public Object z() {
        b bVar = this.H;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }
}
