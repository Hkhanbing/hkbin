package a.b.e.i;

import a.b.c.d;
import a.b.e.i.m;
import a.b.e.i.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Context f121a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f122b;

    /* renamed from: c  reason: collision with root package name */
    public g f123c;
    public ExpandedMenuView d;
    public m.a e;
    public a f;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public int f124a = -1;

        public a() {
            a();
        }

        public void a() {
            g gVar = e.this.f123c;
            i iVar = gVar.v;
            if (iVar != null) {
                gVar.i();
                ArrayList<i> arrayList = gVar.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == iVar) {
                        this.f124a = i;
                        return;
                    }
                }
            }
            this.f124a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public i getItem(int i) {
            g gVar = e.this.f123c;
            gVar.i();
            ArrayList<i> arrayList = gVar.j;
            Objects.requireNonNull(e.this);
            int i2 = i + 0;
            int i3 = this.f124a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            g gVar = e.this.f123c;
            gVar.i();
            int size = gVar.j.size();
            Objects.requireNonNull(e.this);
            int i = size + 0;
            return this.f124a < 0 ? i : i - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = e.this.f122b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((n.a) view).d(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i) {
        this.f121a = context;
        this.f122b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f == null) {
            this.f = new a();
        }
        return this.f;
    }

    @Override // a.b.e.i.m
    public void b(g gVar, boolean z) {
        m.a aVar = this.e;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // a.b.e.i.m
    public boolean c(g gVar, i iVar) {
        return false;
    }

    @Override // a.b.e.i.m
    public void d(m.a aVar) {
        this.e = aVar;
    }

    @Override // a.b.e.i.m
    public boolean f(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        h hVar = new h(rVar);
        d.a aVar = new d.a(rVar.f129a);
        e eVar = new e(aVar.f22a.f1161a, R.layout.abc_list_menu_item_layout);
        hVar.f134c = eVar;
        eVar.e = hVar;
        g gVar = hVar.f132a;
        gVar.b(eVar, gVar.f129a);
        ListAdapter a2 = hVar.f134c.a();
        AlertController.b bVar = aVar.f22a;
        bVar.g = a2;
        bVar.h = hVar;
        View view = rVar.o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.f1163c = rVar.n;
            bVar.d = rVar.m;
        }
        bVar.f = hVar;
        a.b.c.d a3 = aVar.a();
        hVar.f133b = a3;
        a3.setOnDismissListener(hVar);
        WindowManager.LayoutParams attributes = hVar.f133b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        hVar.f133b.show();
        m.a aVar2 = this.e;
        if (aVar2 == null) {
            return true;
        }
        aVar2.c(rVar);
        return true;
    }

    @Override // a.b.e.i.m
    public boolean g() {
        return false;
    }

    @Override // a.b.e.i.m
    public void h(boolean z) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.e.i.m
    public void j(Context context, g gVar) {
        if (this.f121a != null) {
            this.f121a = context;
            if (this.f122b == null) {
                this.f122b = LayoutInflater.from(context);
            }
        }
        this.f123c = gVar;
        a aVar = this.f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.e.i.m
    public boolean k(g gVar, i iVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f123c.s(this.f.getItem(i), this, 0);
    }
}
