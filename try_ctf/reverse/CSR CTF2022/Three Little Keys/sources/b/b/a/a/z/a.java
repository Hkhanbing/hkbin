package b.b.a.a.z;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public class a extends m {
    public final TextWatcher e;
    public final View.OnFocusChangeListener f;
    public final TextInputLayout.f g;
    public final TextInputLayout.g h;
    public AnimatorSet i;
    public ValueAnimator j;

    /* renamed from: b.b.a.a.z.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0043a implements TextWatcher {
        public C0043a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f1643a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.f(a.e(aVar));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            a aVar = a.this;
            aVar.f(a.e(aVar));
        }
    }

    /* loaded from: classes.dex */
    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.e(a.this));
            editText.setOnFocusChangeListener(a.this.f);
            a aVar = a.this;
            aVar.f1645c.setOnFocusChangeListener(aVar.f);
            editText.removeTextChangedListener(a.this.e);
            editText.addTextChangedListener(a.this.e);
        }
    }

    /* loaded from: classes.dex */
    public class d implements TextInputLayout.g {

        /* renamed from: b.b.a.a.z.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0044a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ EditText f1620a;

            public RunnableC0044a(EditText editText) {
                this.f1620a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1620a.removeTextChangedListener(a.this.e);
                a.this.f(true);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new RunnableC0044a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f) {
                editText.setOnFocusChangeListener(null);
            }
            View.OnFocusChangeListener onFocusChangeListener = a.this.f1645c.getOnFocusChangeListener();
            a aVar = a.this;
            if (onFocusChangeListener != aVar.f) {
                return;
            }
            aVar.f1645c.setOnFocusChangeListener(null);
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f1643a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f1643a.o();
        }
    }

    public a(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.e = new C0043a();
        this.f = new b();
        this.g = new c();
        this.h = new d();
    }

    public static boolean e(a aVar) {
        EditText editText = aVar.f1643a.getEditText();
        return editText != null && (editText.hasFocus() || aVar.f1645c.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // b.b.a.a.z.m
    public void a() {
        TextInputLayout textInputLayout = this.f1643a;
        int i = this.d;
        if (i == 0) {
            i = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f1643a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f1643a.setEndIconCheckable(false);
        this.f1643a.setEndIconOnClickListener(new e());
        this.f1643a.a(this.g);
        this.f1643a.f0.add(this.h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(b.b.a.a.c.a.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new b.b.a.a.z.e(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = b.b.a.a.c.a.f1370a;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new b.b.a.a.z.d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.i = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.i.addListener(new b.b.a.a.z.b(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new b.b.a.a.z.d(this));
        this.j = ofFloat3;
        ofFloat3.addListener(new b.b.a.a.z.c(this));
    }

    @Override // b.b.a.a.z.m
    public void c(boolean z) {
        if (this.f1643a.getSuffixText() == null) {
            return;
        }
        f(z);
    }

    public final void f(boolean z) {
        boolean z2 = this.f1643a.j() == z;
        if (z && !this.i.isRunning()) {
            this.j.cancel();
            this.i.start();
            if (!z2) {
                return;
            }
            this.i.end();
        } else if (z) {
        } else {
            this.i.cancel();
            this.j.start();
            if (!z2) {
                return;
            }
            this.j.end();
        }
    }
}
