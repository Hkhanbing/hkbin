package a.l.b;

import a.h.j.w;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class t0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f915a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f916b;

    public t0(s0 s0Var, ArrayList arrayList, Map map) {
        this.f915a = arrayList;
        this.f916b = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f915a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f915a.get(i);
            AtomicInteger atomicInteger = a.h.j.w.f667a;
            String k = w.i.k(view);
            if (k != null) {
                Iterator it = this.f916b.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (k.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                w.i.v(view, str);
            }
        }
    }
}
