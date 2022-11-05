package a.k.a;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class l extends ReplacementSpan {

    /* renamed from: b  reason: collision with root package name */
    public final j f742b;

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f741a = new Paint.FontMetricsInt();

    /* renamed from: c  reason: collision with root package name */
    public short f743c = -1;
    public float d = 1.0f;

    public l(j jVar) {
        a.h.b.b.g(jVar, "metadata cannot be null");
        this.f742b = jVar;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f741a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f741a;
        this.d = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f742b.c();
        this.f742b.c();
        a.k.a.q.a e = this.f742b.e();
        int a2 = e.a(12);
        short s = (short) ((a2 != 0 ? e.f757b.getShort(a2 + e.f756a) : (short) 0) * this.d);
        this.f743c = s;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f741a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s;
    }
}
