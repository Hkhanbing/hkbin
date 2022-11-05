package androidx.appcompat.widget;

import a.b.c.j;
import a.b.c.l;
import a.b.e.i.g;
import a.b.f.i0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public TypedValue f1188a;

    /* renamed from: b  reason: collision with root package name */
    public TypedValue f1189b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f1190c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public final Rect g;
    public a h;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1190c == null) {
            this.f1190c = new TypedValue();
        }
        return this.f1190c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1188a == null) {
            this.f1188a = new TypedValue();
        }
        return this.f1188a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1189b == null) {
            this.f1189b = new TypedValue();
        }
        return this.f1189b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.h;
        if (aVar != null) {
            Objects.requireNonNull((l) aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.h;
        if (aVar != null) {
            j jVar = ((l) aVar).f45a;
            i0 i0Var = jVar.k;
            if (i0Var != null) {
                i0Var.j();
            }
            if (jVar.p != null) {
                jVar.e.getDecorView().removeCallbacks(jVar.q);
                if (jVar.p.isShowing()) {
                    try {
                        jVar.p.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                jVar.p = null;
            }
            jVar.I();
            g gVar = jVar.N(0).h;
            if (gVar == null) {
                return;
            }
            gVar.c(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.h = aVar;
    }
}
