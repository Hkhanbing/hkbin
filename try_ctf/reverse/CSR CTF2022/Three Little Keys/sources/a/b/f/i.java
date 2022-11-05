package a.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class i extends CheckedTextView {

    /* renamed from: a  reason: collision with root package name */
    public final j f229a;

    /* renamed from: b  reason: collision with root package name */
    public final f f230b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f231c;
    public o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:3:0x004a, B:5:0x0050, B:7:0x0056, B:11:0x0067, B:13:0x006d, B:15:0x0073, B:16:0x0080, B:18:0x0087, B:19:0x0090, B:21:0x0097), top: B:28:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #0 {all -> 0x00b3, blocks: (B:3:0x004a, B:5:0x0050, B:7:0x0056, B:11:0x0067, B:13:0x006d, B:15:0x0073, B:16:0x0080, B:18:0x0087, B:19:0x0090, B:21:0x0097), top: B:28:0x004a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            a.b.f.a1.a(r11)
            r0 = 2130903204(0x7f0300a4, float:1.741322E38)
            r10.<init>(r11, r12, r0)
            android.content.Context r11 = r10.getContext()
            a.b.f.y0.a(r10, r11)
            a.b.f.d0 r11 = new a.b.f.d0
            r11.<init>(r10)
            r10.f231c = r11
            r11.d(r12, r0)
            r11.b()
            a.b.f.f r11 = new a.b.f.f
            r11.<init>(r10)
            r10.f230b = r11
            r11.d(r12, r0)
            a.b.f.j r11 = new a.b.f.j
            r11.<init>(r10)
            r10.f229a = r11
            android.content.Context r1 = r10.getContext()
            int[] r4 = a.b.b.l
            r9 = 0
            a.b.f.d1 r1 = a.b.f.d1.q(r1, r12, r4, r0, r9)
            android.widget.CheckedTextView r2 = r11.f232a
            android.content.Context r3 = r2.getContext()
            android.content.res.TypedArray r6 = r1.f193b
            r8 = 0
            r7 = 2130903204(0x7f0300a4, float:1.741322E38)
            r5 = r12
            a.h.j.w.o(r2, r3, r4, r5, r6, r7, r8)
            r2 = 1
            boolean r3 = r1.o(r2)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L64
            int r3 = r1.l(r2, r9)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L64
            android.widget.CheckedTextView r4 = r11.f232a     // Catch: android.content.res.Resources.NotFoundException -> L64 java.lang.Throwable -> Lb3
            android.content.Context r5 = r4.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L64 java.lang.Throwable -> Lb3
            android.graphics.drawable.Drawable r3 = a.b.a.e(r5, r3)     // Catch: android.content.res.Resources.NotFoundException -> L64 java.lang.Throwable -> Lb3
            r4.setCheckMarkDrawable(r3)     // Catch: android.content.res.Resources.NotFoundException -> L64 java.lang.Throwable -> Lb3
            goto L65
        L64:
            r2 = r9
        L65:
            if (r2 != 0) goto L80
            boolean r2 = r1.o(r9)     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L80
            int r2 = r1.l(r9, r9)     // Catch: java.lang.Throwable -> Lb3
            if (r2 == 0) goto L80
            android.widget.CheckedTextView r3 = r11.f232a     // Catch: java.lang.Throwable -> Lb3
            android.content.Context r4 = r3.getContext()     // Catch: java.lang.Throwable -> Lb3
            android.graphics.drawable.Drawable r2 = a.b.a.e(r4, r2)     // Catch: java.lang.Throwable -> Lb3
            r3.setCheckMarkDrawable(r2)     // Catch: java.lang.Throwable -> Lb3
        L80:
            r2 = 2
            boolean r3 = r1.o(r2)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L90
            android.widget.CheckedTextView r3 = r11.f232a     // Catch: java.lang.Throwable -> Lb3
            android.content.res.ColorStateList r2 = r1.c(r2)     // Catch: java.lang.Throwable -> Lb3
            r3.setCheckMarkTintList(r2)     // Catch: java.lang.Throwable -> Lb3
        L90:
            r2 = 3
            boolean r3 = r1.o(r2)     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto La6
            android.widget.CheckedTextView r11 = r11.f232a     // Catch: java.lang.Throwable -> Lb3
            r3 = -1
            int r2 = r1.j(r2, r3)     // Catch: java.lang.Throwable -> Lb3
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = a.b.f.k0.d(r2, r3)     // Catch: java.lang.Throwable -> Lb3
            r11.setCheckMarkTintMode(r2)     // Catch: java.lang.Throwable -> Lb3
        La6:
            android.content.res.TypedArray r11 = r1.f193b
            r11.recycle()
            a.b.f.o r11 = r10.getEmojiTextViewHelper()
            r11.a(r12, r0)
            return
        Lb3:
            r11 = move-exception
            android.content.res.TypedArray r12 = r1.f193b
            r12.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.f.i.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private o getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new o(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d0 d0Var = this.f231c;
        if (d0Var != null) {
            d0Var.b();
        }
        f fVar = this.f230b;
        if (fVar != null) {
            fVar.a();
        }
        j jVar = this.f229a;
        if (jVar != null) {
            jVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.h.b.b.P(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f230b;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f230b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        j jVar = this.f229a;
        if (jVar != null) {
            return jVar.f233b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        j jVar = this.f229a;
        if (jVar != null) {
            return jVar.f234c;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.b.a.h(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().f262b.f774a.b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f230b;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f230b;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(a.b.a.e(getContext(), i));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        j jVar = this.f229a;
        if (jVar != null) {
            if (jVar.f) {
                jVar.f = false;
                return;
            }
            jVar.f = true;
            jVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().f262b.f774a.c(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f230b;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f230b;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        j jVar = this.f229a;
        if (jVar != null) {
            jVar.f233b = colorStateList;
            jVar.d = true;
            jVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        j jVar = this.f229a;
        if (jVar != null) {
            jVar.f234c = mode;
            jVar.e = true;
            jVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.f231c;
        if (d0Var != null) {
            d0Var.e(context, i);
        }
    }
}
