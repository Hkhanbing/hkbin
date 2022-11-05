package a.b.c;

import a.q.a;
import android.os.Bundle;

/* loaded from: classes.dex */
public class e implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f24a;

    public e(g gVar) {
        this.f24a = gVar;
    }

    @Override // a.q.a.b
    public Bundle a() {
        Bundle bundle = new Bundle();
        this.f24a.q().p(bundle);
        return bundle;
    }
}
