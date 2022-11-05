package b.b.a.a.w;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f1585a;

    public h(float f) {
        this.f1585a = f;
    }

    @Override // b.b.a.a.w.c
    public float a(RectF rectF) {
        return rectF.height() * this.f1585a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f1585a == ((h) obj).f1585a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1585a)});
    }
}
