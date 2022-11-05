package a.l.b;

import a.l.b.x0;

/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0.d f836a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x0.d f837b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f838c;
    public final /* synthetic */ a.e.a d;

    public h(c cVar, x0.d dVar, x0.d dVar2, boolean z, a.e.a aVar) {
        this.f836a = dVar;
        this.f837b = dVar2;
        this.f838c = z;
        this.d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        q0.c(this.f836a.f938c, this.f837b.f938c, this.f838c, this.d, false);
    }
}
