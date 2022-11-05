package a.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public class s extends MultiAutoCompleteTextView {
    public static final int[] d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final f f284a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f285b;

    /* renamed from: c  reason: collision with root package name */
    public final n f286c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        a1.a(context);
        y0.a(this, getContext());
        d1 q = d1.q(getContext(), attributeSet, d, R.attr.autoCompleteTextViewStyle, 0);
        if (q.o(0)) {
            setDropDownBackgroundDrawable(q.g(0));
        }
        q.f193b.recycle();
        f fVar = new f(this);
        this.f284a = fVar;
        fVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        d0 d0Var = new d0(this);
        this.f285b = d0Var;
        d0Var.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        d0Var.b();
        n nVar = new n(this);
        this.f286c = nVar;
        nVar.b(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener a2 = nVar.a(keyListener);
            if (a2 == keyListener) {
                return;
            }
            super.setKeyListener(a2);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f284a;
        if (fVar != null) {
            fVar.a();
        }
        d0 d0Var = this.f285b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f284a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f284a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.b.a.h(onCreateInputConnection, editorInfo, this);
        return this.f286c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f284a;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f284a;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(a.b.a.e(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f286c.f255b.f760a.c(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f286c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f284a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f284a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.f285b;
        if (d0Var != null) {
            d0Var.e(context, i);
        }
    }
}
