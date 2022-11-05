package b.b.a.a.w;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f1575a;

    public a(float f) {
        this.f1575a = f;
    }

    @Override // b.b.a.a.w.c
    public float a(RectF rectF) {
        return this.f1575a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f1575a == ((a) obj).f1575a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1575a)});
    }
}
