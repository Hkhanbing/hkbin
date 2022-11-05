package a.b.f;

import a.h.c.b.h;
import a.h.j.w;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f186a;

    /* renamed from: b  reason: collision with root package name */
    public b1 f187b;

    /* renamed from: c  reason: collision with root package name */
    public b1 f188c;
    public b1 d;
    public b1 e;
    public b1 f;
    public b1 g;
    public b1 h;
    public final g0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    /* loaded from: classes.dex */
    public class a extends h.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f189a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f190b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f191c;

        public a(int i, int i2, WeakReference weakReference) {
            this.f189a = i;
            this.f190b = i2;
            this.f191c = weakReference;
        }

        @Override // a.h.c.b.h.c
        public void d(int i) {
        }

        @Override // a.h.c.b.h.c
        public void e(Typeface typeface) {
            int i = this.f189a;
            if (i != -1) {
                typeface = Typeface.create(typeface, i, (this.f190b & 2) != 0);
            }
            d0 d0Var = d0.this;
            WeakReference weakReference = this.f191c;
            if (d0Var.m) {
                d0Var.l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView == null) {
                    return;
                }
                AtomicInteger atomicInteger = a.h.j.w.f667a;
                if (w.g.b(textView)) {
                    textView.post(new e0(d0Var, textView, typeface, d0Var.j));
                } else {
                    textView.setTypeface(typeface, d0Var.j);
                }
            }
        }
    }

    public d0(TextView textView) {
        this.f186a = textView;
        this.i = new g0(textView);
    }

    public static b1 c(Context context, l lVar, int i) {
        ColorStateList d = lVar.d(context, i);
        if (d != null) {
            b1 b1Var = new b1();
            b1Var.d = true;
            b1Var.f177a = d;
            return b1Var;
        }
        return null;
    }

    public final void a(Drawable drawable, b1 b1Var) {
        if (drawable == null || b1Var == null) {
            return;
        }
        l.f(drawable, b1Var, this.f186a.getDrawableState());
    }

    public void b() {
        if (this.f187b != null || this.f188c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.f186a.getCompoundDrawables();
            a(compoundDrawables[0], this.f187b);
            a(compoundDrawables[1], this.f188c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f186a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    @SuppressLint({"NewApi"})
    public void d(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        int i2;
        Drawable drawable;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        int i5;
        Context context = this.f186a.getContext();
        l a2 = l.a();
        int[] iArr = a.b.b.h;
        d1 q = d1.q(context, attributeSet, iArr, i, 0);
        TextView textView = this.f186a;
        a.h.j.w.o(textView, textView.getContext(), iArr, attributeSet, q.f193b, i, 0);
        int l = q.l(0, -1);
        if (q.o(3)) {
            this.f187b = c(context, a2, q.l(3, 0));
        }
        if (q.o(1)) {
            this.f188c = c(context, a2, q.l(1, 0));
        }
        if (q.o(4)) {
            this.d = c(context, a2, q.l(4, 0));
        }
        if (q.o(2)) {
            this.e = c(context, a2, q.l(2, 0));
        }
        if (q.o(5)) {
            this.f = c(context, a2, q.l(5, 0));
        }
        if (q.o(6)) {
            this.g = c(context, a2, q.l(6, 0));
        }
        q.f193b.recycle();
        boolean z3 = this.f186a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (l != -1) {
            d1 d1Var = new d1(context, context.obtainStyledAttributes(l, a.b.b.w));
            if (z3 || !d1Var.o(14)) {
                z = false;
                z2 = false;
            } else {
                z = d1Var.a(14, false);
                z2 = true;
            }
            i(context, d1Var);
            if (d1Var.o(15)) {
                str = d1Var.m(15);
                i5 = 13;
            } else {
                i5 = 13;
                str = null;
            }
            str2 = d1Var.o(i5) ? d1Var.m(i5) : null;
            d1Var.f193b.recycle();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        d1 d1Var2 = new d1(context, context.obtainStyledAttributes(attributeSet, a.b.b.w, i, 0));
        if (!z3 && d1Var2.o(14)) {
            z = d1Var2.a(14, false);
            z2 = true;
        }
        if (d1Var2.o(15)) {
            str = d1Var2.m(15);
        }
        if (d1Var2.o(13)) {
            str2 = d1Var2.m(13);
        }
        String str3 = str2;
        if (d1Var2.o(0) && d1Var2.f(0, -1) == 0) {
            this.f186a.setTextSize(0, 0.0f);
        }
        i(context, d1Var2);
        d1Var2.f193b.recycle();
        if (!z3 && z2) {
            this.f186a.setAllCaps(z);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.f186a.setTypeface(typeface, this.j);
            } else {
                this.f186a.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            this.f186a.setFontVariationSettings(str3);
        }
        if (str != null) {
            this.f186a.setTextLocales(LocaleList.forLanguageTags(str));
        }
        g0 g0Var = this.i;
        Context context2 = g0Var.i;
        int[] iArr2 = a.b.b.i;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        TextView textView2 = g0Var.h;
        a.h.j.w.o(textView2, textView2.getContext(), iArr2, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            g0Var.f218a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId2 = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr3[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                g0Var.f = g0Var.a(iArr3);
                g0Var.c();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!g0Var.d()) {
            g0Var.f218a = 0;
        } else if (g0Var.f218a == 1) {
            if (!g0Var.g) {
                DisplayMetrics displayMetrics = g0Var.i.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                g0Var.e(dimension2, dimension3, dimension);
            }
            g0Var.b();
        }
        g0 g0Var2 = this.i;
        if (g0Var2.f218a != 0) {
            int[] iArr4 = g0Var2.f;
            if (iArr4.length > 0) {
                if (this.f186a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f186a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.i.d), Math.round(this.i.e), Math.round(this.i.f220c), 0);
                } else {
                    this.f186a.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.b.b.i);
        int resourceId3 = obtainStyledAttributes2.getResourceId(8, -1);
        if (resourceId3 != -1) {
            drawable = a2.b(context, resourceId3);
            i2 = 13;
        } else {
            i2 = 13;
            drawable = null;
        }
        int resourceId4 = obtainStyledAttributes2.getResourceId(i2, -1);
        Drawable b2 = resourceId4 != -1 ? a2.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes2.getResourceId(9, -1);
        Drawable b3 = resourceId5 != -1 ? a2.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes2.getResourceId(6, -1);
        Drawable b4 = resourceId6 != -1 ? a2.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes2.getResourceId(10, -1);
        Drawable b5 = resourceId7 != -1 ? a2.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes2.getResourceId(7, -1);
        Drawable b6 = resourceId8 != -1 ? a2.b(context, resourceId8) : null;
        if (b5 != null || b6 != null) {
            Drawable[] compoundDrawablesRelative = this.f186a.getCompoundDrawablesRelative();
            TextView textView3 = this.f186a;
            if (b5 == null) {
                b5 = compoundDrawablesRelative[0];
            }
            if (b2 == null) {
                b2 = compoundDrawablesRelative[1];
            }
            if (b6 == null) {
                b6 = compoundDrawablesRelative[2];
            }
            if (b4 == null) {
                b4 = compoundDrawablesRelative[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(b5, b2, b6, b4);
        } else if (drawable != null || b2 != null || b3 != null || b4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f186a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f186a.getCompoundDrawables();
                TextView textView4 = this.f186a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (b2 == null) {
                    b2 = compoundDrawables[1];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[2];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(drawable, b2, b3, b4);
            } else {
                TextView textView5 = this.f186a;
                Drawable drawable2 = compoundDrawablesRelative2[0];
                if (b2 == null) {
                    b2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable3 = compoundDrawablesRelative2[2];
                if (b4 == null) {
                    b4 = compoundDrawablesRelative2[3];
                }
                textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, b2, drawable3, b4);
            }
        }
        if (obtainStyledAttributes2.hasValue(11)) {
            if (!obtainStyledAttributes2.hasValue(11) || (resourceId = obtainStyledAttributes2.getResourceId(11, 0)) == 0 || (colorStateList = a.b.a.d(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes2.getColorStateList(11);
            }
            TextView textView6 = this.f186a;
            Objects.requireNonNull(textView6);
            textView6.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes2.hasValue(12)) {
            i3 = -1;
            PorterDuff.Mode d = k0.d(obtainStyledAttributes2.getInt(12, -1), null);
            TextView textView7 = this.f186a;
            Objects.requireNonNull(textView7);
            textView7.setCompoundDrawableTintMode(d);
        } else {
            i3 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(15, i3);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(18, i3);
        int dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(19, i3);
        obtainStyledAttributes2.recycle();
        if (dimensionPixelSize != i3) {
            TextView textView8 = this.f186a;
            a.h.b.b.e(dimensionPixelSize);
            textView8.setFirstBaselineToTopHeight(dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i3) {
            a.h.b.b.K(this.f186a, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i3) {
            a.h.b.b.L(this.f186a, dimensionPixelSize3);
        }
    }

    public void e(Context context, int i) {
        String m;
        d1 d1Var = new d1(context, context.obtainStyledAttributes(i, a.b.b.w));
        if (d1Var.o(14)) {
            this.f186a.setAllCaps(d1Var.a(14, false));
        }
        if (d1Var.o(0) && d1Var.f(0, -1) == 0) {
            this.f186a.setTextSize(0, 0.0f);
        }
        i(context, d1Var);
        if (d1Var.o(13) && (m = d1Var.m(13)) != null) {
            this.f186a.setFontVariationSettings(m);
        }
        d1Var.f193b.recycle();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f186a.setTypeface(typeface, this.j);
        }
    }

    public void f(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        Objects.requireNonNull(text);
        if (i >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 + 0 : i2 + 0;
        int i5 = i2 > i3 ? i2 - 0 : i3 + 0;
        int length = text.length();
        if (i4 >= 0 && i5 <= length) {
            int i6 = editorInfo.inputType & 4095;
            if (!(i6 == 129 || i6 == 225 || i6 == 18)) {
                if (length <= 2048) {
                    a.h.j.e0.a.b(editorInfo, text, i4, i5);
                    return;
                }
                int i7 = i5 - i4;
                int i8 = i7 > 1024 ? 0 : i7;
                int i9 = 2048 - i8;
                int min = Math.min(text.length() - i5, i9 - Math.min(i4, (int) (i9 * 0.8d)));
                int min2 = Math.min(i4, i9 - min);
                int i10 = i4 - min2;
                if (a.h.j.e0.a.a(text, i10, 0)) {
                    i10++;
                    min2--;
                }
                if (a.h.j.e0.a.a(text, (i5 + min) - 1, 1)) {
                    min--;
                }
                CharSequence concat = i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + min2), text.subSequence(i5, min + i5)) : text.subSequence(i10, min2 + i8 + min + i10);
                int i11 = min2 + 0;
                a.h.j.e0.a.b(editorInfo, concat, i11, i8 + i11);
                return;
            }
        }
        a.h.j.e0.a.b(editorInfo, null, 0, 0);
    }

    public void g(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new b1();
        }
        b1 b1Var = this.h;
        b1Var.f177a = colorStateList;
        b1Var.d = colorStateList != null;
        this.f187b = b1Var;
        this.f188c = b1Var;
        this.d = b1Var;
        this.e = b1Var;
        this.f = b1Var;
        this.g = b1Var;
    }

    public void h(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new b1();
        }
        b1 b1Var = this.h;
        b1Var.f178b = mode;
        b1Var.f179c = mode != null;
        this.f187b = b1Var;
        this.f188c = b1Var;
        this.d = b1Var;
        this.e = b1Var;
        this.f = b1Var;
        this.g = b1Var;
    }

    public final void i(Context context, d1 d1Var) {
        String m;
        Typeface create;
        Typeface typeface;
        this.j = d1Var.j(2, this.j);
        int j = d1Var.j(11, -1);
        this.k = j;
        boolean z = false;
        if (j != -1) {
            this.j = (this.j & 2) | 0;
        }
        int i = 10;
        if (!d1Var.o(10) && !d1Var.o(12)) {
            if (!d1Var.o(1)) {
                return;
            }
            this.m = false;
            int j2 = d1Var.j(1, 1);
            if (j2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (j2 == 2) {
                typeface = Typeface.SERIF;
            } else if (j2 != 3) {
                return;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            this.l = typeface;
            return;
        }
        this.l = null;
        if (d1Var.o(12)) {
            i = 12;
        }
        int i2 = this.k;
        int i3 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface i4 = d1Var.i(i, this.j, new a(i2, i3, new WeakReference(this.f186a)));
                if (i4 != null) {
                    if (this.k != -1) {
                        i4 = Typeface.create(Typeface.create(i4, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = i4;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (m = d1Var.m(i)) == null) {
            return;
        }
        if (this.k != -1) {
            Typeface create2 = Typeface.create(m, 0);
            int i5 = this.k;
            if ((this.j & 2) != 0) {
                z = true;
            }
            create = Typeface.create(create2, i5, z);
        } else {
            create = Typeface.create(m, this.j);
        }
        this.l = create;
    }
}
