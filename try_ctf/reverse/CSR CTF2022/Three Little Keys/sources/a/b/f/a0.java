package a.b.f;

import a.b.f.b0;
import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public class a0 extends n0 {
    public final /* synthetic */ b0.d j;
    public final /* synthetic */ b0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, View view, b0.d dVar) {
        super(view);
        this.k = b0Var;
        this.j = dVar;
    }

    @Override // a.b.f.n0
    public a.b.e.i.p b() {
        return this.j;
    }

    @Override // a.b.f.n0
    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (!this.k.getInternalPopup().a()) {
            this.k.b();
            return true;
        }
        return true;
    }
}
