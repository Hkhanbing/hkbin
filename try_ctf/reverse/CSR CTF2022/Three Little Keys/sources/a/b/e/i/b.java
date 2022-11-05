package a.b.e.i;

import a.b.e.i.m;
import android.content.Context;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: a  reason: collision with root package name */
    public Context f104a;

    /* renamed from: b  reason: collision with root package name */
    public Context f105b;

    /* renamed from: c  reason: collision with root package name */
    public g f106c;
    public LayoutInflater d;
    public m.a e;
    public int f;
    public int g;
    public n h;

    public b(Context context, int i, int i2) {
        this.f104a = context;
        this.d = LayoutInflater.from(context);
        this.f = i;
        this.g = i2;
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
    public boolean k(g gVar, i iVar) {
        return false;
    }
}
