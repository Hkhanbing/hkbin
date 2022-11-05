package androidx.activity;

import a.n.f;
import a.n.h;
import a.n.j;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements h {

    /* renamed from: b  reason: collision with root package name */
    public static int f1145b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f1146c;
    public static Field d;
    public static Field e;

    /* renamed from: a  reason: collision with root package name */
    public Activity f1147a;

    @Override // a.n.h
    public void g(j jVar, f.a aVar) {
        if (aVar != f.a.ON_DESTROY) {
            return;
        }
        if (f1145b == 0) {
            try {
                f1145b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f1146c = declaredField3;
                declaredField3.setAccessible(true);
                f1145b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f1145b != 1) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) this.f1147a.getSystemService("input_method");
        try {
            Object obj = f1146c.get(inputMethodManager);
            if (obj == null) {
                return;
            }
            synchronized (obj) {
                try {
                    try {
                        View view = (View) d.get(inputMethodManager);
                        if (view == null) {
                            return;
                        }
                        if (view.isAttachedToWindow()) {
                            return;
                        }
                        try {
                            e.set(inputMethodManager, null);
                            inputMethodManager.isActive();
                        } catch (IllegalAccessException unused2) {
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalAccessException unused5) {
        }
    }
}
