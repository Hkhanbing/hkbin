package b.b.a.a.v;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public class a {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: b  reason: collision with root package name */
    public final Paint f1573b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f1574c;
    public int d;
    public int e;
    public int f;
    public final Path g = new Path();
    public Paint h = new Paint();

    /* renamed from: a  reason: collision with root package name */
    public final Paint f1572a = new Paint();

    public a() {
        a(-16777216);
        this.h.setColor(0);
        Paint paint = new Paint(4);
        this.f1573b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1574c = new Paint(paint);
    }

    public void a(int i2) {
        this.d = a.h.d.a.e(i2, 68);
        this.e = a.h.d.a.e(i2, 20);
        this.f = a.h.d.a.e(i2, 0);
        this.f1572a.setColor(this.d);
    }
}
