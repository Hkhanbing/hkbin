package b.b.a.a.r;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1552a;

    public p(View view) {
        this.f1552a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((InputMethodManager) this.f1552a.getContext().getSystemService("input_method")).showSoftInput(this.f1552a, 1);
    }
}
