package a.k.a;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p extends l {
    public p(j jVar) {
        super(jVar);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Objects.requireNonNull(h.a());
        j jVar = this.f742b;
        Typeface typeface = jVar.f731b.d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i6 = jVar.f730a * 2;
        canvas.drawText(jVar.f731b.f748b, i6, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }
}
