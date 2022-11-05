package b.b.a.a.b0;

import a.h.j.d0.d;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.timepicker.ClockFaceView;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public class b extends a.h.j.c {
    public final /* synthetic */ ClockFaceView d;

    public b(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    @Override // a.h.j.c
    public void d(View view, a.h.j.d0.d dVar) {
        this.f621a.onInitializeAccessibilityNodeInfo(view, dVar.f633a);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            dVar.f633a.setTraversalAfter(this.d.A.get(intValue - 1));
        }
        dVar.i(d.c.a(0, 1, intValue, 1, false, view.isSelected()));
        dVar.f633a.setClickable(true);
        dVar.a(d.a.e);
    }

    @Override // a.h.j.c
    public boolean g(View view, int i, Bundle bundle) {
        if (i == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            float x = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            this.d.x.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x, height, 0));
            this.d.x.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x, height, 0));
            return true;
        }
        return super.g(view, i, bundle);
    }
}
