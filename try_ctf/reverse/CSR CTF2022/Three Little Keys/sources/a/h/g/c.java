package a.h.g;

import a.h.g.j;
import android.os.Handler;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final m f553a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f554b;

    public c(m mVar, Handler handler) {
        this.f553a = mVar;
        this.f554b = handler;
    }

    public void a(j.a aVar) {
        int i = aVar.f571b;
        if (!(i == 0)) {
            this.f554b.post(new b(this, this.f553a, i));
            return;
        }
        this.f554b.post(new a(this, this.f553a, aVar.f570a));
    }
}
