package a.h.d;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class b {
    public static final b e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f533a;

    /* renamed from: b  reason: collision with root package name */
    public final int f534b;

    /* renamed from: c  reason: collision with root package name */
    public final int f535c;
    public final int d;

    public b(int i, int i2, int i3, int i4) {
        this.f533a = i;
        this.f534b = i2;
        this.f535c = i3;
        this.d = i4;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f533a, bVar2.f533a), Math.max(bVar.f534b, bVar2.f534b), Math.max(bVar.f535c, bVar2.f535c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new b(i, i2, i3, i4);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets d() {
        return Insets.of(this.f533a, this.f534b, this.f535c, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.d == bVar.d && this.f533a == bVar.f533a && this.f535c == bVar.f535c && this.f534b == bVar.f534b;
    }

    public int hashCode() {
        return (((((this.f533a * 31) + this.f534b) * 31) + this.f535c) * 31) + this.d;
    }

    public String toString() {
        StringBuilder f = b.a.a.a.a.f("Insets{left=");
        f.append(this.f533a);
        f.append(", top=");
        f.append(this.f534b);
        f.append(", right=");
        f.append(this.f535c);
        f.append(", bottom=");
        f.append(this.d);
        f.append('}');
        return f.toString();
    }
}
