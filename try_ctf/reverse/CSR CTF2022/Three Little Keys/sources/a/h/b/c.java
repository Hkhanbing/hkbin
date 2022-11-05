package a.h.b;

import a.h.j.g;
import a.h.j.w;
import a.n.f;
import a.n.j;
import a.n.k;
import a.n.t;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class c extends Activity implements j, g {

    /* renamed from: a  reason: collision with root package name */
    public k f499a = new k(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            AtomicInteger atomicInteger = w.f667a;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            AtomicInteger atomicInteger = w.f667a;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // a.h.j.g
    public boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t.c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        k kVar = this.f499a;
        f.b bVar = f.b.CREATED;
        kVar.c("markState");
        kVar.c("setCurrentState");
        kVar.f(bVar);
        super.onSaveInstanceState(bundle);
    }
}
