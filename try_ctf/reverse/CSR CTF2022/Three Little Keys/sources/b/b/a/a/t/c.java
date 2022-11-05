package b.b.a.a.t;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f1567a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextPaint f1568b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f1569c;
    public final /* synthetic */ b d;

    public c(b bVar, Context context, TextPaint textPaint, d dVar) {
        this.d = bVar;
        this.f1567a = context;
        this.f1568b = textPaint;
        this.f1569c = dVar;
    }

    @Override // b.b.a.a.t.d
    public void a(int i) {
        this.f1569c.a(i);
    }

    @Override // b.b.a.a.t.d
    public void b(Typeface typeface, boolean z) {
        this.d.g(this.f1567a, this.f1568b, typeface);
        this.f1569c.b(typeface, z);
    }
}
