package a.p.b;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1014a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f1015b;

    public e(k kVar, ArrayList arrayList) {
        this.f1015b = kVar;
        this.f1014a = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f1014a.iterator();
        while (it.hasNext()) {
            RecyclerView.z zVar = (RecyclerView.z) it.next();
            k kVar = this.f1015b;
            Objects.requireNonNull(kVar);
            View view = zVar.f1338a;
            ViewPropertyAnimator animate = view.animate();
            kVar.o.add(zVar);
            animate.alpha(1.0f).setDuration(kVar.f1301c).setListener(new g(kVar, zVar, view, animate)).start();
        }
        this.f1014a.clear();
        this.f1015b.l.remove(this.f1014a);
    }
}
