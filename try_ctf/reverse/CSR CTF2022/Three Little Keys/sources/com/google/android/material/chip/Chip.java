package com.google.android.material.chip;

import a.b.f.h;
import a.h.j.d0.d;
import a.h.j.w;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import b.b.a.a.c.g;
import b.b.a.a.k.c;
import b.b.a.a.r.i;
import b.b.a.a.t.d;
import b.b.a.a.w.g;
import b.b.a.a.w.j;
import b.b.a.a.w.n;
import de.cybersecurityrumble.threelittlekeys.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Chip extends h implements c.a, n, i<Chip> {
    public static final Rect x = new Rect();
    public static final int[] y = {16842913};
    public static final int[] z = {16842911};
    public c e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public i.a<Chip> j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public CharSequence r;
    public final b s;
    public boolean t;
    public final Rect u;
    public final RectF v;
    public final d w;

    /* loaded from: classes.dex */
    public class a extends d {
        public a() {
        }

        @Override // b.b.a.a.t.d
        public void a(int i) {
        }

        @Override // b.b.a.a.t.d
        public void b(Typeface typeface, boolean z) {
            CharSequence text;
            Chip chip = Chip.this;
            c cVar = chip.e;
            if (cVar.F0) {
                text = cVar.G;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class b extends a.j.b.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // a.j.b.a
        public void m(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.x;
            if (chip.e()) {
                Chip chip2 = Chip.this;
                c cVar = chip2.e;
                if (cVar != null && cVar.M) {
                    z = true;
                }
                if (!z || chip2.h == null) {
                    return;
                }
                list.add(1);
            }
        }

        @Override // a.j.b.a
        public boolean p(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i != 1) {
                    return false;
                }
                return Chip.this.g();
            }
            return false;
        }

        @Override // a.j.b.a
        public void q(int i, a.h.j.d0.d dVar) {
            String str = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    closeIconContentDescription = context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim();
                }
                dVar.f633a.setContentDescription(closeIconContentDescription);
                dVar.f633a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                dVar.a(d.a.e);
                dVar.f633a.setEnabled(Chip.this.isEnabled());
                return;
            }
            dVar.f633a.setContentDescription(str);
            dVar.f633a.setBoundsInParent(Chip.x);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r19, android.util.AttributeSet r20) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.v.setEmpty();
        if (e() && this.h != null) {
            c cVar = this.e;
            cVar.C(cVar.getBounds(), this.v);
        }
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.u;
    }

    private b.b.a.a.t.b getTextAppearance() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.m0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.m != z2) {
            this.m = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.l != z2) {
            this.l = z2;
            refreshDrawableState();
        }
    }

    @Override // b.b.a.a.k.c.a
    public void a() {
        d(this.q);
        requestLayout();
        invalidateOutline();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (r0.right == r7) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(int r10) {
        /*
            r9 = this;
            r9.q = r10
            boolean r0 = r9.o
            r1 = 0
            if (r0 != 0) goto L15
            android.graphics.drawable.InsetDrawable r10 = r9.f
            if (r10 == 0) goto Lf
            r9.h()
            goto L14
        Lf:
            int[] r10 = b.b.a.a.u.a.f1570a
            r9.j()
        L14:
            return r1
        L15:
            b.b.a.a.k.c r0 = r9.e
            float r0 = r0.B
            int r0 = (int) r0
            int r0 = r10 - r0
            int r0 = java.lang.Math.max(r1, r0)
            b.b.a.a.k.c r2 = r9.e
            int r2 = r2.getIntrinsicWidth()
            int r2 = r10 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L3e
            if (r0 > 0) goto L3e
            android.graphics.drawable.InsetDrawable r10 = r9.f
            if (r10 == 0) goto L38
            r9.h()
            goto L3d
        L38:
            int[] r10 = b.b.a.a.u.a.f1570a
            r9.j()
        L3d:
            return r1
        L3e:
            if (r2 <= 0) goto L44
            int r2 = r2 / 2
            r7 = r2
            goto L45
        L44:
            r7 = r1
        L45:
            if (r0 <= 0) goto L49
            int r1 = r0 / 2
        L49:
            r8 = r1
            android.graphics.drawable.InsetDrawable r0 = r9.f
            r1 = 1
            if (r0 == 0) goto L6f
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r2 = r9.f
            r2.getPadding(r0)
            int r2 = r0.top
            if (r2 != r8) goto L6f
            int r2 = r0.bottom
            if (r2 != r8) goto L6f
            int r2 = r0.left
            if (r2 != r7) goto L6f
            int r0 = r0.right
            if (r0 != r7) goto L6f
        L69:
            int[] r10 = b.b.a.a.u.a.f1570a
            r9.j()
            return r1
        L6f:
            int r0 = r9.getMinHeight()
            if (r0 == r10) goto L78
            r9.setMinHeight(r10)
        L78:
            int r0 = r9.getMinWidth()
            if (r0 == r10) goto L81
            r9.setMinWidth(r10)
        L81:
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            b.b.a.a.k.c r4 = r9.e
            r3 = r10
            r5 = r7
            r6 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f = r10
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.d(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        if (r1 != Integer.MIN_VALUE) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.t
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L9:
            com.google.android.material.chip.Chip$b r0 = r9.s
            android.view.accessibility.AccessibilityManager r1 = r0.h
            boolean r1 = r1.isEnabled()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L74
            android.view.accessibility.AccessibilityManager r1 = r0.h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1e
            goto L74
        L1e:
            int r1 = r10.getAction()
            r4 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.794E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L44
            r4 = 9
            if (r1 == r4) goto L44
            r4 = 10
            if (r1 == r4) goto L34
            goto L74
        L34:
            int r1 = r0.m
            if (r1 == r7) goto L74
            if (r1 != r7) goto L3b
            goto L72
        L3b:
            r0.m = r7
            r0.s(r7, r6)
            r0.s(r1, r5)
            goto L72
        L44:
            float r1 = r10.getX()
            float r4 = r10.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r8 = r8.e()
            if (r8 == 0) goto L62
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r8 = b(r8)
            boolean r1 = r8.contains(r1, r4)
            if (r1 == 0) goto L62
            r1 = r2
            goto L63
        L62:
            r1 = r3
        L63:
            int r4 = r0.m
            if (r4 != r1) goto L68
            goto L70
        L68:
            r0.m = r1
            r0.s(r1, r6)
            r0.s(r4, r5)
        L70:
            if (r1 == r7) goto L74
        L72:
            r0 = r2
            goto L75
        L74:
            r0 = r3
        L75:
            if (r0 != 0) goto L7f
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L7e
            goto L7f
        L7e:
            r2 = r3
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.s;
        Objects.requireNonNull(bVar);
        boolean z2 = false;
        int i = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z3 = false;
                                while (i < repeatCount && bVar.n(i2, null)) {
                                    i++;
                                    z3 = true;
                                }
                                z2 = z3;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = bVar.l;
                    if (i3 != Integer.MIN_VALUE) {
                        bVar.p(i3, 16, null);
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = bVar.n(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = bVar.n(1, null);
            }
        }
        if (z2 && this.s.l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // a.b.f.h, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.e;
        boolean z2 = false;
        int i = 0;
        z2 = false;
        if (cVar != null && c.I(cVar.N)) {
            c cVar2 = this.e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.n) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.m) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.l) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.n) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.m) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.l) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z2 = cVar2.e0(iArr);
        }
        if (z2) {
            invalidate();
        }
    }

    public final boolean e() {
        c cVar = this.e;
        return (cVar == null || cVar.F() == null) ? false : true;
    }

    public boolean f() {
        c cVar = this.e;
        return cVar != null && cVar.S;
    }

    public boolean g() {
        boolean z2 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z2 = true;
        }
        if (this.t) {
            this.s.s(1, 1);
        }
        return z2;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.r)) {
            return this.r;
        }
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).h.d) ? "android.widget.CompoundButton" : "android.widget.RadioButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.U;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.V;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        c cVar = this.e;
        if (cVar != null) {
            return Math.max(0.0f, cVar.E());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.f0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        c cVar = this.e;
        if (cVar == null || (drawable = cVar.I) == null) {
            return null;
        }
        return drawable instanceof a.h.d.l.a ? ((a.h.d.l.a) drawable).a() : drawable;
    }

    public float getChipIconSize() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.K;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.J;
        }
        return null;
    }

    public float getChipMinHeight() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.B;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.E;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.F();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.e0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.Q;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.d0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.P;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.E0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.t) {
            b bVar = this.s;
            if (bVar.l == 1 || bVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public g getHideMotionSpec() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.X;
        }
        return null;
    }

    public float getIconEndPadding() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.a0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.Z;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.F;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        return this.e.f1578a.f1582a;
    }

    public g getShowMotionSpec() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.W;
        }
        return null;
    }

    public float getTextEndPadding() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.c0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        c cVar = this.e;
        if (cVar != null) {
            return cVar.b0;
        }
        return 0.0f;
    }

    public final void h() {
        if (this.f != null) {
            this.f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            int[] iArr = b.b.a.a.u.a.f1570a;
            j();
        }
    }

    public final void i() {
        if (e()) {
            c cVar = this.e;
            if ((cVar != null && cVar.M) && this.h != null) {
                w.p(this, this.s);
                this.t = true;
                return;
            }
        }
        w.p(this, null);
        this.t = false;
    }

    public final void j() {
        this.g = new RippleDrawable(b.b.a.a.u.a.a(this.e.F), getBackgroundDrawable(), null);
        this.e.o0(false);
        RippleDrawable rippleDrawable = this.g;
        AtomicInteger atomicInteger = w.f667a;
        w.d.q(this, rippleDrawable);
        k();
    }

    public final void k() {
        c cVar;
        if (TextUtils.isEmpty(getText()) || (cVar = this.e) == null) {
            return;
        }
        int D = (int) (cVar.D() + cVar.f0 + cVar.c0);
        c cVar2 = this.e;
        int A = (int) (cVar2.A() + cVar2.Y + cVar2.b0);
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            A += rect.left;
            D += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        AtomicInteger atomicInteger = w.f667a;
        w.e.k(this, A, paddingTop, D, paddingBottom);
    }

    public final void l() {
        TextPaint paint = getPaint();
        c cVar = this.e;
        if (cVar != null) {
            paint.drawableState = cVar.getState();
        }
        b.b.a.a.t.b textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.b.a.a.a.B(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, y);
        }
        if (f()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.t) {
            b bVar = this.s;
            int i2 = bVar.l;
            if (i2 != Integer.MIN_VALUE) {
                bVar.k(i2);
            }
            if (!z2) {
                return;
            }
            bVar.n(i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i2 = -1;
            if (chipGroup.f1538c) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        i4 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i3) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i3)) == this) {
                            break;
                        }
                        i4++;
                    }
                    i3++;
                }
                i = i4;
            } else {
                i = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i2 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) d.c.a(i2, 1, i, 1, false, isChecked()).f640a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.p != i) {
            this.p = i;
            k();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.l
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.l
            if (r0 == 0) goto L34
            r5.g()
            r0 = r3
            goto L35
        L34:
            r0 = r2
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = r3
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // a.b.f.h, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // a.b.f.h, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.L(z2);
        }
    }

    public void setCheckableResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.L(cVar.g0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        c cVar = this.e;
        if (cVar == null) {
            this.k = z2;
        } else if (!cVar.S) {
        } else {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.M(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.M(a.b.a.e(cVar.g0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.N(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.N(a.b.a.d(cVar.g0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.O(cVar.g0.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z2) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.O(z2);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        c cVar = this.e;
        if (cVar == null || cVar.A == colorStateList) {
            return;
        }
        cVar.A = colorStateList;
        cVar.onStateChange(cVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.P(a.b.a.d(cVar.g0, i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.Q(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.Q(cVar.g0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(c cVar) {
        c cVar2 = this.e;
        if (cVar2 != cVar) {
            if (cVar2 != null) {
                cVar2.D0 = new WeakReference<>(null);
            }
            this.e = cVar;
            cVar.F0 = false;
            Objects.requireNonNull(cVar);
            cVar.D0 = new WeakReference<>(this);
            d(this.q);
        }
    }

    public void setChipEndPadding(float f) {
        c cVar = this.e;
        if (cVar == null || cVar.f0 == f) {
            return;
        }
        cVar.f0 = f;
        cVar.invalidateSelf();
        cVar.J();
    }

    public void setChipEndPaddingResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.R(cVar.g0.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.S(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.S(a.b.a.e(cVar.g0, i));
        }
    }

    public void setChipIconSize(float f) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.T(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.T(cVar.g0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.U(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.U(a.b.a.d(cVar.g0, i));
        }
    }

    public void setChipIconVisible(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.V(cVar.g0.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z2) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.V(z2);
        }
    }

    public void setChipMinHeight(float f) {
        c cVar = this.e;
        if (cVar == null || cVar.B == f) {
            return;
        }
        cVar.B = f;
        cVar.invalidateSelf();
        cVar.J();
    }

    public void setChipMinHeightResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.W(cVar.g0.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        c cVar = this.e;
        if (cVar == null || cVar.Y == f) {
            return;
        }
        cVar.Y = f;
        cVar.invalidateSelf();
        cVar.J();
    }

    public void setChipStartPaddingResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.X(cVar.g0.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.Y(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.Y(a.b.a.d(cVar.g0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.Z(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.Z(cVar.g0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.a0(drawable);
        }
        i();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        c cVar = this.e;
        if (cVar == null || cVar.R == charSequence) {
            return;
        }
        a.h.h.a c2 = a.h.h.a.c();
        cVar.R = c2.d(charSequence, c2.f587c, true);
        cVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.b0(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.b0(cVar.g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.a0(a.b.a.e(cVar.g0, i));
        }
        i();
    }

    public void setCloseIconSize(float f) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.c0(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.c0(cVar.g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.d0(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.d0(cVar.g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.f0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.f0(a.b.a.d(cVar.g0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z2) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.g0(z2);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 != 0) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 != 0) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        c cVar = this.e;
        if (cVar != null) {
            g.b bVar = cVar.f1578a;
            if (bVar.o == f) {
                return;
            }
            bVar.o = f;
            cVar.x();
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.E0 = truncateAt;
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.o = z2;
        d(this.q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(b.b.a.a.c.g gVar) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.X = gVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.X = b.b.a.a.c.g.b(cVar.g0, i);
        }
    }

    public void setIconEndPadding(float f) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.h0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.h0(cVar.g0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.i0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.i0(cVar.g0.getResources().getDimension(i));
        }
    }

    @Override // b.b.a.a.r.i
    public void setInternalOnCheckedChangeListener(i.a<Chip> aVar) {
        this.j = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        c cVar = this.e;
        if (cVar != null) {
            cVar.G0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        i();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.j0(colorStateList);
        }
        if (!this.e.B0) {
            j();
        }
    }

    public void setRippleColorResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.j0(a.b.a.d(cVar.g0, i));
            if (this.e.B0) {
                return;
            }
            j();
        }
    }

    @Override // b.b.a.a.w.n
    public void setShapeAppearanceModel(j jVar) {
        c cVar = this.e;
        cVar.f1578a.f1582a = jVar;
        cVar.invalidateSelf();
    }

    public void setShowMotionSpec(b.b.a.a.c.g gVar) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.W = gVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.W = b.b.a.a.c.g.b(cVar.g0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(cVar.F0 ? null : charSequence, bufferType);
        c cVar2 = this.e;
        if (cVar2 == null) {
            return;
        }
        cVar2.k0(charSequence);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        c cVar = this.e;
        if (cVar != null) {
            cVar.l0(new b.b.a.a.t.b(cVar.g0, i));
        }
        l();
    }

    public void setTextAppearance(b.b.a.a.t.b bVar) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.l0(bVar);
        }
        l();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        c cVar = this.e;
        if (cVar == null || cVar.c0 == f) {
            return;
        }
        cVar.c0 = f;
        cVar.invalidateSelf();
        cVar.J();
    }

    public void setTextEndPaddingResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.m0(cVar.g0.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        c cVar = this.e;
        if (cVar == null || cVar.b0 == f) {
            return;
        }
        cVar.b0 = f;
        cVar.invalidateSelf();
        cVar.J();
    }

    public void setTextStartPaddingResource(int i) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.n0(cVar.g0.getResources().getDimension(i));
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        c cVar = this.e;
        if (cVar != null) {
            cVar.l0(new b.b.a.a.t.b(cVar.g0, i));
        }
        l();
    }
}
