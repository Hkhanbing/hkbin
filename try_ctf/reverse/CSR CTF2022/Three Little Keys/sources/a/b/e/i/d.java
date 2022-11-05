package a.b.e.i;

import a.b.e.i.m;
import a.b.f.r0;
import a.b.f.s0;
import a.h.j.w;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;

    /* renamed from: b  reason: collision with root package name */
    public final Context f110b;

    /* renamed from: c  reason: collision with root package name */
    public final int f111c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public View o;
    public View p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean w;
    public m.a x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;
    public final List<g> h = new ArrayList();
    public final List<C0004d> i = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    public final View.OnAttachStateChangeListener k = new b();
    public final r0 l = new c();
    public int m = 0;
    public int n = 0;
    public boolean v = false;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.a() || d.this.i.size() <= 0 || d.this.i.get(0).f118a.y) {
                return;
            }
            View view = d.this.p;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            for (C0004d c0004d : d.this.i) {
                c0004d.f118a.i();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.y = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.y.removeGlobalOnLayoutListener(dVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements r0 {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ C0004d f115a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ MenuItem f116b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ g f117c;

            public a(C0004d c0004d, MenuItem menuItem, g gVar) {
                this.f115a = c0004d;
                this.f116b = menuItem;
                this.f117c = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0004d c0004d = this.f115a;
                if (c0004d != null) {
                    d.this.A = true;
                    c0004d.f119b.c(false);
                    d.this.A = false;
                }
                if (!this.f116b.isEnabled() || !this.f116b.hasSubMenu()) {
                    return;
                }
                this.f117c.r(this.f116b, 4);
            }
        }

        public c() {
        }

        @Override // a.b.f.r0
        public void g(g gVar, MenuItem menuItem) {
            C0004d c0004d = null;
            d.this.g.removeCallbacksAndMessages(null);
            int size = d.this.i.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.i.get(i).f119b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            if (i2 < d.this.i.size()) {
                c0004d = d.this.i.get(i2);
            }
            d.this.g.postAtTime(new a(c0004d, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // a.b.f.r0
        public void k(g gVar, MenuItem menuItem) {
            d.this.g.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: a.b.e.i.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0004d {

        /* renamed from: a  reason: collision with root package name */
        public final s0 f118a;

        /* renamed from: b  reason: collision with root package name */
        public final g f119b;

        /* renamed from: c  reason: collision with root package name */
        public final int f120c;

        public C0004d(s0 s0Var, g gVar, int i) {
            this.f118a = s0Var;
            this.f119b = gVar;
            this.f120c = i;
        }
    }

    public d(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.f110b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        AtomicInteger atomicInteger = w.f667a;
        this.q = w.e.d(view) != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.f111c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.g = new Handler();
    }

    @Override // a.b.e.i.p
    public boolean a() {
        return this.i.size() > 0 && this.i.get(0).f118a.a();
    }

    @Override // a.b.e.i.m
    public void b(g gVar, boolean z) {
        int i;
        int size = this.i.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (gVar == this.i.get(i2).f119b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < this.i.size()) {
            this.i.get(i3).f119b.c(false);
        }
        C0004d remove = this.i.remove(i2);
        remove.f119b.u(this);
        if (this.A) {
            remove.f118a.z.setExitTransition(null);
            remove.f118a.z.setAnimationStyle(0);
        }
        remove.f118a.dismiss();
        int size2 = this.i.size();
        if (size2 > 0) {
            i = this.i.get(size2 - 1).f120c;
        } else {
            View view = this.o;
            AtomicInteger atomicInteger = w.f667a;
            i = w.e.d(view) == 1 ? 0 : 1;
        }
        this.q = i;
        if (size2 != 0) {
            if (!z) {
                return;
            }
            this.i.get(0).f119b.c(false);
            return;
        }
        dismiss();
        m.a aVar = this.x;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.j);
            }
            this.y = null;
        }
        this.p.removeOnAttachStateChangeListener(this.k);
        this.z.onDismiss();
    }

    @Override // a.b.e.i.m
    public void d(m.a aVar) {
        this.x = aVar;
    }

    @Override // a.b.e.i.p
    public void dismiss() {
        int size = this.i.size();
        if (size > 0) {
            C0004d[] c0004dArr = (C0004d[]) this.i.toArray(new C0004d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0004d c0004d = c0004dArr[i];
                if (c0004d.f118a.a()) {
                    c0004d.f118a.dismiss();
                }
            }
        }
    }

    @Override // a.b.e.i.p
    public ListView e() {
        if (this.i.isEmpty()) {
            return null;
        }
        List<C0004d> list = this.i;
        return list.get(list.size() - 1).f118a.f275c;
    }

    @Override // a.b.e.i.m
    public boolean f(r rVar) {
        for (C0004d c0004d : this.i) {
            if (rVar == c0004d.f119b) {
                c0004d.f118a.f275c.requestFocus();
                return true;
            }
        }
        if (rVar.hasVisibleItems()) {
            rVar.b(this, this.f110b);
            if (a()) {
                w(rVar);
            } else {
                this.h.add(rVar);
            }
            m.a aVar = this.x;
            if (aVar != null) {
                aVar.c(rVar);
            }
            return true;
        }
        return false;
    }

    @Override // a.b.e.i.m
    public boolean g() {
        return false;
    }

    @Override // a.b.e.i.m
    public void h(boolean z) {
        for (C0004d c0004d : this.i) {
            ListAdapter adapter = c0004d.f118a.f275c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    @Override // a.b.e.i.p
    public void i() {
        if (a()) {
            return;
        }
        for (g gVar : this.h) {
            w(gVar);
        }
        this.h.clear();
        View view = this.o;
        this.p = view;
        if (view == null) {
            return;
        }
        boolean z = this.y == null;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.y = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        this.p.addOnAttachStateChangeListener(this.k);
    }

    @Override // a.b.e.i.k
    public void l(g gVar) {
        gVar.b(this, this.f110b);
        if (a()) {
            w(gVar);
        } else {
            this.h.add(gVar);
        }
    }

    @Override // a.b.e.i.k
    public boolean m() {
        return false;
    }

    @Override // a.b.e.i.k
    public void o(View view) {
        if (this.o != view) {
            this.o = view;
            int i = this.m;
            AtomicInteger atomicInteger = w.f667a;
            this.n = Gravity.getAbsoluteGravity(i, w.e.d(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0004d c0004d;
        int size = this.i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0004d = null;
                break;
            }
            c0004d = this.i.get(i);
            if (!c0004d.f118a.a()) {
                break;
            }
            i++;
        }
        if (c0004d != null) {
            c0004d.f119b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // a.b.e.i.k
    public void p(boolean z) {
        this.v = z;
    }

    @Override // a.b.e.i.k
    public void q(int i) {
        if (this.m != i) {
            this.m = i;
            View view = this.o;
            AtomicInteger atomicInteger = w.f667a;
            this.n = Gravity.getAbsoluteGravity(i, w.e.d(view));
        }
    }

    @Override // a.b.e.i.k
    public void r(int i) {
        this.r = true;
        this.t = i;
    }

    @Override // a.b.e.i.k
    public void s(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // a.b.e.i.k
    public void t(boolean z) {
        this.w = z;
    }

    @Override // a.b.e.i.k
    public void u(int i) {
        this.s = true;
        this.u = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(a.b.e.i.g r17) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.e.i.d.w(a.b.e.i.g):void");
    }
}
