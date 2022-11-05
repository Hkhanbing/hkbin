package a.b.c;

import a.b.c.a;
import a.b.e.a;
import a.b.e.i.g;
import a.b.f.j0;
import a.h.j.a0;
import a.h.j.w;
import a.h.j.x;
import a.h.j.y;
import a.h.j.z;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import de.cybersecurityrumble.threelittlekeys.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class s extends a.b.c.a implements ActionBarOverlayLayout.d {

    /* renamed from: a  reason: collision with root package name */
    public Context f66a;

    /* renamed from: b  reason: collision with root package name */
    public Context f67b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f68c;
    public ActionBarContainer d;
    public j0 e;
    public ActionBarContextView f;
    public View g;
    public boolean h;
    public d i;
    public a.b.e.a j;
    public a.InterfaceC0003a k;
    public boolean l;
    public ArrayList<a.b> m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public a.b.e.g t;
    public boolean u;
    public boolean v;
    public final y w;
    public final y x;
    public final a0 y;
    public static final Interpolator z = new AccelerateInterpolator();
    public static final Interpolator A = new DecelerateInterpolator();

    /* loaded from: classes.dex */
    public class a extends z {
        public a() {
        }

        @Override // a.h.j.y
        public void a(View view) {
            View view2;
            s sVar = s.this;
            if (sVar.p && (view2 = sVar.g) != null) {
                view2.setTranslationY(0.0f);
                s.this.d.setTranslationY(0.0f);
            }
            s.this.d.setVisibility(8);
            s.this.d.setTransitioning(false);
            s sVar2 = s.this;
            sVar2.t = null;
            a.InterfaceC0003a interfaceC0003a = sVar2.k;
            if (interfaceC0003a != null) {
                interfaceC0003a.b(sVar2.j);
                sVar2.j = null;
                sVar2.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = s.this.f68c;
            if (actionBarOverlayLayout != null) {
                AtomicInteger atomicInteger = w.f667a;
                w.h.c(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends z {
        public b() {
        }

        @Override // a.h.j.y
        public void a(View view) {
            s sVar = s.this;
            sVar.t = null;
            sVar.d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c implements a0 {
        public c() {
        }
    }

    /* loaded from: classes.dex */
    public class d extends a.b.e.a implements g.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f72c;
        public final a.b.e.i.g d;
        public a.InterfaceC0003a e;
        public WeakReference<View> f;

        public d(Context context, a.InterfaceC0003a interfaceC0003a) {
            this.f72c = context;
            this.e = interfaceC0003a;
            a.b.e.i.g gVar = new a.b.e.i.g(context);
            gVar.l = 1;
            this.d = gVar;
            gVar.e = this;
        }

        @Override // a.b.e.i.g.a
        public void a(a.b.e.i.g gVar) {
            if (this.e == null) {
                return;
            }
            i();
            a.b.f.d dVar = s.this.f.d;
            if (dVar == null) {
                return;
            }
            dVar.n();
        }

        @Override // a.b.e.i.g.a
        public boolean b(a.b.e.i.g gVar, MenuItem menuItem) {
            a.InterfaceC0003a interfaceC0003a = this.e;
            if (interfaceC0003a != null) {
                return interfaceC0003a.c(this, menuItem);
            }
            return false;
        }

        @Override // a.b.e.a
        public void c() {
            s sVar = s.this;
            if (sVar.i != this) {
                return;
            }
            if (!(!sVar.q)) {
                sVar.j = this;
                sVar.k = this.e;
            } else {
                this.e.b(this);
            }
            this.e = null;
            s.this.d(false);
            ActionBarContextView actionBarContextView = s.this.f;
            if (actionBarContextView.k == null) {
                actionBarContextView.h();
            }
            s sVar2 = s.this;
            sVar2.f68c.setHideOnContentScrollEnabled(sVar2.v);
            s.this.i = null;
        }

        @Override // a.b.e.a
        public View d() {
            WeakReference<View> weakReference = this.f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // a.b.e.a
        public Menu e() {
            return this.d;
        }

        @Override // a.b.e.a
        public MenuInflater f() {
            return new a.b.e.f(this.f72c);
        }

        @Override // a.b.e.a
        public CharSequence g() {
            return s.this.f.getSubtitle();
        }

        @Override // a.b.e.a
        public CharSequence h() {
            return s.this.f.getTitle();
        }

        @Override // a.b.e.a
        public void i() {
            if (s.this.i != this) {
                return;
            }
            this.d.z();
            try {
                this.e.a(this, this.d);
            } finally {
                this.d.y();
            }
        }

        @Override // a.b.e.a
        public boolean j() {
            return s.this.f.s;
        }

        @Override // a.b.e.a
        public void k(View view) {
            s.this.f.setCustomView(view);
            this.f = new WeakReference<>(view);
        }

        @Override // a.b.e.a
        public void l(int i) {
            s.this.f.setSubtitle(s.this.f66a.getResources().getString(i));
        }

        @Override // a.b.e.a
        public void m(CharSequence charSequence) {
            s.this.f.setSubtitle(charSequence);
        }

        @Override // a.b.e.a
        public void n(int i) {
            s.this.f.setTitle(s.this.f66a.getResources().getString(i));
        }

        @Override // a.b.e.a
        public void o(CharSequence charSequence) {
            s.this.f.setTitle(charSequence);
        }

        @Override // a.b.e.a
        public void p(boolean z) {
            this.f75b = z;
            s.this.f.setTitleOptional(z);
        }
    }

    public s(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new a();
        this.x = new b();
        this.y = new c();
        View decorView = activity.getWindow().getDecorView();
        e(decorView);
        if (!z2) {
            this.g = decorView.findViewById(16908290);
        }
    }

    public s(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new a();
        this.x = new b();
        this.y = new c();
        e(dialog.getWindow().getDecorView());
    }

    @Override // a.b.c.a
    public void a(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            this.m.get(i).a(z2);
        }
    }

    @Override // a.b.c.a
    public Context b() {
        if (this.f67b == null) {
            TypedValue typedValue = new TypedValue();
            this.f66a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f67b = new ContextThemeWrapper(this.f66a, i);
            } else {
                this.f67b = this.f66a;
            }
        }
        return this.f67b;
    }

    @Override // a.b.c.a
    public void c(boolean z2) {
        if (!this.h) {
            int i = z2 ? 4 : 0;
            int j = this.e.j();
            this.h = true;
            this.e.t((i & 4) | (j & (-5)));
        }
    }

    public void d(boolean z2) {
        x i;
        x e;
        if (z2) {
            if (!this.r) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f68c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g(false);
            }
        } else if (this.r) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f68c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        AtomicInteger atomicInteger = w.f667a;
        if (!w.g.c(actionBarContainer)) {
            if (z2) {
                this.e.k(4);
                this.f.setVisibility(0);
                return;
            }
            this.e.k(0);
            this.f.setVisibility(8);
            return;
        }
        if (z2) {
            e = this.e.i(4, 100L);
            i = this.f.e(0, 200L);
        } else {
            i = this.e.i(0, 200L);
            e = this.f.e(8, 100L);
        }
        a.b.e.g gVar = new a.b.e.g();
        gVar.f94a.add(e);
        View view = e.f678a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = i.f678a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        gVar.f94a.add(i);
        gVar.b();
    }

    public final void e(View view) {
        j0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f68c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof j0) {
            wrapper = (j0) findViewById;
        } else if (!(findViewById instanceof Toolbar)) {
            StringBuilder f = b.a.a.a.a.f("Can't make a decor toolbar out of ");
            f.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(f.toString());
        } else {
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.d = actionBarContainer;
        j0 j0Var = this.e;
        if (j0Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(s.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f66a = j0Var.s();
        boolean z2 = (this.e.j() & 4) != 0;
        if (z2) {
            this.h = true;
        }
        Context context = this.f66a;
        this.e.p((context.getApplicationInfo().targetSdkVersion < 14) || z2);
        f(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f66a.obtainStyledAttributes(null, a.b.b.f13a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f68c;
            if (!actionBarOverlayLayout2.h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            AtomicInteger atomicInteger = w.f667a;
            w.i.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void f(boolean z2) {
        this.n = z2;
        if (!z2) {
            this.e.o(null);
            this.d.setTabContainer(null);
        } else {
            this.d.setTabContainer(null);
            this.e.o(null);
        }
        boolean z3 = true;
        boolean z4 = this.e.u() == 2;
        this.e.r(!this.n && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f68c;
        if (this.n || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    public final void g(boolean z2) {
        View view;
        int[] iArr;
        View view2;
        View view3;
        int[] iArr2;
        if (!(this.r || !this.q)) {
            if (!this.s) {
                return;
            }
            this.s = false;
            a.b.e.g gVar = this.t;
            if (gVar != null) {
                gVar.a();
            }
            if (this.o != 0 || (!this.u && !z2)) {
                this.w.a(null);
                return;
            }
            this.d.setAlpha(1.0f);
            this.d.setTransitioning(true);
            a.b.e.g gVar2 = new a.b.e.g();
            float f = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            x b2 = w.b(this.d);
            b2.g(f);
            b2.f(this.y);
            if (!gVar2.e) {
                gVar2.f94a.add(b2);
            }
            if (this.p && (view = this.g) != null) {
                x b3 = w.b(view);
                b3.g(f);
                if (!gVar2.e) {
                    gVar2.f94a.add(b3);
                }
            }
            Interpolator interpolator = z;
            boolean z3 = gVar2.e;
            if (!z3) {
                gVar2.f96c = interpolator;
            }
            if (!z3) {
                gVar2.f95b = 250L;
            }
            y yVar = this.w;
            if (!z3) {
                gVar2.d = yVar;
            }
            this.t = gVar2;
            gVar2.b();
        } else if (this.s) {
        } else {
            this.s = true;
            a.b.e.g gVar3 = this.t;
            if (gVar3 != null) {
                gVar3.a();
            }
            this.d.setVisibility(0);
            if (this.o != 0 || (!this.u && !z2)) {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.p && (view2 = this.g) != null) {
                    view2.setTranslationY(0.0f);
                }
                this.x.a(null);
            } else {
                this.d.setTranslationY(0.0f);
                float f2 = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr2[1];
                }
                this.d.setTranslationY(f2);
                a.b.e.g gVar4 = new a.b.e.g();
                x b4 = w.b(this.d);
                b4.g(0.0f);
                b4.f(this.y);
                if (!gVar4.e) {
                    gVar4.f94a.add(b4);
                }
                if (this.p && (view3 = this.g) != null) {
                    view3.setTranslationY(f2);
                    x b5 = w.b(this.g);
                    b5.g(0.0f);
                    if (!gVar4.e) {
                        gVar4.f94a.add(b5);
                    }
                }
                Interpolator interpolator2 = A;
                boolean z4 = gVar4.e;
                if (!z4) {
                    gVar4.f96c = interpolator2;
                }
                if (!z4) {
                    gVar4.f95b = 250L;
                }
                y yVar2 = this.x;
                if (!z4) {
                    gVar4.d = yVar2;
                }
                this.t = gVar4;
                gVar4.b();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f68c;
            if (actionBarOverlayLayout == null) {
                return;
            }
            AtomicInteger atomicInteger = w.f667a;
            w.h.c(actionBarOverlayLayout);
        }
    }
}
