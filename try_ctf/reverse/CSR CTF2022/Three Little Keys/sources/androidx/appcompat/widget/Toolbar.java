package androidx.appcompat.widget;

import a.b.c.a;
import a.b.e.i.i;
import a.b.e.i.m;
import a.b.e.i.r;
import a.b.f.d1;
import a.b.f.f0;
import a.b.f.f1;
import a.b.f.j0;
import a.b.f.p;
import a.b.f.v0;
import a.h.j.h;
import a.h.j.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList<View> D;
    public final ArrayList<View> E;
    public final int[] F;
    public final h G;
    public ArrayList<MenuItem> H;
    public f I;
    public final ActionMenuView.e J;
    public f1 K;
    public a.b.f.d L;
    public d M;
    public boolean N;
    public final Runnable O;

    /* renamed from: a  reason: collision with root package name */
    public ActionMenuView f1211a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f1212b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f1213c;
    public ImageButton d;
    public ImageView e;
    public Drawable f;
    public CharSequence g;
    public ImageButton h;
    public View i;
    public Context j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public v0 t;
    public int u;
    public int v;
    public int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.w();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = Toolbar.this.M;
            i iVar = dVar == null ? null : dVar.f1218b;
            if (iVar != null) {
                iVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements m {

        /* renamed from: a  reason: collision with root package name */
        public a.b.e.i.g f1217a;

        /* renamed from: b  reason: collision with root package name */
        public i f1218b;

        public d() {
        }

        @Override // a.b.e.i.m
        public void b(a.b.e.i.g gVar, boolean z) {
        }

        @Override // a.b.e.i.m
        public boolean c(a.b.e.i.g gVar, i iVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.h);
            }
            Toolbar.this.i = iVar.getActionView();
            this.f1218b = iVar;
            ViewParent parent2 = Toolbar.this.i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.i);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f16a = 8388611 | (toolbar4.n & 112);
                generateDefaultLayoutParams.f1220b = 2;
                toolbar4.i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.i);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((e) childAt.getLayoutParams()).f1220b != 2 && childAt != toolbar6.f1211a) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.E.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.C = true;
            iVar.n.q(false);
            View view = Toolbar.this.i;
            if (view instanceof a.b.e.b) {
                ((a.b.e.b) view).a();
            }
            return true;
        }

        @Override // a.b.e.i.m
        public boolean f(r rVar) {
            return false;
        }

        @Override // a.b.e.i.m
        public boolean g() {
            return false;
        }

        @Override // a.b.e.i.m
        public void h(boolean z) {
            if (this.f1218b != null) {
                a.b.e.i.g gVar = this.f1217a;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1217a.getItem(i) == this.f1218b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                k(this.f1217a, this.f1218b);
            }
        }

        @Override // a.b.e.i.m
        public void j(Context context, a.b.e.i.g gVar) {
            i iVar;
            a.b.e.i.g gVar2 = this.f1217a;
            if (gVar2 != null && (iVar = this.f1218b) != null) {
                gVar2.d(iVar);
            }
            this.f1217a = gVar;
        }

        @Override // a.b.e.i.m
        public boolean k(a.b.e.i.g gVar, i iVar) {
            View view = Toolbar.this.i;
            if (view instanceof a.b.e.b) {
                ((a.b.e.b) view).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.i = null;
            int size = toolbar3.E.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.E.clear();
                    this.f1218b = null;
                    Toolbar.this.requestLayout();
                    iVar.C = false;
                    iVar.n.q(false);
                    return true;
                }
                toolbar3.addView(toolbar3.E.get(size));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0001a {

        /* renamed from: b  reason: collision with root package name */
        public int f1220b;

        public e(int i, int i2) {
            super(i, i2);
            this.f1220b = 0;
            this.f16a = 8388627;
        }

        public e(a.C0001a c0001a) {
            super(c0001a);
            this.f1220b = 0;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1220b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1220b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1220b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0001a) eVar);
            this.f1220b = 0;
            this.f1220b = eVar.f1220b;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class g extends a.j.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f1221c;
        public boolean d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new g[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1221c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f701a, i);
            parcel.writeInt(this.f1221c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.G = new h(new Runnable() { // from class: a.b.f.a
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.o();
            }
        });
        this.H = new ArrayList<>();
        this.J = new a();
        this.O = new b();
        Context context2 = getContext();
        int[] iArr = a.b.b.x;
        d1 q = d1.q(context2, attributeSet, iArr, i, 0);
        w.o(this, context, iArr, attributeSet, q.f193b, i, 0);
        this.l = q.l(28, 0);
        this.m = q.l(19, 0);
        this.w = q.f193b.getInteger(0, this.w);
        this.n = q.f193b.getInteger(2, 48);
        int e2 = q.e(22, 0);
        e2 = q.o(27) ? q.e(27, e2) : e2;
        this.s = e2;
        this.r = e2;
        this.q = e2;
        this.p = e2;
        int e3 = q.e(25, -1);
        if (e3 >= 0) {
            this.p = e3;
        }
        int e4 = q.e(24, -1);
        if (e4 >= 0) {
            this.q = e4;
        }
        int e5 = q.e(26, -1);
        if (e5 >= 0) {
            this.r = e5;
        }
        int e6 = q.e(23, -1);
        if (e6 >= 0) {
            this.s = e6;
        }
        this.o = q.f(13, -1);
        int e7 = q.e(9, Integer.MIN_VALUE);
        int e8 = q.e(5, Integer.MIN_VALUE);
        int f2 = q.f(7, 0);
        int f3 = q.f(8, 0);
        d();
        v0 v0Var = this.t;
        v0Var.h = false;
        if (f2 != Integer.MIN_VALUE) {
            v0Var.e = f2;
            v0Var.f296a = f2;
        }
        if (f3 != Integer.MIN_VALUE) {
            v0Var.f = f3;
            v0Var.f297b = f3;
        }
        if (e7 != Integer.MIN_VALUE || e8 != Integer.MIN_VALUE) {
            v0Var.a(e7, e8);
        }
        this.u = q.e(10, Integer.MIN_VALUE);
        this.v = q.e(6, Integer.MIN_VALUE);
        this.f = q.g(4);
        this.g = q.n(3);
        CharSequence n = q.n(21);
        if (!TextUtils.isEmpty(n)) {
            setTitle(n);
        }
        CharSequence n2 = q.n(18);
        if (!TextUtils.isEmpty(n2)) {
            setSubtitle(n2);
        }
        this.j = getContext();
        setPopupTheme(q.l(17, 0));
        Drawable g2 = q.g(16);
        if (g2 != null) {
            setNavigationIcon(g2);
        }
        CharSequence n3 = q.n(15);
        if (!TextUtils.isEmpty(n3)) {
            setNavigationContentDescription(n3);
        }
        Drawable g3 = q.g(11);
        if (g3 != null) {
            setLogo(g3);
        }
        CharSequence n4 = q.n(12);
        if (!TextUtils.isEmpty(n4)) {
            setLogoDescription(n4);
        }
        if (q.o(29)) {
            setTitleTextColor(q.c(29));
        }
        if (q.o(20)) {
            setSubtitleTextColor(q.c(20));
        }
        if (q.o(14)) {
            getMenuInflater().inflate(q.l(14, 0), getMenu());
        }
        q.f193b.recycle();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new a.b.e.f(getContext());
    }

    public final void a(List<View> list, int i) {
        AtomicInteger atomicInteger = w.f667a;
        boolean z = w.e.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, w.e.d(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1220b == 0 && v(childAt) && j(eVar.f16a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1220b == 0 && v(childAt2) && j(eVar2.f16a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f1220b = 1;
        if (!z || this.i == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.E.add(view);
    }

    public void c() {
        if (this.h == null) {
            p pVar = new p(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = pVar;
            pVar.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f16a = 8388611 | (this.n & 112);
            generateDefaultLayoutParams.f1220b = 2;
            this.h.setLayoutParams(generateDefaultLayoutParams);
            this.h.setOnClickListener(new c());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.t == null) {
            this.t = new v0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1211a;
        if (actionMenuView.p == null) {
            a.b.e.i.g gVar = (a.b.e.i.g) actionMenuView.getMenu();
            if (this.M == null) {
                this.M = new d();
            }
            this.f1211a.setExpandedActionViewsExclusive(true);
            gVar.b(this.M, this.j);
        }
    }

    public final void f() {
        if (this.f1211a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1211a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.f1211a.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.f1211a;
            actionMenuView2.u = null;
            actionMenuView2.v = null;
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f16a = 8388613 | (this.n & 112);
            this.f1211a.setLayoutParams(generateDefaultLayoutParams);
            b(this.f1211a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new p(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f16a = 8388611 | (this.n & 112);
            this.d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        v0 v0Var = this.t;
        if (v0Var != null) {
            return v0Var.g ? v0Var.f296a : v0Var.f297b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        v0 v0Var = this.t;
        if (v0Var != null) {
            return v0Var.f296a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        v0 v0Var = this.t;
        if (v0Var != null) {
            return v0Var.f297b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        v0 v0Var = this.t;
        if (v0Var != null) {
            return v0Var.g ? v0Var.f297b : v0Var.f296a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        a.b.e.i.g gVar;
        ActionMenuView actionMenuView = this.f1211a;
        return actionMenuView != null && (gVar = actionMenuView.p) != null && gVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.v, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        AtomicInteger atomicInteger = w.f667a;
        return w.e.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        AtomicInteger atomicInteger = w.f667a;
        return w.e.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1211a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public a.b.f.d getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1211a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1213c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public final TextView getTitleTextView() {
        return this.f1212b;
    }

    public j0 getWrapper() {
        if (this.K == null) {
            this.K = new f1(this, true);
        }
        return this.K;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0001a ? new e((a.C0001a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int j(int i) {
        AtomicInteger atomicInteger = w.f667a;
        int d2 = w.e.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, d2) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : d2 == 1 ? 5 : 3;
    }

    public final int k(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = eVar.f16a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.w & 112;
        }
        if (i3 != 48) {
            if (i3 == 80) {
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            if (i4 < i5) {
                i4 = i5;
            } else {
                int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                if (i6 < i7) {
                    i4 = Math.max(0, i4 - (i7 - i6));
                }
            }
            return paddingTop + i4;
        }
        return getPaddingTop() - i2;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public void n(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public void o() {
        Iterator<MenuItem> it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        h hVar = this.G;
        Menu menu = getMenu();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<a.h.j.i> it2 = hVar.f658a.iterator();
        while (it2.hasNext()) {
            it2.next().a(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0297 A[LOOP:0: B:109:0x0295->B:110:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b9 A[LOOP:1: B:112:0x02b7->B:113:0x02b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02de A[LOOP:2: B:115:0x02dc->B:116:0x02de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0333 A[LOOP:3: B:124:0x0331->B:125:0x0333, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0297  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f701a);
        ActionMenuView actionMenuView = this.f1211a;
        a.b.e.i.g gVar2 = actionMenuView != null ? actionMenuView.p : null;
        int i = gVar.f1221c;
        if (i != 0 && this.M != null && gVar2 != null && (findItem = gVar2.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (!gVar.d) {
            return;
        }
        removeCallbacks(this.O);
        post(this.O);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L16;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.d()
            a.b.f.v0 r0 = r2.t
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r3 = r0.g
            if (r1 != r3) goto L12
            goto L40
        L12:
            r0.g = r1
            boolean r3 = r0.h
            if (r3 == 0) goto L38
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L2a
            int r1 = r0.d
            if (r1 == r3) goto L21
            goto L23
        L21:
            int r1 = r0.e
        L23:
            r0.f296a = r1
            int r1 = r0.f298c
            if (r1 == r3) goto L3c
            goto L3e
        L2a:
            int r1 = r0.f298c
            if (r1 == r3) goto L2f
            goto L31
        L2f:
            int r1 = r0.e
        L31:
            r0.f296a = r1
            int r1 = r0.d
            if (r1 == r3) goto L3c
            goto L3e
        L38:
            int r3 = r0.e
            r0.f296a = r3
        L3c:
            int r1 = r0.f
        L3e:
            r0.f297b = r1
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.M;
        if (dVar != null && (iVar = dVar.f1218b) != null) {
            gVar.f1221c = iVar.f135a;
        }
        gVar.d = q();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final boolean p(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public boolean q() {
        ActionMenuView actionMenuView = this.f1211a;
        if (actionMenuView != null) {
            a.b.f.d dVar = actionMenuView.t;
            if (dVar != null && dVar.m()) {
                return true;
            }
        }
        return false;
    }

    public final int r(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int k = k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k, max + measuredWidth, view.getMeasuredHeight() + k);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + max;
    }

    public final int s(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int k = k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k, max, view.getMeasuredHeight() + k);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(a.b.a.e(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.h;
        if (imageButton == null) {
            return;
        }
        imageButton.setImageDrawable(this.f);
    }

    public void setCollapsible(boolean z) {
        this.N = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() == null) {
                return;
            }
            requestLayout();
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.u) {
            this.u = i;
            if (getNavigationIcon() == null) {
                return;
            }
            requestLayout();
        }
    }

    public void setLogo(int i) {
        setLogo(a.b.a.e(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.e == null) {
                this.e = new a.b.f.r(getContext(), null, 0);
            }
            if (!p(this.e)) {
                b(this.e, true);
            }
        } else {
            ImageView imageView = this.e;
            if (imageView != null && p(imageView)) {
                removeView(this.e);
                this.E.remove(this.e);
            }
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new a.b.f.r(getContext(), null, 0);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.d.setTooltipText(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(a.b.a.e(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!p(this.d)) {
                b(this.d, true);
            }
        } else {
            ImageButton imageButton = this.d;
            if (imageButton != null && p(imageButton)) {
                removeView(this.d);
                this.E.remove(this.d);
            }
        }
        ImageButton imageButton2 = this.d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.I = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1211a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1213c == null) {
                Context context = getContext();
                f0 f0Var = new f0(context, null);
                this.f1213c = f0Var;
                f0Var.setSingleLine();
                this.f1213c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.f1213c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1213c.setTextColor(colorStateList);
                }
            }
            if (!p(this.f1213c)) {
                b(this.f1213c, true);
            }
        } else {
            TextView textView = this.f1213c;
            if (textView != null && p(textView)) {
                removeView(this.f1213c);
                this.E.remove(this.f1213c);
            }
        }
        TextView textView2 = this.f1213c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1213c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1212b == null) {
                Context context = getContext();
                f0 f0Var = new f0(context, null);
                this.f1212b = f0Var;
                f0Var.setSingleLine();
                this.f1212b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.f1212b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.f1212b.setTextColor(colorStateList);
                }
            }
            if (!p(this.f1212b)) {
                b(this.f1212b, true);
            }
        } else {
            TextView textView = this.f1212b;
            if (textView != null && p(textView)) {
                removeView(this.f1212b);
                this.E.remove(this.f1212b);
            }
        }
        TextView textView2 = this.f1212b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        TextView textView = this.f1212b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final int t(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void u(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1211a;
        if (actionMenuView != null) {
            a.b.f.d dVar = actionMenuView.t;
            if (dVar != null && dVar.n()) {
                return true;
            }
        }
        return false;
    }
}
