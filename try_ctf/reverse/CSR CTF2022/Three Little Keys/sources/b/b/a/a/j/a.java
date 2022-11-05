package b.b.a.a.j;

import a.b.f.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import b.b.a.a.b;
import b.b.a.a.r.n;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public class a extends h {
    public static final int[][] h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;
    public boolean g;

    public a(Context context, AttributeSet attributeSet) {
        super(b.b.a.a.a0.a.a.a(context, attributeSet, R.attr.checkboxStyle, 2131821520), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d = n.d(context2, attributeSet, b.p, R.attr.checkboxStyle, 2131821520, new int[0]);
        if (d.hasValue(0)) {
            setButtonTintList(b.b.a.a.a.g(context2, d, 0));
        }
        this.f = d.getBoolean(2, false);
        this.g = d.getBoolean(1, true);
        d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int[][] iArr = h;
            int[] iArr2 = new int[iArr.length];
            int f = b.b.a.a.a.f(this, R.attr.colorControlActivated);
            int f2 = b.b.a.a.a.f(this, R.attr.colorSurface);
            int f3 = b.b.a.a.a.f(this, R.attr.colorOnSurface);
            iArr2[0] = b.b.a.a.a.p(f2, f, 1.0f);
            iArr2[1] = b.b.a.a.a.p(f2, f3, 0.54f);
            iArr2[2] = b.b.a.a.a.p(f2, f3, 0.38f);
            iArr2[3] = b.b.a.a.a.p(f2, f3, 0.38f);
            this.e = new ColorStateList(iArr, iArr2);
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f || getButtonTintList() != null) {
            return;
        }
        setUseMaterialThemeColors(true);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (this.g && TextUtils.isEmpty(getText()) && (buttonDrawable = getButtonDrawable()) != null) {
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (b.b.a.a.a.o(this) ? -1 : 1);
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() == null) {
                return;
            }
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
            return;
        }
        super.onDraw(canvas);
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.g = z;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}
