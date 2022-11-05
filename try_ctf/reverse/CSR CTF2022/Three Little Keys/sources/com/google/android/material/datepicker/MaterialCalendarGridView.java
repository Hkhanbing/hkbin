package com.google.android.material.datepicker;

import a.h.i.b;
import a.h.j.w;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import b.b.a.a.a;
import b.b.a.a.m.b0;
import b.b.a.a.m.c;
import b.b.a.a.m.d;
import b.b.a.a.m.n;
import b.b.a.a.m.o;
import b.b.a.a.m.u;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f1722a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1723b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1722a = b0.e();
        if (o.y0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f1723b = o.z0(getContext(), R.attr.nestedScrollable);
        w.p(this, new n(this));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a */
    public u getAdapter2() {
        return (u) super.getAdapter();
    }

    public final View b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a2;
        int width;
        int a3;
        int width2;
        int width3;
        int i;
        int right;
        int right2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        u adapter2 = getAdapter2();
        d<?> dVar = adapter2.f1497b;
        c cVar = adapter2.d;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.d(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<b<Long, Long>> it = dVar.g().iterator();
        while (it.hasNext()) {
            b<Long, Long> next = it.next();
            Long l = next.f601a;
            if (l == null) {
                materialCalendarGridView = this;
            } else if (next.f602b != null) {
                long longValue = l.longValue();
                long longValue2 = next.f602b.longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (!(item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue())) {
                    boolean o = a.o(this);
                    if (longValue < item.longValue()) {
                        if (max % adapter2.f1496a.d == 0) {
                            right2 = 0;
                        } else {
                            View b2 = materialCalendarGridView.b(max - 1);
                            right2 = !o ? b2.getRight() : b2.getLeft();
                        }
                        width = right2;
                        a2 = max;
                    } else {
                        materialCalendarGridView.f1722a.setTimeInMillis(longValue);
                        a2 = adapter2.a(materialCalendarGridView.f1722a.get(5));
                        View b3 = materialCalendarGridView.b(a2);
                        width = (b3.getWidth() / 2) + b3.getLeft();
                    }
                    if (longValue2 > item2.longValue()) {
                        if ((min + 1) % adapter2.f1496a.d == 0) {
                            right = getWidth();
                        } else {
                            View b4 = materialCalendarGridView.b(min);
                            right = !o ? b4.getRight() : b4.getLeft();
                        }
                        width2 = right;
                        a3 = min;
                    } else {
                        materialCalendarGridView.f1722a.setTimeInMillis(longValue2);
                        a3 = adapter2.a(materialCalendarGridView.f1722a.get(5));
                        View b5 = materialCalendarGridView.b(a3);
                        width2 = (b5.getWidth() / 2) + b5.getLeft();
                    }
                    int itemId = (int) adapter2.getItemId(a2);
                    int i2 = max;
                    int i3 = min;
                    int itemId2 = (int) adapter2.getItemId(a3);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View b6 = materialCalendarGridView.b(numColumns);
                        int top = b6.getTop() + cVar.f1458a.f1454a.top;
                        u uVar = adapter2;
                        int bottom = b6.getBottom() - cVar.f1458a.f1454a.bottom;
                        if (!o) {
                            i = numColumns > a2 ? 0 : width;
                            width3 = a3 > numColumns2 ? getWidth() : width2;
                        } else {
                            int i4 = a3 > numColumns2 ? 0 : width2;
                            width3 = numColumns > a2 ? getWidth() : width;
                            i = i4;
                        }
                        canvas.drawRect(i, top, width3, bottom, cVar.h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter2 = uVar;
                    }
                    materialCalendarGridView = this;
                    max = i2;
                    min = i3;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        int b2;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            b2 = getAdapter2().d();
        } else if (i != 130) {
            super.onFocusChanged(true, i, rect);
            return;
        } else {
            b2 = getAdapter2().b();
        }
        setSelection(b2);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter2().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f1723b) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof u) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), u.class.getCanonicalName()));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().b()) {
            i = getAdapter2().b();
        }
        super.setSelection(i);
    }
}
