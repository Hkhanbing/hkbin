package a.p.b;

import a.p.b.k;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class y extends RecyclerView.i {
    public boolean g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public boolean a(RecyclerView.z zVar, RecyclerView.z zVar2, RecyclerView.i.c cVar, RecyclerView.i.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f1302a;
        int i4 = cVar.f1303b;
        if (zVar2.t()) {
            int i5 = cVar.f1302a;
            i2 = cVar.f1303b;
            i = i5;
        } else {
            i = cVar2.f1302a;
            i2 = cVar2.f1303b;
        }
        k kVar = (k) this;
        if (zVar == zVar2) {
            return kVar.i(zVar, i3, i4, i, i2);
        }
        float translationX = zVar.f1338a.getTranslationX();
        float translationY = zVar.f1338a.getTranslationY();
        float alpha = zVar.f1338a.getAlpha();
        kVar.n(zVar);
        zVar.f1338a.setTranslationX(translationX);
        zVar.f1338a.setTranslationY(translationY);
        zVar.f1338a.setAlpha(alpha);
        kVar.n(zVar2);
        zVar2.f1338a.setTranslationX(-((int) ((i - i3) - translationX)));
        zVar2.f1338a.setTranslationY(-((int) ((i2 - i4) - translationY)));
        zVar2.f1338a.setAlpha(0.0f);
        kVar.k.add(new k.a(zVar, zVar2, i3, i4, i, i2));
        return true;
    }

    public abstract boolean i(RecyclerView.z zVar, int i, int i2, int i3, int i4);
}
