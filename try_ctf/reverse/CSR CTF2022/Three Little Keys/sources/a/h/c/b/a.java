package a.h.c.b;

import android.graphics.Color;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f501a;

    /* renamed from: b  reason: collision with root package name */
    public final float f502b;

    /* renamed from: c  reason: collision with root package name */
    public final float f503c;
    public final float d;
    public final float e;
    public final float f;

    public a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f501a = f;
        this.f502b = f2;
        this.f503c = f3;
        this.d = f7;
        this.e = f8;
        this.f = f9;
    }

    public static a a(int i) {
        float pow;
        j jVar = j.k;
        float b2 = b.b(Color.red(i));
        float b3 = b.b(Color.green(i));
        float b4 = b.b(Color.blue(i));
        float[][] fArr = b.d;
        float[] fArr2 = {(fArr[0][2] * b4) + (fArr[0][1] * b3) + (fArr[0][0] * b2), (fArr[1][2] * b4) + (fArr[1][1] * b3) + (fArr[1][0] * b2), (b4 * fArr[2][2]) + (b3 * fArr[2][1]) + (b2 * fArr[2][0])};
        float[][] fArr3 = b.f504a;
        float f = (fArr2[2] * fArr3[0][2]) + (fArr2[1] * fArr3[0][1]) + (fArr2[0] * fArr3[0][0]);
        float f2 = (fArr2[2] * fArr3[1][2]) + (fArr2[1] * fArr3[1][1]) + (fArr2[0] * fArr3[1][0]);
        float f3 = fArr2[0] * fArr3[2][0];
        float f4 = fArr2[2] * fArr3[2][2];
        float[] fArr4 = jVar.g;
        float f5 = fArr4[0] * f;
        float f6 = fArr4[1] * f2;
        float f7 = fArr4[2] * (f4 + (fArr2[1] * fArr3[2][1]) + f3);
        float pow2 = (float) Math.pow((Math.abs(f5) * jVar.h) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f6) * jVar.h) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f7) * jVar.h) / 100.0d, 0.42d);
        float signum = ((Math.signum(f5) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f6) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f7) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f8 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f9 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f10 = signum2 * 20.0f;
        float f11 = ((21.0f * signum3) + ((signum * 20.0f) + f10)) / 20.0f;
        float f12 = (((signum * 40.0f) + f10) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f9, f8)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f13 = atan2;
        float f14 = (3.1415927f * f13) / 180.0f;
        float pow5 = ((float) Math.pow((f12 * jVar.f530b) / jVar.f529a, jVar.d * jVar.j)) * 100.0f;
        float sqrt = (jVar.f529a + 4.0f) * (4.0f / jVar.d) * ((float) Math.sqrt(pow5 / 100.0f)) * jVar.i;
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, jVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f13) < 20.14d ? 360.0f + f13 : f13) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * jVar.e) * jVar.f531c) * ((float) Math.sqrt((f9 * f9) + (f8 * f8)))) / (f11 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float f15 = pow6 * jVar.i;
        float sqrt2 = ((float) Math.sqrt((pow * jVar.d) / (jVar.f529a + 4.0f))) * 50.0f;
        float f16 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * f15) + 1.0f)) * 43.85965f;
        double d2 = f14;
        return new a(f13, pow6, pow5, sqrt, f15, sqrt2, f16, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static a b(float f, float f2, float f3) {
        double d;
        j jVar = j.k;
        float sqrt = (jVar.f529a + 4.0f) * (4.0f / jVar.d) * ((float) Math.sqrt(f / 100.0d));
        float f4 = jVar.i;
        float f5 = sqrt * f4;
        float f6 = f2 * f4;
        float sqrt2 = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * jVar.d) / (jVar.f529a + 4.0f))) * 50.0f;
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new a(f3, f2, f, f5, f6, sqrt2, f7, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public int c(j jVar) {
        float f;
        float f2 = this.f502b;
        if (f2 != 0.0d) {
            double d = this.f503c;
            if (d != 0.0d) {
                f = f2 / ((float) Math.sqrt(d / 100.0d));
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, jVar.f), 0.73d), 1.1111111111111112d);
                double d2 = (this.f501a * 3.1415927f) / 180.0f;
                float pow2 = jVar.f529a * ((float) Math.pow(this.f503c / 100.0d, (1.0d / jVar.d) / jVar.j));
                float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f * 3846.1538f * jVar.e * jVar.f531c;
                float f3 = pow2 / jVar.f530b;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f4 = (((0.305f + f3) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f5 = cos2 * f4;
                float f6 = f4 * sin;
                float f7 = f3 * 460.0f;
                float f8 = ((288.0f * f6) + ((451.0f * f5) + f7)) / 1403.0f;
                float f9 = ((f7 - (891.0f * f5)) - (261.0f * f6)) / 1403.0f;
                float f10 = ((f7 - (f5 * 220.0f)) - (f6 * 6300.0f)) / 1403.0f;
                float signum = (100.0f / jVar.h) * Math.signum(f8) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
                float signum2 = (100.0f / jVar.h) * Math.signum(f9) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f9) * 27.13d) / (400.0d - Math.abs(f9))), 2.380952380952381d));
                float signum3 = Math.signum(f10);
                float[] fArr = jVar.g;
                float f11 = signum / fArr[0];
                float f12 = signum2 / fArr[1];
                float pow3 = (((100.0f / jVar.h) * signum3) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = b.f505b;
                float f13 = (fArr2[0][2] * pow3) + (fArr2[0][1] * f12) + (fArr2[0][0] * f11);
                float f14 = (fArr2[1][2] * pow3) + (fArr2[1][1] * f12) + (fArr2[1][0] * f11);
                float f15 = f11 * fArr2[2][0];
                return a.h.d.a.a(f13, f14, (pow3 * fArr2[2][2]) + (f12 * fArr2[2][1]) + f15);
            }
        }
        f = 0.0f;
        float pow4 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, jVar.f), 0.73d), 1.1111111111111112d);
        double d22 = (this.f501a * 3.1415927f) / 180.0f;
        float pow22 = jVar.f529a * ((float) Math.pow(this.f503c / 100.0d, (1.0d / jVar.d) / jVar.j));
        float cos3 = ((float) (Math.cos(2.0d + d22) + 3.8d)) * 0.25f * 3846.1538f * jVar.e * jVar.f531c;
        float f32 = pow22 / jVar.f530b;
        float sin2 = (float) Math.sin(d22);
        float cos22 = (float) Math.cos(d22);
        float f42 = (((0.305f + f32) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f52 = cos22 * f42;
        float f62 = f42 * sin2;
        float f72 = f32 * 460.0f;
        float f82 = ((288.0f * f62) + ((451.0f * f52) + f72)) / 1403.0f;
        float f92 = ((f72 - (891.0f * f52)) - (261.0f * f62)) / 1403.0f;
        float f102 = ((f72 - (f52 * 220.0f)) - (f62 * 6300.0f)) / 1403.0f;
        float signum4 = (100.0f / jVar.h) * Math.signum(f82) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f82) * 27.13d) / (400.0d - Math.abs(f82))), 2.380952380952381d));
        float signum22 = (100.0f / jVar.h) * Math.signum(f92) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f92) * 27.13d) / (400.0d - Math.abs(f92))), 2.380952380952381d));
        float signum32 = Math.signum(f102);
        float[] fArr3 = jVar.g;
        float f112 = signum4 / fArr3[0];
        float f122 = signum22 / fArr3[1];
        float pow32 = (((100.0f / jVar.h) * signum32) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f102) * 27.13d) / (400.0d - Math.abs(f102))), 2.380952380952381d))) / fArr3[2];
        float[][] fArr22 = b.f505b;
        float f132 = (fArr22[0][2] * pow32) + (fArr22[0][1] * f122) + (fArr22[0][0] * f112);
        float f142 = (fArr22[1][2] * pow32) + (fArr22[1][1] * f122) + (fArr22[1][0] * f112);
        float f152 = f112 * fArr22[2][0];
        return a.h.d.a.a(f132, f142, (pow32 * fArr22[2][2]) + (f122 * fArr22[2][1]) + f152);
    }
}
