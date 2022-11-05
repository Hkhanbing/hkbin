package a.s;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b  reason: collision with root package name */
    public View f1113b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f1112a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<h> f1114c = new ArrayList<>();

    @Deprecated
    public o() {
    }

    public o(View view) {
        this.f1113b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f1113b == oVar.f1113b && this.f1112a.equals(oVar.f1112a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1112a.hashCode() + (this.f1113b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder f = b.a.a.a.a.f("TransitionValues@");
        f.append(Integer.toHexString(hashCode()));
        f.append(":\n");
        String d = b.a.a.a.a.d(f.toString() + "    view = " + this.f1113b + "\n", "    values:");
        for (String str : this.f1112a.keySet()) {
            d = d + "    " + str + ": " + this.f1112a.get(str) + "\n";
        }
        return d;
    }
}
