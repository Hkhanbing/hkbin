package a.b.f;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    public int f296a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f297b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f298c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public void a(int i, int i2) {
        this.f298c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f296a = i2;
            }
            if (i == Integer.MIN_VALUE) {
                return;
            }
            this.f297b = i;
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f296a = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            return;
        }
        this.f297b = i2;
    }
}
