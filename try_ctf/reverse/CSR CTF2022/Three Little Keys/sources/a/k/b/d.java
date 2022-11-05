package a.k.b;

import a.k.a.h;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f768a;

    /* renamed from: b  reason: collision with root package name */
    public h.e f769b;

    /* loaded from: classes.dex */
    public static class a extends h.e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<TextView> f770a;

        /* renamed from: b  reason: collision with root package name */
        public final Reference<d> f771b;

        public a(TextView textView, d dVar) {
            this.f770a = new WeakReference(textView);
            this.f771b = new WeakReference(dVar);
        }

        @Override // a.k.a.h.e
        public void a() {
            InputFilter[] filters;
            TextView textView = this.f770a.get();
            d dVar = this.f771b.get();
            boolean z = false;
            if (dVar != null && textView != null && (filters = textView.getFilters()) != null) {
                int i = 0;
                while (true) {
                    if (i >= filters.length) {
                        break;
                    } else if (filters[i] == dVar) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z && textView.isAttachedToWindow()) {
                CharSequence h = a.k.a.h.a().h(textView.getText());
                int selectionStart = Selection.getSelectionStart(h);
                int selectionEnd = Selection.getSelectionEnd(h);
                textView.setText(h);
                if (!(h instanceof Spannable)) {
                    return;
                }
                Spannable spannable = (Spannable) h;
                if (selectionStart >= 0 && selectionEnd >= 0) {
                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                } else if (selectionStart >= 0) {
                    Selection.setSelection(spannable, selectionStart);
                } else if (selectionEnd < 0) {
                } else {
                    Selection.setSelection(spannable, selectionEnd);
                }
            }
        }
    }

    public d(TextView textView) {
        this.f768a = textView;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f768a.isInEditMode()) {
            return charSequence;
        }
        int b2 = a.k.a.h.a().b();
        if (b2 != 0) {
            boolean z = true;
            if (b2 == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f768a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                CharSequence charSequence2 = charSequence;
                return a.k.a.h.a().i(charSequence2, 0, charSequence2.length(), Integer.MAX_VALUE, 0);
            } else if (b2 != 3) {
                return charSequence;
            }
        }
        a.k.a.h a2 = a.k.a.h.a();
        if (this.f769b == null) {
            this.f769b = new a(this.f768a, this);
        }
        a2.j(this.f769b);
        return charSequence;
    }
}
