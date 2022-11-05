package b.b.a.a.z;

import a.b.f.q0;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public class p implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f1653a;

    public p(q qVar) {
        this.f1653a = qVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item;
        q qVar = this.f1653a;
        if (i < 0) {
            q0 q0Var = qVar.e;
            item = !q0Var.a() ? null : q0Var.f275c.getSelectedItem();
        } else {
            item = qVar.getAdapter().getItem(i);
        }
        q.a(this.f1653a, item);
        AdapterView.OnItemClickListener onItemClickListener = this.f1653a.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                q0 q0Var2 = this.f1653a.e;
                view = !q0Var2.a() ? null : q0Var2.f275c.getSelectedView();
                q0 q0Var3 = this.f1653a.e;
                i = !q0Var3.a() ? -1 : q0Var3.f275c.getSelectedItemPosition();
                q0 q0Var4 = this.f1653a.e;
                j = !q0Var4.a() ? Long.MIN_VALUE : q0Var4.f275c.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.f1653a.e.f275c, view, i, j);
        }
        this.f1653a.e.dismiss();
    }
}
