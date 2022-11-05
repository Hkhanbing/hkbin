package b.b.a.a.b0;

import android.view.ViewTreeObserver;
import com.google.android.material.timepicker.ClockFaceView;
import com.google.android.material.timepicker.ClockHandView;

/* loaded from: classes.dex */
public class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f1365a;

    public a(ClockFaceView clockFaceView) {
        this.f1365a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (!this.f1365a.isShown()) {
            return true;
        }
        this.f1365a.getViewTreeObserver().removeOnPreDrawListener(this);
        ClockFaceView clockFaceView = this.f1365a;
        int height = ((this.f1365a.getHeight() / 2) - clockFaceView.x.g) - clockFaceView.E;
        if (height != clockFaceView.v) {
            clockFaceView.v = height;
            clockFaceView.s();
            ClockHandView clockHandView = clockFaceView.x;
            clockHandView.o = clockFaceView.v;
            clockHandView.invalidate();
        }
        return true;
    }
}
