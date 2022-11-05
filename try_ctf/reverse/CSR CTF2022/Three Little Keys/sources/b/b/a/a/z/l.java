package b.b.a.a.z;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class l implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f1641a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f1642b;

    public l(h hVar, AutoCompleteTextView autoCompleteTextView) {
        this.f1642b = hVar;
        this.f1641a = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f1642b.m()) {
                this.f1642b.l = false;
            }
            h.h(this.f1642b, this.f1641a);
            h.i(this.f1642b);
        }
        return false;
    }
}
