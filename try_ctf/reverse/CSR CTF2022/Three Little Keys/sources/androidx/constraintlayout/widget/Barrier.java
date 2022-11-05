package androidx.constraintlayout.widget;

import a.f.a.i.a;
import a.f.c.b;
import a.f.c.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Barrier extends b {
    public int i;
    public int j;
    public a k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.k.u0;
    }

    public int getMargin() {
        return this.k.v0;
    }

    public int getType() {
        return this.i;
    }

    @Override // a.f.c.b
    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.k = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f486b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.k.u0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.k.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.d = this.k;
        n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r0 == 6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r0 == 6) goto L11;
     */
    @Override // a.f.c.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(a.f.a.i.d r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.i
            r3.j = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto Le
            if (r0 != r2) goto Lb
            goto L16
        Lb:
            if (r0 != r1) goto L18
            goto L10
        Le:
            if (r0 != r2) goto L14
        L10:
            r5 = 0
        L11:
            r3.j = r5
            goto L18
        L14:
            if (r0 != r1) goto L18
        L16:
            r5 = 1
            goto L11
        L18:
            boolean r5 = r4 instanceof a.f.a.i.a
            if (r5 == 0) goto L22
            a.f.a.i.a r4 = (a.f.a.i.a) r4
            int r5 = r3.j
            r4.t0 = r5
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.j(a.f.a.i.d, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z) {
        this.k.u0 = z;
    }

    public void setDpMargin(int i) {
        this.k.v0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.k.v0 = i;
    }

    public void setType(int i) {
        this.i = i;
    }
}
