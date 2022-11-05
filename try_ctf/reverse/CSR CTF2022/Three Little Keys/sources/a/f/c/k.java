package a.f.c;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class k extends b {
    public boolean i;
    public boolean j;

    @Override // a.f.c.b
    public void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // a.f.c.b
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f486b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.i = true;
                } else if (index == 22) {
                    this.j = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o() {
    }

    @Override // a.f.c.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i || this.j) {
            ViewParent parent = getParent();
            if (!(parent instanceof ConstraintLayout)) {
                return;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f449b; i++) {
                View d = constraintLayout.d(this.f448a[i]);
                if (d != null) {
                    if (this.i) {
                        d.setVisibility(visibility);
                    }
                    if (this.j && elevation > 0.0f) {
                        d.setTranslationZ(d.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }
}
