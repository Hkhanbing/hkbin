package a.h.j;

import a.h.j.w;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public class t extends w.b<CharSequence> {
    public t(int i, Class cls, int i2, int i3) {
        super(i, cls, i2, i3);
    }

    @Override // a.h.j.w.b
    public CharSequence b(View view) {
        return w.l.b(view);
    }

    @Override // a.h.j.w.b
    public void c(View view, CharSequence charSequence) {
        w.l.h(view, charSequence);
    }

    @Override // a.h.j.w.b
    public boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
