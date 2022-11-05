package androidx.lifecycle;

import a.n.d;
import a.n.f;
import a.n.h;
import a.n.j;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements h {

    /* renamed from: a  reason: collision with root package name */
    public final d f1264a;

    /* renamed from: b  reason: collision with root package name */
    public final h f1265b;

    public FullLifecycleObserverAdapter(d dVar, h hVar) {
        this.f1264a = dVar;
        this.f1265b = hVar;
    }

    @Override // a.n.h
    public void g(j jVar, f.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.f1264a.d(jVar);
                break;
            case 1:
                this.f1264a.e(jVar);
                break;
            case 2:
                this.f1264a.f(jVar);
                break;
            case 3:
                this.f1264a.a(jVar);
                break;
            case 4:
                this.f1264a.c(jVar);
                break;
            case 5:
                this.f1264a.b(jVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        h hVar = this.f1265b;
        if (hVar != null) {
            hVar.g(jVar, aVar);
        }
    }
}
