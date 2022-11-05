package a.l.b;

import a.l.b.b0;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<g0> f820a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f821b;

    /* renamed from: c  reason: collision with root package name */
    public b[] f822c;
    public int d;
    public String e;
    public ArrayList<String> f;
    public ArrayList<Bundle> g;
    public ArrayList<b0.k> h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public d0 createFromParcel(Parcel parcel) {
            return new d0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public d0[] newArray(int i) {
            return new d0[i];
        }
    }

    public d0() {
        this.e = null;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
    }

    public d0(Parcel parcel) {
        this.e = null;
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.f820a = parcel.createTypedArrayList(g0.CREATOR);
        this.f821b = parcel.createStringArrayList();
        this.f822c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = parcel.createStringArrayList();
        this.g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.h = parcel.createTypedArrayList(b0.k.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f820a);
        parcel.writeStringList(this.f821b);
        parcel.writeTypedArray(this.f822c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.g);
        parcel.writeTypedList(this.h);
    }
}
