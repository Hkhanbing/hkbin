package a.b.f;

import android.graphics.Typeface;
import android.widget.TextView;

/* loaded from: classes.dex */
public class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextView f198a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f199b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f200c;

    public e0(d0 d0Var, TextView textView, Typeface typeface, int i) {
        this.f198a = textView;
        this.f199b = typeface;
        this.f200c = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f198a.setTypeface(this.f199b, this.f200c);
    }
}
