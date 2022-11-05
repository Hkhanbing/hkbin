package b.b.a.a.m;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public final class t implements Comparable<t>, Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f1493a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1494b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1495c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public t createFromParcel(Parcel parcel) {
            return t.k(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public t[] newArray(int i) {
            return new t[i];
        }
    }

    public t(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b2 = b0.b(calendar);
        this.f1493a = b2;
        this.f1494b = b2.get(2);
        this.f1495c = b2.get(1);
        this.d = b2.getMaximum(7);
        this.e = b2.getActualMaximum(5);
        this.f = b2.getTimeInMillis();
    }

    public static t k(int i, int i2) {
        Calendar e = b0.e();
        e.set(1, i);
        e.set(2, i2);
        return new t(e);
    }

    public static t l(long j) {
        Calendar e = b0.e();
        e.setTimeInMillis(j);
        return new t(e);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f1494b == tVar.f1494b && this.f1495c == tVar.f1495c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1494b), Integer.valueOf(this.f1495c)});
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(t tVar) {
        return this.f1493a.compareTo(tVar.f1493a);
    }

    public int m() {
        int firstDayOfWeek = this.f1493a.get(7) - this.f1493a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.d : firstDayOfWeek;
    }

    public String n() {
        if (this.g == null) {
            this.g = DateUtils.formatDateTime(null, this.f1493a.getTimeInMillis(), 8228);
        }
        return this.g;
    }

    public t o(int i) {
        Calendar b2 = b0.b(this.f1493a);
        b2.add(2, i);
        return new t(b2);
    }

    public int p(t tVar) {
        if (this.f1493a instanceof GregorianCalendar) {
            return (tVar.f1494b - this.f1494b) + ((tVar.f1495c - this.f1495c) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1495c);
        parcel.writeInt(this.f1494b);
    }
}
