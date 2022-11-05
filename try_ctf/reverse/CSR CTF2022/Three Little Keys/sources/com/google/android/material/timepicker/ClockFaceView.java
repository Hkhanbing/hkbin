package com.google.android.material.timepicker;

import a.h.j.d0.d;
import a.h.j.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import b.b.a.a.a;
import b.b.a.a.b;
import b.b.a.a.b0.c;
import com.google.android.material.timepicker.ClockHandView;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ClockFaceView extends c implements ClockHandView.c {
    public final SparseArray<TextView> A;
    public final a.h.j.c B;
    public final int[] C;
    public final float[] D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public String[] I;
    public float J;
    public final ColorStateList K;
    public final ClockHandView x;
    public final Rect y;
    public final RectF z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.y = new Rect();
        this.z = new RectF();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.A = sparseArray;
        this.D = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.e, R.attr.materialClockStyle, 2131821587);
        Resources resources = getResources();
        ColorStateList g = a.g(context, obtainStyledAttributes, 1);
        this.K = g;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.x = clockHandView;
        this.E = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = g.getColorForState(new int[]{16842913}, g.getDefaultColor());
        this.C = new int[]{colorForState, colorForState, g.getDefaultColor()};
        clockHandView.f.add(this);
        int defaultColor = a.b.a.d(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList g2 = a.g(context, obtainStyledAttributes, 0);
        setBackgroundColor(g2 != null ? g2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b.b.a.a.b0.a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.B = new b.b.a.a.b0.b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.I = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i = 0; i < Math.max(this.I.length, size); i++) {
            TextView textView = this.A.get(i);
            if (i >= this.I.length) {
                removeView(textView);
                this.A.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.A.put(i, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.I[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                w.p(textView, this.B);
                textView.setTextColor(this.K);
            }
        }
        this.F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.G = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.H = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void a(float f, boolean z) {
        if (Math.abs(this.J - f) > 0.001f) {
            this.J = f;
            t();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.b.a(1, this.I.length, false, 1).f639a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.H / Math.max(Math.max(this.F / displayMetrics.heightPixels, this.G / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void t() {
        RectF rectF = this.x.j;
        for (int i = 0; i < this.A.size(); i++) {
            TextView textView = this.A.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.y);
                offsetDescendantRectToMyCoords(textView, this.y);
                textView.setSelected(rectF.contains(this.y.centerX(), this.y.centerY()));
                this.z.set(this.y);
                this.z.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                textView.getPaint().setShader(!RectF.intersects(rectF, this.z) ? null : new RadialGradient(rectF.centerX() - this.z.left, rectF.centerY() - this.z.top, 0.5f * rectF.width(), this.C, this.D, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }
}
