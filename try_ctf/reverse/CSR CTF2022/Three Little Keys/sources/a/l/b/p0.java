package a.l.b;

import a.l.b.q0;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class p0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s0 f885a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.e.a f886b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f887c;
    public final /* synthetic */ q0.b d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ View f;
    public final /* synthetic */ m g;
    public final /* synthetic */ m h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Rect l;

    public p0(s0 s0Var, a.e.a aVar, Object obj, q0.b bVar, ArrayList arrayList, View view, m mVar, m mVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f885a = s0Var;
        this.f886b = aVar;
        this.f887c = obj;
        this.d = bVar;
        this.e = arrayList;
        this.f = view;
        this.g = mVar;
        this.h = mVar2;
        this.i = z;
        this.j = arrayList2;
        this.k = obj2;
        this.l = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        a.e.a<String, View> e = q0.e(this.f885a, this.f886b, this.f887c, this.d);
        if (e != null) {
            this.e.addAll(e.values());
            this.e.add(this.f);
        }
        q0.c(this.g, this.h, this.i, e, false);
        Object obj = this.f887c;
        if (obj != null) {
            this.f885a.x(obj, this.j, this.e);
            View k = q0.k(e, this.d, this.k, this.i);
            if (k == null) {
                return;
            }
            this.f885a.j(k, this.l);
        }
    }
}
