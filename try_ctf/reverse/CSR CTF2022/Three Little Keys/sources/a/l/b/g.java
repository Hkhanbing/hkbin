package a.l.b;

import a.h.f.a;
import a.l.b.c;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class g implements a.InterfaceC0014a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f830a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f831b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.b f832c;

    public g(c cVar, View view, ViewGroup viewGroup, c.b bVar) {
        this.f830a = view;
        this.f831b = viewGroup;
        this.f832c = bVar;
    }

    @Override // a.h.f.a.InterfaceC0014a
    public void a() {
        this.f830a.clearAnimation();
        this.f831b.endViewTransition(this.f830a);
        this.f832c.a();
    }
}
