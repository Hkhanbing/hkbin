package a.l.b;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public class o0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f882a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f883b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f884c;
    public final /* synthetic */ a.e.a d;
    public final /* synthetic */ View e;
    public final /* synthetic */ s0 f;
    public final /* synthetic */ Rect g;

    public o0(m mVar, m mVar2, boolean z, a.e.a aVar, View view, s0 s0Var, Rect rect) {
        this.f882a = mVar;
        this.f883b = mVar2;
        this.f884c = z;
        this.d = aVar;
        this.e = view;
        this.f = s0Var;
        this.g = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        q0.c(this.f882a, this.f883b, this.f884c, this.d, false);
        View view = this.e;
        if (view != null) {
            this.f.j(view, this.g);
        }
    }
}
