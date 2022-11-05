package b.b.a.a.m;

import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class u extends BaseAdapter {
    public static final int f = b0.e().getMaximum(4);

    /* renamed from: a  reason: collision with root package name */
    public final t f1496a;

    /* renamed from: b  reason: collision with root package name */
    public final d<?> f1497b;

    /* renamed from: c  reason: collision with root package name */
    public Collection<Long> f1498c;
    public c d;
    public final a e;

    public u(t tVar, d<?> dVar, a aVar) {
        this.f1496a = tVar;
        this.f1497b = dVar;
        this.e = aVar;
        this.f1498c = dVar.h();
    }

    public int a(int i) {
        return b() + (i - 1);
    }

    public int b() {
        return this.f1496a.m();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f1496a.m() || i > d()) {
            return null;
        }
        t tVar = this.f1496a;
        Calendar b2 = b0.b(tVar.f1493a);
        b2.set(5, (i - tVar.m()) + 1);
        return Long.valueOf(b2.getTimeInMillis());
    }

    public int d() {
        return (this.f1496a.m() + this.f1496a.e) - 1;
    }

    public final void e(TextView textView, long j) {
        b bVar;
        if (textView == null) {
            return;
        }
        boolean z = false;
        if (this.e.f1447c.i(j)) {
            textView.setEnabled(true);
            Iterator<Long> it = this.f1497b.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (b0.a(j) == b0.a(it.next().longValue())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                bVar = this.d.f1459b;
            } else {
                bVar = b0.d().getTimeInMillis() == j ? this.d.f1460c : this.d.f1458a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.d.g;
        }
        bVar.b(textView);
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (t.l(j).equals(this.f1496a)) {
            Calendar b2 = b0.b(this.f1496a.f1493a);
            b2.setTimeInMillis(j);
            e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(b2.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return b() + this.f1496a.e;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f1496a.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            android.content.Context r0 = r11.getContext()
            b.b.a.a.m.c r1 = r8.d
            if (r1 != 0) goto Lf
            b.b.a.a.m.c r1 = new b.b.a.a.m.c
            r1.<init>(r0)
            r8.d = r1
        Lf:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L27
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r0 = 2131492934(0x7f0c0046, float:1.8609334E38)
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r10 = r8.b()
            int r10 = r9 - r10
            if (r10 < 0) goto Lcf
            b.b.a.a.m.t r11 = r8.f1496a
            int r2 = r11.e
            if (r10 < r2) goto L37
            goto Lcf
        L37:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r11 = r0.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r11 = java.lang.String.format(r11, r4, r3)
            r0.setText(r11)
            b.b.a.a.m.t r11 = r8.f1496a
            java.util.Calendar r11 = r11.f1493a
            java.util.Calendar r11 = b.b.a.a.m.b0.b(r11)
            r3 = 5
            r11.set(r3, r10)
            long r10 = r11.getTimeInMillis()
            b.b.a.a.m.t r4 = r8.f1496a
            int r4 = r4.f1495c
            java.util.Calendar r5 = b.b.a.a.m.b0.d()
            r5.set(r3, r2)
            java.util.Calendar r5 = b.b.a.a.m.b0.b(r5)
            r6 = 2
            r5.get(r6)
            int r6 = r5.get(r2)
            r7 = 7
            r5.getMaximum(r7)
            r5.getActualMaximum(r3)
            r5.getTimeInMillis()
            java.lang.String r3 = "UTC"
            if (r4 != r6) goto La9
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.util.concurrent.atomic.AtomicReference<b.b.a.a.m.a0> r5 = b.b.a.a.m.b0.f1457a
            java.lang.String r5 = "MMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            goto Lc5
        La9:
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.util.concurrent.atomic.AtomicReference<b.b.a.a.m.a0> r5 = b.b.a.a.m.b0.f1457a
            java.lang.String r5 = "yMMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
        Lc5:
            r0.setContentDescription(r10)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto Ld7
        Lcf:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        Ld7:
            java.lang.Long r9 = r8.getItem(r9)
            if (r9 != 0) goto Lde
            goto Le5
        Lde:
            long r9 = r9.longValue()
            r8.e(r0, r9)
        Le5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.m.u.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
