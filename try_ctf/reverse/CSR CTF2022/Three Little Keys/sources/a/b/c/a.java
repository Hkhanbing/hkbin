package a.b.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a.b.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0001a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f16a;

        public C0001a(int i, int i2) {
            super(i, i2);
            this.f16a = 0;
            this.f16a = 8388627;
        }

        public C0001a(C0001a c0001a) {
            super((ViewGroup.MarginLayoutParams) c0001a);
            this.f16a = 0;
            this.f16a = c0001a.f16a;
        }

        public C0001a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b.b.f14b);
            this.f16a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0001a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16a = 0;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a();
    }

    public abstract void a(boolean z);

    public abstract Context b();

    public abstract void c(boolean z);
}
