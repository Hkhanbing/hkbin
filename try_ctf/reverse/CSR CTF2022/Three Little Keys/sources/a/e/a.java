package a.e;

import a.e.g;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends h<K, V> implements Map<K, V> {
    public g<K, V> h;

    /* renamed from: a.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0007a extends g<K, V> {
        public C0007a() {
        }

        @Override // a.e.g
        public void a() {
            a.this.clear();
        }

        @Override // a.e.g
        public Object b(int i, int i2) {
            return a.this.f357b[(i << 1) + i2];
        }

        @Override // a.e.g
        public Map<K, V> c() {
            return a.this;
        }

        @Override // a.e.g
        public int d() {
            return a.this.f358c;
        }

        @Override // a.e.g
        public int e(Object obj) {
            return a.this.e(obj);
        }

        @Override // a.e.g
        public int f(Object obj) {
            return a.this.g(obj);
        }

        @Override // a.e.g
        public void g(K k, V v) {
            a.this.put(k, v);
        }

        @Override // a.e.g
        public void h(int i) {
            a.this.i(i);
        }

        @Override // a.e.g
        public V i(int i, V v) {
            int i2 = (i << 1) + 1;
            Object[] objArr = a.this.f357b;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
    }

    public a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(h hVar) {
        if (hVar != null) {
            int i = hVar.f358c;
            b(this.f358c + i);
            if (this.f358c != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    put(hVar.h(i2), hVar.k(i2));
                }
            } else if (i > 0) {
                System.arraycopy(hVar.f356a, 0, this.f356a, 0, i);
                System.arraycopy(hVar.f357b, 0, this.f357b, 0, i << 1);
                this.f358c = i;
            }
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V> l = l();
        if (l.f344a == null) {
            l.f344a = new g.b();
        }
        return l.f344a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        g<K, V> l = l();
        if (l.f345b == null) {
            l.f345b = new g.c();
        }
        return l.f345b;
    }

    public final g<K, V> l() {
        if (this.h == null) {
            this.h = new C0007a();
        }
        return this.h;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f358c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        g<K, V> l = l();
        if (l.f346c == null) {
            l.f346c = new g.e();
        }
        return l.f346c;
    }
}
