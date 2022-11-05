package b.b.a.a.k;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public class b extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f1435a;

    public b(Chip chip) {
        this.f1435a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        c cVar = this.f1435a.e;
        if (cVar != null) {
            cVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
