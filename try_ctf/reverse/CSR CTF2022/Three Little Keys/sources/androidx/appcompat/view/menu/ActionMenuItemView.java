package androidx.appcompat.view.menu;

import a.b.e.i.g;
import a.b.e.i.i;
import a.b.e.i.n;
import a.b.e.i.p;
import a.b.f.d;
import a.b.f.f0;
import a.b.f.n0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes.dex */
public class ActionMenuItemView extends f0 implements n.a, View.OnClickListener, ActionMenuView.a {
    public i g;
    public CharSequence h;
    public Drawable i;
    public g.b j;
    public n0 k;
    public b l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;

    /* loaded from: classes.dex */
    public class a extends n0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // a.b.f.n0
        public p b() {
            d.a aVar;
            b bVar = ActionMenuItemView.this.l;
            if (bVar == null || (aVar = d.this.u) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // a.b.f.n0
        public boolean c() {
            p b2;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.j;
            return bVar != null && bVar.b(actionMenuItemView.g) && (b2 = b()) != null && b2.a();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.m = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b.b.f15c, 0, 0);
        this.o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.p = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return c() && this.g.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return c();
    }

    public boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // a.b.e.i.n.a
    public void d(i iVar, int i) {
        this.g = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitleCondensed());
        setId(iVar.f135a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (!iVar.hasSubMenu() || this.k != null) {
            return;
        }
        this.k = new a();
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.h);
        if (this.i != null) {
            if (!((this.g.y & 4) == 4) || (!this.m && !this.n)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.h : null);
        CharSequence charSequence2 = this.g.q;
        if (TextUtils.isEmpty(charSequence2)) {
            charSequence2 = z3 ? null : this.g.e;
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.g.r;
        if (!TextUtils.isEmpty(charSequence3)) {
            setTooltipText(charSequence3);
            return;
        }
        if (!z3) {
            charSequence = this.g.e;
        }
        setTooltipText(charSequence);
    }

    @Override // a.b.e.i.n.a
    public i getItemData() {
        return this.g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.j;
        if (bVar != null) {
            bVar.b(this.g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.m = e();
        f();
    }

    @Override // a.b.f.f0, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean c2 = c();
        if (c2 && (i3 = this.p) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.o) : this.o;
        if (mode != 1073741824 && this.o > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (c2 || this.i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        n0 n0Var;
        if (!this.g.hasSubMenu() || (n0Var = this.k) == null || !n0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.n != z) {
            this.n = z;
            i iVar = this.g;
            if (iVar == null) {
                return;
            }
            iVar.n.p();
        }
    }

    public void setIcon(Drawable drawable) {
        this.i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.q;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(g.b bVar) {
        this.j = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.p = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.h = charSequence;
        f();
    }
}
