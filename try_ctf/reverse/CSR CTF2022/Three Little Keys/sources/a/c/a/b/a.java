package a.c.a.b;

import a.c.a.b.b;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {
    public HashMap<K, b.c<K, V>> e = new HashMap<>();

    @Override // a.c.a.b.b
    public b.c<K, V> a(K k) {
        return this.e.get(k);
    }

    public boolean contains(K k) {
        return this.e.containsKey(k);
    }

    @Override // a.c.a.b.b
    public V d(K k, V v) {
        b.c<K, V> cVar = this.e.get(k);
        if (cVar != null) {
            return cVar.f322b;
        }
        this.e.put(k, c(k, v));
        return null;
    }

    @Override // a.c.a.b.b
    public V e(K k) {
        V v = (V) super.e(k);
        this.e.remove(k);
        return v;
    }
}
