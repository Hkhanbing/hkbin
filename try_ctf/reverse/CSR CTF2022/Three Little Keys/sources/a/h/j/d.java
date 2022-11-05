package a.h.j;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public a f628a;

    /* loaded from: classes.dex */
    public interface a {
    }

    public d(Context context) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h(a aVar) {
        if (this.f628a != null) {
            StringBuilder f = b.a.a.a.a.f("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            f.append(getClass().getSimpleName());
            f.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", f.toString());
        }
        this.f628a = aVar;
    }
}
