package a.l.b;

import a.n.f;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: b  reason: collision with root package name */
    public int f851b;

    /* renamed from: c  reason: collision with root package name */
    public int f852c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList<String> m;
    public ArrayList<String> n;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f850a = new ArrayList<>();
    public boolean o = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f853a;

        /* renamed from: b  reason: collision with root package name */
        public m f854b;

        /* renamed from: c  reason: collision with root package name */
        public int f855c;
        public int d;
        public int e;
        public int f;
        public f.b g;
        public f.b h;

        public a() {
        }

        public a(int i, m mVar) {
            this.f853a = i;
            this.f854b = mVar;
            f.b bVar = f.b.RESUMED;
            this.g = bVar;
            this.h = bVar;
        }
    }

    public j0(x xVar, ClassLoader classLoader) {
    }

    public void b(a aVar) {
        this.f850a.add(aVar);
        aVar.f855c = this.f851b;
        aVar.d = this.f852c;
        aVar.e = this.d;
        aVar.f = this.e;
    }
}
