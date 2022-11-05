package a.l.b;

import a.l.b.j0;
import a.l.b.m;
import a.l.b.q0;
import a.n.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentContainerView;
import de.cybersecurityrumble.threelittlekeys.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class b0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public ArrayList<a.l.b.a> F;
    public ArrayList<Boolean> G;
    public ArrayList<a.l.b.m> H;
    public ArrayList<n> I;
    public e0 J;

    /* renamed from: b  reason: collision with root package name */
    public boolean f792b;
    public ArrayList<a.l.b.a> d;
    public ArrayList<a.l.b.m> e;
    public OnBackPressedDispatcher g;
    public y<?> q;
    public v r;
    public a.l.b.m s;
    public a.l.b.m t;
    public a.a.e.c<Intent> w;
    public a.a.e.c<Object> x;
    public a.a.e.c<String[]> y;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<l> f791a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final i0 f793c = new i0();
    public final z f = new z(this);
    public final a.a.b h = new c(false);
    public final AtomicInteger i = new AtomicInteger();
    public final Map<String, Bundle> j = Collections.synchronizedMap(new HashMap());
    public final Map<String, Object> k = Collections.synchronizedMap(new HashMap());
    public Map<a.l.b.m, HashSet<a.h.f.a>> l = Collections.synchronizedMap(new HashMap());
    public final q0.a m = new d();
    public final a0 n = new a0(this);
    public final CopyOnWriteArrayList<f0> o = new CopyOnWriteArrayList<>();
    public int p = -1;
    public x u = new e();
    public y0 v = new f(this);
    public ArrayDeque<k> z = new ArrayDeque<>();
    public Runnable K = new g();

    /* loaded from: classes.dex */
    public class a implements a.a.e.b<a.a.e.a> {
        public a() {
        }

        @Override // a.a.e.b
        public void a(a.a.e.a aVar) {
            StringBuilder sb;
            a.a.e.a aVar2 = aVar;
            k pollFirst = b0.this.z.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
            } else {
                String str = pollFirst.f802a;
                int i = pollFirst.f803b;
                a.l.b.m e = b0.this.f793c.e(str);
                if (e != null) {
                    e.G(i, aVar2.f4a, aVar2.f5b);
                    return;
                }
                sb = new StringBuilder();
                sb.append("Intent Sender result delivered for unknown Fragment ");
                sb.append(str);
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public class b implements a.a.e.b<Map<String, Boolean>> {
        public b() {
        }

        @Override // a.a.e.b
        @SuppressLint({"SyntheticAccessor"})
        public void a(Map<String, Boolean> map) {
            String d;
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            k pollFirst = b0.this.z.pollFirst();
            if (pollFirst == null) {
                d = "No permissions were requested for " + this;
            } else {
                String str = pollFirst.f802a;
                a.l.b.m e = b0.this.f793c.e(str);
                if (e != null) {
                    e.Y();
                    return;
                }
                d = b.a.a.a.a.d("Permission request result delivered for unknown Fragment ", str);
            }
            Log.w("FragmentManager", d);
        }
    }

    /* loaded from: classes.dex */
    public class c extends a.a.b {
        public c(boolean z) {
            super(z);
        }

        @Override // a.a.b
        public void a() {
            b0 b0Var = b0.this;
            b0Var.C(true);
            if (b0Var.h.f0a) {
                b0Var.U();
            } else {
                b0Var.g.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements q0.a {
        public d() {
        }

        public void a(a.l.b.m mVar, a.h.f.a aVar) {
            boolean z;
            synchronized (aVar) {
                z = aVar.f545a;
            }
            if (!z) {
                b0 b0Var = b0.this;
                HashSet<a.h.f.a> hashSet = b0Var.l.get(mVar);
                if (hashSet == null || !hashSet.remove(aVar) || !hashSet.isEmpty()) {
                    return;
                }
                b0Var.l.remove(mVar);
                if (mVar.f867a >= 5) {
                    return;
                }
                b0Var.i(mVar);
                b0Var.S(mVar, b0Var.p);
            }
        }

        public void b(a.l.b.m mVar, a.h.f.a aVar) {
            b0 b0Var = b0.this;
            if (b0Var.l.get(mVar) == null) {
                b0Var.l.put(mVar, new HashSet<>());
            }
            b0Var.l.get(mVar).add(aVar);
        }
    }

    /* loaded from: classes.dex */
    public class e extends x {
        public e() {
        }

        @Override // a.l.b.x
        public a.l.b.m a(ClassLoader classLoader, String str) {
            y<?> yVar = b0.this.q;
            Context context = yVar.f947b;
            Objects.requireNonNull(yVar);
            Object obj = a.l.b.m.S;
            try {
                return x.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throw new m.c(b.a.a.a.a.e("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
            } catch (InstantiationException e2) {
                throw new m.c(b.a.a.a.a.e("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (NoSuchMethodException e3) {
                throw new m.c(b.a.a.a.a.e("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
            } catch (InvocationTargetException e4) {
                throw new m.c(b.a.a.a.a.e("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements y0 {
        public f(b0 b0Var) {
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.C(true);
        }
    }

    /* loaded from: classes.dex */
    public class h implements f0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.l.b.m f800a;

        public h(b0 b0Var, a.l.b.m mVar) {
            this.f800a = mVar;
        }

        @Override // a.l.b.f0
        public void b(b0 b0Var, a.l.b.m mVar) {
            this.f800a.J();
        }
    }

    /* loaded from: classes.dex */
    public class i implements a.a.e.b<a.a.e.a> {
        public i() {
        }

        @Override // a.a.e.b
        public void a(a.a.e.a aVar) {
            StringBuilder sb;
            a.a.e.a aVar2 = aVar;
            k pollFirst = b0.this.z.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
            } else {
                String str = pollFirst.f802a;
                int i = pollFirst.f803b;
                a.l.b.m e = b0.this.f793c.e(str);
                if (e != null) {
                    e.G(i, aVar2.f4a, aVar2.f5b);
                    return;
                }
                sb = new StringBuilder();
                sb.append("Activity result delivered for unknown Fragment ");
                sb.append(str);
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public static class j extends a.a.e.f.a<Object, a.a.e.a> {
        @Override // a.a.e.f.a
        public a.a.e.a a(int i, Intent intent) {
            return new a.a.e.a(i, intent);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public String f802a;

        /* renamed from: b  reason: collision with root package name */
        public int f803b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public k[] newArray(int i) {
                return new k[i];
            }
        }

        public k(Parcel parcel) {
            this.f802a = parcel.readString();
            this.f803b = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f802a);
            parcel.writeInt(this.f803b);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a(ArrayList<a.l.b.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class m implements l {

        /* renamed from: a  reason: collision with root package name */
        public final int f804a;

        /* renamed from: b  reason: collision with root package name */
        public final int f805b;

        public m(String str, int i, int i2) {
            this.f804a = i;
            this.f805b = i2;
        }

        @Override // a.l.b.b0.l
        public boolean a(ArrayList<a.l.b.a> arrayList, ArrayList<Boolean> arrayList2) {
            a.l.b.m mVar = b0.this.t;
            if (mVar == null || this.f804a >= 0 || !mVar.i().U()) {
                return b0.this.V(arrayList, arrayList2, null, this.f804a, this.f805b);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class n implements m.e {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f807a;

        /* renamed from: b  reason: collision with root package name */
        public final a.l.b.a f808b;

        /* renamed from: c  reason: collision with root package name */
        public int f809c;

        public void a() {
            boolean z = this.f809c > 0;
            for (a.l.b.m mVar : this.f808b.p.f793c.i()) {
                mVar.q0(null);
                if (z && mVar.D()) {
                    mVar.s0();
                }
            }
            a.l.b.a aVar = this.f808b;
            aVar.p.g(aVar, this.f807a, !z, true);
        }
    }

    public static boolean M(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public void A(l lVar, boolean z) {
        if (!z) {
            if (this.q == null) {
                if (!this.D) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else if (Q()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f791a) {
            if (this.q == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f791a.add(lVar);
            a0();
        }
    }

    public final void B(boolean z) {
        if (!this.f792b) {
            if (this.q == null) {
                if (!this.D) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else if (Looper.myLooper() != this.q.f948c.getLooper()) {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            } else {
                if (!z && Q()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.F == null) {
                    this.F = new ArrayList<>();
                    this.G = new ArrayList<>();
                }
                this.f792b = true;
                try {
                    F(null, null);
                    return;
                } finally {
                    this.f792b = false;
                }
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public boolean C(boolean z) {
        boolean z2;
        B(z);
        boolean z3 = false;
        while (true) {
            ArrayList<a.l.b.a> arrayList = this.F;
            ArrayList<Boolean> arrayList2 = this.G;
            synchronized (this.f791a) {
                if (this.f791a.isEmpty()) {
                    z2 = false;
                } else {
                    int size = this.f791a.size();
                    z2 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z2 |= this.f791a.get(i2).a(arrayList, arrayList2);
                    }
                    this.f791a.clear();
                    this.q.f948c.removeCallbacks(this.K);
                }
            }
            if (!z2) {
                h0();
                x();
                this.f793c.b();
                return z3;
            }
            this.f792b = true;
            try {
                X(this.F, this.G);
                e();
                z3 = true;
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
    }

    public void D(l lVar, boolean z) {
        if (!z || (this.q != null && !this.D)) {
            B(z);
            ((a.l.b.a) lVar).a(this.F, this.G);
            this.f792b = true;
            try {
                X(this.F, this.G);
                e();
                h0();
                x();
                this.f793c.b();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
    }

    public final void E(ArrayList<a.l.b.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        int i4;
        int i5;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z = arrayList.get(i2).o;
        ArrayList<a.l.b.m> arrayList4 = this.H;
        if (arrayList4 == null) {
            this.H = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.H.addAll(this.f793c.i());
        a.l.b.m mVar = this.t;
        int i6 = i2;
        boolean z2 = false;
        while (true) {
            int i7 = 1;
            if (i6 < i3) {
                a.l.b.a aVar = arrayList.get(i6);
                int i8 = 3;
                if (!arrayList3.get(i6).booleanValue()) {
                    ArrayList<a.l.b.m> arrayList5 = this.H;
                    int i9 = 0;
                    while (i9 < aVar.f850a.size()) {
                        j0.a aVar2 = aVar.f850a.get(i9);
                        int i10 = aVar2.f853a;
                        if (i10 == i7) {
                            i4 = i7;
                        } else if (i10 != 2) {
                            if (i10 == i8 || i10 == 6) {
                                arrayList5.remove(aVar2.f854b);
                                a.l.b.m mVar2 = aVar2.f854b;
                                if (mVar2 == mVar) {
                                    aVar.f850a.add(i9, new j0.a(9, mVar2));
                                    i9++;
                                    i4 = 1;
                                    mVar = null;
                                    i9 += i4;
                                    i7 = i4;
                                    i8 = 3;
                                }
                            } else if (i10 == 7) {
                                i4 = 1;
                            } else if (i10 == 8) {
                                aVar.f850a.add(i9, new j0.a(9, mVar));
                                i9++;
                                mVar = aVar2.f854b;
                            }
                            i4 = 1;
                            i9 += i4;
                            i7 = i4;
                            i8 = 3;
                        } else {
                            a.l.b.m mVar3 = aVar2.f854b;
                            int i11 = mVar3.w;
                            int size = arrayList5.size() - 1;
                            boolean z3 = false;
                            while (size >= 0) {
                                a.l.b.m mVar4 = arrayList5.get(size);
                                if (mVar4.w != i11) {
                                    i5 = i11;
                                } else if (mVar4 == mVar3) {
                                    i5 = i11;
                                    z3 = true;
                                } else {
                                    if (mVar4 == mVar) {
                                        i5 = i11;
                                        aVar.f850a.add(i9, new j0.a(9, mVar4));
                                        i9++;
                                        mVar = null;
                                    } else {
                                        i5 = i11;
                                    }
                                    j0.a aVar3 = new j0.a(3, mVar4);
                                    aVar3.f855c = aVar2.f855c;
                                    aVar3.e = aVar2.e;
                                    aVar3.d = aVar2.d;
                                    aVar3.f = aVar2.f;
                                    aVar.f850a.add(i9, aVar3);
                                    arrayList5.remove(mVar4);
                                    i9++;
                                }
                                size--;
                                i11 = i5;
                            }
                            if (z3) {
                                aVar.f850a.remove(i9);
                                i9--;
                                i4 = 1;
                                i9 += i4;
                                i7 = i4;
                                i8 = 3;
                            } else {
                                i4 = 1;
                                aVar2.f853a = 1;
                                arrayList5.add(mVar3);
                                i9 += i4;
                                i7 = i4;
                                i8 = 3;
                            }
                        }
                        arrayList5.add(aVar2.f854b);
                        i9 += i4;
                        i7 = i4;
                        i8 = 3;
                    }
                } else {
                    int i12 = 1;
                    ArrayList<a.l.b.m> arrayList6 = this.H;
                    int size2 = aVar.f850a.size() - 1;
                    while (size2 >= 0) {
                        j0.a aVar4 = aVar.f850a.get(size2);
                        int i13 = aVar4.f853a;
                        if (i13 != i12) {
                            if (i13 != 3) {
                                switch (i13) {
                                    case 8:
                                        mVar = null;
                                        break;
                                    case 9:
                                        mVar = aVar4.f854b;
                                        break;
                                    case 10:
                                        aVar4.h = aVar4.g;
                                        break;
                                }
                                size2--;
                                i12 = 1;
                            }
                            arrayList6.add(aVar4.f854b);
                            size2--;
                            i12 = 1;
                        }
                        arrayList6.remove(aVar4.f854b);
                        size2--;
                        i12 = 1;
                    }
                }
                z2 = z2 || aVar.g;
                i6++;
                arrayList3 = arrayList2;
            } else {
                this.H.clear();
                if (!z && this.p >= 1) {
                    for (int i14 = i2; i14 < i3; i14++) {
                        Iterator<j0.a> it = arrayList.get(i14).f850a.iterator();
                        while (it.hasNext()) {
                            a.l.b.m mVar5 = it.next().f854b;
                            if (mVar5 != null && mVar5.r != null) {
                                this.f793c.j(h(mVar5));
                            }
                        }
                    }
                }
                int i15 = i2;
                while (i15 < i3) {
                    a.l.b.a aVar5 = arrayList.get(i15);
                    if (arrayList2.get(i15).booleanValue()) {
                        aVar5.c(-1);
                        aVar5.h(i15 == i3 + (-1));
                    } else {
                        aVar5.c(1);
                        aVar5.g();
                    }
                    i15++;
                }
                boolean booleanValue = arrayList2.get(i3 - 1).booleanValue();
                for (int i16 = i2; i16 < i3; i16++) {
                    a.l.b.a aVar6 = arrayList.get(i16);
                    if (booleanValue) {
                        for (int size3 = aVar6.f850a.size() - 1; size3 >= 0; size3--) {
                            a.l.b.m mVar6 = aVar6.f850a.get(size3).f854b;
                            if (mVar6 != null) {
                                h(mVar6).k();
                            }
                        }
                    } else {
                        Iterator<j0.a> it2 = aVar6.f850a.iterator();
                        while (it2.hasNext()) {
                            a.l.b.m mVar7 = it2.next().f854b;
                            if (mVar7 != null) {
                                h(mVar7).k();
                            }
                        }
                    }
                }
                R(this.p, true);
                HashSet hashSet = new HashSet();
                for (int i17 = i2; i17 < i3; i17++) {
                    Iterator<j0.a> it3 = arrayList.get(i17).f850a.iterator();
                    while (it3.hasNext()) {
                        a.l.b.m mVar8 = it3.next().f854b;
                        if (mVar8 != null && (viewGroup = mVar8.D) != null) {
                            hashSet.add(x0.g(viewGroup, K()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    x0 x0Var = (x0) it4.next();
                    x0Var.d = booleanValue;
                    x0Var.h();
                    x0Var.c();
                }
                for (int i18 = i2; i18 < i3; i18++) {
                    a.l.b.a aVar7 = arrayList.get(i18);
                    if (arrayList2.get(i18).booleanValue() && aVar7.r >= 0) {
                        aVar7.r = -1;
                    }
                    Objects.requireNonNull(aVar7);
                }
                return;
            }
        }
    }

    public final void F(ArrayList<a.l.b.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<n> arrayList3 = this.I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            n nVar = this.I.get(i2);
            if (arrayList == null || nVar.f807a || (indexOf2 = arrayList.indexOf(nVar.f808b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((nVar.f809c == 0) || (arrayList != null && nVar.f808b.j(arrayList, 0, arrayList.size()))) {
                    this.I.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || nVar.f807a || (indexOf = arrayList.indexOf(nVar.f808b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        nVar.a();
                    }
                }
                i2++;
            } else {
                this.I.remove(i2);
                i2--;
                size--;
            }
            a.l.b.a aVar = nVar.f808b;
            aVar.p.g(aVar, nVar.f807a, false, false);
            i2++;
        }
    }

    public a.l.b.m G(String str) {
        return this.f793c.d(str);
    }

    public a.l.b.m H(int i2) {
        i0 i0Var = this.f793c;
        int size = i0Var.f846a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (h0 h0Var : i0Var.f847b.values()) {
                    if (h0Var != null) {
                        a.l.b.m mVar = h0Var.f841c;
                        if (mVar.v == i2) {
                            return mVar;
                        }
                    }
                }
                return null;
            }
            a.l.b.m mVar2 = i0Var.f846a.get(size);
            if (mVar2 != null && mVar2.v == i2) {
                return mVar2;
            }
        }
    }

    public final ViewGroup I(a.l.b.m mVar) {
        ViewGroup viewGroup = mVar.D;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (mVar.w > 0 && this.r.h()) {
            View f2 = this.r.f(mVar.w);
            if (f2 instanceof ViewGroup) {
                return (ViewGroup) f2;
            }
        }
        return null;
    }

    public x J() {
        a.l.b.m mVar = this.s;
        return mVar != null ? mVar.r.J() : this.u;
    }

    public y0 K() {
        a.l.b.m mVar = this.s;
        return mVar != null ? mVar.r.K() : this.v;
    }

    public void L(a.l.b.m mVar) {
        if (M(2)) {
            Log.v("FragmentManager", "hide: " + mVar);
        }
        if (!mVar.y) {
            mVar.y = true;
            mVar.I = true ^ mVar.I;
            e0(mVar);
        }
    }

    public final boolean N(a.l.b.m mVar) {
        b0 b0Var = mVar.t;
        Iterator it = ((ArrayList) b0Var.f793c.g()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            a.l.b.m mVar2 = (a.l.b.m) it.next();
            if (mVar2 != null) {
                z = b0Var.N(mVar2);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean O(a.l.b.m mVar) {
        b0 b0Var;
        if (mVar == null) {
            return true;
        }
        return mVar.B && ((b0Var = mVar.r) == null || b0Var.O(mVar.u));
    }

    public boolean P(a.l.b.m mVar) {
        if (mVar == null) {
            return true;
        }
        b0 b0Var = mVar.r;
        return mVar.equals(b0Var.t) && P(b0Var.s);
    }

    public boolean Q() {
        return this.B || this.C;
    }

    public void R(int i2, boolean z) {
        y<?> yVar;
        if (this.q != null || i2 == -1) {
            if (!z && i2 == this.p) {
                return;
            }
            this.p = i2;
            i0 i0Var = this.f793c;
            Iterator<a.l.b.m> it = i0Var.f846a.iterator();
            while (it.hasNext()) {
                h0 h0Var = i0Var.f847b.get(it.next().e);
                if (h0Var != null) {
                    h0Var.k();
                }
            }
            Iterator<h0> it2 = i0Var.f847b.values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                h0 next = it2.next();
                if (next != null) {
                    next.k();
                    a.l.b.m mVar = next.f841c;
                    if (mVar.l && !mVar.C()) {
                        z2 = true;
                    }
                    if (z2) {
                        i0Var.k(next);
                    }
                }
            }
            g0();
            if (!this.A || (yVar = this.q) == null || this.p != 7) {
                return;
            }
            yVar.l();
            this.A = false;
            return;
        }
        throw new IllegalStateException("No activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r1 != 5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void S(a.l.b.m r17, int r18) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.b.b0.S(a.l.b.m, int):void");
    }

    public void T() {
        if (this.q == null) {
            return;
        }
        this.B = false;
        this.C = false;
        this.J.g = false;
        for (a.l.b.m mVar : this.f793c.i()) {
            if (mVar != null) {
                mVar.t.T();
            }
        }
    }

    public boolean U() {
        C(false);
        B(true);
        a.l.b.m mVar = this.t;
        if (mVar == null || !mVar.i().U()) {
            boolean V = V(this.F, this.G, null, -1, 0);
            if (V) {
                this.f792b = true;
                try {
                    X(this.F, this.G);
                } finally {
                    e();
                }
            }
            h0();
            x();
            this.f793c.b();
            return V;
        }
        return true;
    }

    public boolean V(ArrayList<a.l.b.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        ArrayList<a.l.b.a> arrayList3 = this.d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i4 = -1;
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a.l.b.a aVar = this.d.get(size2);
                    if ((str != null && str.equals(aVar.h)) || (i2 >= 0 && i2 == aVar.r)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a.l.b.a aVar2 = this.d.get(size2);
                        if (str == null || !str.equals(aVar2.h)) {
                            if (i2 < 0 || i2 != aVar2.r) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            }
            if (i4 == this.d.size() - 1) {
                return false;
            }
            for (int size3 = this.d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void W(a.l.b.m mVar) {
        if (M(2)) {
            Log.v("FragmentManager", "remove: " + mVar + " nesting=" + mVar.q);
        }
        boolean z = !mVar.C();
        if (!mVar.z || z) {
            this.f793c.l(mVar);
            if (N(mVar)) {
                this.A = true;
            }
            mVar.l = true;
            e0(mVar);
        }
    }

    public final void X(ArrayList<a.l.b.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        F(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).o) {
                if (i3 != i2) {
                    E(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).o) {
                        i3++;
                    }
                }
                E(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 == size) {
            return;
        }
        E(arrayList, arrayList2, i3, size);
    }

    public void Y(Parcelable parcelable) {
        h0 h0Var;
        if (parcelable == null) {
            return;
        }
        d0 d0Var = (d0) parcelable;
        if (d0Var.f820a == null) {
            return;
        }
        this.f793c.f847b.clear();
        Iterator<g0> it = d0Var.f820a.iterator();
        while (it.hasNext()) {
            g0 next = it.next();
            if (next != null) {
                a.l.b.m mVar = this.J.f824b.get(next.f834b);
                if (mVar != null) {
                    if (M(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + mVar);
                    }
                    h0Var = new h0(this.n, this.f793c, mVar, next);
                } else {
                    h0Var = new h0(this.n, this.f793c, this.q.f947b.getClassLoader(), J(), next);
                }
                a.l.b.m mVar2 = h0Var.f841c;
                mVar2.r = this;
                if (M(2)) {
                    StringBuilder f2 = b.a.a.a.a.f("restoreSaveState: active (");
                    f2.append(mVar2.e);
                    f2.append("): ");
                    f2.append(mVar2);
                    Log.v("FragmentManager", f2.toString());
                }
                h0Var.m(this.q.f947b.getClassLoader());
                this.f793c.j(h0Var);
                h0Var.e = this.p;
            }
        }
        e0 e0Var = this.J;
        Objects.requireNonNull(e0Var);
        Iterator it2 = new ArrayList(e0Var.f824b.values()).iterator();
        while (it2.hasNext()) {
            a.l.b.m mVar3 = (a.l.b.m) it2.next();
            if (!this.f793c.c(mVar3.e)) {
                if (M(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + mVar3 + " that was not found in the set of active Fragments " + d0Var.f820a);
                }
                this.J.b(mVar3);
                mVar3.r = this;
                h0 h0Var2 = new h0(this.n, this.f793c, mVar3);
                h0Var2.e = 1;
                h0Var2.k();
                mVar3.l = true;
                h0Var2.k();
            }
        }
        i0 i0Var = this.f793c;
        ArrayList<String> arrayList = d0Var.f821b;
        i0Var.f846a.clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                a.l.b.m d2 = i0Var.d(str);
                if (d2 == null) {
                    throw new IllegalStateException(b.a.a.a.a.e("No instantiated fragment for (", str, ")"));
                }
                if (M(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + d2);
                }
                i0Var.a(d2);
            }
        }
        if (d0Var.f822c != null) {
            this.d = new ArrayList<>(d0Var.f822c.length);
            int i2 = 0;
            while (true) {
                a.l.b.b[] bVarArr = d0Var.f822c;
                if (i2 >= bVarArr.length) {
                    break;
                }
                a.l.b.b bVar = bVarArr[i2];
                Objects.requireNonNull(bVar);
                a.l.b.a aVar = new a.l.b.a(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = bVar.f788a;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    j0.a aVar2 = new j0.a();
                    int i5 = i3 + 1;
                    aVar2.f853a = iArr[i3];
                    if (M(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i4 + " base fragment #" + bVar.f788a[i5]);
                    }
                    String str2 = bVar.f789b.get(i4);
                    aVar2.f854b = str2 != null ? this.f793c.d(str2) : null;
                    aVar2.g = f.b.values()[bVar.f790c[i4]];
                    aVar2.h = f.b.values()[bVar.d[i4]];
                    int[] iArr2 = bVar.f788a;
                    int i6 = i5 + 1;
                    int i7 = iArr2[i5];
                    aVar2.f855c = i7;
                    int i8 = i6 + 1;
                    int i9 = iArr2[i6];
                    aVar2.d = i9;
                    int i10 = i8 + 1;
                    int i11 = iArr2[i8];
                    aVar2.e = i11;
                    int i12 = iArr2[i10];
                    aVar2.f = i12;
                    aVar.f851b = i7;
                    aVar.f852c = i9;
                    aVar.d = i11;
                    aVar.e = i12;
                    aVar.b(aVar2);
                    i4++;
                    i3 = i10 + 1;
                }
                aVar.f = bVar.e;
                aVar.h = bVar.f;
                aVar.r = bVar.g;
                aVar.g = true;
                aVar.i = bVar.h;
                aVar.j = bVar.i;
                aVar.k = bVar.j;
                aVar.l = bVar.k;
                aVar.m = bVar.l;
                aVar.n = bVar.m;
                aVar.o = bVar.n;
                aVar.c(1);
                if (M(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + aVar.r + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new w0("FragmentManager"));
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i2++;
            }
        } else {
            this.d = null;
        }
        this.i.set(d0Var.d);
        String str3 = d0Var.e;
        if (str3 != null) {
            a.l.b.m G = G(str3);
            this.t = G;
            t(G);
        }
        ArrayList<String> arrayList2 = d0Var.f;
        if (arrayList2 != null) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                Bundle bundle = d0Var.g.get(i13);
                bundle.setClassLoader(this.q.f947b.getClassLoader());
                this.j.put(arrayList2.get(i13), bundle);
            }
        }
        this.z = new ArrayDeque<>(d0Var.h);
    }

    public Parcelable Z() {
        int i2;
        a.l.b.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Iterator it = ((HashSet) f()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            x0 x0Var = (x0) it.next();
            if (x0Var.e) {
                x0Var.e = false;
                x0Var.c();
            }
        }
        z();
        C(true);
        this.B = true;
        this.J.g = true;
        i0 i0Var = this.f793c;
        Objects.requireNonNull(i0Var);
        ArrayList<g0> arrayList2 = new ArrayList<>(i0Var.f847b.size());
        Iterator<h0> it2 = i0Var.f847b.values().iterator();
        while (true) {
            bVarArr = null;
            Bundle bundle = null;
            bVarArr = null;
            if (!it2.hasNext()) {
                break;
            }
            h0 next = it2.next();
            if (next != null) {
                a.l.b.m mVar = next.f841c;
                g0 g0Var = new g0(mVar);
                a.l.b.m mVar2 = next.f841c;
                if (mVar2.f867a <= -1 || g0Var.m != null) {
                    g0Var.m = mVar2.f868b;
                } else {
                    Bundle bundle2 = new Bundle();
                    a.l.b.m mVar3 = next.f841c;
                    mVar3.Z(bundle2);
                    mVar3.Q.b(bundle2);
                    Parcelable Z = mVar3.t.Z();
                    if (Z != null) {
                        bundle2.putParcelable("android:support:fragments", Z);
                    }
                    next.f839a.j(next.f841c, bundle2, false);
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                    if (next.f841c.E != null) {
                        next.o();
                    }
                    if (next.f841c.f869c != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", next.f841c.f869c);
                    }
                    if (next.f841c.d != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBundle("android:view_registry_state", next.f841c.d);
                    }
                    if (!next.f841c.G) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", next.f841c.G);
                    }
                    g0Var.m = bundle;
                    if (next.f841c.h != null) {
                        if (bundle == null) {
                            g0Var.m = new Bundle();
                        }
                        g0Var.m.putString("android:target_state", next.f841c.h);
                        int i3 = next.f841c.i;
                        if (i3 != 0) {
                            g0Var.m.putInt("android:target_req_state", i3);
                        }
                    }
                }
                arrayList2.add(g0Var);
                if (M(2)) {
                    Log.v("FragmentManager", "Saved state of " + mVar + ": " + g0Var.m);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            if (M(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        i0 i0Var2 = this.f793c;
        synchronized (i0Var2.f846a) {
            if (i0Var2.f846a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(i0Var2.f846a.size());
                Iterator<a.l.b.m> it3 = i0Var2.f846a.iterator();
                while (it3.hasNext()) {
                    a.l.b.m next2 = it3.next();
                    arrayList.add(next2.e);
                    if (M(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next2.e + "): " + next2);
                    }
                }
            }
        }
        ArrayList<a.l.b.a> arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new a.l.b.b[size];
            for (i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new a.l.b.b(this.d.get(i2));
                if (M(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.d.get(i2));
                }
            }
        }
        d0 d0Var = new d0();
        d0Var.f820a = arrayList2;
        d0Var.f821b = arrayList;
        d0Var.f822c = bVarArr;
        d0Var.d = this.i.get();
        a.l.b.m mVar4 = this.t;
        if (mVar4 != null) {
            d0Var.e = mVar4.e;
        }
        d0Var.f.addAll(this.j.keySet());
        d0Var.g.addAll(this.j.values());
        d0Var.h = new ArrayList<>(this.z);
        return d0Var;
    }

    public h0 a(a.l.b.m mVar) {
        if (M(2)) {
            Log.v("FragmentManager", "add: " + mVar);
        }
        h0 h2 = h(mVar);
        mVar.r = this;
        this.f793c.j(h2);
        if (!mVar.z) {
            this.f793c.a(mVar);
            mVar.l = false;
            if (mVar.E == null) {
                mVar.I = false;
            }
            if (N(mVar)) {
                this.A = true;
            }
        }
        return h2;
    }

    public void a0() {
        synchronized (this.f791a) {
            ArrayList<n> arrayList = this.I;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.f791a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.q.f948c.removeCallbacks(this.K);
                this.q.f948c.post(this.K);
                h0();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(a.l.b.y<?> r5, a.l.b.v r6, a.l.b.m r7) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.b.b0.b(a.l.b.y, a.l.b.v, a.l.b.m):void");
    }

    public void b0(a.l.b.m mVar, boolean z) {
        ViewGroup I = I(mVar);
        if (I == null || !(I instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) I).setDrawDisappearingViewsLast(!z);
    }

    public void c(a.l.b.m mVar) {
        if (M(2)) {
            Log.v("FragmentManager", "attach: " + mVar);
        }
        if (mVar.z) {
            mVar.z = false;
            if (mVar.k) {
                return;
            }
            this.f793c.a(mVar);
            if (M(2)) {
                Log.v("FragmentManager", "add from attach: " + mVar);
            }
            if (!N(mVar)) {
                return;
            }
            this.A = true;
        }
    }

    public void c0(a.l.b.m mVar, f.b bVar) {
        if (mVar.equals(G(mVar.e)) && (mVar.s == null || mVar.r == this)) {
            mVar.M = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + mVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void d(a.l.b.m mVar) {
        HashSet<a.h.f.a> hashSet = this.l.get(mVar);
        if (hashSet != null) {
            Iterator<a.h.f.a> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            i(mVar);
            this.l.remove(mVar);
        }
    }

    public void d0(a.l.b.m mVar) {
        if (mVar == null || (mVar.equals(G(mVar.e)) && (mVar.s == null || mVar.r == this))) {
            a.l.b.m mVar2 = this.t;
            this.t = mVar;
            t(mVar2);
            t(this.t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + mVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void e() {
        this.f792b = false;
        this.G.clear();
        this.F.clear();
    }

    public final void e0(a.l.b.m mVar) {
        ViewGroup I = I(mVar);
        if (I != null) {
            if (mVar.v() + mVar.u() + mVar.n() + mVar.k() <= 0) {
                return;
            }
            if (I.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                I.setTag(R.id.visible_removing_fragment_view_tag, mVar);
            }
            ((a.l.b.m) I.getTag(R.id.visible_removing_fragment_view_tag)).r0(mVar.t());
        }
    }

    public final Set<x0> f() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f793c.f()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((h0) it.next()).f841c.D;
            if (viewGroup != null) {
                hashSet.add(x0.g(viewGroup, K()));
            }
        }
        return hashSet;
    }

    public void f0(a.l.b.m mVar) {
        if (M(2)) {
            Log.v("FragmentManager", "show: " + mVar);
        }
        if (mVar.y) {
            mVar.y = false;
            mVar.I = !mVar.I;
        }
    }

    public void g(a.l.b.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.h(z3);
        } else {
            aVar.g();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.p >= 1) {
            q0.p(this.q.f947b, this.r, arrayList, arrayList2, 0, 1, true, this.m);
        }
        if (z3) {
            R(this.p, true);
        }
        Iterator it = ((ArrayList) this.f793c.g()).iterator();
        while (it.hasNext()) {
            a.l.b.m mVar = (a.l.b.m) it.next();
            if (mVar != null) {
                View view = mVar.E;
            }
        }
    }

    public final void g0() {
        Iterator it = ((ArrayList) this.f793c.f()).iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            a.l.b.m mVar = h0Var.f841c;
            if (mVar.F) {
                if (this.f792b) {
                    this.E = true;
                } else {
                    mVar.F = false;
                    h0Var.k();
                }
            }
        }
    }

    public h0 h(a.l.b.m mVar) {
        h0 h2 = this.f793c.h(mVar.e);
        if (h2 != null) {
            return h2;
        }
        h0 h0Var = new h0(this.n, this.f793c, mVar);
        h0Var.m(this.q.f947b.getClassLoader());
        h0Var.e = this.p;
        return h0Var;
    }

    public final void h0() {
        synchronized (this.f791a) {
            boolean z = true;
            if (!this.f791a.isEmpty()) {
                this.h.f0a = true;
                return;
            }
            a.a.b bVar = this.h;
            ArrayList<a.l.b.a> arrayList = this.d;
            if ((arrayList != null ? arrayList.size() : 0) <= 0 || !P(this.s)) {
                z = false;
            }
            bVar.f0a = z;
        }
    }

    public final void i(a.l.b.m mVar) {
        mVar.f0();
        this.n.n(mVar, false);
        mVar.D = null;
        mVar.E = null;
        mVar.O = null;
        mVar.P.g(null);
        mVar.n = false;
    }

    public void j(a.l.b.m mVar) {
        if (M(2)) {
            Log.v("FragmentManager", "detach: " + mVar);
        }
        if (!mVar.z) {
            mVar.z = true;
            if (!mVar.k) {
                return;
            }
            if (M(2)) {
                Log.v("FragmentManager", "remove from detach: " + mVar);
            }
            this.f793c.l(mVar);
            if (N(mVar)) {
                this.A = true;
            }
            e0(mVar);
        }
    }

    public void k(Configuration configuration) {
        for (a.l.b.m mVar : this.f793c.i()) {
            if (mVar != null) {
                mVar.onConfigurationChanged(configuration);
                mVar.t.k(configuration);
            }
        }
    }

    public boolean l(MenuItem menuItem) {
        if (this.p < 1) {
            return false;
        }
        for (a.l.b.m mVar : this.f793c.i()) {
            if (mVar != null) {
                if (!mVar.y ? mVar.K() ? true : mVar.t.l(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public void m() {
        this.B = false;
        this.C = false;
        this.J.g = false;
        w(1);
    }

    public boolean n(Menu menu, MenuInflater menuInflater) {
        if (this.p < 1) {
            return false;
        }
        ArrayList<a.l.b.m> arrayList = null;
        boolean z = false;
        for (a.l.b.m mVar : this.f793c.i()) {
            if (mVar != null && O(mVar)) {
                if (!mVar.y ? mVar.t.n(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(mVar);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                a.l.b.m mVar2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(mVar2)) {
                    Objects.requireNonNull(mVar2);
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public void o() {
        this.D = true;
        C(true);
        z();
        w(-1);
        this.q = null;
        this.r = null;
        this.s = null;
        if (this.g != null) {
            Iterator<a.a.a> it = this.h.f1b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.g = null;
        }
        a.a.e.c<Intent> cVar = this.w;
        if (cVar != null) {
            cVar.a();
            this.x.a();
            this.y.a();
        }
    }

    public void p() {
        for (a.l.b.m mVar : this.f793c.i()) {
            if (mVar != null) {
                mVar.g0();
            }
        }
    }

    public void q(boolean z) {
        for (a.l.b.m mVar : this.f793c.i()) {
            if (mVar != null) {
                mVar.V();
                mVar.t.q(z);
            }
        }
    }

    public boolean r(MenuItem menuItem) {
        if (this.p < 1) {
            return false;
        }
        for (a.l.b.m mVar : this.f793c.i()) {
            if (mVar != null) {
                if (!mVar.y ? mVar.t.r(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public void s(Menu menu) {
        if (this.p < 1) {
            return;
        }
        for (a.l.b.m mVar : this.f793c.i()) {
            if (mVar != null && !mVar.y) {
                mVar.t.s(menu);
            }
        }
    }

    public final void t(a.l.b.m mVar) {
        if (mVar == null || !mVar.equals(G(mVar.e))) {
            return;
        }
        boolean P = mVar.r.P(mVar);
        Boolean bool = mVar.j;
        if (bool != null && bool.booleanValue() == P) {
            return;
        }
        mVar.j = Boolean.valueOf(P);
        mVar.X();
        b0 b0Var = mVar.t;
        b0Var.h0();
        b0Var.t(b0Var.t);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a.l.b.m mVar = this.s;
        if (mVar != null) {
            sb.append(mVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.s;
        } else {
            y<?> yVar = this.q;
            if (yVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(yVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.q;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public void u(boolean z) {
        for (a.l.b.m mVar : this.f793c.i()) {
            if (mVar != null) {
                mVar.W();
                mVar.t.u(z);
            }
        }
    }

    public boolean v(Menu menu) {
        boolean z = false;
        if (this.p < 1) {
            return false;
        }
        for (a.l.b.m mVar : this.f793c.i()) {
            if (mVar != null && O(mVar) && mVar.h0(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void w(int i2) {
        try {
            this.f792b = true;
            for (h0 h0Var : this.f793c.f847b.values()) {
                if (h0Var != null) {
                    h0Var.e = i2;
                }
            }
            R(i2, false);
            Iterator it = ((HashSet) f()).iterator();
            while (it.hasNext()) {
                ((x0) it.next()).e();
            }
            this.f792b = false;
            C(true);
        } catch (Throwable th) {
            this.f792b = false;
            throw th;
        }
    }

    public final void x() {
        if (this.E) {
            this.E = false;
            g0();
        }
    }

    public void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String d2 = b.a.a.a.a.d(str, "    ");
        i0 i0Var = this.f793c;
        Objects.requireNonNull(i0Var);
        String str2 = str + "    ";
        if (!i0Var.f847b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (h0 h0Var : i0Var.f847b.values()) {
                printWriter.print(str);
                if (h0Var != null) {
                    a.l.b.m mVar = h0Var.f841c;
                    printWriter.println(mVar);
                    mVar.f(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = i0Var.f846a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(i0Var.f846a.get(i2).toString());
            }
        }
        ArrayList<a.l.b.m> arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.e.get(i3).toString());
            }
        }
        ArrayList<a.l.b.a> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                a.l.b.a aVar = this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(d2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f791a) {
            int size4 = this.f791a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size4; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((l) this.f791a.get(i5));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.r);
        if (this.s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.D);
        if (this.A) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.A);
        }
    }

    public final void z() {
        Iterator it = ((HashSet) f()).iterator();
        while (it.hasNext()) {
            ((x0) it.next()).e();
        }
    }
}
