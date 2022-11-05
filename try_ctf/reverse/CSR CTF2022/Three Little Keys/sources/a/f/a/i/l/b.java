package a.f.a.i.l;

import a.f.a.i.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a.f.a.i.d> f403a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f404b = new a();

    /* renamed from: c  reason: collision with root package name */
    public a.f.a.i.e f405c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public d.a f406a;

        /* renamed from: b  reason: collision with root package name */
        public d.a f407b;

        /* renamed from: c  reason: collision with root package name */
        public int f408c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* renamed from: a.f.a.i.l.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0008b {
    }

    public b(a.f.a.i.e eVar) {
        this.f405c = eVar;
    }

    public final boolean a(InterfaceC0008b interfaceC0008b, a.f.a.i.d dVar, int i) {
        d.a aVar = d.a.FIXED;
        this.f404b.f406a = dVar.m();
        this.f404b.f407b = dVar.t();
        this.f404b.f408c = dVar.u();
        this.f404b.d = dVar.l();
        a aVar2 = this.f404b;
        aVar2.i = false;
        aVar2.j = i;
        d.a aVar3 = aVar2.f406a;
        d.a aVar4 = d.a.MATCH_CONSTRAINT;
        boolean z = aVar3 == aVar4;
        boolean z2 = aVar2.f407b == aVar4;
        boolean z3 = z && dVar.Y > 0.0f;
        boolean z4 = z2 && dVar.Y > 0.0f;
        if (z3 && dVar.t[0] == 4) {
            aVar2.f406a = aVar;
        }
        if (z4 && dVar.t[1] == 4) {
            aVar2.f407b = aVar;
        }
        ((ConstraintLayout.b) interfaceC0008b).b(dVar, aVar2);
        dVar.S(this.f404b.e);
        dVar.N(this.f404b.f);
        a aVar5 = this.f404b;
        dVar.E = aVar5.h;
        dVar.K(aVar5.g);
        a aVar6 = this.f404b;
        aVar6.j = 0;
        return aVar6.i;
    }

    public final void b(a.f.a.i.e eVar, int i, int i2, int i3) {
        int i4 = eVar.d0;
        int i5 = eVar.e0;
        eVar.Q(0);
        eVar.P(0);
        eVar.W = i2;
        int i6 = eVar.d0;
        if (i2 < i6) {
            eVar.W = i6;
        }
        eVar.X = i3;
        int i7 = eVar.e0;
        if (i3 < i7) {
            eVar.X = i7;
        }
        eVar.Q(i4);
        eVar.P(i5);
        a.f.a.i.e eVar2 = this.f405c;
        eVar2.u0 = i;
        eVar2.V();
    }

    public void c(a.f.a.i.e eVar) {
        this.f403a.clear();
        int size = eVar.r0.size();
        for (int i = 0; i < size; i++) {
            a.f.a.i.d dVar = eVar.r0.get(i);
            d.a m = dVar.m();
            d.a aVar = d.a.MATCH_CONSTRAINT;
            if (m == aVar || dVar.t() == aVar) {
                this.f403a.add(dVar);
            }
        }
        eVar.d0();
    }
}
