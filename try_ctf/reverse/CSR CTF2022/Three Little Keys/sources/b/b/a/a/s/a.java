package b.b.a.a.s;

import a.b.f.v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b.b.a.a.b;
import b.b.a.a.r.n;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public class a extends v {
    public static final int[][] g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    public a(Context context, AttributeSet attributeSet) {
        super(b.b.a.a.a0.a.a.a(context, attributeSet, R.attr.radioButtonStyle, 2131821521), attributeSet, R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray d = n.d(context2, attributeSet, b.q, R.attr.radioButtonStyle, 2131821521, new int[0]);
        if (d.hasValue(0)) {
            setButtonTintList(b.b.a.a.a.g(context2, d, 0));
        }
        this.f = d.getBoolean(1, false);
        d.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int f = b.b.a.a.a.f(this, R.attr.colorControlActivated);
            int f2 = b.b.a.a.a.f(this, R.attr.colorOnSurface);
            int f3 = b.b.a.a.a.f(this, R.attr.colorSurface);
            int[][] iArr = g;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = b.b.a.a.a.p(f3, f, 1.0f);
            iArr2[1] = b.b.a.a.a.p(f3, f2, 0.54f);
            iArr2[2] = b.b.a.a.a.p(f3, f2, 0.38f);
            iArr2[3] = b.b.a.a.a.p(f3, f2, 0.38f);
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

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}
