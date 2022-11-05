package a.s;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public class u extends t {
    public static boolean f = true;

    @Override // a.s.x
    @SuppressLint({"NewApi"})
    public void d(View view, int i, int i2, int i3, int i4) {
        if (f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
