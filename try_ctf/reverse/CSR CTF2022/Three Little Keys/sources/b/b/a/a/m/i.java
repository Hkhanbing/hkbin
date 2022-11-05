package b.b.a.a.m;

import android.view.View;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public class i extends a.h.j.c {
    public final /* synthetic */ g d;

    public i(g gVar) {
        this.d = gVar;
    }

    @Override // a.h.j.c
    public void d(View view, a.h.j.d0.d dVar) {
        g gVar;
        int i;
        this.f621a.onInitializeAccessibilityNodeInfo(view, dVar.f633a);
        if (this.d.d0.getVisibility() == 0) {
            gVar = this.d;
            i = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            gVar = this.d;
            i = R.string.mtrl_picker_toggle_to_day_selection;
        }
        dVar.f633a.setHintText(gVar.B(i));
    }
}
