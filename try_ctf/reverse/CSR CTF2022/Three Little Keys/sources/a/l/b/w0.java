package a.l.b;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class w0 extends Writer {

    /* renamed from: a  reason: collision with root package name */
    public final String f926a;

    /* renamed from: b  reason: collision with root package name */
    public StringBuilder f927b = new StringBuilder(128);

    public w0(String str) {
        this.f926a = str;
    }

    public final void a() {
        if (this.f927b.length() > 0) {
            Log.d(this.f926a, this.f927b.toString());
            StringBuilder sb = this.f927b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                a();
            } else {
                this.f927b.append(c2);
            }
        }
    }
}
