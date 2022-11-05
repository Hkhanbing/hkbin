package b.b.a.a.x;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Objects;

/* loaded from: classes.dex */
public class a implements SwipeDismissBehavior.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f1610a;

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        Objects.requireNonNull(this.f1610a);
        b a2 = b.a();
        synchronized (a2.f1611a) {
            a2.b(null);
        }
    }
}
