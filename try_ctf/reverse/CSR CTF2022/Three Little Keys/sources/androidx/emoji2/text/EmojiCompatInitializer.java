package androidx.emoji2.text;

import a.k.a.d;
import a.k.a.h;
import a.k.a.m;
import a.n.f;
import a.n.j;
import a.n.k;
import android.content.Context;
import android.os.Looper;
import android.os.Trace;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements a.r.b<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends h.c {
        public a(Context context) {
            super(new b(context));
            this.f723b = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements h.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1258a;

        public b(Context context) {
            this.f1258a = context.getApplicationContext();
        }

        @Override // a.k.a.h.g
        public void a(final h.AbstractC0023h abstractC0023h) {
            final ThreadPoolExecutor r = a.h.b.b.r("EmojiCompatInitializer");
            r.execute(new Runnable() { // from class: a.k.a.c
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b bVar = EmojiCompatInitializer.b.this;
                    h.AbstractC0023h abstractC0023h2 = abstractC0023h;
                    ThreadPoolExecutor threadPoolExecutor = r;
                    Objects.requireNonNull(bVar);
                    try {
                        m q = a.h.b.b.q(bVar.f1258a);
                        if (q != null) {
                            m.b bVar2 = (m.b) q.f722a;
                            synchronized (bVar2.d) {
                                bVar2.f = threadPoolExecutor;
                            }
                            q.f722a.a(new i(bVar, abstractC0023h2, threadPoolExecutor));
                            return;
                        }
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    } catch (Throwable th) {
                        abstractC0023h2.a(th);
                        threadPoolExecutor.shutdown();
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                int i = a.h.f.b.f548a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (h.c()) {
                    h.a().e();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i2 = a.h.f.b.f548a;
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // a.r.b
    public List<Class<? extends a.r.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // a.r.b
    public /* bridge */ /* synthetic */ Boolean b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public Boolean c(Context context) {
        a aVar = new a(context);
        if (h.k == null) {
            synchronized (h.j) {
                if (h.k == null) {
                    h.k = new h(aVar);
                }
            }
        }
        a.r.a b2 = a.r.a.b(context);
        Objects.requireNonNull(b2);
        final f a2 = ((j) b2.a(ProcessLifecycleInitializer.class, new HashSet())).a();
        a2.a(new a.n.b() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // a.n.d
            public void f(j jVar) {
                Objects.requireNonNull(EmojiCompatInitializer.this);
                d.a(Looper.getMainLooper()).postDelayed(new c(), 500L);
                k kVar = (k) a2;
                kVar.c("removeObserver");
                kVar.f968a.e(this);
            }
        });
        return Boolean.TRUE;
    }
}
