package b.b.a.a.m;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class d0 extends RecyclerView.d<a> {

    /* renamed from: c  reason: collision with root package name */
    public final g<?> f1463c;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.z {
        public final TextView t;

        public a(TextView textView) {
            super(textView);
            this.t = textView;
        }
    }

    public d0(g<?> gVar) {
        this.f1463c = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public int a() {
        return this.f1463c.W.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public void c(a aVar, int i) {
        a aVar2 = aVar;
        int i2 = this.f1463c.W.f1445a.f1495c + i;
        String string = aVar2.t.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar2.t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        aVar2.t.setContentDescription(String.format(string, Integer.valueOf(i2)));
        c cVar = this.f1463c.Z;
        Calendar d = b0.d();
        b bVar = d.get(1) == i2 ? cVar.f : cVar.d;
        for (Long l : this.f1463c.V.h()) {
            d.setTimeInMillis(l.longValue());
            if (d.get(1) == i2) {
                bVar = cVar.e;
            }
        }
        bVar.b(aVar2.t);
        aVar2.t.setOnClickListener(new c0(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public a d(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    public int e(int i) {
        return i - this.f1463c.W.f1445a.f1495c;
    }
}
