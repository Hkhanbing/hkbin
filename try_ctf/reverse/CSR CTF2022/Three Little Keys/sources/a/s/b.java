package a.s;

import a.h.j.w;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b extends a.s.h {
    public int[] x = new int[2];
    public static final String[] y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> z = new a(PointF.class, "boundsOrigin");
    public static final Property<i, PointF> A = new C0031b(PointF.class, "topLeft");
    public static final Property<i, PointF> B = new c(PointF.class, "bottomRight");
    public static final Property<View, PointF> C = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> D = new e(PointF.class, "topLeft");
    public static final Property<View, PointF> E = new f(PointF.class, "position");
    public static a.s.f F = new a.s.f();

    /* loaded from: classes.dex */
    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f1079a;

        public a(Class cls, String str) {
            super(cls, str);
            this.f1079a = new Rect();
        }

        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f1079a);
            Rect rect = this.f1079a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f1079a);
            this.f1079a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f1079a);
        }
    }

    /* renamed from: a.s.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0031b extends Property<i, PointF> {
        public C0031b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f1083a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f1084b = round;
            int i = iVar2.f + 1;
            iVar2.f = i;
            if (i == iVar2.g) {
                r.b(iVar2.e, iVar2.f1083a, round, iVar2.f1085c, iVar2.d);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<i, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f1085c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.d = round;
            int i = iVar2.g + 1;
            iVar2.g = i;
            if (iVar2.f == i) {
                r.b(iVar2.e, iVar2.f1083a, iVar2.f1084b, iVar2.f1085c, round);
                iVar2.f = 0;
                iVar2.g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            r.b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            r.b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            r.b(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f1080a;
        private i mViewBounds;

        public g(b bVar, i iVar) {
            this.f1080a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* loaded from: classes.dex */
    public class h extends k {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1081a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f1082b;

        public h(b bVar, ViewGroup viewGroup) {
            this.f1082b = viewGroup;
        }

        @Override // a.s.k, a.s.h.d
        public void b(a.s.h hVar) {
            q.a(this.f1082b, false);
            this.f1081a = true;
        }

        @Override // a.s.h.d
        public void c(a.s.h hVar) {
            if (!this.f1081a) {
                q.a(this.f1082b, false);
            }
            hVar.v(this);
        }

        @Override // a.s.k, a.s.h.d
        public void d(a.s.h hVar) {
            q.a(this.f1082b, false);
        }

        @Override // a.s.k, a.s.h.d
        public void e(a.s.h hVar) {
            q.a(this.f1082b, true);
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f1083a;

        /* renamed from: b  reason: collision with root package name */
        public int f1084b;

        /* renamed from: c  reason: collision with root package name */
        public int f1085c;
        public int d;
        public View e;
        public int f;
        public int g;

        public i(View view) {
            this.e = view;
        }
    }

    public final void H(o oVar) {
        View view = oVar.f1113b;
        AtomicInteger atomicInteger = a.h.j.w.f667a;
        if (!w.g.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        oVar.f1112a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        oVar.f1112a.put("android:changeBounds:parent", oVar.f1113b.getParent());
    }

    @Override // a.s.h
    public void d(o oVar) {
        H(oVar);
    }

    @Override // a.s.h
    public void g(o oVar) {
        H(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    @Override // a.s.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator k(android.view.ViewGroup r19, a.s.o r20, a.s.o r21) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.s.b.k(android.view.ViewGroup, a.s.o, a.s.o):android.animation.Animator");
    }

    @Override // a.s.h
    public String[] p() {
        return y;
    }
}
