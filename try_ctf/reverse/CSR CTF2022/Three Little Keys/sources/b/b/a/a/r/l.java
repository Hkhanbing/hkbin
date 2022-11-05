package b.b.a.a.r;

import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class l {

    /* renamed from: c  reason: collision with root package name */
    public float f1547c;
    public WeakReference<b> e;
    public b.b.a.a.t.b f;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f1545a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final b.b.a.a.t.d f1546b = new a();
    public boolean d = true;

    /* loaded from: classes.dex */
    public class a extends b.b.a.a.t.d {
        public a() {
        }

        @Override // b.b.a.a.t.d
        public void a(int i) {
            l lVar = l.this;
            lVar.d = true;
            b bVar = lVar.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // b.b.a.a.t.d
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            l lVar = l.this;
            lVar.d = true;
            b bVar = lVar.e.get();
            if (bVar == null) {
                return;
            }
            bVar.a();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public l(b bVar) {
        this.e = new WeakReference<>(null);
        this.e = new WeakReference<>(bVar);
    }

    public float a(String str) {
        if (!this.d) {
            return this.f1547c;
        }
        float measureText = str == null ? 0.0f : this.f1545a.measureText((CharSequence) str, 0, str.length());
        this.f1547c = measureText;
        this.d = false;
        return measureText;
    }
}
