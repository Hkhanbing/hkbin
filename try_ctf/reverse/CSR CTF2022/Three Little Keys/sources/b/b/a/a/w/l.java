package b.b.a.a.w;

import android.graphics.Canvas;
import android.graphics.Matrix;
import b.b.a.a.w.m;
import java.util.List;

/* loaded from: classes.dex */
public class l extends m.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f1596b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Matrix f1597c;

    public l(m mVar, List list, Matrix matrix) {
        this.f1596b = list;
        this.f1597c = matrix;
    }

    @Override // b.b.a.a.w.m.f
    public void a(Matrix matrix, b.b.a.a.v.a aVar, int i, Canvas canvas) {
        for (m.f fVar : this.f1596b) {
            fVar.a(this.f1597c, aVar, i, canvas);
        }
    }
}
