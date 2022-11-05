package a.b.c;

import a.b.f.f0;
import a.b.f.v;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import de.cybersecurityrumble.threelittlekeys.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class p {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f52b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f53c = {16843375};
    public static final int[] d = {16844160};
    public static final int[] e = {16844156};
    public static final int[] f = {16844148};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final a.e.h<String, Constructor<? extends View>> h = new a.e.h<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f54a = new Object[2];

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final View f55a;

        /* renamed from: b  reason: collision with root package name */
        public final String f56b;

        /* renamed from: c  reason: collision with root package name */
        public Method f57c;
        public Context d;

        public a(View view, String str) {
            this.f55a = view;
            this.f56b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String sb;
            Method method;
            if (this.f57c == null) {
                Context context = this.f55a.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f56b, View.class)) != null) {
                            this.f57c = method;
                            this.d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.f55a.getId();
                if (id == -1) {
                    sb = "";
                } else {
                    StringBuilder f = b.a.a.a.a.f(" with id '");
                    f.append(this.f55a.getContext().getResources().getResourceEntryName(id));
                    f.append("'");
                    sb = f.toString();
                }
                StringBuilder f2 = b.a.a.a.a.f("Could not find method ");
                f2.append(this.f56b);
                f2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                f2.append(this.f55a.getClass());
                f2.append(sb);
                throw new IllegalStateException(f2.toString());
            }
            try {
                this.f57c.invoke(this.d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    public a.b.f.e a(Context context, AttributeSet attributeSet) {
        return new a.b.f.e(context, attributeSet);
    }

    public a.b.f.g b(Context context, AttributeSet attributeSet) {
        return new a.b.f.g(context, attributeSet);
    }

    public a.b.f.h c(Context context, AttributeSet attributeSet) {
        return new a.b.f.h(context, attributeSet);
    }

    public v d(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet, R.attr.radioButtonStyle);
    }

    public f0 e(Context context, AttributeSet attributeSet) {
        return new f0(context, attributeSet);
    }

    public View f() {
        return null;
    }

    public final View g(Context context, String str, String str2) {
        String str3;
        a.e.h<String, Constructor<? extends View>> hVar = h;
        Constructor<? extends View> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f52b);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f54a);
    }

    public final void h(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
