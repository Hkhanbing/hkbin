package a.s;

import a.s.h;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class n extends h {
    public int z;
    public ArrayList<h> x = new ArrayList<>();
    public boolean y = true;
    public boolean A = false;
    public int B = 0;

    /* loaded from: classes.dex */
    public class a extends k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f1110a;

        public a(n nVar, h hVar) {
            this.f1110a = hVar;
        }

        @Override // a.s.h.d
        public void c(h hVar) {
            this.f1110a.y();
            hVar.v(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends k {

        /* renamed from: a  reason: collision with root package name */
        public n f1111a;

        public b(n nVar) {
            this.f1111a = nVar;
        }

        @Override // a.s.k, a.s.h.d
        public void a(h hVar) {
            n nVar = this.f1111a;
            if (!nVar.A) {
                nVar.F();
                this.f1111a.A = true;
            }
        }

        @Override // a.s.h.d
        public void c(h hVar) {
            n nVar = this.f1111a;
            int i = nVar.z - 1;
            nVar.z = i;
            if (i == 0) {
                nVar.A = false;
                nVar.m();
            }
            hVar.v(this);
        }
    }

    @Override // a.s.h
    public void A(h.c cVar) {
        this.s = cVar;
        this.B |= 8;
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            this.x.get(i).A(cVar);
        }
    }

    @Override // a.s.h
    public h B(TimeInterpolator timeInterpolator) {
        this.B |= 1;
        ArrayList<h> arrayList = this.x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.x.get(i).B(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
        return this;
    }

    @Override // a.s.h
    public void C(e eVar) {
        this.t = eVar == null ? h.v : eVar;
        this.B |= 4;
        if (this.x != null) {
            for (int i = 0; i < this.x.size(); i++) {
                this.x.get(i).C(eVar);
            }
        }
    }

    @Override // a.s.h
    public void D(m mVar) {
        this.B |= 2;
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            this.x.get(i).D(mVar);
        }
    }

    @Override // a.s.h
    public h E(long j) {
        this.f1095b = j;
        return this;
    }

    @Override // a.s.h
    public String G(String str) {
        String G = super.G(str);
        for (int i = 0; i < this.x.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(G);
            sb.append("\n");
            sb.append(this.x.get(i).G(str + "  "));
            G = sb.toString();
        }
        return G;
    }

    public n H(h hVar) {
        this.x.add(hVar);
        hVar.i = this;
        long j = this.f1096c;
        if (j >= 0) {
            hVar.z(j);
        }
        if ((this.B & 1) != 0) {
            hVar.B(this.d);
        }
        if ((this.B & 2) != 0) {
            hVar.D(null);
        }
        if ((this.B & 4) != 0) {
            hVar.C(this.t);
        }
        if ((this.B & 8) != 0) {
            hVar.A(this.s);
        }
        return this;
    }

    public h I(int i) {
        if (i < 0 || i >= this.x.size()) {
            return null;
        }
        return this.x.get(i);
    }

    public n J(int i) {
        if (i == 0) {
            this.y = true;
        } else if (i != 1) {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        } else {
            this.y = false;
        }
        return this;
    }

    @Override // a.s.h
    public h a(h.d dVar) {
        super.a(dVar);
        return this;
    }

    @Override // a.s.h
    public h b(View view) {
        for (int i = 0; i < this.x.size(); i++) {
            this.x.get(i).b(view);
        }
        this.f.add(view);
        return this;
    }

    @Override // a.s.h
    public void d(o oVar) {
        if (s(oVar.f1113b)) {
            Iterator<h> it = this.x.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.s(oVar.f1113b)) {
                    next.d(oVar);
                    oVar.f1114c.add(next);
                }
            }
        }
    }

    @Override // a.s.h
    public void f(o oVar) {
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            this.x.get(i).f(oVar);
        }
    }

    @Override // a.s.h
    public void g(o oVar) {
        if (s(oVar.f1113b)) {
            Iterator<h> it = this.x.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next.s(oVar.f1113b)) {
                    next.g(oVar);
                    oVar.f1114c.add(next);
                }
            }
        }
    }

    @Override // a.s.h
    /* renamed from: j */
    public h clone() {
        n nVar = (n) super.clone();
        nVar.x = new ArrayList<>();
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            h clone = this.x.get(i).clone();
            nVar.x.add(clone);
            clone.i = nVar;
        }
        return nVar;
    }

    @Override // a.s.h
    public void l(ViewGroup viewGroup, p pVar, p pVar2, ArrayList<o> arrayList, ArrayList<o> arrayList2) {
        long j = this.f1095b;
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            h hVar = this.x.get(i);
            if (j > 0 && (this.y || i == 0)) {
                long j2 = hVar.f1095b;
                if (j2 > 0) {
                    hVar.E(j2 + j);
                } else {
                    hVar.E(j);
                }
            }
            hVar.l(viewGroup, pVar, pVar2, arrayList, arrayList2);
        }
    }

    @Override // a.s.h
    public void u(View view) {
        super.u(view);
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            this.x.get(i).u(view);
        }
    }

    @Override // a.s.h
    public h v(h.d dVar) {
        super.v(dVar);
        return this;
    }

    @Override // a.s.h
    public h w(View view) {
        for (int i = 0; i < this.x.size(); i++) {
            this.x.get(i).w(view);
        }
        this.f.remove(view);
        return this;
    }

    @Override // a.s.h
    public void x(View view) {
        super.x(view);
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            this.x.get(i).x(view);
        }
    }

    @Override // a.s.h
    public void y() {
        if (this.x.isEmpty()) {
            F();
            m();
            return;
        }
        b bVar = new b(this);
        Iterator<h> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.z = this.x.size();
        if (this.y) {
            Iterator<h> it2 = this.x.iterator();
            while (it2.hasNext()) {
                it2.next().y();
            }
            return;
        }
        for (int i = 1; i < this.x.size(); i++) {
            this.x.get(i - 1).a(new a(this, this.x.get(i)));
        }
        h hVar = this.x.get(0);
        if (hVar == null) {
            return;
        }
        hVar.y();
    }

    @Override // a.s.h
    public h z(long j) {
        ArrayList<h> arrayList;
        this.f1096c = j;
        if (j >= 0 && (arrayList = this.x) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.x.get(i).z(j);
            }
        }
        return this;
    }
}
