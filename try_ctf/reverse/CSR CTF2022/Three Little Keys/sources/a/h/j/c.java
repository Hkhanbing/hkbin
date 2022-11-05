package a.h.j;

import a.h.j.d0.d;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f620c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f621a;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f622b;

    /* loaded from: classes.dex */
    public static final class a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final c f623a;

        public a(c cVar) {
            this.f623a = cVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f623a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            a.h.j.d0.e b2 = this.f623a.b(view);
            if (b2 != null) {
                return (AccessibilityNodeProvider) b2.f641a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f623a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            a.h.j.d0.d dVar = new a.h.j.d0.d(accessibilityNodeInfo);
            AtomicInteger atomicInteger = w.f667a;
            Boolean d = new s(R.id.tag_screen_reader_focusable, Boolean.class, 28).d(view);
            boolean z = true;
            dVar.f633a.setScreenReaderFocusable(d != null && d.booleanValue());
            Boolean d2 = new v(R.id.tag_accessibility_heading, Boolean.class, 28).d(view);
            dVar.f633a.setHeading(d2 != null && d2.booleanValue());
            dVar.f633a.setPaneTitle(w.f(view));
            CharSequence d3 = new u(R.id.tag_state_description, CharSequence.class, 64, 30).d(view);
            if (Build.VERSION.SDK_INT < 30) {
                z = false;
            }
            if (z) {
                dVar.f633a.setStateDescription(d3);
            } else {
                dVar.f633a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", d3);
            }
            this.f623a.d(view, dVar);
            accessibilityNodeInfo.getText();
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i = 0; i < list.size(); i++) {
                dVar.a((d.a) list.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f623a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f623a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f623a.g(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f623a.h(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f623a.i(view, accessibilityEvent);
        }
    }

    public c() {
        this.f621a = f620c;
        this.f622b = new a(this);
    }

    public c(View.AccessibilityDelegate accessibilityDelegate) {
        this.f621a = accessibilityDelegate;
        this.f622b = new a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f621a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public a.h.j.d0.e b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f621a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new a.h.j.d0.e(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f621a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, a.h.j.d0.d dVar) {
        this.f621a.onInitializeAccessibilityNodeInfo(view, dVar.f633a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f621a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f621a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 2131296680(0x7f0901a8, float:1.8211284E38)
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lf
            java.util.List r0 = java.util.Collections.emptyList()
        Lf:
            r1 = 0
            r2 = r1
        L11:
            int r3 = r0.size()
            if (r2 >= r3) goto L70
            java.lang.Object r3 = r0.get(r2)
            a.h.j.d0.d$a r3 = (a.h.j.d0.d.a) r3
            int r4 = r3.a()
            if (r4 != r10) goto L6d
            a.h.j.d0.f r0 = r3.d
            if (r0 == 0) goto L70
            r0 = 0
            java.lang.Class<? extends a.h.j.d0.f$a> r2 = r3.f638c
            if (r2 == 0) goto L66
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L40
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L40
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L40
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.Exception -> L40
            a.h.j.d0.f$a r2 = (a.h.j.d0.f.a) r2     // Catch: java.lang.Exception -> L40
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L3e
            goto L65
        L3e:
            r0 = move-exception
            goto L44
        L40:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L44:
            java.lang.Class<? extends a.h.j.d0.f$a> r4 = r3.f638c
            if (r4 != 0) goto L4b
            java.lang.String r4 = "null"
            goto L4f
        L4b:
            java.lang.String r4 = r4.getName()
        L4f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r0)
        L65:
            r0 = r2
        L66:
            a.h.j.d0.f r2 = r3.d
            boolean r0 = r2.a(r9, r0)
            goto L71
        L6d:
            int r2 = r2 + 1
            goto L11
        L70:
            r0 = r1
        L71:
            if (r0 != 0) goto L79
            android.view.View$AccessibilityDelegate r0 = r8.f621a
            boolean r0 = r0.performAccessibilityAction(r9, r10, r11)
        L79:
            if (r0 != 0) goto Lca
            r2 = 2131296271(0x7f09000f, float:1.8210454E38)
            if (r10 != r2) goto Lca
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            r11 = 2131296681(0x7f0901a9, float:1.8211286E38)
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto Lc9
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto Lc9
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto Lc2
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = a.h.j.d0.d.d(r11)
            r2 = r1
        Lb0:
            if (r11 == 0) goto Lc2
            int r3 = r11.length
            if (r2 >= r3) goto Lc2
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto Lbf
            r11 = r0
            goto Lc3
        Lbf:
            int r2 = r2 + 1
            goto Lb0
        Lc2:
            r11 = r1
        Lc3:
            if (r11 == 0) goto Lc9
            r10.onClick(r9)
            r1 = r0
        Lc9:
            r0 = r1
        Lca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.j.c.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public void h(View view, int i) {
        this.f621a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f621a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
