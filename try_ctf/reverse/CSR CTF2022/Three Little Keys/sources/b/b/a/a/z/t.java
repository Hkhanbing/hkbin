package b.b.a.a.z;

import a.b.f.d1;
import a.b.f.f0;
import a.h.j.w;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class t extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f1660a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f1661b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f1662c;
    public final CheckableImageButton d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public View.OnLongClickListener g;
    public boolean h;

    public t(TextInputLayout textInputLayout, d1 d1Var) {
        super(textInputLayout.getContext());
        this.f1660a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.d = checkableImageButton;
        f0 f0Var = new f0(getContext(), null);
        this.f1661b = f0Var;
        if (b.b.a.a.a.m(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        d(null);
        e(null);
        if (d1Var.o(62)) {
            this.e = b.b.a.a.a.h(getContext(), d1Var, 62);
        }
        if (d1Var.o(63)) {
            this.f = b.b.a.a.a.t(d1Var.j(63, -1), null);
        }
        if (d1Var.o(61)) {
            c(d1Var.g(61));
            if (d1Var.o(60)) {
                b(d1Var.n(60));
            }
            checkableImageButton.setCheckable(d1Var.a(59, true));
        }
        f0Var.setVisibility(8);
        f0Var.setId(R.id.textinput_prefix_text);
        f0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        AtomicInteger atomicInteger = w.f667a;
        w.g.f(f0Var, 1);
        f0Var.setTextAppearance(d1Var.l(55, 0));
        if (d1Var.o(56)) {
            f0Var.setTextColor(d1Var.c(56));
        }
        a(d1Var.n(54));
        addView(checkableImageButton);
        addView(f0Var);
    }

    public void a(CharSequence charSequence) {
        this.f1662c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f1661b.setText(charSequence);
        h();
    }

    public void b(CharSequence charSequence) {
        if (this.d.getContentDescription() != charSequence) {
            this.d.setContentDescription(charSequence);
        }
    }

    public void c(Drawable drawable) {
        this.d.setImageDrawable(drawable);
        if (drawable != null) {
            b.b.a.a.a.a(this.f1660a, this.d, this.e, this.f);
            f(true);
            b.b.a.a.a.v(this.f1660a, this.d, this.e);
            return;
        }
        f(false);
        d(null);
        e(null);
        b(null);
    }

    public void d(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.d;
        View.OnLongClickListener onLongClickListener = this.g;
        checkableImageButton.setOnClickListener(null);
        b.b.a.a.a.A(checkableImageButton, onLongClickListener);
    }

    public void e(View.OnLongClickListener onLongClickListener) {
        this.g = null;
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setOnLongClickListener(null);
        b.b.a.a.a.A(checkableImageButton, null);
    }

    public void f(boolean z) {
        int i = 0;
        if ((this.d.getVisibility() == 0) != z) {
            CheckableImageButton checkableImageButton = this.d;
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            g();
            h();
        }
    }

    public void g() {
        EditText editText = this.f1660a.e;
        if (editText == null) {
            return;
        }
        int i = 0;
        if (!(this.d.getVisibility() == 0)) {
            AtomicInteger atomicInteger = w.f667a;
            i = w.e.f(editText);
        }
        TextView textView = this.f1661b;
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        AtomicInteger atomicInteger2 = w.f667a;
        w.e.k(textView, i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void h() {
        int i = 8;
        int i2 = (this.f1662c == null || this.h) ? 8 : 0;
        if (this.d.getVisibility() == 0 || i2 == 0) {
            i = 0;
        }
        setVisibility(i);
        this.f1661b.setVisibility(i2);
        this.f1660a.u();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        g();
    }
}
