package a.p.b;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class o extends RecyclerView.v {
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public o(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void c(View view, RecyclerView.w wVar, RecyclerView.v.a aVar) {
        int i;
        int i2;
        int i3;
        PointF pointF = this.k;
        int i4 = 0;
        int i5 = (pointF == null || pointF.x == 0.0f) ? 0 : i3 > 0 ? 1 : -1;
        RecyclerView.l lVar = this.f1328c;
        if (lVar == null || !lVar.e()) {
            i = 0;
        } else {
            RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
            i = e(lVar.D(view) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin, lVar.G(view) + ((ViewGroup.MarginLayoutParams) mVar).rightMargin, lVar.O(), lVar.p - lVar.P(), i5);
        }
        PointF pointF2 = this.k;
        int i6 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : i2 > 0 ? 1 : -1;
        RecyclerView.l lVar2 = this.f1328c;
        if (lVar2 != null && lVar2.f()) {
            RecyclerView.m mVar2 = (RecyclerView.m) view.getLayoutParams();
            i4 = e(lVar2.H(view) - ((ViewGroup.MarginLayoutParams) mVar2).topMargin, lVar2.B(view) + ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin, lVar2.Q(), lVar2.q - lVar2.N(), i6);
        }
        int ceil = (int) Math.ceil(g((int) Math.sqrt((i4 * i4) + (i * i))) / 0.3356d);
        if (ceil > 0) {
            aVar.b(-i, -i4, ceil, this.j);
        }
    }

    public int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                }
                return i4 - i2;
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 >= 0) {
                return 0;
            }
            return i7;
        }
        return i3 - i;
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int g(int i) {
        float abs = Math.abs(i);
        if (!this.m) {
            this.n = f(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }
}
