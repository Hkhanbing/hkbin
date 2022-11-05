package a.k.a.q;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f756a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f757b;

    /* renamed from: c  reason: collision with root package name */
    public int f758c;
    public int d;

    public c() {
        if (d.f759a == null) {
            d.f759a = new d();
        }
    }

    public int a(int i) {
        if (i < this.d) {
            return this.f757b.getShort(this.f758c + i);
        }
        return 0;
    }

    public void b(int i, ByteBuffer byteBuffer) {
        short s;
        this.f757b = byteBuffer;
        if (byteBuffer != null) {
            this.f756a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f758c = i2;
            s = this.f757b.getShort(i2);
        } else {
            s = 0;
            this.f756a = 0;
            this.f758c = 0;
        }
        this.d = s;
    }
}
