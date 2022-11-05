package androidx.appcompat.widget;

import a.b.b;
import a.h.j.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1185a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1186b;

    /* renamed from: c  reason: collision with root package name */
    public int f1187c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1187c = -1;
        int[] iArr = b.k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        w.o(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1185a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1185a);
        }
    }

    private void setStacked(boolean z) {
        if (this.f1186b != z) {
            if (z && !this.f1185a) {
                return;
            }
            this.f1186b = z;
            setOrientation(z ? 1 : 0);
            setGravity(z ? 8388613 : 80);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final int a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1185a) {
            if (size > this.f1187c && this.f1186b) {
                setStacked(false);
            }
            this.f1187c = size;
        }
        if (this.f1186b || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1185a && !this.f1186b) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a2 = a(0);
        if (a2 >= 0) {
            View childAt = getChildAt(a2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (this.f1186b) {
                int a3 = a(a2 + 1);
                i4 = a3 >= 0 ? getChildAt(a3).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i4 = getPaddingBottom() + measuredHeight;
            }
        }
        AtomicInteger atomicInteger = w.f667a;
        if (w.d.d(this) != i4) {
            setMinimumHeight(i4);
            if (i2 != 0) {
                return;
            }
            super.onMeasure(i, i2);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1185a != z) {
            this.f1185a = z;
            if (!z && this.f1186b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
