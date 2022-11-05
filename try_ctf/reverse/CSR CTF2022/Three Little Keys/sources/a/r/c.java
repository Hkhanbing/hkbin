package a.r;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Trace;
import android.util.Log;
import android.util.Property;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static long f1076a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f1077b;

    @SuppressLint({"NewApi"})
    public static boolean a() {
        try {
            if (f1077b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f1077b == null) {
                f1076a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1077b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1077b.invoke(null, Long.valueOf(f1076a))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static <T> ObjectAnimator b(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
