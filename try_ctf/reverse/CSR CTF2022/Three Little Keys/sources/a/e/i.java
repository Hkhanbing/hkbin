package a.e;

/* loaded from: classes.dex */
public class i<E> implements Cloneable {
    public static final Object d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public int[] f359a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f360b;

    /* renamed from: c  reason: collision with root package name */
    public int f361c;

    public i() {
        int e = d.e(10);
        this.f359a = new int[e];
        this.f360b = new Object[e];
    }

    public void a(int i, E e) {
        int i2 = this.f361c;
        if (i2 != 0 && i <= this.f359a[i2 - 1]) {
            f(i, e);
            return;
        }
        if (i2 >= this.f359a.length) {
            int e2 = d.e(i2 + 1);
            int[] iArr = new int[e2];
            Object[] objArr = new Object[e2];
            int[] iArr2 = this.f359a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f360b;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f359a = iArr;
            this.f360b = objArr;
        }
        this.f359a[i2] = i;
        this.f360b[i2] = e;
        this.f361c = i2 + 1;
    }

    /* renamed from: b */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f359a = (int[]) this.f359a.clone();
            iVar.f360b = (Object[]) this.f360b.clone();
            return iVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E c(int i) {
        return d(i, null);
    }

    public E d(int i, E e) {
        int a2 = d.a(this.f359a, this.f361c, i);
        if (a2 >= 0) {
            Object[] objArr = this.f360b;
            if (objArr[a2] != d) {
                return (E) objArr[a2];
            }
        }
        return e;
    }

    public int e(int i) {
        return this.f359a[i];
    }

    public void f(int i, E e) {
        int a2 = d.a(this.f359a, this.f361c, i);
        if (a2 >= 0) {
            this.f360b[a2] = e;
            return;
        }
        int i2 = ~a2;
        int i3 = this.f361c;
        if (i2 < i3) {
            Object[] objArr = this.f360b;
            if (objArr[i2] == d) {
                this.f359a[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (i3 >= this.f359a.length) {
            int e2 = d.e(i3 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f359a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f360b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f359a = iArr;
            this.f360b = objArr2;
        }
        int i4 = this.f361c - i2;
        if (i4 != 0) {
            int[] iArr3 = this.f359a;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4);
            Object[] objArr4 = this.f360b;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f361c - i2);
        }
        this.f359a[i2] = i;
        this.f360b[i2] = e;
        this.f361c++;
    }

    public int g() {
        return this.f361c;
    }

    public E h(int i) {
        return (E) this.f360b[i];
    }

    public String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f361c * 28);
        sb.append('{');
        for (int i = 0; i < this.f361c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(e(i));
            sb.append('=');
            E h = h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
