package b.b.a.a.d;

import a.h.j.d0.f;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public class d implements a.h.j.d0.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f1398a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f1399b;

    public d(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.f1398a = appBarLayout;
        this.f1399b = z;
    }

    @Override // a.h.j.d0.f
    public boolean a(View view, f.a aVar) {
        this.f1398a.setExpanded(this.f1399b);
        return true;
    }
}
