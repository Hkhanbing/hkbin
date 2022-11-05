package a.l.b;

import a.h.j.w;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class u0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f920a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f921b;

    public u0(s0 s0Var, ArrayList arrayList, Map map) {
        this.f920a = arrayList;
        this.f921b = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f920a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f920a.get(i);
            AtomicInteger atomicInteger = a.h.j.w.f667a;
            w.i.v(view, (String) this.f921b.get(w.i.k(view)));
        }
    }
}
