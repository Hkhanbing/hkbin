package a.k.b;

import a.k.a.h;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f779a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f780b;

    /* renamed from: c  reason: collision with root package name */
    public h.e f781c;
    public boolean d = true;

    /* loaded from: classes.dex */
    public static class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<EditText> f782a;

        public a(EditText editText) {
            this.f782a = new WeakReference(editText);
        }

        @Override // a.k.a.h.e
        public void a() {
            g.a(this.f782a.get(), 1);
        }
    }

    public g(EditText editText, boolean z) {
        this.f779a = editText;
        this.f780b = z;
    }

    public static void a(EditText editText, int i) {
        if (i != 1 || editText == null || !editText.isAttachedToWindow()) {
            return;
        }
        Editable editableText = editText.getEditableText();
        int selectionStart = Selection.getSelectionStart(editableText);
        int selectionEnd = Selection.getSelectionEnd(editableText);
        a.k.a.h.a().h(editableText);
        if (selectionStart >= 0 && selectionEnd >= 0) {
            Selection.setSelection(editableText, selectionStart, selectionEnd);
        } else if (selectionStart >= 0) {
            Selection.setSelection(editableText, selectionStart);
        } else if (selectionEnd < 0) {
        } else {
            Selection.setSelection(editableText, selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f779a.isInEditMode()) {
            if ((!this.d || (!this.f780b && !a.k.a.h.c())) || i2 > i3 || !(charSequence instanceof Spannable)) {
                return;
            }
            int b2 = a.k.a.h.a().b();
            if (b2 != 0) {
                if (b2 == 1) {
                    a.k.a.h.a().i((Spannable) charSequence, i, i + i3, Integer.MAX_VALUE, 0);
                    return;
                } else if (b2 != 3) {
                    return;
                }
            }
            a.k.a.h a2 = a.k.a.h.a();
            if (this.f781c == null) {
                this.f781c = new a(this.f779a);
            }
            a2.j(this.f781c);
        }
    }
}
