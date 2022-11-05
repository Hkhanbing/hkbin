package a.h.j.d0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f629a;

    /* renamed from: b  reason: collision with root package name */
    public final d f630b;

    /* renamed from: c  reason: collision with root package name */
    public final int f631c;

    public a(int i, d dVar, int i2) {
        this.f629a = i;
        this.f630b = dVar;
        this.f631c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f629a);
        d dVar = this.f630b;
        dVar.f633a.performAction(this.f631c, bundle);
    }
}
