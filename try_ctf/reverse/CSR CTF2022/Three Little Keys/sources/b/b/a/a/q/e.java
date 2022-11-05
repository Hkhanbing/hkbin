package b.b.a.a.q;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f1525a;

    public e(d dVar) {
        this.f1525a = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        d dVar = this.f1525a;
        float rotation = dVar.r.getRotation();
        if (dVar.k != rotation) {
            dVar.k = rotation;
            dVar.u();
            return true;
        }
        return true;
    }
}
