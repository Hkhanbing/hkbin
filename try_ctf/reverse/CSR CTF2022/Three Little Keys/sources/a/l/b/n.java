package a.l.b;

import a.n.f;
import a.q.a;
import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class n implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f877a;

    public n(p pVar) {
        this.f877a = pVar;
    }

    @Override // a.q.a.b
    public Bundle a() {
        Bundle bundle = new Bundle();
        do {
        } while (p.n(this.f877a.h.f925a.d, f.b.CREATED));
        this.f877a.i.d(f.a.ON_STOP);
        Parcelable Z = this.f877a.h.f925a.d.Z();
        if (Z != null) {
            bundle.putParcelable("android:support:fragments", Z);
        }
        return bundle;
    }
}
