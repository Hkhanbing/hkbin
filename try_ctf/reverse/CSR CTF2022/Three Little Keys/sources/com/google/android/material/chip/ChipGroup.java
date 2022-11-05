package com.google.android.material.chip;

import a.h.j.d0.d;
import a.h.j.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import b.b.a.a.r.g;
import b.b.a.a.r.n;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ChipGroup extends g {
    public int e;
    public int f;
    public d g;
    public final b.b.a.a.r.b<Chip> h;
    public final int i;
    public final e j;

    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f1718a;

        public a(c cVar) {
            this.f1718a = cVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public b(int i, int i2) {
            super(i, i2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c {
        void a(ChipGroup chipGroup, int i);
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f1720a;

        public e(b.b.a.a.k.d dVar) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    AtomicInteger atomicInteger = w.f667a;
                    view2.setId(w.e.a());
                }
                b.b.a.a.r.b<Chip> bVar = ChipGroup.this.h;
                Chip chip = (Chip) view2;
                bVar.f1527a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    bVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new b.b.a.a.r.a(bVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f1720a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                b.b.a.a.r.b<Chip> bVar = chipGroup.h;
                Chip chip = (Chip) view2;
                Objects.requireNonNull(bVar);
                chip.setInternalOnCheckedChangeListener(null);
                bVar.f1527a.remove(Integer.valueOf(chip.getId()));
                bVar.f1528b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f1720a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(b.b.a.a.a0.a.a.a(context, attributeSet, R.attr.chipGroupStyle, 2131821514), attributeSet, R.attr.chipGroupStyle);
        b.b.a.a.r.b<Chip> bVar = new b.b.a.a.r.b<>();
        this.h = bVar;
        e eVar = new e(null);
        this.j = eVar;
        TypedArray d2 = n.d(getContext(), attributeSet, b.b.a.a.b.d, R.attr.chipGroupStyle, 2131821514, new int[0]);
        int dimensionPixelOffset = d2.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d2.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d2.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d2.getBoolean(5, false));
        setSingleSelection(d2.getBoolean(6, false));
        setSelectionRequired(d2.getBoolean(4, false));
        this.i = d2.getResourceId(0, -1);
        d2.recycle();
        bVar.f1529c = new b.b.a.a.k.d(this);
        super.setOnHierarchyChangeListener(eVar);
        AtomicInteger atomicInteger = w.f667a;
        w.d.s(this, 1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    @Override // b.b.a.a.r.g
    public boolean a() {
        return this.f1538c;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getCheckedChipId() {
        return this.h.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.h.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.e;
    }

    public int getChipSpacingVertical() {
        return this.f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            b.b.a.a.r.b<Chip> bVar = this.h;
            Chip chip = bVar.f1527a.get(Integer.valueOf(i));
            if (chip == null || !bVar.a(chip)) {
                return;
            }
            bVar.d();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.b.a(getRowCount(), this.f1538c ? getChipCount() : -1, false, this.h.d ? 1 : 2).f639a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.e != i) {
            this.e = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f != i) {
            this.f = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.g = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j.f1720a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.h.e = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // b.b.a.a.r.g
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        b.b.a.a.r.b<Chip> bVar = this.h;
        if (bVar.d != z) {
            bVar.d = z;
            boolean z2 = !bVar.f1528b.isEmpty();
            for (Chip chip : bVar.f1527a.values()) {
                bVar.e(chip, false);
            }
            if (!z2) {
                return;
            }
            bVar.d();
        }
    }
}
