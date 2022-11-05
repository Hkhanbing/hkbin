package a.l.b;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e0 extends a.n.u {
    public static final a.n.v h = new a();
    public final boolean e;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, m> f824b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, e0> f825c = new HashMap<>();
    public final HashMap<String, a.n.y> d = new HashMap<>();
    public boolean f = false;
    public boolean g = false;

    /* loaded from: classes.dex */
    public class a implements a.n.v {
        public <T extends a.n.u> T a(Class<T> cls) {
            return new e0(true);
        }
    }

    public e0(boolean z) {
        this.e = z;
    }

    @Override // a.n.u
    public void a() {
        if (b0.M(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public void b(m mVar) {
        if (this.g) {
            if (!b0.M(2)) {
                return;
            }
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            return;
        }
        if (!(this.f824b.remove(mVar.e) != null) || !b0.M(2)) {
            return;
        }
        Log.v("FragmentManager", "Updating retained Fragments: Removed " + mVar);
    }

    public boolean c(m mVar) {
        if (this.f824b.containsKey(mVar.e) && this.e) {
            return this.f;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f824b.equals(e0Var.f824b) && this.f825c.equals(e0Var.f825c) && this.d.equals(e0Var.d);
    }

    public int hashCode() {
        int hashCode = this.f825c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.f824b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<m> it = this.f824b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f825c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
