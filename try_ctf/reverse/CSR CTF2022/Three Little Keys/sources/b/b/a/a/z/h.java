package b.b.a.a.z;

import a.h.j.w;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import b.b.a.a.w.g;
import b.b.a.a.w.j;
import com.google.android.material.textfield.TextInputLayout;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class h extends m {
    public final TextWatcher e;
    public final View.OnFocusChangeListener f;
    public final TextInputLayout.e g;
    public final TextInputLayout.f h;
    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.g i;
    public final View.OnAttachStateChangeListener j;
    public final a.h.j.d0.b k;
    public boolean l;
    public boolean m;
    public long n;
    public StateListDrawable o;
    public b.b.a.a.w.g p;
    public AccessibilityManager q;
    public ValueAnimator r;
    public ValueAnimator s;

    /* loaded from: classes.dex */
    public class a extends b.b.a.a.r.m {

        /* renamed from: b.b.a.a.z.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0045a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f1628a;

            public RunnableC0045a(AutoCompleteTextView autoCompleteTextView) {
                this.f1628a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f1628a.isPopupShowing();
                h.g(h.this, isPopupShowing);
                h.this.l = isPopupShowing;
            }
        }

        public a() {
        }

        @Override // b.b.a.a.r.m, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView e = h.e(h.this.f1643a.getEditText());
            if (h.this.q.isTouchExplorationEnabled() && h.f(e) && !h.this.f1645c.hasFocus()) {
                e.dismissDropDown();
            }
            e.post(new RunnableC0045a(e));
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            h.this.f1643a.setEndIconActivated(z);
            if (!z) {
                h.g(h.this, false);
                h.this.l = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends TextInputLayout.e {
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, a.h.j.c
        public void d(View view, a.h.j.d0.d dVar) {
            super.d(view, dVar);
            if (!h.f(h.this.f1643a.getEditText())) {
                dVar.f633a.setClassName(Spinner.class.getName());
            }
            if (dVar.f633a.isShowingHintText()) {
                dVar.f633a.setHintText(null);
            }
        }

        @Override // a.h.j.c
        public void e(View view, AccessibilityEvent accessibilityEvent) {
            this.f621a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView e = h.e(h.this.f1643a.getEditText());
            if (accessibilityEvent.getEventType() != 1 || !h.this.q.isEnabled() || h.f(h.this.f1643a.getEditText())) {
                return;
            }
            h.h(h.this, e);
            h.i(h.this);
        }
    }

    /* loaded from: classes.dex */
    public class d implements TextInputLayout.f {
        public d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
        @Override // com.google.android.material.textfield.TextInputLayout.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(com.google.android.material.textfield.TextInputLayout r6) {
            /*
                r5 = this;
                android.widget.EditText r0 = r6.getEditText()
                android.widget.AutoCompleteTextView r0 = b.b.a.a.z.h.e(r0)
                b.b.a.a.z.h r1 = b.b.a.a.z.h.this
                com.google.android.material.textfield.TextInputLayout r2 = r1.f1643a
                int r2 = r2.getBoxBackgroundMode()
                r3 = 2
                r4 = 1
                if (r2 != r3) goto L17
                b.b.a.a.w.g r1 = r1.p
                goto L1b
            L17:
                if (r2 != r4) goto L1e
                android.graphics.drawable.StateListDrawable r1 = r1.o
            L1b:
                r0.setDropDownBackgroundDrawable(r1)
            L1e:
                b.b.a.a.z.h r1 = b.b.a.a.z.h.this
                r1.j(r0)
                b.b.a.a.z.h r1 = b.b.a.a.z.h.this
                java.util.Objects.requireNonNull(r1)
                b.b.a.a.z.l r2 = new b.b.a.a.z.l
                r2.<init>(r1, r0)
                r0.setOnTouchListener(r2)
                android.view.View$OnFocusChangeListener r2 = r1.f
                r0.setOnFocusChangeListener(r2)
                b.b.a.a.z.i r2 = new b.b.a.a.z.i
                r2.<init>(r1)
                r0.setOnDismissListener(r2)
                r1 = 0
                r0.setThreshold(r1)
                b.b.a.a.z.h r2 = b.b.a.a.z.h.this
                android.text.TextWatcher r2 = r2.e
                r0.removeTextChangedListener(r2)
                b.b.a.a.z.h r2 = b.b.a.a.z.h.this
                android.text.TextWatcher r2 = r2.e
                r0.addTextChangedListener(r2)
                r6.setEndIconCheckable(r4)
                r2 = 0
                r6.setErrorIconDrawable(r2)
                android.text.method.KeyListener r0 = r0.getKeyListener()
                if (r0 == 0) goto L5d
                r1 = r4
            L5d:
                if (r1 != 0) goto L72
                b.b.a.a.z.h r0 = b.b.a.a.z.h.this
                android.view.accessibility.AccessibilityManager r0 = r0.q
                boolean r0 = r0.isTouchExplorationEnabled()
                if (r0 == 0) goto L72
                b.b.a.a.z.h r0 = b.b.a.a.z.h.this
                com.google.android.material.internal.CheckableImageButton r0 = r0.f1645c
                java.util.concurrent.atomic.AtomicInteger r1 = a.h.j.w.f667a
                a.h.j.w.d.s(r0, r3)
            L72:
                b.b.a.a.z.h r0 = b.b.a.a.z.h.this
                com.google.android.material.textfield.TextInputLayout$e r0 = r0.g
                r6.setTextInputAccessibilityDelegate(r0)
                r6.setEndIconVisible(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.z.h.d.a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    /* loaded from: classes.dex */
    public class e implements TextInputLayout.g {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f1633a;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f1633a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1633a.removeTextChangedListener(h.this.e);
            }
        }

        public e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            a.h.j.d0.b bVar;
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == h.this.f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                autoCompleteTextView.setOnDismissListener(null);
            }
            if (i == 3) {
                textInputLayout.removeOnAttachStateChangeListener(h.this.j);
                h hVar = h.this;
                AccessibilityManager accessibilityManager = hVar.q;
                if (accessibilityManager == null || (bVar = hVar.k) == null) {
                    return;
                }
                accessibilityManager.removeTouchExplorationStateChangeListener(new a.h.j.d0.c(bVar));
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnAttachStateChangeListener {
        public f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            h.this.k();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a.h.j.d0.b bVar;
            h hVar = h.this;
            AccessibilityManager accessibilityManager = hVar.q;
            if (accessibilityManager == null || (bVar = hVar.k) == null) {
                return;
            }
            accessibilityManager.removeTouchExplorationStateChangeListener(new a.h.j.d0.c(bVar));
        }
    }

    /* loaded from: classes.dex */
    public class g implements a.h.j.d0.b {
        public g() {
        }
    }

    /* renamed from: b.b.a.a.z.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0046h implements View.OnClickListener {
        public View$OnClickListenerC0046h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.h(h.this, (AutoCompleteTextView) h.this.f1643a.getEditText());
        }
    }

    public h(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.e = new a();
        this.f = new b();
        this.g = new c(this.f1643a);
        this.h = new d();
        this.i = new e();
        this.j = new f();
        this.k = new g();
        this.l = false;
        this.m = false;
        this.n = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView e(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static boolean f(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static void g(h hVar, boolean z) {
        if (hVar.m != z) {
            hVar.m = z;
            hVar.s.cancel();
            hVar.r.start();
        }
    }

    public static void h(h hVar, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(hVar);
        if (autoCompleteTextView == null) {
            return;
        }
        if (hVar.m()) {
            hVar.l = false;
        }
        if (hVar.l) {
            hVar.l = false;
            return;
        }
        boolean z = hVar.m;
        boolean z2 = !z;
        if (z != z2) {
            hVar.m = z2;
            hVar.s.cancel();
            hVar.r.start();
        }
        if (!hVar.m) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    public static void i(h hVar) {
        hVar.l = true;
        hVar.n = System.currentTimeMillis();
    }

    @Override // b.b.a.a.z.m
    public void a() {
        float dimensionPixelOffset = this.f1644b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f1644b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f1644b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        b.b.a.a.w.g l = l(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        b.b.a.a.w.g l2 = l(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.p = l;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.o = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, l);
        this.o.addState(new int[0], l2);
        int i = this.d;
        if (i == 0) {
            i = R.drawable.mtrl_dropdown_arrow;
        }
        this.f1643a.setEndIconDrawable(i);
        TextInputLayout textInputLayout = this.f1643a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f1643a.setEndIconOnClickListener(new View$OnClickListenerC0046h());
        this.f1643a.a(this.h);
        this.f1643a.f0.add(this.i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = b.b.a.a.c.a.f1370a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new k(this));
        this.s = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new k(this));
        this.r = ofFloat2;
        ofFloat2.addListener(new j(this));
        this.q = (AccessibilityManager) this.f1644b.getSystemService("accessibility");
        this.f1643a.addOnAttachStateChangeListener(this.j);
        k();
    }

    @Override // b.b.a.a.z.m
    public boolean b(int i) {
        return i != 0;
    }

    @Override // b.b.a.a.z.m
    public boolean d() {
        return true;
    }

    public final void j(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.f1643a.getBoxBackgroundMode();
        b.b.a.a.w.g boxBackground = this.f1643a.getBoxBackground();
        int f2 = b.b.a.a.a.f(autoCompleteTextView, R.attr.colorControlHighlight);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode != 2) {
            if (boxBackgroundMode != 1) {
                return;
            }
            int boxBackgroundColor = this.f1643a.getBoxBackgroundColor();
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{b.b.a.a.a.p(f2, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
            AtomicInteger atomicInteger = w.f667a;
            w.d.q(autoCompleteTextView, rippleDrawable);
            return;
        }
        int f3 = b.b.a.a.a.f(autoCompleteTextView, R.attr.colorSurface);
        b.b.a.a.w.g gVar = new b.b.a.a.w.g(boxBackground.f1578a.f1582a);
        int p = b.b.a.a.a.p(f2, f3, 0.1f);
        gVar.q(new ColorStateList(iArr, new int[]{p, 0}));
        gVar.setTint(f3);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{p, f3});
        b.b.a.a.w.g gVar2 = new b.b.a.a.w.g(boxBackground.f1578a.f1582a);
        gVar2.setTint(-1);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar, gVar2), boxBackground});
        AtomicInteger atomicInteger2 = w.f667a;
        w.d.q(autoCompleteTextView, layerDrawable);
    }

    public final void k() {
        TextInputLayout textInputLayout;
        if (this.q == null || (textInputLayout = this.f1643a) == null) {
            return;
        }
        AtomicInteger atomicInteger = w.f667a;
        if (!w.g.b(textInputLayout)) {
            return;
        }
        AccessibilityManager accessibilityManager = this.q;
        a.h.j.d0.b bVar = this.k;
        if (bVar == null) {
            return;
        }
        accessibilityManager.addTouchExplorationStateChangeListener(new a.h.j.d0.c(bVar));
    }

    public final b.b.a.a.w.g l(float f2, float f3, float f4, int i) {
        j.b bVar = new j.b();
        bVar.e = new b.b.a.a.w.a(f2);
        bVar.f = new b.b.a.a.w.a(f2);
        bVar.h = new b.b.a.a.w.a(f3);
        bVar.g = new b.b.a.a.w.a(f3);
        b.b.a.a.w.j a2 = bVar.a();
        Context context = this.f1644b;
        String str = b.b.a.a.w.g.x;
        int y = b.b.a.a.a.y(context, R.attr.colorSurface, b.b.a.a.w.g.class.getSimpleName());
        b.b.a.a.w.g gVar = new b.b.a.a.w.g();
        gVar.f1578a.f1583b = new b.b.a.a.o.a(context);
        gVar.x();
        gVar.q(ColorStateList.valueOf(y));
        g.b bVar2 = gVar.f1578a;
        if (bVar2.o != f4) {
            bVar2.o = f4;
            gVar.x();
        }
        gVar.f1578a.f1582a = a2;
        gVar.invalidateSelf();
        g.b bVar3 = gVar.f1578a;
        if (bVar3.i == null) {
            bVar3.i = new Rect();
        }
        gVar.f1578a.i.set(0, i, 0, i);
        gVar.invalidateSelf();
        return gVar;
    }

    public final boolean m() {
        long currentTimeMillis = System.currentTimeMillis() - this.n;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}
