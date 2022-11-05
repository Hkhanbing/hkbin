package a.h.g;

import a.h.c.b.h;
import a.h.d.e;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f549a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f550b;

    public a(c cVar, m mVar, Typeface typeface) {
        this.f549a = mVar;
        this.f550b = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        m mVar = this.f549a;
        Typeface typeface = this.f550b;
        h.c cVar = ((e.a) mVar).f541a;
        if (cVar != null) {
            cVar.e(typeface);
        }
    }
}
