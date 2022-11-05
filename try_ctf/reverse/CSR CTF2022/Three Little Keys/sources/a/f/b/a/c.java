package a.f.b.a;

import a.f.b.a.d;
import a.f.c.c;
import a.h.j.m;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class c extends ConstraintLayout implements m {
    public static final /* synthetic */ int V = 0;
    public float A;
    public float B;
    public float C;
    public long D;
    public float E;
    public InterfaceC0009c F;
    public int G;
    public a.f.b.a.a H;
    public long I;
    public boolean J;
    public ArrayList<a.f.b.a.b> K;
    public ArrayList<a.f.b.a.b> L;
    public CopyOnWriteArrayList<InterfaceC0009c> M;
    public int N;
    public float O;
    public float P;
    public boolean Q;
    public b R;
    public boolean S;
    public d T;
    public boolean U;
    public float u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public long z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.R.a();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public float f436a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f437b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f438c = -1;
        public int d = -1;

        public b() {
        }

        public void a() {
            int a2;
            d dVar = d.SETUP;
            int i = this.f438c;
            if (i != -1 || this.d != -1) {
                if (i == -1) {
                    c.this.w(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        c cVar = c.this;
                        cVar.setState(dVar);
                        cVar.w = i;
                        cVar.v = -1;
                        cVar.x = -1;
                        a.f.c.c cVar2 = cVar.k;
                        if (cVar2 != null) {
                            float f = -1;
                            int i3 = cVar2.f452b;
                            if (i3 == i) {
                                c.a valueAt = i == -1 ? cVar2.d.valueAt(0) : cVar2.d.get(i3);
                                int i4 = cVar2.f453c;
                                if ((i4 == -1 || !valueAt.f455b.get(i4).a(f, f)) && cVar2.f453c != (a2 = valueAt.a(f, f))) {
                                    a.f.c.d dVar2 = a2 == -1 ? null : valueAt.f455b.get(a2).f;
                                    if (a2 != -1) {
                                        int i5 = valueAt.f455b.get(a2).e;
                                    }
                                    if (dVar2 != null) {
                                        cVar2.f453c = a2;
                                        dVar2.a(cVar2.f451a);
                                    }
                                }
                            } else {
                                cVar2.f452b = i;
                                c.a aVar = cVar2.d.get(i);
                                int a3 = aVar.a(f, f);
                                a.f.c.d dVar3 = a3 == -1 ? aVar.d : aVar.f455b.get(a3).f;
                                if (a3 != -1) {
                                    int i6 = aVar.f455b.get(a3).e;
                                }
                                if (dVar3 == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f);
                                } else {
                                    cVar2.f453c = a3;
                                    dVar3.a(cVar2.f451a);
                                }
                            }
                        }
                    } else {
                        c.this.v(i, i2);
                    }
                }
                c.this.setState(dVar);
            }
            if (Float.isNaN(this.f437b)) {
                if (Float.isNaN(this.f436a)) {
                    return;
                }
                c.this.setProgress(this.f436a);
                return;
            }
            c cVar3 = c.this;
            float f2 = this.f436a;
            float f3 = this.f437b;
            if (!cVar3.isAttachedToWindow()) {
                if (cVar3.R == null) {
                    cVar3.R = new b();
                }
                b bVar = cVar3.R;
                bVar.f436a = f2;
                bVar.f437b = f3;
            } else {
                cVar3.setProgress(f2);
                cVar3.setState(d.MOVING);
                cVar3.u = f3;
                if (f3 == 0.0f && f2 != 0.0f) {
                    int i7 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
                }
            }
            this.f436a = Float.NaN;
            this.f437b = Float.NaN;
            this.f438c = -1;
            this.d = -1;
        }
    }

    /* renamed from: a.f.b.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0009c {
        void a(c cVar, int i, int i2);

        void b(c cVar, int i, int i2, float f);
    }

    /* loaded from: classes.dex */
    public enum d {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        s(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.w;
    }

    public ArrayList<d.a> getDefinedTransitions() {
        return null;
    }

    public a.f.b.a.a getDesignTool() {
        if (this.H == null) {
            this.H = new a.f.b.a.a(this);
        }
        return this.H;
    }

    public int getEndState() {
        return this.x;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.C;
    }

    public a.f.b.a.d getScene() {
        return null;
    }

    public int getStartState() {
        return this.v;
    }

    public float getTargetPosition() {
        return this.E;
    }

    public Bundle getTransitionState() {
        if (this.R == null) {
            this.R = new b();
        }
        b bVar = this.R;
        c cVar = c.this;
        bVar.d = cVar.x;
        bVar.f438c = cVar.v;
        bVar.f437b = cVar.getVelocity();
        bVar.f436a = c.this.getProgress();
        b bVar2 = this.R;
        Objects.requireNonNull(bVar2);
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f436a);
        bundle.putFloat("motion.velocity", bVar2.f437b);
        bundle.putInt("motion.StartState", bVar2.f438c);
        bundle.putInt("motion.EndState", bVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return this.A * 1000.0f;
    }

    public float getVelocity() {
        return this.u;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void h(int i) {
        this.k = null;
    }

    @Override // a.h.j.l
    public void i(View view, View view2, int i, int i2) {
        this.I = getNanoTime();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // a.h.j.m
    public void k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i == 0 && i2 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
    }

    @Override // a.h.j.l
    public void l(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // a.h.j.l
    public void m(View view, int i) {
    }

    @Override // a.h.j.l
    public void n(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // a.h.j.l
    public boolean o(View view, View view2, int i, int i2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.R;
        if (bVar != null) {
            if (this.S) {
                post(new a());
            } else {
                bVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.Q = true;
        try {
            super.onLayout(z, i, i2, i3, i4);
        } finally {
            this.Q = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof a.f.b.a.b) {
            a.f.b.a.b bVar = (a.f.b.a.b) view;
            if (this.M == null) {
                this.M = new CopyOnWriteArrayList<>();
            }
            this.M.add(bVar);
            if (bVar.i) {
                if (this.K == null) {
                    this.K = new ArrayList<>();
                }
                this.K.add(bVar);
            }
            if (!bVar.j) {
                return;
            }
            if (this.L == null) {
                this.L = new ArrayList<>();
            }
            this.L.add(bVar);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<a.f.b.a.b> arrayList = this.K;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<a.f.b.a.b> arrayList2 = this.L;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        int i = this.w;
        super.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x010e, code lost:
        if (r1 != r2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0119, code lost:
        if (r1 != r2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x011c, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x011d, code lost:
        r17.w = r2;
        r8 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(boolean r18) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.b.a.c.s(boolean):void");
    }

    public void setDebugMode(int i) {
        this.G = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.S = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.y = z;
    }

    public void setInterpolatedProgress(float f) {
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<a.f.b.a.b> arrayList = this.L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.L.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<a.f.b.a.b> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        d dVar = d.FINISHED;
        d dVar2 = d.MOVING;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i < 0 || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.R == null) {
                this.R = new b();
            }
            this.R.f436a = f;
            return;
        }
        if (i <= 0) {
            if (this.C == 1.0f && this.w == this.x) {
                setState(dVar2);
            }
            this.w = this.v;
            if (this.C != 0.0f) {
                return;
            }
        } else if (f < 1.0f) {
            this.w = -1;
            setState(dVar2);
            return;
        } else {
            if (this.C == 0.0f && this.w == this.v) {
                setState(dVar2);
            }
            this.w = this.x;
            if (this.C != 1.0f) {
                return;
            }
        }
        setState(dVar);
    }

    public void setScene(a.f.b.a.d dVar) {
        g();
        throw null;
    }

    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.R == null) {
                this.R = new b();
            }
            b bVar = this.R;
            bVar.f438c = i;
            bVar.d = i;
            return;
        }
        this.w = i;
    }

    public void setState(d dVar) {
        d dVar2 = d.FINISHED;
        if (dVar == dVar2 && this.w == -1) {
            return;
        }
        d dVar3 = this.T;
        this.T = dVar;
        d dVar4 = d.MOVING;
        if (dVar3 == dVar4 && dVar == dVar4) {
            t();
        }
        int ordinal = dVar3.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (dVar == dVar4) {
                t();
            }
            if (dVar != dVar2) {
                return;
            }
        } else if (ordinal != 2 || dVar != dVar2) {
            return;
        }
        u();
    }

    public void setTransition(int i) {
    }

    public void setTransition(d.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(InterfaceC0009c interfaceC0009c) {
        this.F = interfaceC0009c;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.R == null) {
            this.R = new b();
        }
        b bVar = this.R;
        Objects.requireNonNull(bVar);
        bVar.f436a = bundle.getFloat("motion.progress");
        bVar.f437b = bundle.getFloat("motion.velocity");
        bVar.f438c = bundle.getInt("motion.StartState");
        bVar.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.R.a();
        }
    }

    public final void t() {
        CopyOnWriteArrayList<InterfaceC0009c> copyOnWriteArrayList;
        if ((this.F != null || ((copyOnWriteArrayList = this.M) != null && !copyOnWriteArrayList.isEmpty())) && this.O != this.B) {
            if (this.N != -1) {
                InterfaceC0009c interfaceC0009c = this.F;
                if (interfaceC0009c != null) {
                    interfaceC0009c.a(this, this.v, this.x);
                }
                CopyOnWriteArrayList<InterfaceC0009c> copyOnWriteArrayList2 = this.M;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<InterfaceC0009c> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().a(this, this.v, this.x);
                    }
                }
            }
            this.N = -1;
            float f = this.B;
            this.O = f;
            InterfaceC0009c interfaceC0009c2 = this.F;
            if (interfaceC0009c2 != null) {
                interfaceC0009c2.b(this, this.v, this.x, f);
            }
            CopyOnWriteArrayList<InterfaceC0009c> copyOnWriteArrayList3 = this.M;
            if (copyOnWriteArrayList3 == null) {
                return;
            }
            Iterator<InterfaceC0009c> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().b(this, this.v, this.x, this.B);
            }
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return a.b.a.f(context, this.v) + "->" + a.b.a.f(context, this.x) + " (pos:" + this.C + " Dpos/Dt:" + this.u;
    }

    public void u() {
        CopyOnWriteArrayList<InterfaceC0009c> copyOnWriteArrayList;
        CopyOnWriteArrayList<InterfaceC0009c> copyOnWriteArrayList2;
        if ((this.F == null && ((copyOnWriteArrayList2 = this.M) == null || copyOnWriteArrayList2.isEmpty())) || this.N != -1) {
            if (this.F == null && ((copyOnWriteArrayList = this.M) == null || copyOnWriteArrayList.isEmpty())) {
                return;
            }
            throw null;
        }
        this.N = this.w;
        throw null;
    }

    public void v(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.R == null) {
                this.R = new b();
            }
            b bVar = this.R;
            bVar.f438c = i;
            bVar.d = i2;
        }
    }

    public void w(int i) {
        if (!isAttachedToWindow()) {
            if (this.R == null) {
                this.R = new b();
            }
            this.R.d = i;
            return;
        }
        int i2 = this.w;
        if (i2 == i || this.v == i || this.x == i) {
            return;
        }
        this.x = i;
        if (i2 != -1) {
            v(i2, i);
            this.C = 0.0f;
            return;
        }
        this.E = 1.0f;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = getNanoTime();
        this.z = getNanoTime();
        throw null;
    }
}
