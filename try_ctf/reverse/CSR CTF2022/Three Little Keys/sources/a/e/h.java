package a.e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class h<K, V> {
    public static Object[] d;
    public static int e;
    public static Object[] f;
    public static int g;

    /* renamed from: a  reason: collision with root package name */
    public int[] f356a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f357b;

    /* renamed from: c  reason: collision with root package name */
    public int f358c;

    public h() {
        this.f356a = d.f335a;
        this.f357b = d.f337c;
        this.f358c = 0;
    }

    public h(int i) {
        if (i == 0) {
            this.f356a = d.f335a;
            this.f357b = d.f337c;
        } else {
            a(i);
        }
        this.f358c = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (g < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f = objArr;
                    g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (h.class) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (h.class) {
                Object[] objArr = f;
                if (objArr != null) {
                    this.f357b = objArr;
                    f = (Object[]) objArr[0];
                    this.f356a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (h.class) {
                Object[] objArr2 = d;
                if (objArr2 != null) {
                    this.f357b = objArr2;
                    d = (Object[]) objArr2[0];
                    this.f356a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    e--;
                    return;
                }
            }
        }
        this.f356a = new int[i];
        this.f357b = new Object[i << 1];
    }

    public void b(int i) {
        int i2 = this.f358c;
        int[] iArr = this.f356a;
        if (iArr.length < i) {
            Object[] objArr = this.f357b;
            a(i);
            if (this.f358c > 0) {
                System.arraycopy(iArr, 0, this.f356a, 0, i2);
                System.arraycopy(objArr, 0, this.f357b, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.f358c == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.f358c;
        if (i > 0) {
            int[] iArr = this.f356a;
            Object[] objArr = this.f357b;
            this.f356a = d.f335a;
            this.f357b = d.f337c;
            this.f358c = 0;
            c(iArr, objArr, i);
        }
        if (this.f358c <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public int d(Object obj, int i) {
        int i2 = this.f358c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f356a, i2, i);
            if (a2 < 0 || obj.equals(this.f357b[a2 << 1])) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f356a[i3] == i) {
                if (obj.equals(this.f357b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.f356a[i4] == i; i4--) {
                if (obj.equals(this.f357b[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f358c != hVar.f358c) {
                return false;
            }
            for (int i = 0; i < this.f358c; i++) {
                try {
                    K h = h(i);
                    V k = k(i);
                    Object obj2 = hVar.get(h);
                    if (k == null) {
                        if (obj2 != null || !hVar.containsKey(h)) {
                            return false;
                        }
                    } else if (!k.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f358c != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f358c; i2++) {
                try {
                    K h2 = h(i2);
                    V k2 = k(i2);
                    Object obj3 = map.get(h2);
                    if (k2 == null) {
                        if (obj3 != null || !map.containsKey(h2)) {
                            return false;
                        }
                    } else if (!k2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i = this.f358c;
        if (i == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f356a, i, 0);
            if (a2 < 0 || this.f357b[a2 << 1] == null) {
                return a2;
            }
            int i2 = a2 + 1;
            while (i2 < i && this.f356a[i2] == 0) {
                if (this.f357b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = a2 - 1; i3 >= 0 && this.f356a[i3] == 0; i3--) {
                if (this.f357b[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int g(Object obj) {
        int i = this.f358c * 2;
        Object[] objArr = this.f357b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int e2 = e(obj);
        return e2 >= 0 ? (V) this.f357b[(e2 << 1) + 1] : v;
    }

    public K h(int i) {
        return (K) this.f357b[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.f356a;
        Object[] objArr = this.f357b;
        int i = this.f358c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public V i(int i) {
        Object[] objArr = this.f357b;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f358c;
        int i4 = 0;
        if (i3 <= 1) {
            c(this.f356a, objArr, i3);
            this.f356a = d.f335a;
            this.f357b = d.f337c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f356a;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f357b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.f357b;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                a(i6);
                if (i3 != this.f358c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f356a, 0, i);
                    System.arraycopy(objArr, 0, this.f357b, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr, i10, this.f356a, i, i11);
                    System.arraycopy(objArr, i10 << 1, this.f357b, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.f358c) {
            this.f358c = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public boolean isEmpty() {
        return this.f358c <= 0;
    }

    public V j(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f357b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V k(int i) {
        return (V) this.f357b[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int d2;
        int i2 = this.f358c;
        if (k == null) {
            d2 = f();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            d2 = d(k, hashCode);
        }
        if (d2 >= 0) {
            int i3 = (d2 << 1) + 1;
            Object[] objArr = this.f357b;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~d2;
        int[] iArr = this.f356a;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f357b;
            a(i5);
            if (i2 != this.f358c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f356a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f357b, 0, objArr2.length);
            }
            c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f356a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f357b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f358c - i4) << 1);
        }
        int i7 = this.f358c;
        if (i2 == i7) {
            int[] iArr4 = this.f356a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f357b;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f358c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return i(e2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 >= 0) {
            V k = k(e2);
            if (obj2 != k && (obj2 == null || !obj2.equals(k))) {
                return false;
            }
            i(e2);
            return true;
        }
        return false;
    }

    public V replace(K k, V v) {
        int e2 = e(k);
        if (e2 >= 0) {
            return j(e2, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int e2 = e(k);
        if (e2 >= 0) {
            V k2 = k(e2);
            if (k2 != v && (v == null || !v.equals(k2))) {
                return false;
            }
            j(e2, v2);
            return true;
        }
        return false;
    }

    public int size() {
        return this.f358c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f358c * 28);
        sb.append('{');
        for (int i = 0; i < this.f358c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K h = h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V k = k(i);
            if (k != this) {
                sb.append(k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
