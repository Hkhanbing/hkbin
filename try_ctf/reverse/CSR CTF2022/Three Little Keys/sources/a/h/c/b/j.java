package a.h.c.b;

/* loaded from: classes.dex */
public final class j {
    public static final j k;

    /* renamed from: a  reason: collision with root package name */
    public final float f529a;

    /* renamed from: b  reason: collision with root package name */
    public final float f530b;

    /* renamed from: c  reason: collision with root package name */
    public final float f531c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] fArr = b.f506c;
        float c2 = (float) ((b.c(50.0f) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f504a;
        float f = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f2 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f3 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f4 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-c2) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f) * exp) + 1.0f) - exp, (((100.0f / f2) * exp) + 1.0f) - exp, (((100.0f / f3) * exp) + 1.0f) - exp};
        float f5 = 1.0f / ((5.0f * c2) + 1.0f);
        float f6 = f5 * f5 * f5 * f5;
        float f7 = 1.0f - f6;
        float cbrt = (0.1f * f7 * f7 * ((float) Math.cbrt(c2 * 5.0d))) + (f6 * c2);
        float c3 = b.c(50.0f) / fArr[1];
        double d2 = c3;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f2) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f3) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        k = new j(c3, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, f4, 1.0f, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), ((float) Math.sqrt(d2)) + 1.48f);
    }

    public j(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f = f;
        this.f529a = f2;
        this.f530b = f3;
        this.f531c = f4;
        this.d = f5;
        this.e = f6;
        this.g = fArr;
        this.h = f7;
        this.i = f8;
        this.j = f9;
    }
}
