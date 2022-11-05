package a.h.i;

/* loaded from: classes.dex */
public class d<T> extends c<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Object f605c;

    public d(int i) {
        super(i);
        this.f605c = new Object();
    }

    @Override // a.h.i.c
    public T a() {
        T t;
        synchronized (this.f605c) {
            t = (T) super.a();
        }
        return t;
    }

    @Override // a.h.i.c
    public boolean b(T t) {
        boolean b2;
        synchronized (this.f605c) {
            b2 = super.b(t);
        }
        return b2;
    }
}
