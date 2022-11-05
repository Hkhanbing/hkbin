package a.a.e;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0000a();

    /* renamed from: a  reason: collision with root package name */
    public final int f4a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f5b;

    /* renamed from: a.a.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0000a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(int i, Intent intent) {
        this.f4a = i;
        this.f5b = intent;
    }

    public a(Parcel parcel) {
        this.f4a = parcel.readInt();
        this.f5b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder f = b.a.a.a.a.f("ActivityResult{resultCode=");
        int i = this.f4a;
        if (i != -1) {
            str = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            str = "RESULT_OK";
        }
        f.append(str);
        f.append(", data=");
        f.append(this.f5b);
        f.append('}');
        return f.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4a);
        parcel.writeInt(this.f5b == null ? 0 : 1);
        Intent intent = this.f5b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
