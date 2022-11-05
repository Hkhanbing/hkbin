package b.b.a.a.w;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class m {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f1598a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f1599b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f1600c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    public final List<e> g = new ArrayList();
    public final List<f> h = new ArrayList();

    /* loaded from: classes.dex */
    public static class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public final c f1601b;

        public a(c cVar) {
            this.f1601b = cVar;
        }

        @Override // b.b.a.a.w.m.f
        public void a(Matrix matrix, b.b.a.a.v.a aVar, int i, Canvas canvas) {
            c cVar = this.f1601b;
            float f = cVar.f;
            float f2 = cVar.g;
            c cVar2 = this.f1601b;
            RectF rectF = new RectF(cVar2.f1604b, cVar2.f1605c, cVar2.d, cVar2.e);
            boolean z = f2 < 0.0f;
            Path path = aVar.g;
            if (z) {
                int[] iArr = b.b.a.a.v.a.k;
                iArr[0] = 0;
                iArr[1] = aVar.f;
                iArr[2] = aVar.e;
                iArr[3] = aVar.d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                int[] iArr2 = b.b.a.a.v.a.k;
                iArr2[0] = 0;
                iArr2[1] = aVar.d;
                iArr2[2] = aVar.e;
                iArr2[3] = aVar.f;
            }
            float width = rectF.width() / 2.0f;
            if (width <= 0.0f) {
                return;
            }
            float f4 = 1.0f - (i / width);
            float[] fArr = b.b.a.a.v.a.l;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            aVar.f1573b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, b.b.a.a.v.a.k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.h);
            }
            canvas.drawArc(rectF, f, f2, true, aVar.f1573b);
            canvas.restore();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public final d f1602b;

        /* renamed from: c  reason: collision with root package name */
        public final float f1603c;
        public final float d;

        public b(d dVar, float f, float f2) {
            this.f1602b = dVar;
            this.f1603c = f;
            this.d = f2;
        }

        @Override // b.b.a.a.w.m.f
        public void a(Matrix matrix, b.b.a.a.v.a aVar, int i, Canvas canvas) {
            d dVar = this.f1602b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(dVar.f1607c - this.d, dVar.f1606b - this.f1603c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f1603c, this.d);
            matrix2.preRotate(b());
            Objects.requireNonNull(aVar);
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = b.b.a.a.v.a.i;
            iArr[0] = aVar.f;
            iArr[1] = aVar.e;
            iArr[2] = aVar.d;
            Paint paint = aVar.f1574c;
            float f = rectF.left;
            paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, b.b.a.a.v.a.j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f1574c);
            canvas.restore();
        }

        public float b() {
            d dVar = this.f1602b;
            return (float) Math.toDegrees(Math.atan((dVar.f1607c - this.d) / (dVar.f1606b - this.f1603c)));
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {
        public static final RectF h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f1604b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f1605c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public c(float f, float f2, float f3, float f4) {
            this.f1604b = f;
            this.f1605c = f2;
            this.d = f3;
            this.e = f4;
        }

        @Override // b.b.a.a.w.m.e
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1608a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = h;
            rectF.set(this.f1604b, this.f1605c, this.d, this.e);
            path.arcTo(rectF, this.f, this.g, false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f1606b;

        /* renamed from: c  reason: collision with root package name */
        public float f1607c;

        @Override // b.b.a.a.w.m.e
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1608a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f1606b, this.f1607c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f1608a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public static final Matrix f1609a = new Matrix();

        public abstract void a(Matrix matrix, b.b.a.a.v.a aVar, int i, Canvas canvas);
    }

    public m() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        c cVar = new c(f2, f3, f4, f5);
        cVar.f = f6;
        cVar.g = f7;
        this.g.add(cVar);
        a aVar = new a(cVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        float f9 = z ? (180.0f + f8) % 360.0f : f8;
        b(f6);
        this.h.add(aVar);
        this.e = f9;
        double d2 = f8;
        this.f1600c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f);
        this.d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f);
    }

    public final void b(float f2) {
        float f3 = this.e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f1600c;
        float f6 = this.d;
        c cVar = new c(f5, f6, f5, f6);
        cVar.f = this.e;
        cVar.g = f4;
        this.h.add(new a(cVar));
        this.e = f2;
    }

    public void c(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(matrix, path);
        }
    }

    public void d(float f2, float f3) {
        d dVar = new d();
        dVar.f1606b = f2;
        dVar.f1607c = f3;
        this.g.add(dVar);
        b bVar = new b(dVar, this.f1600c, this.d);
        b(bVar.b() + 270.0f);
        this.h.add(bVar);
        this.e = bVar.b() + 270.0f;
        this.f1600c = f2;
        this.d = f3;
    }

    public void e(float f2, float f3, float f4, float f5) {
        this.f1598a = f2;
        this.f1599b = f3;
        this.f1600c = f2;
        this.d = f3;
        this.e = f4;
        this.f = (f4 + f5) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
