package b.b.a.a.m;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s<S> extends y<S> {
    public int U;
    public d<S> V;
    public b.b.a.a.m.a W;

    /* loaded from: classes.dex */
    public class a extends x<S> {
        public a() {
        }

        @Override // b.b.a.a.m.x
        public void a(S s) {
            Iterator<x<S>> it = s.this.T.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    @Override // a.l.b.m
    public void L(Bundle bundle) {
        super.L(bundle);
        if (bundle == null) {
            bundle = this.f;
        }
        this.U = bundle.getInt("THEME_RES_ID_KEY");
        this.V = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.W = (b.b.a.a.m.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // a.l.b.m
    public View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.V.e(layoutInflater.cloneInContext(new ContextThemeWrapper(j(), this.U)), viewGroup, bundle, this.W, new a());
    }

    @Override // a.l.b.m
    public void Z(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.U);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.V);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.W);
    }
}
