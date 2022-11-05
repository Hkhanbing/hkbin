package a.p.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class u extends z {

    /* renamed from: c  reason: collision with root package name */
    public s f1061c;
    public s d;

    @Override // a.p.b.z
    public int[] a(RecyclerView.l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.e()) {
            iArr[0] = c(view, e(lVar));
        } else {
            iArr[0] = 0;
        }
        if (lVar.f()) {
            iArr[1] = c(view, f(lVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int c(View view, s sVar) {
        return ((sVar.c(view) / 2) + sVar.e(view)) - ((sVar.l() / 2) + sVar.k());
    }

    public final View d(RecyclerView.l lVar, s sVar) {
        int y = lVar.y();
        View view = null;
        if (y == 0) {
            return null;
        }
        int l = (sVar.l() / 2) + sVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < y; i2++) {
            View x = lVar.x(i2);
            int abs = Math.abs(((sVar.c(x) / 2) + sVar.e(x)) - l);
            if (abs < i) {
                view = x;
                i = abs;
            }
        }
        return view;
    }

    public final s e(RecyclerView.l lVar) {
        s sVar = this.d;
        if (sVar == null || sVar.f1058a != lVar) {
            this.d = new q(lVar);
        }
        return this.d;
    }

    public final s f(RecyclerView.l lVar) {
        s sVar = this.f1061c;
        if (sVar == null || sVar.f1058a != lVar) {
            this.f1061c = new r(lVar);
        }
        return this.f1061c;
    }
}
