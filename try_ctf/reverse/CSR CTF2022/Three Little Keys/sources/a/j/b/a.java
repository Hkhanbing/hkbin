package a.j.b;

import a.e.i;
import a.h.j.w;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a extends a.h.j.c {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final a.j.b.b<a.h.j.d0.d> o = new C0021a();
    public static final a.j.b.c<i<a.h.j.d0.d>, a.h.j.d0.d> p = new b();
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    /* renamed from: a.j.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0021a implements a.j.b.b<a.h.j.d0.d> {
        public void a(Object obj, Rect rect) {
            ((a.h.j.d0.d) obj).f633a.getBoundsInParent(rect);
        }
    }

    /* loaded from: classes.dex */
    public class b implements a.j.b.c<i<a.h.j.d0.d>, a.h.j.d0.d> {
    }

    /* loaded from: classes.dex */
    public class c extends a.h.j.d0.e {
        public c() {
        }

        @Override // a.h.j.d0.e
        public a.h.j.d0.d a(int i) {
            return new a.h.j.d0.d(AccessibilityNodeInfo.obtain(a.this.o(i).f633a));
        }

        @Override // a.h.j.d0.e
        public a.h.j.d0.d b(int i) {
            int i2 = i == 2 ? a.this.k : a.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return new a.h.j.d0.d(AccessibilityNodeInfo.obtain(a.this.o(i2).f633a));
        }

        @Override // a.h.j.d0.e
        public boolean c(int i, int i2, Bundle bundle) {
            int i3;
            a aVar = a.this;
            if (i == -1) {
                View view = aVar.i;
                AtomicInteger atomicInteger = w.f667a;
                return w.d.j(view, i2, bundle);
            }
            boolean z = true;
            if (i2 == 1) {
                return aVar.r(i);
            }
            if (i2 == 2) {
                return aVar.k(i);
            }
            if (i2 != 64) {
                return i2 != 128 ? aVar.p(i, i2, bundle) : aVar.j(i);
            }
            if (!aVar.h.isEnabled() || !aVar.h.isTouchExplorationEnabled() || (i3 = aVar.k) == i) {
                z = false;
            } else {
                if (i3 != Integer.MIN_VALUE) {
                    aVar.j(i3);
                }
                aVar.k = i;
                aVar.i.invalidate();
                aVar.s(i, 32768);
            }
            return z;
        }
    }

    public a(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            AtomicInteger atomicInteger = w.f667a;
            if (w.d.c(view) != 0) {
                return;
            }
            w.d.s(view, 1);
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // a.h.j.c
    public a.h.j.d0.e b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // a.h.j.c
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f621a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // a.h.j.c
    public void d(View view, a.h.j.d0.d dVar) {
        this.f621a.onInitializeAccessibilityNodeInfo(view, dVar.f633a);
        Chip.b bVar = (Chip.b) this;
        dVar.f633a.setCheckable(Chip.this.f());
        dVar.f633a.setClickable(Chip.this.isClickable());
        dVar.f633a.setClassName(Chip.this.getAccessibilityClassName());
        dVar.f633a.setText(Chip.this.getText());
    }

    public final boolean j(int i) {
        if (this.k == i) {
            this.k = Integer.MIN_VALUE;
            this.i.invalidate();
            s(i, 65536);
            return true;
        }
        return false;
    }

    public final boolean k(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.n = false;
            chip.refreshDrawableState();
        }
        s(i, 8);
        return true;
    }

    public final a.h.j.d0.d l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        a.h.j.d0.d dVar = new a.h.j.d0.d(obtain);
        obtain.setEnabled(true);
        dVar.f633a.setFocusable(true);
        dVar.f633a.setClassName("android.view.View");
        Rect rect = n;
        dVar.f633a.setBoundsInParent(rect);
        dVar.f633a.setBoundsInScreen(rect);
        View view = this.i;
        dVar.f634b = -1;
        dVar.f633a.setParent(view);
        q(i, dVar);
        if (dVar.g() == null && dVar.e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        dVar.f633a.getBoundsInParent(this.e);
        if (this.e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = dVar.f633a.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        int i2 = 128;
        if ((actions & 128) == 0) {
            dVar.f633a.setPackageName(this.i.getContext().getPackageName());
            View view2 = this.i;
            dVar.f635c = i;
            dVar.f633a.setSource(view2, i);
            boolean z = false;
            if (this.k == i) {
                dVar.f633a.setAccessibilityFocused(true);
                accessibilityNodeInfo = dVar.f633a;
            } else {
                dVar.f633a.setAccessibilityFocused(false);
                accessibilityNodeInfo = dVar.f633a;
                i2 = 64;
            }
            accessibilityNodeInfo.addAction(i2);
            boolean z2 = this.l == i;
            if (z2) {
                dVar.f633a.addAction(2);
            } else if (dVar.f633a.isFocusable()) {
                dVar.f633a.addAction(1);
            }
            dVar.f633a.setFocused(z2);
            this.i.getLocationOnScreen(this.g);
            dVar.f633a.getBoundsInScreen(this.d);
            if (this.d.equals(rect)) {
                dVar.f633a.getBoundsInParent(this.d);
                if (dVar.f634b != -1) {
                    a.h.j.d0.d dVar2 = new a.h.j.d0.d(AccessibilityNodeInfo.obtain());
                    for (int i3 = dVar.f634b; i3 != -1; i3 = dVar2.f634b) {
                        View view3 = this.i;
                        dVar2.f634b = -1;
                        dVar2.f633a.setParent(view3, -1);
                        dVar2.f633a.setBoundsInParent(n);
                        q(i3, dVar2);
                        dVar2.f633a.getBoundsInParent(this.e);
                        Rect rect2 = this.d;
                        Rect rect3 = this.e;
                        rect2.offset(rect3.left, rect3.top);
                    }
                    dVar2.f633a.recycle();
                }
                this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            }
            if (this.i.getLocalVisibleRect(this.f)) {
                this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                if (this.d.intersect(this.f)) {
                    dVar.f633a.setBoundsInScreen(this.d);
                    Rect rect4 = this.d;
                    if (rect4 != null && !rect4.isEmpty() && this.i.getWindowVisibility() == 0) {
                        View view4 = this.i;
                        while (true) {
                            ViewParent parent = view4.getParent();
                            if (parent instanceof View) {
                                view4 = (View) parent;
                                if (view4.getAlpha() <= 0.0f) {
                                    break;
                                } else if (view4.getVisibility() != 0) {
                                    break;
                                }
                            } else if (parent != null) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        dVar.f633a.setVisibleToUser(true);
                    }
                }
            }
            return dVar;
        }
        throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    public abstract void m(List<Integer> list);

    /* JADX WARN: Code restructure failed: missing block: B:68:0x013c, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.b.a.n(int, android.graphics.Rect):boolean");
    }

    public a.h.j.d0.d o(int i) {
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.i);
            a.h.j.d0.d dVar = new a.h.j.d0.d(obtain);
            View view = this.i;
            AtomicInteger atomicInteger = w.f667a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            m(arrayList);
            if (dVar.f633a.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                dVar.f633a.addChild(this.i, ((Integer) arrayList.get(i2)).intValue());
            }
            return dVar;
        }
        return l(i);
    }

    public abstract boolean p(int i, int i2, Bundle bundle);

    public abstract void q(int i, a.h.j.d0.d dVar);

    public final boolean r(int i) {
        int i2;
        if ((this.i.isFocused() || this.i.requestFocus()) && (i2 = this.l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                k(i2);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            this.l = i;
            Chip.b bVar = (Chip.b) this;
            if (i == 1) {
                Chip chip = Chip.this;
                chip.n = true;
                chip.refreshDrawableState();
            }
            s(i, 8);
            return true;
        }
        return false;
    }

    public final boolean s(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            a.h.j.d0.d o2 = o(i);
            obtain.getText().add(o2.g());
            obtain.setContentDescription(o2.e());
            obtain.setScrollable(o2.f633a.isScrollable());
            obtain.setPassword(o2.f633a.isPassword());
            obtain.setEnabled(o2.f633a.isEnabled());
            obtain.setChecked(o2.f633a.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(o2.f633a.getClassName());
            obtain.setSource(this.i, i);
            obtain.setPackageName(this.i.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            this.i.onInitializeAccessibilityEvent(obtain);
        }
        return parent.requestSendAccessibilityEvent(this.i, obtain);
    }
}
