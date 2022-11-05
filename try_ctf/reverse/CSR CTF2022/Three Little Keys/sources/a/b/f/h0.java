package a.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class h0 extends ToggleButton {

    /* renamed from: a  reason: collision with root package name */
    public final f f225a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f226b;

    /* renamed from: c  reason: collision with root package name */
    public o f227c;

    public h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        y0.a(this, getContext());
        f fVar = new f(this);
        this.f225a = fVar;
        fVar.d(attributeSet, 16842827);
        d0 d0Var = new d0(this);
        this.f226b = d0Var;
        d0Var.d(attributeSet, 16842827);
        getEmojiTextViewHelper().a(attributeSet, 16842827);
    }

    private o getEmojiTextViewHelper() {
        if (this.f227c == null) {
            this.f227c = new o(this);
        }
        return this.f227c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f225a;
        if (fVar != null) {
            fVar.a();
        }
        d0 d0Var = this.f226b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f225a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f225a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().f262b.f774a.b(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f225a;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f225a;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().f262b.f774a.c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f262b.f774a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f225a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f225a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }
}
