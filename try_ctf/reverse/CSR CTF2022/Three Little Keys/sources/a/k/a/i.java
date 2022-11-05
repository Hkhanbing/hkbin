package a.k.a;

import a.k.a.h;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class i extends h.AbstractC0023h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.AbstractC0023h f728a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f729b;

    public i(EmojiCompatInitializer.b bVar, h.AbstractC0023h abstractC0023h, ThreadPoolExecutor threadPoolExecutor) {
        this.f728a = abstractC0023h;
        this.f729b = threadPoolExecutor;
    }

    @Override // a.k.a.h.AbstractC0023h
    public void a(Throwable th) {
        try {
            this.f728a.a(th);
        } finally {
            this.f729b.shutdown();
        }
    }

    @Override // a.k.a.h.AbstractC0023h
    public void b(n nVar) {
        try {
            this.f728a.b(nVar);
        } finally {
            this.f729b.shutdown();
        }
    }
}
