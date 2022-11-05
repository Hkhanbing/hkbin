package a.b.c;

import a.h.j.w;
import a.h.j.x;
import a.h.j.z;
import android.view.View;

/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f46a;

    /* loaded from: classes.dex */
    public class a extends z {
        public a() {
        }

        @Override // a.h.j.y
        public void a(View view) {
            m.this.f46a.o.setAlpha(1.0f);
            m.this.f46a.r.d(null);
            m.this.f46a.r = null;
        }

        @Override // a.h.j.z, a.h.j.y
        public void b(View view) {
            m.this.f46a.o.setVisibility(0);
        }
    }

    public m(j jVar) {
        this.f46a = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.f46a;
        jVar.p.showAtLocation(jVar.o, 55, 0, 0);
        this.f46a.I();
        if (this.f46a.V()) {
            this.f46a.o.setAlpha(0.0f);
            j jVar2 = this.f46a;
            x b2 = w.b(jVar2.o);
            b2.a(1.0f);
            jVar2.r = b2;
            x xVar = this.f46a.r;
            a aVar = new a();
            View view = xVar.f678a.get();
            if (view == null) {
                return;
            }
            xVar.e(view, aVar);
            return;
        }
        this.f46a.o.setAlpha(1.0f);
        this.f46a.o.setVisibility(0);
    }
}
