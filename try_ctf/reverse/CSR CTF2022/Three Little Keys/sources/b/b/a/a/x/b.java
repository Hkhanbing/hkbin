package b.b.a.a.x;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes.dex */
public class b {
    public static b d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f1611a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f1612b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    public c f1613c;

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b bVar = b.this;
            c cVar = (c) message.obj;
            synchronized (bVar.f1611a) {
                if (bVar.f1613c == cVar || cVar == null) {
                    Objects.requireNonNull(cVar);
                    throw null;
                }
            }
            return true;
        }
    }

    /* renamed from: b.b.a.a.x.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0041b {
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    public static b a() {
        if (d == null) {
            d = new b();
        }
        return d;
    }

    public final boolean b(InterfaceC0041b interfaceC0041b) {
        if (this.f1613c == null || interfaceC0041b == null) {
            return false;
        }
        throw null;
    }
}
