package a.h.j;

import a.h.j.w;
import android.view.View;

/* loaded from: classes.dex */
public class s extends w.b<Boolean> {
    public s(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    @Override // a.h.j.w.b
    public Boolean b(View view) {
        return Boolean.valueOf(w.l.d(view));
    }

    @Override // a.h.j.w.b
    public void c(View view, Boolean bool) {
        w.l.i(view, bool.booleanValue());
    }

    @Override // a.h.j.w.b
    public boolean f(Boolean bool, Boolean bool2) {
        return !a(bool, bool2);
    }
}
