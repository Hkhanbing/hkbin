package a.h.j.d0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f641a;

    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final e f642a;

        public a(e eVar) {
            this.f642a = eVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            d a2 = this.f642a.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.f633a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            Objects.requireNonNull(this.f642a);
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f642a.c(i, i2, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(e eVar) {
            super(eVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            d b2 = this.f642a.b(i);
            if (b2 == null) {
                return null;
            }
            return b2.f633a;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public c(e eVar) {
            super(eVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.f642a);
        }
    }

    public e() {
        this.f641a = new c(this);
    }

    public e(Object obj) {
        this.f641a = obj;
    }

    public d a(int i) {
        return null;
    }

    public d b(int i) {
        return null;
    }

    public boolean c(int i, int i2, Bundle bundle) {
        return false;
    }
}
