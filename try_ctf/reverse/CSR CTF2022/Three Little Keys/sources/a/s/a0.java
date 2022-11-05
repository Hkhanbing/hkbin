package a.s;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public class a0 implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f1078a;

    public a0(View view) {
        this.f1078a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof a0) && ((a0) obj).f1078a.equals(this.f1078a);
    }

    public int hashCode() {
        return this.f1078a.hashCode();
    }
}
