package a.h.j;

import a.h.j.b0;
import a.h.j.c;
import a.h.j.d0.d;
import a.h.j.e;
import a.h.j.w;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import de.cybersecurityrumble.threelittlekeys.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class w {

    /* renamed from: c  reason: collision with root package name */
    public static Field f669c;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f667a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    public static WeakHashMap<View, x> f668b = null;
    public static boolean d = false;
    public static final int[] e = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final a.h.j.q f = a.h.j.a.f606a;
    public static final a g = new a();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f670a = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f671a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f672b;

        /* renamed from: c  reason: collision with root package name */
        public final int f673c;
        public final int d;

        public b(int i, Class<T> cls, int i2) {
            this.f671a = i;
            this.f672b = cls;
            this.d = 0;
            this.f673c = i2;
        }

        public b(int i, Class<T> cls, int i2, int i3) {
            this.f671a = i;
            this.f672b = cls;
            this.d = i2;
            this.f673c = i3;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t);

        public T d(View view) {
            if (Build.VERSION.SDK_INT >= this.f673c) {
                return b(view);
            }
            T t = (T) view.getTag(this.f671a);
            if (!this.f672b.isInstance(t)) {
                return null;
            }
            return t;
        }

        public void e(View view, T t) {
            if (Build.VERSION.SDK_INT >= this.f673c) {
                c(view, t);
            } else if (!f(d(view), t)) {
            } else {
                a.h.j.c d = w.d(view);
                if (d == null) {
                    d = new a.h.j.c();
                }
                w.p(view, d);
                view.setTag(this.f671a, t);
                w.j(view, this.d);
            }
        }

        public abstract boolean f(T t, T t2);
    }

    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        public static void s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i) {
            view.setLabelFor(i);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i) {
            view.setLayoutDirection(i);
        }

        public static void k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        public static void f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public b0 f674a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f675b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a.h.j.o f676c;

            public a(View view, a.h.j.o oVar) {
                this.f675b = view;
                this.f676c = oVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                b0 j = b0.j(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    i.a(windowInsets, this.f675b);
                    if (j.equals(this.f674a)) {
                        return this.f676c.a(view, j).h();
                    }
                }
                this.f674a = j;
                b0 a2 = this.f676c.a(view, j);
                if (i >= 30) {
                    return a2.h();
                }
                AtomicInteger atomicInteger = w.f667a;
                h.c(view);
                return a2.h();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static b0 b(View view, b0 b0Var, Rect rect) {
            WindowInsets h = b0Var.h();
            if (h != null) {
                return b0.j(view.computeSystemWindowInsets(h, rect), view);
            }
            rect.setEmpty();
            return b0Var;
        }

        public static boolean c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        public static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static b0 j(View view) {
            if (!b0.a.d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = b0.a.f610a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) b0.a.f611b.get(obj);
                Rect rect2 = (Rect) b0.a.f612c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                int i = Build.VERSION.SDK_INT;
                b0.e dVar = i >= 30 ? new b0.d() : i >= 29 ? new b0.c() : new b0.b();
                dVar.b(a.h.d.b.b(rect.left, rect.top, rect.right, rect.bottom));
                dVar.c(a.h.d.b.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                b0 a2 = dVar.a();
                a2.f609a.p(a2);
                a2.f609a.d(view.getRootView());
                return a2;
            } catch (IllegalAccessException e) {
                StringBuilder f = b.a.a.a.a.f("Failed to get insets from AttachInfo. ");
                f.append(e.getMessage());
                Log.w("WindowInsetsCompat", f.toString(), e);
                return null;
            }
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(View view, a.h.j.o oVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, oVar);
            }
            if (oVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, oVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public static int a(View view) {
            return view.getScrollIndicators();
        }

        public static void b(View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void c(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public static void a(View view, final q qVar) {
            a.e.h hVar = (a.e.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null) {
                hVar = new a.e.h();
                view.setTag(R.id.tag_unhandled_key_listeners, hVar);
            }
            Objects.requireNonNull(qVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: a.h.j.b
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return w.q.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            hVar.put(qVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            a.e.h hVar = (a.e.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.getOrDefault(qVar, null)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* loaded from: classes.dex */
    public static class m {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* loaded from: classes.dex */
    public static class n {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static a.h.j.e b(View view, a.h.j.e eVar) {
            ContentInfo d = eVar.f643a.d();
            ContentInfo performReceiveContent = view.performReceiveContent(d);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == d ? eVar : new a.h.j.e(new e.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, a.h.j.p pVar) {
            if (pVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(pVar));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class p implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final a.h.j.p f677a;

        public p(a.h.j.p pVar) {
            this.f677a = pVar;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            a.h.j.e eVar = new a.h.j.e(new e.d(contentInfo));
            a.h.j.e a2 = this.f677a.a(view, eVar);
            if (a2 == null) {
                return null;
            }
            return a2 == eVar ? contentInfo : a2.f643a.d();
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    public static void a(View view, d.a aVar) {
        a.h.j.c d2 = d(view);
        if (d2 == null) {
            d2 = new a.h.j.c();
        }
        p(view, d2);
        m(aVar.a(), view);
        g(view).add(aVar);
        j(view, 0);
    }

    public static x b(View view) {
        if (f668b == null) {
            f668b = new WeakHashMap<>();
        }
        x xVar = f668b.get(view);
        if (xVar == null) {
            x xVar2 = new x(view);
            f668b.put(view, xVar2);
            return xVar2;
        }
        return xVar;
    }

    public static b0 c(View view, b0 b0Var) {
        WindowInsets h2 = b0Var.h();
        if (h2 != null) {
            WindowInsets a2 = h.a(view, h2);
            if (!a2.equals(h2)) {
                return b0.j(a2, view);
            }
        }
        return b0Var;
    }

    public static a.h.j.c d(View view) {
        View.AccessibilityDelegate e2 = e(view);
        if (e2 == null) {
            return null;
        }
        return e2 instanceof c.a ? ((c.a) e2).f623a : new a.h.j.c(e2);
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.a(view);
        }
        if (d) {
            return null;
        }
        if (f669c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f669c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                d = true;
                return null;
            }
        }
        Object obj = f669c.get(view);
        if (!(obj instanceof View.AccessibilityDelegate)) {
            return null;
        }
        return (View.AccessibilityDelegate) obj;
    }

    public static CharSequence f(View view) {
        return new t(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).d(view);
    }

    public static List<d.a> g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] h(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static b0 i(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        b0 i2 = b0.i(rootWindowInsets);
        i2.f609a.p(i2);
        i2.f609a.d(view.getRootView());
        return i2;
    }

    public static void j(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        boolean z = f(view) != null && view.getVisibility() == 0;
        int i3 = 32;
        if (g.a(view) != 0 || z) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            if (!z) {
                i3 = 2048;
            }
            obtain.setEventType(i3);
            g.g(obtain, i2);
            if (z) {
                obtain.getText().add(f(view));
                if (d.c(view) == 0) {
                    d.s(view, 1);
                }
                ViewParent parent = view.getParent();
                while (true) {
                    if (!(parent instanceof View)) {
                        break;
                    } else if (d.c((View) parent) == 4) {
                        d.s(view, 2);
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            view.sendAccessibilityEventUnchecked(obtain);
        } else if (i2 == 32) {
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            g.g(obtain2, i2);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        } else if (view.getParent() == null) {
        } else {
            try {
                g.e(view.getParent(), view, view, i2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
            }
        }
    }

    public static b0 k(View view, b0 b0Var) {
        WindowInsets h2 = b0Var.h();
        if (h2 != null) {
            WindowInsets b2 = h.b(view, h2);
            if (!b2.equals(h2)) {
                return b0.j(b2, view);
            }
        }
        return b0Var;
    }

    public static a.h.j.e l(View view, a.h.j.e eVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + eVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, eVar);
        }
        a.h.j.p pVar = (a.h.j.p) view.getTag(R.id.tag_on_receive_content_listener);
        if (pVar == null) {
            return (view instanceof a.h.j.q ? (a.h.j.q) view : f).a(eVar);
        }
        a.h.j.e a2 = pVar.a(view, eVar);
        if (a2 == null) {
            return null;
        }
        return (view instanceof a.h.j.q ? (a.h.j.q) view : f).a(a2);
    }

    public static void m(int i2, View view) {
        List<d.a> g2 = g(view);
        for (int i3 = 0; i3 < g2.size(); i3++) {
            if (g2.get(i3).a() == i2) {
                g2.remove(i3);
                return;
            }
        }
    }

    public static void n(View view, d.a aVar, CharSequence charSequence, a.h.j.d0.f fVar) {
        a(view, new d.a(null, aVar.f637b, null, fVar, aVar.f638c));
    }

    public static void o(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.c(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static void p(View view, a.h.j.c cVar) {
        if (cVar == null && (e(view) instanceof c.a)) {
            cVar = new a.h.j.c();
        }
        view.setAccessibilityDelegate(cVar == null ? null : cVar.f622b);
    }

    public static void q(View view, CharSequence charSequence) {
        new t(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).e(view, charSequence);
        if (charSequence != null) {
            a aVar = g;
            aVar.f670a.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (!g.b(view)) {
                return;
            }
            view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            return;
        }
        a aVar2 = g;
        aVar2.f670a.remove(view);
        view.removeOnAttachStateChangeListener(aVar2);
        d.o(view.getViewTreeObserver(), aVar2);
    }
}
