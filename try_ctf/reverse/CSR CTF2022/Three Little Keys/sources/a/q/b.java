package a.q;

import a.n.f;
import a.n.h;
import a.n.j;
import a.n.k;
import a.q.a;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f1071a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1072b = new a();

    public b(c cVar) {
        this.f1071a = cVar;
    }

    public void a(Bundle bundle) {
        f a2 = this.f1071a.a();
        if (((k) a2).f969b == f.b.INITIALIZED) {
            a2.a(new Recreator(this.f1071a));
            final a aVar = this.f1072b;
            if (aVar.f1070c) {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
            if (bundle != null) {
                aVar.f1069b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            a2.a(new h() { // from class: androidx.savedstate.SavedStateRegistry$1
                @Override // a.n.h
                public void g(j jVar, f.a aVar2) {
                    a aVar3;
                    boolean z;
                    if (aVar2 == f.a.ON_START) {
                        aVar3 = a.this;
                        z = true;
                    } else if (aVar2 != f.a.ON_STOP) {
                        return;
                    } else {
                        aVar3 = a.this;
                        z = false;
                    }
                    aVar3.e = z;
                }
            });
            aVar.f1070c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        a aVar = this.f1072b;
        Objects.requireNonNull(aVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f1069b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        a.c.a.b.b<String, a.b>.d b2 = aVar.f1068a.b();
        while (b2.hasNext()) {
            Map.Entry entry = (Map.Entry) b2.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
