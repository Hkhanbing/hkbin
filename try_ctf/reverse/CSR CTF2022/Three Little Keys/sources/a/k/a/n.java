package a.k.a;

import android.graphics.Typeface;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final a.k.a.q.b f747a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f748b;

    /* renamed from: c  reason: collision with root package name */
    public final a f749c = new a(1024);
    public final Typeface d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f750a;

        /* renamed from: b  reason: collision with root package name */
        public j f751b;

        public a() {
            this.f750a = new SparseArray<>(1);
        }

        public a(int i) {
            this.f750a = new SparseArray<>(i);
        }

        public void a(j jVar, int i, int i2) {
            int a2 = jVar.a(i);
            SparseArray<a> sparseArray = this.f750a;
            a aVar = sparseArray == null ? null : sparseArray.get(a2);
            if (aVar == null) {
                aVar = new a();
                this.f750a.put(jVar.a(i), aVar);
            }
            if (i2 > i) {
                aVar.a(jVar, i + 1, i2);
            } else {
                aVar.f751b = jVar;
            }
        }
    }

    public n(Typeface typeface, a.k.a.q.b bVar) {
        this.d = typeface;
        this.f747a = bVar;
        this.f748b = new char[bVar.c() * 2];
        int c2 = bVar.c();
        for (int i = 0; i < c2; i++) {
            j jVar = new j(this, i);
            Character.toChars(jVar.d(), this.f748b, i * 2);
            a.h.b.b.g(jVar, "emoji metadata cannot be null");
            a.h.b.b.d(jVar.b() > 0, "invalid metadata codepoint length");
            this.f749c.a(jVar, 0, jVar.b() - 1);
        }
    }
}
