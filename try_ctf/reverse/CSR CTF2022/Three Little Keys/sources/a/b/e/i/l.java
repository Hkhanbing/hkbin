package a.b.e.i;

import a.b.e.i.m;
import a.h.j.w;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final Context f147a;

    /* renamed from: b  reason: collision with root package name */
    public final g f148b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f149c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public m.a i;
    public k j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final PopupWindow.OnDismissListener l = new a();

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.c();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i, int i2) {
        this.f147a = context;
        this.f148b = gVar;
        this.f = view;
        this.f149c = z;
        this.d = i;
        this.e = i2;
    }

    public k a() {
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.f147a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            k dVar = Math.min(point.x, point.y) >= this.f147a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new d(this.f147a, this.f, this.d, this.e, this.f149c) : new q(this.f147a, this.f148b, this.f, this.d, this.e, this.f149c);
            dVar.l(this.f148b);
            dVar.s(this.l);
            dVar.o(this.f);
            dVar.d(this.i);
            dVar.p(this.h);
            dVar.q(this.g);
            this.j = dVar;
        }
        return this.j;
    }

    public boolean b() {
        k kVar = this.j;
        return kVar != null && kVar.a();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(m.a aVar) {
        this.i = aVar;
        k kVar = this.j;
        if (kVar != null) {
            kVar.d(aVar);
        }
    }

    public final void e(int i, int i2, boolean z, boolean z2) {
        k a2 = a();
        a2.t(z2);
        if (z) {
            int i3 = this.g;
            View view = this.f;
            AtomicInteger atomicInteger = w.f667a;
            if ((Gravity.getAbsoluteGravity(i3, w.e.d(view)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            a2.r(i);
            a2.u(i2);
            int i4 = (int) ((this.f147a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f146a = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a2.i();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
