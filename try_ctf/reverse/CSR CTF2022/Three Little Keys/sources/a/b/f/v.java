package a.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* loaded from: classes.dex */
public class v extends RadioButton {

    /* renamed from: a  reason: collision with root package name */
    public final k f293a;

    /* renamed from: b  reason: collision with root package name */
    public final f f294b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f295c;
    public o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.a(context);
        y0.a(this, getContext());
        k kVar = new k(this);
        this.f293a = kVar;
        kVar.b(attributeSet, i);
        f fVar = new f(this);
        this.f294b = fVar;
        fVar.d(attributeSet, i);
        d0 d0Var = new d0(this);
        this.f295c = d0Var;
        d0Var.d(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private o getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new o(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f294b;
        if (fVar != null) {
            fVar.a();
        }
        d0 d0Var = this.f295c;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        k kVar = this.f293a;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f294b;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f294b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        k kVar = this.f293a;
        if (kVar != null) {
            return kVar.f236b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        k kVar = this.f293a;
        if (kVar != null) {
            return kVar.f237c;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().f262b.f774a.b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f294b;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f294b;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(a.b.a.e(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        k kVar = this.f293a;
        if (kVar != null) {
            if (kVar.f) {
                kVar.f = false;
                return;
            }
            kVar.f = true;
            kVar.a();
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
        f fVar = this.f294b;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f294b;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        k kVar = this.f293a;
        if (kVar != null) {
            kVar.f236b = colorStateList;
            kVar.d = true;
            kVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        k kVar = this.f293a;
        if (kVar != null) {
            kVar.f237c = mode;
            kVar.e = true;
            kVar.a();
        }
    }
}
