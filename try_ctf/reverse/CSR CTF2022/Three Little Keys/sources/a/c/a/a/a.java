package a.c.a.a;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f312c;

    /* renamed from: a  reason: collision with root package name */
    public c f313a;

    /* renamed from: b  reason: collision with root package name */
    public c f314b;

    public a() {
        b bVar = new b();
        this.f314b = bVar;
        this.f313a = bVar;
    }

    public static a b() {
        if (f312c != null) {
            return f312c;
        }
        synchronized (a.class) {
            if (f312c == null) {
                f312c = new a();
            }
        }
        return f312c;
    }

    @Override // a.c.a.a.c
    public boolean a() {
        return this.f313a.a();
    }
}
