package b.b.a.a.l;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f1438b = new b();

        /* renamed from: a  reason: collision with root package name */
        public final e f1439a = new e(null);

        @Override // android.animation.TypeEvaluator
        public e evaluate(float f, e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            e eVar5 = this.f1439a;
            float q = b.b.a.a.a.q(eVar3.f1442a, eVar4.f1442a, f);
            float q2 = b.b.a.a.a.q(eVar3.f1443b, eVar4.f1443b, f);
            float q3 = b.b.a.a.a.q(eVar3.f1444c, eVar4.f1444c, f);
            eVar5.f1442a = q;
            eVar5.f1443b = q2;
            eVar5.f1444c = q3;
            return this.f1439a;
        }
    }

    /* renamed from: b.b.a.a.l.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0037c extends Property<c, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, e> f1440a = new C0037c("circularReveal");

        public C0037c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        public e get(c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(c cVar, e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Property<c, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<c, Integer> f1441a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f1442a;

        /* renamed from: b  reason: collision with root package name */
        public float f1443b;

        /* renamed from: c  reason: collision with root package name */
        public float f1444c;

        public e() {
        }

        public e(float f, float f2, float f3) {
            this.f1442a = f;
            this.f1443b = f2;
            this.f1444c = f3;
        }

        public e(a aVar) {
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
