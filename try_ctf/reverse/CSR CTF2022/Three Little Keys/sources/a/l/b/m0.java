package a.l.b;

import a.l.b.b0;
import a.l.b.q0;

/* loaded from: classes.dex */
public class m0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0.a f874a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f875b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a.h.f.a f876c;

    public m0(q0.a aVar, m mVar, a.h.f.a aVar2) {
        this.f874a = aVar;
        this.f875b = mVar;
        this.f876c = aVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((b0.d) this.f874a).a(this.f875b, this.f876c);
    }
}
