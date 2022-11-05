package a.k.a;

import a.k.a.h;
import a.k.a.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class m extends h.c {
    public static final a d = new a();

    /* loaded from: classes.dex */
    public static class a {
    }

    /* loaded from: classes.dex */
    public static class b implements h.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f744a;

        /* renamed from: b  reason: collision with root package name */
        public final a.h.g.e f745b;

        /* renamed from: c  reason: collision with root package name */
        public final a f746c;
        public final Object d = new Object();
        public Handler e;
        public Executor f;
        public ThreadPoolExecutor g;
        public h.AbstractC0023h h;
        public ContentObserver i;
        public Runnable j;

        public b(Context context, a.h.g.e eVar, a aVar) {
            a.h.b.b.g(context, "Context cannot be null");
            a.h.b.b.g(eVar, "FontRequest cannot be null");
            this.f744a = context.getApplicationContext();
            this.f745b = eVar;
            this.f746c = aVar;
        }

        @Override // a.k.a.h.g
        public void a(h.AbstractC0023h abstractC0023h) {
            a.h.b.b.g(abstractC0023h, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.h = abstractC0023h;
            }
            c();
        }

        public final void b() {
            synchronized (this.d) {
                this.h = null;
                ContentObserver contentObserver = this.i;
                if (contentObserver != null) {
                    a aVar = this.f746c;
                    Context context = this.f744a;
                    Objects.requireNonNull(aVar);
                    context.getContentResolver().unregisterContentObserver(contentObserver);
                    this.i = null;
                }
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(this.j);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            }
        }

        public void c() {
            synchronized (this.d) {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor r = a.h.b.b.r("emojiCompat");
                    this.g = r;
                    this.f = r;
                }
                this.f.execute(new Runnable() { // from class: a.k.a.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.b bVar = m.b.this;
                        synchronized (bVar.d) {
                            if (bVar.h == null) {
                                return;
                            }
                            try {
                                a.h.g.l d = bVar.d();
                                int i = d.e;
                                if (i == 2) {
                                    synchronized (bVar.d) {
                                    }
                                }
                                if (i != 0) {
                                    throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                                }
                                int i2 = a.h.f.b.f548a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                m.a aVar = bVar.f746c;
                                Context context = bVar.f744a;
                                Objects.requireNonNull(aVar);
                                Typeface b2 = a.h.d.e.f539a.b(context, null, new a.h.g.l[]{d}, 0);
                                ByteBuffer F = a.h.b.b.F(bVar.f744a, null, d.f574a);
                                if (F != null && b2 != null) {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    n nVar = new n(b2, a.h.b.b.I(F));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (bVar.d) {
                                        h.AbstractC0023h abstractC0023h = bVar.h;
                                        if (abstractC0023h != null) {
                                            abstractC0023h.b(nVar);
                                        }
                                    }
                                    bVar.b();
                                    return;
                                }
                                throw new RuntimeException("Unable to open file.");
                            } catch (Throwable th) {
                                synchronized (bVar.d) {
                                    h.AbstractC0023h abstractC0023h2 = bVar.h;
                                    if (abstractC0023h2 != null) {
                                        abstractC0023h2.a(th);
                                    }
                                    bVar.b();
                                }
                            }
                        }
                    }
                });
            }
        }

        public final a.h.g.l d() {
            try {
                a aVar = this.f746c;
                Context context = this.f744a;
                a.h.g.e eVar = this.f745b;
                Objects.requireNonNull(aVar);
                a.h.g.k a2 = a.h.g.d.a(context, eVar, null);
                if (a2.f572a == 0) {
                    a.h.g.l[] lVarArr = a2.f573b;
                    if (lVarArr != null && lVarArr.length != 0) {
                        return lVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                StringBuilder f = b.a.a.a.a.f("fetchFonts failed (");
                f.append(a2.f572a);
                f.append(")");
                throw new RuntimeException(f.toString());
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }

    public m(Context context, a.h.g.e eVar) {
        super(new b(context, eVar, d));
    }
}
