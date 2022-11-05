package a.e;

import a.e.g;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c<E> implements Collection<E>, Set<E> {
    public static final int[] e = new int[0];
    public static final Object[] f = new Object[0];
    public static Object[] g;
    public static int h;
    public static Object[] i;
    public static int j;

    /* renamed from: a  reason: collision with root package name */
    public int[] f332a = e;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f333b = f;

    /* renamed from: c  reason: collision with root package name */
    public int f334c = 0;
    public g<E, E> d;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (j < 10) {
                    objArr[0] = i;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    i = objArr;
                    j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                Object[] objArr = i;
                if (objArr != null) {
                    this.f333b = objArr;
                    i = (Object[]) objArr[0];
                    this.f332a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    j--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = g;
                if (objArr2 != null) {
                    this.f333b = objArr2;
                    g = (Object[]) objArr2[0];
                    this.f332a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    h--;
                    return;
                }
            }
        }
        this.f332a = new int[i2];
        this.f333b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int d;
        if (e2 == null) {
            d = e();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            d = d(e2, hashCode);
        }
        if (d >= 0) {
            return false;
        }
        int i3 = ~d;
        int i4 = this.f334c;
        int[] iArr = this.f332a;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f333b;
            a(i5);
            int[] iArr2 = this.f332a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f333b, 0, objArr.length);
            }
            b(iArr, objArr, this.f334c);
        }
        int i6 = this.f334c;
        if (i3 < i6) {
            int[] iArr3 = this.f332a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f333b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f334c - i3);
        }
        this.f332a[i3] = i2;
        this.f333b[i3] = e2;
        this.f334c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f334c;
        int[] iArr = this.f332a;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f333b;
            a(size);
            int i2 = this.f334c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f332a, 0, i2);
                System.arraycopy(objArr, 0, this.f333b, 0, this.f334c);
            }
            b(iArr, objArr, this.f334c);
        }
        for (E e2 : collection) {
            z |= add(e2);
        }
        return z;
    }

    public int c(Object obj) {
        return obj == null ? e() : d(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f334c;
        if (i2 != 0) {
            b(this.f332a, this.f333b, i2);
            this.f332a = e;
            this.f333b = f;
            this.f334c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return c(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d(Object obj, int i2) {
        int i3 = this.f334c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = d.a(this.f332a, i3, i2);
        if (a2 < 0 || obj.equals(this.f333b[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f332a[i4] == i2) {
            if (obj.equals(this.f333b[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.f332a[i5] == i2; i5--) {
            if (obj.equals(this.f333b[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    public final int e() {
        int i2 = this.f334c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = d.a(this.f332a, i2, 0);
        if (a2 < 0 || this.f333b[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f332a[i3] == 0) {
            if (this.f333b[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f332a[i4] == 0; i4--) {
            if (this.f333b[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f334c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f334c; i2++) {
                try {
                    if (!set.contains(this.f333b[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E f(int i2) {
        Object[] objArr = this.f333b;
        E e2 = (E) objArr[i2];
        int i3 = this.f334c;
        if (i3 <= 1) {
            b(this.f332a, objArr, i3);
            this.f332a = e;
            this.f333b = f;
            this.f334c = 0;
        } else {
            int[] iArr = this.f332a;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.f334c = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr2 = this.f333b;
                    System.arraycopy(objArr2, i6, objArr2, i2, this.f334c - i2);
                }
                this.f333b[this.f334c] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                a(i4);
                this.f334c--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f332a, 0, i2);
                    System.arraycopy(objArr, 0, this.f333b, 0, i2);
                }
                int i7 = this.f334c;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.f332a, i2, i7 - i2);
                    System.arraycopy(objArr, i8, this.f333b, i2, this.f334c - i2);
                }
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f332a;
        int i2 = this.f334c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f334c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.d == null) {
            this.d = new b(this);
        }
        g<E, E> gVar = this.d;
        if (gVar.f345b == null) {
            gVar.f345b = new g.c();
        }
        return gVar.f345b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int c2 = c(obj);
        if (c2 >= 0) {
            f(c2);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f334c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f333b[i2])) {
                f(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f334c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f334c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f333b, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f334c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f334c));
        }
        System.arraycopy(this.f333b, 0, tArr, 0, this.f334c);
        int length = tArr.length;
        int i2 = this.f334c;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f334c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f334c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f333b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
