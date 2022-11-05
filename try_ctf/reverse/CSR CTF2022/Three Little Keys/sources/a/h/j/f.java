package a.h.j;

import java.util.Objects;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f657a;

    public f(Object obj) {
        this.f657a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            return Objects.equals(this.f657a, ((f) obj).f657a);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f657a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder f = b.a.a.a.a.f("DisplayCutoutCompat{");
        f.append(this.f657a);
        f.append("}");
        return f.toString();
    }
}
