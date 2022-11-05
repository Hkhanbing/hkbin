package b.b.a.a.r;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class u extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public int f1558a;

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f1558a = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f1558a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f1558a = i;
    }
}
