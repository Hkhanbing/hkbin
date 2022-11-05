package a.b.f;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class e1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final a.b.e.i.a f201a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f1 f202b;

    public e1(f1 f1Var) {
        this.f202b = f1Var;
        this.f201a = new a.b.e.i.a(f1Var.f209a.getContext(), 0, 16908332, 0, f1Var.i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        f1 f1Var = this.f202b;
        Window.Callback callback = f1Var.l;
        if (callback == null || !f1Var.m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f201a);
    }
}
