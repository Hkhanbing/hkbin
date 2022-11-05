package b.b.a.a.e;

import a.h.j.d0.f;
import a.h.j.w;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f1410a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f1410a = swipeDismissBehavior;
    }

    @Override // a.h.j.d0.f
    public boolean a(View view, f.a aVar) {
        boolean z = false;
        if (this.f1410a.B(view)) {
            AtomicInteger atomicInteger = w.f667a;
            boolean z2 = w.e.d(view) == 1;
            int i = this.f1410a.d;
            if ((i == 0 && z2) || (i == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            view.offsetLeftAndRight(width);
            view.setAlpha(0.0f);
            SwipeDismissBehavior.b bVar = this.f1410a.f1685b;
            if (bVar != null) {
                ((b.b.a.a.x.a) bVar).a(view);
            }
            return true;
        }
        return false;
    }
}
