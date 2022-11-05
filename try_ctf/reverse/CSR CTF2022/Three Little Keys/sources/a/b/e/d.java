package a.b.e;

import a.b.e.a;
import a.b.e.i.g;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class d extends a implements g.a {

    /* renamed from: c  reason: collision with root package name */
    public Context f79c;
    public ActionBarContextView d;
    public a.InterfaceC0003a e;
    public WeakReference<View> f;
    public boolean g;
    public a.b.e.i.g h;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0003a interfaceC0003a, boolean z) {
        this.f79c = context;
        this.d = actionBarContextView;
        this.e = interfaceC0003a;
        a.b.e.i.g gVar = new a.b.e.i.g(actionBarContextView.getContext());
        gVar.l = 1;
        this.h = gVar;
        gVar.e = this;
    }

    @Override // a.b.e.i.g.a
    public void a(a.b.e.i.g gVar) {
        i();
        a.b.f.d dVar = this.d.d;
        if (dVar != null) {
            dVar.n();
        }
    }

    @Override // a.b.e.i.g.a
    public boolean b(a.b.e.i.g gVar, MenuItem menuItem) {
        return this.e.c(this, menuItem);
    }

    @Override // a.b.e.a
    public void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.b(this);
    }

    @Override // a.b.e.a
    public View d() {
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // a.b.e.a
    public Menu e() {
        return this.h;
    }

    @Override // a.b.e.a
    public MenuInflater f() {
        return new f(this.d.getContext());
    }

    @Override // a.b.e.a
    public CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // a.b.e.a
    public CharSequence h() {
        return this.d.getTitle();
    }

    @Override // a.b.e.a
    public void i() {
        this.e.a(this, this.h);
    }

    @Override // a.b.e.a
    public boolean j() {
        return this.d.s;
    }

    @Override // a.b.e.a
    public void k(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // a.b.e.a
    public void l(int i) {
        this.d.setSubtitle(this.f79c.getString(i));
    }

    @Override // a.b.e.a
    public void m(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // a.b.e.a
    public void n(int i) {
        this.d.setTitle(this.f79c.getString(i));
    }

    @Override // a.b.e.a
    public void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // a.b.e.a
    public void p(boolean z) {
        this.f75b = z;
        this.d.setTitleOptional(z);
    }
}
