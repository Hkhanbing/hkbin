package a.a.e;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public Random f6a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, String> f7b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Integer> f8c = new HashMap();
    public final Map<String, c> d = new HashMap();
    public ArrayList<String> e = new ArrayList<>();
    public final transient Map<String, b<?>> f = new HashMap();
    public final Map<String, Object> g = new HashMap();
    public final Bundle h = new Bundle();

    /* loaded from: classes.dex */
    public class a extends a.a.e.c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9a;

        public a(String str, int i, a.a.e.f.a aVar) {
            this.f9a = str;
        }

        @Override // a.a.e.c
        public void a() {
            d.this.c(this.f9a);
        }
    }

    /* loaded from: classes.dex */
    public static class b<O> {

        /* renamed from: a  reason: collision with root package name */
        public final a.a.e.b<O> f11a;

        /* renamed from: b  reason: collision with root package name */
        public final a.a.e.f.a<?, O> f12b;

        public b(a.a.e.b<O> bVar, a.a.e.f.a<?, O> aVar) {
            this.f11a = bVar;
            this.f12b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    public final boolean a(int i, int i2, Intent intent) {
        a.a.e.b<?> bVar;
        String str = this.f7b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.e.remove(str);
        b<?> bVar2 = this.f.get(str);
        if (bVar2 != null && (bVar = bVar2.f11a) != null) {
            bVar.a(bVar2.f12b.a(i2, intent));
            return true;
        }
        this.g.remove(str);
        this.h.putParcelable(str, new a.a.e.a(i2, intent));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> a.a.e.c<I> b(String str, a.a.e.f.a<I, O> aVar, a.a.e.b<O> bVar) {
        int i;
        Integer num = this.f8c.get(str);
        if (num != null) {
            i = num.intValue();
        } else {
            int nextInt = this.f6a.nextInt(2147418112);
            while (true) {
                i = nextInt + 65536;
                if (!this.f7b.containsKey(Integer.valueOf(i))) {
                    break;
                }
                nextInt = this.f6a.nextInt(2147418112);
            }
            this.f7b.put(Integer.valueOf(i), str);
            this.f8c.put(str, Integer.valueOf(i));
        }
        this.f.put(str, new b<>(bVar, aVar));
        if (this.g.containsKey(str)) {
            Object obj = this.g.get(str);
            this.g.remove(str);
            bVar.a(obj);
        }
        a.a.e.a aVar2 = (a.a.e.a) this.h.getParcelable(str);
        if (aVar2 != null) {
            this.h.remove(str);
            bVar.a(aVar.a(aVar2.f4a, aVar2.f5b));
        }
        return new a(str, i, aVar);
    }

    public final void c(String str) {
        Integer remove;
        if (!this.e.contains(str) && (remove = this.f8c.remove(str)) != null) {
            this.f7b.remove(remove);
        }
        this.f.remove(str);
        if (this.g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.g.get(str));
            this.g.remove(str);
        }
        if (this.h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.h.getParcelable(str));
            this.h.remove(str);
        }
        if (this.d.get(str) == null) {
            return;
        }
        throw null;
    }
}
