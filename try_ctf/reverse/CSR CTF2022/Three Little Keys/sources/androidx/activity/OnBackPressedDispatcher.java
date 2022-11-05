package androidx.activity;

import a.a.b;
import a.n.f;
import a.n.h;
import a.n.j;
import a.n.k;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f1148a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<b> f1149b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements h, a.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final f f1150a;

        /* renamed from: b  reason: collision with root package name */
        public final b f1151b;

        /* renamed from: c  reason: collision with root package name */
        public a.a.a f1152c;

        public LifecycleOnBackPressedCancellable(f fVar, b bVar) {
            this.f1150a = fVar;
            this.f1151b = bVar;
            fVar.a(this);
        }

        @Override // a.a.a
        public void cancel() {
            k kVar = (k) this.f1150a;
            kVar.c("removeObserver");
            kVar.f968a.e(this);
            this.f1151b.f1b.remove(this);
            a.a.a aVar = this.f1152c;
            if (aVar != null) {
                aVar.cancel();
                this.f1152c = null;
            }
        }

        @Override // a.n.h
        public void g(j jVar, f.a aVar) {
            if (aVar == f.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.f1151b;
                onBackPressedDispatcher.f1149b.add(bVar);
                a aVar2 = new a(bVar);
                bVar.f1b.add(aVar2);
                this.f1152c = aVar2;
            } else if (aVar != f.a.ON_STOP) {
                if (aVar != f.a.ON_DESTROY) {
                    return;
                }
                cancel();
            } else {
                a.a.a aVar3 = this.f1152c;
                if (aVar3 == null) {
                    return;
                }
                aVar3.cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements a.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final b f1153a;

        public a(b bVar) {
            this.f1153a = bVar;
        }

        @Override // a.a.a
        public void cancel() {
            OnBackPressedDispatcher.this.f1149b.remove(this.f1153a);
            this.f1153a.f1b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f1148a = runnable;
    }

    public void a() {
        Iterator<b> descendingIterator = this.f1149b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.f0a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f1148a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
