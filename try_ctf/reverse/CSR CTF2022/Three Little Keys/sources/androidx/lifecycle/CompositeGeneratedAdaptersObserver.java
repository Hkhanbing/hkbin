package androidx.lifecycle;

import a.n.e;
import a.n.f;
import a.n.h;
import a.n.j;
import a.n.n;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements h {

    /* renamed from: a  reason: collision with root package name */
    public final e[] f1263a;

    public CompositeGeneratedAdaptersObserver(e[] eVarArr) {
        this.f1263a = eVarArr;
    }

    @Override // a.n.h
    public void g(j jVar, f.a aVar) {
        n nVar = new n();
        for (e eVar : this.f1263a) {
            eVar.a(jVar, aVar, false, nVar);
        }
        for (e eVar2 : this.f1263a) {
            eVar2.a(jVar, aVar, true, nVar);
        }
    }
}
