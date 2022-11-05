package b.b.a.a.t;

import android.graphics.Typeface;
import b.b.a.a.r.e;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f1559a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0040a f1560b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1561c;

    /* renamed from: b.b.a.a.t.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0040a {
    }

    public a(InterfaceC0040a interfaceC0040a, Typeface typeface) {
        this.f1559a = typeface;
        this.f1560b = interfaceC0040a;
    }

    @Override // b.b.a.a.t.d
    public void a(int i) {
        c(this.f1559a);
    }

    @Override // b.b.a.a.t.d
    public void b(Typeface typeface, boolean z) {
        c(typeface);
    }

    public final void c(Typeface typeface) {
        if (!this.f1561c) {
            e eVar = ((b.b.a.a.r.d) this.f1560b).f1530a;
            if (!eVar.o(typeface)) {
                return;
            }
            eVar.k(false);
        }
    }
}
