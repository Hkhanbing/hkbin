package b.b.a.a.r;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public class c extends a.h.j.c {
    public final /* synthetic */ CheckableImageButton d;

    public c(CheckableImageButton checkableImageButton) {
        this.d = checkableImageButton;
    }

    @Override // a.h.j.c
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f621a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.d.isChecked());
    }

    @Override // a.h.j.c
    public void d(View view, a.h.j.d0.d dVar) {
        this.f621a.onInitializeAccessibilityNodeInfo(view, dVar.f633a);
        dVar.f633a.setCheckable(this.d.e);
        dVar.f633a.setChecked(this.d.isChecked());
    }
}
