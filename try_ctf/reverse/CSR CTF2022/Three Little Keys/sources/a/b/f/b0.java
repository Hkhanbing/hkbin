package a.b.f;

import a.b.c.d;
import a.h.j.w;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b0 extends Spinner {
    public static final int[] i = {16843505};

    /* renamed from: a  reason: collision with root package name */
    public final a.b.f.f f163a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f164b;

    /* renamed from: c  reason: collision with root package name */
    public n0 f165c;
    public SpinnerAdapter d;
    public final boolean e;
    public f f;
    public int g;
    public final Rect h;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b0.this.getInternalPopup().a()) {
                b0.this.b();
            }
            ViewTreeObserver viewTreeObserver = b0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements f, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public a.b.c.d f167a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f168b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f169c;

        public b() {
        }

        @Override // a.b.f.b0.f
        public boolean a() {
            a.b.c.d dVar = this.f167a;
            if (dVar != null) {
                return dVar.isShowing();
            }
            return false;
        }

        @Override // a.b.f.b0.f
        public CharSequence b() {
            return this.f169c;
        }

        @Override // a.b.f.b0.f
        public void c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // a.b.f.b0.f
        public int d() {
            return 0;
        }

        @Override // a.b.f.b0.f
        public void dismiss() {
            a.b.c.d dVar = this.f167a;
            if (dVar != null) {
                dVar.dismiss();
                this.f167a = null;
            }
        }

        @Override // a.b.f.b0.f
        public void f(int i, int i2) {
            if (this.f168b == null) {
                return;
            }
            d.a aVar = new d.a(b0.this.getPopupContext());
            CharSequence charSequence = this.f169c;
            if (charSequence != null) {
                aVar.f22a.d = charSequence;
            }
            ListAdapter listAdapter = this.f168b;
            int selectedItemPosition = b0.this.getSelectedItemPosition();
            AlertController.b bVar = aVar.f22a;
            bVar.g = listAdapter;
            bVar.h = this;
            bVar.j = selectedItemPosition;
            bVar.i = true;
            a.b.c.d a2 = aVar.a();
            this.f167a = a2;
            ListView listView = a2.f21c.g;
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.f167a.show();
        }

        @Override // a.b.f.b0.f
        public void h(CharSequence charSequence) {
            this.f169c = charSequence;
        }

        @Override // a.b.f.b0.f
        public int j() {
            return 0;
        }

        @Override // a.b.f.b0.f
        public void l(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // a.b.f.b0.f
        public void m(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // a.b.f.b0.f
        public Drawable n() {
            return null;
        }

        @Override // a.b.f.b0.f
        public void o(ListAdapter listAdapter) {
            this.f168b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            b0.this.setSelection(i);
            if (b0.this.getOnItemClickListener() != null) {
                b0.this.performItemClick(null, i, this.f168b.getItemId(i));
            }
            a.b.c.d dVar = this.f167a;
            if (dVar != null) {
                dVar.dismiss();
                this.f167a = null;
            }
        }

        @Override // a.b.f.b0.f
        public void p(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    /* loaded from: classes.dex */
    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public SpinnerAdapter f170a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f171b;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f170a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f171b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == theme) {
                        return;
                    }
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                } else if (!(spinnerAdapter instanceof z0)) {
                } else {
                    z0 z0Var = (z0) spinnerAdapter;
                    if (z0Var.getDropDownViewTheme() != null) {
                        return;
                    }
                    z0Var.setDropDownViewTheme(theme);
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f171b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f170a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f170a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f170a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f170a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f170a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f170a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f171b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f170a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f170a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends q0 implements f {
        public CharSequence C;
        public ListAdapter D;
        public final Rect E;
        public int F;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a(b0 b0Var) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                b0.this.setSelection(i);
                if (b0.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    b0.this.performItemClick(view, i, dVar.D.getItemId(i));
                }
                d.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                d dVar = d.this;
                b0 b0Var = b0.this;
                Objects.requireNonNull(dVar);
                AtomicInteger atomicInteger = a.h.j.w.f667a;
                if (!(w.g.b(b0Var) && b0Var.getGlobalVisibleRect(dVar.E))) {
                    d.this.dismiss();
                    return;
                }
                d.this.t();
                d.this.i();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f174a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f174a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = b0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f174a);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.E = new Rect();
            this.p = b0.this;
            s(true);
            this.n = 0;
            this.q = new a(b0.this);
        }

        @Override // a.b.f.b0.f
        public CharSequence b() {
            return this.C;
        }

        @Override // a.b.f.b0.f
        public void f(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean a2 = a();
            t();
            this.z.setInputMethodMode(2);
            i();
            l0 l0Var = this.f275c;
            l0Var.setChoiceMode(1);
            l0Var.setTextDirection(i);
            l0Var.setTextAlignment(i2);
            int selectedItemPosition = b0.this.getSelectedItemPosition();
            l0 l0Var2 = this.f275c;
            if (a() && l0Var2 != null) {
                l0Var2.setListSelectionHidden(false);
                l0Var2.setSelection(selectedItemPosition);
                if (l0Var2.getChoiceMode() != 0) {
                    l0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a2 && (viewTreeObserver = b0.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.z.setOnDismissListener(new c(bVar));
            }
        }

        @Override // a.b.f.b0.f
        public void h(CharSequence charSequence) {
            this.C = charSequence;
        }

        @Override // a.b.f.q0, a.b.f.b0.f
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.D = listAdapter;
        }

        @Override // a.b.f.b0.f
        public void p(int i) {
            this.F = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void t() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.n()
                r1 = 0
                if (r0 == 0) goto L26
                a.b.f.b0 r1 = a.b.f.b0.this
                android.graphics.Rect r1 = r1.h
                r0.getPadding(r1)
                a.b.f.b0 r0 = a.b.f.b0.this
                boolean r0 = a.b.f.h1.b(r0)
                if (r0 == 0) goto L1d
                a.b.f.b0 r0 = a.b.f.b0.this
                android.graphics.Rect r0 = r0.h
                int r0 = r0.right
                goto L24
            L1d:
                a.b.f.b0 r0 = a.b.f.b0.this
                android.graphics.Rect r0 = r0.h
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                a.b.f.b0 r0 = a.b.f.b0.this
                android.graphics.Rect r0 = r0.h
                r0.right = r1
                r0.left = r1
            L2e:
                a.b.f.b0 r0 = a.b.f.b0.this
                int r0 = r0.getPaddingLeft()
                a.b.f.b0 r2 = a.b.f.b0.this
                int r2 = r2.getPaddingRight()
                a.b.f.b0 r3 = a.b.f.b0.this
                int r3 = r3.getWidth()
                a.b.f.b0 r4 = a.b.f.b0.this
                int r5 = r4.g
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.D
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.n()
                int r4 = r4.a(r5, r6)
                a.b.f.b0 r5 = a.b.f.b0.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                a.b.f.b0 r6 = a.b.f.b0.this
                android.graphics.Rect r6 = r6.h
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.r(r4)
                goto L85
            L82:
                r8.r(r5)
            L85:
                a.b.f.b0 r4 = a.b.f.b0.this
                boolean r4 = a.b.f.h1.b(r4)
                if (r4 == 0) goto L96
                int r3 = r3 - r2
                int r0 = r8.e
                int r3 = r3 - r0
                int r0 = r8.F
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L9b
            L96:
                int r2 = r8.F
                int r0 = r0 + r2
                int r3 = r0 + r1
            L9b:
                r8.f = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.f.b0.d.t():void");
        }
    }

    /* loaded from: classes.dex */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public boolean f176a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f176a = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f176a ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a();

        CharSequence b();

        void c(int i);

        int d();

        void dismiss();

        void f(int i, int i2);

        void h(CharSequence charSequence);

        int j();

        void l(Drawable drawable);

        void m(int i);

        Drawable n();

        void o(ListAdapter listAdapter);

        void p(int i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r4 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b0(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.h = r0
            android.content.Context r0 = r9.getContext()
            a.b.f.y0.a(r9, r0)
            int[] r0 = a.b.b.v
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            a.b.f.f r2 = new a.b.f.f
            r2.<init>(r9)
            r9.f163a = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L2e
            a.b.e.c r3 = new a.b.e.c
            r3.<init>(r10, r2)
            r9.f164b = r3
            goto L30
        L2e:
            r9.f164b = r10
        L30:
            r2 = 0
            r3 = -1
            int[] r4 = a.b.f.b0.i     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r5 == 0) goto L58
            int r3 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            goto L58
        L43:
            r10 = move-exception
            r2 = r4
            goto Ld0
        L47:
            r5 = move-exception
            goto L4f
        L49:
            r10 = move-exception
            goto Ld0
        L4c:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L4f:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L5b
        L58:
            r4.recycle()
        L5b:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L97
            if (r3 == r5) goto L62
            goto La5
        L62:
            a.b.f.b0$d r3 = new a.b.f.b0$d
            android.content.Context r6 = r9.f164b
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.f164b
            int[] r7 = a.b.b.v
            a.b.f.d1 r6 = a.b.f.d1.q(r6, r11, r7, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r6.k(r7, r8)
            r9.g = r7
            android.graphics.drawable.Drawable r7 = r6.g(r5)
            android.widget.PopupWindow r8 = r3.z
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.C = r4
            android.content.res.TypedArray r4 = r6.f193b
            r4.recycle()
            r9.f = r3
            a.b.f.a0 r4 = new a.b.f.a0
            r4.<init>(r9, r9, r3)
            r9.f165c = r4
            goto La5
        L97:
            a.b.f.b0$b r3 = new a.b.f.b0$b
            r3.<init>()
            r9.f = r3
            java.lang.String r4 = r0.getString(r4)
            r3.h(r4)
        La5:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Lbc
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131492966(0x7f0c0066, float:1.8609399E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter(r3)
        Lbc:
            r0.recycle()
            r9.e = r5
            android.widget.SpinnerAdapter r10 = r9.d
            if (r10 == 0) goto Lca
            r9.setAdapter(r10)
            r9.d = r2
        Lca:
            a.b.f.f r10 = r9.f163a
            r10.d(r11, r12)
            return
        Ld0:
            if (r2 == 0) goto Ld5
            r2.recycle()
        Ld5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.f.b0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.h);
        Rect rect = this.h;
        return i3 + rect.left + rect.right;
    }

    public void b() {
        this.f.f(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a.b.f.f fVar = this.f163a;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.f;
        return fVar != null ? fVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.f;
        return fVar != null ? fVar.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f != null ? this.g : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.f;
        return fVar != null ? fVar.n() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f164b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.f;
        return fVar != null ? fVar.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        a.b.f.f fVar = this.f163a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a.b.f.f fVar = this.f163a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f;
        if (fVar == null || !fVar.a()) {
            return;
        }
        this.f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (!eVar.f176a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.f;
        eVar.f176a = fVar != null && fVar.a();
        return eVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        n0 n0Var = this.f165c;
        if (n0Var == null || !n0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        f fVar = this.f;
        if (fVar != null) {
            if (fVar.a()) {
                return true;
            }
            b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f == null) {
            return;
        }
        Context context = this.f164b;
        if (context == null) {
            context = getContext();
        }
        this.f.o(new c(spinnerAdapter, context.getTheme()));
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a.b.f.f fVar = this.f163a;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        a.b.f.f fVar = this.f163a;
        if (fVar != null) {
            fVar.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        f fVar = this.f;
        if (fVar == null) {
            super.setDropDownHorizontalOffset(i2);
            return;
        }
        fVar.p(i2);
        this.f.c(i2);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        f fVar = this.f;
        if (fVar != null) {
            fVar.m(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f != null) {
            this.g = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f;
        if (fVar != null) {
            fVar.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(a.b.a.e(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f;
        if (fVar != null) {
            fVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a.b.f.f fVar = this.f163a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a.b.f.f fVar = this.f163a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }
}
