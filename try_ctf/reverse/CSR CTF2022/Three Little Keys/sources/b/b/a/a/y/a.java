package b.b.a.a.y;

import a.e.h;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class a extends a.j.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0042a();

    /* renamed from: c  reason: collision with root package name */
    public final h<String, Bundle> f1615c;

    /* renamed from: b.b.a.a.y.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0042a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new a[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }
    }

    public a(Parcel parcel, ClassLoader classLoader, C0042a c0042a) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f1615c = new h<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f1615c.put(strArr[i], bundleArr[i]);
        }
    }

    public String toString() {
        StringBuilder f = b.a.a.a.a.f("ExtendableSavedState{");
        f.append(Integer.toHexString(System.identityHashCode(this)));
        f.append(" states=");
        f.append(this.f1615c);
        f.append("}");
        return f.toString();
    }

    @Override // a.j.a.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f701a, i);
        int i2 = this.f1615c.f358c;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.f1615c.h(i3);
            bundleArr[i3] = this.f1615c.k(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
