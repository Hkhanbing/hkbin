package com.google.android.material.behavior;

import a.h.j.d0.d;
import a.h.j.w;
import a.j.b.e;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public e f1684a;

    /* renamed from: b  reason: collision with root package name */
    public b f1685b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1686c;
    public int d = 2;
    public float e = 0.5f;
    public float f = 0.0f;
    public float g = 0.5f;
    public final e.c h = new a();

    /* loaded from: classes.dex */
    public class a extends e.c {

        /* renamed from: a  reason: collision with root package name */
        public int f1687a;

        /* renamed from: b  reason: collision with root package name */
        public int f1688b = -1;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
            r5 = r2.f1687a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
            if (r5 != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
            if (r5 != false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
            r5 = r2.f1687a - r3.getWidth();
            r3 = r2.f1687a;
         */
        @Override // a.j.b.e.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r5 = a.h.j.w.f667a
                int r5 = a.h.j.w.e.d(r3)
                r0 = 1
                if (r5 != r0) goto Lb
                r5 = r0
                goto Lc
            Lb:
                r5 = 0
            Lc:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.d
                if (r1 != 0) goto L26
                if (r5 == 0) goto L1e
            L14:
                int r5 = r2.f1687a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f1687a
                goto L39
            L1e:
                int r5 = r2.f1687a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L39
            L26:
                if (r1 != r0) goto L2b
                if (r5 == 0) goto L14
                goto L1e
            L2b:
                int r5 = r2.f1687a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f1687a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L39:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // a.j.b.e.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // a.j.b.e.c
        public int c(View view) {
            return view.getWidth();
        }

        @Override // a.j.b.e.c
        public void e(View view, int i) {
            this.f1688b = i;
            this.f1687a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // a.j.b.e.c
        public void f(int i) {
            b bVar = SwipeDismissBehavior.this.f1685b;
            if (bVar != null) {
                b.b.a.a.x.a aVar = (b.b.a.a.x.a) bVar;
                Objects.requireNonNull(aVar);
                if (i == 0) {
                    b.b.a.a.x.b a2 = b.b.a.a.x.b.a();
                    Objects.requireNonNull(aVar.f1610a);
                    synchronized (a2.f1611a) {
                        a2.b(null);
                    }
                } else if (i != 1 && i != 2) {
                } else {
                    b.b.a.a.x.b a3 = b.b.a.a.x.b.a();
                    Objects.requireNonNull(aVar.f1610a);
                    synchronized (a3.f1611a) {
                        a3.b(null);
                    }
                }
            }
        }

        @Override // a.j.b.e.c
        public void g(View view, int i, int i2, int i3, int i4) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f) + this.f1687a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.g) + this.f1687a;
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.C(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f1687a) >= java.lang.Math.round(r8.getWidth() * r7.f1689c.e)) goto L37;
         */
        @Override // a.j.b.e.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f1688b = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L3c
                java.util.concurrent.atomic.AtomicInteger r4 = a.h.j.w.f667a
                int r4 = a.h.j.w.e.d(r8)
                if (r4 != r2) goto L18
                r4 = r2
                goto L19
            L18:
                r4 = r3
            L19:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.d
                r6 = 2
                if (r5 != r6) goto L21
                goto L2c
            L21:
                if (r5 != 0) goto L30
                if (r4 == 0) goto L2a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L2e
                goto L2c
            L2a:
                if (r1 <= 0) goto L2e
            L2c:
                r9 = r2
                goto L58
            L2e:
                r9 = r3
                goto L58
            L30:
                if (r5 != r2) goto L2e
                if (r4 == 0) goto L37
                if (r1 <= 0) goto L2e
                goto L3b
            L37:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L2e
            L3b:
                goto L2c
            L3c:
                int r9 = r8.getLeft()
                int r0 = r7.f1687a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r1 = r1.e
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L2e
                goto L2c
            L58:
                if (r9 == 0) goto L66
                int r9 = r8.getLeft()
                int r0 = r7.f1687a
                if (r9 >= r0) goto L64
                int r0 = r0 - r10
                goto L69
            L64:
                int r0 = r0 + r10
                goto L69
            L66:
                int r0 = r7.f1687a
                r2 = r3
            L69:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                a.j.b.e r9 = r9.f1684a
                int r10 = r8.getTop()
                boolean r9 = r9.t(r0, r10)
                if (r9 == 0) goto L84
                com.google.android.material.behavior.SwipeDismissBehavior$c r9 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r2)
                java.util.concurrent.atomic.AtomicInteger r10 = a.h.j.w.f667a
                a.h.j.w.d.m(r8, r9)
                goto L91
            L84:
                if (r2 == 0) goto L91
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = r9.f1685b
                if (r9 == 0) goto L91
                b.b.a.a.x.a r9 = (b.b.a.a.x.a) r9
                r9.a(r8)
            L91:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // a.j.b.e.c
        public boolean i(View view, int i) {
            int i2 = this.f1688b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.B(view);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final View f1690a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f1691b;

        public c(View view, boolean z) {
            this.f1690a = view;
            this.f1691b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            e eVar = SwipeDismissBehavior.this.f1684a;
            if (eVar != null && eVar.i(true)) {
                View view = this.f1690a;
                AtomicInteger atomicInteger = w.f667a;
                w.d.m(view, this);
            } else if (!this.f1691b || (bVar = SwipeDismissBehavior.this.f1685b) == null) {
            } else {
                ((b.b.a.a.x.a) bVar).a(this.f1690a);
            }
        }
    }

    public static float C(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        e eVar = this.f1684a;
        if (eVar != null) {
            eVar.n(motionEvent);
            return true;
        }
        return false;
    }

    public boolean B(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f1686c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.p(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1686c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1686c = false;
        }
        if (z) {
            if (this.f1684a == null) {
                this.f1684a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.h);
            }
            return this.f1684a.u(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
        AtomicInteger atomicInteger = w.f667a;
        if (w.d.c(v) == 0) {
            w.d.s(v, 1);
            w.m(1048576, v);
            w.j(v, 0);
            if (B(v)) {
                w.n(v, d.a.j, null, new b.b.a.a.e.a(this));
            }
        }
        return false;
    }
}
