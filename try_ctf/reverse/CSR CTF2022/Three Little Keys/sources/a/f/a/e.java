package a.f.a;

/* loaded from: classes.dex */
public class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f374a;

    /* renamed from: b  reason: collision with root package name */
    public int f375b;

    public e(int i) {
        if (i > 0) {
            this.f374a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T a() {
        int i = this.f375b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f374a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f375b = i - 1;
            return t;
        }
        return null;
    }

    public boolean b(T t) {
        int i = this.f375b;
        Object[] objArr = this.f374a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.f375b = i + 1;
            return true;
        }
        return false;
    }
}
