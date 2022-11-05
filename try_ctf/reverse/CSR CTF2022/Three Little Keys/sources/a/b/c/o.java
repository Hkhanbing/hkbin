package a.b.c;

import a.b.e.a;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class o extends Dialog implements h {

    /* renamed from: a  reason: collision with root package name */
    public i f49a;

    /* renamed from: b  reason: collision with root package name */
    public final a.h.j.g f50b;

    /* loaded from: classes.dex */
    public class a implements a.h.j.g {
        public a() {
        }

        @Override // a.h.j.g
        public boolean i(KeyEvent keyEvent) {
            return o.this.c(keyEvent);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130903366(0x7f030146, float:1.7413548E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            a.b.c.o$a r2 = new a.b.c.o$a
            r2.<init>()
            r4.f50b = r2
            a.b.c.i r2 = r4.a()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r2.x(r6)
            r5 = 0
            r2.l(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.c.o.<init>(android.content.Context, int):void");
    }

    public i a() {
        if (this.f49a == null) {
            a.e.c<WeakReference<i>> cVar = i.f26a;
            this.f49a = new j(getContext(), getWindow(), this, this);
        }
        return this.f49a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    @Override // a.b.c.h
    public void b(a.b.e.a aVar) {
    }

    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().m();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        a.h.j.g gVar = this.f50b;
        if (gVar == null) {
            return false;
        }
        return gVar.i(keyEvent);
    }

    @Override // a.b.c.h
    public void f(a.b.e.a aVar) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) a().e(i);
    }

    @Override // a.b.c.h
    public a.b.e.a h(a.InterfaceC0003a interfaceC0003a) {
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().j();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().i();
        super.onCreate(bundle);
        a().l(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().r();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().u(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().v(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().w(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().y(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().y(charSequence);
    }
}
