package androidx.lifecycle;

import a.n.a;
import a.n.f;
import a.n.h;
import a.n.j;

@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1272a;

    /* renamed from: b  reason: collision with root package name */
    public final a.C0026a f1273b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1272a = obj;
        this.f1273b = a.f957c.b(obj.getClass());
    }

    @Override // a.n.h
    public void g(j jVar, f.a aVar) {
        a.C0026a c0026a = this.f1273b;
        Object obj = this.f1272a;
        a.C0026a.a(c0026a.f960a.get(aVar), jVar, aVar, obj);
        a.C0026a.a(c0026a.f960a.get(f.a.ON_ANY), jVar, aVar, obj);
    }
}
