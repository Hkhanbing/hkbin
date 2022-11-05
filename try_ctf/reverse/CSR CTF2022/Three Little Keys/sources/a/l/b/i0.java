package a.l.b;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<m> f846a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, h0> f847b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public e0 f848c;

    public void a(m mVar) {
        if (this.f846a.contains(mVar)) {
            throw new IllegalStateException("Fragment already added: " + mVar);
        }
        synchronized (this.f846a) {
            this.f846a.add(mVar);
        }
        mVar.k = true;
    }

    public void b() {
        this.f847b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f847b.get(str) != null;
    }

    public m d(String str) {
        h0 h0Var = this.f847b.get(str);
        if (h0Var != null) {
            return h0Var.f841c;
        }
        return null;
    }

    public m e(String str) {
        for (h0 h0Var : this.f847b.values()) {
            if (h0Var != null) {
                m mVar = h0Var.f841c;
                if (!str.equals(mVar.e)) {
                    mVar = mVar.t.f793c.e(str);
                }
                if (mVar != null) {
                    return mVar;
                }
            }
        }
        return null;
    }

    public List<h0> f() {
        ArrayList arrayList = new ArrayList();
        for (h0 h0Var : this.f847b.values()) {
            if (h0Var != null) {
                arrayList.add(h0Var);
            }
        }
        return arrayList;
    }

    public List<m> g() {
        ArrayList arrayList = new ArrayList();
        Iterator<h0> it = this.f847b.values().iterator();
        while (it.hasNext()) {
            h0 next = it.next();
            arrayList.add(next != null ? next.f841c : null);
        }
        return arrayList;
    }

    public h0 h(String str) {
        return this.f847b.get(str);
    }

    public List<m> i() {
        ArrayList arrayList;
        if (this.f846a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f846a) {
            arrayList = new ArrayList(this.f846a);
        }
        return arrayList;
    }

    public void j(h0 h0Var) {
        m mVar = h0Var.f841c;
        if (c(mVar.e)) {
            return;
        }
        this.f847b.put(mVar.e, h0Var);
        if (!b0.M(2)) {
            return;
        }
        Log.v("FragmentManager", "Added fragment to active set " + mVar);
    }

    public void k(h0 h0Var) {
        m mVar = h0Var.f841c;
        if (mVar.A) {
            this.f848c.b(mVar);
        }
        if (this.f847b.put(mVar.e, null) != null && b0.M(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + mVar);
        }
    }

    public void l(m mVar) {
        synchronized (this.f846a) {
            this.f846a.remove(mVar);
        }
        mVar.k = false;
    }
}
