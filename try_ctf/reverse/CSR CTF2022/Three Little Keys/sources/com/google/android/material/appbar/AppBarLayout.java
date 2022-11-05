package com.google.android.material.appbar;

import a.h.j.d0.d;
import a.h.j.j;
import a.h.j.w;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.d.e;
import b.b.a.a.d.f;
import b.b.a.a.w.g;
import de.cybersecurityrumble.threelittlekeys.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public int f1671a;

    /* renamed from: b  reason: collision with root package name */
    public int f1672b;

    /* renamed from: c  reason: collision with root package name */
    public int f1673c;
    public int d;
    public boolean e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public WeakReference<View> l;
    public ValueAnimator m;
    public int[] n;
    public Drawable o;
    public Behavior p;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends e<T> {
        public int j;
        public int k;
        public ValueAnimator l;
        public b m;
        public WeakReference<View> n;
        public boolean o;

        /* loaded from: classes.dex */
        public class a extends a.h.j.c {
            public a() {
            }

            @Override // a.h.j.c
            public void d(View view, d dVar) {
                this.f621a.onInitializeAccessibilityNodeInfo(view, dVar.f633a);
                dVar.f633a.setScrollable(BaseBehavior.this.o);
                dVar.f633a.setClassName(ScrollView.class.getName());
            }
        }

        /* loaded from: classes.dex */
        public static class b extends a.j.a.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            public boolean f1674c;
            public boolean d;
            public int e;
            public float f;
            public boolean g;

            /* loaded from: classes.dex */
            public class a implements Parcelable.ClassLoaderCreator<b> {
                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i) {
                    return new b[i];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z = true;
                this.f1674c = parcel.readByte() != 0;
                this.d = parcel.readByte() != 0;
                this.e = parcel.readInt();
                this.f = parcel.readFloat();
                this.g = parcel.readByte() == 0 ? false : z;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // a.j.a.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.f701a, i);
                parcel.writeByte(this.f1674c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.e);
                parcel.writeFloat(this.f);
                parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static boolean J(int i, int i2) {
            return (i & i2) == i2;
        }

        @Override // b.b.a.a.d.e
        public int E() {
            return B() + this.j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.b.a.a.d.e
        public int H(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            ArrayList<View> orDefault;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int E = E();
            int i6 = 0;
            if (i2 == 0 || E < i2 || E > i3) {
                this.j = 0;
            } else {
                int j = a.h.b.b.j(i, i2, i3);
                if (E != j) {
                    if (appBarLayout.e) {
                        int abs = Math.abs(j);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            c cVar = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.f1679c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = cVar.f1677a;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + 0;
                                    if ((i8 & 2) != 0) {
                                        AtomicInteger atomicInteger = w.f667a;
                                        i5 -= w.d.d(childAt);
                                    }
                                } else {
                                    i5 = 0;
                                }
                                AtomicInteger atomicInteger2 = w.f667a;
                                if (w.d.b(childAt)) {
                                    i5 -= appBarLayout.getTopInset();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f) * f)) * Integer.signum(j);
                                }
                            }
                        }
                    }
                    i4 = j;
                    boolean D = D(i4);
                    int i9 = E - j;
                    this.j = j - i4;
                    if (D) {
                        for (int i10 = 0; i10 < appBarLayout.getChildCount(); i10++) {
                            c cVar2 = (c) appBarLayout.getChildAt(i10).getLayoutParams();
                            a aVar = cVar2.f1678b;
                            if (aVar != null && (cVar2.f1677a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i10);
                                b bVar = (b) aVar;
                                Rect rect = bVar.f1675a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = bVar.f1675a.top - Math.abs(B());
                                float f2 = 0.0f;
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / bVar.f1675a.height());
                                    if (abs3 >= 0.0f) {
                                        f2 = abs3 > 1.0f ? 1.0f : abs3;
                                    }
                                    float f3 = 1.0f - f2;
                                    float height = (-abs2) - ((bVar.f1675a.height() * 0.3f) * (1.0f - (f3 * f3)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(bVar.f1676b);
                                    bVar.f1676b.offset(0, (int) (-height));
                                    Rect rect2 = bVar.f1676b;
                                    AtomicInteger atomicInteger3 = w.f667a;
                                    w.f.c(childAt2, rect2);
                                } else {
                                    AtomicInteger atomicInteger4 = w.f667a;
                                    w.f.c(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!D && appBarLayout.e && (orDefault = coordinatorLayout.f1237b.f491b.getOrDefault(appBarLayout, null)) != null && !orDefault.isEmpty()) {
                        while (i6 < orDefault.size()) {
                            View view2 = orDefault.get(i6);
                            CoordinatorLayout.c cVar3 = ((CoordinatorLayout.f) view2.getLayoutParams()).f1241a;
                            if (cVar3 != null) {
                                cVar3.g(coordinatorLayout, view2, appBarLayout);
                            }
                            i6++;
                        }
                    }
                    appBarLayout.f1671a = B();
                    if (!appBarLayout.willNotDraw()) {
                        AtomicInteger atomicInteger5 = w.f667a;
                        w.d.k(appBarLayout);
                    }
                    R(coordinatorLayout, appBarLayout, j, j < E ? -1 : 1, false);
                    i6 = i9;
                }
            }
            Q(coordinatorLayout, appBarLayout);
            return i6;
        }

        public final void I(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(E() - i);
            float abs2 = Math.abs(f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            int E = E();
            if (E == i) {
                ValueAnimator valueAnimator = this.l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.l = valueAnimator3;
                valueAnimator3.setInterpolator(b.b.a.a.c.a.e);
                this.l.addUpdateListener(new b.b.a.a.d.b(this, coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.l.setDuration(Math.min(round, 600));
            this.l.setIntValues(E, i);
            this.l.start();
        }

        public final View K(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof j) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    i3 = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    i3 = 0;
                }
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    iArr[1] = F(coordinatorLayout, appBarLayout, i, i4, i5);
                }
            }
            if (appBarLayout.j) {
                appBarLayout.d(appBarLayout.e(view));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int[] iArr) {
            if (i < 0) {
                iArr[1] = F(coordinatorLayout, appBarLayout, i, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i == 0) {
                Q(coordinatorLayout, appBarLayout);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
            if (((r4.getTotalScrollRange() != 0) && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean N(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.appbar.AppBarLayout r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                r6 = r6 & 2
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L2a
                boolean r6 = r4.j
                if (r6 != 0) goto L2b
                int r6 = r4.getTotalScrollRange()
                if (r6 == 0) goto L12
                r6 = r0
                goto L13
            L12:
                r6 = r1
            L13:
                if (r6 == 0) goto L26
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L26
                r3 = r0
                goto L27
            L26:
                r3 = r1
            L27:
                if (r3 == 0) goto L2a
                goto L2b
            L2a:
                r0 = r1
            L2b:
                if (r0 == 0) goto L34
                android.animation.ValueAnimator r3 = r2.l
                if (r3 == 0) goto L34
                r3.cancel()
            L34:
                r3 = 0
                r2.n = r3
                r2.k = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.N(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int):boolean");
        }

        public b O(Parcelable parcelable, T t) {
            int B = B();
            int childCount = t.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + B;
                if (childAt.getTop() + B <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = a.j.a.a.f700b;
                    }
                    b bVar = new b(parcelable);
                    boolean z2 = B == 0;
                    bVar.d = z2;
                    bVar.f1674c = !z2 && (-B) >= t.getTotalScrollRange();
                    bVar.e = i;
                    AtomicInteger atomicInteger = w.f667a;
                    if (bottom == t.getTopInset() + w.d.d(childAt)) {
                        z = true;
                    }
                    bVar.g = z;
                    bVar.f = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void P(CoordinatorLayout coordinatorLayout, T t) {
            int paddingTop = t.getPaddingTop() + t.getTopInset();
            int E = E() - paddingTop;
            int childCount = t.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = t.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (J(cVar.f1677a, 32)) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i2 = -E;
                if (top <= i2 && bottom >= i2) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                View childAt2 = t.getChildAt(i);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i3 = cVar2.f1677a;
                if ((i3 & 17) != 17) {
                    return;
                }
                int i4 = -childAt2.getTop();
                int i5 = -childAt2.getBottom();
                if (i == 0) {
                    AtomicInteger atomicInteger = w.f667a;
                    if (w.d.b(t) && w.d.b(childAt2)) {
                        i4 -= t.getTopInset();
                    }
                }
                if (J(i3, 2)) {
                    AtomicInteger atomicInteger2 = w.f667a;
                    i5 += w.d.d(childAt2);
                } else if (J(i3, 5)) {
                    AtomicInteger atomicInteger3 = w.f667a;
                    int d = w.d.d(childAt2) + i5;
                    if (E < d) {
                        i4 = d;
                    } else {
                        i5 = d;
                    }
                }
                if (J(i3, 32)) {
                    i4 += ((LinearLayout.LayoutParams) cVar2).topMargin;
                    i5 -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                }
                if (E < (i5 + i4) / 2) {
                    i4 = i5;
                }
                I(coordinatorLayout, t, a.h.b.b.j(i4 + paddingTop, -t.getTotalScrollRange(), 0), 0.0f);
            }
        }

        public final void Q(CoordinatorLayout coordinatorLayout, T t) {
            View view;
            boolean z;
            boolean z2;
            w.m(d.a.f.a(), coordinatorLayout);
            boolean z3 = false;
            w.j(coordinatorLayout, 0);
            w.m(d.a.g.a(), coordinatorLayout);
            w.j(coordinatorLayout, 0);
            if (t.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    view = null;
                    break;
                }
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f1241a instanceof ScrollingViewBehavior) {
                    view = childAt;
                    break;
                }
                i++;
            }
            if (view == null) {
                return;
            }
            int childCount2 = t.getChildCount();
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 >= childCount2) {
                    z2 = false;
                    break;
                } else if (((c) t.getChildAt(i2).getLayoutParams()).f1677a != 0) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z2) {
                return;
            }
            if (!(w.e(coordinatorLayout) != null)) {
                w.p(coordinatorLayout, new a());
            }
            if (E() != (-t.getTotalScrollRange())) {
                w.n(coordinatorLayout, d.a.f, null, new b.b.a.a.d.d(this, t, false));
                z3 = true;
            }
            if (E() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i3 = -t.getDownNestedPreScrollRange();
                    if (i3 != 0) {
                        w.n(coordinatorLayout, d.a.g, null, new b.b.a.a.d.c(this, coordinatorLayout, t, view, i3));
                    }
                } else {
                    w.n(coordinatorLayout, d.a.g, null, new b.b.a.a.d.d(this, t, true));
                }
                this.o = z;
            }
            z = z3;
            this.o = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void R(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                r0 = 1
                if (r4 == 0) goto L5d
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.f1677a
                r3 = r1 & 1
                if (r3 == 0) goto L5d
                java.util.concurrent.atomic.AtomicInteger r3 = a.h.j.w.f667a
                int r3 = a.h.j.w.d.d(r4)
                if (r10 <= 0) goto L4a
                r10 = r1 & 12
                if (r10 == 0) goto L4a
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5d
                goto L5b
            L4a:
                r10 = r1 & 2
                if (r10 == 0) goto L5d
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5d
            L5b:
                r9 = r0
                goto L5e
            L5d:
                r9 = r2
            L5e:
                boolean r10 = r8.j
                if (r10 == 0) goto L6a
                android.view.View r9 = r6.K(r7)
                boolean r9 = r8.e(r9)
            L6a:
                boolean r9 = r8.d(r9)
                if (r11 != 0) goto L9c
                if (r9 == 0) goto L9f
                java.util.List r7 = r7.e(r8)
                int r9 = r7.size()
                r10 = r2
            L7b:
                if (r10 >= r9) goto L9a
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f1241a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L97
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f
                if (r7 == 0) goto L9a
                r2 = r0
                goto L9a
            L97:
                int r10 = r10 + 1
                goto L7b
            L9a:
                if (r2 == 0) goto L9f
            L9c:
                r8.jumpDrawablesToCurrentState()
            L9f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.R(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.b.a.a.d.g, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.k(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            b bVar = this.m;
            if (bVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            I(coordinatorLayout, appBarLayout, i2, 0.0f);
                        }
                        G(coordinatorLayout, appBarLayout, i2);
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            I(coordinatorLayout, appBarLayout, 0, 0.0f);
                        }
                        G(coordinatorLayout, appBarLayout, 0);
                    }
                }
            } else if (bVar.f1674c) {
                i2 = -appBarLayout.getTotalScrollRange();
                G(coordinatorLayout, appBarLayout, i2);
            } else {
                if (!bVar.d) {
                    View childAt = appBarLayout.getChildAt(bVar.e);
                    int i3 = -childAt.getBottom();
                    if (this.m.g) {
                        AtomicInteger atomicInteger = w.f667a;
                        round = appBarLayout.getTopInset() + w.d.d(childAt) + i3;
                    } else {
                        round = Math.round(childAt.getHeight() * this.m.f) + i3;
                    }
                    G(coordinatorLayout, appBarLayout, round);
                }
                G(coordinatorLayout, appBarLayout, 0);
            }
            appBarLayout.f = 0;
            this.m = null;
            D(a.h.b.b.j(B(), -appBarLayout.getTotalScrollRange(), 0));
            R(coordinatorLayout, appBarLayout, B(), 0, true);
            appBarLayout.f1671a = B();
            if (!appBarLayout.willNotDraw()) {
                AtomicInteger atomicInteger2 = w.f667a;
                w.d.k(appBarLayout);
            }
            Q(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height == -2) {
                coordinatorLayout.s(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            L(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            M(coordinatorLayout, (AppBarLayout) view, i4, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof b) {
                this.m = (b) parcelable;
            } else {
                this.m = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public Parcelable v(CoordinatorLayout coordinatorLayout, View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            b O = O(absSavedState, (AppBarLayout) view);
            return O == null ? absSavedState : O;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return N(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void z(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.k == 0 || i == 1) {
                P(coordinatorLayout, appBarLayout);
                if (appBarLayout.j) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.n = new WeakReference<>(view2);
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends f {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.a.a.b.w);
            this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public AppBarLayout F(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f1241a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).j) + this.e) - E(view2);
                AtomicInteger atomicInteger = w.f667a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (!appBarLayout.j) {
                    return false;
                }
                appBarLayout.d(appBarLayout.e(view));
                return false;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                w.m(d.a.f.a(), coordinatorLayout);
                w.j(coordinatorLayout, 0);
                w.m(d.a.g.a(), coordinatorLayout);
                w.j(coordinatorLayout, 0);
                w.p(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean t(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout F = F(coordinatorLayout.d(view));
            if (F != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f1404c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    F.c(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
    }

    /* loaded from: classes.dex */
    public static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f1675a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1676b = new Rect();
    }

    /* loaded from: classes.dex */
    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f1677a;

        /* renamed from: b  reason: collision with root package name */
        public a f1678b;

        /* renamed from: c  reason: collision with root package name */
        public Interpolator f1679c;

        public c(int i, int i2) {
            super(i, i2);
            this.f1677a = 1;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1677a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.a.a.b.f1362a);
            this.f1677a = obtainStyledAttributes.getInt(1, 0);
            this.f1678b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f1679c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1677a = 1;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1677a = 1;
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1677a = 1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public c mo18generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new c((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void b() {
        Behavior behavior = this.p;
        BaseBehavior.b O = (behavior == null || this.f1672b == -1 || this.f != 0) ? null : behavior.O(a.j.a.a.f700b, this);
        this.f1672b = -1;
        this.f1673c = -1;
        this.d = -1;
        if (O != null) {
            Behavior behavior2 = this.p;
            if (behavior2.m != null) {
                return;
            }
            behavior2.m = O;
        }
    }

    public void c(boolean z, boolean z2) {
        int i = z ? 1 : 2;
        int i2 = 0;
        if (z2) {
            i2 = 4;
        }
        this.f = i | i2 | 8;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean d(boolean z) {
        if (!(!this.g) || this.i == z) {
            return false;
        }
        this.i = z;
        refreshDrawableState();
        if (!this.j || !(getBackground() instanceof g)) {
            return true;
        }
        g gVar = (g) getBackground();
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.m = ofFloat;
        ofFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.m.setInterpolator(b.b.a.a.c.a.f1370a);
        this.m.addUpdateListener(new b.b.a.a.d.a(this, gVar));
        this.m.start();
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.o != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f1671a);
            this.o.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.o;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(drawableState)) {
            return;
        }
        invalidateDrawable(drawable);
    }

    public boolean e(View view) {
        int i;
        View view2 = null;
        if (this.l == null && (i = this.k) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.k);
            }
            if (findViewById != null) {
                this.l = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.l;
        if (weakReference != null) {
            view2 = weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean f() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() == 8) {
                return false;
            }
            AtomicInteger atomicInteger = w.f667a;
            return !w.d.b(childAt);
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /* renamed from: getBehavior */
    public CoordinatorLayout.c<AppBarLayout> mo19getBehavior() {
        Behavior behavior = new Behavior();
        this.p = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int i2 = this.f1673c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.f1677a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                if ((i4 & 8) != 0) {
                    AtomicInteger atomicInteger = w.f667a;
                    i = i5 + w.d.d(childAt);
                } else if ((i4 & 2) != 0) {
                    AtomicInteger atomicInteger2 = w.f667a;
                    i = i5 + (measuredHeight - w.d.d(childAt));
                } else {
                    i = i5 + measuredHeight;
                }
                if (childCount == 0) {
                    AtomicInteger atomicInteger3 = w.f667a;
                    if (w.d.b(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                }
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f1673c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
            int i4 = cVar.f1677a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                AtomicInteger atomicInteger = w.f667a;
                i3 -= w.d.d(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.k;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        AtomicInteger atomicInteger = w.f667a;
        int d = w.d.d(this);
        if (d == 0) {
            int childCount = getChildCount();
            d = childCount >= 1 ? w.d.d(getChildAt(childCount - 1)) : 0;
            if (d == 0) {
                return getHeight() / 3;
            }
        }
        return (d * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f;
    }

    public Drawable getStatusBarForeground() {
        return this.o;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f1672b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.f1677a;
            if ((i4 & 1) == 0) {
                break;
            }
            int i5 = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + i3;
            if (i2 == 0) {
                AtomicInteger atomicInteger = w.f667a;
                if (w.d.b(childAt)) {
                    i5 -= getTopInset();
                }
            }
            i3 = i5;
            if ((i4 & 2) != 0) {
                AtomicInteger atomicInteger2 = w.f667a;
                i3 -= w.d.d(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f1672b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            b.b.a.a.a.B(this, (g) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.n == null) {
            this.n = new int[4];
        }
        int[] iArr = this.n;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.h;
        iArr[0] = z ? R.attr.state_liftable : -2130903928;
        iArr[1] = (!z || !this.i) ? -2130903929 : R.attr.state_lifted;
        iArr[2] = z ? R.attr.state_collapsible : -2130903926;
        iArr[3] = (!z || !this.i) ? -2130903925 : R.attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.l = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        AtomicInteger atomicInteger = w.f667a;
        boolean z3 = true;
        if (w.d.b(this) && f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        b();
        this.e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((c) getChildAt(i5).getLayoutParams()).f1679c != null) {
                this.e = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.g) {
            if (!this.j) {
                int childCount3 = getChildCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= childCount3) {
                        z2 = false;
                        break;
                    }
                    int i7 = ((c) getChildAt(i6).getLayoutParams()).f1677a;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        z2 = true;
                        break;
                    }
                    i6++;
                }
                if (!z2) {
                    z3 = false;
                }
            }
            if (this.h == z3) {
                return;
            }
            this.h = z3;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            AtomicInteger atomicInteger = w.f667a;
            if (w.d.b(this) && f()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = a.h.b.b.j(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        b.b.a.a.a.z(this, f);
    }

    public void setExpanded(boolean z) {
        AtomicInteger atomicInteger = w.f667a;
        c(z, w.g.c(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.j = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.k = i;
        WeakReference<View> weakReference = this.l;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.l = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.g = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.o = drawable3;
            boolean z = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.o.setState(getDrawableState());
                }
                Drawable drawable4 = this.o;
                AtomicInteger atomicInteger = w.f667a;
                drawable4.setLayoutDirection(w.e.d(this));
                this.o.setVisible(getVisibility() == 0, false);
                this.o.setCallback(this);
            }
            if (this.o != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(true ^ z);
            AtomicInteger atomicInteger2 = w.f667a;
            w.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(a.b.a.e(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.state_liftable, -2130903929}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(this, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.o;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams mo16generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams mo17generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
