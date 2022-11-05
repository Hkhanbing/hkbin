package b.b.a.a.b0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f1368a;

    public e(TimePickerView timePickerView) {
        this.f1368a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView timePickerView = this.f1368a;
        int i = TimePickerView.y;
        Objects.requireNonNull(timePickerView);
        return false;
    }
}
