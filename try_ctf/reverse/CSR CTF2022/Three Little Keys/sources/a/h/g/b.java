package a.h.g;

import a.h.c.b.h;
import a.h.d.e;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f551a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f552b;

    public b(c cVar, m mVar, int i) {
        this.f551a = mVar;
        this.f552b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        m mVar = this.f551a;
        int i = this.f552b;
        h.c cVar = ((e.a) mVar).f541a;
        if (cVar != null) {
            cVar.d(i);
        }
    }
}
