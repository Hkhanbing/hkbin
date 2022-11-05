package a.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    public c<K, V> f318a;

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f319b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f320c = new WeakHashMap<>();
    public int d = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // a.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f323c;
        }
    }

    /* renamed from: a.c.a.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0006b<K, V> extends e<K, V> {
        public C0006b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f323c;
        }

        @Override // a.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f321a;

        /* renamed from: b  reason: collision with root package name */
        public final V f322b;

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f323c;
        public c<K, V> d;

        public c(K k, V v) {
            this.f321a = k;
            this.f322b = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f321a.equals(cVar.f321a) && this.f322b.equals(cVar.f322b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f321a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f322b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f321a.hashCode() ^ this.f322b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f321a + "=" + this.f322b;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f324a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f325b = true;

        public d() {
        }

        @Override // a.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f324a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.d;
                this.f324a = cVar3;
                this.f325b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f325b) {
                return b.this.f318a != null;
            }
            c<K, V> cVar = this.f324a;
            return (cVar == null || cVar.f323c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar;
            if (this.f325b) {
                this.f325b = false;
                cVar = b.this.f318a;
            } else {
                c<K, V> cVar2 = this.f324a;
                cVar = cVar2 != null ? cVar2.f323c : null;
            }
            this.f324a = cVar;
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f327a;

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f328b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f327a = cVar2;
            this.f328b = cVar;
        }

        @Override // a.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f327a == cVar && cVar == this.f328b) {
                this.f328b = null;
                this.f327a = null;
            }
            c<K, V> cVar3 = this.f327a;
            if (cVar3 == cVar) {
                this.f327a = b(cVar3);
            }
            c<K, V> cVar4 = this.f328b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f327a;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f328b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f328b != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f328b;
            c<K, V> cVar2 = this.f327a;
            this.f328b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k) {
        c<K, V> cVar = this.f318a;
        while (cVar != null && !cVar.f321a.equals(k)) {
            cVar = cVar.f323c;
        }
        return cVar;
    }

    public b<K, V>.d b() {
        b<K, V>.d dVar = new d();
        this.f320c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public c<K, V> c(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.d++;
        c<K, V> cVar2 = this.f319b;
        if (cVar2 == null) {
            this.f318a = cVar;
        } else {
            cVar2.f323c = cVar;
            cVar.d = cVar2;
        }
        this.f319b = cVar;
        return cVar;
    }

    public V d(K k, V v) {
        c<K, V> a2 = a(k);
        if (a2 != null) {
            return a2.f322b;
        }
        c(k, v);
        return null;
    }

    public V e(K k) {
        c<K, V> a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.d--;
        if (!this.f320c.isEmpty()) {
            for (f<K, V> fVar : this.f320c.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.d;
        c<K, V> cVar2 = a2.f323c;
        if (cVar != null) {
            cVar.f323c = cVar2;
        } else {
            this.f318a = cVar2;
        }
        c<K, V> cVar3 = a2.f323c;
        if (cVar3 != null) {
            cVar3.d = cVar;
        } else {
            this.f319b = cVar;
        }
        a2.f323c = null;
        a2.d = null;
        return a2.f322b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((a.c.a.b.b.e) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof a.c.a.b.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.c.a.b.b r7 = (a.c.a.b.b) r7
            int r1 = r6.d
            int r3 = r7.d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            a.c.a.b.b$e r3 = (a.c.a.b.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            a.c.a.b.b$e r4 = (a.c.a.b.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            a.c.a.b.b$e r7 = (a.c.a.b.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c.a.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                i += ((Map.Entry) eVar.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f318a, this.f319b);
        this.f320c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder f2 = b.a.a.a.a.f("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                f2.append("]");
                return f2.toString();
            }
            f2.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                f2.append(", ");
            }
        }
    }
}
