package a.p.b;

import a.h.j.d0.d;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class x extends a.h.j.c {
    public final RecyclerView d;
    public final a e;

    /* loaded from: classes.dex */
    public static class a extends a.h.j.c {
        public final x d;
        public Map<View, a.h.j.c> e = new WeakHashMap();

        public a(x xVar) {
            this.d = xVar;
        }

        @Override // a.h.j.c
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            a.h.j.c cVar = this.e.get(view);
            return cVar != null ? cVar.a(view, accessibilityEvent) : this.f621a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // a.h.j.c
        public a.h.j.d0.e b(View view) {
            a.h.j.c cVar = this.e.get(view);
            return cVar != null ? cVar.b(view) : super.b(view);
        }

        @Override // a.h.j.c
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            a.h.j.c cVar = this.e.get(view);
            if (cVar != null) {
                cVar.c(view, accessibilityEvent);
            } else {
                this.f621a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // a.h.j.c
        public void d(View view, a.h.j.d0.d dVar) {
            if (!this.d.j() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().l0(view, dVar);
                a.h.j.c cVar = this.e.get(view);
                if (cVar != null) {
                    cVar.d(view, dVar);
                    return;
                }
            }
            this.f621a.onInitializeAccessibilityNodeInfo(view, dVar.f633a);
        }

        @Override // a.h.j.c
        public void e(View view, AccessibilityEvent accessibilityEvent) {
            a.h.j.c cVar = this.e.get(view);
            if (cVar != null) {
                cVar.e(view, accessibilityEvent);
            } else {
                this.f621a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // a.h.j.c
        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            a.h.j.c cVar = this.e.get(viewGroup);
            return cVar != null ? cVar.f(viewGroup, view, accessibilityEvent) : this.f621a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // a.h.j.c
        public boolean g(View view, int i, Bundle bundle) {
            if (!this.d.j() && this.d.d.getLayoutManager() != null) {
                a.h.j.c cVar = this.e.get(view);
                if (cVar != null) {
                    if (cVar.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                RecyclerView.l layoutManager = this.d.d.getLayoutManager();
                RecyclerView.r rVar = layoutManager.f1306b.f1293b;
                return layoutManager.D0();
            }
            return super.g(view, i, bundle);
        }

        @Override // a.h.j.c
        public void h(View view, int i) {
            a.h.j.c cVar = this.e.get(view);
            if (cVar != null) {
                cVar.h(view, i);
            } else {
                this.f621a.sendAccessibilityEvent(view, i);
            }
        }

        @Override // a.h.j.c
        public void i(View view, AccessibilityEvent accessibilityEvent) {
            a.h.j.c cVar = this.e.get(view);
            if (cVar != null) {
                cVar.i(view, accessibilityEvent);
            } else {
                this.f621a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public x(RecyclerView recyclerView) {
        this.d = recyclerView;
        a aVar = this.e;
        this.e = aVar == null ? new a(this) : aVar;
    }

    @Override // a.h.j.c
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f621a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || j()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().j0(accessibilityEvent);
    }

    @Override // a.h.j.c
    public void d(View view, a.h.j.d0.d dVar) {
        this.f621a.onInitializeAccessibilityNodeInfo(view, dVar.f633a);
        if (j() || this.d.getLayoutManager() == null) {
            return;
        }
        RecyclerView.l layoutManager = this.d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f1306b;
        RecyclerView.r rVar = recyclerView.f1293b;
        RecyclerView.w wVar = recyclerView.e0;
        if (recyclerView.canScrollVertically(-1) || layoutManager.f1306b.canScrollHorizontally(-1)) {
            dVar.f633a.addAction(8192);
            dVar.f633a.setScrollable(true);
        }
        if (layoutManager.f1306b.canScrollVertically(1) || layoutManager.f1306b.canScrollHorizontally(1)) {
            dVar.f633a.addAction(4096);
            dVar.f633a.setScrollable(true);
        }
        dVar.h(d.b.a(layoutManager.T(rVar, wVar), layoutManager.A(rVar, wVar), layoutManager.X(), layoutManager.U()));
    }

    @Override // a.h.j.c
    public boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        if (j() || this.d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.l layoutManager = this.d.getLayoutManager();
        RecyclerView.r rVar = layoutManager.f1306b.f1293b;
        return layoutManager.C0(i);
    }

    public boolean j() {
        return this.d.M();
    }
}
