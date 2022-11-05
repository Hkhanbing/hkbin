package a.l.b;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s0 f843a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f844b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Rect f845c;

    public i(c cVar, s0 s0Var, View view, Rect rect) {
        this.f843a = s0Var;
        this.f844b = view;
        this.f845c = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f843a.j(this.f844b, this.f845c);
    }
}
