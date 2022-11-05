package a.p.b;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m implements Runnable {
    public static final ThreadLocal<m> e = new ThreadLocal<>();
    public static Comparator<c> f = new a();

    /* renamed from: b  reason: collision with root package name */
    public long f1046b;

    /* renamed from: c  reason: collision with root package name */
    public long f1047c;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<RecyclerView> f1045a = new ArrayList<>();
    public ArrayList<c> d = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r0 == null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
            if (r0 != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int compare(a.p.b.m.c r7, a.p.b.m.c r8) {
            /*
                r6 = this;
                a.p.b.m$c r7 = (a.p.b.m.c) r7
                a.p.b.m$c r8 = (a.p.b.m.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f1051a
                boolean r3 = r8.f1051a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f1052b
                int r2 = r7.f1052b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f1053c
                int r8 = r8.f1053c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a.p.b.m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.l.c {

        /* renamed from: a  reason: collision with root package name */
        public int f1048a;

        /* renamed from: b  reason: collision with root package name */
        public int f1049b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f1050c;
        public int d;

        public void a(int i, int i2) {
            if (i >= 0) {
                if (i2 < 0) {
                    throw new IllegalArgumentException("Pixel distance must be non-negative");
                }
                int i3 = this.d * 2;
                int[] iArr = this.f1050c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f1050c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 2];
                    this.f1050c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f1050c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.d++;
                return;
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        public void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.f1050c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.l lVar = recyclerView.l;
            if (recyclerView.k == null || lVar == null || !lVar.k) {
                return;
            }
            if (z) {
                if (!recyclerView.d.g()) {
                    lVar.j(recyclerView.k.a(), this);
                }
            } else if (!recyclerView.M()) {
                lVar.i(this.f1048a, this.f1049b, recyclerView.e0, this);
            }
            int i = this.d;
            if (i <= lVar.l) {
                return;
            }
            lVar.l = i;
            lVar.m = z;
            recyclerView.f1293b.l();
        }

        public boolean c(int i) {
            if (this.f1050c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f1050c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1051a;

        /* renamed from: b  reason: collision with root package name */
        public int f1052b;

        /* renamed from: c  reason: collision with root package name */
        public int f1053c;
        public RecyclerView d;
        public int e;
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f1046b == 0) {
            this.f1046b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.d0;
        bVar.f1048a = i;
        bVar.f1049b = i2;
    }

    public void b(long j) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f1045a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.f1045a.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.d0.b(recyclerView3, false);
                i += recyclerView3.d0.d;
            }
        }
        this.d.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.f1045a.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.d0;
                int abs = Math.abs(bVar.f1049b) + Math.abs(bVar.f1048a);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.d.size()) {
                        cVar2 = new c();
                        this.d.add(cVar2);
                    } else {
                        cVar2 = this.d.get(i3);
                    }
                    int[] iArr = bVar.f1050c;
                    int i6 = iArr[i5 + 1];
                    cVar2.f1051a = i6 <= abs;
                    cVar2.f1052b = abs;
                    cVar2.f1053c = i6;
                    cVar2.d = recyclerView4;
                    cVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.d, f);
        for (int i7 = 0; i7 < this.d.size() && (recyclerView = (cVar = this.d.get(i7)).d) != null; i7++) {
            RecyclerView.z c2 = c(recyclerView, cVar.e, cVar.f1051a ? Long.MAX_VALUE : j);
            if (c2 != null && c2.f1339b != null && c2.i() && !c2.j() && (recyclerView2 = c2.f1339b.get()) != null) {
                if (recyclerView2.A && recyclerView2.e.h() != 0) {
                    recyclerView2.d0();
                }
                b bVar2 = recyclerView2.d0;
                bVar2.b(recyclerView2, true);
                if (bVar2.d != 0) {
                    try {
                        int i8 = a.h.f.b.f548a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.w wVar = recyclerView2.e0;
                        RecyclerView.d dVar = recyclerView2.k;
                        wVar.d = 1;
                        wVar.e = dVar.a();
                        wVar.g = false;
                        wVar.h = false;
                        wVar.i = false;
                        for (int i9 = 0; i9 < bVar2.d * 2; i9 += 2) {
                            c(recyclerView2, bVar2.f1050c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = a.h.f.b.f548a;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            cVar.f1051a = false;
            cVar.f1052b = 0;
            cVar.f1053c = 0;
            cVar.d = null;
            cVar.e = 0;
        }
    }

    public final RecyclerView.z c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.e.h();
        int i2 = 0;
        while (true) {
            if (i2 >= h) {
                z = false;
                break;
            }
            RecyclerView.z K = RecyclerView.K(recyclerView.e.g(i2));
            if (K.f1340c == i && !K.j()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.r rVar = recyclerView.f1293b;
        try {
            recyclerView.U();
            RecyclerView.z j2 = rVar.j(i, false, j);
            if (j2 != null) {
                if (!j2.i() || j2.j()) {
                    rVar.a(j2, false);
                } else {
                    rVar.g(j2.f1338a);
                }
            }
            return j2;
        } finally {
            recyclerView.V(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i = a.h.f.b.f548a;
            Trace.beginSection("RV Prefetch");
            if (this.f1045a.isEmpty()) {
                this.f1046b = 0L;
                Trace.endSection();
                return;
            }
            int size = this.f1045a.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.f1045a.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f1046b = 0L;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j) + this.f1047c);
            this.f1046b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f1046b = 0L;
            int i3 = a.h.f.b.f548a;
            Trace.endSection();
            throw th;
        }
    }
}
