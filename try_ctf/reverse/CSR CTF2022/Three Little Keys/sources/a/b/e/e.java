package a.b.e;

import a.b.e.a;
import a.b.e.i.j;
import a.b.e.i.o;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f80a;

    /* renamed from: b  reason: collision with root package name */
    public final a.b.e.a f81b;

    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0003a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f82a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f83b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f84c = new ArrayList<>();
        public final a.e.h<Menu, Menu> d = new a.e.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f83b = context;
            this.f82a = callback;
        }

        @Override // a.b.e.a.InterfaceC0003a
        public boolean a(a.b.e.a aVar, Menu menu) {
            return this.f82a.onPrepareActionMode(e(aVar), f(menu));
        }

        @Override // a.b.e.a.InterfaceC0003a
        public void b(a.b.e.a aVar) {
            this.f82a.onDestroyActionMode(e(aVar));
        }

        @Override // a.b.e.a.InterfaceC0003a
        public boolean c(a.b.e.a aVar, MenuItem menuItem) {
            return this.f82a.onActionItemClicked(e(aVar), new j(this.f83b, (a.h.e.a.b) menuItem));
        }

        @Override // a.b.e.a.InterfaceC0003a
        public boolean d(a.b.e.a aVar, Menu menu) {
            return this.f82a.onCreateActionMode(e(aVar), f(menu));
        }

        public ActionMode e(a.b.e.a aVar) {
            int size = this.f84c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.f84c.get(i);
                if (eVar != null && eVar.f81b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f83b, aVar);
            this.f84c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.d.getOrDefault(menu, null);
            if (orDefault == null) {
                o oVar = new o(this.f83b, (a.h.e.a.a) menu);
                this.d.put(menu, oVar);
                return oVar;
            }
            return orDefault;
        }
    }

    public e(Context context, a.b.e.a aVar) {
        this.f80a = context;
        this.f81b = aVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f81b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f81b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f80a, (a.h.e.a.a) this.f81b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f81b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f81b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f81b.f74a;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f81b.h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f81b.f75b;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f81b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f81b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f81b.k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f81b.l(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f81b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f81b.f74a = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f81b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f81b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f81b.p(z);
    }
}
