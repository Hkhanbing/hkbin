package a.b.e.i;

import a.b.e.i.m;
import a.b.f.l0;
import a.b.f.s0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {

    /* renamed from: b  reason: collision with root package name */
    public final Context f151b;

    /* renamed from: c  reason: collision with root package name */
    public final g f152c;
    public final f d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final s0 i;
    public PopupWindow.OnDismissListener l;
    public View m;
    public View n;
    public m.a o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean u;
    public final ViewTreeObserver.OnGlobalLayoutListener j = new a();
    public final View.OnAttachStateChangeListener k = new b();
    public int t = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (q.this.a()) {
                q qVar = q.this;
                if (qVar.i.y) {
                    return;
                }
                View view = qVar.n;
                if (view == null || !view.isShown()) {
                    q.this.dismiss();
                } else {
                    q.this.i.i();
                }
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
            ViewTreeObserver viewTreeObserver = q.this.p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.p = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.p.removeGlobalOnLayoutListener(qVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i, int i2, boolean z) {
        this.f151b = context;
        this.f152c = gVar;
        this.e = z;
        this.d = new f(gVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.m = view;
        this.i = new s0(context, null, i, i2);
        gVar.b(this, context);
    }

    @Override // a.b.e.i.p
    public boolean a() {
        return !this.q && this.i.a();
    }

    @Override // a.b.e.i.m
    public void b(g gVar, boolean z) {
        if (gVar != this.f152c) {
            return;
        }
        dismiss();
        m.a aVar = this.o;
        if (aVar == null) {
            return;
        }
        aVar.b(gVar, z);
    }

    @Override // a.b.e.i.m
    public void d(m.a aVar) {
        this.o = aVar;
    }

    @Override // a.b.e.i.p
    public void dismiss() {
        if (a()) {
            this.i.dismiss();
        }
    }

    @Override // a.b.e.i.p
    public ListView e() {
        return this.i.f275c;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // a.b.e.i.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(a.b.e.i.r r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L78
            a.b.e.i.l r0 = new a.b.e.i.l
            android.content.Context r3 = r9.f151b
            android.view.View r5 = r9.n
            boolean r6 = r9.e
            int r7 = r9.g
            int r8 = r9.h
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            a.b.e.i.m$a r2 = r9.o
            r0.d(r2)
            boolean r2 = a.b.e.i.k.v(r10)
            r0.h = r2
            a.b.e.i.k r3 = r0.j
            if (r3 == 0) goto L2a
            r3.p(r2)
        L2a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.l
            r0.k = r2
            r2 = 0
            r9.l = r2
            a.b.e.i.g r2 = r9.f152c
            r2.c(r1)
            a.b.f.s0 r2 = r9.i
            int r3 = r2.f
            boolean r4 = r2.i
            if (r4 != 0) goto L40
            r2 = r1
            goto L42
        L40:
            int r2 = r2.g
        L42:
            int r4 = r9.t
            android.view.View r5 = r9.m
            java.util.concurrent.atomic.AtomicInteger r6 = a.h.j.w.f667a
            int r5 = a.h.j.w.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5c
            android.view.View r4 = r9.m
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5c:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L64
            goto L6d
        L64:
            android.view.View r4 = r0.f
            if (r4 != 0) goto L6a
            r0 = r1
            goto L6e
        L6a:
            r0.e(r3, r2, r5, r5)
        L6d:
            r0 = r5
        L6e:
            if (r0 == 0) goto L78
            a.b.e.i.m$a r0 = r9.o
            if (r0 == 0) goto L77
            r0.c(r10)
        L77:
            return r5
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.e.i.q.f(a.b.e.i.r):boolean");
    }

    @Override // a.b.e.i.m
    public boolean g() {
        return false;
    }

    @Override // a.b.e.i.m
    public void h(boolean z) {
        this.r = false;
        f fVar = this.d;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.e.i.p
    public void i() {
        View view;
        boolean z = true;
        if (!a()) {
            if (this.q || (view = this.m) == null) {
                z = false;
            } else {
                this.n = view;
                this.i.z.setOnDismissListener(this);
                s0 s0Var = this.i;
                s0Var.q = this;
                s0Var.s(true);
                View view2 = this.n;
                boolean z2 = this.p == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.p = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.j);
                }
                view2.addOnAttachStateChangeListener(this.k);
                s0 s0Var2 = this.i;
                s0Var2.p = view2;
                s0Var2.l = this.t;
                if (!this.r) {
                    this.s = k.n(this.d, null, this.f151b, this.f);
                    this.r = true;
                }
                this.i.r(this.s);
                this.i.z.setInputMethodMode(2);
                s0 s0Var3 = this.i;
                Rect rect = this.f146a;
                Objects.requireNonNull(s0Var3);
                s0Var3.x = rect != null ? new Rect(rect) : null;
                this.i.i();
                l0 l0Var = this.i.f275c;
                l0Var.setOnKeyListener(this);
                if (this.u && this.f152c.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f151b).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) l0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f152c.m);
                    }
                    frameLayout.setEnabled(false);
                    l0Var.addHeaderView(frameLayout, null, false);
                }
                this.i.o(this.d);
                this.i.i();
            }
        }
        if (z) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // a.b.e.i.k
    public void l(g gVar) {
    }

    @Override // a.b.e.i.k
    public void o(View view) {
        this.m = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.q = true;
        this.f152c.c(true);
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.d.f128c = z;
    }

    @Override // a.b.e.i.k
    public void q(int i) {
        this.t = i;
    }

    @Override // a.b.e.i.k
    public void r(int i) {
        this.i.f = i;
    }

    @Override // a.b.e.i.k
    public void s(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // a.b.e.i.k
    public void t(boolean z) {
        this.u = z;
    }

    @Override // a.b.e.i.k
    public void u(int i) {
        s0 s0Var = this.i;
        s0Var.g = i;
        s0Var.i = true;
    }
}
