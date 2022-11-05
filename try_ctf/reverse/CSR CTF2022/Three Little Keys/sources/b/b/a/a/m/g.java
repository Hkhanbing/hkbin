package b.b.a.a.m;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.List;

/* loaded from: classes.dex */
public final class g<S> extends y<S> {
    public static final /* synthetic */ int e0 = 0;
    public int U;
    public b.b.a.a.m.d<S> V;
    public b.b.a.a.m.a W;
    public t X;
    public e Y;
    public b.b.a.a.m.c Z;
    public RecyclerView a0;
    public RecyclerView b0;
    public View c0;
    public View d0;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1468a;

        public a(int i) {
            this.f1468a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = g.this.b0;
            int i = this.f1468a;
            if (recyclerView.w) {
                return;
            }
            RecyclerView.l lVar = recyclerView.l;
            if (lVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                lVar.W0(recyclerView, recyclerView.e0, i);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends a.h.j.c {
        public b(g gVar) {
        }

        @Override // a.h.j.c
        public void d(View view, a.h.j.d0.d dVar) {
            this.f621a.onInitializeAccessibilityNodeInfo(view, dVar.f633a);
            dVar.h(null);
        }
    }

    /* loaded from: classes.dex */
    public class c extends z {
        public final /* synthetic */ int G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.G = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void Z0(RecyclerView.w wVar, int[] iArr) {
            if (this.G == 0) {
                iArr[0] = g.this.b0.getWidth();
                iArr[1] = g.this.b0.getWidth();
                return;
            }
            iArr[0] = g.this.b0.getHeight();
            iArr[1] = g.this.b0.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public class d implements f {
        public d() {
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        DAY,
        YEAR
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    @Override // a.l.b.m
    public void L(Bundle bundle) {
        super.L(bundle);
        if (bundle == null) {
            bundle = this.f;
        }
        this.U = bundle.getInt("THEME_RES_ID_KEY");
        this.V = (b.b.a.a.m.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.W = (b.b.a.a.m.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.X = (t) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // a.l.b.m
    public View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        a.p.b.u uVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(j(), this.U);
        this.Z = new b.b.a.a.m.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        t tVar = this.W.f1445a;
        if (o.y0(contextThemeWrapper)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = i0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = u.f;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        a.h.j.w.p(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new b.b.a.a.m.f());
        gridView.setNumColumns(tVar.d);
        gridView.setEnabled(false);
        this.b0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.b0.setLayoutManager(new c(j(), i2, false, i2));
        this.b0.setTag("MONTHS_VIEW_GROUP_TAG");
        w wVar = new w(contextThemeWrapper, this.V, this.W, new d());
        this.b0.setAdapter(wVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.a0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.a0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.a0.setAdapter(new d0(this));
            this.a0.g(new h(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            a.h.j.w.p(materialButton, new i(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.c0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.d0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            x0(e.DAY);
            materialButton.setText(this.X.n());
            this.b0.h(new j(this, wVar, materialButton));
            materialButton.setOnClickListener(new k(this));
            materialButton3.setOnClickListener(new l(this, wVar));
            materialButton2.setOnClickListener(new m(this, wVar));
        }
        if (!o.y0(contextThemeWrapper) && (recyclerView2 = (uVar = new a.p.b.u()).f1064a) != (recyclerView = this.b0)) {
            if (recyclerView2 != null) {
                RecyclerView.p pVar = uVar.f1065b;
                List<RecyclerView.p> list = recyclerView2.g0;
                if (list != null) {
                    list.remove(pVar);
                }
                uVar.f1064a.setOnFlingListener(null);
            }
            uVar.f1064a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    uVar.f1064a.h(uVar.f1065b);
                    uVar.f1064a.setOnFlingListener(uVar);
                    new Scroller(uVar.f1064a.getContext(), new DecelerateInterpolator());
                    uVar.b();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        this.b0.i0(wVar.f(this.X));
        return inflate;
    }

    @Override // a.l.b.m
    public void Z(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.U);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.V);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.W);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.X);
    }

    @Override // b.b.a.a.m.y
    public boolean t0(x<S> xVar) {
        return this.T.add(xVar);
    }

    public LinearLayoutManager u0() {
        return (LinearLayoutManager) this.b0.getLayoutManager();
    }

    public final void v0(int i) {
        this.b0.post(new a(i));
    }

    public void w0(t tVar) {
        RecyclerView recyclerView;
        int i;
        w wVar = (w) this.b0.getAdapter();
        int p = wVar.f1501c.f1445a.p(tVar);
        int f2 = p - wVar.f(this.X);
        boolean z = true;
        boolean z2 = Math.abs(f2) > 3;
        if (f2 <= 0) {
            z = false;
        }
        this.X = tVar;
        if (!z2 || !z) {
            if (z2) {
                recyclerView = this.b0;
                i = p + 3;
            }
            v0(p);
        }
        recyclerView = this.b0;
        i = p - 3;
        recyclerView.i0(i);
        v0(p);
    }

    public void x0(e eVar) {
        this.Y = eVar;
        if (eVar == e.YEAR) {
            this.a0.getLayoutManager().M0(((d0) this.a0.getAdapter()).e(this.X.f1495c));
            this.c0.setVisibility(0);
            this.d0.setVisibility(8);
        } else if (eVar != e.DAY) {
        } else {
            this.c0.setVisibility(8);
            this.d0.setVisibility(0);
            w0(this.X);
        }
    }
}
