package a.n;

import a.c.a.b.b;
import a.n.f;
import android.annotation.SuppressLint;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class k extends f {

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<j> f970c;

    /* renamed from: a  reason: collision with root package name */
    public a.c.a.b.a<i, a> f968a = new a.c.a.b.a<>();
    public int d = 0;
    public boolean e = false;
    public boolean f = false;
    public ArrayList<f.b> g = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public f.b f969b = f.b.INITIALIZED;
    public final boolean h = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public f.b f971a;

        /* renamed from: b  reason: collision with root package name */
        public h f972b;

        public a(i iVar, f.b bVar) {
            h reflectiveGenericLifecycleObserver;
            Map<Class<?>, Integer> map = m.f973a;
            boolean z = iVar instanceof h;
            boolean z2 = iVar instanceof d;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((d) iVar, (h) iVar);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((d) iVar, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (h) iVar;
            } else {
                Class<?> cls = iVar.getClass();
                if (m.c(cls) == 2) {
                    List<Constructor<? extends e>> list = m.f974b.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(m.a(list.get(0), iVar));
                    } else {
                        e[] eVarArr = new e[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            eVarArr[i] = m.a(list.get(i), iVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(eVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(iVar);
                }
            }
            this.f972b = reflectiveGenericLifecycleObserver;
            this.f971a = bVar;
        }

        public void a(j jVar, f.a aVar) {
            f.b a2 = aVar.a();
            this.f971a = k.e(this.f971a, a2);
            this.f972b.g(jVar, aVar);
            this.f971a = a2;
        }
    }

    public k(j jVar) {
        this.f970c = new WeakReference<>(jVar);
    }

    public static f.b e(f.b bVar, f.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    @Override // a.n.f
    public void a(i iVar) {
        j jVar;
        c("addObserver");
        f.b bVar = this.f969b;
        f.b bVar2 = f.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = f.b.INITIALIZED;
        }
        a aVar = new a(iVar, bVar2);
        if (this.f968a.d(iVar, aVar) == null && (jVar = this.f970c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            f.b b2 = b(iVar);
            this.d++;
            while (aVar.f971a.compareTo(b2) < 0 && this.f968a.e.containsKey(iVar)) {
                this.g.add(aVar.f971a);
                f.a b3 = f.a.b(aVar.f971a);
                if (b3 == null) {
                    StringBuilder f = b.a.a.a.a.f("no event up from ");
                    f.append(aVar.f971a);
                    throw new IllegalStateException(f.toString());
                }
                aVar.a(jVar, b3);
                g();
                b2 = b(iVar);
            }
            if (!z) {
                h();
            }
            this.d--;
        }
    }

    public final f.b b(i iVar) {
        a.c.a.b.a<i, a> aVar = this.f968a;
        f.b bVar = null;
        b.c<i, a> cVar = aVar.e.containsKey(iVar) ? aVar.e.get(iVar).d : null;
        f.b bVar2 = cVar != null ? cVar.f322b.f971a : null;
        if (!this.g.isEmpty()) {
            ArrayList<f.b> arrayList = this.g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return e(e(this.f969b, bVar2), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void c(String str) {
        if (!this.h || a.c.a.a.a.b().a()) {
            return;
        }
        throw new IllegalStateException(b.a.a.a.a.e("Method ", str, " must be called on the main thread"));
    }

    public void d(f.a aVar) {
        c("handleLifecycleEvent");
        f(aVar.a());
    }

    public final void f(f.b bVar) {
        if (this.f969b == bVar) {
            return;
        }
        this.f969b = bVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        h();
        this.e = false;
    }

    public final void g() {
        ArrayList<f.b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void h() {
        j jVar = this.f970c.get();
        if (jVar != null) {
            while (true) {
                a.c.a.b.a<i, a> aVar = this.f968a;
                boolean z = true;
                if (aVar.d != 0) {
                    f.b bVar = aVar.f318a.f322b.f971a;
                    f.b bVar2 = aVar.f319b.f322b.f971a;
                    if (bVar != bVar2 || this.f969b != bVar2) {
                        z = false;
                    }
                }
                this.f = false;
                if (z) {
                    return;
                }
                if (this.f969b.compareTo(aVar.f318a.f322b.f971a) < 0) {
                    a.c.a.b.a<i, a> aVar2 = this.f968a;
                    b.C0006b c0006b = new b.C0006b(aVar2.f319b, aVar2.f318a);
                    aVar2.f320c.put(c0006b, Boolean.FALSE);
                    while (c0006b.hasNext() && !this.f) {
                        Map.Entry entry = (Map.Entry) c0006b.next();
                        a aVar3 = (a) entry.getValue();
                        while (aVar3.f971a.compareTo(this.f969b) > 0 && !this.f && this.f968a.contains((i) entry.getKey())) {
                            int ordinal = aVar3.f971a.ordinal();
                            f.a aVar4 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : f.a.ON_PAUSE : f.a.ON_STOP : f.a.ON_DESTROY;
                            if (aVar4 == null) {
                                StringBuilder f = b.a.a.a.a.f("no event down from ");
                                f.append(aVar3.f971a);
                                throw new IllegalStateException(f.toString());
                            }
                            this.g.add(aVar4.a());
                            aVar3.a(jVar, aVar4);
                            g();
                        }
                    }
                }
                b.c<i, a> cVar = this.f968a.f319b;
                if (!this.f && cVar != null && this.f969b.compareTo(cVar.f322b.f971a) > 0) {
                    a.c.a.b.b<i, a>.d b2 = this.f968a.b();
                    while (b2.hasNext() && !this.f) {
                        Map.Entry entry2 = (Map.Entry) b2.next();
                        a aVar5 = (a) entry2.getValue();
                        while (aVar5.f971a.compareTo(this.f969b) < 0 && !this.f && this.f968a.contains((i) entry2.getKey())) {
                            this.g.add(aVar5.f971a);
                            f.a b3 = f.a.b(aVar5.f971a);
                            if (b3 == null) {
                                StringBuilder f2 = b.a.a.a.a.f("no event up from ");
                                f2.append(aVar5.f971a);
                                throw new IllegalStateException(f2.toString());
                            }
                            aVar5.a(jVar, b3);
                            g();
                        }
                    }
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
