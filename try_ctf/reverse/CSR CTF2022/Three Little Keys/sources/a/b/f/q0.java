package a.b.f;

import a.h.j.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class q0 implements a.b.e.i.p {
    public static Method A;
    public static Method B;

    /* renamed from: a  reason: collision with root package name */
    public Context f273a;

    /* renamed from: b  reason: collision with root package name */
    public ListAdapter f274b;

    /* renamed from: c  reason: collision with root package name */
    public l0 f275c;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public boolean k;
    public DataSetObserver o;
    public View p;
    public AdapterView.OnItemClickListener q;
    public final Handler v;
    public Rect x;
    public boolean y;
    public PopupWindow z;
    public int d = -2;
    public int e = -2;
    public int h = 1002;
    public int l = 0;
    public int m = Integer.MAX_VALUE;
    public int n = 0;
    public final e r = new e();
    public final d s = new d();
    public final c t = new c();
    public final a u = new a();
    public final Rect w = new Rect();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l0 l0Var = q0.this.f275c;
            if (l0Var != null) {
                l0Var.setListSelectionHidden(true);
                l0Var.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (q0.this.a()) {
                q0.this.i();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            q0.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (q0.this.z.getInputMethodMode() != 2) {
                    z = false;
                }
                if (z || q0.this.z.getContentView() == null) {
                    return;
                }
                q0 q0Var = q0.this;
                q0Var.v.removeCallbacks(q0Var.r);
                q0.this.r.run();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = q0.this.z) != null && popupWindow.isShowing() && x >= 0 && x < q0.this.z.getWidth() && y >= 0 && y < q0.this.z.getHeight()) {
                q0 q0Var = q0.this;
                q0Var.v.postDelayed(q0Var.r, 250L);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                q0 q0Var2 = q0.this;
                q0Var2.v.removeCallbacks(q0Var2.r);
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l0 l0Var = q0.this.f275c;
            if (l0Var != null) {
                AtomicInteger atomicInteger = a.h.j.w.f667a;
                if (!w.g.b(l0Var) || q0.this.f275c.getCount() <= q0.this.f275c.getChildCount()) {
                    return;
                }
                int childCount = q0.this.f275c.getChildCount();
                q0 q0Var = q0.this;
                if (childCount > q0Var.m) {
                    return;
                }
                q0Var.z.setInputMethodMode(2);
                q0.this.i();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public q0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f273a = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b.b.o, i, i2);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        t tVar = new t(context, attributeSet, i, i2);
        this.z = tVar;
        tVar.setInputMethodMode(1);
    }

    @Override // a.b.e.i.p
    public boolean a() {
        return this.z.isShowing();
    }

    public void c(int i) {
        this.f = i;
    }

    public int d() {
        return this.f;
    }

    @Override // a.b.e.i.p
    public void dismiss() {
        this.z.dismiss();
        this.z.setContentView(null);
        this.f275c = null;
        this.v.removeCallbacks(this.r);
    }

    @Override // a.b.e.i.p
    public ListView e() {
        return this.f275c;
    }

    @Override // a.b.e.i.p
    public void i() {
        int i;
        int i2;
        int paddingBottom;
        l0 l0Var;
        if (this.f275c == null) {
            l0 q = q(this.f273a, !this.y);
            this.f275c = q;
            q.setAdapter(this.f274b);
            this.f275c.setOnItemClickListener(this.q);
            this.f275c.setFocusable(true);
            this.f275c.setFocusableInTouchMode(true);
            this.f275c.setOnItemSelectedListener(new p0(this));
            this.f275c.setOnScrollListener(this.t);
            this.z.setContentView(this.f275c);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.z.getContentView();
        }
        Drawable background = this.z.getBackground();
        int i3 = 0;
        if (background != null) {
            background.getPadding(this.w);
            Rect rect = this.w;
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.i) {
                this.g = -i4;
            }
        } else {
            this.w.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = this.z.getMaxAvailableHeight(this.p, this.g, this.z.getInputMethodMode() == 2);
        if (this.d == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i5 = this.e;
            if (i5 != -2) {
                i2 = 1073741824;
                if (i5 == -1) {
                    int i6 = this.f273a.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.w;
                    i5 = i6 - (rect2.left + rect2.right);
                }
            } else {
                int i7 = this.f273a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.w;
                i5 = i7 - (rect3.left + rect3.right);
                i2 = Integer.MIN_VALUE;
            }
            int a2 = this.f275c.a(View.MeasureSpec.makeMeasureSpec(i5, i2), maxAvailableHeight - 0, -1);
            paddingBottom = a2 + (a2 > 0 ? this.f275c.getPaddingBottom() + this.f275c.getPaddingTop() + i + 0 : 0);
        }
        boolean z = this.z.getInputMethodMode() == 2;
        a.h.k.e.d(this.z, this.h);
        if (this.z.isShowing()) {
            View view = this.p;
            AtomicInteger atomicInteger = a.h.j.w.f667a;
            if (!w.g.b(view)) {
                return;
            }
            int i8 = this.e;
            if (i8 == -1) {
                i8 = -1;
            } else if (i8 == -2) {
                i8 = this.p.getWidth();
            }
            int i9 = this.d;
            if (i9 == -1) {
                if (!z) {
                    paddingBottom = -1;
                }
                if (z) {
                    this.z.setWidth(this.e == -1 ? -1 : 0);
                    this.z.setHeight(0);
                } else {
                    PopupWindow popupWindow = this.z;
                    if (this.e == -1) {
                        i3 = -1;
                    }
                    popupWindow.setWidth(i3);
                    this.z.setHeight(-1);
                }
            } else if (i9 != -2) {
                paddingBottom = i9;
            }
            this.z.setOutsideTouchable(true);
            this.z.update(this.p, this.f, this.g, i8 < 0 ? -1 : i8, paddingBottom < 0 ? -1 : paddingBottom);
            return;
        }
        int i10 = this.e;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = this.p.getWidth();
        }
        int i11 = this.d;
        if (i11 == -1) {
            paddingBottom = -1;
        } else if (i11 != -2) {
            paddingBottom = i11;
        }
        this.z.setWidth(i10);
        this.z.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(this.z, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.z.setIsClippedToScreen(true);
        }
        this.z.setOutsideTouchable(true);
        this.z.setTouchInterceptor(this.s);
        if (this.k) {
            a.h.k.e.c(this.z, this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(this.z, this.x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.z.setEpicenterBounds(this.x);
        }
        a.h.k.d.a(this.z, this.p, this.f, this.g, this.l);
        this.f275c.setSelection(-1);
        if ((!this.y || this.f275c.isInTouchMode()) && (l0Var = this.f275c) != null) {
            l0Var.setListSelectionHidden(true);
            l0Var.requestLayout();
        }
        if (this.y) {
            return;
        }
        this.v.post(this.u);
    }

    public int j() {
        if (!this.i) {
            return 0;
        }
        return this.g;
    }

    public void l(Drawable drawable) {
        this.z.setBackgroundDrawable(drawable);
    }

    public void m(int i) {
        this.g = i;
        this.i = true;
    }

    public Drawable n() {
        return this.z.getBackground();
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.o;
        if (dataSetObserver == null) {
            this.o = new b();
        } else {
            ListAdapter listAdapter2 = this.f274b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f274b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.o);
        }
        l0 l0Var = this.f275c;
        if (l0Var != null) {
            l0Var.setAdapter(this.f274b);
        }
    }

    public l0 q(Context context, boolean z) {
        return new l0(context, z);
    }

    public void r(int i) {
        Drawable background = this.z.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        background.getPadding(this.w);
        Rect rect = this.w;
        this.e = rect.left + rect.right + i;
    }

    public void s(boolean z) {
        this.y = z;
        this.z.setFocusable(z);
    }
}
