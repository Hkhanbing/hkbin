package b.b.a.a.z;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public class s extends m {
    public final TextWatcher e;
    public final TextInputLayout.f f;
    public final TextInputLayout.g g;

    /* loaded from: classes.dex */
    public class a extends b.b.a.a.r.m {
        public a() {
        }

        @Override // b.b.a.a.r.m, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            s sVar = s.this;
            sVar.f1645c.setChecked(!s.e(sVar));
        }
    }

    /* loaded from: classes.dex */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            s sVar = s.this;
            sVar.f1645c.setChecked(!s.e(sVar));
            editText.removeTextChangedListener(s.this.e);
            editText.addTextChangedListener(s.this.e);
        }
    }

    /* loaded from: classes.dex */
    public class c implements TextInputLayout.g {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ EditText f1657a;

            public a(EditText editText) {
                this.f1657a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1657a.removeTextChangedListener(s.this.e);
            }
        }

        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = s.this.f1643a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(s.e(s.this) ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            s.this.f1643a.o();
        }
    }

    public s(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.e = new a();
        this.f = new b();
        this.g = new c();
    }

    public static boolean e(s sVar) {
        EditText editText = sVar.f1643a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // b.b.a.a.z.m
    public void a() {
        TextInputLayout textInputLayout = this.f1643a;
        int i = this.d;
        if (i == 0) {
            i = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f1643a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        boolean z = true;
        this.f1643a.setEndIconVisible(true);
        this.f1643a.setEndIconCheckable(true);
        this.f1643a.setEndIconOnClickListener(new d());
        this.f1643a.a(this.f);
        TextInputLayout textInputLayout3 = this.f1643a;
        textInputLayout3.f0.add(this.g);
        EditText editText = this.f1643a.getEditText();
        if (editText == null || (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224)) {
            z = false;
        }
        if (z) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
