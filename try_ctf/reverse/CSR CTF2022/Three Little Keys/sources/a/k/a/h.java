package a.k.a;

import a.k.a.k;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class h {
    public static final Object j = new Object();
    public static volatile h k;

    /* renamed from: a  reason: collision with root package name */
    public final ReadWriteLock f715a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<e> f716b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f717c;
    public final Handler d;
    public final b e;
    public final g f;
    public final int g;
    public final int h;
    public final d i;

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile k f718b;

        /* renamed from: c  reason: collision with root package name */
        public volatile n f719c;

        /* renamed from: a.k.a.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0022a extends AbstractC0023h {
            public C0022a() {
            }

            @Override // a.k.a.h.AbstractC0023h
            public void a(Throwable th) {
                a.this.f721a.f(th);
            }

            @Override // a.k.a.h.AbstractC0023h
            public void b(n nVar) {
                a aVar = a.this;
                if (nVar == null) {
                    aVar.f721a.f(new IllegalArgumentException("metadataRepo cannot be null"));
                    return;
                }
                aVar.f719c = nVar;
                n nVar2 = aVar.f719c;
                i iVar = new i();
                h hVar = aVar.f721a;
                d dVar = hVar.i;
                Objects.requireNonNull(hVar);
                aVar.f718b = new k(nVar2, iVar, dVar, false, null);
                aVar.f721a.g();
            }
        }

        public a(h hVar) {
            super(hVar);
        }

        @Override // a.k.a.h.b
        public void a() {
            try {
                this.f721a.f.a(new C0022a());
            } catch (Throwable th) {
                this.f721a.f(th);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:88:0x014c, code lost:
            return r17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[Catch: all -> 0x014d, TryCatch #0 {all -> 0x014d, blocks: (B:7:0x001c, B:10:0x0021, B:12:0x0025, B:14:0x0034, B:19:0x0042, B:21:0x004c, B:23:0x004f, B:25:0x0053, B:27:0x005f, B:28:0x0062, B:30:0x006f, B:36:0x007e, B:37:0x008c, B:42:0x00a4, B:49:0x00b2, B:52:0x00be, B:53:0x00c3, B:55:0x00d9, B:57:0x00e0, B:58:0x00e5, B:60:0x00f0, B:63:0x00f7, B:65:0x00fb, B:67:0x0101, B:69:0x0105, B:76:0x0114, B:79:0x0120, B:80:0x0126, B:16:0x003c), top: B:93:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00e5 A[Catch: all -> 0x014d, TryCatch #0 {all -> 0x014d, blocks: (B:7:0x001c, B:10:0x0021, B:12:0x0025, B:14:0x0034, B:19:0x0042, B:21:0x004c, B:23:0x004f, B:25:0x0053, B:27:0x005f, B:28:0x0062, B:30:0x006f, B:36:0x007e, B:37:0x008c, B:42:0x00a4, B:49:0x00b2, B:52:0x00be, B:53:0x00c3, B:55:0x00d9, B:57:0x00e0, B:58:0x00e5, B:60:0x00f0, B:63:0x00f7, B:65:0x00fb, B:67:0x0101, B:69:0x0105, B:76:0x0114, B:79:0x0120, B:80:0x0126, B:16:0x003c), top: B:93:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0120 A[Catch: all -> 0x014d, TryCatch #0 {all -> 0x014d, blocks: (B:7:0x001c, B:10:0x0021, B:12:0x0025, B:14:0x0034, B:19:0x0042, B:21:0x004c, B:23:0x004f, B:25:0x0053, B:27:0x005f, B:28:0x0062, B:30:0x006f, B:36:0x007e, B:37:0x008c, B:42:0x00a4, B:49:0x00b2, B:52:0x00be, B:53:0x00c3, B:55:0x00d9, B:57:0x00e0, B:58:0x00e5, B:60:0x00f0, B:63:0x00f7, B:65:0x00fb, B:67:0x0101, B:69:0x0105, B:76:0x0114, B:79:0x0120, B:80:0x0126, B:16:0x003c), top: B:93:0x001c }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x013c  */
        /* JADX WARN: Type inference failed for: r8v10 */
        @Override // a.k.a.h.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.CharSequence b(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 342
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.k.a.h.a.b(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
        }

        @Override // a.k.a.h.b
        public void c(EditorInfo editorInfo) {
            Bundle bundle = editorInfo.extras;
            a.k.a.q.b bVar = this.f719c.f747a;
            int a2 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a2 != 0 ? bVar.f757b.getInt(a2 + bVar.f756a) : 0);
            Bundle bundle2 = editorInfo.extras;
            Objects.requireNonNull(this.f721a);
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final h f721a;

        public b(h hVar) {
            this.f721a = hVar;
        }

        public void a() {
            throw null;
        }

        public CharSequence b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            throw null;
        }

        public void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f722a;

        /* renamed from: b  reason: collision with root package name */
        public int f723b = 0;

        /* renamed from: c  reason: collision with root package name */
        public d f724c = new k.a();

        public c(g gVar) {
            a.h.b.b.g(gVar, "metadataLoader cannot be null.");
            this.f722a = gVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a() {
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final List<e> f725a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f726b;

        /* renamed from: c  reason: collision with root package name */
        public final int f727c;

        public f(Collection<e> collection, int i, Throwable th) {
            a.h.b.b.g(collection, "initCallbacks cannot be null");
            this.f725a = new ArrayList(collection);
            this.f727c = i;
            this.f726b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f725a.size();
            int i = 0;
            if (this.f727c != 1) {
                while (i < size) {
                    Objects.requireNonNull(this.f725a.get(i));
                    i++;
                }
                return;
            }
            while (i < size) {
                this.f725a.get(i).a();
                i++;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(AbstractC0023h abstractC0023h);
    }

    /* renamed from: a.k.a.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0023h {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    /* loaded from: classes.dex */
    public static class i {
    }

    public h(c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f715a = reentrantReadWriteLock;
        this.f717c = 3;
        Objects.requireNonNull(cVar);
        this.g = -16711936;
        this.f = cVar.f722a;
        int i2 = cVar.f723b;
        this.h = i2;
        this.i = cVar.f724c;
        this.d = new Handler(Looper.getMainLooper());
        this.f716b = new a.e.c();
        a aVar = new a(this);
        this.e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f717c = 0;
            } catch (Throwable th) {
                this.f715a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            aVar.a();
        }
    }

    public static h a() {
        h hVar;
        synchronized (j) {
            hVar = k;
            a.h.b.b.i(hVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return hVar;
    }

    public static boolean c() {
        return k != null;
    }

    public int b() {
        this.f715a.readLock().lock();
        try {
            return this.f717c;
        } finally {
            this.f715a.readLock().unlock();
        }
    }

    public final boolean d() {
        return b() == 1;
    }

    public void e() {
        boolean z = true;
        if (this.h != 1) {
            z = false;
        }
        a.h.b.b.i(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (d()) {
            return;
        }
        this.f715a.writeLock().lock();
        try {
            if (this.f717c == 0) {
                return;
            }
            this.f717c = 0;
            this.f715a.writeLock().unlock();
            this.e.a();
        } finally {
            this.f715a.writeLock().unlock();
        }
    }

    public void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f715a.writeLock().lock();
        try {
            this.f717c = 2;
            arrayList.addAll(this.f716b);
            this.f716b.clear();
            this.f715a.writeLock().unlock();
            this.d.post(new f(arrayList, this.f717c, th));
        } catch (Throwable th2) {
            this.f715a.writeLock().unlock();
            throw th2;
        }
    }

    public void g() {
        ArrayList arrayList = new ArrayList();
        this.f715a.writeLock().lock();
        try {
            this.f717c = 1;
            arrayList.addAll(this.f716b);
            this.f716b.clear();
            this.f715a.writeLock().unlock();
            this.d.post(new f(arrayList, this.f717c, null));
        } catch (Throwable th) {
            this.f715a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, 0, charSequence == null ? 0 : charSequence.length(), Integer.MAX_VALUE, 0);
    }

    public CharSequence i(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        a.h.b.b.i(d(), "Not initialized yet");
        a.h.b.b.f(i2, "start cannot be negative");
        a.h.b.b.f(i3, "end cannot be negative");
        a.h.b.b.f(i4, "maxEmojiCount cannot be negative");
        a.h.b.b.d(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        a.h.b.b.d(i2 <= charSequence.length(), "start should be < than charSequence length");
        a.h.b.b.d(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        return this.e.b(charSequence, i2, i3, i4, i5 == 1);
    }

    public void j(e eVar) {
        a.h.b.b.g(eVar, "initCallback cannot be null");
        this.f715a.writeLock().lock();
        try {
            if (this.f717c != 1 && this.f717c != 2) {
                this.f716b.add(eVar);
            }
            Handler handler = this.d;
            int i2 = this.f717c;
            a.h.b.b.g(eVar, "initCallback cannot be null");
            handler.post(new f(Arrays.asList(eVar), i2, null));
        } finally {
            this.f715a.writeLock().unlock();
        }
    }
}
