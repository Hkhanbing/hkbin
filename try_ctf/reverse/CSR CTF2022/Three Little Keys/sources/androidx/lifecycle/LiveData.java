package androidx.lifecycle;

import a.l.b.b0;
import a.l.b.l;
import a.n.f;
import a.n.h;
import a.n.j;
import a.n.k;
import a.n.p;
import android.util.Log;
import android.view.View;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object j = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1266a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public a.c.a.b.b<p<? super T>, LiveData<T>.b> f1267b = new a.c.a.b.b<>();

    /* renamed from: c  reason: collision with root package name */
    public int f1268c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.b implements h {
        public final j e;
        public final /* synthetic */ LiveData f;

        @Override // a.n.h
        public void g(j jVar, f.a aVar) {
            f.b bVar = ((k) this.e.a()).f969b;
            if (bVar == f.b.DESTROYED) {
                this.f.f(this.f1269a);
                return;
            }
            f.b bVar2 = null;
            while (bVar2 != bVar) {
                h(j());
                bVar2 = bVar;
                bVar = ((k) this.e.a()).f969b;
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        public void i() {
            k kVar = (k) this.e.a();
            kVar.c("removeObserver");
            kVar.f968a.e(this);
        }

        @Override // androidx.lifecycle.LiveData.b
        public boolean j() {
            return ((k) this.e.a()).f969b.compareTo(f.b.STARTED) >= 0;
        }
    }

    /* loaded from: classes.dex */
    public class a extends LiveData<T>.b {
        public a(LiveData liveData, p<? super T> pVar) {
            super(pVar);
        }

        @Override // androidx.lifecycle.LiveData.b
        public boolean j() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final p<? super T> f1269a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1270b;

        /* renamed from: c  reason: collision with root package name */
        public int f1271c = -1;

        public b(p<? super T> pVar) {
            this.f1269a = pVar;
        }

        public void h(boolean z) {
            if (z == this.f1270b) {
                return;
            }
            this.f1270b = z;
            LiveData liveData = LiveData.this;
            int i = z ? 1 : -1;
            int i2 = liveData.f1268c;
            liveData.f1268c = i + i2;
            if (!liveData.d) {
                liveData.d = true;
                while (true) {
                    try {
                        int i3 = liveData.f1268c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            liveData.d();
                        } else if (z3) {
                            liveData.e();
                        }
                        i2 = i3;
                    } finally {
                        liveData.d = false;
                    }
                }
            }
            if (!this.f1270b) {
                return;
            }
            LiveData.this.c(this);
        }

        public void i() {
        }

        public abstract boolean j();
    }

    public LiveData() {
        Object obj = j;
        this.f = obj;
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        if (a.c.a.a.a.b().a()) {
            return;
        }
        throw new IllegalStateException(b.a.a.a.a.e("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(LiveData<T>.b bVar) {
        if (!bVar.f1270b) {
            return;
        }
        if (!bVar.j()) {
            bVar.h(false);
            return;
        }
        int i = bVar.f1271c;
        int i2 = this.g;
        if (i >= i2) {
            return;
        }
        bVar.f1271c = i2;
        p<? super T> pVar = bVar.f1269a;
        Object obj = this.e;
        l.d dVar = (l.d) pVar;
        Objects.requireNonNull(dVar);
        if (((j) obj) == null) {
            return;
        }
        l lVar = l.this;
        if (!lVar.a0) {
            return;
        }
        View j0 = lVar.j0();
        if (j0.getParent() != null) {
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
        if (l.this.e0 == null) {
            return;
        }
        if (b0.M(3)) {
            Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + l.this.e0);
        }
        l.this.e0.setContentView(j0);
    }

    public void c(LiveData<T>.b bVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (bVar == null) {
                a.c.a.b.b<p<? super T>, LiveData<T>.b>.d b2 = this.f1267b.b();
                while (b2.hasNext()) {
                    b((b) ((Map.Entry) b2.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                b(bVar);
                bVar = null;
            }
        } while (this.i);
        this.h = false;
    }

    public void d() {
    }

    public void e() {
    }

    public void f(p<? super T> pVar) {
        a("removeObserver");
        LiveData<T>.b e = this.f1267b.e(pVar);
        if (e == null) {
            return;
        }
        e.i();
        e.h(false);
    }
}
