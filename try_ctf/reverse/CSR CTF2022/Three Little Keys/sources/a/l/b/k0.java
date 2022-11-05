package a.l.b;

import a.l.b.b0;
import a.l.b.q0;

/* loaded from: classes.dex */
public class k0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0.a f857a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f858b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a.h.f.a f859c;

    public k0(q0.a aVar, m mVar, a.h.f.a aVar2) {
        this.f857a = aVar;
        this.f858b = mVar;
        this.f859c = aVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((b0.d) this.f857a).a(this.f858b, this.f859c);
    }
}
