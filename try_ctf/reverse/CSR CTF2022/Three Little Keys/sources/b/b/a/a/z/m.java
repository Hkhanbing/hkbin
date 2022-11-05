package b.b.a.a.z;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public TextInputLayout f1643a;

    /* renamed from: b  reason: collision with root package name */
    public Context f1644b;

    /* renamed from: c  reason: collision with root package name */
    public CheckableImageButton f1645c;
    public final int d;

    public m(TextInputLayout textInputLayout, int i) {
        this.f1643a = textInputLayout;
        this.f1644b = textInputLayout.getContext();
        this.f1645c = textInputLayout.getEndIconView();
        this.d = i;
    }

    public abstract void a();

    public boolean b(int i) {
        return true;
    }

    public void c(boolean z) {
    }

    public boolean d() {
        return false;
    }
}
