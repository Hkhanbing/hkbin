package a.b.f;

import a.b.e.i.m;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Objects;

/* loaded from: classes.dex */
public class f1 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f209a;

    /* renamed from: b  reason: collision with root package name */
    public int f210b;

    /* renamed from: c  reason: collision with root package name */
    public View f211c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public d n;
    public int o;
    public Drawable p;

    /* loaded from: classes.dex */
    public class a extends a.h.j.z {

        /* renamed from: a  reason: collision with root package name */
        public boolean f212a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f213b;

        public a(int i) {
            this.f213b = i;
        }

        @Override // a.h.j.y
        public void a(View view) {
            if (!this.f212a) {
                f1.this.f209a.setVisibility(this.f213b);
            }
        }

        @Override // a.h.j.z, a.h.j.y
        public void b(View view) {
            f1.this.f209a.setVisibility(0);
        }

        @Override // a.h.j.z, a.h.j.y
        public void c(View view) {
            this.f212a = true;
        }
    }

    public f1(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.o = 0;
        this.f209a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        String str = null;
        d1 q = d1.q(toolbar.getContext(), null, a.b.b.f13a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.p = q.g(15);
        if (z) {
            CharSequence n = q.n(27);
            if (!TextUtils.isEmpty(n)) {
                this.h = true;
                v(n);
            }
            CharSequence n2 = q.n(25);
            if (!TextUtils.isEmpty(n2)) {
                this.j = n2;
                if ((this.f210b & 8) != 0) {
                    this.f209a.setSubtitle(n2);
                }
            }
            Drawable g = q.g(20);
            if (g != null) {
                this.f = g;
                y();
            }
            Drawable g2 = q.g(17);
            if (g2 != null) {
                this.e = g2;
                y();
            }
            if (this.g == null && (drawable = this.p) != null) {
                this.g = drawable;
                x();
            }
            t(q.j(10, 0));
            int l = q.l(9, 0);
            if (l != 0) {
                View inflate = LayoutInflater.from(this.f209a.getContext()).inflate(l, (ViewGroup) this.f209a, false);
                View view = this.d;
                if (view != null && (this.f210b & 16) != 0) {
                    this.f209a.removeView(view);
                }
                this.d = inflate;
                if (inflate != null && (this.f210b & 16) != 0) {
                    this.f209a.addView(inflate);
                }
                t(this.f210b | 16);
            }
            int k = q.k(13, 0);
            if (k > 0) {
                ViewGroup.LayoutParams layoutParams = this.f209a.getLayoutParams();
                layoutParams.height = k;
                this.f209a.setLayoutParams(layoutParams);
            }
            int e = q.e(7, -1);
            int e2 = q.e(3, -1);
            if (e >= 0 || e2 >= 0) {
                Toolbar toolbar2 = this.f209a;
                int max = Math.max(e, 0);
                int max2 = Math.max(e2, 0);
                toolbar2.d();
                toolbar2.t.a(max, max2);
            }
            int l2 = q.l(28, 0);
            if (l2 != 0) {
                Toolbar toolbar3 = this.f209a;
                Context context = toolbar3.getContext();
                toolbar3.l = l2;
                TextView textView = toolbar3.f1212b;
                if (textView != null) {
                    textView.setTextAppearance(context, l2);
                }
            }
            int l3 = q.l(26, 0);
            if (l3 != 0) {
                Toolbar toolbar4 = this.f209a;
                Context context2 = toolbar4.getContext();
                toolbar4.m = l3;
                TextView textView2 = toolbar4.f1213c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, l3);
                }
            }
            int l4 = q.l(22, 0);
            if (l4 != 0) {
                this.f209a.setPopupTheme(l4);
            }
        } else {
            if (this.f209a.getNavigationIcon() != null) {
                this.p = this.f209a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f210b = i;
        }
        q.f193b.recycle();
        if (R.string.abc_action_bar_up_description != this.o) {
            this.o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f209a.getNavigationContentDescription())) {
                int i2 = this.o;
                this.k = i2 != 0 ? s().getString(i2) : str;
                w();
            }
        }
        this.k = this.f209a.getNavigationContentDescription();
        this.f209a.setNavigationOnClickListener(new e1(this));
    }

    @Override // a.b.f.j0
    public boolean a() {
        return this.f209a.w();
    }

    @Override // a.b.f.j0
    public void b(Menu menu, m.a aVar) {
        a.b.e.i.i iVar;
        if (this.n == null) {
            d dVar = new d(this.f209a.getContext());
            this.n = dVar;
            Objects.requireNonNull(dVar);
        }
        d dVar2 = this.n;
        dVar2.e = aVar;
        Toolbar toolbar = this.f209a;
        a.b.e.i.g gVar = (a.b.e.i.g) menu;
        if (gVar == null && toolbar.f1211a == null) {
            return;
        }
        toolbar.f();
        a.b.e.i.g gVar2 = toolbar.f1211a.p;
        if (gVar2 == gVar) {
            return;
        }
        if (gVar2 != null) {
            gVar2.u(toolbar.L);
            gVar2.u(toolbar.M);
        }
        if (toolbar.M == null) {
            toolbar.M = new Toolbar.d();
        }
        dVar2.q = true;
        if (gVar != null) {
            gVar.b(dVar2, toolbar.j);
            gVar.b(toolbar.M, toolbar.j);
        } else {
            dVar2.j(toolbar.j, null);
            Toolbar.d dVar3 = toolbar.M;
            a.b.e.i.g gVar3 = dVar3.f1217a;
            if (gVar3 != null && (iVar = dVar3.f1218b) != null) {
                gVar3.d(iVar);
            }
            dVar3.f1217a = null;
            dVar2.h(true);
            toolbar.M.h(true);
        }
        toolbar.f1211a.setPopupTheme(toolbar.k);
        toolbar.f1211a.setPresenter(dVar2);
        toolbar.L = dVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // a.b.f.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f209a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1211a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            a.b.f.d r0 = r0.t
            if (r0 == 0) goto L1e
            a.b.f.d$c r3 = r0.v
            if (r3 != 0) goto L19
            boolean r0 = r0.m()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.f.f1.c():boolean");
    }

    @Override // a.b.f.j0
    public void collapseActionView() {
        Toolbar.d dVar = this.f209a.M;
        a.b.e.i.i iVar = dVar == null ? null : dVar.f1218b;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    @Override // a.b.f.j0
    public void d() {
        this.m = true;
    }

    @Override // a.b.f.j0
    public boolean e() {
        return this.f209a.q();
    }

    @Override // a.b.f.j0
    public boolean f() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f209a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1211a) != null && actionMenuView.s;
    }

    @Override // a.b.f.j0
    public boolean g() {
        ActionMenuView actionMenuView = this.f209a.f1211a;
        if (actionMenuView != null) {
            d dVar = actionMenuView.t;
            if (dVar != null && dVar.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // a.b.f.j0
    public CharSequence getTitle() {
        return this.f209a.getTitle();
    }

    @Override // a.b.f.j0
    public void h() {
        d dVar;
        ActionMenuView actionMenuView = this.f209a.f1211a;
        if (actionMenuView == null || (dVar = actionMenuView.t) == null) {
            return;
        }
        dVar.a();
    }

    @Override // a.b.f.j0
    public a.h.j.x i(int i, long j) {
        a.h.j.x b2 = a.h.j.w.b(this.f209a);
        b2.a(i == 0 ? 1.0f : 0.0f);
        b2.c(j);
        a aVar = new a(i);
        View view = b2.f678a.get();
        if (view != null) {
            b2.e(view, aVar);
        }
        return b2;
    }

    @Override // a.b.f.j0
    public int j() {
        return this.f210b;
    }

    @Override // a.b.f.j0
    public void k(int i) {
        this.f209a.setVisibility(i);
    }

    @Override // a.b.f.j0
    public void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // a.b.f.j0
    public boolean m() {
        Toolbar.d dVar = this.f209a.M;
        return (dVar == null || dVar.f1218b == null) ? false : true;
    }

    @Override // a.b.f.j0
    public void n(int i) {
        this.f = i != 0 ? a.b.a.e(s(), i) : null;
        y();
    }

    @Override // a.b.f.j0
    public void o(w0 w0Var) {
        View view = this.f211c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f209a;
            if (parent == toolbar) {
                toolbar.removeView(this.f211c);
            }
        }
        this.f211c = null;
    }

    @Override // a.b.f.j0
    public void p(boolean z) {
    }

    @Override // a.b.f.j0
    public void q() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // a.b.f.j0
    public void r(boolean z) {
        this.f209a.setCollapsible(z);
    }

    @Override // a.b.f.j0
    public Context s() {
        return this.f209a.getContext();
    }

    @Override // a.b.f.j0
    public void setIcon(int i) {
        this.e = i != 0 ? a.b.a.e(s(), i) : null;
        y();
    }

    @Override // a.b.f.j0
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        y();
    }

    @Override // a.b.f.j0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // a.b.f.j0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.h) {
            v(charSequence);
        }
    }

    @Override // a.b.f.j0
    public void t(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f210b ^ i;
        this.f210b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    w();
                }
                x();
            }
            if ((i2 & 3) != 0) {
                y();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f209a.setTitle(this.i);
                    toolbar = this.f209a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f209a.setTitle((CharSequence) null);
                    toolbar = this.f209a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f209a.addView(view);
            } else {
                this.f209a.removeView(view);
            }
        }
    }

    @Override // a.b.f.j0
    public int u() {
        return 0;
    }

    public final void v(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f210b & 8) != 0) {
            this.f209a.setTitle(charSequence);
            if (!this.h) {
                return;
            }
            a.h.j.w.q(this.f209a.getRootView(), charSequence);
        }
    }

    public final void w() {
        if ((this.f210b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.f209a.setNavigationContentDescription(this.o);
            } else {
                this.f209a.setNavigationContentDescription(this.k);
            }
        }
    }

    public final void x() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f210b & 4) != 0) {
            toolbar = this.f209a;
            drawable = this.g;
            if (drawable == null) {
                drawable = this.p;
            }
        } else {
            toolbar = this.f209a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void y() {
        Drawable drawable;
        int i = this.f210b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.f209a.setLogo(drawable);
    }
}
