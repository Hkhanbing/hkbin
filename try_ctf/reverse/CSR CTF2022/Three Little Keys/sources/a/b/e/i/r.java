package a.b.e.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class r extends g implements SubMenu {
    public i A;
    public g z;

    public r(Context context, g gVar, i iVar) {
        super(context);
        this.z = gVar;
        this.A = iVar;
    }

    @Override // a.b.e.i.g
    public boolean d(i iVar) {
        return this.z.d(iVar);
    }

    @Override // a.b.e.i.g
    public boolean e(g gVar, MenuItem menuItem) {
        return super.e(gVar, menuItem) || this.z.e(gVar, menuItem);
    }

    @Override // a.b.e.i.g
    public boolean f(i iVar) {
        return this.z.f(iVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.A;
    }

    @Override // a.b.e.i.g
    public String j() {
        i iVar = this.A;
        int i = iVar != null ? iVar.f135a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // a.b.e.i.g
    public g k() {
        return this.z.k();
    }

    @Override // a.b.e.i.g
    public boolean m() {
        return this.z.m();
    }

    @Override // a.b.e.i.g
    public boolean n() {
        return this.z.n();
    }

    @Override // a.b.e.i.g
    public boolean o() {
        return this.z.o();
    }

    @Override // a.b.e.i.g, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        x(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        x(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        x(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // a.b.e.i.g, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        x(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        x(0, charSequence, 0, null, null);
        return this;
    }
}
