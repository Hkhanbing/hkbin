package a.b.f;

import a.h.c.b.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class d1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f192a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f193b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f194c;

    public d1(Context context, TypedArray typedArray) {
        this.f192a = context;
        this.f193b = typedArray;
    }

    public static d1 p(Context context, AttributeSet attributeSet, int[] iArr) {
        return new d1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static d1 q(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new d1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public boolean a(int i, boolean z) {
        return this.f193b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.f193b.getColor(i, i2);
    }

    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList d;
        return (!this.f193b.hasValue(i) || (resourceId = this.f193b.getResourceId(i, 0)) == 0 || (d = a.b.a.d(this.f192a, resourceId)) == null) ? this.f193b.getColorStateList(i) : d;
    }

    public float d(int i, float f) {
        return this.f193b.getDimension(i, f);
    }

    public int e(int i, int i2) {
        return this.f193b.getDimensionPixelOffset(i, i2);
    }

    public int f(int i, int i2) {
        return this.f193b.getDimensionPixelSize(i, i2);
    }

    public Drawable g(int i) {
        int resourceId;
        return (!this.f193b.hasValue(i) || (resourceId = this.f193b.getResourceId(i, 0)) == 0) ? this.f193b.getDrawable(i) : a.b.a.e(this.f192a, resourceId);
    }

    public Drawable h(int i) {
        int resourceId;
        Drawable f;
        if (!this.f193b.hasValue(i) || (resourceId = this.f193b.getResourceId(i, 0)) == 0) {
            return null;
        }
        l a2 = l.a();
        Context context = this.f192a;
        synchronized (a2) {
            f = a2.f242a.f(context, resourceId, true);
        }
        return f;
    }

    public Typeface i(int i, int i2, h.c cVar) {
        int resourceId = this.f193b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f194c == null) {
            this.f194c = new TypedValue();
        }
        Context context = this.f192a;
        TypedValue typedValue = this.f194c;
        ThreadLocal<TypedValue> threadLocal = a.h.c.b.h.f515a;
        if (!context.isRestricted()) {
            return a.h.c.b.h.b(context, resourceId, typedValue, i2, cVar, null, true, false);
        }
        return null;
    }

    public int j(int i, int i2) {
        return this.f193b.getInt(i, i2);
    }

    public int k(int i, int i2) {
        return this.f193b.getLayoutDimension(i, i2);
    }

    public int l(int i, int i2) {
        return this.f193b.getResourceId(i, i2);
    }

    public String m(int i) {
        return this.f193b.getString(i);
    }

    public CharSequence n(int i) {
        return this.f193b.getText(i);
    }

    public boolean o(int i) {
        return this.f193b.hasValue(i);
    }
}
