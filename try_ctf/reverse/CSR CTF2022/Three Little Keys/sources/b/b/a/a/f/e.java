package b.b.a.a.f;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f1419a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1420b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1421c;
    public final /* synthetic */ BottomAppBar d;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.d = bottomAppBar;
        this.f1419a = actionMenuView;
        this.f1420b = i;
        this.f1421c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        ActionMenuView actionMenuView = this.f1419a;
        actionMenuView.setTranslationX(this.d.B(actionMenuView, this.f1420b, this.f1421c));
    }
}
