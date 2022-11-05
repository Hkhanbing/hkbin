package com.google.android.material.timepicker;

import a.f.c.d;
import a.h.j.w;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import b.b.a.a.b0.d;
import b.b.a.a.b0.e;
import b.b.a.a.b0.f;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int y = 0;
    public final Chip u;
    public final Chip v;
    public final MaterialButtonToggleGroup w;
    public final View.OnClickListener x;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i = TimePickerView.y;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.x = aVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.w = materialButtonToggleGroup;
        materialButtonToggleGroup.f1711c.add(new d(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.u = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.v = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        f fVar = new f(this, new GestureDetector(getContext(), new e(this)));
        chip.setOnTouchListener(fVar);
        chip2.setOnTouchListener(fVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            s();
        }
    }

    public final void s() {
        d.a aVar;
        if (this.w.getVisibility() == 0) {
            a.f.c.d dVar = new a.f.c.d();
            dVar.c(this);
            AtomicInteger atomicInteger = w.f667a;
            char c2 = w.e.d(this) == 0 ? (char) 2 : (char) 1;
            if (dVar.f462c.containsKey(Integer.valueOf((int) R.id.material_clock_display)) && (aVar = dVar.f462c.get(Integer.valueOf((int) R.id.material_clock_display))) != null) {
                switch (c2) {
                    case 1:
                        d.b bVar = aVar.d;
                        bVar.j = -1;
                        bVar.i = -1;
                        bVar.G = -1;
                        bVar.N = Integer.MIN_VALUE;
                        break;
                    case 2:
                        d.b bVar2 = aVar.d;
                        bVar2.l = -1;
                        bVar2.k = -1;
                        bVar2.H = -1;
                        bVar2.P = Integer.MIN_VALUE;
                        break;
                    case 3:
                        d.b bVar3 = aVar.d;
                        bVar3.n = -1;
                        bVar3.m = -1;
                        bVar3.I = 0;
                        bVar3.O = Integer.MIN_VALUE;
                        break;
                    case 4:
                        d.b bVar4 = aVar.d;
                        bVar4.o = -1;
                        bVar4.p = -1;
                        bVar4.J = 0;
                        bVar4.Q = Integer.MIN_VALUE;
                        break;
                    case 5:
                        d.b bVar5 = aVar.d;
                        bVar5.q = -1;
                        bVar5.r = -1;
                        bVar5.s = -1;
                        bVar5.M = 0;
                        bVar5.T = Integer.MIN_VALUE;
                        break;
                    case 6:
                        d.b bVar6 = aVar.d;
                        bVar6.t = -1;
                        bVar6.u = -1;
                        bVar6.L = 0;
                        bVar6.S = Integer.MIN_VALUE;
                        break;
                    case 7:
                        d.b bVar7 = aVar.d;
                        bVar7.v = -1;
                        bVar7.w = -1;
                        bVar7.K = 0;
                        bVar7.R = Integer.MIN_VALUE;
                        break;
                    case '\b':
                        d.b bVar8 = aVar.d;
                        bVar8.C = -1.0f;
                        bVar8.B = -1;
                        bVar8.A = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            dVar.b(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }
}
