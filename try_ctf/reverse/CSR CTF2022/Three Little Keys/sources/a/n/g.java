package a.n;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f967a = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static class a extends c {
        @Override // a.n.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            t.c(activity);
        }

        @Override // a.n.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // a.n.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }
}
