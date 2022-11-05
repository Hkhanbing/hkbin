package a.s;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class t extends s {
    public static boolean d = true;
    public static boolean e = true;

    @Override // a.s.x
    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    @Override // a.s.x
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}
