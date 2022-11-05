package a.l.b;

import a.l.b.j0;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f788a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f789b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f790c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList<String> l;
    public final ArrayList<String> m;
    public final boolean n;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(a.l.b.a aVar) {
        int size = aVar.f850a.size();
        this.f788a = new int[size * 5];
        if (aVar.g) {
            this.f789b = new ArrayList<>(size);
            this.f790c = new int[size];
            this.d = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                j0.a aVar2 = aVar.f850a.get(i);
                int i3 = i2 + 1;
                this.f788a[i2] = aVar2.f853a;
                ArrayList<String> arrayList = this.f789b;
                m mVar = aVar2.f854b;
                arrayList.add(mVar != null ? mVar.e : null);
                int[] iArr = this.f788a;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f855c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.e;
                iArr[i6] = aVar2.f;
                this.f790c[i] = aVar2.g.ordinal();
                this.d[i] = aVar2.h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.e = aVar.f;
            this.f = aVar.h;
            this.g = aVar.r;
            this.h = aVar.i;
            this.i = aVar.j;
            this.j = aVar.k;
            this.k = aVar.l;
            this.l = aVar.m;
            this.m = aVar.n;
            this.n = aVar.o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public b(Parcel parcel) {
        this.f788a = parcel.createIntArray();
        this.f789b = parcel.createStringArrayList();
        this.f790c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f788a);
        parcel.writeStringList(this.f789b);
        parcel.writeIntArray(this.f790c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }
}
