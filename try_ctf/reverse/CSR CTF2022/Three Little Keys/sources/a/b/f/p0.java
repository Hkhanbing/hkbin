package a.b.f;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public class p0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0 f269a;

    public p0(q0 q0Var) {
        this.f269a = q0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        l0 l0Var;
        if (i == -1 || (l0Var = this.f269a.f275c) == null) {
            return;
        }
        l0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
