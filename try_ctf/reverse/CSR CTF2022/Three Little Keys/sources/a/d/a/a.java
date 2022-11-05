package a.d.a;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final c f329c = new b();

    /* renamed from: a  reason: collision with root package name */
    public boolean f330a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f331b;

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public float getCardElevation() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        throw null;
    }

    public boolean getPreventCornerOverlap() {
        return this.f331b;
    }

    public float getRadius() {
        throw null;
    }

    public boolean getUseCompatPadding() {
        return this.f330a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCardElevation(float f) {
        throw null;
    }

    public void setMaxCardElevation(float f) {
        throw null;
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z == this.f331b) {
            return;
        }
        this.f331b = z;
        throw null;
    }

    public void setRadius(float f) {
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f330a == z) {
            return;
        }
        this.f330a = z;
        throw null;
    }
}
