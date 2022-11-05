package com.google.android.material.internal;

import a.b.e.i.i;
import a.b.e.i.n;
import a.b.f.o0;
import a.h.j.c;
import a.h.j.d0.d;
import a.h.j.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b.b.a.a.r.h;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends h implements n.a {
    public static final int[] F = {16842912};
    public i A;
    public ColorStateList B;
    public boolean C;
    public Drawable D;
    public final c E;
    public int v;
    public boolean w;
    public boolean x;
    public final CheckedTextView y;
    public FrameLayout z;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
        }

        @Override // a.h.j.c
        public void d(View view, d dVar) {
            this.f621a.onInitializeAccessibilityNodeInfo(view, dVar.f633a);
            dVar.f633a.setCheckable(NavigationMenuItemView.this.x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.E = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.y = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        w.p(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.z == null) {
                this.z = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.z.removeAllViews();
            this.z.addView(view);
        }
    }

    @Override // a.b.e.i.n.a
    public void d(i iVar, int i) {
        o0.a aVar;
        int i2;
        StateListDrawable stateListDrawable;
        this.A = iVar;
        int i3 = iVar.f135a;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(F, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            AtomicInteger atomicInteger = w.f667a;
            w.d.q(this, stateListDrawable);
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.e);
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.q);
        setTooltipText(iVar.r);
        i iVar2 = this.A;
        if (iVar2.e != null || iVar2.getIcon() != null || this.A.getActionView() == null) {
            z = false;
        }
        if (z) {
            this.y.setVisibility(8);
            FrameLayout frameLayout = this.z;
            if (frameLayout == null) {
                return;
            }
            aVar = (o0.a) frameLayout.getLayoutParams();
            i2 = -1;
        } else {
            this.y.setVisibility(0);
            FrameLayout frameLayout2 = this.z;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (o0.a) frameLayout2.getLayoutParams();
            i2 = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i2;
        this.z.setLayoutParams(aVar);
    }

    @Override // a.b.e.i.n.a
    public i getItemData() {
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        i iVar = this.A;
        if (iVar != null && iVar.isCheckable() && this.A.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.x != z) {
            this.x = z;
            this.E.h(this.y, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.y.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.C) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.B);
            }
            int i = this.v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.w) {
            if (this.D == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = a.h.c.b.h.f515a;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.D = drawable2;
                if (drawable2 != null) {
                    int i2 = this.v;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.D;
        }
        this.y.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.y.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.B = colorStateList;
        this.C = colorStateList != null;
        i iVar = this.A;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.y.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.w = z;
    }

    public void setTextAppearance(int i) {
        this.y.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.y.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.y.setText(charSequence);
    }
}
