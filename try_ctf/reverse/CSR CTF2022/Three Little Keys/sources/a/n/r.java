package a.n;

import a.n.f;
import a.n.t;
import android.os.Handler;

/* loaded from: classes.dex */
public class r implements j {
    public static final r i = new r();
    public Handler e;

    /* renamed from: a  reason: collision with root package name */
    public int f975a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f976b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f977c = true;
    public boolean d = true;
    public final k f = new k(this);
    public Runnable g = new a();
    public t.a h = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r rVar = r.this;
            if (rVar.f976b == 0) {
                rVar.f977c = true;
                rVar.f.d(f.a.ON_PAUSE);
            }
            r rVar2 = r.this;
            if (rVar2.f975a != 0 || !rVar2.f977c) {
                return;
            }
            rVar2.f.d(f.a.ON_STOP);
            rVar2.d = true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements t.a {
        public b() {
        }
    }

    @Override // a.n.j
    public f a() {
        return this.f;
    }

    public void b() {
        int i2 = this.f976b + 1;
        this.f976b = i2;
        if (i2 == 1) {
            if (!this.f977c) {
                this.e.removeCallbacks(this.g);
                return;
            }
            this.f.d(f.a.ON_RESUME);
            this.f977c = false;
        }
    }

    public void e() {
        int i2 = this.f975a + 1;
        this.f975a = i2;
        if (i2 != 1 || !this.d) {
            return;
        }
        this.f.d(f.a.ON_START);
        this.d = false;
    }
}
