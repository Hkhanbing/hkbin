package a.h.g;

import a.h.g.j;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class h implements Callable<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f563a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f564b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f565c;
    public final /* synthetic */ int d;

    public h(String str, Context context, e eVar, int i) {
        this.f563a = str;
        this.f564b = context;
        this.f565c = eVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public j.a call() {
        try {
            return j.a(this.f563a, this.f564b, this.f565c, this.d);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}
