package a.h.g;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class n implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public String f577a;

    /* renamed from: b  reason: collision with root package name */
    public int f578b;

    /* loaded from: classes.dex */
    public static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final int f579a;

        public a(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.f579a = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(this.f579a);
            super.run();
        }
    }

    public n(String str, int i) {
        this.f577a = str;
        this.f578b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new a(runnable, this.f577a, this.f578b);
    }
}
