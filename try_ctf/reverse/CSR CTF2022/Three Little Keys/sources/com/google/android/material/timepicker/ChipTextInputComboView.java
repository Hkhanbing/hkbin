package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import b.b.a.a.r.m;
import b.b.a.a.r.p;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    public final Chip f1751a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f1752b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f1753c;
    public TextWatcher d;

    /* loaded from: classes.dex */
    public class b extends m {
        public b(a aVar) {
        }

        @Override // b.b.a.a.r.m, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f1751a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.f1751a.setText(ChipTextInputComboView.a(chipTextInputComboView2, editable));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f1751a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f1752b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f1753c = editText;
        editText.setVisibility(4);
        b bVar = new b(null);
        this.d = bVar;
        editText.addTextChangedListener(bVar);
        b();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public final void b() {
        this.f1753c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f1751a.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f1751a.setChecked(z);
        int i = 0;
        this.f1753c.setVisibility(z ? 0 : 4);
        Chip chip = this.f1751a;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            EditText editText = this.f1753c;
            editText.requestFocus();
            editText.post(new p(editText));
            if (TextUtils.isEmpty(this.f1753c.getText())) {
                return;
            }
            EditText editText2 = this.f1753c;
            editText2.setSelection(editText2.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1751a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.f1751a.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f1751a.toggle();
    }
}
