package a.p.b;

import a.h.j.w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class l extends RecyclerView.k implements RecyclerView.o {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.p C;

    /* renamed from: a  reason: collision with root package name */
    public final int f1037a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1038b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f1039c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            int i = lVar.A;
            if (i == 1) {
                lVar.z.cancel();
            } else if (i != 2) {
                return;
            }
            lVar.A = 3;
            ValueAnimator valueAnimator = lVar.z;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            lVar.z.setDuration(500);
            lVar.z.start();
        }
    }

    /* loaded from: classes.dex */
    public class b extends RecyclerView.p {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void b(RecyclerView recyclerView, int i, int i2) {
            l lVar = l.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = lVar.s.computeVerticalScrollRange();
            int i3 = lVar.r;
            lVar.t = computeVerticalScrollRange - i3 > 0 && i3 >= lVar.f1037a;
            int computeHorizontalScrollRange = lVar.s.computeHorizontalScrollRange();
            int i4 = lVar.q;
            boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= lVar.f1037a;
            lVar.u = z;
            boolean z2 = lVar.t;
            if (!z2 && !z) {
                if (lVar.v == 0) {
                    return;
                }
                lVar.j(0);
                return;
            }
            if (z2) {
                float f = i3;
                lVar.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                lVar.k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (lVar.u) {
                float f2 = computeHorizontalScrollOffset;
                float f3 = i4;
                lVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
                lVar.n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = lVar.v;
            if (i5 != 0 && i5 != 1) {
                return;
            }
            lVar.j(1);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1042a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1042a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1042a) {
                this.f1042a = false;
            } else if (((Float) l.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                l lVar = l.this;
                lVar.A = 0;
                lVar.j(0);
            } else {
                l lVar2 = l.this;
                lVar2.A = 2;
                lVar2.s.invalidate();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l.this.f1039c.setAlpha(floatValue);
            l.this.d.setAlpha(floatValue);
            l.this.s.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        boolean z = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        this.B = new a();
        b bVar = new b();
        this.C = bVar;
        this.f1039c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f1037a = i2;
        this.f1038b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.l lVar = recyclerView2.l;
            if (lVar != null) {
                lVar.d("Cannot remove item decoration during a scroll  or layout");
            }
            recyclerView2.n.remove(this);
            if (recyclerView2.n.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z);
            }
            recyclerView2.Q();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.s;
            recyclerView3.o.remove(this);
            if (recyclerView3.p == this) {
                recyclerView3.p = null;
            }
            List<RecyclerView.p> list = this.s.g0;
            if (list != null) {
                list.remove(bVar);
            }
            f();
        }
        this.s = recyclerView;
        recyclerView.g(this);
        this.s.o.add(this);
        this.s.h(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean h = h(motionEvent.getX(), motionEvent.getY());
            boolean g = g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (h || g)) {
                if (g) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (h) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                j(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean h = h(motionEvent.getX(), motionEvent.getY());
            boolean g = g(motionEvent.getX(), motionEvent.getY());
            if (!h && !g) {
                return;
            }
            if (g) {
                this.w = 1;
                this.p = (int) motionEvent.getX();
            } else if (h) {
                this.w = 2;
                this.m = (int) motionEvent.getY();
            }
            j(2);
        } else if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            j(1);
            this.w = 0;
        } else if (motionEvent.getAction() != 2 || this.v != 2) {
        } else {
            k();
            if (this.w == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.y;
                int i = this.f1038b;
                iArr[0] = i;
                iArr[1] = this.q - i;
                float max = Math.max(iArr[0], Math.min(iArr[1], x));
                if (Math.abs(this.o - max) >= 2.0f) {
                    int i2 = i(this.p, max, iArr, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
                    if (i2 != 0) {
                        this.s.scrollBy(i2, 0);
                    }
                    this.p = max;
                }
            }
            if (this.w != 2) {
                return;
            }
            float y = motionEvent.getY();
            int[] iArr2 = this.x;
            int i3 = this.f1038b;
            iArr2[0] = i3;
            iArr2[1] = this.r - i3;
            float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y));
            if (Math.abs(this.l - max2) < 2.0f) {
                return;
            }
            int i4 = i(this.m, max2, iArr2, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
            if (i4 != 0) {
                this.s.scrollBy(0, i4);
            }
            this.m = max2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.w wVar) {
        int i;
        int i2;
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            j(0);
        } else if (this.A == 0) {
        } else {
            if (this.t) {
                int i3 = this.q;
                int i4 = this.e;
                int i5 = i3 - i4;
                int i6 = this.l;
                int i7 = this.k;
                int i8 = i6 - (i7 / 2);
                this.f1039c.setBounds(0, 0, i4, i7);
                this.d.setBounds(0, 0, this.f, this.r);
                RecyclerView recyclerView2 = this.s;
                AtomicInteger atomicInteger = a.h.j.w.f667a;
                boolean z = true;
                if (w.e.d(recyclerView2) != 1) {
                    z = false;
                }
                if (z) {
                    this.d.draw(canvas);
                    canvas.translate(this.e, i8);
                    canvas.scale(-1.0f, 1.0f);
                    this.f1039c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i5 = this.e;
                } else {
                    canvas.translate(i5, 0.0f);
                    this.d.draw(canvas);
                    canvas.translate(0.0f, i8);
                    this.f1039c.draw(canvas);
                }
                canvas.translate(-i5, -i8);
            }
            if (!this.u) {
                return;
            }
            int i9 = this.r;
            int i10 = this.i;
            int i11 = this.o;
            int i12 = this.n;
            this.g.setBounds(0, 0, i12, i10);
            this.h.setBounds(0, 0, this.q, this.j);
            canvas.translate(0.0f, i9 - i10);
            this.h.draw(canvas);
            canvas.translate(i11 - (i12 / 2), 0.0f);
            this.g.draw(canvas);
            canvas.translate(-i2, -i);
        }
    }

    public final void f() {
        this.s.removeCallbacks(this.B);
    }

    public boolean g(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public boolean h(float f, float f2) {
        RecyclerView recyclerView = this.s;
        AtomicInteger atomicInteger = a.h.j.w.f667a;
        if (w.e.d(recyclerView) == 1) {
            if (f > this.e / 2) {
                return false;
            }
        } else if (f < this.q - this.e) {
            return false;
        }
        int i = this.l;
        int i2 = this.k / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i2 + i));
    }

    public final int i(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 < i5 && i7 >= 0) {
            return i6;
        }
        return 0;
    }

    public void j(int i) {
        int i2;
        if (i == 2 && this.v != 2) {
            this.f1039c.setState(D);
            f();
        }
        if (i == 0) {
            this.s.invalidate();
        } else {
            k();
        }
        if (this.v != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.v = i;
        }
        this.f1039c.setState(E);
        i2 = 1200;
        f();
        this.s.postDelayed(this.B, i2);
        this.v = i;
    }

    public void k() {
        int i = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }
}
