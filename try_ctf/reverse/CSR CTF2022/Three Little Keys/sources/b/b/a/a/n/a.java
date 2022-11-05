package b.b.a.a.n;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final Dialog f1502a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1503b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1504c;
    public final int d;

    public a(Dialog dialog, Rect rect) {
        this.f1502a = dialog;
        this.f1503b = rect.left;
        this.f1504c = rect.top;
        this.d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f1503b;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f1504c;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        view.performClick();
        return this.f1502a.onTouchEvent(obtain);
    }
}
