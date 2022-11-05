package b.b.a.a.m;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public class j extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f1477a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f1478b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f1479c;

    public j(g gVar, w wVar, MaterialButton materialButton) {
        this.f1479c = gVar;
        this.f1477a = wVar;
        this.f1478b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f1478b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager u0 = this.f1479c.u0();
        int k1 = i < 0 ? u0.k1() : u0.m1();
        this.f1479c.X = this.f1477a.e(k1);
        this.f1478b.setText(this.f1477a.f1501c.f1445a.o(k1).n());
    }
}
