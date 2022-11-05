package androidx.recyclerview.widget;

import a.h.j.d0.d;
import a.p.b.m;
import a.p.b.n;
import a.p.b.o;
import a.p.b.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.l implements RecyclerView.v.b {
    public BitSet A;
    public boolean F;
    public boolean G;
    public e H;
    public int I;
    public int[] M;
    public int r;
    public f[] s;
    public s t;
    public s u;
    public int v;
    public int w;
    public final n x;
    public boolean y;
    public boolean z = false;
    public int B = -1;
    public int C = Integer.MIN_VALUE;
    public d D = new d();
    public int E = 2;
    public final Rect J = new Rect();
    public final b K = new b();
    public boolean L = true;
    public final Runnable N = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.a1();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1342a;

        /* renamed from: b  reason: collision with root package name */
        public int f1343b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1344c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            b();
        }

        public void a() {
            this.f1343b = this.f1344c ? StaggeredGridLayoutManager.this.t.g() : StaggeredGridLayoutManager.this.t.k();
        }

        public void b() {
            this.f1342a = -1;
            this.f1343b = Integer.MIN_VALUE;
            this.f1344c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.m {
        public f e;

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f1345a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f1346b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0035a();

            /* renamed from: a  reason: collision with root package name */
            public int f1347a;

            /* renamed from: b  reason: collision with root package name */
            public int f1348b;

            /* renamed from: c  reason: collision with root package name */
            public int[] f1349c;
            public boolean d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0035a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f1347a = parcel.readInt();
                this.f1348b = parcel.readInt();
                this.d = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1349c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder f = b.a.a.a.a.f("FullSpanItem{mPosition=");
                f.append(this.f1347a);
                f.append(", mGapDir=");
                f.append(this.f1348b);
                f.append(", mHasUnwantedGapAfter=");
                f.append(this.d);
                f.append(", mGapPerSpan=");
                f.append(Arrays.toString(this.f1349c));
                f.append('}');
                return f.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1347a);
                parcel.writeInt(this.f1348b);
                parcel.writeInt(this.d ? 1 : 0);
                int[] iArr = this.f1349c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f1349c);
            }
        }

        public void a() {
            int[] iArr = this.f1345a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1346b = null;
        }

        public void b(int i) {
            int[] iArr = this.f1345a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f1345a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i < iArr.length) {
            } else {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f1345a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1345a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public a c(int i) {
            List<a> list = this.f1346b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1346b.get(size);
                if (aVar.f1347a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f1345a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r5 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f1346b
                if (r0 != 0) goto L10
            Le:
                r0 = r1
                goto L46
            L10:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.c(r5)
                if (r0 == 0) goto L1b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f1346b
                r2.remove(r0)
            L1b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f1346b
                int r0 = r0.size()
                r2 = 0
            L22:
                if (r2 >= r0) goto L34
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f1346b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f1347a
                if (r3 < r5) goto L31
                goto L35
            L31:
                int r2 = r2 + 1
                goto L22
            L34:
                r2 = r1
            L35:
                if (r2 == r1) goto Le
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f1346b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f1346b
                r3.remove(r2)
                int r0 = r0.f1347a
            L46:
                if (r0 != r1) goto L52
                int[] r0 = r4.f1345a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f1345a
                int r5 = r5.length
                return r5
            L52:
                int[] r2 = r4.f1345a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.d(int):int");
        }

        public void e(int i, int i2) {
            int[] iArr = this.f1345a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.f1345a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f1345a, i, i3, -1);
            List<a> list = this.f1346b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1346b.get(size);
                int i4 = aVar.f1347a;
                if (i4 >= i) {
                    aVar.f1347a = i4 + i2;
                }
            }
        }

        public void f(int i, int i2) {
            int[] iArr = this.f1345a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            b(i3);
            int[] iArr2 = this.f1345a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f1345a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List<a> list = this.f1346b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1346b.get(size);
                int i4 = aVar.f1347a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f1346b.remove(size);
                    } else {
                        aVar.f1347a = i4 - i2;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f1350a;

        /* renamed from: b  reason: collision with root package name */
        public int f1351b;

        /* renamed from: c  reason: collision with root package name */
        public int f1352c;
        public int[] d;
        public int e;
        public int[] f;
        public List<d.a> g;
        public boolean h;
        public boolean i;
        public boolean j;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f1350a = parcel.readInt();
            this.f1351b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1352c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1 ? true : z;
            this.g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f1352c = eVar.f1352c;
            this.f1350a = eVar.f1350a;
            this.f1351b = eVar.f1351b;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.g = eVar.g;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1350a);
            parcel.writeInt(this.f1351b);
            parcel.writeInt(this.f1352c);
            if (this.f1352c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f1353a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1354b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f1355c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public f(int i) {
            this.e = i;
        }

        public void a(View view) {
            c j = j(view);
            j.e = this;
            this.f1353a.add(view);
            this.f1355c = Integer.MIN_VALUE;
            if (this.f1353a.size() == 1) {
                this.f1354b = Integer.MIN_VALUE;
            }
            if (j.c() || j.b()) {
                this.d = StaggeredGridLayoutManager.this.t.c(view) + this.d;
            }
        }

        public void b() {
            ArrayList<View> arrayList = this.f1353a;
            View view = arrayList.get(arrayList.size() - 1);
            c j = j(view);
            this.f1355c = StaggeredGridLayoutManager.this.t.b(view);
            Objects.requireNonNull(j);
        }

        public void c() {
            View view = this.f1353a.get(0);
            c j = j(view);
            this.f1354b = StaggeredGridLayoutManager.this.t.e(view);
            Objects.requireNonNull(j);
        }

        public void d() {
            this.f1353a.clear();
            this.f1354b = Integer.MIN_VALUE;
            this.f1355c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public int e() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.y) {
                i = this.f1353a.size() - 1;
                size = -1;
            } else {
                i = 0;
                size = this.f1353a.size();
            }
            return g(i, size, true);
        }

        public int f() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.y) {
                size = 0;
                i = this.f1353a.size();
            } else {
                size = this.f1353a.size() - 1;
                i = -1;
            }
            return g(size, i, true);
        }

        public int g(int i, int i2, boolean z) {
            int k = StaggeredGridLayoutManager.this.t.k();
            int g = StaggeredGridLayoutManager.this.t.g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f1353a.get(i);
                int e = StaggeredGridLayoutManager.this.t.e(view);
                int b2 = StaggeredGridLayoutManager.this.t.b(view);
                boolean z2 = false;
                boolean z3 = !z ? e < g : e <= g;
                if (!z ? b2 > k : b2 >= k) {
                    z2 = true;
                }
                if (z3 && z2 && (e < k || b2 > g)) {
                    return StaggeredGridLayoutManager.this.R(view);
                }
                i += i3;
            }
            return -1;
        }

        public int h(int i) {
            int i2 = this.f1355c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1353a.size() == 0) {
                return i;
            }
            b();
            return this.f1355c;
        }

        public View i(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f1353a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f1353a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.y && staggeredGridLayoutManager.R(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.y && staggeredGridLayoutManager2.R(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f1353a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f1353a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.y && staggeredGridLayoutManager3.R(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.y && staggeredGridLayoutManager4.R(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public c j(View view) {
            return (c) view.getLayoutParams();
        }

        public int k(int i) {
            int i2 = this.f1354b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1353a.size() == 0) {
                return i;
            }
            c();
            return this.f1354b;
        }

        public void l() {
            int size = this.f1353a.size();
            View remove = this.f1353a.remove(size - 1);
            c j = j(remove);
            j.e = null;
            if (j.c() || j.b()) {
                this.d -= StaggeredGridLayoutManager.this.t.c(remove);
            }
            if (size == 1) {
                this.f1354b = Integer.MIN_VALUE;
            }
            this.f1355c = Integer.MIN_VALUE;
        }

        public void m() {
            View remove = this.f1353a.remove(0);
            c j = j(remove);
            j.e = null;
            if (this.f1353a.size() == 0) {
                this.f1355c = Integer.MIN_VALUE;
            }
            if (j.c() || j.b()) {
                this.d -= StaggeredGridLayoutManager.this.t.c(remove);
            }
            this.f1354b = Integer.MIN_VALUE;
        }

        public void n(View view) {
            c j = j(view);
            j.e = this;
            this.f1353a.add(0, view);
            this.f1354b = Integer.MIN_VALUE;
            if (this.f1353a.size() == 1) {
                this.f1355c = Integer.MIN_VALUE;
            }
            if (j.c() || j.b()) {
                this.d = StaggeredGridLayoutManager.this.t.c(view) + this.d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.r = -1;
        this.y = false;
        RecyclerView.l.d S = RecyclerView.l.S(context, attributeSet, i, i2);
        int i3 = S.f1310a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        d(null);
        if (i3 != this.v) {
            this.v = i3;
            s sVar = this.t;
            this.t = this.u;
            this.u = sVar;
            K0();
        }
        int i4 = S.f1311b;
        d(null);
        if (i4 != this.r) {
            this.D.a();
            K0();
            this.r = i4;
            this.A = new BitSet(this.r);
            this.s = new f[this.r];
            for (int i5 = 0; i5 < this.r; i5++) {
                this.s[i5] = new f(i5);
            }
            K0();
        }
        boolean z = S.f1312c;
        d(null);
        e eVar = this.H;
        if (eVar != null && eVar.h != z) {
            eVar.h = z;
        }
        this.y = z;
        K0();
        this.x = new n();
        this.t = s.a(this, this.v);
        this.u = s.a(this, 1 - this.v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int A(RecyclerView.r rVar, RecyclerView.w wVar) {
        return this.v == 1 ? this.r : super.A(rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public Parcelable A0() {
        int k;
        int k2;
        int[] iArr;
        e eVar = this.H;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.h = this.y;
        eVar2.i = this.F;
        eVar2.j = this.G;
        d dVar = this.D;
        if (dVar == null || (iArr = dVar.f1345a) == null) {
            eVar2.e = 0;
        } else {
            eVar2.f = iArr;
            eVar2.e = iArr.length;
            eVar2.g = dVar.f1346b;
        }
        int i = -1;
        if (y() > 0) {
            eVar2.f1350a = this.F ? k1() : j1();
            View f1 = this.z ? f1(true) : g1(true);
            if (f1 != null) {
                i = R(f1);
            }
            eVar2.f1351b = i;
            int i2 = this.r;
            eVar2.f1352c = i2;
            eVar2.d = new int[i2];
            for (int i3 = 0; i3 < this.r; i3++) {
                if (this.F) {
                    k = this.s[i3].h(Integer.MIN_VALUE);
                    if (k != Integer.MIN_VALUE) {
                        k2 = this.t.g();
                        k -= k2;
                        eVar2.d[i3] = k;
                    } else {
                        eVar2.d[i3] = k;
                    }
                } else {
                    k = this.s[i3].k(Integer.MIN_VALUE);
                    if (k != Integer.MIN_VALUE) {
                        k2 = this.t.k();
                        k -= k2;
                        eVar2.d[i3] = k;
                    } else {
                        eVar2.d[i3] = k;
                    }
                }
            }
        } else {
            eVar2.f1350a = -1;
            eVar2.f1351b = -1;
            eVar2.f1352c = 0;
        }
        return eVar2;
    }

    public final void A1(int i, int i2) {
        for (int i3 = 0; i3 < this.r; i3++) {
            if (!this.s[i3].f1353a.isEmpty()) {
                C1(this.s[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void B0(int i) {
        if (i == 0) {
            a1();
        }
    }

    public final void B1(int i, RecyclerView.w wVar) {
        int i2;
        int i3;
        int i4;
        n nVar = this.x;
        boolean z = false;
        nVar.f1055b = 0;
        nVar.f1056c = i;
        RecyclerView.v vVar = this.g;
        if (!(vVar != null && vVar.e) || (i4 = wVar.f1332a) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.z == (i4 < i)) {
                i2 = this.t.l();
                i3 = 0;
            } else {
                i3 = this.t.l();
                i2 = 0;
            }
        }
        RecyclerView recyclerView = this.f1306b;
        if (recyclerView != null && recyclerView.g) {
            this.x.f = this.t.k() - i3;
            this.x.g = this.t.g() + i2;
        } else {
            this.x.g = this.t.f() + i2;
            this.x.f = -i3;
        }
        n nVar2 = this.x;
        nVar2.h = false;
        nVar2.f1054a = true;
        if (this.t.i() == 0 && this.t.f() == 0) {
            z = true;
        }
        nVar2.i = z;
    }

    public final void C1(f fVar, int i, int i2) {
        int i3 = fVar.d;
        if (i == -1) {
            int i4 = fVar.f1354b;
            if (i4 == Integer.MIN_VALUE) {
                fVar.c();
                i4 = fVar.f1354b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = fVar.f1355c;
            if (i5 == Integer.MIN_VALUE) {
                fVar.b();
                i5 = fVar.f1355c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.A.set(fVar.e, false);
    }

    public final int D1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int L0(int i, RecyclerView.r rVar, RecyclerView.w wVar) {
        return y1(i, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void M0(int i) {
        e eVar = this.H;
        if (eVar != null && eVar.f1350a != i) {
            eVar.d = null;
            eVar.f1352c = 0;
            eVar.f1350a = -1;
            eVar.f1351b = -1;
        }
        this.B = i;
        this.C = Integer.MIN_VALUE;
        K0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int N0(int i, RecyclerView.r rVar, RecyclerView.w wVar) {
        return y1(i, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void Q0(Rect rect, int i, int i2) {
        int h;
        int h2;
        int P = P() + O();
        int N = N() + Q();
        if (this.v == 1) {
            h2 = RecyclerView.l.h(i2, rect.height() + N, L());
            h = RecyclerView.l.h(i, (this.w * this.r) + P, M());
        } else {
            h = RecyclerView.l.h(i, rect.width() + P, M());
            h2 = RecyclerView.l.h(i2, (this.w * this.r) + N, L());
        }
        this.f1306b.setMeasuredDimension(h, h2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int T(RecyclerView.r rVar, RecyclerView.w wVar) {
        return this.v == 0 ? this.r : super.T(rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean W() {
        return this.E != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void W0(RecyclerView recyclerView, RecyclerView.w wVar, int i) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1326a = i;
        X0(oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean Y0() {
        return this.H == null;
    }

    public final int Z0(int i) {
        if (y() == 0) {
            return this.z ? 1 : -1;
        }
        return (i < j1()) != this.z ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v.b
    public PointF a(int i) {
        int Z0 = Z0(i);
        PointF pointF = new PointF();
        if (Z0 == 0) {
            return null;
        }
        if (this.v == 0) {
            pointF.x = Z0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = Z0;
        }
        return pointF;
    }

    public boolean a1() {
        int j1;
        if (y() != 0 && this.E != 0 && this.i) {
            if (this.z) {
                j1 = k1();
                j1();
            } else {
                j1 = j1();
                k1();
            }
            if (j1 == 0 && o1() != null) {
                this.D.a();
                this.h = true;
                K0();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void b0(int i) {
        super.b0(i);
        for (int i2 = 0; i2 < this.r; i2++) {
            f fVar = this.s[i2];
            int i3 = fVar.f1354b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f1354b = i3 + i;
            }
            int i4 = fVar.f1355c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f1355c = i4 + i;
            }
        }
    }

    public final int b1(RecyclerView.w wVar) {
        if (y() == 0) {
            return 0;
        }
        return a.h.b.b.k(wVar, this.t, g1(!this.L), f1(!this.L), this, this.L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void c0(int i) {
        super.c0(i);
        for (int i2 = 0; i2 < this.r; i2++) {
            f fVar = this.s[i2];
            int i3 = fVar.f1354b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.f1354b = i3 + i;
            }
            int i4 = fVar.f1355c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f1355c = i4 + i;
            }
        }
    }

    public final int c1(RecyclerView.w wVar) {
        if (y() == 0) {
            return 0;
        }
        return a.h.b.b.l(wVar, this.t, g1(!this.L), f1(!this.L), this, this.L, this.z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void d(String str) {
        RecyclerView recyclerView;
        if (this.H != null || (recyclerView = this.f1306b) == null) {
            return;
        }
        recyclerView.i(str);
    }

    public final int d1(RecyclerView.w wVar) {
        if (y() == 0) {
            return 0;
        }
        return a.h.b.b.m(wVar, this.t, g1(!this.L), f1(!this.L), this, this.L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean e() {
        return this.v == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v42 */
    public final int e1(RecyclerView.r rVar, n nVar, RecyclerView.w wVar) {
        f fVar;
        boolean z;
        int z2;
        boolean z3;
        int z4;
        int k;
        int c2;
        int k2;
        int c3;
        int i;
        int i2;
        int i3;
        boolean z5;
        int i4;
        int i5;
        int i6;
        boolean z6 = false;
        this.A.set(0, this.r, true);
        int i7 = this.x.i ? nVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : nVar.e == 1 ? nVar.g + nVar.f1055b : nVar.f - nVar.f1055b;
        A1(nVar.e, i7);
        int g = this.z ? this.t.g() : this.t.k();
        boolean z7 = false;
        while (true) {
            int i8 = nVar.f1056c;
            if (!((i8 < 0 || i8 >= wVar.b()) ? z6 : true) || (!this.x.i && this.A.isEmpty())) {
                break;
            }
            View view = rVar.j(nVar.f1056c, z6, Long.MAX_VALUE).f1338a;
            nVar.f1056c += nVar.d;
            c cVar = (c) view.getLayoutParams();
            int a2 = cVar.a();
            int[] iArr = this.D.f1345a;
            int i9 = (iArr == null || a2 >= iArr.length) ? -1 : iArr[a2];
            if (i9 == -1 ? true : z6) {
                if (s1(nVar.e)) {
                    i4 = -1;
                    i6 = -1;
                    i5 = this.r - 1;
                } else {
                    i4 = this.r;
                    i5 = z6;
                    i6 = 1;
                }
                f fVar2 = null;
                if (nVar.e == 1) {
                    int k3 = this.t.k();
                    int i10 = Integer.MAX_VALUE;
                    for (int i11 = i5; i11 != i4; i11 += i6) {
                        f fVar3 = this.s[i11];
                        int h = fVar3.h(k3);
                        if (h < i10) {
                            fVar2 = fVar3;
                            i10 = h;
                        }
                    }
                } else {
                    int g2 = this.t.g();
                    int i12 = Integer.MIN_VALUE;
                    for (int i13 = i5; i13 != i4; i13 += i6) {
                        f fVar4 = this.s[i13];
                        int k4 = fVar4.k(g2);
                        if (k4 > i12) {
                            fVar2 = fVar4;
                            i12 = k4;
                        }
                    }
                }
                fVar = fVar2;
                d dVar = this.D;
                dVar.b(a2);
                dVar.f1345a[a2] = fVar.e;
            } else {
                fVar = this.s[i9];
            }
            f fVar5 = fVar;
            cVar.e = fVar5;
            if (nVar.e == 1) {
                z = false;
                c(view, -1, false);
            } else {
                z = false;
                c(view, 0, false);
            }
            if (this.v == 1) {
                int i14 = this.w;
                int i15 = this.n;
                int i16 = ((ViewGroup.MarginLayoutParams) cVar).width;
                int i17 = z ? 1 : 0;
                int i18 = z ? 1 : 0;
                z2 = RecyclerView.l.z(i14, i15, i17, i16, z);
                z4 = RecyclerView.l.z(this.q, this.o, N() + Q(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
                z3 = false;
            } else {
                z2 = RecyclerView.l.z(this.p, this.n, P() + O(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                z3 = false;
                z4 = RecyclerView.l.z(this.w, this.o, 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            }
            q1(view, z2, z4, z3);
            if (nVar.e == 1) {
                c2 = fVar5.h(g);
                k = this.t.c(view) + c2;
            } else {
                k = fVar5.k(g);
                c2 = k - this.t.c(view);
            }
            int i19 = nVar.e;
            f fVar6 = cVar.e;
            if (i19 == 1) {
                fVar6.a(view);
            } else {
                fVar6.n(view);
            }
            if (!p1() || this.v != 1) {
                k2 = this.u.k() + (fVar5.e * this.w);
                c3 = this.u.c(view) + k2;
            } else {
                c3 = this.u.g() - (((this.r - 1) - fVar5.e) * this.w);
                k2 = c3 - this.u.c(view);
            }
            if (this.v == 1) {
                i2 = c3;
                i = k;
                i3 = k2;
                k2 = c2;
            } else {
                i = c3;
                i2 = k;
                i3 = c2;
            }
            a0(view, i3, k2, i2, i);
            C1(fVar5, this.x.e, i7);
            u1(rVar, this.x);
            if (!this.x.h || !view.hasFocusable()) {
                z5 = false;
            } else {
                z5 = false;
                this.A.set(fVar5.e, false);
            }
            z6 = z5;
            z7 = true;
        }
        boolean z8 = z6;
        if (!z7) {
            u1(rVar, this.x);
        }
        int k5 = this.x.e == -1 ? this.t.k() - m1(this.t.k()) : l1(this.t.g()) - this.t.g();
        return k5 > 0 ? Math.min(nVar.f1055b, k5) : z8 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f() {
        return this.v == 1;
    }

    public View f1(boolean z) {
        int k = this.t.k();
        int g = this.t.g();
        View view = null;
        for (int y = y() - 1; y >= 0; y--) {
            View x = x(y);
            int e2 = this.t.e(x);
            int b2 = this.t.b(x);
            if (b2 > k && e2 < g) {
                if (b2 <= g || !z) {
                    return x;
                }
                if (view == null) {
                    view = x;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.m mVar) {
        return mVar instanceof c;
    }

    public View g1(boolean z) {
        int k = this.t.k();
        int g = this.t.g();
        int y = y();
        View view = null;
        for (int i = 0; i < y; i++) {
            View x = x(i);
            int e2 = this.t.e(x);
            if (this.t.b(x) > k && e2 < g) {
                if (e2 >= k || !z) {
                    return x;
                }
                if (view == null) {
                    view = x;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void h0(RecyclerView recyclerView, RecyclerView.r rVar) {
        g0();
        Runnable runnable = this.N;
        RecyclerView recyclerView2 = this.f1306b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.r; i++) {
            this.s[i].d();
        }
        recyclerView.requestLayout();
    }

    public final void h1(RecyclerView.r rVar, RecyclerView.w wVar, boolean z) {
        int g;
        int l1 = l1(Integer.MIN_VALUE);
        if (l1 != Integer.MIN_VALUE && (g = this.t.g() - l1) > 0) {
            int i = g - (-y1(-g, rVar, wVar));
            if (!z || i <= 0) {
                return;
            }
            this.t.p(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void i(int i, int i2, RecyclerView.w wVar, RecyclerView.l.c cVar) {
        int h;
        int i3;
        if (this.v != 0) {
            i = i2;
        }
        if (y() == 0 || i == 0) {
            return;
        }
        t1(i, wVar);
        int[] iArr = this.M;
        if (iArr == null || iArr.length < this.r) {
            this.M = new int[this.r];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.r; i5++) {
            n nVar = this.x;
            if (nVar.d == -1) {
                h = nVar.f;
                i3 = this.s[i5].k(h);
            } else {
                h = this.s[i5].h(nVar.g);
                i3 = this.x.g;
            }
            int i6 = h - i3;
            if (i6 >= 0) {
                this.M[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.M, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = this.x.f1056c;
            if (!(i8 >= 0 && i8 < wVar.b())) {
                return;
            }
            ((m.b) cVar).a(this.x.f1056c, this.M[i7]);
            n nVar2 = this.x;
            nVar2.f1056c += nVar2.d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
        if (r8.v == 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:
        if (r8.v == 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004b, code lost:
        if (p1() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0057, code lost:
        if (p1() == false) goto L113;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View i0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.r r11, androidx.recyclerview.widget.RecyclerView.w r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.i0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    public final void i1(RecyclerView.r rVar, RecyclerView.w wVar, boolean z) {
        int k;
        int m1 = m1(Integer.MAX_VALUE);
        if (m1 != Integer.MAX_VALUE && (k = m1 - this.t.k()) > 0) {
            int y1 = k - y1(k, rVar, wVar);
            if (!z || y1 <= 0) {
                return;
            }
            this.t.p(-y1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.r rVar = this.f1306b.f1293b;
        k0(accessibilityEvent);
        if (y() > 0) {
            View g1 = g1(false);
            View f1 = f1(false);
            if (g1 == null || f1 == null) {
                return;
            }
            int R = R(g1);
            int R2 = R(f1);
            if (R < R2) {
                accessibilityEvent.setFromIndex(R);
                accessibilityEvent.setToIndex(R2);
                return;
            }
            accessibilityEvent.setFromIndex(R2);
            accessibilityEvent.setToIndex(R);
        }
    }

    public int j1() {
        if (y() == 0) {
            return 0;
        }
        return R(x(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int k(RecyclerView.w wVar) {
        return b1(wVar);
    }

    public int k1() {
        int y = y();
        if (y == 0) {
            return 0;
        }
        return R(x(y - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int l(RecyclerView.w wVar) {
        return c1(wVar);
    }

    public final int l1(int i) {
        int h = this.s[0].h(i);
        for (int i2 = 1; i2 < this.r; i2++) {
            int h2 = this.s[i2].h(i);
            if (h2 > h) {
                h = h2;
            }
        }
        return h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int m(RecyclerView.w wVar) {
        return d1(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void m0(RecyclerView.r rVar, RecyclerView.w wVar, View view, a.h.j.d0.d dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            l0(view, dVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.v == 0) {
            f fVar = cVar.e;
            i3 = fVar == null ? -1 : fVar.e;
            i4 = 1;
            i = -1;
            i2 = -1;
        } else {
            f fVar2 = cVar.e;
            i = fVar2 == null ? -1 : fVar2.e;
            i2 = 1;
            i3 = -1;
            i4 = -1;
        }
        dVar.i(d.c.a(i3, i4, i, i2, false, false));
    }

    public final int m1(int i) {
        int k = this.s[0].k(i);
        for (int i2 = 1; i2 < this.r; i2++) {
            int k2 = this.s[i2].k(i);
            if (k2 < k) {
                k = k2;
            }
        }
        return k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int n(RecyclerView.w wVar) {
        return b1(wVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n1(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.z
            if (r0 == 0) goto L9
            int r0 = r6.k1()
            goto Ld
        L9:
            int r0 = r6.j1()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.D
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.D
            r7.e(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.f(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.e(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.z
            if (r7 == 0) goto L4d
            int r7 = r6.j1()
            goto L51
        L4d:
            int r7 = r6.k1()
        L51:
            if (r3 > r7) goto L56
            r6.K0()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.n1(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int o(RecyclerView.w wVar) {
        return c1(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void o0(RecyclerView recyclerView, int i, int i2) {
        n1(i, i2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
        if (r10 == r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (r10 == r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View o1() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o1():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int p(RecyclerView.w wVar) {
        return d1(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void p0(RecyclerView recyclerView) {
        this.D.a();
        K0();
    }

    public boolean p1() {
        return K() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void q0(RecyclerView recyclerView, int i, int i2, int i3) {
        n1(i, i2, 8);
    }

    public final void q1(View view, int i, int i2, boolean z) {
        Rect rect = this.J;
        RecyclerView recyclerView = this.f1306b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.L(view));
        }
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect2 = this.J;
        int D1 = D1(i, i3 + rect2.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect2.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect3 = this.J;
        int D12 = D1(i2, i4 + rect3.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect3.bottom);
        if (z ? V0(view, D1, D12, cVar) : T0(view, D1, D12, cVar)) {
            view.measure(D1, D12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void r0(RecyclerView recyclerView, int i, int i2) {
        n1(i, i2, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x03f4, code lost:
        if (a1() != false) goto L259;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r1(androidx.recyclerview.widget.RecyclerView.r r12, androidx.recyclerview.widget.RecyclerView.w r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, boolean):void");
    }

    public final boolean s1(int i) {
        if (this.v == 0) {
            return (i == -1) != this.z;
        }
        return ((i == -1) == this.z) == p1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void t0(RecyclerView recyclerView, int i, int i2, Object obj) {
        n1(i, i2, 4);
    }

    public void t1(int i, RecyclerView.w wVar) {
        int i2;
        int j1;
        if (i > 0) {
            j1 = k1();
            i2 = 1;
        } else {
            i2 = -1;
            j1 = j1();
        }
        this.x.f1054a = true;
        B1(j1, wVar);
        z1(i2);
        n nVar = this.x;
        nVar.f1056c = j1 + nVar.d;
        nVar.f1055b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m u() {
        return this.v == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u0(RecyclerView.r rVar, RecyclerView.w wVar) {
        r1(rVar, wVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r6.e == (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u1(androidx.recyclerview.widget.RecyclerView.r r5, a.p.b.n r6) {
        /*
            r4 = this;
            boolean r0 = r6.f1054a
            if (r0 == 0) goto L7c
            boolean r0 = r6.i
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f1055b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.e
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.g
        L15:
            r4.v1(r5, r6)
            goto L7c
        L19:
            int r6 = r6.f
        L1b:
            r4.w1(r5, r6)
            goto L7c
        L1f:
            int r0 = r6.e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.s
            r1 = r1[r2]
            int r1 = r1.k(r0)
        L2f:
            int r2 = r4.r
            if (r3 >= r2) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.s
            r2 = r2[r3]
            int r2 = r2.k(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.g
            int r6 = r6.f1055b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.s
            r1 = r1[r2]
            int r1 = r1.h(r0)
        L5a:
            int r2 = r4.r
            if (r3 >= r2) goto L6c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.s
            r2 = r2[r3]
            int r2 = r2.h(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.g
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f
            int r6 = r6.f1055b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.u1(androidx.recyclerview.widget.RecyclerView$r, a.p.b.n):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m v(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void v0(RecyclerView.w wVar) {
        this.B = -1;
        this.C = Integer.MIN_VALUE;
        this.H = null;
        this.K.b();
    }

    public final void v1(RecyclerView.r rVar, int i) {
        for (int y = y() - 1; y >= 0; y--) {
            View x = x(y);
            if (this.t.e(x) < i || this.t.o(x) < i) {
                return;
            }
            c cVar = (c) x.getLayoutParams();
            Objects.requireNonNull(cVar);
            if (cVar.e.f1353a.size() == 1) {
                return;
            }
            cVar.e.l();
            G0(x, rVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.m w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void w1(RecyclerView.r rVar, int i) {
        while (y() > 0) {
            View x = x(0);
            if (this.t.b(x) > i || this.t.n(x) > i) {
                return;
            }
            c cVar = (c) x.getLayoutParams();
            Objects.requireNonNull(cVar);
            if (cVar.e.f1353a.size() == 1) {
                return;
            }
            cVar.e.m();
            G0(x, rVar);
        }
    }

    public final void x1() {
        this.z = (this.v == 1 || !p1()) ? this.y : !this.y;
    }

    public int y1(int i, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (y() == 0 || i == 0) {
            return 0;
        }
        t1(i, wVar);
        int e1 = e1(rVar, this.x, wVar);
        if (this.x.f1055b >= e1) {
            i = i < 0 ? -e1 : e1;
        }
        this.t.p(-i);
        this.F = this.z;
        n nVar = this.x;
        nVar.f1055b = 0;
        u1(rVar, nVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void z0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.H = (e) parcelable;
            K0();
        }
    }

    public final void z1(int i) {
        n nVar = this.x;
        nVar.e = i;
        int i2 = 1;
        if (this.z != (i == -1)) {
            i2 = -1;
        }
        nVar.d = i2;
    }
}
