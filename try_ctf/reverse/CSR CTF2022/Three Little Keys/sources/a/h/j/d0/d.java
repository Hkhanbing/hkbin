package a.h.j.d0;

import a.h.j.d0.f;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f633a;

    /* renamed from: b  reason: collision with root package name */
    public int f634b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f635c = -1;

    /* loaded from: classes.dex */
    public static class a {
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;

        /* renamed from: a  reason: collision with root package name */
        public final Object f636a;

        /* renamed from: b  reason: collision with root package name */
        public final int f637b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends f.a> f638c;
        public final f d;

        static {
            new AccessibilityNodeInfo.AccessibilityAction(1, null);
            new AccessibilityNodeInfo.AccessibilityAction(2, null);
            new AccessibilityNodeInfo.AccessibilityAction(4, null);
            new AccessibilityNodeInfo.AccessibilityAction(8, null);
            e = new a(16, null);
            new AccessibilityNodeInfo.AccessibilityAction(32, null);
            new AccessibilityNodeInfo.AccessibilityAction(64, null);
            new AccessibilityNodeInfo.AccessibilityAction(128, null);
            new AccessibilityNodeInfo.AccessibilityAction(256, null);
            new AccessibilityNodeInfo.AccessibilityAction(512, null);
            new AccessibilityNodeInfo.AccessibilityAction(1024, null);
            new AccessibilityNodeInfo.AccessibilityAction(2048, null);
            f = new a(4096, null);
            g = new a(8192, null);
            new AccessibilityNodeInfo.AccessibilityAction(16384, null);
            new AccessibilityNodeInfo.AccessibilityAction(32768, null);
            new AccessibilityNodeInfo.AccessibilityAction(65536, null);
            new AccessibilityNodeInfo.AccessibilityAction(131072, null);
            h = new a(262144, null);
            i = new a(524288, null);
            j = new a(1048576, null);
            new AccessibilityNodeInfo.AccessibilityAction(2097152, null);
            int i2 = Build.VERSION.SDK_INT;
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908342, null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908343, null);
            }
            k = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908345, null);
            }
            l = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908347, null);
            }
            if ((i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908358, null);
            }
            if ((i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908359, null);
            }
            if ((i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908360, null);
            }
            if ((i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908361, null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908348, null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908349, null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908354, null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908356, null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908357, null);
            }
            if ((i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908362, null);
            }
            if ((i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908372, null);
            }
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, null, null, null);
        }

        public a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f637b = i2;
            this.d = fVar;
            this.f636a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
            this.f638c = cls;
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f636a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f636a).getLabel();
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                Object obj2 = this.f636a;
                Object obj3 = ((a) obj).f636a;
                return obj2 == null ? obj3 == null : obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f636a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f639a;

        public b(Object obj) {
            this.f639a = obj;
        }

        public static b a(int i, int i2, boolean z, int i3) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f640a;

        public c(Object obj) {
            this.f640a = obj;
        }

        public static c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f633a = accessibilityNodeInfo;
    }

    public static String c(int i) {
        if (i != 1) {
            if (i == 2) {
                return "ACTION_CLEAR_FOCUS";
            }
            switch (i) {
                case 4:
                    return "ACTION_SELECT";
                case 8:
                    return "ACTION_CLEAR_SELECTION";
                case 16:
                    return "ACTION_CLICK";
                case 32:
                    return "ACTION_LONG_CLICK";
                case 64:
                    return "ACTION_ACCESSIBILITY_FOCUS";
                case 128:
                    return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                case 256:
                    return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                case 512:
                    return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                case 1024:
                    return "ACTION_NEXT_HTML_ELEMENT";
                case 2048:
                    return "ACTION_PREVIOUS_HTML_ELEMENT";
                case 4096:
                    return "ACTION_SCROLL_FORWARD";
                case 8192:
                    return "ACTION_SCROLL_BACKWARD";
                case 16384:
                    return "ACTION_COPY";
                case 32768:
                    return "ACTION_PASTE";
                case 65536:
                    return "ACTION_CUT";
                case 131072:
                    return "ACTION_SET_SELECTION";
                case 262144:
                    return "ACTION_EXPAND";
                case 524288:
                    return "ACTION_COLLAPSE";
                case 2097152:
                    return "ACTION_SET_TEXT";
                case 16908354:
                    return "ACTION_MOVE_WINDOW";
                case 16908372:
                    return "ACTION_IME_ENTER";
                default:
                    switch (i) {
                        case 16908342:
                            return "ACTION_SHOW_ON_SCREEN";
                        case 16908343:
                            return "ACTION_SCROLL_TO_POSITION";
                        case 16908344:
                            return "ACTION_SCROLL_UP";
                        case 16908345:
                            return "ACTION_SCROLL_LEFT";
                        case 16908346:
                            return "ACTION_SCROLL_DOWN";
                        case 16908347:
                            return "ACTION_SCROLL_RIGHT";
                        case 16908348:
                            return "ACTION_CONTEXT_CLICK";
                        case 16908349:
                            return "ACTION_SET_PROGRESS";
                        default:
                            switch (i) {
                                case 16908356:
                                    return "ACTION_SHOW_TOOLTIP";
                                case 16908357:
                                    return "ACTION_HIDE_TOOLTIP";
                                case 16908358:
                                    return "ACTION_PAGE_UP";
                                case 16908359:
                                    return "ACTION_PAGE_DOWN";
                                case 16908360:
                                    return "ACTION_PAGE_LEFT";
                                case 16908361:
                                    return "ACTION_PAGE_RIGHT";
                                case 16908362:
                                    return "ACTION_PRESS_AND_HOLD";
                                default:
                                    return "ACTION_UNKNOWN";
                            }
                    }
            }
        }
        return "ACTION_FOCUS";
    }

    public static ClickableSpan[] d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void a(a aVar) {
        this.f633a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f636a);
    }

    public final List<Integer> b(String str) {
        ArrayList<Integer> integerArrayList = this.f633a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f633a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public CharSequence e() {
        return this.f633a.getContentDescription();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f633a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f633a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f633a)) {
            return false;
        }
        return this.f635c == dVar.f635c && this.f634b == dVar.f634b;
    }

    public Bundle f() {
        return this.f633a.getExtras();
    }

    public CharSequence g() {
        if (!b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List<Integer> b2 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> b3 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> b4 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> b5 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f633a.getText(), 0, this.f633a.getText().length()));
            for (int i = 0; i < b2.size(); i++) {
                spannableString.setSpan(new a.h.j.d0.a(b5.get(i).intValue(), this, f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), b2.get(i).intValue(), b3.get(i).intValue(), b4.get(i).intValue());
            }
            return spannableString;
        }
        return this.f633a.getText();
    }

    public void h(Object obj) {
        this.f633a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f639a);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f633a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(Object obj) {
        this.f633a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f640a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public String toString() {
        ?? emptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f633a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f633a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f633a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f633a.getClassName());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; contentDescription: ");
        sb.append(e());
        sb.append("; viewId: ");
        sb.append(this.f633a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f633a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f633a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f633a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f633a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f633a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f633a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f633a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f633a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f633a.isPassword());
        sb.append("; scrollable: " + this.f633a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f633a.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                emptyList.add(new a(actionList.get(i), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < emptyList.size(); i2++) {
            a aVar = (a) emptyList.get(i2);
            String c2 = c(aVar.a());
            if (c2.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                c2 = aVar.b().toString();
            }
            sb.append(c2);
            if (i2 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
