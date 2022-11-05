package a.h.j.d0;

import a.h.j.w;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import b.b.a.a.z.h;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final b f632a;

    public c(b bVar) {
        this.f632a = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f632a.equals(((c) obj).f632a);
        }
        return false;
    }

    public int hashCode() {
        return this.f632a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        AutoCompleteTextView autoCompleteTextView;
        h.g gVar = (h.g) this.f632a;
        TextInputLayout textInputLayout = h.this.f1643a;
        if (textInputLayout == null || (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) == null) {
            return;
        }
        int i = 1;
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        CheckableImageButton checkableImageButton = h.this.f1645c;
        if (z) {
            i = 2;
        }
        AtomicInteger atomicInteger = w.f667a;
        w.d.s(checkableImageButton, i);
    }
}
