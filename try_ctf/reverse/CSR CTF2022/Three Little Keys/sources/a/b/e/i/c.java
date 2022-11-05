package a.b.e.i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f107a;

    /* renamed from: b  reason: collision with root package name */
    public a.e.h<a.h.e.a.b, MenuItem> f108b;

    /* renamed from: c  reason: collision with root package name */
    public a.e.h<a.h.e.a.c, SubMenu> f109c;

    public c(Context context) {
        this.f107a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof a.h.e.a.b) {
            a.h.e.a.b bVar = (a.h.e.a.b) menuItem;
            if (this.f108b == null) {
                this.f108b = new a.e.h<>();
            }
            MenuItem orDefault = this.f108b.getOrDefault(menuItem, null);
            if (orDefault != null) {
                return orDefault;
            }
            j jVar = new j(this.f107a, bVar);
            this.f108b.put(bVar, jVar);
            return jVar;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof a.h.e.a.c) {
            a.h.e.a.c cVar = (a.h.e.a.c) subMenu;
            if (this.f109c == null) {
                this.f109c = new a.e.h<>();
            }
            SubMenu subMenu2 = this.f109c.get(cVar);
            if (subMenu2 != null) {
                return subMenu2;
            }
            s sVar = new s(this.f107a, cVar);
            this.f109c.put(cVar, sVar);
            return sVar;
        }
        return subMenu;
    }
}
