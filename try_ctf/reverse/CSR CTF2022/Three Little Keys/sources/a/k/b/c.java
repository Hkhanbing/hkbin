package a.k.b;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f766a;

    /* renamed from: b  reason: collision with root package name */
    public final a f767b;

    /* loaded from: classes.dex */
    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x007c, code lost:
            if (r12 != false) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0089, code lost:
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x00aa, code lost:
            if (r11 != (-1)) goto L72;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.view.inputmethod.InputConnection r8, android.text.Editable r9, int r10, int r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.k.b.c.a.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        a aVar = new a();
        this.f766a = textView;
        this.f767b = aVar;
        if (a.k.a.h.c()) {
            a.k.a.h a2 = a.k.a.h.a();
            if (!a2.d() || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            a2.e.c(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return this.f767b.a(this, this.f766a.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f767b.a(this, this.f766a.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
