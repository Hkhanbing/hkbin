package a.h.i;

/* loaded from: classes.dex */
public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f603a;

    /* renamed from: b  reason: collision with root package name */
    public int f604b;

    public c(int i) {
        if (i > 0) {
            this.f603a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public T a() {
        int i = this.f604b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f603a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f604b = i - 1;
            return t;
        }
        return null;
    }

    public boolean b(T t) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f604b;
            if (i2 >= i) {
                z = false;
                break;
            } else if (this.f603a[i2] == t) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            Object[] objArr = this.f603a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f604b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
