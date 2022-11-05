package com.google.android.material.transformation;

import a.h.j.w;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f1760a;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1761a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1762b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b.b.a.a.p.a f1763c;

        public a(View view, int i, b.b.a.a.p.a aVar) {
            this.f1761a = view;
            this.f1762b = i;
            this.f1763c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f1761a.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f1760a == this.f1762b) {
                b.b.a.a.p.a aVar = this.f1763c;
                expandableBehavior.C((View) aVar, this.f1761a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f1760a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1760a = 0;
    }

    public final boolean B(boolean z) {
        if (!z) {
            return this.f1760a == 1;
        }
        int i = this.f1760a;
        return i == 0 || i == 2;
    }

    public abstract boolean C(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b.b.a.a.p.a aVar = (b.b.a.a.p.a) view2;
        if (B(aVar.a())) {
            this.f1760a = aVar.a() ? 1 : 2;
            return C((View) aVar, view, aVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        b.b.a.a.p.a aVar;
        AtomicInteger atomicInteger = w.f667a;
        if (!w.g.c(view)) {
            List<View> d = coordinatorLayout.d(view);
            int size = d.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = d.get(i2);
                if (d(coordinatorLayout, view, view2)) {
                    aVar = (b.b.a.a.p.a) view2;
                    break;
                }
                i2++;
            }
            if (aVar != null && B(aVar.a())) {
                int i3 = aVar.a() ? 1 : 2;
                this.f1760a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i3, aVar));
            }
        }
        return false;
    }
}
