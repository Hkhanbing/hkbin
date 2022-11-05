package androidx.appcompat.widget;

import a.b.c.s;
import a.b.e.g;
import a.b.e.i.m;
import a.b.f.i0;
import a.b.f.j0;
import a.h.j.b0;
import a.h.j.l;
import a.h.j.m;
import a.h.j.n;
import a.h.j.w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements i0, l, m {
    public static final int[] F = {R.attr.actionBarSize, 16842841};
    public ViewPropertyAnimator A;
    public final AnimatorListenerAdapter B;
    public final Runnable C;
    public final Runnable D;
    public final n E;

    /* renamed from: a  reason: collision with root package name */
    public int f1174a;

    /* renamed from: b  reason: collision with root package name */
    public int f1175b;

    /* renamed from: c  reason: collision with root package name */
    public ContentFrameLayout f1176c;
    public ActionBarContainer d;
    public j0 e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public b0 u;
    public b0 v;
    public b0 w;
    public b0 x;
    public d y;
    public OverScroller z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.k = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.d.animate().translationY(-ActionBarOverlayLayout.this.d.getHeight()).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i, int i2) {
            super(i, i2);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1175b = 0;
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        b0 b0Var = b0.f608b;
        this.u = b0Var;
        this.v = b0Var;
        this.w = b0Var;
        this.x = b0Var;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        r(context);
        this.E = new n();
    }

    @Override // a.b.f.i0
    public boolean a() {
        s();
        return this.e.a();
    }

    @Override // a.b.f.i0
    public void b(Menu menu, m.a aVar) {
        s();
        this.e.b(menu, aVar);
    }

    @Override // a.b.f.i0
    public boolean c() {
        s();
        return this.e.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // a.b.f.i0
    public void d() {
        s();
        this.e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f == null || this.g) {
            return;
        }
        if (this.d.getVisibility() == 0) {
            i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.f.setBounds(0, i, getWidth(), this.f.getIntrinsicHeight() + i);
        this.f.draw(canvas);
    }

    @Override // a.b.f.i0
    public boolean e() {
        s();
        return this.e.e();
    }

    @Override // a.b.f.i0
    public boolean f() {
        s();
        return this.e.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // a.b.f.i0
    public boolean g() {
        s();
        return this.e.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        s();
        return this.e.getTitle();
    }

    @Override // a.b.f.i0
    public void h(int i) {
        s();
        if (i == 2) {
            this.e.l();
        } else if (i == 5) {
            this.e.q();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // a.h.j.l
    public void i(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // a.b.f.i0
    public void j() {
        s();
        this.e.h();
    }

    @Override // a.h.j.m
    public void k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // a.h.j.l
    public void l(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // a.h.j.l
    public void m(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // a.h.j.l
    public void n(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // a.h.j.l
    public boolean o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        b0 j = b0.j(windowInsets, this);
        boolean p = p(this.d, new Rect(j.c(), j.e(), j.d(), j.b()), true, true, false, true);
        Rect rect = this.n;
        AtomicInteger atomicInteger = w.f667a;
        w.i.b(this, j, rect);
        Rect rect2 = this.n;
        b0 l = j.f609a.l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.u = l;
        boolean z = true;
        if (!this.v.equals(l)) {
            this.v = this.u;
            p = true;
        }
        if (!this.o.equals(this.n)) {
            this.o.set(this.n);
        } else {
            z = p;
        }
        if (z) {
            requestLayout();
        }
        return j.f609a.a().f609a.c().f609a.b().h();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        AtomicInteger atomicInteger = w.f667a;
        w.h.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        b0 a2;
        s();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        e eVar = (e) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        AtomicInteger atomicInteger = w.f667a;
        boolean z = (w.d.g(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f1174a;
            if (this.i && this.d.getTabContainer() != null) {
                measuredHeight += this.f1174a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        this.p.set(this.n);
        b0 b0Var = this.u;
        this.w = b0Var;
        if (!this.h && !z) {
            Rect rect = this.p;
            rect.top += measuredHeight;
            rect.bottom += 0;
            a2 = b0Var.f609a.l(0, measuredHeight, 0, 0);
        } else {
            a.h.d.b b2 = a.h.d.b.b(b0Var.c(), this.w.e() + measuredHeight, this.w.d(), this.w.b() + 0);
            b0 b0Var2 = this.w;
            int i3 = Build.VERSION.SDK_INT;
            b0.e dVar = i3 >= 30 ? new b0.d(b0Var2) : i3 >= 29 ? new b0.c(b0Var2) : new b0.b(b0Var2);
            dVar.c(b2);
            a2 = dVar.a();
        }
        this.w = a2;
        p(this.f1176c, this.p, true, true, true, true);
        if (!this.x.equals(this.w)) {
            b0 b0Var3 = this.w;
            this.x = b0Var3;
            w.c(this.f1176c, b0Var3);
        }
        measureChildWithMargins(this.f1176c, i, 0, i2, 0);
        e eVar2 = (e) this.f1176c.getLayoutParams();
        int max3 = Math.max(max, this.f1176c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f1176c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1176c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.j || !z) {
            return false;
        }
        this.z.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.z.getFinalY() > this.d.getHeight()) {
            z2 = true;
        }
        if (z2) {
            q();
            this.D.run();
        } else {
            q();
            this.C.run();
        }
        this.k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.l + i2;
        this.l = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        s sVar;
        g gVar;
        this.E.f662a = i;
        this.l = getActionBarHideOffset();
        q();
        d dVar = this.y;
        if (dVar == null || (gVar = (sVar = (s) dVar).t) == null) {
            return;
        }
        gVar.a();
        sVar.t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.j && !this.k) {
            if (this.l <= this.d.getHeight()) {
                q();
                postDelayed(this.C, 600L);
            } else {
                q();
                postDelayed(this.D, 600L);
            }
        }
        d dVar = this.y;
        if (dVar != null) {
            Objects.requireNonNull((s) dVar);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        s();
        int i2 = this.m ^ i;
        this.m = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        d dVar = this.y;
        if (dVar != null) {
            ((s) dVar).p = !z2;
            if (!z && z2) {
                s sVar = (s) dVar;
                if (!sVar.q) {
                    sVar.q = true;
                    sVar.g(true);
                }
            } else {
                s sVar2 = (s) dVar;
                if (sVar2.q) {
                    sVar2.q = false;
                    sVar2.g(true);
                }
            }
        }
        if ((i2 & 256) == 0 || this.y == null) {
            return;
        }
        AtomicInteger atomicInteger = w.f667a;
        w.h.c(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1175b = i;
        d dVar = this.y;
        if (dVar != null) {
            ((s) dVar).o = i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.p(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    public void q() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        boolean z = false;
        this.f1174a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.g = z;
        this.z = new OverScroller(context);
    }

    public void s() {
        j0 wrapper;
        if (this.f1176c == null) {
            this.f1176c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof j0) {
                wrapper = (j0) findViewById;
            } else if (!(findViewById instanceof Toolbar)) {
                StringBuilder f = b.a.a.a.a.f("Can't make a decor toolbar out of ");
                f.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(f.toString());
            } else {
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        q();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.y = dVar;
        if (getWindowToken() != null) {
            ((s) this.y).o = this.f1175b;
            int i = this.m;
            if (i == 0) {
                return;
            }
            onWindowSystemUiVisibilityChanged(i);
            AtomicInteger atomicInteger = w.f667a;
            w.h.c(this);
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.j) {
            this.j = z;
            if (z) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        s();
        this.e.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.e.setIcon(drawable);
    }

    public void setLogo(int i) {
        s();
        this.e.n(i);
    }

    public void setOverlayMode(boolean z) {
        this.h = z;
        this.g = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // a.b.f.i0
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.e.setWindowCallback(callback);
    }

    @Override // a.b.f.i0
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
