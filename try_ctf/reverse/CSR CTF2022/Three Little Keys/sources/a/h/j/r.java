package a.h.j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f664a;

    /* renamed from: b  reason: collision with root package name */
    public ViewTreeObserver f665b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f666c;

    public r(View view, Runnable runnable) {
        this.f664a = view;
        this.f665b = view.getViewTreeObserver();
        this.f666c = runnable;
    }

    public static r a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        r rVar = new r(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(rVar);
        view.addOnAttachStateChangeListener(rVar);
        return rVar;
    }

    public void b() {
        (this.f665b.isAlive() ? this.f665b : this.f664a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f664a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f666c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f665b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
