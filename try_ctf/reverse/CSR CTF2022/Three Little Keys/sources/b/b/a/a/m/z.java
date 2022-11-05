package b.b.a.a.m;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class z extends LinearLayoutManager {

    /* loaded from: classes.dex */
    public class a extends a.p.b.o {
        public a(z zVar, Context context) {
            super(context);
        }

        @Override // a.p.b.o
        public float f(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public z(Context context, int i, boolean z) {
        super(i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public void W0(RecyclerView recyclerView, RecyclerView.w wVar, int i) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.f1326a = i;
        X0(aVar);
    }
}
