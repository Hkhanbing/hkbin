package b.b.a.a.m;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import b.b.a.a.m.g;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* loaded from: classes.dex */
public class v implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f1499a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f1500b;

    public v(w wVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f1500b = wVar;
        this.f1499a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        u adapter2 = this.f1499a.getAdapter2();
        if (i >= adapter2.b() && i <= adapter2.d()) {
            g.f fVar = this.f1500b.e;
            long longValue = this.f1499a.getAdapter2().getItem(i).longValue();
            g.d dVar = (g.d) fVar;
            if (!g.this.W.f1447c.i(longValue)) {
                return;
            }
            g.this.V.c(longValue);
            Iterator it = g.this.T.iterator();
            while (it.hasNext()) {
                ((x) it.next()).a(g.this.V.a());
            }
            g.this.b0.getAdapter().f1297a.b();
            RecyclerView recyclerView = g.this.a0;
            if (recyclerView == null) {
                return;
            }
            recyclerView.getAdapter().f1297a.b();
        }
    }
}
