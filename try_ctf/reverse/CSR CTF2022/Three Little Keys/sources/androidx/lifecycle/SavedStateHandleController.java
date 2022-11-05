package androidx.lifecycle;

import a.n.f;
import a.n.h;
import a.n.j;
import a.n.k;
import a.n.u;
import a.n.y;
import a.n.z;
import a.q.a;
import a.q.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1274a;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f1275a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a.q.a f1276b;

        @Override // a.n.h
        public void g(j jVar, f.a aVar) {
            if (aVar == f.a.ON_START) {
                k kVar = (k) this.f1275a;
                kVar.c("removeObserver");
                kVar.f968a.e(this);
                this.f1276b.c(a.class);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0030a {
        @Override // a.q.a.InterfaceC0030a
        public void a(c cVar) {
            Object obj;
            boolean z;
            if (cVar instanceof z) {
                y e = ((z) cVar).e();
                a.q.a d = cVar.d();
                Objects.requireNonNull(e);
                Iterator it = new HashSet(e.f983a.keySet()).iterator();
                while (it.hasNext()) {
                    u uVar = e.f983a.get((String) it.next());
                    f a2 = cVar.a();
                    Map<String, Object> map = uVar.f982a;
                    if (map == null) {
                        obj = null;
                    } else {
                        synchronized (map) {
                            obj = uVar.f982a.get("androidx.lifecycle.savedstate.vm.tag");
                        }
                    }
                    SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                    if (savedStateHandleController != null && !(z = savedStateHandleController.f1274a)) {
                        if (z) {
                            throw new IllegalStateException("Already attached to lifecycleOwner");
                        }
                        savedStateHandleController.f1274a = true;
                        a2.a(savedStateHandleController);
                        throw null;
                    }
                }
                if (new HashSet(e.f983a.keySet()).isEmpty()) {
                    return;
                }
                d.c(a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    @Override // a.n.h
    public void g(j jVar, f.a aVar) {
        if (aVar == f.a.ON_DESTROY) {
            this.f1274a = false;
            k kVar = (k) jVar.a();
            kVar.c("removeObserver");
            kVar.f968a.e(this);
        }
    }
}
