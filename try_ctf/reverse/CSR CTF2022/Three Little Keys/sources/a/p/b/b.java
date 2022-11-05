package a.p.b;

import a.h.j.w;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0029b f1000a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1001b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f1002c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f1003a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f1004b;

        public void a(int i) {
            if (i < 64) {
                this.f1003a &= ~(1 << i);
                return;
            }
            a aVar = this.f1004b;
            if (aVar == null) {
                return;
            }
            aVar.a(i - 64);
        }

        public int b(int i) {
            long j;
            a aVar = this.f1004b;
            if (aVar == null) {
                if (i >= 64) {
                    j = this.f1003a;
                    return Long.bitCount(j);
                }
            } else if (i >= 64) {
                return Long.bitCount(this.f1003a) + aVar.b(i - 64);
            }
            j = this.f1003a & ((1 << i) - 1);
            return Long.bitCount(j);
        }

        public final void c() {
            if (this.f1004b == null) {
                this.f1004b = new a();
            }
        }

        public boolean d(int i) {
            if (i < 64) {
                return (this.f1003a & (1 << i)) != 0;
            }
            c();
            return this.f1004b.d(i - 64);
        }

        public void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.f1004b.e(i - 64, z);
                return;
            }
            long j = this.f1003a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f1003a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (!z2 && this.f1004b == null) {
                return;
            }
            c();
            this.f1004b.e(0, z2);
        }

        public boolean f(int i) {
            if (i >= 64) {
                c();
                return this.f1004b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f1003a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f1003a = j3;
            long j4 = j - 1;
            this.f1003a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.f1004b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f1004b.f(0);
            }
            return z;
        }

        public void g() {
            this.f1003a = 0L;
            a aVar = this.f1004b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i) {
            if (i < 64) {
                this.f1003a |= 1 << i;
                return;
            }
            c();
            this.f1004b.h(i - 64);
        }

        public String toString() {
            if (this.f1004b == null) {
                return Long.toBinaryString(this.f1003a);
            }
            return this.f1004b.toString() + "xx" + Long.toBinaryString(this.f1003a);
        }
    }

    /* renamed from: a.p.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0029b {
    }

    public b(InterfaceC0029b interfaceC0029b) {
        this.f1000a = interfaceC0029b;
    }

    public void a(View view, int i, boolean z) {
        int b2 = i < 0 ? ((v) this.f1000a).b() : f(i);
        this.f1001b.e(b2, z);
        if (z) {
            i(view);
        }
        v vVar = (v) this.f1000a;
        vVar.f1062a.addView(view, b2);
        RecyclerView recyclerView = vVar.f1062a;
        Objects.requireNonNull(recyclerView);
        RecyclerView.K(view);
        recyclerView.S();
    }

    public void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int b2 = i < 0 ? ((v) this.f1000a).b() : f(i);
        this.f1001b.e(b2, z);
        if (z) {
            i(view);
        }
        v vVar = (v) this.f1000a;
        Objects.requireNonNull(vVar);
        RecyclerView.z K = RecyclerView.K(view);
        if (K != null) {
            if (!K.n() && !K.t()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(K);
                throw new IllegalArgumentException(b.a.a.a.a.b(vVar.f1062a, sb));
            }
            K.j &= -257;
        }
        vVar.f1062a.attachViewToParent(view, b2, layoutParams);
    }

    public void c(int i) {
        RecyclerView.z K;
        int f = f(i);
        this.f1001b.f(f);
        v vVar = (v) this.f1000a;
        View childAt = vVar.f1062a.getChildAt(f);
        if (childAt != null && (K = RecyclerView.K(childAt)) != null) {
            if (K.n() && !K.t()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(K);
                throw new IllegalArgumentException(b.a.a.a.a.b(vVar.f1062a, sb));
            }
            K.b(256);
        }
        vVar.f1062a.detachViewFromParent(f);
    }

    public View d(int i) {
        return ((v) this.f1000a).a(f(i));
    }

    public int e() {
        return ((v) this.f1000a).b() - this.f1002c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int b2 = ((v) this.f1000a).b();
        int i2 = i;
        while (i2 < b2) {
            int b3 = i - (i2 - this.f1001b.b(i2));
            if (b3 == 0) {
                while (this.f1001b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b3;
        }
        return -1;
    }

    public View g(int i) {
        return ((v) this.f1000a).f1062a.getChildAt(i);
    }

    public int h() {
        return ((v) this.f1000a).b();
    }

    public final void i(View view) {
        this.f1002c.add(view);
        v vVar = (v) this.f1000a;
        Objects.requireNonNull(vVar);
        RecyclerView.z K = RecyclerView.K(view);
        if (K != null) {
            RecyclerView recyclerView = vVar.f1062a;
            int i = K.q;
            if (i == -1) {
                View view2 = K.f1338a;
                AtomicInteger atomicInteger = a.h.j.w.f667a;
                i = w.d.c(view2);
            }
            K.p = i;
            recyclerView.j0(K, 4);
        }
    }

    public int j(View view) {
        int indexOfChild = ((v) this.f1000a).f1062a.indexOfChild(view);
        if (indexOfChild != -1 && !this.f1001b.d(indexOfChild)) {
            return indexOfChild - this.f1001b.b(indexOfChild);
        }
        return -1;
    }

    public boolean k(View view) {
        return this.f1002c.contains(view);
    }

    public final boolean l(View view) {
        if (this.f1002c.remove(view)) {
            v vVar = (v) this.f1000a;
            Objects.requireNonNull(vVar);
            RecyclerView.z K = RecyclerView.K(view);
            if (K == null) {
                return true;
            }
            vVar.f1062a.j0(K, K.p);
            K.p = 0;
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f1001b.toString() + ", hidden list:" + this.f1002c.size();
    }
}
