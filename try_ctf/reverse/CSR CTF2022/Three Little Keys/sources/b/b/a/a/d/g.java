package b.b.a.a.d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class g<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public h f1405a;

    /* renamed from: b  reason: collision with root package name */
    public int f1406b;

    public g() {
        this.f1406b = 0;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1406b = 0;
    }

    public int B() {
        h hVar = this.f1405a;
        if (hVar != null) {
            return hVar.d;
        }
        return 0;
    }

    public void C(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.r(v, i);
    }

    public boolean D(int i) {
        h hVar = this.f1405a;
        if (hVar != null) {
            if (hVar.d == i) {
                return false;
            }
            hVar.d = i;
            hVar.a();
            return true;
        }
        this.f1406b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
        C(coordinatorLayout, v, i);
        if (this.f1405a == null) {
            this.f1405a = new h(v);
        }
        h hVar = this.f1405a;
        hVar.f1408b = hVar.f1407a.getTop();
        hVar.f1409c = hVar.f1407a.getLeft();
        this.f1405a.a();
        int i2 = this.f1406b;
        if (i2 != 0) {
            h hVar2 = this.f1405a;
            if (hVar2.d != i2) {
                hVar2.d = i2;
                hVar2.a();
            }
            this.f1406b = 0;
            return true;
        }
        return true;
    }
}
