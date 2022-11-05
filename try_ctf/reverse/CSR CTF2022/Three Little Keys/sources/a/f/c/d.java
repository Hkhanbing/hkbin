package a.f.c;

import a.f.c.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {
    public static final int[] d = {0, 4, 8};
    public static SparseIntArray e = new SparseIntArray();
    public static SparseIntArray f = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, a.f.c.a> f460a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f461b = true;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, a> f462c = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f463a;

        /* renamed from: b  reason: collision with root package name */
        public final C0012d f464b = new C0012d();

        /* renamed from: c  reason: collision with root package name */
        public final c f465c = new c();
        public final b d = new b();
        public final e e = new e();
        public HashMap<String, a.f.c.a> f = new HashMap<>();
        public C0011a g;

        /* renamed from: a.f.c.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0011a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f466a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f467b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f468c = 0;
            public int[] d = new int[10];
            public float[] e = new float[10];
            public int f = 0;
            public int[] g = new int[5];
            public String[] h = new String[5];
            public int i = 0;
            public int[] j = new int[4];
            public boolean[] k = new boolean[4];
            public int l = 0;

            public void a(int i, float f) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public void b(int i, int i2) {
                int i3 = this.f468c;
                int[] iArr = this.f466a;
                if (i3 >= iArr.length) {
                    this.f466a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f467b;
                    this.f467b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f466a;
                int i4 = this.f468c;
                iArr3[i4] = i;
                int[] iArr4 = this.f467b;
                this.f468c = i4 + 1;
                iArr4[i4] = i2;
            }

            public void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        public void a(ConstraintLayout.a aVar) {
            b bVar = this.d;
            aVar.e = bVar.i;
            aVar.f = bVar.j;
            aVar.g = bVar.k;
            aVar.h = bVar.l;
            aVar.i = bVar.m;
            aVar.j = bVar.n;
            aVar.k = bVar.o;
            aVar.l = bVar.p;
            aVar.m = bVar.q;
            aVar.n = bVar.r;
            aVar.o = bVar.s;
            aVar.s = bVar.t;
            aVar.t = bVar.u;
            aVar.u = bVar.v;
            aVar.v = bVar.w;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.H;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.I;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.J;
            aVar.A = bVar.S;
            aVar.B = bVar.R;
            aVar.x = bVar.O;
            aVar.z = bVar.Q;
            aVar.E = bVar.x;
            aVar.F = bVar.y;
            b bVar2 = this.d;
            aVar.p = bVar2.A;
            aVar.q = bVar2.B;
            aVar.r = bVar2.C;
            aVar.G = bVar2.z;
            aVar.T = bVar2.D;
            aVar.U = bVar2.E;
            aVar.I = bVar2.U;
            aVar.H = bVar2.V;
            aVar.K = bVar2.X;
            aVar.J = bVar2.W;
            aVar.W = bVar2.m0;
            aVar.X = bVar2.n0;
            aVar.L = bVar2.Y;
            aVar.M = bVar2.Z;
            aVar.P = bVar2.a0;
            aVar.Q = bVar2.b0;
            aVar.N = bVar2.c0;
            aVar.O = bVar2.d0;
            aVar.R = bVar2.e0;
            aVar.S = bVar2.f0;
            aVar.V = bVar2.F;
            aVar.f1230c = bVar2.g;
            aVar.f1228a = bVar2.e;
            aVar.f1229b = bVar2.f;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar2.f471c;
            b bVar3 = this.d;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar3.d;
            String str = bVar3.l0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar3.p0;
            aVar.setMarginStart(bVar3.L);
            aVar.setMarginEnd(this.d.K);
            aVar.a();
        }

        public final void b(int i, ConstraintLayout.a aVar) {
            this.f463a = i;
            b bVar = this.d;
            bVar.i = aVar.e;
            bVar.j = aVar.f;
            bVar.k = aVar.g;
            bVar.l = aVar.h;
            bVar.m = aVar.i;
            bVar.n = aVar.j;
            bVar.o = aVar.k;
            bVar.p = aVar.l;
            bVar.q = aVar.m;
            bVar.r = aVar.n;
            bVar.s = aVar.o;
            bVar.t = aVar.s;
            bVar.u = aVar.t;
            bVar.v = aVar.u;
            bVar.w = aVar.v;
            bVar.x = aVar.E;
            bVar.y = aVar.F;
            bVar.z = aVar.G;
            bVar.A = aVar.p;
            bVar.B = aVar.q;
            bVar.C = aVar.r;
            bVar.D = aVar.T;
            bVar.E = aVar.U;
            bVar.F = aVar.V;
            bVar.g = aVar.f1230c;
            b bVar2 = this.d;
            bVar2.e = aVar.f1228a;
            bVar2.f = aVar.f1229b;
            bVar2.f471c = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar2.d = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar2.G = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar2.H = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar2.M = aVar.D;
            bVar2.U = aVar.I;
            bVar2.V = aVar.H;
            bVar2.X = aVar.K;
            bVar2.W = aVar.J;
            bVar2.m0 = aVar.W;
            bVar2.n0 = aVar.X;
            bVar2.Y = aVar.L;
            bVar2.Z = aVar.M;
            bVar2.a0 = aVar.P;
            bVar2.b0 = aVar.Q;
            bVar2.c0 = aVar.N;
            bVar2.d0 = aVar.O;
            bVar2.e0 = aVar.R;
            bVar2.f0 = aVar.S;
            bVar2.l0 = aVar.Y;
            bVar2.O = aVar.x;
            b bVar3 = this.d;
            bVar3.Q = aVar.z;
            bVar3.N = aVar.w;
            bVar3.P = aVar.y;
            bVar3.S = aVar.A;
            bVar3.R = aVar.B;
            bVar3.T = aVar.C;
            bVar3.p0 = aVar.Z;
            bVar3.K = aVar.getMarginEnd();
            this.d.L = aVar.getMarginStart();
        }

        public final void c(int i, e.a aVar) {
            b(i, aVar);
            this.f464b.d = aVar.r0;
            e eVar = this.e;
            eVar.f479b = aVar.u0;
            eVar.f480c = aVar.v0;
            eVar.d = aVar.w0;
            eVar.e = aVar.x0;
            eVar.f = aVar.y0;
            eVar.g = aVar.z0;
            eVar.h = aVar.A0;
            eVar.j = aVar.B0;
            eVar.k = aVar.C0;
            eVar.l = aVar.D0;
            eVar.n = aVar.t0;
            eVar.m = aVar.s0;
        }

        public Object clone() {
            a aVar = new a();
            b bVar = aVar.d;
            b bVar2 = this.d;
            Objects.requireNonNull(bVar);
            bVar.f469a = bVar2.f469a;
            bVar.f471c = bVar2.f471c;
            bVar.f470b = bVar2.f470b;
            bVar.d = bVar2.d;
            bVar.e = bVar2.e;
            bVar.f = bVar2.f;
            bVar.g = bVar2.g;
            bVar.h = bVar2.h;
            bVar.i = bVar2.i;
            bVar.j = bVar2.j;
            bVar.k = bVar2.k;
            bVar.l = bVar2.l;
            bVar.m = bVar2.m;
            bVar.n = bVar2.n;
            bVar.o = bVar2.o;
            bVar.p = bVar2.p;
            bVar.q = bVar2.q;
            bVar.r = bVar2.r;
            bVar.s = bVar2.s;
            bVar.t = bVar2.t;
            bVar.u = bVar2.u;
            bVar.v = bVar2.v;
            bVar.w = bVar2.w;
            bVar.x = bVar2.x;
            bVar.y = bVar2.y;
            bVar.z = bVar2.z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.a0 = bVar2.a0;
            bVar.b0 = bVar2.b0;
            bVar.c0 = bVar2.c0;
            bVar.d0 = bVar2.d0;
            bVar.e0 = bVar2.e0;
            bVar.f0 = bVar2.f0;
            bVar.g0 = bVar2.g0;
            bVar.h0 = bVar2.h0;
            bVar.i0 = bVar2.i0;
            bVar.l0 = bVar2.l0;
            int[] iArr = bVar2.j0;
            if (iArr == null || bVar2.k0 != null) {
                bVar.j0 = null;
            } else {
                bVar.j0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.k0 = bVar2.k0;
            bVar.m0 = bVar2.m0;
            bVar.n0 = bVar2.n0;
            bVar.o0 = bVar2.o0;
            bVar.p0 = bVar2.p0;
            c cVar = aVar.f465c;
            c cVar2 = this.f465c;
            Objects.requireNonNull(cVar);
            cVar.f472a = cVar2.f472a;
            cVar.f473b = cVar2.f473b;
            cVar.d = cVar2.d;
            cVar.e = cVar2.e;
            cVar.f = cVar2.f;
            cVar.i = cVar2.i;
            cVar.g = cVar2.g;
            cVar.h = cVar2.h;
            C0012d c0012d = aVar.f464b;
            C0012d c0012d2 = this.f464b;
            Objects.requireNonNull(c0012d);
            c0012d.f475a = c0012d2.f475a;
            c0012d.f476b = c0012d2.f476b;
            c0012d.d = c0012d2.d;
            c0012d.e = c0012d2.e;
            c0012d.f477c = c0012d2.f477c;
            e eVar = aVar.e;
            e eVar2 = this.e;
            Objects.requireNonNull(eVar);
            eVar.f478a = eVar2.f478a;
            eVar.f479b = eVar2.f479b;
            eVar.f480c = eVar2.f480c;
            eVar.d = eVar2.d;
            eVar.e = eVar2.e;
            eVar.f = eVar2.f;
            eVar.g = eVar2.g;
            eVar.h = eVar2.h;
            eVar.i = eVar2.i;
            eVar.j = eVar2.j;
            eVar.k = eVar2.k;
            eVar.l = eVar2.l;
            eVar.m = eVar2.m;
            eVar.n = eVar2.n;
            aVar.f463a = this.f463a;
            aVar.g = this.g;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static SparseIntArray q0;

        /* renamed from: c  reason: collision with root package name */
        public int f471c;
        public int d;
        public int[] j0;
        public String k0;
        public String l0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f469a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f470b = false;
        public int e = -1;
        public int f = -1;
        public float g = -1.0f;
        public boolean h = true;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public float x = 0.5f;
        public float y = 0.5f;
        public String z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public float e0 = 1.0f;
        public float f0 = 1.0f;
        public int g0 = -1;
        public int h0 = 0;
        public int i0 = -1;
        public boolean m0 = false;
        public boolean n0 = false;
        public boolean o0 = true;
        public int p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            q0.append(44, 25);
            q0.append(46, 28);
            q0.append(47, 29);
            q0.append(52, 35);
            q0.append(51, 34);
            q0.append(24, 4);
            q0.append(23, 3);
            q0.append(19, 1);
            q0.append(61, 6);
            q0.append(62, 7);
            q0.append(31, 17);
            q0.append(32, 18);
            q0.append(33, 19);
            q0.append(15, 90);
            q0.append(0, 26);
            q0.append(48, 31);
            q0.append(49, 32);
            q0.append(30, 10);
            q0.append(29, 9);
            q0.append(66, 13);
            q0.append(69, 16);
            q0.append(67, 14);
            q0.append(64, 11);
            q0.append(68, 15);
            q0.append(65, 12);
            q0.append(55, 38);
            q0.append(41, 37);
            q0.append(40, 39);
            q0.append(54, 40);
            q0.append(39, 20);
            q0.append(53, 36);
            q0.append(28, 5);
            q0.append(42, 91);
            q0.append(50, 91);
            q0.append(45, 91);
            q0.append(22, 91);
            q0.append(18, 91);
            q0.append(3, 23);
            q0.append(5, 27);
            q0.append(7, 30);
            q0.append(8, 8);
            q0.append(4, 33);
            q0.append(6, 2);
            q0.append(1, 22);
            q0.append(2, 21);
            q0.append(56, 41);
            q0.append(34, 42);
            q0.append(17, 41);
            q0.append(16, 42);
            q0.append(71, 76);
            q0.append(25, 61);
            q0.append(27, 62);
            q0.append(26, 63);
            q0.append(60, 69);
            q0.append(38, 70);
            q0.append(12, 71);
            q0.append(10, 72);
            q0.append(11, 73);
            q0.append(13, 74);
            q0.append(9, 75);
        }

        public void a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f);
            this.f470b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = q0.get(index);
                switch (i2) {
                    case 1:
                        int i3 = this.q;
                        int[] iArr = d.d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.q = resourceId;
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        int i4 = this.p;
                        int[] iArr2 = d.d;
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, i4);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.p = resourceId2;
                        break;
                    case 4:
                        int i5 = this.o;
                        int[] iArr3 = d.d;
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, i5);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.o = resourceId3;
                        break;
                    case 5:
                        this.z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        int i6 = this.w;
                        int[] iArr4 = d.d;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, i6);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.w = resourceId4;
                        break;
                    case 10:
                        int i7 = this.v;
                        int[] iArr5 = d.d;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, i7);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.v = resourceId5;
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case 18:
                        this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 19:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 20:
                        this.x = obtainStyledAttributes.getFloat(index, this.x);
                        break;
                    case 21:
                        this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 22:
                        this.f471c = obtainStyledAttributes.getLayoutDimension(index, this.f471c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        int i8 = this.i;
                        int[] iArr6 = d.d;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, i8);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.i = resourceId6;
                        break;
                    case 25:
                        int i9 = this.j;
                        int[] iArr7 = d.d;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, i9);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.j = resourceId7;
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        int i10 = this.k;
                        int[] iArr8 = d.d;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, i10);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.k = resourceId8;
                        break;
                    case 29:
                        int i11 = this.l;
                        int[] iArr9 = d.d;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, i11);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.l = resourceId9;
                        break;
                    case 30:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        int i12 = this.t;
                        int[] iArr10 = d.d;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, i12);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.t = resourceId10;
                        break;
                    case 32:
                        int i13 = this.u;
                        int[] iArr11 = d.d;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, i13);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.u = resourceId11;
                        break;
                    case 33:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        int i14 = this.n;
                        int[] iArr12 = d.d;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, i14);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.n = resourceId12;
                        break;
                    case 35:
                        int i15 = this.m;
                        int[] iArr13 = d.d;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, i15);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.m = resourceId13;
                        break;
                    case 36:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 37:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        d.g(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.g(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                int i16 = this.A;
                                int[] iArr14 = d.d;
                                int resourceId14 = obtainStyledAttributes.getResourceId(index, i16);
                                if (resourceId14 == -1) {
                                    resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                }
                                this.A = resourceId14;
                                continue;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                continue;
                            case 63:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                continue;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.g0 = obtainStyledAttributes.getInt(index, this.g0);
                                        break;
                                    case 73:
                                        this.h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                        break;
                                    case 74:
                                        this.k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case 76:
                                        this.p0 = obtainStyledAttributes.getInt(index, this.p0);
                                        break;
                                    case 77:
                                        int i17 = this.r;
                                        int[] iArr15 = d.d;
                                        int resourceId15 = obtainStyledAttributes.getResourceId(index, i17);
                                        if (resourceId15 == -1) {
                                            resourceId15 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.r = resourceId15;
                                        break;
                                    case 78:
                                        int i18 = this.s;
                                        int[] iArr16 = d.d;
                                        int resourceId16 = obtainStyledAttributes.getResourceId(index, i18);
                                        if (resourceId16 == -1) {
                                            resourceId16 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.s = resourceId16;
                                        break;
                                    case 79:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        break;
                                    case 80:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        break;
                                    case 81:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 83:
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 84:
                                        this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                        break;
                                    case 85:
                                        this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case 86:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 87:
                                        this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                        break;
                                    case 88:
                                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case 89:
                                        this.l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.h = obtainStyledAttributes.getBoolean(index, this.h);
                                        break;
                                    case 91:
                                        sb = new StringBuilder();
                                        str = "unused attribute 0x";
                                        sb.append(str);
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(q0.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        continue;
                                    default:
                                        sb = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        sb.append(str);
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(q0.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static SparseIntArray o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f472a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f473b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f474c = 0;
        public String d = null;
        public int e = -1;
        public int f = 0;
        public float g = Float.NaN;
        public int h = -1;
        public float i = Float.NaN;
        public float j = Float.NaN;
        public int k = -1;
        public String l = null;
        public int m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(3, 1);
            o.append(5, 2);
            o.append(9, 3);
            o.append(2, 4);
            o.append(1, 5);
            o.append(0, 6);
            o.append(4, 7);
            o.append(8, 8);
            o.append(7, 9);
            o.append(6, 10);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.g);
            this.f472a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.i = obtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 2:
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : a.f.a.h.a.a.f385c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i2 = this.f473b;
                        int[] iArr = d.d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i2);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f473b = resourceId;
                        break;
                    case 6:
                        this.f474c = obtainStyledAttributes.getInteger(index, this.f474c);
                        break;
                    case 7:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.k = obtainStyledAttributes.getInteger(index, this.k);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case 10:
                        int i3 = obtainStyledAttributes.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId2;
                            if (resourceId2 == -1) {
                                break;
                            }
                            this.m = -2;
                            break;
                        } else if (i3 != 3) {
                            this.m = obtainStyledAttributes.getInteger(index, this.n);
                            break;
                        } else {
                            String string = obtainStyledAttributes.getString(index);
                            this.l = string;
                            if (string.indexOf("/") <= 0) {
                                this.m = -1;
                                break;
                            } else {
                                this.n = obtainStyledAttributes.getResourceId(index, -1);
                                this.m = -2;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a.f.c.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0012d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f475a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f476b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f477c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.i);
            this.f475a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == 0) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f476b);
                    this.f476b = i2;
                    int[] iArr = d.d;
                    this.f476b = d.d[i2];
                } else if (index == 4) {
                    this.f477c = obtainStyledAttributes.getInt(index, this.f477c);
                } else if (index == 3) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static SparseIntArray o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f478a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f479b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f480c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public int i = -1;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(6, 1);
            o.append(7, 2);
            o.append(8, 3);
            o.append(4, 4);
            o.append(5, 5);
            o.append(0, 6);
            o.append(1, 7);
            o.append(2, 8);
            o.append(3, 9);
            o.append(9, 10);
            o.append(10, 11);
            o.append(11, 12);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.k);
            this.f478a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.f479b = obtainStyledAttributes.getFloat(index, this.f479b);
                        break;
                    case 2:
                        this.f480c = obtainStyledAttributes.getFloat(index, this.f480c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = obtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        int i2 = this.i;
                        int[] iArr = d.d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i2);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.i = resourceId;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        e.append(82, 25);
        e.append(83, 26);
        e.append(85, 29);
        e.append(86, 30);
        e.append(92, 36);
        e.append(91, 35);
        e.append(63, 4);
        e.append(62, 3);
        e.append(58, 1);
        e.append(60, 91);
        e.append(59, 92);
        e.append(101, 6);
        e.append(102, 7);
        e.append(70, 17);
        e.append(71, 18);
        e.append(72, 19);
        e.append(54, 99);
        e.append(0, 27);
        e.append(87, 32);
        e.append(88, 33);
        e.append(69, 10);
        e.append(68, 9);
        e.append(106, 13);
        e.append(109, 16);
        e.append(107, 14);
        e.append(104, 11);
        e.append(108, 15);
        e.append(105, 12);
        e.append(95, 40);
        e.append(80, 39);
        e.append(79, 41);
        e.append(94, 42);
        e.append(78, 20);
        e.append(93, 37);
        e.append(67, 5);
        e.append(81, 87);
        e.append(90, 87);
        e.append(84, 87);
        e.append(61, 87);
        e.append(57, 87);
        e.append(5, 24);
        e.append(7, 28);
        e.append(23, 31);
        e.append(24, 8);
        e.append(6, 34);
        e.append(8, 2);
        e.append(3, 23);
        e.append(4, 21);
        e.append(96, 95);
        e.append(73, 96);
        e.append(2, 22);
        e.append(13, 43);
        e.append(26, 44);
        e.append(21, 45);
        e.append(22, 46);
        e.append(20, 60);
        e.append(18, 47);
        e.append(19, 48);
        e.append(14, 49);
        e.append(15, 50);
        e.append(16, 51);
        e.append(17, 52);
        e.append(25, 53);
        e.append(97, 54);
        e.append(74, 55);
        e.append(98, 56);
        e.append(75, 57);
        e.append(99, 58);
        e.append(76, 59);
        e.append(64, 61);
        e.append(66, 62);
        e.append(65, 63);
        e.append(28, 64);
        e.append(121, 65);
        e.append(35, 66);
        e.append(122, 67);
        e.append(113, 79);
        e.append(1, 38);
        e.append(112, 68);
        e.append(100, 69);
        e.append(77, 70);
        e.append(111, 97);
        e.append(32, 71);
        e.append(30, 72);
        e.append(31, 73);
        e.append(33, 74);
        e.append(29, 75);
        e.append(114, 76);
        e.append(89, 77);
        e.append(123, 78);
        e.append(56, 80);
        e.append(55, 81);
        e.append(116, 82);
        e.append(120, 83);
        e.append(119, 84);
        e.append(118, 85);
        e.append(117, 86);
        f.append(85, 6);
        f.append(85, 7);
        f.append(0, 27);
        f.append(89, 13);
        f.append(92, 16);
        f.append(90, 14);
        f.append(87, 11);
        f.append(91, 15);
        f.append(88, 12);
        f.append(78, 40);
        f.append(71, 39);
        f.append(70, 41);
        f.append(77, 42);
        f.append(69, 20);
        f.append(76, 37);
        f.append(60, 5);
        f.append(72, 87);
        f.append(75, 87);
        f.append(73, 87);
        f.append(57, 87);
        f.append(56, 87);
        f.append(5, 24);
        f.append(7, 28);
        f.append(23, 31);
        f.append(24, 8);
        f.append(6, 34);
        f.append(8, 2);
        f.append(3, 23);
        f.append(4, 21);
        f.append(79, 95);
        f.append(64, 96);
        f.append(2, 22);
        f.append(13, 43);
        f.append(26, 44);
        f.append(21, 45);
        f.append(22, 46);
        f.append(20, 60);
        f.append(18, 47);
        f.append(19, 48);
        f.append(14, 49);
        f.append(15, 50);
        f.append(16, 51);
        f.append(17, 52);
        f.append(25, 53);
        f.append(80, 54);
        f.append(65, 55);
        f.append(81, 56);
        f.append(66, 57);
        f.append(82, 58);
        f.append(67, 59);
        f.append(59, 62);
        f.append(58, 63);
        f.append(28, 64);
        f.append(105, 65);
        f.append(34, 66);
        f.append(106, 67);
        f.append(96, 79);
        f.append(1, 38);
        f.append(97, 98);
        f.append(95, 68);
        f.append(83, 69);
        f.append(68, 70);
        f.append(32, 71);
        f.append(30, 72);
        f.append(31, 73);
        f.append(33, 74);
        f.append(29, 75);
        f.append(98, 76);
        f.append(74, 77);
        f.append(107, 78);
        f.append(55, 80);
        f.append(54, 81);
        f.append(100, 82);
        f.append(104, 83);
        f.append(103, 84);
        f.append(102, 85);
        f.append(101, 86);
        f.append(94, 97);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.c.d.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public void a(ConstraintLayout constraintLayout) {
        b(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void b(ConstraintLayout constraintLayout, boolean z) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f462c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f462c.containsKey(Integer.valueOf(id))) {
                StringBuilder f2 = b.a.a.a.a.f("id unknown ");
                f2.append(a.b.a.g(childAt));
                Log.w("ConstraintSet", f2.toString());
            } else if (this.f461b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.f462c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f462c.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.d.i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.d.g0);
                                barrier.setMargin(aVar.d.h0);
                                barrier.setAllowsGoneWidget(aVar.d.o0);
                                b bVar = aVar.d;
                                int[] iArr = bVar.j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.k0;
                                    if (str != null) {
                                        bVar.j0 = d(barrier, str);
                                        barrier.setReferencedIds(aVar.d.j0);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar2.a();
                            aVar.a(aVar2);
                            if (z) {
                                a.f.c.a.b(childAt, aVar.f);
                            }
                            childAt.setLayoutParams(aVar2);
                            C0012d c0012d = aVar.f464b;
                            if (c0012d.f477c == 0) {
                                childAt.setVisibility(c0012d.f476b);
                            }
                            childAt.setAlpha(aVar.f464b.d);
                            childAt.setRotation(aVar.e.f479b);
                            childAt.setRotationX(aVar.e.f480c);
                            childAt.setRotationY(aVar.e.d);
                            childAt.setScaleX(aVar.e.e);
                            childAt.setScaleY(aVar.e.f);
                            e eVar = aVar.e;
                            if (eVar.i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.e.i) != null) {
                                    float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                    float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.g)) {
                                    childAt.setPivotX(aVar.e.g);
                                }
                                if (!Float.isNaN(aVar.e.h)) {
                                    childAt.setPivotY(aVar.e.h);
                                }
                            }
                            childAt.setTranslationX(aVar.e.j);
                            childAt.setTranslationY(aVar.e.k);
                            childAt.setTranslationZ(aVar.e.l);
                            e eVar2 = aVar.e;
                            if (eVar2.m) {
                                childAt.setElevation(eVar2.n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f462c.get(num);
            if (aVar3 != null) {
                if (aVar3.d.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = aVar3.d;
                    int[] iArr2 = bVar2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.k0;
                        if (str2 != null) {
                            bVar2.j0 = d(barrier2, str2);
                            barrier2.setReferencedIds(aVar3.d.j0);
                        }
                    }
                    barrier2.setType(aVar3.d.g0);
                    barrier2.setMargin(aVar3.d.h0);
                    ConstraintLayout.a generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.n();
                    aVar3.a(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar3.d.f469a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.a generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof a.f.c.b) {
                ((a.f.c.b) childAt2).g(constraintLayout);
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        a.f.c.a aVar;
        d dVar = this;
        int childCount = constraintLayout.getChildCount();
        dVar.f462c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (dVar.f461b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!dVar.f462c.containsKey(Integer.valueOf(id))) {
                dVar.f462c.put(Integer.valueOf(id), new a());
            }
            a aVar3 = dVar.f462c.get(Integer.valueOf(id));
            if (aVar3 != null) {
                HashMap<String, a.f.c.a> hashMap = dVar.f460a;
                HashMap<String, a.f.c.a> hashMap2 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap.keySet()) {
                    a.f.c.a aVar4 = hashMap.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            aVar = new a.f.c.a(aVar4, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                        } else {
                            try {
                                aVar = new a.f.c.a(aVar4, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                e.printStackTrace();
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                e.printStackTrace();
                            }
                        }
                        hashMap2.put(str, aVar);
                    } catch (IllegalAccessException e5) {
                        e = e5;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                    }
                }
                aVar3.f = hashMap2;
                aVar3.b(id, aVar2);
                aVar3.f464b.f476b = childAt.getVisibility();
                aVar3.f464b.d = childAt.getAlpha();
                aVar3.e.f479b = childAt.getRotation();
                aVar3.e.f480c = childAt.getRotationX();
                aVar3.e.d = childAt.getRotationY();
                aVar3.e.e = childAt.getScaleX();
                aVar3.e.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar3.e;
                    eVar.g = pivotX;
                    eVar.h = pivotY;
                }
                aVar3.e.j = childAt.getTranslationX();
                aVar3.e.k = childAt.getTranslationY();
                aVar3.e.l = childAt.getTranslationZ();
                e eVar2 = aVar3.e;
                if (eVar2.m) {
                    eVar2.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar3.d.o0 = barrier.getAllowsGoneWidget();
                    aVar3.d.j0 = barrier.getReferencedIds();
                    aVar3.d.g0 = barrier.getType();
                    aVar3.d.h0 = barrier.getMargin();
                }
            }
            i++;
            dVar = this;
        }
    }

    public final int[] d(View view, String str) {
        int i;
        Object c2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c2 = ((ConstraintLayout) view.getParent()).c(0, trim)) != null && (c2 instanceof Integer)) {
                i = ((Integer) c2).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x012e, code lost:
        if (r8 == (-1)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e0, code lost:
        if (r8 == (-1)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e2, code lost:
        r8 = r1.getInt(r14, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a.f.c.d.a e(android.content.Context r18, android.util.AttributeSet r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 2754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.c.d.e(android.content.Context, android.util.AttributeSet, boolean):a.f.c.d$a");
    }

    public void f(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a e2 = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        e2.d.f469a = true;
                    }
                    this.f462c.put(Integer.valueOf(e2.f463a), e2);
                    continue;
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }
}
