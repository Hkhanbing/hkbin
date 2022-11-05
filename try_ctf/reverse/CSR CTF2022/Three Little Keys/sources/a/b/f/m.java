package a.b.f;

import a.h.j.e;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public class m extends EditText implements a.h.j.q {

    /* renamed from: a  reason: collision with root package name */
    public final f f251a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f252b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f253c;
    public final a.h.k.g d;
    public final n e;

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.a(context);
        y0.a(this, getContext());
        f fVar = new f(this);
        this.f251a = fVar;
        fVar.d(attributeSet, i);
        d0 d0Var = new d0(this);
        this.f252b = d0Var;
        d0Var.d(attributeSet, i);
        d0Var.b();
        this.f253c = new c0(this);
        this.d = new a.h.k.g();
        n nVar = new n(this);
        this.e = nVar;
        nVar.b(attributeSet, i);
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

    @Override // a.h.j.q
    public a.h.j.e a(a.h.j.e eVar) {
        return this.d.a(this, eVar);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f251a;
        if (fVar != null) {
            fVar.a();
        }
        d0 d0Var = this.f252b;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.h.b.b.P(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f251a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f251a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    /* renamed from: getText */
    public Editable mo4getText() {
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] h;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f252b.f(this, onCreateInputConnection, editorInfo);
        a.b.a.h(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (h = a.h.j.w.h(this)) != null) {
            editorInfo.contentMimeTypes = h;
            onCreateInputConnection = new a.h.j.e0.b(onCreateInputConnection, false, new a.h.j.e0.c(this));
        }
        return this.e.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && a.h.j.w.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = x.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 < 31 && a.h.j.w.h(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                e.b aVar = i2 >= 31 ? new e.a(primaryClip, 1) : new e.c(primaryClip, 1);
                if (i != 16908322) {
                    i3 = 1;
                }
                aVar.d(i3);
                a.h.j.w.l(this, aVar.c());
            }
            i3 = 1;
        }
        if (i3 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f251a;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f251a;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.f255b.f760a.c(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f251a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f251a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.f252b;
        if (d0Var != null) {
            d0Var.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }
}
