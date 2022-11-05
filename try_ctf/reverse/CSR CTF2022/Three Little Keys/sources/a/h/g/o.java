package a.h.g;

import android.os.Handler;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class o<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public Callable<T> f580a;

    /* renamed from: b  reason: collision with root package name */
    public a.h.i.a<T> f581b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f582c;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a.h.i.a f583a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f584b;

        public a(o oVar, a.h.i.a aVar, Object obj) {
            this.f583a = aVar;
            this.f584b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            this.f583a.a(this.f584b);
        }
    }

    public o(Handler handler, Callable<T> callable, a.h.i.a<T> aVar) {
        this.f580a = callable;
        this.f581b = aVar;
        this.f582c = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        T t;
        try {
            t = this.f580a.call();
        } catch (Exception unused) {
            t = null;
        }
        this.f582c.post(new a(this, this.f581b, t));
    }
}
