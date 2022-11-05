package a.f.a.i.l;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class l {

    /* renamed from: c  reason: collision with root package name */
    public static int f421c;

    /* renamed from: a  reason: collision with root package name */
    public o f422a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<o> f423b = new ArrayList<>();

    public l(o oVar, int i) {
        this.f422a = null;
        f421c++;
        this.f422a = oVar;
    }

    public final long a(f fVar, long j) {
        o oVar = fVar.d;
        if (oVar instanceof j) {
            return j;
        }
        int size = fVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != oVar) {
                    j2 = Math.min(j2, a(fVar2, fVar2.f + j));
                }
            }
        }
        if (fVar != oVar.i) {
            return j2;
        }
        long j3 = j - oVar.j();
        return Math.min(Math.min(j2, a(oVar.h, j3)), j3 - oVar.h.f);
    }

    public final long b(f fVar, long j) {
        o oVar = fVar.d;
        if (oVar instanceof j) {
            return j;
        }
        int size = fVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != oVar) {
                    j2 = Math.max(j2, b(fVar2, fVar2.f + j));
                }
            }
        }
        if (fVar != oVar.h) {
            return j2;
        }
        long j3 = j + oVar.j();
        return Math.max(Math.max(j2, b(oVar.i, j3)), j3 - oVar.i.f);
    }
}
