package a.p.b;

import android.view.View;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f995a;

    /* renamed from: b  reason: collision with root package name */
    public a f996b = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f997a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f998b;

        /* renamed from: c  reason: collision with root package name */
        public int f999c;
        public int d;
        public int e;

        public boolean a() {
            int i = this.f997a;
            if ((i & 7) == 0 || (i & (b(this.d, this.f998b) << 0)) != 0) {
                int i2 = this.f997a;
                if ((i2 & 112) != 0 && (i2 & (b(this.d, this.f999c) << 4)) == 0) {
                    return false;
                }
                int i3 = this.f997a;
                if ((i3 & 1792) != 0 && (i3 & (b(this.e, this.f998b) << 8)) == 0) {
                    return false;
                }
                int i4 = this.f997a;
                return (i4 & 28672) == 0 || (i4 & (b(this.e, this.f999c) << 12)) != 0;
            }
            return false;
        }

        public int b(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a();

        int b();

        int c(View view);

        int d(View view);

        View e(int i);
    }

    public a0(b bVar) {
        this.f995a = bVar;
    }

    public View a(int i, int i2, int i3, int i4) {
        int b2 = this.f995a.b();
        int a2 = this.f995a.a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View e = this.f995a.e(i);
            int d = this.f995a.d(e);
            int c2 = this.f995a.c(e);
            a aVar = this.f996b;
            aVar.f998b = b2;
            aVar.f999c = a2;
            aVar.d = d;
            aVar.e = c2;
            if (i3 != 0) {
                aVar.f997a = 0;
                aVar.f997a = i3 | 0;
                if (aVar.a()) {
                    return e;
                }
            }
            if (i4 != 0) {
                a aVar2 = this.f996b;
                aVar2.f997a = 0;
                aVar2.f997a = i4 | 0;
                if (aVar2.a()) {
                    view = e;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean b(View view, int i) {
        a aVar = this.f996b;
        int b2 = this.f995a.b();
        int a2 = this.f995a.a();
        int d = this.f995a.d(view);
        int c2 = this.f995a.c(view);
        aVar.f998b = b2;
        aVar.f999c = a2;
        aVar.d = d;
        aVar.e = c2;
        if (i != 0) {
            a aVar2 = this.f996b;
            aVar2.f997a = 0;
            aVar2.f997a = 0 | i;
            return aVar2.a();
        }
        return false;
    }
}
