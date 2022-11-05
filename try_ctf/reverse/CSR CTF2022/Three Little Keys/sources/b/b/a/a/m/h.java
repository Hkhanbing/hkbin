package b.b.a.a.m;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* loaded from: classes.dex */
public class h extends RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f1474a = b0.e();

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f1475b = b0.e();

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f1476c;

    public h(g gVar) {
        this.f1476c = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.w wVar) {
        if (!(recyclerView.getAdapter() instanceof d0) || !(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        d0 d0Var = (d0) recyclerView.getAdapter();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        for (a.h.i.b<Long, Long> bVar : this.f1476c.V.g()) {
            Long l = bVar.f601a;
            if (l != null && bVar.f602b != null) {
                this.f1474a.setTimeInMillis(l.longValue());
                this.f1475b.setTimeInMillis(bVar.f602b.longValue());
                int e = d0Var.e(this.f1474a.get(1));
                int e2 = d0Var.e(this.f1475b.get(1));
                View t = gridLayoutManager.t(e);
                View t2 = gridLayoutManager.t(e2);
                int i = gridLayoutManager.H;
                int i2 = e / i;
                int i3 = e2 / i;
                for (int i4 = i2; i4 <= i3; i4++) {
                    View t3 = gridLayoutManager.t(gridLayoutManager.H * i4);
                    if (t3 != null) {
                        int top = t3.getTop() + this.f1476c.Z.d.f1454a.top;
                        int bottom = t3.getBottom() - this.f1476c.Z.d.f1454a.bottom;
                        canvas.drawRect(i4 == i2 ? (t.getWidth() / 2) + t.getLeft() : 0, top, i4 == i3 ? (t2.getWidth() / 2) + t2.getLeft() : recyclerView.getWidth(), bottom, this.f1476c.Z.h);
                    }
                }
            }
        }
    }
}
