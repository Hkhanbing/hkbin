package a.s;

import a.s.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class z extends h {
    public static final String[] y = {"android:visibility:visibility", "android:visibility:parent"};
    public int x = 3;

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements h.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f1127a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1128b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f1129c;
        public final boolean d;
        public boolean e;
        public boolean f = false;

        public a(View view, int i, boolean z) {
            this.f1127a = view;
            this.f1128b = i;
            this.f1129c = (ViewGroup) view.getParent();
            this.d = z;
            g(true);
        }

        @Override // a.s.h.d
        public void a(h hVar) {
        }

        @Override // a.s.h.d
        public void b(h hVar) {
        }

        @Override // a.s.h.d
        public void c(h hVar) {
            f();
            hVar.v(this);
        }

        @Override // a.s.h.d
        public void d(h hVar) {
            g(false);
        }

        @Override // a.s.h.d
        public void e(h hVar) {
            g(true);
        }

        public final void f() {
            if (!this.f) {
                r.f1119a.f(this.f1127a, this.f1128b);
                ViewGroup viewGroup = this.f1129c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.f1129c) == null) {
                return;
            }
            this.e = z;
            q.a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (!this.f) {
                r.f1119a.f(this.f1127a, this.f1128b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (!this.f) {
                r.f1119a.f(this.f1127a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1130a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1131b;

        /* renamed from: c  reason: collision with root package name */
        public int f1132c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public final void H(o oVar) {
        oVar.f1112a.put("android:visibility:visibility", Integer.valueOf(oVar.f1113b.getVisibility()));
        oVar.f1112a.put("android:visibility:parent", oVar.f1113b.getParent());
        int[] iArr = new int[2];
        oVar.f1113b.getLocationOnScreen(iArr);
        oVar.f1112a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r9 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r0.e == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        if (r0.f1132c == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a.s.z.b I(a.s.o r8, a.s.o r9) {
        /*
            r7 = this;
            a.s.z$b r0 = new a.s.z$b
            r0.<init>()
            r1 = 0
            r0.f1130a = r1
            r0.f1131b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1112a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1112a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f1132c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1112a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L37
        L33:
            r0.f1132c = r4
            r0.e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f1112a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f1112a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f1112a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L5e
        L5a:
            r0.d = r4
            r0.f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f1132c
            int r9 = r0.d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.d
            if (r8 != 0) goto L8d
        L88:
            r0.f1131b = r2
        L8a:
            r0.f1130a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f1132c
            if (r8 != 0) goto L96
        L93:
            r0.f1131b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.s.z.I(a.s.o, a.s.o):a.s.z$b");
    }

    public abstract Animator J(ViewGroup viewGroup, View view, o oVar, o oVar2);

    @Override // a.s.h
    public void d(o oVar) {
        H(oVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (I(n(r1, false), q(r1, false)).f1130a != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7  */
    @Override // a.s.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator k(android.view.ViewGroup r21, a.s.o r22, a.s.o r23) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.s.z.k(android.view.ViewGroup, a.s.o, a.s.o):android.animation.Animator");
    }

    @Override // a.s.h
    public String[] p() {
        return y;
    }

    @Override // a.s.h
    public boolean r(o oVar, o oVar2) {
        if (oVar == null && oVar2 == null) {
            return false;
        }
        if (oVar != null && oVar2 != null && oVar2.f1112a.containsKey("android:visibility:visibility") != oVar.f1112a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b I = I(oVar, oVar2);
        if (!I.f1130a) {
            return false;
        }
        return I.f1132c == 0 || I.d == 0;
    }
}
