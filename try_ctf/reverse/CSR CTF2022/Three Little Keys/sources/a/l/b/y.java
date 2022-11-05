package a.l.b;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public abstract class y<E> extends v {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f946a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f947b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f948c;
    public final b0 d;

    public y(p pVar) {
        Handler handler = new Handler();
        this.d = new c0();
        this.f946a = pVar;
        a.h.b.b.g(pVar, "context == null");
        this.f947b = pVar;
        a.h.b.b.g(handler, "handler == null");
        this.f948c = handler;
    }

    public abstract E i();

    public abstract LayoutInflater j();

    public abstract boolean k(m mVar);

    public abstract void l();
}
