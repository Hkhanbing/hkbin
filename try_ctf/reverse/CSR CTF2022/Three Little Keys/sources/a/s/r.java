package a.s;

import a.h.j.w;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public static final x f1119a;

    /* renamed from: b  reason: collision with root package name */
    public static final Property<View, Float> f1120b;

    /* loaded from: classes.dex */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(r.a(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            float floatValue = f.floatValue();
            r.f1119a.e(view, floatValue);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            AtomicInteger atomicInteger = a.h.j.w.f667a;
            return w.f.a(view);
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            AtomicInteger atomicInteger = a.h.j.w.f667a;
            w.f.c(view, rect);
        }
    }

    static {
        f1119a = Build.VERSION.SDK_INT >= 29 ? new w() : new v();
        f1120b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return f1119a.b(view);
    }

    public static void b(View view, int i, int i2, int i3, int i4) {
        f1119a.d(view, i, i2, i3, i4);
    }
}
