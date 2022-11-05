package com.google.android.material.theme;

import a.b.c.p;
import a.b.f.e;
import a.b.f.f0;
import a.b.f.g;
import a.b.f.h;
import a.b.f.v;
import android.content.Context;
import android.util.AttributeSet;
import b.b.a.a.j.a;
import b.b.a.a.z.q;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends p {
    @Override // a.b.c.p
    public e a(Context context, AttributeSet attributeSet) {
        return new q(context, attributeSet);
    }

    @Override // a.b.c.p
    public g b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // a.b.c.p
    public h c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // a.b.c.p
    public v d(Context context, AttributeSet attributeSet) {
        return new b.b.a.a.s.a(context, attributeSet);
    }

    @Override // a.b.c.p
    public f0 e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
