package b.b.a.a.b0;

import a.f.c.d;
import a.h.j.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import b.b.a.a.w.g;
import b.b.a.a.w.h;
import b.b.a.a.w.j;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class c extends ConstraintLayout {
    public final Runnable u;
    public int v;
    public g w;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.s();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.w = gVar;
        h hVar = new h(0.5f);
        j jVar = gVar.f1578a.f1582a;
        Objects.requireNonNull(jVar);
        j.b bVar = new j.b(jVar);
        bVar.e = hVar;
        bVar.f = hVar;
        bVar.g = hVar;
        bVar.h = hVar;
        gVar.f1578a.f1582a = bVar.a();
        gVar.invalidateSelf();
        this.w.q(ColorStateList.valueOf(-1));
        g gVar2 = this.w;
        AtomicInteger atomicInteger = w.f667a;
        w.d.q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.a.a.b.v, i, 0);
        this.v = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.u = new a();
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            AtomicInteger atomicInteger = w.f667a;
            view.setId(w.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.u);
            handler.post(this.u);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        s();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.u);
            handler.post(this.u);
        }
    }

    public void s() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        a.f.c.d dVar = new a.f.c.d();
        dVar.c(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i4 = this.v;
                if (!dVar.f462c.containsKey(Integer.valueOf(id))) {
                    dVar.f462c.put(Integer.valueOf(id), new d.a());
                }
                d.b bVar = dVar.f462c.get(Integer.valueOf(id)).d;
                bVar.A = R.id.circle_center;
                bVar.B = i4;
                bVar.C = f;
                f = (360.0f / (childCount - i)) + f;
            }
        }
        dVar.b(this, true);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.w.q(ColorStateList.valueOf(i));
    }
}
