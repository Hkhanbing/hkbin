package b.b.a.a.c;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class d extends Property<Drawable, Integer> {

    /* renamed from: b  reason: collision with root package name */
    public static final Property<Drawable, Integer> f1375b = new d();

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<Drawable, Integer> f1376a;

    public d() {
        super(Integer.class, "drawableAlphaCompat");
        this.f1376a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
