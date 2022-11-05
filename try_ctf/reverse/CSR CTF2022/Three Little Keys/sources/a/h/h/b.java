package a.h.h;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

/* loaded from: classes.dex */
public class b implements Spannable {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f591a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f592b;

        /* renamed from: c  reason: collision with root package name */
        public final int f593c;
        public final int d;

        public a(PrecomputedText.Params params) {
            this.f591a = params.getTextPaint();
            this.f592b = params.getTextDirection();
            this.f593c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }

        public boolean a(a aVar) {
            if (this.f593c == aVar.f593c && this.d == aVar.d && this.f591a.getTextSize() == aVar.f591a.getTextSize() && this.f591a.getTextScaleX() == aVar.f591a.getTextScaleX() && this.f591a.getTextSkewX() == aVar.f591a.getTextSkewX() && this.f591a.getLetterSpacing() == aVar.f591a.getLetterSpacing() && TextUtils.equals(this.f591a.getFontFeatureSettings(), aVar.f591a.getFontFeatureSettings()) && this.f591a.getFlags() == aVar.f591a.getFlags() && this.f591a.getTextLocales().equals(aVar.f591a.getTextLocales())) {
                return this.f591a.getTypeface() == null ? aVar.f591a.getTypeface() == null : this.f591a.getTypeface().equals(aVar.f591a.getTypeface());
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f592b == aVar.f592b;
        }

        public int hashCode() {
            return Objects.hash(Float.valueOf(this.f591a.getTextSize()), Float.valueOf(this.f591a.getTextScaleX()), Float.valueOf(this.f591a.getTextSkewX()), Float.valueOf(this.f591a.getLetterSpacing()), Integer.valueOf(this.f591a.getFlags()), this.f591a.getTextLocales(), this.f591a.getTypeface(), Boolean.valueOf(this.f591a.isElegantTextHeight()), this.f592b, Integer.valueOf(this.f593c), Integer.valueOf(this.d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder f = b.a.a.a.a.f("textSize=");
            f.append(this.f591a.getTextSize());
            sb.append(f.toString());
            sb.append(", textScaleX=" + this.f591a.getTextScaleX());
            sb.append(", textSkewX=" + this.f591a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f591a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f591a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f591a.getTextLocales());
            sb.append(", typeface=" + this.f591a.getTypeface());
            sb.append(", variationSettings=" + this.f591a.getFontVariationSettings());
            sb.append(", textDir=" + this.f592b);
            sb.append(", breakStrategy=" + this.f593c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        int i3 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i4 = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        throw null;
    }
}
