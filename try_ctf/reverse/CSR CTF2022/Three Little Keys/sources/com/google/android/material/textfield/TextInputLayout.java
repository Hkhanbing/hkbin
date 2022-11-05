package com.google.android.material.textfield;

import a.b.f.d1;
import a.b.f.f0;
import a.b.f.k0;
import a.h.c.a;
import a.h.j.w;
import a.s.l;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.a.a.w.j;
import b.b.a.a.z.m;
import b.b.a.a.z.n;
import b.b.a.a.z.o;
import b.b.a.a.z.r;
import b.b.a.a.z.s;
import b.b.a.a.z.t;
import com.google.android.material.internal.CheckableImageButton;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public CharSequence A;
    public int A0;
    public final TextView B;
    public boolean B0;
    public boolean C;
    public final b.b.a.a.r.e C0;
    public CharSequence D;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public b.b.a.a.w.g F;
    public ValueAnimator F0;
    public b.b.a.a.w.g G;
    public boolean G0;
    public b.b.a.a.w.g H;
    public boolean H0;
    public j I;
    public boolean J;
    public final int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final Rect S;
    public final Rect T;
    public final RectF U;
    public Typeface V;
    public Drawable W;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f1743a;
    public int a0;

    /* renamed from: b  reason: collision with root package name */
    public final t f1744b;
    public final LinkedHashSet<f> b0;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f1745c;
    public int c0;
    public final FrameLayout d;
    public final SparseArray<m> d0;
    public EditText e;
    public final CheckableImageButton e0;
    public CharSequence f;
    public final LinkedHashSet<g> f0;
    public int g;
    public ColorStateList g0;
    public int h;
    public PorterDuff.Mode h0;
    public int i;
    public Drawable i0;
    public int j;
    public int j0;
    public final n k;
    public Drawable k0;
    public boolean l;
    public View.OnLongClickListener l0;
    public int m;
    public View.OnLongClickListener m0;
    public boolean n;
    public final CheckableImageButton n0;
    public TextView o;
    public ColorStateList o0;
    public int p;
    public PorterDuff.Mode p0;
    public int q;
    public ColorStateList q0;
    public CharSequence r;
    public ColorStateList r0;
    public boolean s;
    public int s0;
    public TextView t;
    public int t0;
    public ColorStateList u;
    public int u0;
    public int v;
    public ColorStateList v0;
    public a.s.c w;
    public int w0;
    public a.s.c x;
    public int x0;
    public ColorStateList y;
    public int y0;
    public ColorStateList z;
    public int z0;

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.z(!textInputLayout.H0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.l) {
                textInputLayout2.s(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.s) {
                textInputLayout3.A(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.e0.performClick();
            TextInputLayout.this.e0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.e.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.C0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.h.j.c {
        public final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
            if (r2 != null) goto L41;
         */
        @Override // a.h.j.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(android.view.View r14, a.h.j.d0.d r15) {
            /*
                Method dump skipped, instructions count: 231
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e.d(android.view.View, a.h.j.d0.d):void");
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    /* loaded from: classes.dex */
    public static class h extends a.j.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f1750c;
        public boolean d;
        public CharSequence e;
        public CharSequence f;
        public CharSequence g;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new h[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1750c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d = parcel.readInt() != 1 ? false : true;
            this.e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder f = b.a.a.a.a.f("TextInputLayout.SavedState{");
            f.append(Integer.toHexString(System.identityHashCode(this)));
            f.append(" error=");
            f.append((Object) this.f1750c);
            f.append(" hint=");
            f.append((Object) this.e);
            f.append(" helperText=");
            f.append((Object) this.f);
            f.append(" placeholderText=");
            f.append((Object) this.g);
            f.append("}");
            return f.toString();
        }

        @Override // a.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f701a, i);
            TextUtils.writeToParcel(this.f1750c, parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
            TextUtils.writeToParcel(this.e, parcel, i);
            TextUtils.writeToParcel(this.f, parcel, i);
            TextUtils.writeToParcel(this.g, parcel, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v61 */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(b.b.a.a.a0.a.a.a(context, attributeSet, R.attr.textInputStyle, 2131821338), attributeSet, R.attr.textInputStyle);
        ?? r6;
        int colorForState;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = new n(this);
        this.S = new Rect();
        this.T = new Rect();
        this.U = new RectF();
        this.b0 = new LinkedHashSet<>();
        this.c0 = 0;
        SparseArray<m> sparseArray = new SparseArray<>();
        this.d0 = sparseArray;
        this.f0 = new LinkedHashSet<>();
        b.b.a.a.r.e eVar = new b.b.a.a.r.e(this);
        this.C0 = eVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1743a = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.d = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f1745c = linearLayout;
        f0 f0Var = new f0(context2, null);
        this.B = f0Var;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        f0Var.setVisibility(8);
        LayoutInflater from = LayoutInflater.from(context2);
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout, false);
        this.n0 = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.e0 = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = b.b.a.a.c.a.f1370a;
        eVar.Q = timeInterpolator;
        eVar.k(false);
        eVar.P = timeInterpolator;
        eVar.k(false);
        eVar.n(8388659);
        int[] iArr = b.b.a.a.b.B;
        b.b.a.a.r.n.a(context2, attributeSet, R.attr.textInputStyle, 2131821338);
        b.b.a.a.r.n.b(context2, attributeSet, iArr, R.attr.textInputStyle, 2131821338, 22, 20, 35, 40, 44);
        d1 d1Var = new d1(context2, context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2131821338));
        t tVar = new t(this, d1Var);
        this.f1744b = tVar;
        this.C = d1Var.a(43, true);
        setHint(d1Var.n(4));
        this.E0 = d1Var.a(42, true);
        this.D0 = d1Var.a(37, true);
        if (d1Var.o(6)) {
            setMinEms(d1Var.j(6, -1));
        } else if (d1Var.o(3)) {
            setMinWidth(d1Var.f(3, -1));
        }
        if (d1Var.o(5)) {
            setMaxEms(d1Var.j(5, -1));
        } else if (d1Var.o(2)) {
            setMaxWidth(d1Var.f(2, -1));
        }
        this.I = j.b(context2, attributeSet, R.attr.textInputStyle, 2131821338).a();
        this.K = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.M = d1Var.e(9, 0);
        this.O = d1Var.f(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.P = d1Var.f(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.N = this.O;
        float d2 = d1Var.d(13, -1.0f);
        float d3 = d1Var.d(12, -1.0f);
        float d4 = d1Var.d(10, -1.0f);
        float d5 = d1Var.d(11, -1.0f);
        j jVar = this.I;
        Objects.requireNonNull(jVar);
        j.b bVar = new j.b(jVar);
        if (d2 >= 0.0f) {
            bVar.f(d2);
        }
        if (d3 >= 0.0f) {
            bVar.g(d3);
        }
        if (d4 >= 0.0f) {
            bVar.e(d4);
        }
        if (d5 >= 0.0f) {
            bVar.d(d5);
        }
        this.I = bVar.a();
        ColorStateList h2 = b.b.a.a.a.h(context2, d1Var, 7);
        if (h2 != null) {
            int defaultColor = h2.getDefaultColor();
            this.w0 = defaultColor;
            this.R = defaultColor;
            if (h2.isStateful()) {
                this.x0 = h2.getColorForState(new int[]{-16842910}, -1);
                this.y0 = h2.getColorForState(new int[]{16842908, 16842910}, -1);
                colorForState = h2.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.y0 = this.w0;
                ColorStateList d6 = a.b.a.d(context2, R.color.mtrl_filled_background_color);
                this.x0 = d6.getColorForState(new int[]{-16842910}, -1);
                colorForState = d6.getColorForState(new int[]{16843623}, -1);
            }
            this.z0 = colorForState;
        } else {
            this.R = 0;
            this.w0 = 0;
            this.x0 = 0;
            this.y0 = 0;
            this.z0 = 0;
        }
        if (d1Var.o(1)) {
            ColorStateList c2 = d1Var.c(1);
            this.r0 = c2;
            this.q0 = c2;
        }
        ColorStateList h3 = b.b.a.a.a.h(context2, d1Var, 14);
        this.u0 = d1Var.b(14, 0);
        Object obj = a.h.c.a.f500a;
        this.s0 = a.c.a(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.A0 = a.c.a(context2, R.color.mtrl_textinput_disabled_color);
        this.t0 = a.c.a(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (h3 != null) {
            setBoxStrokeColorStateList(h3);
        }
        if (d1Var.o(15)) {
            setBoxStrokeErrorColor(b.b.a.a.a.h(context2, d1Var, 15));
        }
        if (d1Var.l(44, -1) != -1) {
            r6 = 0;
            setHintTextAppearance(d1Var.l(44, 0));
        } else {
            r6 = 0;
        }
        int i = r6 == true ? 1 : 0;
        int i2 = r6 == true ? 1 : 0;
        int l = d1Var.l(35, i);
        CharSequence n = d1Var.n(30);
        boolean a2 = d1Var.a(31, r6);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (b.b.a.a.a.m(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(r6);
        }
        if (d1Var.o(33)) {
            this.o0 = b.b.a.a.a.h(context2, d1Var, 33);
        }
        if (d1Var.o(34)) {
            this.p0 = b.b.a.a.a.t(d1Var.j(34, -1), null);
        }
        if (d1Var.o(32)) {
            setErrorIconDrawable(d1Var.g(32));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        AtomicInteger atomicInteger = w.f667a;
        w.d.s(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int l2 = d1Var.l(40, 0);
        boolean a3 = d1Var.a(39, false);
        CharSequence n2 = d1Var.n(38);
        int l3 = d1Var.l(52, 0);
        CharSequence n3 = d1Var.n(51);
        int l4 = d1Var.l(65, 0);
        CharSequence n4 = d1Var.n(64);
        boolean a4 = d1Var.a(18, false);
        setCounterMaxLength(d1Var.j(19, -1));
        this.q = d1Var.l(22, 0);
        this.p = d1Var.l(20, 0);
        setBoxBackgroundMode(d1Var.j(8, 0));
        if (b.b.a.a.a.m(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginStart(0);
        }
        int l5 = d1Var.l(26, 0);
        sparseArray.append(-1, new b.b.a.a.z.f(this, l5));
        sparseArray.append(0, new r(this));
        sparseArray.append(1, new s(this, l5 == 0 ? d1Var.l(47, 0) : l5));
        sparseArray.append(2, new b.b.a.a.z.a(this, l5));
        sparseArray.append(3, new b.b.a.a.z.h(this, l5));
        if (!d1Var.o(48)) {
            if (d1Var.o(28)) {
                this.g0 = b.b.a.a.a.h(context2, d1Var, 28);
            }
            if (d1Var.o(29)) {
                this.h0 = b.b.a.a.a.t(d1Var.j(29, -1), null);
            }
        }
        if (d1Var.o(27)) {
            setEndIconMode(d1Var.j(27, 0));
            if (d1Var.o(25)) {
                setEndIconContentDescription(d1Var.n(25));
            }
            setEndIconCheckable(d1Var.a(24, true));
        } else if (d1Var.o(48)) {
            if (d1Var.o(49)) {
                this.g0 = b.b.a.a.a.h(context2, d1Var, 49);
            }
            if (d1Var.o(50)) {
                this.h0 = b.b.a.a.a.t(d1Var.j(50, -1), null);
            }
            setEndIconMode(d1Var.a(48, false) ? 1 : 0);
            setEndIconContentDescription(d1Var.n(46));
        }
        f0Var.setId(R.id.textinput_suffix_text);
        f0Var.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        w.g.f(f0Var, 1);
        setErrorContentDescription(n);
        setCounterOverflowTextAppearance(this.p);
        setHelperTextTextAppearance(l2);
        setErrorTextAppearance(l);
        setCounterTextAppearance(this.q);
        setPlaceholderText(n3);
        setPlaceholderTextAppearance(l3);
        setSuffixTextAppearance(l4);
        if (d1Var.o(36)) {
            setErrorTextColor(d1Var.c(36));
        }
        if (d1Var.o(41)) {
            setHelperTextColor(d1Var.c(41));
        }
        if (d1Var.o(45)) {
            setHintTextColor(d1Var.c(45));
        }
        if (d1Var.o(23)) {
            setCounterTextColor(d1Var.c(23));
        }
        if (d1Var.o(21)) {
            setCounterOverflowTextColor(d1Var.c(21));
        }
        if (d1Var.o(53)) {
            setPlaceholderTextColor(d1Var.c(53));
        }
        if (d1Var.o(66)) {
            setSuffixTextColor(d1Var.c(66));
        }
        setEnabled(d1Var.a(0, true));
        d1Var.f193b.recycle();
        w.d.s(this, 2);
        w.k.l(this, 1);
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(f0Var);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(tVar);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(a3);
        setErrorEnabled(a2);
        setCounterEnabled(a4);
        setHelperText(n2);
        setSuffixText(n4);
    }

    private m getEndIconDelegate() {
        m mVar = this.d0.get(this.c0);
        return mVar != null ? mVar : this.d0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.n0.getVisibility() == 0) {
            return this.n0;
        }
        if (h() && j()) {
            return this.e0;
        }
        return null;
    }

    public static void n(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                n((ViewGroup) childAt, z);
            }
        }
    }

    public static void p(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
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

    private void setEditText(EditText editText) {
        if (this.e == null) {
            if (this.c0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.e = editText;
            int i = this.g;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.i);
            }
            int i2 = this.h;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.j);
            }
            l();
            setTextInputAccessibilityDelegate(new e(this));
            this.C0.r(this.e.getTypeface());
            b.b.a.a.r.e eVar = this.C0;
            float textSize = this.e.getTextSize();
            if (eVar.j != textSize) {
                eVar.j = textSize;
                eVar.k(false);
            }
            b.b.a.a.r.e eVar2 = this.C0;
            float letterSpacing = this.e.getLetterSpacing();
            if (eVar2.W != letterSpacing) {
                eVar2.W = letterSpacing;
                eVar2.k(false);
            }
            int gravity = this.e.getGravity();
            this.C0.n((gravity & (-113)) | 48);
            b.b.a.a.r.e eVar3 = this.C0;
            if (eVar3.h != gravity) {
                eVar3.h = gravity;
                eVar3.k(false);
            }
            this.e.addTextChangedListener(new a());
            if (this.q0 == null) {
                this.q0 = this.e.getHintTextColors();
            }
            if (this.C) {
                if (TextUtils.isEmpty(this.D)) {
                    CharSequence hint = this.e.getHint();
                    this.f = hint;
                    setHint(hint);
                    this.e.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (this.o != null) {
                s(this.e.getText().length());
            }
            v();
            this.k.b();
            this.f1744b.bringToFront();
            this.f1745c.bringToFront();
            this.d.bringToFront();
            this.n0.bringToFront();
            Iterator<f> it = this.b0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            C();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            z(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.D)) {
            this.D = charSequence;
            b.b.a.a.r.e eVar = this.C0;
            if (charSequence == null || !TextUtils.equals(eVar.B, charSequence)) {
                eVar.B = charSequence;
                eVar.C = null;
                Bitmap bitmap = eVar.E;
                if (bitmap != null) {
                    bitmap.recycle();
                    eVar.E = null;
                }
                eVar.k(false);
            }
            if (this.B0) {
                return;
            }
            m();
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.s == z) {
            return;
        }
        if (z) {
            TextView textView = this.t;
            if (textView != null) {
                this.f1743a.addView(textView);
                this.t.setVisibility(0);
            }
        } else {
            TextView textView2 = this.t;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.t = null;
        }
        this.s = z;
    }

    public final void A(int i) {
        if (i == 0 && !this.B0) {
            if (this.t == null || !this.s || TextUtils.isEmpty(this.r)) {
                return;
            }
            this.t.setText(this.r);
            l.a(this.f1743a, this.w);
            this.t.setVisibility(0);
            this.t.bringToFront();
            announceForAccessibility(this.r);
            return;
        }
        i();
    }

    public final void B(boolean z, boolean z2) {
        int defaultColor = this.v0.getDefaultColor();
        int colorForState = this.v0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.v0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.Q = colorForState2;
        } else if (z2) {
            this.Q = colorForState;
        } else {
            this.Q = defaultColor;
        }
    }

    public final void C() {
        int i;
        if (this.e == null) {
            return;
        }
        if (j() || k()) {
            i = 0;
        } else {
            EditText editText = this.e;
            AtomicInteger atomicInteger = w.f667a;
            i = w.e.e(editText);
        }
        TextView textView = this.B;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.e.getPaddingTop();
        int paddingBottom = this.e.getPaddingBottom();
        AtomicInteger atomicInteger2 = w.f667a;
        w.e.k(textView, dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void D() {
        int visibility = this.B.getVisibility();
        boolean z = false;
        int i = (this.A == null || this.B0) ? 8 : 0;
        if (visibility != i) {
            m endIconDelegate = getEndIconDelegate();
            if (i == 0) {
                z = true;
            }
            endIconDelegate.c(z);
        }
        w();
        this.B.setVisibility(i);
        u();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.E():void");
    }

    public void a(f fVar) {
        this.b0.add(fVar);
        if (this.e != null) {
            fVar.a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f1743a.addView(view, layoutParams2);
        this.f1743a.setLayoutParams(layoutParams);
        y();
        setEditText((EditText) view);
    }

    public void b(float f2) {
        if (this.C0.f1533c == f2) {
            return;
        }
        if (this.F0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.F0 = valueAnimator;
            valueAnimator.setInterpolator(b.b.a.a.c.a.f1371b);
            this.F0.setDuration(167L);
            this.F0.addUpdateListener(new d());
        }
        this.F0.setFloatValues(this.C0.f1533c, f2);
        this.F0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r7 = this;
            b.b.a.a.w.g r0 = r7.F
            if (r0 != 0) goto L5
            return
        L5:
            b.b.a.a.w.g$b r1 = r0.f1578a
            b.b.a.a.w.j r1 = r1.f1582a
            b.b.a.a.w.j r2 = r7.I
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == r2) goto L4a
            r0.setShapeAppearanceModel(r2)
            int r0 = r7.c0
            if (r0 != r3) goto L4a
            int r0 = r7.L
            if (r0 != r4) goto L4a
            android.util.SparseArray<b.b.a.a.z.m> r0 = r7.d0
            java.lang.Object r0 = r0.get(r3)
            b.b.a.a.z.h r0 = (b.b.a.a.z.h) r0
            android.widget.EditText r1 = r7.e
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            java.util.Objects.requireNonNull(r0)
            android.text.method.KeyListener r2 = r1.getKeyListener()
            if (r2 == 0) goto L33
            r2 = r6
            goto L34
        L33:
            r2 = r5
        L34:
            if (r2 != 0) goto L4a
            com.google.android.material.textfield.TextInputLayout r2 = r0.f1643a
            int r2 = r2.getBoxBackgroundMode()
            if (r2 != r4) goto L4a
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.LayerDrawable
            if (r2 != 0) goto L47
            goto L4a
        L47:
            r0.j(r1)
        L4a:
            int r0 = r7.L
            r1 = -1
            if (r0 != r4) goto L5e
            int r0 = r7.N
            if (r0 <= r1) goto L59
            int r0 = r7.Q
            if (r0 == 0) goto L59
            r0 = r6
            goto L5a
        L59:
            r0 = r5
        L5a:
            if (r0 == 0) goto L5e
            r0 = r6
            goto L5f
        L5e:
            r0 = r5
        L5f:
            if (r0 == 0) goto L6b
            b.b.a.a.w.g r0 = r7.F
            int r2 = r7.N
            float r2 = (float) r2
            int r4 = r7.Q
            r0.s(r2, r4)
        L6b:
            int r0 = r7.R
            int r2 = r7.L
            if (r2 != r6) goto L82
            r0 = 2130903291(0x7f0300fb, float:1.7413396E38)
            android.content.Context r2 = r7.getContext()
            int r0 = b.b.a.a.a.e(r2, r0, r5)
            int r2 = r7.R
            int r0 = a.h.d.a.b(r2, r0)
        L82:
            r7.R = r0
            b.b.a.a.w.g r2 = r7.F
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.q(r0)
            int r0 = r7.c0
            if (r0 != r3) goto L9a
            android.widget.EditText r0 = r7.e
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L9a:
            b.b.a.a.w.g r0 = r7.G
            if (r0 == 0) goto Ld0
            b.b.a.a.w.g r2 = r7.H
            if (r2 != 0) goto La3
            goto Ld0
        La3:
            int r2 = r7.N
            if (r2 <= r1) goto Lac
            int r1 = r7.Q
            if (r1 == 0) goto Lac
            r5 = r6
        Lac:
            if (r5 == 0) goto Lcd
            android.widget.EditText r1 = r7.e
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto Lb9
            int r1 = r7.s0
            goto Lbb
        Lb9:
            int r1 = r7.Q
        Lbb:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.q(r1)
            b.b.a.a.w.g r0 = r7.H
            int r1 = r7.Q
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.q(r1)
        Lcd:
            r7.invalidate()
        Ld0:
            r7.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.c():void");
    }

    public final int d() {
        float e2;
        if (!this.C) {
            return 0;
        }
        int i = this.L;
        if (i == 0) {
            e2 = this.C0.e();
        } else if (i != 2) {
            return 0;
        } else {
            e2 = this.C0.e() / 2.0f;
        }
        return (int) e2;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f != null) {
            boolean z = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.e.setHint(hint);
                this.E = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f1743a.getChildCount());
        for (int i2 = 0; i2 < this.f1743a.getChildCount(); i2++) {
            View childAt = this.f1743a.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.H0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.H0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        b.b.a.a.w.g gVar;
        super.draw(canvas);
        if (this.C) {
            b.b.a.a.r.e eVar = this.C0;
            Objects.requireNonNull(eVar);
            int save = canvas.save();
            if (eVar.C != null && eVar.f1532b) {
                eVar.N.setTextSize(eVar.G);
                float f2 = eVar.r;
                float f3 = eVar.s;
                float f4 = eVar.F;
                if (f4 != 1.0f) {
                    canvas.scale(f4, f4, f2, f3);
                }
                if (eVar.s()) {
                    float lineStart = eVar.r - eVar.Y.getLineStart(0);
                    int alpha = eVar.N.getAlpha();
                    canvas.translate(lineStart, f3);
                    float f5 = alpha;
                    eVar.N.setAlpha((int) (eVar.b0 * f5));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        TextPaint textPaint = eVar.N;
                        float f6 = eVar.H;
                        float f7 = eVar.I;
                        float f8 = eVar.J;
                        int i2 = eVar.K;
                        textPaint.setShadowLayer(f6, f7, f8, a.h.d.a.e(i2, (Color.alpha(i2) * textPaint.getAlpha()) / 255));
                    }
                    eVar.Y.draw(canvas);
                    eVar.N.setAlpha((int) (eVar.a0 * f5));
                    if (i >= 31) {
                        TextPaint textPaint2 = eVar.N;
                        float f9 = eVar.H;
                        float f10 = eVar.I;
                        float f11 = eVar.J;
                        int i3 = eVar.K;
                        textPaint2.setShadowLayer(f9, f10, f11, a.h.d.a.e(i3, (Color.alpha(i3) * textPaint2.getAlpha()) / 255));
                    }
                    int lineBaseline = eVar.Y.getLineBaseline(0);
                    CharSequence charSequence = eVar.c0;
                    float f12 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, eVar.N);
                    if (i >= 31) {
                        eVar.N.setShadowLayer(eVar.H, eVar.I, eVar.J, eVar.K);
                    }
                    String trim = eVar.c0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    eVar.N.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(eVar.Y.getLineEnd(0), str.length()), 0.0f, f12, (Paint) eVar.N);
                } else {
                    canvas.translate(f2, f3);
                    eVar.Y.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
        if (this.H == null || (gVar = this.G) == null) {
            return;
        }
        gVar.draw(canvas);
        if (!this.e.isFocused()) {
            return;
        }
        Rect bounds = this.H.getBounds();
        Rect bounds2 = this.G.getBounds();
        float f13 = this.C0.f1533c;
        int centerX = bounds2.centerX();
        int i4 = bounds2.left;
        TimeInterpolator timeInterpolator = b.b.a.a.c.a.f1370a;
        bounds.left = Math.round((i4 - centerX) * f13) + centerX;
        bounds.right = Math.round(f13 * (bounds2.right - centerX)) + centerX;
        this.H.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        if (this.G0) {
            return;
        }
        boolean z3 = true;
        this.G0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b.b.a.a.r.e eVar = this.C0;
        if (eVar != null) {
            eVar.L = drawableState;
            ColorStateList colorStateList2 = eVar.m;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = eVar.l) != null && colorStateList.isStateful())) {
                eVar.k(false);
                z2 = true;
            } else {
                z2 = false;
            }
            z = z2 | false;
        } else {
            z = false;
        }
        if (this.e != null) {
            AtomicInteger atomicInteger = w.f667a;
            if (!w.g.c(this) || !isEnabled()) {
                z3 = false;
            }
            z(z3, false);
        }
        v();
        E();
        if (z) {
            invalidate();
        }
        this.G0 = false;
    }

    public final boolean e() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof b.b.a.a.z.g);
    }

    public final int f(int i, boolean z) {
        int compoundPaddingLeft = this.e.getCompoundPaddingLeft() + i;
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final int g(int i, boolean z) {
        int compoundPaddingRight = i - this.e.getCompoundPaddingRight();
        return (getPrefixText() == null || !z) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        if (editText != null) {
            return d() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public b.b.a.a.w.g getBoxBackground() {
        int i = this.L;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.R;
    }

    public int getBoxBackgroundMode() {
        return this.L;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.M;
    }

    public float getBoxCornerRadiusBottomEnd() {
        b.b.a.a.w.c cVar;
        if (b.b.a.a.a.o(this)) {
            cVar = this.I.h;
        } else {
            cVar = this.I.g;
        }
        return cVar.a(this.U);
    }

    public float getBoxCornerRadiusBottomStart() {
        b.b.a.a.w.c cVar;
        if (b.b.a.a.a.o(this)) {
            cVar = this.I.g;
        } else {
            cVar = this.I.h;
        }
        return cVar.a(this.U);
    }

    public float getBoxCornerRadiusTopEnd() {
        b.b.a.a.w.c cVar;
        if (b.b.a.a.a.o(this)) {
            cVar = this.I.e;
        } else {
            cVar = this.I.f;
        }
        return cVar.a(this.U);
    }

    public float getBoxCornerRadiusTopStart() {
        b.b.a.a.w.c cVar;
        if (b.b.a.a.a.o(this)) {
            cVar = this.I.f;
        } else {
            cVar = this.I.e;
        }
        return cVar.a(this.U);
    }

    public int getBoxStrokeColor() {
        return this.u0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.v0;
    }

    public int getBoxStrokeWidth() {
        return this.O;
    }

    public int getBoxStrokeWidthFocused() {
        return this.P;
    }

    public int getCounterMaxLength() {
        return this.m;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.l || !this.n || (textView = this.o) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.y;
    }

    public ColorStateList getCounterTextColor() {
        return this.y;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.q0;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.e0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.e0.getDrawable();
    }

    public int getEndIconMode() {
        return this.c0;
    }

    public CheckableImageButton getEndIconView() {
        return this.e0;
    }

    public CharSequence getError() {
        n nVar = this.k;
        if (nVar.k) {
            return nVar.j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.k.m;
    }

    public int getErrorCurrentTextColors() {
        return this.k.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.n0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.k.g();
    }

    public CharSequence getHelperText() {
        n nVar = this.k;
        if (nVar.q) {
            return nVar.p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.k.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.C0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.C0.f();
    }

    public ColorStateList getHintTextColor() {
        return this.r0;
    }

    public int getMaxEms() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinEms() {
        return this.g;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.e0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.e0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.s) {
            return this.r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.f1744b.f1662c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1744b.f1661b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1744b.f1661b;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1744b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1744b.d.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.B;
    }

    public Typeface getTypeface() {
        return this.V;
    }

    public final boolean h() {
        return this.c0 != 0;
    }

    public final void i() {
        TextView textView = this.t;
        if (textView == null || !this.s) {
            return;
        }
        textView.setText((CharSequence) null);
        l.a(this.f1743a, this.x);
        this.t.setVisibility(4);
    }

    public boolean j() {
        return this.d.getVisibility() == 0 && this.e0.getVisibility() == 0;
    }

    public final boolean k() {
        return this.n0.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void m() {
        float f2;
        float f3;
        float f4;
        float f5;
        if (!e()) {
            return;
        }
        RectF rectF = this.U;
        b.b.a.a.r.e eVar = this.C0;
        int width = this.e.getWidth();
        int gravity = this.e.getGravity();
        boolean b2 = eVar.b(eVar.B);
        eVar.D = b2;
        if (gravity == 17 || (gravity & 7) == 1) {
            f2 = width / 2.0f;
            f3 = eVar.Z / 2.0f;
        } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? b2 : !b2) {
            f4 = eVar.f.left;
            rectF.left = f4;
            Rect rect = eVar.f;
            float f6 = rect.top;
            rectF.top = f6;
            if (gravity != 17 || (gravity & 7) == 1) {
                f5 = (width / 2.0f) + (eVar.Z / 2.0f);
            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                if (b2) {
                    f5 = eVar.Z + f4;
                }
                f5 = rect.right;
            } else {
                if (!b2) {
                    f5 = eVar.Z + f4;
                }
                f5 = rect.right;
            }
            rectF.right = f5;
            rectF.bottom = eVar.e() + f6;
            float f7 = rectF.left;
            float f8 = this.K;
            rectF.left = f7 - f8;
            rectF.right += f8;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.N);
            b.b.a.a.z.g gVar = (b.b.a.a.z.g) this.F;
            Objects.requireNonNull(gVar);
            gVar.y(rectF.left, rectF.top, rectF.right, rectF.bottom);
        } else {
            f2 = eVar.f.right;
            f3 = eVar.Z;
        }
        f4 = f2 - f3;
        rectF.left = f4;
        Rect rect2 = eVar.f;
        float f62 = rect2.top;
        rectF.top = f62;
        if (gravity != 17) {
        }
        f5 = (width / 2.0f) + (eVar.Z / 2.0f);
        rectF.right = f5;
        rectF.bottom = eVar.e() + f62;
        float f72 = rectF.left;
        float f82 = this.K;
        rectF.left = f72 - f82;
        rectF.right += f82;
        rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.N);
        b.b.a.a.z.g gVar2 = (b.b.a.a.z.g) this.F;
        Objects.requireNonNull(gVar2);
        gVar2.y(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void o() {
        b.b.a.a.a.v(this, this.e0, this.g0);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.C0.i(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.e != null && this.e.getMeasuredHeight() < (max = Math.max(this.f1745c.getMeasuredHeight(), this.f1744b.getMeasuredHeight()))) {
            this.e.setMinimumHeight(max);
            z = true;
        }
        boolean u = u();
        if (z || u) {
            this.e.post(new c());
        }
        if (this.t != null && (editText = this.e) != null) {
            this.t.setGravity(editText.getGravity());
            this.t.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
        C();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f701a);
        setError(hVar.f1750c);
        if (hVar.d) {
            this.e0.post(new b());
        }
        setHint(hVar.e);
        setHelperText(hVar.f);
        setPlaceholderText(hVar.g);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = false;
        boolean z2 = i == 1;
        boolean z3 = this.J;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            float a2 = this.I.e.a(this.U);
            float a3 = this.I.f.a(this.U);
            float a4 = this.I.h.a(this.U);
            float a5 = this.I.g.a(this.U);
            float f2 = z ? a2 : a3;
            if (z) {
                a2 = a3;
            }
            float f3 = z ? a4 : a5;
            if (z) {
                a4 = a5;
            }
            boolean o = b.b.a.a.a.o(this);
            this.J = o;
            float f4 = o ? a2 : f2;
            if (!o) {
                f2 = a2;
            }
            float f5 = o ? a4 : f3;
            if (!o) {
                f3 = a4;
            }
            b.b.a.a.w.g gVar = this.F;
            if (gVar != null && gVar.m() == f4) {
                b.b.a.a.w.g gVar2 = this.F;
                if (gVar2.f1578a.f1582a.f.a(gVar2.i()) == f2) {
                    b.b.a.a.w.g gVar3 = this.F;
                    if (gVar3.f1578a.f1582a.h.a(gVar3.i()) == f5) {
                        b.b.a.a.w.g gVar4 = this.F;
                        if (gVar4.f1578a.f1582a.g.a(gVar4.i()) == f3) {
                            return;
                        }
                    }
                }
            }
            j jVar = this.I;
            Objects.requireNonNull(jVar);
            j.b bVar = new j.b(jVar);
            bVar.f(f4);
            bVar.g(f2);
            bVar.d(f5);
            bVar.e(f3);
            this.I = bVar.a();
            c();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.k.e()) {
            hVar.f1750c = getError();
        }
        hVar.d = h() && this.e0.isChecked();
        hVar.e = getHint();
        hVar.f = getHelperText();
        hVar.g = getPlaceholderText();
        return hVar;
    }

    public void q(TextView textView, int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(2131820932);
            Context context = getContext();
            Object obj = a.h.c.a.f500a;
            textView.setTextColor(a.c.a(context, R.color.design_error));
        }
    }

    public final void r() {
        if (this.o != null) {
            EditText editText = this.e;
            s(editText == null ? 0 : editText.getText().length());
        }
    }

    public void s(int i) {
        boolean z = this.n;
        int i2 = this.m;
        String str = null;
        if (i2 == -1) {
            this.o.setText(String.valueOf(i));
            this.o.setContentDescription(null);
            this.n = false;
        } else {
            this.n = i > i2;
            Context context = getContext();
            this.o.setContentDescription(context.getString(this.n ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.m)));
            if (z != this.n) {
                t();
            }
            a.h.h.a c2 = a.h.h.a.c();
            TextView textView = this.o;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.m));
            a.h.h.c cVar = c2.f587c;
            if (string != null) {
                str = c2.d(string, cVar, true).toString();
            }
            textView.setText(str);
        }
        if (this.e == null || z == this.n) {
            return;
        }
        z(false, false);
        E();
        v();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.R != i) {
            this.R = i;
            this.w0 = i;
            this.y0 = i;
            this.z0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        Context context = getContext();
        Object obj = a.h.c.a.f500a;
        setBoxBackgroundColor(a.c.a(context, i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.w0 = defaultColor;
        this.R = defaultColor;
        this.x0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.y0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.z0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.L) {
            return;
        }
        this.L = i;
        if (this.e == null) {
            return;
        }
        l();
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.M = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.u0 != i) {
            this.u0 = i;
            E();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.u0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            E();
        }
        this.s0 = colorStateList.getDefaultColor();
        this.A0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.t0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.u0 = defaultColor;
        E();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.v0 != colorStateList) {
            this.v0 = colorStateList;
            E();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.O = i;
        E();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.P = i;
        E();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.l != z) {
            if (z) {
                f0 f0Var = new f0(getContext(), null);
                this.o = f0Var;
                f0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.V;
                if (typeface != null) {
                    this.o.setTypeface(typeface);
                }
                this.o.setMaxLines(1);
                this.k.a(this.o, 2);
                ((ViewGroup.MarginLayoutParams) this.o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                t();
                r();
            } else {
                this.k.j(this.o, 2);
                this.o = null;
            }
            this.l = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.m != i) {
            if (i <= 0) {
                i = -1;
            }
            this.m = i;
            if (!this.l) {
                return;
            }
            r();
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.p != i) {
            this.p = i;
            t();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            t();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.q != i) {
            this.q = i;
            t();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            t();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.q0 = colorStateList;
        this.r0 = colorStateList;
        if (this.e != null) {
            z(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        n(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.e0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.e0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.e0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? a.b.a.e(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.e0.setImageDrawable(drawable);
        if (drawable != null) {
            b.b.a.a.a.a(this, this.e0, this.g0, this.h0);
            o();
        }
    }

    public void setEndIconMode(int i) {
        int i2 = this.c0;
        if (i2 == i) {
            return;
        }
        this.c0 = i;
        Iterator<g> it = this.f0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().b(this.L)) {
            getEndIconDelegate().a();
            b.b.a.a.a.a(this, this.e0, this.g0, this.h0);
            return;
        }
        StringBuilder f2 = b.a.a.a.a.f("The current box background mode ");
        f2.append(this.L);
        f2.append(" is not supported by the end icon mode ");
        f2.append(i);
        throw new IllegalStateException(f2.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.e0;
        View.OnLongClickListener onLongClickListener = this.l0;
        checkableImageButton.setOnClickListener(onClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.l0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.e0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.g0 != colorStateList) {
            this.g0 = colorStateList;
            b.b.a.a.a.a(this, this.e0, colorStateList, this.h0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.h0 != mode) {
            this.h0 = mode;
            b.b.a.a.a.a(this, this.e0, this.g0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        if (j() != z) {
            this.e0.setVisibility(z ? 0 : 8);
            w();
            C();
            u();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.k.k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            n nVar = this.k;
            nVar.c();
            nVar.j = charSequence;
            nVar.l.setText(charSequence);
            int i = nVar.h;
            if (i != 1) {
                nVar.i = 1;
            }
            nVar.l(i, nVar.i, nVar.k(nVar.l, charSequence));
            return;
        }
        this.k.i();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        n nVar = this.k;
        nVar.m = charSequence;
        TextView textView = nVar.l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        n nVar = this.k;
        if (nVar.k == z) {
            return;
        }
        nVar.c();
        if (z) {
            f0 f0Var = new f0(nVar.f1646a, null);
            nVar.l = f0Var;
            f0Var.setId(R.id.textinput_error);
            nVar.l.setTextAlignment(5);
            Typeface typeface = nVar.u;
            if (typeface != null) {
                nVar.l.setTypeface(typeface);
            }
            int i = nVar.n;
            nVar.n = i;
            TextView textView = nVar.l;
            if (textView != null) {
                nVar.f1647b.q(textView, i);
            }
            ColorStateList colorStateList = nVar.o;
            nVar.o = colorStateList;
            TextView textView2 = nVar.l;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            CharSequence charSequence = nVar.m;
            nVar.m = charSequence;
            TextView textView3 = nVar.l;
            if (textView3 != null) {
                textView3.setContentDescription(charSequence);
            }
            nVar.l.setVisibility(4);
            TextView textView4 = nVar.l;
            AtomicInteger atomicInteger = w.f667a;
            w.g.f(textView4, 1);
            nVar.a(nVar.l, 0);
        } else {
            nVar.i();
            nVar.j(nVar.l, 0);
            nVar.l = null;
            nVar.f1647b.v();
            nVar.f1647b.E();
        }
        nVar.k = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? a.b.a.e(getContext(), i) : null);
        b.b.a.a.a.v(this, this.n0, this.o0);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.n0.setImageDrawable(drawable);
        x();
        b.b.a.a.a.a(this, this.n0, this.o0, this.p0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.n0;
        View.OnLongClickListener onLongClickListener = this.m0;
        checkableImageButton.setOnClickListener(onClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.m0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.n0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.o0 != colorStateList) {
            this.o0 = colorStateList;
            b.b.a.a.a.a(this, this.n0, colorStateList, this.p0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.p0 != mode) {
            this.p0 = mode;
            b.b.a.a.a.a(this, this.n0, this.o0, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        n nVar = this.k;
        nVar.n = i;
        TextView textView = nVar.l;
        if (textView != null) {
            nVar.f1647b.q(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        n nVar = this.k;
        nVar.o = colorStateList;
        TextView textView = nVar.l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.D0 != z) {
            this.D0 = z;
            z(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (!this.k.q) {
                return;
            }
            setHelperTextEnabled(false);
            return;
        }
        if (!this.k.q) {
            setHelperTextEnabled(true);
        }
        n nVar = this.k;
        nVar.c();
        nVar.p = charSequence;
        nVar.r.setText(charSequence);
        int i = nVar.h;
        if (i != 2) {
            nVar.i = 2;
        }
        nVar.l(i, nVar.i, nVar.k(nVar.r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        n nVar = this.k;
        nVar.t = colorStateList;
        TextView textView = nVar.r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        n nVar = this.k;
        if (nVar.q == z) {
            return;
        }
        nVar.c();
        if (z) {
            f0 f0Var = new f0(nVar.f1646a, null);
            nVar.r = f0Var;
            f0Var.setId(R.id.textinput_helper_text);
            nVar.r.setTextAlignment(5);
            Typeface typeface = nVar.u;
            if (typeface != null) {
                nVar.r.setTypeface(typeface);
            }
            nVar.r.setVisibility(4);
            TextView textView = nVar.r;
            AtomicInteger atomicInteger = w.f667a;
            w.g.f(textView, 1);
            int i = nVar.s;
            nVar.s = i;
            TextView textView2 = nVar.r;
            if (textView2 != null) {
                textView2.setTextAppearance(i);
            }
            ColorStateList colorStateList = nVar.t;
            nVar.t = colorStateList;
            TextView textView3 = nVar.r;
            if (textView3 != null && colorStateList != null) {
                textView3.setTextColor(colorStateList);
            }
            nVar.a(nVar.r, 1);
            nVar.r.setAccessibilityDelegate(new o(nVar));
        } else {
            nVar.c();
            int i2 = nVar.h;
            if (i2 == 2) {
                nVar.i = 0;
            }
            nVar.l(i2, nVar.i, nVar.k(nVar.r, ""));
            nVar.j(nVar.r, 1);
            nVar.r = null;
            nVar.f1647b.v();
            nVar.f1647b.E();
        }
        nVar.q = z;
    }

    public void setHelperTextTextAppearance(int i) {
        n nVar = this.k;
        nVar.s = i;
        TextView textView = nVar.r;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.E0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.C) {
            this.C = z;
            if (!z) {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.D);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (this.e == null) {
                return;
            }
            y();
        }
    }

    public void setHintTextAppearance(int i) {
        b.b.a.a.r.e eVar = this.C0;
        b.b.a.a.t.b bVar = new b.b.a.a.t.b(eVar.f1531a.getContext(), i);
        ColorStateList colorStateList = bVar.j;
        if (colorStateList != null) {
            eVar.m = colorStateList;
        }
        float f2 = bVar.k;
        if (f2 != 0.0f) {
            eVar.k = f2;
        }
        ColorStateList colorStateList2 = bVar.f1562a;
        if (colorStateList2 != null) {
            eVar.U = colorStateList2;
        }
        eVar.S = bVar.e;
        eVar.T = bVar.f;
        eVar.R = bVar.g;
        eVar.V = bVar.i;
        b.b.a.a.t.a aVar = eVar.A;
        if (aVar != null) {
            aVar.f1561c = true;
        }
        b.b.a.a.r.d dVar = new b.b.a.a.r.d(eVar);
        bVar.a();
        eVar.A = new b.b.a.a.t.a(dVar, bVar.n);
        bVar.c(eVar.f1531a.getContext(), eVar.A);
        eVar.k(false);
        this.r0 = this.C0.m;
        if (this.e != null) {
            z(false, false);
            y();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.r0 != colorStateList) {
            if (this.q0 == null) {
                b.b.a.a.r.e eVar = this.C0;
                if (eVar.m != colorStateList) {
                    eVar.m = colorStateList;
                    eVar.k(false);
                }
            }
            this.r0 = colorStateList;
            if (this.e == null) {
                return;
            }
            z(false, false);
        }
    }

    public void setMaxEms(int i) {
        this.h = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.j = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.g = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.i = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.e0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? a.b.a.e(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.e0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.c0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.g0 = colorStateList;
        b.b.a.a.a.a(this, this.e0, colorStateList, this.h0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.h0 = mode;
        b.b.a.a.a.a(this, this.e0, this.g0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.t == null) {
            f0 f0Var = new f0(getContext(), null);
            this.t = f0Var;
            f0Var.setId(R.id.textinput_placeholder);
            TextView textView = this.t;
            AtomicInteger atomicInteger = w.f667a;
            w.d.s(textView, 2);
            a.s.c cVar = new a.s.c();
            cVar.f1096c = 87L;
            TimeInterpolator timeInterpolator = b.b.a.a.c.a.f1370a;
            cVar.d = timeInterpolator;
            this.w = cVar;
            cVar.f1095b = 67L;
            a.s.c cVar2 = new a.s.c();
            cVar2.f1096c = 87L;
            cVar2.d = timeInterpolator;
            this.x = cVar2;
            setPlaceholderTextAppearance(this.v);
            setPlaceholderTextColor(this.u);
        }
        int i = 0;
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.s) {
                setPlaceholderTextEnabled(true);
            }
            this.r = charSequence;
        }
        EditText editText = this.e;
        if (editText != null) {
            i = editText.getText().length();
        }
        A(i);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.v = i;
        TextView textView = this.t;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            TextView textView = this.t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f1744b.a(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.f1744b.f1661b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1744b.f1661b.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f1744b.d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        t tVar = this.f1744b;
        if (tVar.d.getContentDescription() != charSequence) {
            tVar.d.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? a.b.a.e(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1744b.c(drawable);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        t tVar = this.f1744b;
        CheckableImageButton checkableImageButton = tVar.d;
        View.OnLongClickListener onLongClickListener = tVar.g;
        checkableImageButton.setOnClickListener(onClickListener);
        b.b.a.a.a.A(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        t tVar = this.f1744b;
        tVar.g = onLongClickListener;
        CheckableImageButton checkableImageButton = tVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        b.b.a.a.a.A(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        t tVar = this.f1744b;
        if (tVar.e != colorStateList) {
            tVar.e = colorStateList;
            b.b.a.a.a.a(tVar.f1660a, tVar.d, colorStateList, tVar.f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        t tVar = this.f1744b;
        if (tVar.f != mode) {
            tVar.f = mode;
            b.b.a.a.a.a(tVar.f1660a, tVar.d, tVar.e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f1744b.f(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.B.setText(charSequence);
        D();
    }

    public void setSuffixTextAppearance(int i) {
        this.B.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.e;
        if (editText != null) {
            w.p(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.V) {
            this.V = typeface;
            this.C0.r(typeface);
            n nVar = this.k;
            if (typeface != nVar.u) {
                nVar.u = typeface;
                TextView textView = nVar.l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = nVar.r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.o;
            if (textView3 == null) {
                return;
            }
            textView3.setTypeface(typeface);
        }
    }

    public final void t() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.o;
        if (textView != null) {
            q(textView, this.n ? this.p : this.q);
            if (!this.n && (colorStateList2 = this.y) != null) {
                this.o.setTextColor(colorStateList2);
            }
            if (!this.n || (colorStateList = this.z) == null) {
                return;
            }
            this.o.setTextColor(colorStateList);
        }
    }

    public boolean u() {
        boolean z;
        if (this.e == null) {
            return false;
        }
        boolean z2 = true;
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f1744b.getMeasuredWidth() > 0) {
            int measuredWidth = this.f1744b.getMeasuredWidth() - this.e.getPaddingLeft();
            if (this.W == null || this.a0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.W = colorDrawable;
                this.a0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.W;
            if (drawable != drawable2) {
                this.e.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.W != null) {
                Drawable[] compoundDrawablesRelative2 = this.e.getCompoundDrawablesRelative();
                this.e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.W = null;
                z = true;
            }
            z = false;
        }
        if ((this.n0.getVisibility() == 0 || ((h() && j()) || this.A != null)) && this.f1745c.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.B.getMeasuredWidth() - this.e.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.e.getCompoundDrawablesRelative();
            Drawable drawable3 = this.i0;
            if (drawable3 == null || this.j0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.i0 = colorDrawable2;
                    this.j0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.i0;
                if (drawable4 != drawable5) {
                    this.k0 = compoundDrawablesRelative3[2];
                    this.e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.j0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.i0, compoundDrawablesRelative3[3]);
            }
        } else if (this.i0 == null) {
            return z;
        } else {
            Drawable[] compoundDrawablesRelative4 = this.e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.i0) {
                this.e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.k0, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.i0 = null;
        }
        return z2;
    }

    public void v() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.e;
        if (editText == null || this.L != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (k0.a(background)) {
            background = background.mutate();
        }
        if (this.k.e()) {
            currentTextColor = this.k.g();
        } else if (!this.n || (textView = this.o) == null) {
            background.clearColorFilter();
            this.e.refreshDrawableState();
            return;
        } else {
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(a.b.f.l.c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public final void w() {
        int i = 8;
        this.d.setVisibility((this.e0.getVisibility() != 0 || k()) ? 8 : 0);
        boolean z = j() || k() || !((this.A == null || this.B0) ? true : false);
        LinearLayout linearLayout = this.f1745c;
        if (z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getErrorIconDrawable()
            r1 = 0
            if (r0 == 0) goto L15
            b.b.a.a.z.n r0 = r3.k
            boolean r2 = r0.k
            if (r2 == 0) goto L15
            boolean r0 = r0.e()
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = r1
        L16:
            com.google.android.material.internal.CheckableImageButton r2 = r3.n0
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r1 = 8
        L1d:
            r2.setVisibility(r1)
            r3.w()
            r3.C()
            boolean r0 = r3.h()
            if (r0 != 0) goto L2f
            r3.u()
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.x():void");
    }

    public final void y() {
        if (this.L != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1743a.getLayoutParams();
            int d2 = d();
            if (d2 == layoutParams.topMargin) {
                return;
            }
            layoutParams.topMargin = d2;
            this.f1743a.requestLayout();
        }
    }

    public final void z(boolean z, boolean z2) {
        ColorStateList colorStateList;
        b.b.a.a.r.e eVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean e2 = this.k.e();
        ColorStateList colorStateList2 = this.q0;
        if (colorStateList2 != null) {
            b.b.a.a.r.e eVar2 = this.C0;
            if (eVar2.m != colorStateList2) {
                eVar2.m = colorStateList2;
                eVar2.k(false);
            }
            b.b.a.a.r.e eVar3 = this.C0;
            ColorStateList colorStateList3 = this.q0;
            if (eVar3.l != colorStateList3) {
                eVar3.l = colorStateList3;
                eVar3.k(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.q0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.A0) : this.A0;
            this.C0.m(ColorStateList.valueOf(colorForState));
            b.b.a.a.r.e eVar4 = this.C0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (eVar4.l != valueOf) {
                eVar4.l = valueOf;
                eVar4.k(false);
            }
        } else if (e2) {
            b.b.a.a.r.e eVar5 = this.C0;
            TextView textView2 = this.k.l;
            eVar5.m(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.n && (textView = this.o) != null) {
                eVar = this.C0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.r0) != null) {
                eVar = this.C0;
            }
            eVar.m(colorStateList);
        }
        if (z3 || !this.D0 || (isEnabled() && z4)) {
            if (!z2 && !this.B0) {
                return;
            }
            ValueAnimator valueAnimator = this.F0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.F0.cancel();
            }
            if (!z || !this.E0) {
                this.C0.p(1.0f);
            } else {
                b(1.0f);
            }
            this.B0 = false;
            if (e()) {
                m();
            }
            EditText editText3 = this.e;
            A(editText3 == null ? 0 : editText3.getText().length());
            t tVar = this.f1744b;
            tVar.h = false;
            tVar.h();
            D();
        } else if (!z2 && this.B0) {
        } else {
            ValueAnimator valueAnimator2 = this.F0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.F0.cancel();
            }
            if (!z || !this.E0) {
                this.C0.p(0.0f);
            } else {
                b(0.0f);
            }
            if (e() && (!((b.b.a.a.z.g) this.F).A.isEmpty()) && e()) {
                ((b.b.a.a.z.g) this.F).y(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.B0 = true;
            i();
            t tVar2 = this.f1744b;
            tVar2.h = true;
            tVar2.h();
            D();
        }
    }
}
