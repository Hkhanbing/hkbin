package b.b.a.a.m;

import android.os.Parcel;
import android.os.Parcelable;
import b.b.a.a.m.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public class e implements a.c {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f1464a;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return new e(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i) {
            return new e[i];
        }
    }

    public e(long j) {
        this.f1464a = j;
    }

    public e(long j, a aVar) {
        this.f1464a = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f1464a == ((e) obj).f1464a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f1464a)});
    }

    @Override // b.b.a.a.m.a.c
    public boolean i(long j) {
        return j >= this.f1464a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1464a);
    }
}
