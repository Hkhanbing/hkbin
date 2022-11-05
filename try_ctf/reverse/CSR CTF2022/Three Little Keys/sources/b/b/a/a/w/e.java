package b.b.a.a.w;

/* loaded from: classes.dex */
public class e extends d {
    @Override // b.b.a.a.w.d
    public void a(m mVar, float f, float f2, float f3) {
        mVar.e(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        mVar.d((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }
}
