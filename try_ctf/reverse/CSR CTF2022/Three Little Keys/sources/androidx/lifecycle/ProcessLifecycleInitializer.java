package androidx.lifecycle;

import a.n.f;
import a.n.g;
import a.n.j;
import a.n.r;
import a.n.s;
import a.r.b;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements b<j> {
    @Override // a.r.b
    public List<Class<? extends b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // a.r.b
    public j b(Context context) {
        if (!g.f967a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new g.a());
        }
        r rVar = r.i;
        Objects.requireNonNull(rVar);
        rVar.e = new Handler();
        rVar.f.d(f.a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new s(rVar));
        return rVar;
    }
}
