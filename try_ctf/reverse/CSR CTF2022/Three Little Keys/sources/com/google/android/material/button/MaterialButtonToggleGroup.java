package com.google.android.material.button;

import a.h.j.d0.d;
import a.h.j.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import b.b.a.a.r.n;
import b.b.a.a.w.j;
import com.google.android.material.button.MaterialButton;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final String k = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f1709a;

    /* renamed from: b  reason: collision with root package name */
    public final e f1710b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet<d> f1711c;
    public final Comparator<MaterialButton> d;
    public Integer[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final int i;
    public Set<Integer> j;

    /* loaded from: classes.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    /* loaded from: classes.dex */
    public class b extends a.h.j.c {
        public b() {
        }

        @Override // a.h.j.c
        public void d(View view, a.h.j.d0.d dVar) {
            this.f621a.onInitializeAccessibilityNodeInfo(view, dVar.f633a);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            String str = MaterialButtonToggleGroup.k;
            Objects.requireNonNull(materialButtonToggleGroup);
            int i = -1;
            if (view instanceof MaterialButton) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i2) == view) {
                        i = i3;
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i2) instanceof MaterialButton) && materialButtonToggleGroup.d(i2)) {
                            i3++;
                        }
                        i2++;
                    }
                }
            }
            dVar.i(d.c.a(0, 1, i, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static final b.b.a.a.w.c e = new b.b.a.a.w.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public b.b.a.a.w.c f1713a;

        /* renamed from: b  reason: collision with root package name */
        public b.b.a.a.w.c f1714b;

        /* renamed from: c  reason: collision with root package name */
        public b.b.a.a.w.c f1715c;
        public b.b.a.a.w.c d;

        public c(b.b.a.a.w.c cVar, b.b.a.a.w.c cVar2, b.b.a.a.w.c cVar3, b.b.a.a.w.c cVar4) {
            this.f1713a = cVar;
            this.f1714b = cVar3;
            this.f1715c = cVar4;
            this.d = cVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* loaded from: classes.dex */
    public class e implements MaterialButton.b {
        public e(a aVar) {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(b.b.a.a.a0.a.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131821528), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f1709a = new ArrayList();
        this.f1710b = new e(null);
        this.f1711c = new LinkedHashSet<>();
        this.d = new a();
        this.f = false;
        this.j = new HashSet();
        TypedArray d2 = n.d(getContext(), attributeSet, b.b.a.a.b.m, R.attr.materialButtonToggleGroupStyle, 2131821528, new int[0]);
        setSingleSelection(d2.getBoolean(2, false));
        this.i = d2.getResourceId(0, -1);
        this.h = d2.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d2.recycle();
        AtomicInteger atomicInteger = w.f667a;
        w.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (d(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && d(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            AtomicInteger atomicInteger = w.f667a;
            materialButton.setId(w.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f1710b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton c2 = c(i);
            int min = Math.min(c2.getStrokeWidth(), c(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            c2.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            return;
        }
        layoutParams3.setMarginEnd(0);
        layoutParams3.setMarginStart(0);
        layoutParams3.leftMargin = 0;
        layoutParams3.rightMargin = 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(k, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f1709a.add(new c(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f, shapeAppearanceModel.g));
        w.p(materialButton, new b());
    }

    public final void b(int i, boolean z) {
        if (i == -1) {
            String str = k;
            Log.e(str, "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.j);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (z || !hashSet.contains(Integer.valueOf(i))) {
            return;
        } else {
            if (!this.h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        e(hashSet);
    }

    public final MaterialButton c(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final boolean d(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(c(i), Integer.valueOf(i));
        }
        this.e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        Set<Integer> set2 = this.j;
        this.j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = c(i).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f = false;
            }
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean contains2 = set.contains(Integer.valueOf(id));
                Iterator<d> it = this.f1711c.iterator();
                while (it.hasNext()) {
                    it.next().a(this, id, contains2);
                }
            }
        }
        invalidate();
    }

    public void f() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton c2 = c(i);
            if (c2.getVisibility() != 8) {
                j shapeAppearanceModel = c2.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                j.b bVar = new j.b(shapeAppearanceModel);
                c cVar2 = this.f1709a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        if (z) {
                            if (b.b.a.a.a.o(this)) {
                                b.b.a.a.w.c cVar3 = c.e;
                                cVar = new c(cVar3, cVar3, cVar2.f1714b, cVar2.f1715c);
                            } else {
                                b.b.a.a.w.c cVar4 = cVar2.f1713a;
                                b.b.a.a.w.c cVar5 = cVar2.d;
                                b.b.a.a.w.c cVar6 = c.e;
                                cVar = new c(cVar4, cVar5, cVar6, cVar6);
                            }
                        } else {
                            b.b.a.a.w.c cVar7 = cVar2.f1713a;
                            b.b.a.a.w.c cVar8 = c.e;
                            cVar = new c(cVar7, cVar8, cVar2.f1714b, cVar8);
                        }
                    } else if (i != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (z) {
                        if (b.b.a.a.a.o(this)) {
                            b.b.a.a.w.c cVar9 = cVar2.f1713a;
                            b.b.a.a.w.c cVar10 = cVar2.d;
                            b.b.a.a.w.c cVar11 = c.e;
                            cVar = new c(cVar9, cVar10, cVar11, cVar11);
                        } else {
                            b.b.a.a.w.c cVar12 = c.e;
                            cVar = new c(cVar12, cVar12, cVar2.f1714b, cVar2.f1715c);
                        }
                    } else {
                        b.b.a.a.w.c cVar13 = c.e;
                        cVar = new c(cVar13, cVar2.d, cVar13, cVar2.f1715c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    bVar.c(0.0f);
                } else {
                    bVar.e = cVar2.f1713a;
                    bVar.h = cVar2.d;
                    bVar.f = cVar2.f1714b;
                    bVar.g = cVar2.f1715c;
                }
                c2.setShapeAppearanceModel(bVar.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.g || this.j.isEmpty()) {
            return -1;
        }
        return this.j.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = c(i).getId();
            if (this.j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.e;
        if (numArr == null || i2 >= numArr.length) {
            Log.w(k, "Child order wasn't updated");
            return i2;
        }
        return numArr[i2].intValue();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            e(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.b.a(1, getVisibleButtonCount(), false, this.g ? 1 : 2).f639a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        f();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f1709a.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setSelectionRequired(boolean z) {
        this.h = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.g != z) {
            this.g = z;
            e(new HashSet());
        }
    }
}
