package a.f.c;

import a.f.a.i.d;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class g extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f482a;

    /* renamed from: b  reason: collision with root package name */
    public View f483b;

    /* renamed from: c  reason: collision with root package name */
    public int f484c;

    public void a() {
        if (this.f483b == null) {
            return;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.f483b.getLayoutParams();
        aVar2.q0.i0 = 0;
        d.a m = aVar.q0.m();
        d.a aVar3 = d.a.FIXED;
        if (m != aVar3) {
            aVar.q0.S(aVar2.q0.u());
        }
        if (aVar.q0.t() != aVar3) {
            aVar.q0.N(aVar2.q0.l());
        }
        aVar2.q0.i0 = 8;
    }

    public View getContent() {
        return this.f483b;
    }

    public int getEmptyVisibility() {
        return this.f484c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f482a == i) {
            return;
        }
        View view = this.f483b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f483b.getLayoutParams()).f0 = false;
            this.f483b = null;
        }
        this.f482a = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f484c = i;
    }
}
