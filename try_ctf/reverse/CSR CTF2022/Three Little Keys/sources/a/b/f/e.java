package a.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Objects;

/* loaded from: classes.dex */
public class e extends AutoCompleteTextView {
    public static final int[] d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final f f195a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f196b;

    /* renamed from: c  reason: collision with root package name */
    public final n f197c;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.a(context);
        y0.a(this, getContext());
        d1 q = d1.q(getContext(), attributeSet, d, i, 0);
        if (q.o(0)) {
            setDropDownBackgroundDrawable(q.g(0));
        }
        q.f193b.recycle();
        f fVar = new f(this);
        this.f195a = fVar;
        fVar.d(attributeSet, i);
        d0 d0Var = new d0(this);
        this.f196b = d0Var;
        d0Var.d(attributeSet, i);
        d0Var.b();
        n nVar = new n(this);
        this.f197c = nVar;
        nVar.b(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        Objects.requireNonNull(nVar);
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
        f fVar = this.f195a;
        if (fVar != null) {
            fVar.a();
        }
        d0 d0Var = this.f196b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.h.b.b.P(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f195a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f195a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.b.a.h(onCreateInputConnection, editorInfo, this);
        return this.f197c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f195a;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f195a;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(a.b.a.e(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f197c.f255b.f760a.c(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f197c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f195a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f195a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.f196b;
        if (d0Var != null) {
            d0Var.e(context, i);
        }
    }
}
