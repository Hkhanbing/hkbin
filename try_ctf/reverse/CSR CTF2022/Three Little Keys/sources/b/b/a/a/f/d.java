package b.b.a.a.f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* loaded from: classes.dex */
public class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1416a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f1417b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1418c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ BottomAppBar e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.e = bottomAppBar;
        this.f1417b = actionMenuView;
        this.f1418c = i;
        this.d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f1416a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f1416a) {
            BottomAppBar bottomAppBar = this.e;
            int i = bottomAppBar.W;
            boolean z = i != 0;
            if (i != 0) {
                bottomAppBar.W = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.n(i);
            }
            BottomAppBar bottomAppBar2 = this.e;
            ActionMenuView actionMenuView = this.f1417b;
            int i2 = this.f1418c;
            boolean z2 = this.d;
            Objects.requireNonNull(bottomAppBar2);
            e eVar = new e(bottomAppBar2, actionMenuView, i2, z2);
            if (z) {
                actionMenuView.post(eVar);
            } else {
                eVar.run();
            }
        }
    }
}
