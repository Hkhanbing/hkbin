package a.n;

import a.n.f;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class s extends c {
    public final /* synthetic */ r this$0;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            s.this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            s.this.this$0.e();
        }
    }

    public s(r rVar) {
        this.this$0 = rVar;
    }

    @Override // a.n.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = t.f980b;
            ((t) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f981a = this.this$0.h;
        }
    }

    @Override // a.n.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        r rVar = this.this$0;
        int i = rVar.f976b - 1;
        rVar.f976b = i;
        if (i == 0) {
            rVar.e.postDelayed(rVar.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    @Override // a.n.c, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        r rVar = this.this$0;
        int i = rVar.f975a - 1;
        rVar.f975a = i;
        if (i != 0 || !rVar.f977c) {
            return;
        }
        rVar.f.d(f.a.ON_STOP);
        rVar.d = true;
    }
}
