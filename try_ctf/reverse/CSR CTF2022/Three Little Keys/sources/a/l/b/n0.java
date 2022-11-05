package a.l.b;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class n0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f878a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s0 f879b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f880c;
    public final /* synthetic */ m d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ Object h;

    public n0(Object obj, s0 s0Var, View view, m mVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f878a = obj;
        this.f879b = s0Var;
        this.f880c = view;
        this.d = mVar;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f878a;
        if (obj != null) {
            this.f879b.o(obj, this.f880c);
            this.f.addAll(q0.h(this.f879b, this.f878a, this.d, this.e, this.f880c));
        }
        if (this.g != null) {
            if (this.h != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f880c);
                this.f879b.p(this.h, this.g, arrayList);
            }
            this.g.clear();
            this.g.add(this.f880c);
        }
    }
}
