package a.f.a.i.l;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {
    public o d;
    public int f;
    public int g;

    /* renamed from: a  reason: collision with root package name */
    public d f412a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f413b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f414c = false;
    public a e = a.UNKNOWN;
    public int h = 1;
    public g i = null;
    public boolean j = false;
    public List<d> k = new ArrayList();
    public List<f> l = new ArrayList();

    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(o oVar) {
        this.d = oVar;
    }

    @Override // a.f.a.i.l.d
    public void a(d dVar) {
        for (f fVar : this.l) {
            if (!fVar.j) {
                return;
            }
        }
        this.f414c = true;
        d dVar2 = this.f412a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f413b) {
            this.d.a(this);
            return;
        }
        f fVar2 = null;
        int i = 0;
        for (f fVar3 : this.l) {
            if (!(fVar3 instanceof g)) {
                i++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i == 1 && fVar2.j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.j) {
                    return;
                }
                this.f = this.h * gVar.g;
            }
            c(fVar2.g + this.f);
        }
        d dVar3 = this.f412a;
        if (dVar3 == null) {
            return;
        }
        dVar3.a(this);
    }

    public void b() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.f414c = false;
        this.f413b = false;
    }

    public void c(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f428b.j0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
