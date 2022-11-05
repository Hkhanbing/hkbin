package a.l.b;

import a.n.f;

/* loaded from: classes.dex */
public class v0 implements a.q.c, a.n.z {

    /* renamed from: a  reason: collision with root package name */
    public final a.n.y f922a;

    /* renamed from: b  reason: collision with root package name */
    public a.n.k f923b = null;

    /* renamed from: c  reason: collision with root package name */
    public a.q.b f924c = null;

    public v0(m mVar, a.n.y yVar) {
        this.f922a = yVar;
    }

    @Override // a.n.j
    public a.n.f a() {
        f();
        return this.f923b;
    }

    public void b(f.a aVar) {
        a.n.k kVar = this.f923b;
        kVar.c("handleLifecycleEvent");
        kVar.f(aVar.a());
    }

    @Override // a.q.c
    public a.q.a d() {
        f();
        return this.f924c.f1072b;
    }

    @Override // a.n.z
    public a.n.y e() {
        f();
        return this.f922a;
    }

    public void f() {
        if (this.f923b == null) {
            this.f923b = new a.n.k(this);
            this.f924c = new a.q.b(this);
        }
    }
}
