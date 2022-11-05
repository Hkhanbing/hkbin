package b.b.a.a.b0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.timepicker.TimePickerView;

/* loaded from: classes.dex */
public class f implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f1369a;

    public f(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.f1369a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f1369a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
