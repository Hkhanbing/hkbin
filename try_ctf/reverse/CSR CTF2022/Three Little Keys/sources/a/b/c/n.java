package a.b.c;

import a.h.j.w;
import a.h.j.z;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class n extends z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f48a;

    public n(j jVar) {
        this.f48a = jVar;
    }

    @Override // a.h.j.y
    public void a(View view) {
        this.f48a.o.setAlpha(1.0f);
        this.f48a.r.d(null);
        this.f48a.r = null;
    }

    @Override // a.h.j.z, a.h.j.y
    public void b(View view) {
        this.f48a.o.setVisibility(0);
        if (this.f48a.o.getParent() instanceof View) {
            AtomicInteger atomicInteger = w.f667a;
            w.h.c((View) this.f48a.o.getParent());
        }
    }
}
