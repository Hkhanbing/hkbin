package b.b.a.a.d;

import a.h.j.d0.f;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public class c implements a.h.j.d0.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f1395a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f1396b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1397c;
    public final /* synthetic */ int d;
    public final /* synthetic */ AppBarLayout.BaseBehavior e;

    public c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.e = baseBehavior;
        this.f1395a = coordinatorLayout;
        this.f1396b = appBarLayout;
        this.f1397c = view;
        this.d = i;
    }

    @Override // a.h.j.d0.f
    public boolean a(View view, f.a aVar) {
        this.e.L(this.f1395a, this.f1396b, this.f1397c, this.d, new int[]{0, 0});
        return true;
    }
}
