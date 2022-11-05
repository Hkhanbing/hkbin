package a.f.c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a  reason: collision with root package name */
    public int[] f448a;

    /* renamed from: b  reason: collision with root package name */
    public int f449b;

    /* renamed from: c  reason: collision with root package name */
    public Context f450c;
    public a.f.a.i.g d;
    public String e;
    public String f;
    public View[] g;
    public HashMap<Integer, String> h;

    public b(Context context) {
        super(context);
        this.f448a = new int[32];
        this.g = null;
        this.h = new HashMap<>();
        this.f450c = context;
        i(null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f448a = new int[32];
        this.g = null;
        this.h = new HashMap<>();
        this.f450c = context;
        i(attributeSet);
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f450c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout2 != null) {
            Object c2 = constraintLayout2.c(0, trim);
            if (c2 instanceof Integer) {
                i = ((Integer) c2).intValue();
            }
        }
        if (i == 0 && constraintLayout2 != null) {
            i = h(constraintLayout2, trim);
        }
        if (i == 0) {
            try {
                i = h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            i = this.f450c.getResources().getIdentifier(trim, "id", this.f450c.getPackageName());
        }
        if (i != 0) {
            this.h.put(Integer.valueOf(i), trim);
            d(i);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void d(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f449b + 1;
        int[] iArr = this.f448a;
        if (i2 > iArr.length) {
            this.f448a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f448a;
        int i3 = this.f449b;
        iArr2[i3] = i;
        this.f449b = i3 + 1;
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.f450c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = null;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        }
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    StringBuilder f = b.a.a.a.a.f("to use ConstraintTag view ");
                    f.append(childAt.getClass().getSimpleName());
                    f.append(" must have an ID");
                    Log.w("ConstraintHelper", f.toString());
                } else {
                    d(childAt.getId());
                }
            }
        }
    }

    public void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f449b; i++) {
            View d = constraintLayout.d(this.f448a[i]);
            if (d != null) {
                d.setVisibility(visibility);
                if (elevation > 0.0f) {
                    d.setTranslationZ(d.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f448a, this.f449b);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f450c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f486b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(a.f.a.i.d dVar, boolean z) {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
        if (this.d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.a)) {
            return;
        }
        ((ConstraintLayout.a) layoutParams).q0 = (a.f.a.i.d) this.d;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f449b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f449b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                e(str.substring(i));
                return;
            } else {
                e(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.e = null;
        this.f449b = 0;
        for (int i : iArr) {
            d(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.e == null) {
            d(i);
        }
    }
}
