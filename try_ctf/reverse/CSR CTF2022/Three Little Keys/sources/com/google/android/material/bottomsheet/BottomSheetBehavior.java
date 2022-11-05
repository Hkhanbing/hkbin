package com.google.android.material.bottomsheet;

import a.h.j.d0.d;
import a.h.j.w;
import a.j.b.e;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.w.g;
import b.b.a.a.w.j;
import de.cybersecurityrumble.threelittlekeys.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int A;
    public int B;
    public int C;
    public float D;
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public a.j.b.e K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public WeakReference<V> R;
    public WeakReference<View> S;
    public final ArrayList<c> T;
    public VelocityTracker U;
    public int V;
    public int W;
    public boolean X;
    public Map<View, Integer> Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public int f1695a;
    public final e.c a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1696b;

    /* renamed from: c  reason: collision with root package name */
    public float f1697c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public g h;
    public ColorStateList i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public j w;
    public boolean x;
    public final BottomSheetBehavior<V>.e y;
    public ValueAnimator z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1698a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1699b;

        public a(View view, int i) {
            this.f1698a = view;
            this.f1699b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.N(this.f1698a, this.f1699b, false);
        }
    }

    /* loaded from: classes.dex */
    public class b extends e.c {

        /* renamed from: a  reason: collision with root package name */
        public long f1701a;

        public b() {
        }

        @Override // a.j.b.e.c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // a.j.b.e.c
        public int b(View view, int i, int i2) {
            int G = BottomSheetBehavior.this.G();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return a.h.b.b.j(i, G, bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E);
        }

        @Override // a.j.b.e.c
        public int d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E;
        }

        @Override // a.j.b.e.c
        public void f(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.I) {
                    return;
                }
                bottomSheetBehavior.L(1);
            }
        }

        @Override // a.j.b.e.c
        public void g(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.D(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
            if (java.lang.Math.abs(r5.getTop() - r4.f1702b.G()) < java.lang.Math.abs(r5.getTop() - r4.f1702b.C)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
            if (java.lang.Math.abs(r6 - r4.f1702b.C) < java.lang.Math.abs(r6 - r4.f1702b.E)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
            if (java.lang.Math.abs(r6 - r7.B) < java.lang.Math.abs(r6 - r4.f1702b.E)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00dc, code lost:
            if (r6 < java.lang.Math.abs(r6 - r7.E)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ef, code lost:
            if (java.lang.Math.abs(r6 - r0) < java.lang.Math.abs(r6 - r4.f1702b.E)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
            if (r6 > r4.f1702b.C) goto L7;
         */
        @Override // a.j.b.e.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h(android.view.View r5, float r6, float r7) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.h(android.view.View, float, float):void");
        }

        @Override // a.j.b.e.c
        public boolean i(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.J;
            if (i2 != 1 && !bottomSheetBehavior.X) {
                if (i2 == 3 && bottomSheetBehavior.V == i) {
                    WeakReference<View> weakReference = bottomSheetBehavior.S;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.f1701a = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.R;
                return weakReference2 != null && weakReference2.get() == view;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(View view, float f);

        public abstract void b(View view, int i);
    }

    /* loaded from: classes.dex */
    public static class d extends a.j.a.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final int f1703c;
        public int d;
        public boolean e;
        public boolean f;
        public boolean g;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new d[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1703c = parcel.readInt();
            this.d = parcel.readInt();
            boolean z = false;
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1 ? true : z;
        }

        public d(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f1703c = bottomSheetBehavior.J;
            this.d = bottomSheetBehavior.d;
            this.e = bottomSheetBehavior.f1696b;
            this.f = bottomSheetBehavior.G;
            this.g = bottomSheetBehavior.H;
        }

        @Override // a.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f701a, i);
            parcel.writeInt(this.f1703c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public int f1704a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1705b;

        /* renamed from: c  reason: collision with root package name */
        public final Runnable f1706c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f1705b = false;
                a.j.b.e eVar2 = BottomSheetBehavior.this.K;
                if (eVar2 != null && eVar2.i(true)) {
                    e eVar3 = e.this;
                    eVar3.a(eVar3.f1704a);
                    return;
                }
                e eVar4 = e.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.J != 2) {
                    return;
                }
                bottomSheetBehavior.L(eVar4.f1704a);
            }
        }

        public e(a aVar) {
        }

        public void a(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.R;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f1704a = i;
            if (this.f1705b) {
                return;
            }
            Runnable runnable = this.f1706c;
            AtomicInteger atomicInteger = w.f667a;
            w.d.m(BottomSheetBehavior.this.R.get(), runnable);
            this.f1705b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f1695a = 0;
        this.f1696b = true;
        this.j = -1;
        this.k = -1;
        this.y = new e(null);
        this.D = 0.5f;
        this.F = -1.0f;
        this.I = true;
        this.J = 4;
        this.T = new ArrayList<>();
        this.Z = -1;
        this.a0 = new b();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelOffset;
        int i;
        this.f1695a = 0;
        this.f1696b = true;
        this.j = -1;
        this.k = -1;
        this.y = new e(null);
        this.D = 0.5f;
        this.F = -1.0f;
        this.I = true;
        this.J = 4;
        this.T = new ArrayList<>();
        this.Z = -1;
        this.a0 = new b();
        this.g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.a.a.b.f1363b);
        int i2 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.i = b.b.a.a.a.g(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(20)) {
            this.w = j.b(context, attributeSet, R.attr.bottomSheetStyle, 2131821330).a();
        }
        if (this.w != null) {
            g gVar = new g(this.w);
            this.h = gVar;
            gVar.f1578a.f1583b = new b.b.a.a.o.a(context);
            gVar.x();
            ColorStateList colorStateList = this.i;
            if (colorStateList != null) {
                this.h.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.h.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        ofFloat.setDuration(500L);
        this.z.addUpdateListener(new b.b.a.a.g.a(this));
        this.F = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i = peekValue.data) != -1) {
            J(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            J(i);
        }
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        if (this.G != z) {
            this.G = z;
            if (!z && this.J == 5) {
                K(4);
            }
            O();
        }
        this.m = obtainStyledAttributes.getBoolean(12, false);
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f1696b != z2) {
            this.f1696b = z2;
            if (this.R != null) {
                B();
            }
            L((!this.f1696b || this.J != 6) ? this.J : i2);
            O();
        }
        this.H = obtainStyledAttributes.getBoolean(11, false);
        this.I = obtainStyledAttributes.getBoolean(4, true);
        this.f1695a = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.D = f;
            if (this.R != null) {
                this.C = (int) ((1.0f - f) * this.Q);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 == null || peekValue2.type != 16) {
                dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                dimensionPixelOffset = peekValue2.data;
                if (dimensionPixelOffset < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.A = dimensionPixelOffset;
            this.n = obtainStyledAttributes.getBoolean(16, false);
            this.o = obtainStyledAttributes.getBoolean(17, false);
            this.p = obtainStyledAttributes.getBoolean(18, false);
            this.q = obtainStyledAttributes.getBoolean(19, true);
            this.r = obtainStyledAttributes.getBoolean(13, false);
            this.s = obtainStyledAttributes.getBoolean(14, false);
            this.t = obtainStyledAttributes.getBoolean(15, false);
            obtainStyledAttributes.recycle();
            this.f1697c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.J;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        a.j.b.e eVar = this.K;
        if (eVar != null && (this.I || i == 1)) {
            eVar.n(motionEvent);
        }
        if (actionMasked == 0) {
            this.V = -1;
            VelocityTracker velocityTracker = this.U;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.U = null;
            }
        }
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        if (this.K != null && (this.I || this.J == 1)) {
            z = true;
        }
        if (z && actionMasked == 2 && !this.L) {
            float abs = Math.abs(this.W - motionEvent.getY());
            a.j.b.e eVar2 = this.K;
            if (abs > eVar2.f707b) {
                eVar2.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.L;
    }

    public final void B() {
        int C = C();
        if (this.f1696b) {
            this.E = Math.max(this.Q - C, this.B);
        } else {
            this.E = this.Q - C;
        }
    }

    public final int C() {
        int i;
        return this.e ? Math.min(Math.max(this.f, this.Q - ((this.P * 9) / 16)), this.O) + this.u : (this.m || this.n || (i = this.l) <= 0) ? this.d + this.u : Math.max(this.d, i + this.g);
    }

    public void D(int i) {
        float f;
        float f2;
        V v = this.R.get();
        if (v == null || this.T.isEmpty()) {
            return;
        }
        int i2 = this.E;
        if (i > i2 || i2 == G()) {
            int i3 = this.E;
            f = i3 - i;
            f2 = this.Q - i3;
        } else {
            int i4 = this.E;
            f = i4 - i;
            f2 = i4 - G();
        }
        float f3 = f / f2;
        for (int i5 = 0; i5 < this.T.size(); i5++) {
            this.T.get(i5).a(v, f3);
        }
    }

    public View E(View view) {
        AtomicInteger atomicInteger = w.f667a;
        if (w.i.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View E = E(viewGroup.getChildAt(i));
            if (E != null) {
                return E;
            }
        }
        return null;
    }

    public final int F(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public int G() {
        if (this.f1696b) {
            return this.B;
        }
        return Math.max(this.A, this.q ? 0 : this.v);
    }

    public final int H(int i) {
        if (i != 3) {
            if (i == 4) {
                return this.E;
            }
            if (i == 5) {
                return this.Q;
            }
            if (i == 6) {
                return this.C;
            }
            throw new IllegalArgumentException("Invalid state to get top offset: " + i);
        }
        return G();
    }

    public final void I(V v, d.a aVar, int i) {
        w.n(v, aVar, null, new b.b.a.a.g.c(this, i));
    }

    public void J(int i) {
        boolean z = true;
        if (i == -1) {
            if (!this.e) {
                this.e = true;
            }
            z = false;
        } else {
            if (this.e || this.d != i) {
                this.e = false;
                this.d = Math.max(0, i);
            }
            z = false;
        }
        if (z) {
            R(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
        if (a.h.j.w.g.b(r4) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L74
            r1 = 2
            if (r4 != r1) goto L8
            goto L74
        L8:
            boolean r1 = r3.G
            if (r1 != 0) goto L26
            r1 = 5
            if (r4 != r1) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot set state: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r4)
            return
        L26:
            r1 = 6
            if (r4 != r1) goto L37
            boolean r1 = r3.f1696b
            if (r1 == 0) goto L37
            int r1 = r3.H(r4)
            int r2 = r3.B
            if (r1 > r2) goto L37
            r1 = 3
            goto L38
        L37:
            r1 = r4
        L38:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r3.R
            if (r2 == 0) goto L70
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L43
            goto L70
        L43:
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.R
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r4, r1)
            android.view.ViewParent r1 = r4.getParent()
            if (r1 == 0) goto L65
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L65
            java.util.concurrent.atomic.AtomicInteger r1 = a.h.j.w.f667a
            boolean r1 = a.h.j.w.g.b(r4)
            if (r1 == 0) goto L65
            goto L66
        L65:
            r0 = 0
        L66:
            if (r0 == 0) goto L6c
            r4.post(r2)
            goto L73
        L6c:
            r2.run()
            goto L73
        L70:
            r3.L(r4)
        L73:
            return
        L74:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "STATE_"
            java.lang.StringBuilder r2 = b.a.a.a.a.f(r2)
            if (r4 != r0) goto L81
            java.lang.String r4 = "DRAGGING"
            goto L83
        L81:
            java.lang.String r4 = "SETTLING"
        L83:
            r2.append(r4)
            java.lang.String r4 = " should not be set externally."
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.K(int):void");
    }

    public void L(int i) {
        V v;
        if (this.J == i) {
            return;
        }
        this.J = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.G;
        }
        WeakReference<V> weakReference = this.R;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            Q(true);
        } else if (i == 6 || i == 5 || i == 4) {
            Q(false);
        }
        P(i);
        for (int i2 = 0; i2 < this.T.size(); i2++) {
            this.T.get(i2).b(v, i);
        }
        O();
    }

    public boolean M(View view, float f) {
        if (this.H) {
            return true;
        }
        if (view.getTop() < this.E) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.E)) / ((float) C()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r4 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r1.t(r4.getLeft(), r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            int r0 = r3.H(r5)
            a.j.b.e r1 = r3.K
            r2 = 0
            if (r1 == 0) goto L33
            if (r6 == 0) goto L16
            int r4 = r4.getLeft()
            boolean r4 = r1.t(r4, r0)
            if (r4 == 0) goto L33
            goto L32
        L16:
            int r6 = r4.getLeft()
            r1.s = r4
            r4 = -1
            r1.f708c = r4
            boolean r4 = r1.l(r6, r0, r2, r2)
            if (r4 != 0) goto L30
            int r6 = r1.f706a
            if (r6 != 0) goto L30
            android.view.View r6 = r1.s
            if (r6 == 0) goto L30
            r6 = 0
            r1.s = r6
        L30:
            if (r4 == 0) goto L33
        L32:
            r2 = 1
        L33:
            if (r2 == 0) goto L42
            r4 = 2
            r3.L(r4)
            r3.P(r5)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r4 = r3.y
            r4.a(r5)
            goto L45
        L42:
            r3.L(r5)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.N(android.view.View, int, boolean):void");
    }

    public final void O() {
        V v;
        d.a aVar;
        int i;
        WeakReference<V> weakReference = this.R;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        w.m(524288, v);
        w.j(v, 0);
        w.m(262144, v);
        w.j(v, 0);
        w.m(1048576, v);
        w.j(v, 0);
        int i2 = this.Z;
        if (i2 != -1) {
            w.m(i2, v);
            w.j(v, 0);
        }
        int i3 = 6;
        if (!this.f1696b && this.J != 6) {
            String string = v.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            b.b.a.a.g.c cVar = new b.b.a.a.g.c(this, 6);
            List<d.a> g = w.g(v);
            int i4 = 0;
            while (true) {
                if (i4 >= g.size()) {
                    int i5 = 0;
                    int i6 = -1;
                    while (true) {
                        int[] iArr = w.e;
                        if (i5 >= iArr.length || i6 != -1) {
                            break;
                        }
                        int i7 = iArr[i5];
                        boolean z = true;
                        for (int i8 = 0; i8 < g.size(); i8++) {
                            z &= g.get(i8).a() != i7;
                        }
                        if (z) {
                            i6 = i7;
                        }
                        i5++;
                    }
                    i = i6;
                } else if (TextUtils.equals(string, g.get(i4).b())) {
                    i = g.get(i4).a();
                    break;
                } else {
                    i4++;
                }
            }
            if (i != -1) {
                w.a(v, new d.a(null, i, string, cVar, null));
            }
            this.Z = i;
        }
        if (this.G && this.J != 5) {
            I(v, d.a.j, 5);
        }
        int i9 = this.J;
        if (i9 == 3) {
            if (this.f1696b) {
                i3 = 4;
            }
            aVar = d.a.i;
        } else if (i9 != 4) {
            if (i9 != 6) {
                return;
            }
            I(v, d.a.i, 4);
            I(v, d.a.h, 3);
            return;
        } else {
            if (this.f1696b) {
                i3 = 3;
            }
            aVar = d.a.h;
        }
        I(v, aVar, i3);
    }

    public final void P(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.x == z) {
            return;
        }
        this.x = z;
        if (this.h == null || (valueAnimator = this.z) == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.z.reverse();
            return;
        }
        float f = z ? 0.0f : 1.0f;
        this.z.setFloatValues(1.0f - f, f);
        this.z.start();
    }

    public final void Q(boolean z) {
        WeakReference<V> weakReference = this.R;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            if (this.Y != null) {
                return;
            }
            this.Y = new HashMap(childCount);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt != this.R.get() && z) {
                this.Y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (z) {
            return;
        }
        this.Y = null;
    }

    public final void R(boolean z) {
        V v;
        if (this.R != null) {
            B();
            if (this.J != 4 || (v = this.R.get()) == null) {
                return;
            }
            if (z) {
                K(4);
            } else {
                v.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void f(CoordinatorLayout.f fVar) {
        this.R = null;
        this.K = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void i() {
        this.R = null;
        this.K = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        a.j.b.e eVar;
        if (v.isShown() && this.I) {
            int actionMasked = motionEvent.getActionMasked();
            View view = null;
            if (actionMasked == 0) {
                this.V = -1;
                VelocityTracker velocityTracker = this.U;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.U = null;
                }
            }
            if (this.U == null) {
                this.U = VelocityTracker.obtain();
            }
            this.U.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.W = (int) motionEvent.getY();
                if (this.J != 2) {
                    WeakReference<View> weakReference = this.S;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && coordinatorLayout.p(view2, x, this.W)) {
                        this.V = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.X = true;
                    }
                }
                this.L = this.V == -1 && !coordinatorLayout.p(v, x, this.W);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.X = false;
                this.V = -1;
                if (this.L) {
                    this.L = false;
                    return false;
                }
            }
            if (!this.L && (eVar = this.K) != null && eVar.u(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.S;
            if (weakReference2 != null) {
                view = weakReference2.get();
            }
            return actionMasked == 2 && view != null && !this.L && this.J != 1 && !coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.K != null && Math.abs(((float) this.W) - motionEvent.getY()) > ((float) this.K.f707b);
        }
        this.L = true;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0162 A[LOOP:0: B:84:0x015a->B:86:0x0162, LOOP_END] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r11, V r12, int r13) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(F(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.j, marginLayoutParams.width), F(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.k, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.S;
        return (weakReference == null || view != weakReference.get() || this.J == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.S;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < G()) {
                iArr[1] = top - G();
                AtomicInteger atomicInteger = w.f667a;
                v.offsetTopAndBottom(-iArr[1]);
                i4 = 3;
                L(i4);
            } else if (!this.I) {
                return;
            } else {
                iArr[1] = i2;
                int i6 = -i2;
                AtomicInteger atomicInteger2 = w.f667a;
                v.offsetTopAndBottom(i6);
                L(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i7 = this.E;
            if (i5 > i7 && !this.G) {
                iArr[1] = top - i7;
                AtomicInteger atomicInteger3 = w.f667a;
                v.offsetTopAndBottom(-iArr[1]);
                i4 = 4;
                L(i4);
            } else if (!this.I) {
                return;
            } else {
                iArr[1] = i2;
                int i62 = -i2;
                AtomicInteger atomicInteger22 = w.f667a;
                v.offsetTopAndBottom(i62);
                L(1);
            }
        }
        D(v.getTop());
        this.M = i2;
        this.N = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i = this.f1695a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.d = dVar.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f1696b = dVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.G = dVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.H = dVar.g;
            }
        }
        int i2 = dVar.f1703c;
        if (i2 == 1 || i2 == 2) {
            this.J = 4;
        } else {
            this.J = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable v(CoordinatorLayout coordinatorLayout, V v) {
        return new d((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean x(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.M = 0;
        this.N = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r5.getTop() <= r3.C) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        if (java.lang.Math.abs(r4 - r3.B) < java.lang.Math.abs(r4 - r3.E)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
        if (r4 < java.lang.Math.abs(r4 - r3.E)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.E)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
        if (java.lang.Math.abs(r4 - r3.C) < java.lang.Math.abs(r4 - r3.E)) goto L18;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.G()
            r0 = 3
            if (r4 != r7) goto Lf
            r3.L(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.S
            if (r4 == 0) goto Lb6
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto Lb6
            boolean r4 = r3.N
            if (r4 != 0) goto L1f
            goto Lb6
        L1f:
            int r4 = r3.M
            r6 = 4
            r7 = 6
            if (r4 <= 0) goto L35
            boolean r4 = r3.f1696b
            if (r4 == 0) goto L2b
            goto Lb0
        L2b:
            int r4 = r5.getTop()
            int r6 = r3.C
            if (r4 <= r6) goto Lb0
            goto Lad
        L35:
            boolean r4 = r3.G
            if (r4 == 0) goto L56
            android.view.VelocityTracker r4 = r3.U
            if (r4 != 0) goto L3f
            r4 = 0
            goto L4e
        L3f:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f1697c
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.U
            int r1 = r3.V
            float r4 = r4.getYVelocity(r1)
        L4e:
            boolean r4 = r3.M(r5, r4)
            if (r4 == 0) goto L56
            r0 = 5
            goto Lb0
        L56:
            int r4 = r3.M
            if (r4 != 0) goto L93
            int r4 = r5.getTop()
            boolean r1 = r3.f1696b
            if (r1 == 0) goto L74
            int r7 = r3.B
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            int r1 = r3.E
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r7 >= r4) goto Laf
            goto Lb0
        L74:
            int r1 = r3.C
            if (r4 >= r1) goto L83
            int r6 = r3.E
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto Lad
            goto Lb0
        L83:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.E
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto Laf
            goto Lad
        L93:
            boolean r4 = r3.f1696b
            if (r4 == 0) goto L98
            goto Laf
        L98:
            int r4 = r5.getTop()
            int r0 = r3.C
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.E
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto Laf
        Lad:
            r0 = r7
            goto Lb0
        Laf:
            r0 = r6
        Lb0:
            r4 = 0
            r3.N(r5, r0, r4)
            r3.N = r4
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }
}
