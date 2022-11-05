package b.b.a.a;

import a.b.f.d1;
import a.h.j.w;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewParent;
import b.b.a.a.l.c;
import b.b.a.a.w.d;
import b.b.a.a.w.e;
import b.b.a.a.w.g;
import b.b.a.a.w.i;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a {
    public static void A(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        AtomicInteger atomicInteger = w.f667a;
        boolean a2 = w.c.a(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (a2 || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(a2);
        checkableImageButton.setPressable(a2);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        w.d.s(checkableImageButton, i);
    }

    public static void B(View view, g gVar) {
        b.b.a.a.o.a aVar = gVar.f1578a.f1583b;
        if (aVar != null && aVar.f1505a) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                AtomicInteger atomicInteger = w.f667a;
                f += w.i.i((View) parent);
            }
            g.b bVar = gVar.f1578a;
            if (bVar.n == f) {
                return;
            }
            bVar.n = f;
            gVar.x();
        }
    }

    public static PorterDuffColorFilter C(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(s(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static Animator b(c cVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, (Property<c, V>) c.C0037c.f1440a, (TypeEvaluator) c.b.f1438b, (Object[]) new c.e[]{new c.e(f, f2, f3)});
        c.e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f, (int) f2, revealInfo.f1444c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static d c(int i) {
        if (i != 0) {
            if (i != 1) {
                return new i();
            }
            return new e();
        }
        return new i();
    }

    public static float d(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    public static int e(Context context, int i, int i2) {
        TypedValue w = w(context, i);
        return w != null ? w.data : i2;
    }

    public static int f(View view, int i) {
        return y(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static ColorStateList g(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList d;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (d = a.b.a.d(context, resourceId)) == null) ? typedArray.getColorStateList(i) : d;
    }

    public static ColorStateList h(Context context, d1 d1Var, int i) {
        int resourceId;
        ColorStateList d;
        return (!d1Var.f193b.hasValue(i) || (resourceId = d1Var.f193b.getResourceId(i, 0)) == 0 || (d = a.b.a.d(context, resourceId)) == null) ? d1Var.c(i) : d;
    }

    public static float i(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    public static Drawable j(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable e;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (e = a.b.a.e(context, resourceId)) == null) ? typedArray.getDrawable(i) : e;
    }

    public static boolean k(int i) {
        boolean z;
        if (i != 0) {
            ThreadLocal<double[]> threadLocal = a.h.d.a.f532a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length == 3) {
                double d = red / 255.0d;
                double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
                double d2 = green / 255.0d;
                double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                double d3 = blue / 255.0d;
                double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                z = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (dArr[1] / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z = false;
        }
        return z;
    }

    public static boolean l(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static boolean m(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean n(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static boolean o(View view) {
        AtomicInteger atomicInteger = w.f667a;
        return w.e.d(view) == 1;
    }

    public static int p(int i, int i2, float f) {
        return a.h.d.a.b(a.h.d.a.e(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static float q(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static Typeface r(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0) {
            return null;
        }
        return Typeface.create(typeface, a.h.b.b.j(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static int[] s(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    public static PorterDuff.Mode t(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void u(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static void v(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(s(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static TypedValue w(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean x(Context context, int i, boolean z) {
        TypedValue w = w(context, i);
        return (w == null || w.type != 18) ? z : w.data != 0;
    }

    public static int y(Context context, int i, String str) {
        TypedValue w = w(context, i);
        if (w != null) {
            return w.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static void z(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            g gVar = (g) background;
            g.b bVar = gVar.f1578a;
            if (bVar.o == f) {
                return;
            }
            bVar.o = f;
            gVar.x();
        }
    }
}
