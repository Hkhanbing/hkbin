package com.google.android.material.button;

import a.b.f.g;
import a.h.j.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import b.b.a.a.w.g;
import b.b.a.a.w.j;
import b.b.a.a.w.n;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class MaterialButton extends g implements Checkable, n {
    public static final int[] q = {16842911};
    public static final int[] r = {16842912};
    public final b.b.a.a.h.a d;
    public final LinkedHashSet<a> e;
    public b f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public int p;

    /* loaded from: classes.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c extends a.j.a.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f1708c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new c[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f1708c = parcel.readInt() != 1 ? false : true;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f701a, i);
            parcel.writeInt(this.f1708c ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(b.b.a.a.a0.a.a.a(context, attributeSet, R.attr.materialButtonStyle, 2131821496), attributeSet, R.attr.materialButtonStyle);
        this.e = new LinkedHashSet<>();
        boolean z = false;
        this.n = false;
        this.o = false;
        Context context2 = getContext();
        TypedArray d = b.b.a.a.r.n.d(context2, attributeSet, b.b.a.a.b.l, R.attr.materialButtonStyle, 2131821496, new int[0]);
        this.m = d.getDimensionPixelSize(12, 0);
        this.g = b.b.a.a.a.t(d.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.h = b.b.a.a.a.g(getContext(), d, 14);
        this.i = b.b.a.a.a.j(getContext(), d, 10);
        this.p = d.getInteger(11, 1);
        this.j = d.getDimensionPixelSize(13, 0);
        b.b.a.a.h.a aVar = new b.b.a.a.h.a(this, j.b(context2, attributeSet, R.attr.materialButtonStyle, 2131821496).a());
        this.d = aVar;
        aVar.f1433c = d.getDimensionPixelOffset(1, 0);
        aVar.d = d.getDimensionPixelOffset(2, 0);
        aVar.e = d.getDimensionPixelOffset(3, 0);
        aVar.f = d.getDimensionPixelOffset(4, 0);
        if (d.hasValue(8)) {
            int dimensionPixelSize = d.getDimensionPixelSize(8, -1);
            aVar.g = dimensionPixelSize;
            aVar.e(aVar.f1432b.e(dimensionPixelSize));
            aVar.p = true;
        }
        aVar.h = d.getDimensionPixelSize(20, 0);
        aVar.i = b.b.a.a.a.t(d.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.j = b.b.a.a.a.g(aVar.f1431a.getContext(), d, 6);
        aVar.k = b.b.a.a.a.g(aVar.f1431a.getContext(), d, 19);
        aVar.l = b.b.a.a.a.g(aVar.f1431a.getContext(), d, 16);
        aVar.q = d.getBoolean(5, false);
        aVar.s = d.getDimensionPixelSize(9, 0);
        MaterialButton materialButton = aVar.f1431a;
        AtomicInteger atomicInteger = w.f667a;
        int f = w.e.f(materialButton);
        int paddingTop = aVar.f1431a.getPaddingTop();
        int e = w.e.e(aVar.f1431a);
        int paddingBottom = aVar.f1431a.getPaddingBottom();
        if (d.hasValue(0)) {
            aVar.o = true;
            aVar.f1431a.setSupportBackgroundTintList(aVar.j);
            aVar.f1431a.setSupportBackgroundTintMode(aVar.i);
        } else {
            aVar.g();
        }
        w.e.k(aVar.f1431a, f + aVar.f1433c, paddingTop + aVar.e, e + aVar.d, paddingBottom + aVar.f);
        d.recycle();
        setCompoundDrawablePadding(this.m);
        g(this.i != null ? true : z);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public boolean a() {
        b.b.a.a.h.a aVar = this.d;
        return aVar != null && aVar.q;
    }

    public final boolean b() {
        int i = this.p;
        return i == 3 || i == 4;
    }

    public final boolean c() {
        int i = this.p;
        return i == 1 || i == 2;
    }

    public final boolean d() {
        int i = this.p;
        return i == 16 || i == 32;
    }

    public final boolean e() {
        b.b.a.a.h.a aVar = this.d;
        return aVar != null && !aVar.o;
    }

    public final void f() {
        if (c()) {
            setCompoundDrawablesRelative(this.i, null, null, null);
        } else if (b()) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (!d()) {
        } else {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    public final void g(boolean z) {
        Drawable drawable = this.i;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.i = mutate;
            mutate.setTintList(this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int i = this.j;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.j;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.k;
            int i4 = this.l;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.i.setVisible(true, z);
        }
        if (z) {
            f();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!c() || drawable3 == this.i) && ((!b() || drawable5 == this.i) && (!d() || drawable4 == this.i))) {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        f();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.d.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.p;
    }

    public int getIconPadding() {
        return this.m;
    }

    public int getIconSize() {
        return this.j;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.f;
    }

    public int getInsetTop() {
        return this.d.e;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.d.l;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        if (e()) {
            return this.d.f1432b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.d.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // a.b.f.g
    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.d.j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // a.b.f.g
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.d.i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (!d()) {
                return;
            }
            this.k = 0;
            if (this.p == 16) {
                this.l = 0;
                g(false);
                return;
            }
            int i3 = this.j;
            if (i3 == 0) {
                i3 = this.i.getIntrinsicHeight();
            }
            int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.m) - getPaddingBottom()) / 2;
            if (this.l == textHeight) {
                return;
            }
            this.l = textHeight;
            g(false);
        }
        this.l = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.p;
        boolean z = true;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.k = 0;
            g(false);
            return;
        }
        int i5 = this.j;
        if (i5 == 0) {
            i5 = this.i.getIntrinsicWidth();
        }
        int textWidth = i - getTextWidth();
        AtomicInteger atomicInteger = w.f667a;
        int e = (((textWidth - w.e.e(this)) - i5) - this.m) - w.e.f(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            e /= 2;
        }
        boolean z2 = w.e.d(this) == 1;
        if (this.p != 4) {
            z = false;
        }
        if (z2 != z) {
            e = -e;
        }
        if (this.k == e) {
            return;
        }
        this.k = e;
        g(false);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.n;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            b.b.a.a.a.B(this, this.d.b());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, q);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, r);
        }
        return onCreateDrawableState;
    }

    @Override // a.b.f.g, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // a.b.f.g, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // a.b.f.g, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f701a);
        setChecked(cVar.f1708c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f1708c = this.n;
        return cVar;
    }

    @Override // a.b.f.g, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (!this.i.setState(getDrawableState())) {
                return;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (e()) {
            b.b.a.a.h.a aVar = this.d;
            if (aVar.b() == null) {
                return;
            }
            aVar.b().setTint(i);
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // a.b.f.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                b.b.a.a.h.a aVar = this.d;
                aVar.o = true;
                aVar.f1431a.setSupportBackgroundTintList(aVar.j);
                aVar.f1431a.setSupportBackgroundTintMode(aVar.i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // a.b.f.g, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? a.b.a.e(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.d.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!a() || !isEnabled() || this.n == z) {
            return;
        }
        this.n = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.n;
            if (!materialButtonToggleGroup.f) {
                materialButtonToggleGroup.b(getId(), z2);
            }
        }
        if (this.o) {
            return;
        }
        this.o = true;
        Iterator<a> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.n);
        }
        this.o = false;
    }

    public void setCornerRadius(int i) {
        if (e()) {
            b.b.a.a.h.a aVar = this.d;
            if (aVar.p && aVar.g == i) {
                return;
            }
            aVar.g = i;
            aVar.p = true;
            aVar.e(aVar.f1432b.e(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (e()) {
            b.b.a.a.w.g b2 = this.d.b();
            g.b bVar = b2.f1578a;
            if (bVar.o == f) {
                return;
            }
            bVar.o = f;
            b2.x();
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.p != i) {
            this.p = i;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.m != i) {
            this.m = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? a.b.a.e(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.j == i) {
                return;
            }
            this.j = i;
            g(true);
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            g(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(a.b.a.d(getContext(), i));
    }

    public void setInsetBottom(int i) {
        b.b.a.a.h.a aVar = this.d;
        aVar.f(aVar.e, i);
    }

    public void setInsetTop(int i) {
        b.b.a.a.h.a aVar = this.d;
        aVar.f(i, aVar.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.f;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            b.b.a.a.h.a aVar = this.d;
            if (aVar.l == colorStateList) {
                return;
            }
            aVar.l = colorStateList;
            if (!(aVar.f1431a.getBackground() instanceof RippleDrawable)) {
                return;
            }
            ((RippleDrawable) aVar.f1431a.getBackground()).setColor(b.b.a.a.u.a.a(colorStateList));
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(a.b.a.d(getContext(), i));
        }
    }

    @Override // b.b.a.a.w.n
    public void setShapeAppearanceModel(j jVar) {
        if (e()) {
            this.d.e(jVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            b.b.a.a.h.a aVar = this.d;
            aVar.n = z;
            aVar.h();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            b.b.a.a.h.a aVar = this.d;
            if (aVar.k == colorStateList) {
                return;
            }
            aVar.k = colorStateList;
            aVar.h();
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(a.b.a.d(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            b.b.a.a.h.a aVar = this.d;
            if (aVar.h == i) {
                return;
            }
            aVar.h = i;
            aVar.h();
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // a.b.f.g
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            b.b.a.a.h.a aVar = this.d;
            if (aVar.j == colorStateList) {
                return;
            }
            aVar.j = colorStateList;
            if (aVar.b() == null) {
                return;
            }
            aVar.b().setTintList(aVar.j);
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // a.b.f.g
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            b.b.a.a.h.a aVar = this.d;
            if (aVar.i == mode) {
                return;
            }
            aVar.i = mode;
            if (aVar.b() == null || aVar.i == null) {
                return;
            }
            aVar.b().setTintMode(aVar.i);
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.n);
    }
}
