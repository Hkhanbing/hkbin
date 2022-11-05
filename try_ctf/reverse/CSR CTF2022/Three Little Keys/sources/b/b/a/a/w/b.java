package b.b.a.a.w;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f1576a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1577b;

    public b(float f, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f1576a;
            f += ((b) cVar).f1577b;
        }
        this.f1576a = cVar;
        this.f1577b = f;
    }

    @Override // b.b.a.a.w.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f1576a.a(rectF) + this.f1577b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1576a.equals(bVar.f1576a) && this.f1577b == bVar.f1577b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1576a, Float.valueOf(this.f1577b)});
    }
}
