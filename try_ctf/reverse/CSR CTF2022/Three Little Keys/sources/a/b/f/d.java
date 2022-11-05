package a.b.f;

import a.b.e.i.g;
import a.b.e.i.m;
import a.b.e.i.n;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class d extends a.b.e.i.b {
    public C0005d i;
    public Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public final SparseBooleanArray s;
    public e t;
    public a u;
    public c v;
    public b w;
    public final f x;

    /* loaded from: classes.dex */
    public class a extends a.b.e.i.l {
        public a(Context context, a.b.e.i.r rVar, View view) {
            super(context, rVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!rVar.A.g()) {
                View view2 = d.this.i;
                this.f = view2 == null ? (View) d.this.h : view2;
            }
            d(d.this.x);
        }

        @Override // a.b.e.i.l
        public void c() {
            d dVar = d.this;
            dVar.u = null;
            Objects.requireNonNull(dVar);
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public e f183a;

        public c(e eVar) {
            this.f183a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.a aVar;
            a.b.e.i.g gVar = d.this.f106c;
            if (gVar != null && (aVar = gVar.e) != null) {
                aVar.a(gVar);
            }
            View view = (View) d.this.h;
            if (view != null && view.getWindowToken() != null && this.f183a.f()) {
                d.this.t = this.f183a;
            }
            d.this.v = null;
        }
    }

    /* renamed from: a.b.f.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0005d extends r implements ActionMenuView.a {

        /* renamed from: a.b.f.d$d$a */
        /* loaded from: classes.dex */
        public class a extends n0 {
            public a(View view, d dVar) {
                super(view);
            }

            @Override // a.b.f.n0
            public a.b.e.i.p b() {
                e eVar = d.this.t;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // a.b.f.n0
            public boolean c() {
                d.this.n();
                return true;
            }

            @Override // a.b.f.n0
            public boolean d() {
                d dVar = d.this;
                if (dVar.v != null) {
                    return false;
                }
                dVar.i();
                return true;
            }
        }

        public C0005d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setTooltipText(getContentDescription());
            setOnTouchListener(new a(this, d.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            d.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends a.b.e.i.l {
        public e(Context context, a.b.e.i.g gVar, View view, boolean z) {
            super(context, gVar, view, z, R.attr.actionOverflowMenuStyle, 0);
            this.g = 8388613;
            d(d.this.x);
        }

        @Override // a.b.e.i.l
        public void c() {
            a.b.e.i.g gVar = d.this.f106c;
            if (gVar != null) {
                gVar.c(true);
            }
            d.this.t = null;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class f implements m.a {
        public f() {
        }

        @Override // a.b.e.i.m.a
        public void b(a.b.e.i.g gVar, boolean z) {
            if (gVar instanceof a.b.e.i.r) {
                gVar.k().c(false);
            }
            m.a aVar = d.this.e;
            if (aVar != null) {
                aVar.b(gVar, z);
            }
        }

        @Override // a.b.e.i.m.a
        public boolean c(a.b.e.i.g gVar) {
            d dVar = d.this;
            if (gVar == dVar.f106c) {
                return false;
            }
            int i = ((a.b.e.i.r) gVar).A.f135a;
            m.a aVar = dVar.e;
            if (aVar == null) {
                return false;
            }
            return aVar.c(gVar);
        }
    }

    public d(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.s = new SparseBooleanArray();
        this.x = new f();
    }

    public boolean a() {
        return i() | l();
    }

    @Override // a.b.e.i.m
    public void b(a.b.e.i.g gVar, boolean z) {
        a();
        m.a aVar = this.e;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    public View e(a.b.e.i.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        int i = 0;
        if (actionView == null || iVar.f()) {
            n.a aVar = view instanceof n.a ? (n.a) view : (n.a) this.d.inflate(this.g, viewGroup, false);
            aVar.d(iVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.h);
            if (this.w == null) {
                this.w = new b();
            }
            actionMenuItemView.setPopupCallback(this.w);
            actionView = (View) aVar;
        }
        if (iVar.C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // a.b.e.i.m
    public boolean f(a.b.e.i.r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        a.b.e.i.r rVar2 = rVar;
        while (true) {
            a.b.e.i.g gVar = rVar2.z;
            if (gVar == this.f106c) {
                break;
            }
            rVar2 = (a.b.e.i.r) gVar;
        }
        a.b.e.i.i iVar = rVar2.A;
        ViewGroup viewGroup = (ViewGroup) this.h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == iVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        int i2 = rVar.A.f135a;
        int size = rVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i3++;
        }
        a aVar = new a(this.f105b, rVar, view);
        this.u = aVar;
        aVar.h = z;
        a.b.e.i.k kVar = aVar.j;
        if (kVar != null) {
            kVar.p(z);
        }
        if (this.u.f()) {
            m.a aVar2 = this.e;
            if (aVar2 != null) {
                aVar2.c(rVar);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    @Override // a.b.e.i.m
    public boolean g() {
        int i;
        ArrayList<a.b.e.i.i> arrayList;
        int i2;
        boolean z;
        a.b.e.i.g gVar = this.f106c;
        if (gVar != null) {
            arrayList = gVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.p;
        int i4 = this.o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.h;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            a.b.e.i.i iVar = arrayList.get(i5);
            int i8 = iVar.y;
            if ((i8 & 2) == 2) {
                i7++;
            } else if ((i8 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.q && iVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.l && (z2 || i6 + i7 > i3)) {
            i3--;
        }
        int i9 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.s;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            a.b.e.i.i iVar2 = arrayList.get(i10);
            int i12 = iVar2.y;
            if ((i12 & 2) == i2 ? z : false) {
                View e2 = e(iVar2, null, viewGroup);
                e2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = e2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int i13 = iVar2.f136b;
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                iVar2.k(z);
            } else if ((i12 & 1) == z ? z : false) {
                int i14 = iVar2.f136b;
                boolean z3 = sparseBooleanArray.get(i14);
                boolean z4 = ((i9 > 0 || z3) && i4 > 0) ? z : false;
                if (z4) {
                    View e3 = e(iVar2, null, viewGroup);
                    e3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = e3.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z4 &= i4 + i11 > 0;
                }
                if (z4 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z3) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i10; i15++) {
                        a.b.e.i.i iVar3 = arrayList.get(i15);
                        if (iVar3.f136b == i14) {
                            if (iVar3.g()) {
                                i9++;
                            }
                            iVar3.k(false);
                        }
                    }
                }
                if (z4) {
                    i9--;
                }
                iVar2.k(z4);
            } else {
                iVar2.k(false);
                i10++;
                i2 = 2;
                z = true;
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return z;
    }

    @Override // a.b.e.i.m
    public void h(boolean z) {
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList<a.b.e.i.i> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            a.b.e.i.g gVar = this.f106c;
            if (gVar != null) {
                gVar.i();
                ArrayList<a.b.e.i.i> l = this.f106c.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    a.b.e.i.i iVar = l.get(i2);
                    if (iVar.g()) {
                        View childAt = viewGroup.getChildAt(i);
                        a.b.e.i.i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View e2 = e(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            e2.setPressed(false);
                            e2.jumpDrawablesToCurrentState();
                        }
                        if (e2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) e2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(e2);
                            }
                            ((ViewGroup) this.h).addView(e2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.i) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.h).requestLayout();
        a.b.e.i.g gVar2 = this.f106c;
        if (gVar2 != null) {
            gVar2.i();
            ArrayList<a.b.e.i.i> arrayList2 = gVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                a.h.j.d dVar = arrayList2.get(i3).A;
            }
        }
        a.b.e.i.g gVar3 = this.f106c;
        if (gVar3 != null) {
            gVar3.i();
            arrayList = gVar3.j;
        }
        if (this.l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        C0005d c0005d = this.i;
        if (z3) {
            if (c0005d == null) {
                this.i = new C0005d(this.f104a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0005d c0005d2 = this.i;
                ActionMenuView.c h = actionMenuView.h();
                h.f1180a = true;
                actionMenuView.addView(c0005d2, h);
            }
        } else if (c0005d != null) {
            ViewParent parent = c0005d.getParent();
            a.b.e.i.n nVar = this.h;
            if (parent == nVar) {
                ((ViewGroup) nVar).removeView(this.i);
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.l);
    }

    public boolean i() {
        a.b.e.i.n nVar;
        c cVar = this.v;
        if (cVar != null && (nVar = this.h) != null) {
            ((View) nVar).removeCallbacks(cVar);
            this.v = null;
            return true;
        }
        e eVar = this.t;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.j.dismiss();
        }
        return true;
    }

    @Override // a.b.e.i.m
    public void j(Context context, a.b.e.i.g gVar) {
        this.f105b = context;
        LayoutInflater.from(context);
        this.f106c = gVar;
        Resources resources = context.getResources();
        if (!this.m) {
            this.l = true;
        }
        int i = 2;
        this.n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.p = i;
        int i4 = this.n;
        if (this.l) {
            if (this.i == null) {
                C0005d c0005d = new C0005d(this.f104a);
                this.i = c0005d;
                if (this.k) {
                    c0005d.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.o = i4;
        this.r = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean l() {
        a aVar = this.u;
        if (aVar != null) {
            if (!aVar.b()) {
                return true;
            }
            aVar.j.dismiss();
            return true;
        }
        return false;
    }

    public boolean m() {
        e eVar = this.t;
        return eVar != null && eVar.b();
    }

    public boolean n() {
        a.b.e.i.g gVar;
        if (!this.l || m() || (gVar = this.f106c) == null || this.h == null || this.v != null) {
            return false;
        }
        gVar.i();
        if (gVar.j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f105b, this.f106c, this.i, true));
        this.v = cVar;
        ((View) this.h).post(cVar);
        return true;
    }
}
