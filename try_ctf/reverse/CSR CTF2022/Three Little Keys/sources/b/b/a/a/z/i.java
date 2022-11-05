package b.b.a.a.z;

import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class i implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f1638a;

    public i(h hVar) {
        this.f1638a = hVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        h.i(this.f1638a);
        h.g(this.f1638a, false);
    }
}
