package a.b.c;

import a.h.j.b0;
import a.h.j.w;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class k implements a.h.j.o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f44a;

    public k(j jVar) {
        this.f44a = jVar;
    }

    @Override // a.h.j.o
    public b0 a(View view, b0 b0Var) {
        int e = b0Var.e();
        int X = this.f44a.X(b0Var, null);
        if (e != X) {
            int c2 = b0Var.c();
            int d = b0Var.d();
            int b2 = b0Var.b();
            int i = Build.VERSION.SDK_INT;
            b0.e dVar = i >= 30 ? new b0.d(b0Var) : i >= 29 ? new b0.c(b0Var) : new b0.b(b0Var);
            dVar.c(a.h.d.b.b(c2, X, d, b2));
            b0Var = dVar.a();
        }
        return w.k(view, b0Var);
    }
}
