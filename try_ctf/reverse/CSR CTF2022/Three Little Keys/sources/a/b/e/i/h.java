package a.b.e.i;

import a.b.e.i.e;
import a.b.e.i.m;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: a  reason: collision with root package name */
    public g f132a;

    /* renamed from: b  reason: collision with root package name */
    public a.b.c.d f133b;

    /* renamed from: c  reason: collision with root package name */
    public e f134c;

    public h(g gVar) {
        this.f132a = gVar;
    }

    @Override // a.b.e.i.m.a
    public void b(g gVar, boolean z) {
        a.b.c.d dVar;
        if ((z || gVar == this.f132a) && (dVar = this.f133b) != null) {
            dVar.dismiss();
        }
    }

    @Override // a.b.e.i.m.a
    public boolean c(g gVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f132a.r(((e.a) this.f134c.a()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        e eVar = this.f134c;
        g gVar = this.f132a;
        m.a aVar = eVar.e;
        if (aVar != null) {
            aVar.b(gVar, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f133b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f133b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f132a.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f132a.performShortcut(i, keyEvent, 0);
    }
}
