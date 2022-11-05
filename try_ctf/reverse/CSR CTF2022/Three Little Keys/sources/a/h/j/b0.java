package a.h.j;

import a.h.j.w;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: b  reason: collision with root package name */
    public static final b0 f608b;

    /* renamed from: a  reason: collision with root package name */
    public final k f609a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f610a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f611b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f612c;
        public static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f610a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f611b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f612c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                StringBuilder f = b.a.a.a.a.f("Failed to get visible insets from AttachInfo ");
                f.append(e.getMessage());
                Log.w("WindowInsetsCompat", f.toString(), e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {
        public static Field d = null;
        public static boolean e = false;
        public static Constructor<WindowInsets> f = null;
        public static boolean g = false;

        /* renamed from: b  reason: collision with root package name */
        public WindowInsets f613b;

        /* renamed from: c  reason: collision with root package name */
        public a.h.d.b f614c;

        public b() {
            WindowInsets windowInsets;
            if (!e) {
                try {
                    d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                e = true;
            }
            Field field = d;
            WindowInsets windowInsets2 = null;
            if (field != null) {
                try {
                    windowInsets = (WindowInsets) field.get(null);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
                if (windowInsets != null) {
                    windowInsets2 = new WindowInsets(windowInsets);
                    this.f613b = windowInsets2;
                }
            }
            if (!g) {
                try {
                    f = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                g = true;
            }
            Constructor<WindowInsets> constructor = f;
            if (constructor != null) {
                try {
                    windowInsets2 = constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            this.f613b = windowInsets2;
        }

        public b(b0 b0Var) {
            super(b0Var);
            this.f613b = b0Var.h();
        }

        @Override // a.h.j.b0.e
        public b0 a() {
            b0 i = b0.i(this.f613b);
            i.f609a.o(null);
            i.f609a.q(this.f614c);
            return i;
        }

        @Override // a.h.j.b0.e
        public void b(a.h.d.b bVar) {
            this.f614c = bVar;
        }

        @Override // a.h.j.b0.e
        public void c(a.h.d.b bVar) {
            WindowInsets windowInsets = this.f613b;
            if (windowInsets != null) {
                this.f613b = windowInsets.replaceSystemWindowInsets(bVar.f533a, bVar.f534b, bVar.f535c, bVar.d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsets.Builder f615b;

        public c() {
            this.f615b = new WindowInsets.Builder();
        }

        public c(b0 b0Var) {
            super(b0Var);
            WindowInsets h = b0Var.h();
            this.f615b = h != null ? new WindowInsets.Builder(h) : new WindowInsets.Builder();
        }

        @Override // a.h.j.b0.e
        public b0 a() {
            b0 i = b0.i(this.f615b.build());
            i.f609a.o(null);
            return i;
        }

        @Override // a.h.j.b0.e
        public void b(a.h.d.b bVar) {
            this.f615b.setStableInsets(bVar.d());
        }

        @Override // a.h.j.b0.e
        public void c(a.h.d.b bVar) {
            this.f615b.setSystemWindowInsets(bVar.d());
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        public d() {
        }

        public d(b0 b0Var) {
            super(b0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f616a;

        public e() {
            this.f616a = new b0((b0) null);
        }

        public e(b0 b0Var) {
            this.f616a = b0Var;
        }

        public b0 a() {
            throw null;
        }

        public void b(a.h.d.b bVar) {
            throw null;
        }

        public void c(a.h.d.b bVar) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends k {
        public static boolean h = false;
        public static Method i;
        public static Class<?> j;
        public static Field k;
        public static Field l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f617c;
        public a.h.d.b[] d;
        public a.h.d.b e;
        public b0 f;
        public a.h.d.b g;

        public f(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var);
            this.e = null;
            this.f617c = windowInsets;
        }

        @Override // a.h.j.b0.k
        public void d(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!h) {
                    try {
                        i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                        Class<?> cls = Class.forName("android.view.View$AttachInfo");
                        j = cls;
                        k = cls.getDeclaredField("mVisibleInsets");
                        l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                        k.setAccessible(true);
                        l.setAccessible(true);
                    } catch (ReflectiveOperationException e) {
                        StringBuilder f = b.a.a.a.a.f("Failed to get visible insets. (Reflection error). ");
                        f.append(e.getMessage());
                        Log.e("WindowInsetsCompat", f.toString(), e);
                    }
                    h = true;
                }
                Method method = i;
                a.h.d.b bVar = null;
                if (method != null && j != null && k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        } else {
                            Rect rect = (Rect) k.get(l.get(invoke));
                            if (rect != null) {
                                bVar = a.h.d.b.b(rect.left, rect.top, rect.right, rect.bottom);
                            }
                        }
                    } catch (ReflectiveOperationException e2) {
                        StringBuilder f2 = b.a.a.a.a.f("Failed to get visible insets. (Reflection error). ");
                        f2.append(e2.getMessage());
                        Log.e("WindowInsetsCompat", f2.toString(), e2);
                    }
                }
                if (bVar == null) {
                    bVar = a.h.d.b.e;
                }
                this.g = bVar;
                return;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @Override // a.h.j.b0.k
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.g, ((f) obj).g);
        }

        @Override // a.h.j.b0.k
        public a.h.d.b f(int i2) {
            a.h.d.b b2;
            a.h.d.b bVar;
            a.h.j.f e;
            a.h.d.b bVar2 = a.h.d.b.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    if (i3 != 1) {
                        a.h.d.b bVar3 = null;
                        if (i3 == 2) {
                            a.h.d.b j2 = j();
                            b0 b0Var = this.f;
                            if (b0Var != null) {
                                bVar3 = b0Var.f609a.h();
                            }
                            int i4 = j2.d;
                            if (bVar3 != null) {
                                i4 = Math.min(i4, bVar3.d);
                            }
                            b2 = a.h.d.b.b(j2.f533a, 0, j2.f535c, i4);
                        } else if (i3 == 8) {
                            a.h.d.b[] bVarArr = this.d;
                            if (bVarArr != null) {
                                bVar3 = bVarArr[a.h.b.b.z(8)];
                            }
                            if (bVar3 != null) {
                                b2 = bVar3;
                            } else {
                                a.h.d.b j3 = j();
                                a.h.d.b r = r();
                                int i5 = j3.d;
                                if (i5 > r.d || ((bVar = this.g) != null && !bVar.equals(a.h.d.b.e) && (i5 = this.g.d) > r.d)) {
                                    b2 = a.h.d.b.b(0, 0, 0, i5);
                                }
                                b2 = a.h.d.b.e;
                            }
                        } else if (i3 == 16) {
                            b2 = i();
                        } else if (i3 == 32) {
                            b2 = g();
                        } else if (i3 != 64) {
                            if (i3 == 128) {
                                b0 b0Var2 = this.f;
                                if (b0Var2 != null) {
                                    e = b0Var2.f609a.e();
                                } else {
                                    e = e();
                                }
                                if (e != null) {
                                    b2 = a.h.d.b.b(((DisplayCutout) e.f657a).getSafeInsetLeft(), ((DisplayCutout) e.f657a).getSafeInsetTop(), ((DisplayCutout) e.f657a).getSafeInsetRight(), ((DisplayCutout) e.f657a).getSafeInsetBottom());
                                }
                            }
                            b2 = a.h.d.b.e;
                        } else {
                            b2 = k();
                        }
                    } else {
                        b2 = a.h.d.b.b(0, j().f534b, 0, 0);
                    }
                    bVar2 = a.h.d.b.a(bVar2, b2);
                }
            }
            return bVar2;
        }

        @Override // a.h.j.b0.k
        public final a.h.d.b j() {
            if (this.e == null) {
                this.e = a.h.d.b.b(this.f617c.getSystemWindowInsetLeft(), this.f617c.getSystemWindowInsetTop(), this.f617c.getSystemWindowInsetRight(), this.f617c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // a.h.j.b0.k
        public b0 l(int i2, int i3, int i4, int i5) {
            b0 i6 = b0.i(this.f617c);
            int i7 = Build.VERSION.SDK_INT;
            e dVar = i7 >= 30 ? new d(i6) : i7 >= 29 ? new c(i6) : new b(i6);
            dVar.c(b0.f(j(), i2, i3, i4, i5));
            dVar.b(b0.f(h(), i2, i3, i4, i5));
            return dVar.a();
        }

        @Override // a.h.j.b0.k
        public boolean n() {
            return this.f617c.isRound();
        }

        @Override // a.h.j.b0.k
        public void o(a.h.d.b[] bVarArr) {
            this.d = bVarArr;
        }

        @Override // a.h.j.b0.k
        public void p(b0 b0Var) {
            this.f = b0Var;
        }

        public final a.h.d.b r() {
            b0 b0Var = this.f;
            if (b0Var != null) {
                return b0Var.f609a.h();
            }
            return a.h.d.b.e;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {
        public a.h.d.b m;

        public g(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
            this.m = null;
        }

        @Override // a.h.j.b0.k
        public b0 b() {
            return b0.i(this.f617c.consumeStableInsets());
        }

        @Override // a.h.j.b0.k
        public b0 c() {
            return b0.i(this.f617c.consumeSystemWindowInsets());
        }

        @Override // a.h.j.b0.k
        public final a.h.d.b h() {
            if (this.m == null) {
                this.m = a.h.d.b.b(this.f617c.getStableInsetLeft(), this.f617c.getStableInsetTop(), this.f617c.getStableInsetRight(), this.f617c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // a.h.j.b0.k
        public boolean m() {
            return this.f617c.isConsumed();
        }

        @Override // a.h.j.b0.k
        public void q(a.h.d.b bVar) {
            this.m = bVar;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public h(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        @Override // a.h.j.b0.k
        public b0 a() {
            return b0.i(this.f617c.consumeDisplayCutout());
        }

        @Override // a.h.j.b0.k
        public a.h.j.f e() {
            DisplayCutout displayCutout = this.f617c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new a.h.j.f(displayCutout);
        }

        @Override // a.h.j.b0.f, a.h.j.b0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f617c, hVar.f617c) && Objects.equals(this.g, hVar.g);
        }

        @Override // a.h.j.b0.k
        public int hashCode() {
            return this.f617c.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {
        public a.h.d.b n;
        public a.h.d.b o;
        public a.h.d.b p;

        public i(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // a.h.j.b0.k
        public a.h.d.b g() {
            if (this.o == null) {
                this.o = a.h.d.b.c(this.f617c.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override // a.h.j.b0.k
        public a.h.d.b i() {
            if (this.n == null) {
                this.n = a.h.d.b.c(this.f617c.getSystemGestureInsets());
            }
            return this.n;
        }

        @Override // a.h.j.b0.k
        public a.h.d.b k() {
            if (this.p == null) {
                this.p = a.h.d.b.c(this.f617c.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // a.h.j.b0.f, a.h.j.b0.k
        public b0 l(int i, int i2, int i3, int i4) {
            return b0.i(this.f617c.inset(i, i2, i3, i4));
        }

        @Override // a.h.j.b0.g, a.h.j.b0.k
        public void q(a.h.d.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class j extends i {
        public static final b0 q = b0.i(WindowInsets.CONSUMED);

        public j(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        @Override // a.h.j.b0.f, a.h.j.b0.k
        public final void d(View view) {
        }

        @Override // a.h.j.b0.f, a.h.j.b0.k
        public a.h.d.b f(int i) {
            int statusBars;
            WindowInsets windowInsets = this.f617c;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return a.h.d.b.c(windowInsets.getInsets(i2));
        }
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final b0 f618b;

        /* renamed from: a  reason: collision with root package name */
        public final b0 f619a;

        static {
            int i = Build.VERSION.SDK_INT;
            f618b = (i >= 30 ? new d() : i >= 29 ? new c() : new b()).a().f609a.a().f609a.b().f609a.c();
        }

        public k(b0 b0Var) {
            this.f619a = b0Var;
        }

        public b0 a() {
            return this.f619a;
        }

        public b0 b() {
            return this.f619a;
        }

        public b0 c() {
            return this.f619a;
        }

        public void d(View view) {
        }

        public a.h.j.f e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return n() == kVar.n() && m() == kVar.m() && Objects.equals(j(), kVar.j()) && Objects.equals(h(), kVar.h()) && Objects.equals(e(), kVar.e());
        }

        public a.h.d.b f(int i) {
            return a.h.d.b.e;
        }

        public a.h.d.b g() {
            return j();
        }

        public a.h.d.b h() {
            return a.h.d.b.e;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public a.h.d.b i() {
            return j();
        }

        public a.h.d.b j() {
            return a.h.d.b.e;
        }

        public a.h.d.b k() {
            return j();
        }

        public b0 l(int i, int i2, int i3, int i4) {
            return f618b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(a.h.d.b[] bVarArr) {
        }

        public void p(b0 b0Var) {
        }

        public void q(a.h.d.b bVar) {
        }
    }

    static {
        f608b = Build.VERSION.SDK_INT >= 30 ? j.q : k.f618b;
    }

    public b0(b0 b0Var) {
        this.f609a = new k(this);
    }

    public b0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        this.f609a = i2 >= 30 ? new j(this, windowInsets) : i2 >= 29 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public static a.h.d.b f(a.h.d.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.f533a - i2);
        int max2 = Math.max(0, bVar.f534b - i3);
        int max3 = Math.max(0, bVar.f535c - i4);
        int max4 = Math.max(0, bVar.d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : a.h.d.b.b(max, max2, max3, max4);
    }

    public static b0 i(WindowInsets windowInsets) {
        return j(windowInsets, null);
    }

    public static b0 j(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        b0 b0Var = new b0(windowInsets);
        if (view != null) {
            AtomicInteger atomicInteger = w.f667a;
            if (w.g.b(view)) {
                b0Var.f609a.p(w.i(view));
                b0Var.f609a.d(view.getRootView());
            }
        }
        return b0Var;
    }

    public a.h.d.b a(int i2) {
        return this.f609a.f(i2);
    }

    @Deprecated
    public int b() {
        return this.f609a.j().d;
    }

    @Deprecated
    public int c() {
        return this.f609a.j().f533a;
    }

    @Deprecated
    public int d() {
        return this.f609a.j().f535c;
    }

    @Deprecated
    public int e() {
        return this.f609a.j().f534b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return Objects.equals(this.f609a, ((b0) obj).f609a);
        }
        return false;
    }

    public boolean g() {
        return this.f609a.m();
    }

    public WindowInsets h() {
        k kVar = this.f609a;
        if (kVar instanceof f) {
            return ((f) kVar).f617c;
        }
        return null;
    }

    public int hashCode() {
        k kVar = this.f609a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}
