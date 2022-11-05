package b.b.a.a.m;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f1465a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1466b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1467c;

    public f() {
        Calendar e = b0.e();
        this.f1465a = e;
        this.f1466b = e.getMaximum(7);
        this.f1467c = e.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1466b;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int i2 = this.f1466b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f1467c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f1465a;
        int i2 = i + this.f1467c;
        int i3 = this.f1466b;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.f1465a.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f1465a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
