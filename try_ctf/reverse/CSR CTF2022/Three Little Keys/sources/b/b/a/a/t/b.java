package b.b.a.a.t;

import a.h.c.b.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f1562a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1563b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1564c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    /* loaded from: classes.dex */
    public class a extends h.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f1565a;

        public a(d dVar) {
            this.f1565a = dVar;
        }

        @Override // a.h.c.b.h.c
        public void d(int i) {
            b.this.m = true;
            this.f1565a.a(i);
        }

        @Override // a.h.c.b.h.c
        public void e(Typeface typeface) {
            b bVar = b.this;
            bVar.n = Typeface.create(typeface, bVar.f1564c);
            b bVar2 = b.this;
            bVar2.m = true;
            this.f1565a.b(bVar2.n, false);
        }
    }

    public b(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, b.b.a.a.b.z);
        this.k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.j = b.b.a.a.a.g(context, obtainStyledAttributes, 3);
        b.b.a.a.a.g(context, obtainStyledAttributes, 4);
        b.b.a.a.a.g(context, obtainStyledAttributes, 5);
        this.f1564c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i2 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f1563b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f1562a = b.b.a.a.a.g(context, obtainStyledAttributes, 6);
        this.e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, b.b.a.a.b.s);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.n == null && (str = this.f1563b) != null) {
            this.n = Typeface.create(str, this.f1564c);
        }
        if (this.n == null) {
            int i = this.d;
            this.n = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.n = Typeface.create(this.n, this.f1564c);
        }
    }

    public Typeface b(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = h.a(context, this.l);
                this.n = a2;
                if (a2 != null) {
                    this.n = Typeface.create(a2, this.f1564c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                StringBuilder f = b.a.a.a.a.f("Error loading font ");
                f.append(this.f1563b);
                Log.d("TextAppearance", f.toString(), e);
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public void c(Context context, d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            dVar.b(this.n, true);
            return;
        }
        try {
            a aVar = new a(dVar);
            ThreadLocal<TypedValue> threadLocal = h.f515a;
            if (context.isRestricted()) {
                aVar.a(-4, null);
            } else {
                h.b(context, i, new TypedValue(), 0, aVar, null, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            dVar.a(1);
        } catch (Exception e) {
            StringBuilder f = b.a.a.a.a.f("Error loading font ");
            f.append(this.f1563b);
            Log.d("TextAppearance", f.toString(), e);
            this.m = true;
            dVar.a(-3);
        }
    }

    public final boolean d(Context context) {
        int i = this.l;
        Typeface typeface = null;
        if (i != 0) {
            ThreadLocal<TypedValue> threadLocal = h.f515a;
            if (!context.isRestricted()) {
                typeface = h.b(context, i, new TypedValue(), 0, null, null, false, true);
            }
        }
        return typeface != null;
    }

    public void e(Context context, TextPaint textPaint, d dVar) {
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.g;
        float f2 = this.e;
        float f3 = this.f;
        ColorStateList colorStateList2 = this.f1562a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void f(Context context, TextPaint textPaint, d dVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new c(this, context, textPaint, dVar));
    }

    public void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface r = b.b.a.a.a.r(context.getResources().getConfiguration(), typeface);
        if (r != null) {
            typeface = r;
        }
        textPaint.setTypeface(typeface);
        int i = this.f1564c & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
