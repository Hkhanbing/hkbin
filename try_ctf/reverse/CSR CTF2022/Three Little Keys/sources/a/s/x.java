package a.s;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public static Field f1122a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1123b;

    public void a(View view) {
        throw null;
    }

    public float b(View view) {
        throw null;
    }

    public void c(View view) {
        throw null;
    }

    public void d(View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    public void e(View view, float f) {
        throw null;
    }

    public void f(View view, int i) {
        if (!f1123b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1122a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f1123b = true;
        }
        Field field = f1122a;
        if (field != null) {
            try {
                f1122a.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(View view, Matrix matrix) {
        throw null;
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }
}
