package b.b.a.a.d;

import a.h.j.w;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final View f1407a;

    /* renamed from: b  reason: collision with root package name */
    public int f1408b;

    /* renamed from: c  reason: collision with root package name */
    public int f1409c;
    public int d;
    public int e;

    public h(View view) {
        this.f1407a = view;
    }

    public void a() {
        View view = this.f1407a;
        int top = this.d - (view.getTop() - this.f1408b);
        AtomicInteger atomicInteger = w.f667a;
        view.offsetTopAndBottom(top);
        View view2 = this.f1407a;
        view2.offsetLeftAndRight(this.e - (view2.getLeft() - this.f1409c));
    }
}
