package a.s;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes.dex */
public class s extends x {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f1121c = true;

    @Override // a.s.x
    public void a(View view) {
    }

    @Override // a.s.x
    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f1121c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f1121c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // a.s.x
    public void c(View view) {
    }

    @Override // a.s.x
    @SuppressLint({"NewApi"})
    public void e(View view, float f) {
        if (f1121c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f1121c = false;
            }
        }
        view.setAlpha(f);
    }
}
