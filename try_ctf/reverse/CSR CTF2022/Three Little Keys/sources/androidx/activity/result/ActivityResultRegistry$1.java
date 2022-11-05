package androidx.activity.result;

import a.n.f;
import a.n.h;
import a.n.j;

/* loaded from: classes.dex */
public class ActivityResultRegistry$1 implements h {
    @Override // a.n.h
    public void g(j jVar, f.a aVar) {
        if (!f.a.ON_START.equals(aVar)) {
            if (f.a.ON_STOP.equals(aVar)) {
                throw null;
            }
            if (f.a.ON_DESTROY.equals(aVar)) {
                throw null;
            }
            return;
        }
        throw null;
    }
}
