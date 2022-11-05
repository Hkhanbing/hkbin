package a.h.g;

import a.h.g.j;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class f implements Callable<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f559a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f560b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f561c;
    public final /* synthetic */ int d;

    public f(String str, Context context, e eVar, int i) {
        this.f559a = str;
        this.f560b = context;
        this.f561c = eVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public j.a call() {
        return j.a(this.f559a, this.f560b, this.f561c, this.d);
    }
}
