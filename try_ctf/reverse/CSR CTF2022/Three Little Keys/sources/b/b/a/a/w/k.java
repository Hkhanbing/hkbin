package b.b.a.a.w;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import b.b.a.a.w.g;
import b.b.a.a.w.m;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public final m[] f1592a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f1593b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f1594c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final m g = new m();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public boolean l = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final k f1595a = new k();
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public k() {
        for (int i = 0; i < 4; i++) {
            this.f1592a[i] = new m();
            this.f1593b[i] = new Matrix();
            this.f1594c[i] = new Matrix();
        }
    }

    public void a(j jVar, float f, RectF rectF, b bVar, Path path) {
        float[] fArr;
        float centerX;
        float f2;
        char c2;
        f fVar;
        m mVar;
        Matrix matrix;
        Path path2;
        c cVar;
        d dVar;
        float f3;
        float f4;
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        int i = 0;
        while (i < 4) {
            if (i == 1) {
                cVar = jVar.g;
            } else if (i == 2) {
                cVar = jVar.h;
            } else if (i != 3) {
                cVar = jVar.f;
            } else {
                cVar = jVar.e;
            }
            if (i == 1) {
                dVar = jVar.f1588c;
            } else if (i == 2) {
                dVar = jVar.d;
            } else if (i != 3) {
                dVar = jVar.f1587b;
            } else {
                dVar = jVar.f1586a;
            }
            m mVar2 = this.f1592a[i];
            Objects.requireNonNull(dVar);
            dVar.a(mVar2, 90.0f, f, cVar.a(rectF));
            int i2 = i + 1;
            float f5 = i2 * 90;
            this.f1593b[i].reset();
            PointF pointF = this.d;
            if (i == 1) {
                f3 = rectF.right;
            } else if (i != 2) {
                f3 = i != 3 ? rectF.right : rectF.left;
                f4 = rectF.top;
                pointF.set(f3, f4);
                Matrix matrix2 = this.f1593b[i];
                PointF pointF2 = this.d;
                matrix2.setTranslate(pointF2.x, pointF2.y);
                this.f1593b[i].preRotate(f5);
                float[] fArr2 = this.h;
                m[] mVarArr = this.f1592a;
                fArr2[0] = mVarArr[i].f1600c;
                fArr2[1] = mVarArr[i].d;
                this.f1593b[i].mapPoints(fArr2);
                this.f1594c[i].reset();
                Matrix matrix3 = this.f1594c[i];
                float[] fArr3 = this.h;
                matrix3.setTranslate(fArr3[0], fArr3[1]);
                this.f1594c[i].preRotate(f5);
                i = i2;
            } else {
                f3 = rectF.left;
            }
            f4 = rectF.bottom;
            pointF.set(f3, f4);
            Matrix matrix22 = this.f1593b[i];
            PointF pointF22 = this.d;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.f1593b[i].preRotate(f5);
            float[] fArr22 = this.h;
            m[] mVarArr2 = this.f1592a;
            fArr22[0] = mVarArr2[i].f1600c;
            fArr22[1] = mVarArr2[i].d;
            this.f1593b[i].mapPoints(fArr22);
            this.f1594c[i].reset();
            Matrix matrix32 = this.f1594c[i];
            float[] fArr32 = this.h;
            matrix32.setTranslate(fArr32[0], fArr32[1]);
            this.f1594c[i].preRotate(f5);
            i = i2;
        }
        int i3 = 0;
        while (i3 < 4) {
            float[] fArr4 = this.h;
            m[] mVarArr3 = this.f1592a;
            fArr4[0] = mVarArr3[i3].f1598a;
            fArr4[1] = mVarArr3[i3].f1599b;
            this.f1593b[i3].mapPoints(fArr4);
            float[] fArr5 = this.h;
            if (i3 == 0) {
                path.moveTo(fArr5[0], fArr5[1]);
            } else {
                path.lineTo(fArr5[0], fArr5[1]);
            }
            this.f1592a[i3].c(this.f1593b[i3], path);
            if (bVar != null) {
                m mVar3 = this.f1592a[i3];
                Matrix matrix4 = this.f1593b[i3];
                g.a aVar = (g.a) bVar;
                BitSet bitSet = g.this.d;
                Objects.requireNonNull(mVar3);
                bitSet.set(i3, false);
                m.f[] fVarArr = g.this.f1579b;
                mVar3.b(mVar3.f);
                fVarArr[i3] = new l(mVar3, new ArrayList(mVar3.h), new Matrix(matrix4));
            }
            int i4 = i3 + 1;
            int i5 = i4 % 4;
            float[] fArr6 = this.h;
            m[] mVarArr4 = this.f1592a;
            fArr6[0] = mVarArr4[i3].f1600c;
            fArr6[1] = mVarArr4[i3].d;
            this.f1593b[i3].mapPoints(fArr6);
            float[] fArr7 = this.i;
            m[] mVarArr5 = this.f1592a;
            fArr7[0] = mVarArr5[i5].f1598a;
            fArr7[1] = mVarArr5[i5].f1599b;
            this.f1593b[i5].mapPoints(fArr7);
            float f6 = this.h[0];
            float[] fArr8 = this.i;
            float max = Math.max(((float) Math.hypot(f6 - fArr8[0], fArr[1] - fArr8[1])) - 0.001f, 0.0f);
            float[] fArr9 = this.h;
            m[] mVarArr6 = this.f1592a;
            fArr9[0] = mVarArr6[i3].f1600c;
            fArr9[1] = mVarArr6[i3].d;
            this.f1593b[i3].mapPoints(fArr9);
            if (i3 == 1 || i3 == 3) {
                centerX = rectF.centerX();
                f2 = this.h[0];
            } else {
                centerX = rectF.centerY();
                f2 = this.h[1];
            }
            float abs = Math.abs(centerX - f2);
            this.g.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i3 == 1) {
                c2 = 3;
                fVar = jVar.k;
            } else if (i3 != 2) {
                c2 = 3;
                if (i3 != 3) {
                    fVar = jVar.j;
                } else {
                    fVar = jVar.i;
                }
            } else {
                c2 = 3;
                fVar = jVar.l;
            }
            fVar.a(max, abs, f, this.g);
            this.j.reset();
            this.g.c(this.f1594c[i3], this.j);
            if (!this.l || (!b(this.j, i3) && !b(this.j, i5))) {
                mVar = this.g;
                matrix = this.f1594c[i3];
                path2 = path;
            } else {
                Path path3 = this.j;
                path3.op(path3, this.f, Path.Op.DIFFERENCE);
                float[] fArr10 = this.h;
                m mVar4 = this.g;
                fArr10[0] = mVar4.f1598a;
                fArr10[1] = mVar4.f1599b;
                this.f1594c[i3].mapPoints(fArr10);
                Path path4 = this.e;
                float[] fArr11 = this.h;
                path4.moveTo(fArr11[0], fArr11[1]);
                mVar = this.g;
                matrix = this.f1594c[i3];
                path2 = this.e;
            }
            mVar.c(matrix, path2);
            if (bVar != null) {
                m mVar5 = this.g;
                Matrix matrix5 = this.f1594c[i3];
                g.a aVar2 = (g.a) bVar;
                Objects.requireNonNull(mVar5);
                g.this.d.set(i3 + 4, false);
                m.f[] fVarArr2 = g.this.f1580c;
                mVar5.b(mVar5.f);
                fVarArr2[i3] = new l(mVar5, new ArrayList(mVar5.h), new Matrix(matrix5));
            }
            i3 = i4;
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i) {
        this.k.reset();
        this.f1592a[i].c(this.f1593b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
