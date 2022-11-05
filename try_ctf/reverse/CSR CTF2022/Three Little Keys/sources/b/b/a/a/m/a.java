package b.b.a.a.m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0038a();

    /* renamed from: a  reason: collision with root package name */
    public final t f1445a;

    /* renamed from: b  reason: collision with root package name */
    public final t f1446b;

    /* renamed from: c  reason: collision with root package name */
    public final c f1447c;
    public t d;
    public final int e;
    public final int f;

    /* renamed from: b.b.a.a.m.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0038a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a((t) parcel.readParcelable(t.class.getClassLoader()), (t) parcel.readParcelable(t.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (t) parcel.readParcelable(t.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static final long e = b0.a(t.k(1900, 0).f);
        public static final long f = b0.a(t.k(2100, 11).f);

        /* renamed from: a  reason: collision with root package name */
        public long f1448a;

        /* renamed from: b  reason: collision with root package name */
        public long f1449b;

        /* renamed from: c  reason: collision with root package name */
        public Long f1450c;
        public c d;

        public b(a aVar) {
            this.f1448a = e;
            this.f1449b = f;
            this.d = new e(Long.MIN_VALUE);
            this.f1448a = aVar.f1445a.f;
            this.f1449b = aVar.f1446b.f;
            this.f1450c = Long.valueOf(aVar.d.f);
            this.d = aVar.f1447c;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        boolean i(long j);
    }

    public a(t tVar, t tVar2, c cVar, t tVar3, C0038a c0038a) {
        this.f1445a = tVar;
        this.f1446b = tVar2;
        this.d = tVar3;
        this.f1447c = cVar;
        if (tVar3 != null && tVar.f1493a.compareTo(tVar3.f1493a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (tVar3 != null && tVar3.f1493a.compareTo(tVar2.f1493a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f = tVar.p(tVar2) + 1;
        this.e = (tVar2.f1495c - tVar.f1495c) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1445a.equals(aVar.f1445a) && this.f1446b.equals(aVar.f1446b) && Objects.equals(this.d, aVar.d) && this.f1447c.equals(aVar.f1447c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1445a, this.f1446b, this.d, this.f1447c});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1445a, 0);
        parcel.writeParcelable(this.f1446b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.f1447c, 0);
    }
}
