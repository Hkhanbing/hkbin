package b.b.a.a.m;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.b.a.a.m.g;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class w extends RecyclerView.d<a> {

    /* renamed from: c  reason: collision with root package name */
    public final b.b.a.a.m.a f1501c;
    public final d<?> d;
    public final g.f e;
    public final int f;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.z {
        public final TextView t;
        public final MaterialCalendarGridView u;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.t = textView;
            AtomicInteger atomicInteger = a.h.j.w.f667a;
            new a.h.j.v(R.id.tag_accessibility_heading, Boolean.class, 28).e(textView, Boolean.TRUE);
            this.u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public w(Context context, d<?> dVar, b.b.a.a.m.a aVar, g.f fVar) {
        t tVar = aVar.f1445a;
        t tVar2 = aVar.f1446b;
        t tVar3 = aVar.d;
        if (tVar.compareTo(tVar3) <= 0) {
            if (tVar3.compareTo(tVar2) <= 0) {
                int i = u.f;
                int i2 = g.e0;
                this.f = (i * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + (o.y0(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
                this.f1501c = aVar;
                this.d = dVar;
                this.e = fVar;
                if (this.f1297a.a()) {
                    throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
                }
                this.f1298b = true;
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public int a() {
        return this.f1501c.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public long b(int i) {
        return this.f1501c.f1445a.o(i).f1493a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public void c(a aVar, int i) {
        a aVar2 = aVar;
        t o = this.f1501c.f1445a.o(i);
        aVar2.t.setText(o.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && o.equals(materialCalendarGridView.getAdapter2().f1496a)) {
            materialCalendarGridView.invalidate();
            u adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l : adapter2.f1498c) {
                adapter2.f(materialCalendarGridView, l.longValue());
            }
            d<?> dVar = adapter2.f1497b;
            if (dVar != null) {
                for (Long l2 : dVar.h()) {
                    adapter2.f(materialCalendarGridView, l2.longValue());
                }
                adapter2.f1498c = adapter2.f1497b.h();
            }
        } else {
            u uVar = new u(o, this.d, this.f1501c);
            materialCalendarGridView.setNumColumns(o.d);
            materialCalendarGridView.setAdapter((ListAdapter) uVar);
        }
        materialCalendarGridView.setOnItemClickListener(new v(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public a d(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (o.y0(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.m(-1, this.f));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }

    public t e(int i) {
        return this.f1501c.f1445a.o(i);
    }

    public int f(t tVar) {
        return this.f1501c.f1445a.p(tVar);
    }
}
