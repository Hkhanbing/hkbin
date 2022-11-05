package a.s;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class w extends v {
    @Override // a.s.s, a.s.x
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // a.s.u, a.s.x
    public void d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // a.s.s, a.s.x
    public void e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // a.s.v, a.s.x
    public void f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // a.s.t, a.s.x
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // a.s.t, a.s.x
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
