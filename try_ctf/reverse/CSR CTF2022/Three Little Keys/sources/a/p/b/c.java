package a.p.b;

import a.p.b.k;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1010a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f1011b;

    public c(k kVar, ArrayList arrayList) {
        this.f1011b = kVar;
        this.f1010a = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f1010a.iterator();
        while (it.hasNext()) {
            k.b bVar = (k.b) it.next();
            k kVar = this.f1011b;
            RecyclerView.z zVar = bVar.f1034a;
            int i = bVar.f1035b;
            int i2 = bVar.f1036c;
            int i3 = bVar.d;
            int i4 = bVar.e;
            Objects.requireNonNull(kVar);
            View view = zVar.f1338a;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            kVar.p.add(zVar);
            animate.setDuration(kVar.e).setListener(new h(kVar, zVar, i5, view, i6, animate)).start();
        }
        this.f1010a.clear();
        this.f1011b.m.remove(this.f1010a);
    }
}
