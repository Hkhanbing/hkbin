package a.h.c.b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f515a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<b, SparseArray<a>> f516b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f517c = new Object();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f518a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f519b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.f518a = colorStateList;
            this.f519b = configuration;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f520a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f521b;

        public b(Resources resources, Resources.Theme theme) {
            this.f520a = resources;
            this.f521b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f520a.equals(bVar.f520a) && Objects.equals(this.f521b, bVar.f521b);
        }

        public int hashCode() {
            return Objects.hash(this.f520a, this.f521b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Typeface f522a;

            public a(Typeface typeface) {
                this.f522a = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.e(this.f522a);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f524a;

            public b(int i) {
                this.f524a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.d(this.f524a);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i, Handler handler) {
            c(handler).post(new b(i));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i);

        public abstract void e(Typeface typeface);
    }

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, null, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
        if (r20 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
        r20.a(-3, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r20 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, a.h.c.b.h.c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.c.b.h.b(android.content.Context, int, android.util.TypedValue, int, a.h.c.b.h$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
