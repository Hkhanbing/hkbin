package a.j.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f701a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f700b = new C0020a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a.j.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0020a extends a {
        public C0020a() {
            super((C0020a) null);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return a.f700b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new a[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f700b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(C0020a c0020a) {
        this.f701a = null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f701a = readParcelable == null ? f700b : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f701a = parcelable == f700b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f701a, i);
    }
}
