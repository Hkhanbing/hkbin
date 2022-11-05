package a.p.b;

import a.p.b.k;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1012a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f1013b;

    public d(k kVar, ArrayList arrayList) {
        this.f1013b = kVar;
        this.f1012a = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f1012a.iterator();
        while (it.hasNext()) {
            k.a aVar = (k.a) it.next();
            k kVar = this.f1013b;
            Objects.requireNonNull(kVar);
            RecyclerView.z zVar = aVar.f1031a;
            View view = null;
            View view2 = zVar == null ? null : zVar.f1338a;
            RecyclerView.z zVar2 = aVar.f1032b;
            if (zVar2 != null) {
                view = zVar2.f1338a;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(kVar.f);
                kVar.r.add(aVar.f1031a);
                duration.translationX(aVar.e - aVar.f1033c);
                duration.translationY(aVar.f - aVar.d);
                duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                kVar.r.add(aVar.f1032b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f).alpha(1.0f).setListener(new j(kVar, aVar, animate, view)).start();
            }
        }
        this.f1012a.clear();
        this.f1013b.n.remove(this.f1012a);
    }
}
