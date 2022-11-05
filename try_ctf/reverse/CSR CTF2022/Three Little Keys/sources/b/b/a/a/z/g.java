package b.b.a.a.z;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class g extends b.b.a.a.w.g {
    public final RectF A;
    public final Paint z;

    public g() {
        this(null);
    }

    public g(b.b.a.a.w.j jVar) {
        super(jVar == null ? new b.b.a.a.w.j() : jVar);
        Paint paint = new Paint(1);
        this.z = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.A = new RectF();
    }

    @Override // b.b.a.a.w.g
    public void h(Canvas canvas) {
        if (this.A.isEmpty()) {
            super.h(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.A);
        super.h(canvas);
        canvas.restore();
    }

    public void y(float f, float f2, float f3, float f4) {
        RectF rectF = this.A;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
