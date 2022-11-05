package a.p.b;

import a.p.b.a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class w implements a.InterfaceC0028a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1063a;

    public w(RecyclerView recyclerView) {
        this.f1063a = recyclerView;
    }

    public void a(a.b bVar) {
        int i = bVar.f992a;
        if (i == 1) {
            RecyclerView recyclerView = this.f1063a;
            recyclerView.l.o0(recyclerView, bVar.f993b, bVar.d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.f1063a;
            recyclerView2.l.r0(recyclerView2, bVar.f993b, bVar.d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f1063a;
            recyclerView3.l.t0(recyclerView3, bVar.f993b, bVar.d, bVar.f994c);
        } else if (i != 8) {
        } else {
            RecyclerView recyclerView4 = this.f1063a;
            recyclerView4.l.q0(recyclerView4, bVar.f993b, bVar.d, 1);
        }
    }

    public RecyclerView.z b(int i) {
        RecyclerView recyclerView = this.f1063a;
        int h = recyclerView.e.h();
        int i2 = 0;
        RecyclerView.z zVar = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            RecyclerView.z K = RecyclerView.K(recyclerView.e.g(i2));
            if (K != null && !K.l() && K.f1340c == i) {
                if (!recyclerView.e.k(K.f1338a)) {
                    zVar = K;
                    break;
                }
                zVar = K;
            }
            i2++;
        }
        if (zVar != null && !this.f1063a.e.k(zVar.f1338a)) {
            return zVar;
        }
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f1063a;
        int h = recyclerView.e.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = recyclerView.e.g(i6);
            RecyclerView.z K = RecyclerView.K(g);
            if (K != null && !K.t() && (i4 = K.f1340c) >= i && i4 < i5) {
                K.b(2);
                K.a(obj);
                ((RecyclerView.m) g.getLayoutParams()).f1315c = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f1293b;
        int size = rVar.f1323c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f1063a.i0 = true;
                return;
            }
            RecyclerView.z zVar = rVar.f1323c.get(size);
            if (zVar != null && (i3 = zVar.f1340c) >= i && i3 < i5) {
                zVar.b(2);
                rVar.f(size);
            }
        }
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.f1063a;
        int h = recyclerView.e.h();
        for (int i3 = 0; i3 < h; i3++) {
            RecyclerView.z K = RecyclerView.K(recyclerView.e.g(i3));
            if (K != null && !K.t() && K.f1340c >= i) {
                K.p(i2, false);
                recyclerView.e0.f = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f1293b;
        int size = rVar.f1323c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.z zVar = rVar.f1323c.get(i4);
            if (zVar != null && zVar.f1340c >= i) {
                zVar.p(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f1063a.h0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f1063a;
        int h = recyclerView.e.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < h; i11++) {
            RecyclerView.z K = RecyclerView.K(recyclerView.e.g(i11));
            if (K != null && (i9 = K.f1340c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    K.p(i2 - i, false);
                } else {
                    K.p(i5, false);
                }
                recyclerView.e0.f = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f1293b;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = rVar.f1323c.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.z zVar = rVar.f1323c.get(i12);
            if (zVar != null && (i8 = zVar.f1340c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    zVar.p(i2 - i, false);
                } else {
                    zVar.p(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f1063a.h0 = true;
    }
}
