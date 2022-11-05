package a.l.b;

import a.l.b.b0;
import a.l.b.j0;
import a.l.b.m;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends j0 implements b0.l {
    public final b0 p;
    public boolean q;
    public int r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(a.l.b.b0 r3) {
        /*
            r2 = this;
            a.l.b.x r0 = r3.J()
            a.l.b.y<?> r1 = r3.q
            if (r1 == 0) goto Lf
            android.content.Context r1 = r1.f947b
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L10
        Lf:
            r1 = 0
        L10:
            r2.<init>(r0, r1)
            r0 = -1
            r2.r = r0
            r2.p = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l.b.a.<init>(a.l.b.b0):void");
    }

    @Override // a.l.b.b0.l
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (b0.M(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.g) {
            b0 b0Var = this.p;
            if (b0Var.d == null) {
                b0Var.d = new ArrayList<>();
            }
            b0Var.d.add(this);
            return true;
        }
        return true;
    }

    public void c(int i) {
        if (!this.g) {
            return;
        }
        if (b0.M(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
        }
        int size = this.f850a.size();
        for (int i2 = 0; i2 < size; i2++) {
            j0.a aVar = this.f850a.get(i2);
            m mVar = aVar.f854b;
            if (mVar != null) {
                mVar.q += i;
                if (b0.M(2)) {
                    StringBuilder f = b.a.a.a.a.f("Bump nesting of ");
                    f.append(aVar.f854b);
                    f.append(" to ");
                    f.append(aVar.f854b.q);
                    Log.v("FragmentManager", f.toString());
                }
            }
        }
    }

    public int d(boolean z) {
        if (!this.q) {
            if (b0.M(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new w0("FragmentManager"));
                f("  ", printWriter, true);
                printWriter.close();
            }
            this.q = true;
            this.r = this.g ? this.p.i.getAndIncrement() : -1;
            this.p.A(this, z);
            return this.r;
        }
        throw new IllegalStateException("commit already called");
    }

    public void e(int i, m mVar, String str, int i2) {
        Class<?> cls = mVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = mVar.x;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("Can't change tag of fragment " + mVar + ": was " + mVar.x + " now " + str);
                }
                mVar.x = str;
            }
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Can't add fragment " + mVar + " with tag " + str + " to container view with no id");
                }
                int i3 = mVar.v;
                if (i3 != 0 && i3 != i) {
                    throw new IllegalStateException("Can't change container ID of fragment " + mVar + ": was " + mVar.v + " now " + i);
                }
                mVar.v = i;
                mVar.w = i;
            }
            b(new j0.a(i2, mVar));
            mVar.r = this.p;
            return;
        }
        StringBuilder f = b.a.a.a.a.f("Fragment ");
        f.append(cls.getCanonicalName());
        f.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(f.toString());
    }

    public void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.f851b != 0 || this.f852c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f851b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f852c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        if (!this.f850a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f850a.size();
            for (int i = 0; i < size; i++) {
                j0.a aVar = this.f850a.get(i);
                switch (aVar.f853a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder f = b.a.a.a.a.f("cmd=");
                        f.append(aVar.f853a);
                        str2 = f.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f854b);
                if (z) {
                    if (aVar.f855c != 0 || aVar.d != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f855c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    public void g() {
        b0 b0Var;
        int size = this.f850a.size();
        for (int i = 0; i < size; i++) {
            j0.a aVar = this.f850a.get(i);
            m mVar = aVar.f854b;
            if (mVar != null) {
                mVar.r0(false);
                int i2 = this.f;
                if (mVar.H != null || i2 != 0) {
                    mVar.g();
                    mVar.H.h = i2;
                }
                ArrayList<String> arrayList = this.m;
                ArrayList<String> arrayList2 = this.n;
                mVar.g();
                m.b bVar = mVar.H;
                bVar.i = arrayList;
                bVar.j = arrayList2;
            }
            switch (aVar.f853a) {
                case 1:
                    mVar.l0(aVar.f855c, aVar.d, aVar.e, aVar.f);
                    this.p.b0(mVar, false);
                    this.p.a(mVar);
                    continue;
                case 2:
                default:
                    StringBuilder f = b.a.a.a.a.f("Unknown cmd: ");
                    f.append(aVar.f853a);
                    throw new IllegalArgumentException(f.toString());
                case 3:
                    mVar.l0(aVar.f855c, aVar.d, aVar.e, aVar.f);
                    this.p.W(mVar);
                    continue;
                case 4:
                    mVar.l0(aVar.f855c, aVar.d, aVar.e, aVar.f);
                    this.p.L(mVar);
                    continue;
                case 5:
                    mVar.l0(aVar.f855c, aVar.d, aVar.e, aVar.f);
                    this.p.b0(mVar, false);
                    this.p.f0(mVar);
                    continue;
                case 6:
                    mVar.l0(aVar.f855c, aVar.d, aVar.e, aVar.f);
                    this.p.j(mVar);
                    continue;
                case 7:
                    mVar.l0(aVar.f855c, aVar.d, aVar.e, aVar.f);
                    this.p.b0(mVar, false);
                    this.p.c(mVar);
                    continue;
                case 8:
                    b0Var = this.p;
                    break;
                case 9:
                    b0Var = this.p;
                    mVar = null;
                    break;
                case 10:
                    this.p.c0(mVar, aVar.h);
                    continue;
            }
            b0Var.d0(mVar);
        }
    }

    public void h(boolean z) {
        b0 b0Var;
        for (int size = this.f850a.size() - 1; size >= 0; size--) {
            j0.a aVar = this.f850a.get(size);
            m mVar = aVar.f854b;
            if (mVar != null) {
                mVar.r0(true);
                int i = this.f;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                if (mVar.H != null || i2 != 0) {
                    mVar.g();
                    mVar.H.h = i2;
                }
                ArrayList<String> arrayList = this.n;
                ArrayList<String> arrayList2 = this.m;
                mVar.g();
                m.b bVar = mVar.H;
                bVar.i = arrayList;
                bVar.j = arrayList2;
            }
            switch (aVar.f853a) {
                case 1:
                    mVar.l0(aVar.f855c, aVar.d, aVar.e, aVar.f);
                    this.p.b0(mVar, true);
                    this.p.W(mVar);
                    continue;
                case 2:
                default:
                    StringBuilder f = b.a.a.a.a.f("Unknown cmd: ");
                    f.append(aVar.f853a);
                    throw new IllegalArgumentException(f.toString());
                case 3:
                    mVar.l0(aVar.f855c, aVar.d, aVar.e, aVar.f);
                    this.p.a(mVar);
                    continue;
                case 4:
                    mVar.l0(aVar.f855c, aVar.d, aVar.e, aVar.f);
                    this.p.f0(mVar);
                    continue;
                case 5:
                    mVar.l0(aVar.f855c, aVar.d, aVar.e, aVar.f);
                    this.p.b0(mVar, true);
                    this.p.L(mVar);
                    continue;
                case 6:
                    mVar.l0(aVar.f855c, aVar.d, aVar.e, aVar.f);
                    this.p.c(mVar);
                    continue;
                case 7:
                    mVar.l0(aVar.f855c, aVar.d, aVar.e, aVar.f);
                    this.p.b0(mVar, true);
                    this.p.j(mVar);
                    continue;
                case 8:
                    b0Var = this.p;
                    mVar = null;
                    break;
                case 9:
                    b0Var = this.p;
                    break;
                case 10:
                    this.p.c0(mVar, aVar.g);
                    continue;
            }
            b0Var.d0(mVar);
        }
    }

    public boolean i(int i) {
        int size = this.f850a.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.f850a.get(i2).f854b;
            int i3 = mVar != null ? mVar.w : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean j(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f850a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            m mVar = this.f850a.get(i4).f854b;
            int i5 = mVar != null ? mVar.w : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.f850a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        m mVar2 = aVar.f850a.get(i7).f854b;
                        if ((mVar2 != null ? mVar2.w : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.r >= 0) {
            sb.append(" #");
            sb.append(this.r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
