package b.b.a.a.g;

import a.h.j.d0.f;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1429a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f1430b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f1430b = bottomSheetBehavior;
        this.f1429a = i;
    }

    @Override // a.h.j.d0.f
    public boolean a(View view, f.a aVar) {
        this.f1430b.K(this.f1429a);
        return true;
    }
}
