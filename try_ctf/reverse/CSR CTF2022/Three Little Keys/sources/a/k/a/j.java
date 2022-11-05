package a.k.a;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class j {
    public static final ThreadLocal<a.k.a.q.a> d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f730a;

    /* renamed from: b  reason: collision with root package name */
    public final n f731b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f732c = 0;

    public j(n nVar, int i) {
        this.f731b = nVar;
        this.f730a = i;
    }

    public int a(int i) {
        a.k.a.q.a e = e();
        int a2 = e.a(16);
        if (a2 != 0) {
            ByteBuffer byteBuffer = e.f757b;
            int i2 = a2 + e.f756a;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    public int b() {
        a.k.a.q.a e = e();
        int a2 = e.a(16);
        if (a2 != 0) {
            int i = a2 + e.f756a;
            return e.f757b.getInt(e.f757b.getInt(i) + i);
        }
        return 0;
    }

    public short c() {
        a.k.a.q.a e = e();
        int a2 = e.a(14);
        if (a2 != 0) {
            return e.f757b.getShort(a2 + e.f756a);
        }
        return (short) 0;
    }

    public int d() {
        a.k.a.q.a e = e();
        int a2 = e.a(4);
        if (a2 != 0) {
            return e.f757b.getInt(a2 + e.f756a);
        }
        return 0;
    }

    public final a.k.a.q.a e() {
        ThreadLocal<a.k.a.q.a> threadLocal = d;
        a.k.a.q.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a.k.a.q.a();
            threadLocal.set(aVar);
        }
        a.k.a.q.b bVar = this.f731b.f747a;
        int i = this.f730a;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i2 = a2 + bVar.f756a;
            int i3 = (i * 4) + bVar.f757b.getInt(i2) + i2 + 4;
            aVar.b(bVar.f757b.getInt(i3) + i3, bVar.f757b);
        }
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(d()));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
