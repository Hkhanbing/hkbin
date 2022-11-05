package a.b.e.i;

import a.b.e.i.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public g f126a;

    /* renamed from: b  reason: collision with root package name */
    public int f127b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f128c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.f126a = gVar;
        this.f = i;
        a();
    }

    public void a() {
        g gVar = this.f126a;
        i iVar = gVar.v;
        if (iVar != null) {
            gVar.i();
            ArrayList<i> arrayList = gVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == iVar) {
                    this.f127b = i;
                    return;
                }
            }
        }
        this.f127b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public i getItem(int i) {
        ArrayList<i> l;
        if (this.d) {
            g gVar = this.f126a;
            gVar.i();
            l = gVar.j;
        } else {
            l = this.f126a.l();
        }
        int i2 = this.f127b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return l.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> l;
        if (this.d) {
            g gVar = this.f126a;
            gVar.i();
            l = gVar.j;
        } else {
            l = this.f126a.l();
        }
        int i = this.f127b;
        int size = l.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).f136b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f126a.m() && i2 != (i3 >= 0 ? getItem(i3).f136b : i2));
        n.a aVar = (n.a) view;
        if (this.f128c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
