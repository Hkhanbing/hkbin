package a.b.f;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f261a;

    /* renamed from: b  reason: collision with root package name */
    public final a.k.b.f f262b;

    public o(TextView textView) {
        this.f261a = textView;
        this.f262b = new a.k.b.f(textView, false);
    }

    public void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f261a.getContext().obtainStyledAttributes(attributeSet, a.b.b.i, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            b(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void b(boolean z) {
        this.f262b.f774a.c(z);
    }
}
