package a.h.i;

import java.util.Objects;

/* loaded from: classes.dex */
public class b<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f601a;

    /* renamed from: b  reason: collision with root package name */
    public final S f602b;

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f601a, this.f601a) && Objects.equals(bVar.f602b, this.f602b);
    }

    public int hashCode() {
        F f = this.f601a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f602b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder f = b.a.a.a.a.f("Pair{");
        f.append(this.f601a);
        f.append(" ");
        f.append(this.f602b);
        f.append("}");
        return f.toString();
    }
}
