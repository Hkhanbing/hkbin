package a.s;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f1118a = true;

    public static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (!f1118a) {
        } else {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f1118a = false;
            }
        }
    }
}
