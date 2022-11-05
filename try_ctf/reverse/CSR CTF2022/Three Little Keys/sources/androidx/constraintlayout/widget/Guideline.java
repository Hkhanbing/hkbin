package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1235a;

    public Guideline(Context context) {
        super(context);
        this.f1235a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1235a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f1235a = z;
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f1235a || aVar.f1228a != i) {
            aVar.f1228a = i;
            setLayoutParams(aVar);
        }
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f1235a || aVar.f1229b != i) {
            aVar.f1229b = i;
            setLayoutParams(aVar);
        }
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f1235a || aVar.f1230c != f) {
            aVar.f1230c = f;
            setLayoutParams(aVar);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
