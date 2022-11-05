package a.p.b;

import a.p.b.b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class v implements b.InterfaceC0029b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1062a;

    public v(RecyclerView recyclerView) {
        this.f1062a = recyclerView;
    }

    public View a(int i) {
        return this.f1062a.getChildAt(i);
    }

    public int b() {
        return this.f1062a.getChildCount();
    }

    public void c(int i) {
        View childAt = this.f1062a.getChildAt(i);
        if (childAt != null) {
            this.f1062a.p(childAt);
            childAt.clearAnimation();
        }
        this.f1062a.removeViewAt(i);
    }
}
