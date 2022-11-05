package a.b.f;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.Objects;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f254a;

    /* renamed from: b  reason: collision with root package name */
    public final a.k.b.a f255b;

    public n(EditText editText) {
        this.f254a = editText;
        this.f255b = new a.k.b.a(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? this.f255b.f760a.a(keyListener) : keyListener;
    }

    public void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f254a.getContext().obtainStyledAttributes(attributeSet, a.b.b.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        a.k.b.a aVar = this.f255b;
        Objects.requireNonNull(aVar);
        if (inputConnection == null) {
            return null;
        }
        return aVar.f760a.b(inputConnection, editorInfo);
    }

    public void d(boolean z) {
        this.f255b.f760a.c(z);
    }
}
