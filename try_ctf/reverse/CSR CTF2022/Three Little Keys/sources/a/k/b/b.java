package a.k.b;

import a.k.a.o;
import android.annotation.SuppressLint;
import android.text.Editable;

/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f763a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile Editable.Factory f764b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f765c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f765c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f765c;
        if (cls != null) {
            return new o(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
