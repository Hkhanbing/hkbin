package a.l.b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f833a;

    /* renamed from: b  reason: collision with root package name */
    public final String f834b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f835c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Bundle j;
    public final boolean k;
    public final int l;
    public Bundle m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<g0> {
        @Override // android.os.Parcelable.Creator
        public g0 createFromParcel(Parcel parcel) {
            return new g0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public g0[] newArray(int i) {
            return new g0[i];
        }
    }

    public g0(m mVar) {
        this.f833a = mVar.getClass().getName();
        this.f834b = mVar.e;
        this.f835c = mVar.m;
        this.d = mVar.v;
        this.e = mVar.w;
        this.f = mVar.x;
        this.g = mVar.A;
        this.h = mVar.l;
        this.i = mVar.z;
        this.j = mVar.f;
        this.k = mVar.y;
        this.l = mVar.M.ordinal();
    }

    public g0(Parcel parcel) {
        this.f833a = parcel.readString();
        this.f834b = parcel.readString();
        boolean z = true;
        this.f835c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readBundle();
        this.k = parcel.readInt() == 0 ? false : z;
        this.m = parcel.readBundle();
        this.l = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f833a);
        sb.append(" (");
        sb.append(this.f834b);
        sb.append(")}:");
        if (this.f835c) {
            sb.append(" fromLayout");
        }
        if (this.e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.e));
        }
        String str = this.f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f);
        }
        if (this.g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f833a);
        parcel.writeString(this.f834b);
        parcel.writeInt(this.f835c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.m);
        parcel.writeInt(this.l);
    }
}
