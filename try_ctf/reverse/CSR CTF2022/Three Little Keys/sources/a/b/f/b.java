package a.b.f;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public abstract class b extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final a f157a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f158b;

    /* renamed from: c  reason: collision with root package name */
    public ActionMenuView f159c;
    public d d;
    public int e;
    public a.h.j.x f;
    public boolean g;
    public boolean h;

    /* loaded from: classes.dex */
    public class a implements a.h.j.y {

        /* renamed from: a  reason: collision with root package name */
        public boolean f160a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f161b;

        public a() {
        }

        @Override // a.h.j.y
        public void a(View view) {
            if (this.f160a) {
                return;
            }
            b bVar = b.this;
            bVar.f = null;
            b.super.setVisibility(this.f161b);
        }

        @Override // a.h.j.y
        public void b(View view) {
            b.super.setVisibility(0);
            this.f160a = false;
        }

        @Override // a.h.j.y
        public void c(View view) {
            this.f160a = true;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f157a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f158b = context;
        } else {
            this.f158b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int d(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public a.h.j.x e(int i, long j) {
        a.h.j.x xVar = this.f;
        if (xVar != null) {
            xVar.b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            a.h.j.x b2 = a.h.j.w.b(this);
            b2.a(1.0f);
            b2.c(j);
            a aVar = this.f157a;
            b.this.f = b2;
            aVar.f161b = i;
            View view = b2.f678a.get();
            if (view != null) {
                b2.e(view, aVar);
            }
            return b2;
        }
        a.h.j.x b3 = a.h.j.w.b(this);
        b3.a(0.0f);
        b3.c(j);
        a aVar2 = this.f157a;
        b.this.f = b3;
        aVar2.f161b = i;
        View view2 = b3.f678a.get();
        if (view2 != null) {
            b3.e(view2, aVar2);
        }
        return b3;
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.f157a.f161b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.b.b.f13a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        d dVar = this.d;
        if (dVar != null) {
            Configuration configuration2 = dVar.f105b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            dVar.p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            a.b.e.i.g gVar = dVar.f106c;
            if (gVar == null) {
                return;
            }
            gVar.q(true);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            a.h.j.x xVar = this.f;
            if (xVar != null) {
                xVar.b();
            }
            super.setVisibility(i);
        }
    }
}
