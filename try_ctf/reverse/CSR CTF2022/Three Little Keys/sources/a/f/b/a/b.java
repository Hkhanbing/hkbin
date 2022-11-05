package a.f.b.a;

import a.f.b.a.c;
import a.f.c.i;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class b extends a.f.c.b implements c.InterfaceC0009c {
    public boolean i;
    public boolean j;
    public float k;
    public View[] l;

    @Override // a.f.b.a.c.InterfaceC0009c
    public void a(c cVar, int i, int i2) {
    }

    @Override // a.f.b.a.c.InterfaceC0009c
    public void b(c cVar, int i, int i2, float f) {
    }

    public float getProgress() {
        return this.k;
    }

    @Override // a.f.c.b
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.i = obtainStyledAttributes.getBoolean(index, this.i);
                } else if (index == 0) {
                    this.j = obtainStyledAttributes.getBoolean(index, this.j);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o() {
    }

    public void setProgress(float f) {
        this.k = f;
        int i = 0;
        if (this.f449b <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                if (!(viewGroup.getChildAt(i) instanceof b)) {
                    o();
                }
                i++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.g;
        if (viewArr == null || viewArr.length != this.f449b) {
            this.g = new View[this.f449b];
        }
        for (int i2 = 0; i2 < this.f449b; i2++) {
            this.g[i2] = constraintLayout.d(this.f448a[i2]);
        }
        this.l = this.g;
        while (i < this.f449b) {
            View view = this.l[i];
            o();
            i++;
        }
    }
}
