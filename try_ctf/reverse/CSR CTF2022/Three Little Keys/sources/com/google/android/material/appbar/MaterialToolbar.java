package com.google.android.material.appbar;

import a.h.j.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b.b.a.a.a0.a.a;
import b.b.a.a.b;
import b.b.a.a.r.n;
import b.b.a.a.r.o;
import b.b.a.a.w.g;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] U = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer P;
    public boolean Q;
    public boolean R;
    public ImageView.ScaleType S;
    public Boolean T;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, 2131821595), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        int i = 0;
        TypedArray d = n.d(context2, attributeSet, b.u, R.attr.toolbarStyle, 2131821595, new int[0]);
        if (d.hasValue(2)) {
            setNavigationIconTint(d.getColor(2, -1));
        }
        this.Q = d.getBoolean(4, false);
        this.R = d.getBoolean(3, false);
        int i2 = d.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = U;
            if (i2 < scaleTypeArr.length) {
                this.S = scaleTypeArr[i2];
            }
        }
        if (d.hasValue(0)) {
            this.T = Boolean.valueOf(d.getBoolean(0, false));
        }
        d.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.q(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i));
            gVar.f1578a.f1583b = new b.b.a.a.o.a(context2);
            gVar.x();
            AtomicInteger atomicInteger = w.f667a;
            gVar.p(w.i.i(this));
            w.d.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.S;
    }

    public Integer getNavigationIconTint() {
        return this.P;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            b.b.a.a.a.B(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.Q || this.R) {
            List<TextView> a2 = o.a(this, getTitle());
            TextView textView = ((ArrayList) a2).isEmpty() ? null : (TextView) Collections.min(a2, o.f1551a);
            List<TextView> a3 = o.a(this, getSubtitle());
            TextView textView2 = ((ArrayList) a3).isEmpty() ? null : (TextView) Collections.max(a3, o.f1551a);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.Q && textView != null) {
                    x(textView, pair);
                }
                if (this.R && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.T;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.S;
            if (scaleType == null) {
                return;
            }
            imageView2.setScaleType(scaleType);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        b.b.a.a.a.z(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.T;
        if (bool == null || bool.booleanValue() != z) {
            this.T = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.S != scaleType) {
            this.S = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.P != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.P.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.P = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.R != z) {
            this.R = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.Q != z) {
            this.Q = z;
            requestLayout();
        }
    }

    public final void x(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }
}
