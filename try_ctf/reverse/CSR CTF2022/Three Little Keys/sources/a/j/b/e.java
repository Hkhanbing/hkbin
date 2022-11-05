package a.j.b;

import a.h.j.w;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class e {
    public static final Interpolator w = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f706a;

    /* renamed from: b  reason: collision with root package name */
    public int f707b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public float m;
    public float n;
    public int o;
    public final int p;
    public OverScroller q;
    public final c r;
    public View s;
    public boolean t;
    public final ViewGroup u;

    /* renamed from: c  reason: collision with root package name */
    public int f708c = -1;
    public final Runnable v = new b();

    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.s(0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract int a(View view, int i, int i2);

        public abstract int b(View view, int i, int i2);

        public int c(View view) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public void e(View view, int i) {
        }

        public abstract void f(int i);

        public abstract void g(View view, int i, int i2, int i3, int i4);

        public abstract void h(View view, float f, float f2);

        public abstract boolean i(View view, int i);
    }

    public e(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar != null) {
            this.u = viewGroup;
            this.r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.p = i;
            this.o = i;
            this.f707b = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = new OverScroller(context, w);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public void a() {
        this.f708c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void b(View view, int i) {
        if (view.getParent() != this.u) {
            StringBuilder f = b.a.a.a.a.f("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            f.append(this.u);
            f.append(")");
            throw new IllegalArgumentException(f.toString());
        }
        this.s = view;
        this.f708c = i;
        this.r.e(view, i);
        s(1);
    }

    public final boolean c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (0 & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f707b;
        if (abs <= i3 && abs2 <= i3) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            Objects.requireNonNull(this.r);
        }
        return (this.i[i] & i2) == 0 && abs > ((float) this.f707b);
    }

    public final boolean d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.r.c(view) > 0;
        boolean z2 = this.r.d(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f707b) : z2 && Math.abs(f2) > ((float) this.f707b);
        }
        float f3 = f2 * f2;
        int i = this.f707b;
        return f3 + (f * f) > ((float) (i * i));
    }

    public final float e(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    public final int f(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    public final void g(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (!z) {
                return;
            }
            fArr[i] = 0.0f;
            this.e[i] = 0.0f;
            this.f[i] = 0.0f;
            this.g[i] = 0.0f;
            this.h[i] = 0;
            this.i[i] = 0;
            this.j[i] = 0;
            this.k = (~i3) & i2;
        }
    }

    public final int h(int i, int i2, int i3) {
        int width;
        if (i == 0) {
            return 0;
        }
        float width2 = this.u.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public boolean i(boolean z) {
        if (this.f706a == 2) {
            boolean computeScrollOffset = this.q.computeScrollOffset();
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            int left = currX - this.s.getLeft();
            int top = currY - this.s.getTop();
            if (left != 0) {
                View view = this.s;
                AtomicInteger atomicInteger = w.f667a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.s;
                AtomicInteger atomicInteger2 = w.f667a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.r.g(this.s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.q.getFinalX() && currY == this.q.getFinalY()) {
                this.q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.u.post(this.v);
                } else {
                    s(0);
                }
            }
        }
        return this.f706a == 2;
    }

    public final void j(float f, float f2) {
        this.t = true;
        this.r.h(this.s, f, f2);
        this.t = false;
        if (this.f706a == 1) {
            s(0);
        }
    }

    public View k(int i, int i2) {
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.u;
            Objects.requireNonNull(this.r);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean l(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.q.abortAnimation();
            s(0);
            return false;
        }
        View view = this.s;
        int f5 = f(i3, (int) this.n, (int) this.m);
        int f6 = f(i4, (int) this.n, (int) this.m);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(f5);
        int abs4 = Math.abs(f6);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (f5 != 0) {
            f = abs3;
            f2 = i7;
        } else {
            f = abs;
            f2 = i8;
        }
        float f7 = f / f2;
        if (f6 != 0) {
            f3 = abs4;
            f4 = i7;
        } else {
            f3 = abs2;
            f4 = i8;
        }
        int h = h(i5, f5, this.r.c(view));
        this.q.startScroll(left, top, i5, i6, (int) ((h(i6, f6, this.r.d(view)) * (f3 / f4)) + (h * f7)));
        s(2);
        return true;
    }

    public final boolean m(int i) {
        if (!((this.k & (1 << i)) != 0)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    public void n(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f706a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (m(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.d[pointerId];
                                float f2 = y - this.e[pointerId];
                                p(f, f2, pointerId);
                                if (this.f706a != 1) {
                                    View k = k((int) x, (int) y);
                                    if (d(k, f, f2) && v(k, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (!m(this.f708c)) {
                        return;
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f708c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f;
                        int i3 = this.f708c;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.g[i3]);
                        int left = this.s.getLeft() + i4;
                        int top = this.s.getTop() + i5;
                        int left2 = this.s.getLeft();
                        int top2 = this.s.getTop();
                        if (i4 != 0) {
                            left = this.r.a(this.s, left, i4);
                            AtomicInteger atomicInteger = w.f667a;
                            this.s.offsetLeftAndRight(left - left2);
                        }
                        int i6 = left;
                        if (i5 != 0) {
                            top = this.r.b(this.s, top, i5);
                            AtomicInteger atomicInteger2 = w.f667a;
                            this.s.offsetTopAndBottom(top - top2);
                        }
                        int i7 = top;
                        if (i4 != 0 || i5 != 0) {
                            this.r.g(this.s, i6, i7, i6 - left2, i7 - top2);
                        }
                    }
                    r(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            return;
                        }
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        if (this.f706a == 1 && pointerId2 == this.f708c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId3 = motionEvent.getPointerId(i2);
                                if (pointerId3 != this.f708c) {
                                    View k2 = k((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.s;
                                    if (k2 == view && v(view, pointerId3)) {
                                        i = this.f708c;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                o();
                            }
                        }
                        g(pointerId2);
                        return;
                    }
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    float x3 = motionEvent.getX(actionIndex);
                    float y3 = motionEvent.getY(actionIndex);
                    q(x3, y3, pointerId4);
                    if (this.f706a != 0) {
                        int i8 = (int) x3;
                        int i9 = (int) y3;
                        View view2 = this.s;
                        if (view2 != null && i8 >= view2.getLeft() && i8 < view2.getRight() && i9 >= view2.getTop() && i9 < view2.getBottom()) {
                            i2 = 1;
                        }
                        if (i2 == 0) {
                            return;
                        }
                        v(this.s, pointerId4);
                        return;
                    }
                    v(k((int) x3, (int) y3), pointerId4);
                    if ((this.h[pointerId4] & 0) == 0) {
                        return;
                    }
                } else if (this.f706a == 1) {
                    j(0.0f, 0.0f);
                }
            } else if (this.f706a == 1) {
                o();
            }
            a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View k3 = k((int) x4, (int) y4);
        q(x4, y4, pointerId5);
        v(k3, pointerId5);
        if ((this.h[pointerId5] & 0) == 0) {
            return;
        }
        Objects.requireNonNull(this.r);
    }

    public final void o() {
        this.l.computeCurrentVelocity(1000, this.m);
        j(e(this.l.getXVelocity(this.f708c), this.n, this.m), e(this.l.getYVelocity(this.f708c), this.n, this.m));
    }

    public final void p(float f, float f2, int i) {
        int i2 = 1;
        if (!c(f, f2, i, 1)) {
            i2 = 0;
        }
        if (c(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (c(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (c(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | i2;
            Objects.requireNonNull(this.r);
        }
    }

    public final void q(float f, float f2, int i) {
        float[] fArr = this.d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.e;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.h;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.u.getLeft() + this.o) {
            i2 = 1;
        }
        if (i5 < this.u.getTop() + this.o) {
            i2 |= 4;
        }
        if (i4 > this.u.getRight() - this.o) {
            i2 |= 2;
        }
        if (i5 > this.u.getBottom() - this.o) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.k |= 1 << i;
    }

    public final void r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    public void s(int i) {
        this.u.removeCallbacks(this.v);
        if (this.f706a != i) {
            this.f706a = i;
            this.r.f(i);
            if (this.f706a != 0) {
                return;
            }
            this.s = null;
        }
    }

    public boolean t(int i, int i2) {
        if (this.t) {
            return l(i, i2, (int) this.l.getXVelocity(this.f708c), (int) this.l.getYVelocity(this.f708c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean u(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.b.e.u(android.view.MotionEvent):boolean");
    }

    public boolean v(View view, int i) {
        if (view == this.s && this.f708c == i) {
            return true;
        }
        if (view == null || !this.r.i(view, i)) {
            return false;
        }
        this.f708c = i;
        b(view, i);
        return true;
    }
}
