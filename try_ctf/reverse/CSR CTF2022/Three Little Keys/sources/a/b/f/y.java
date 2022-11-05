package a.b.f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public class y extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    public final z f308a;

    public y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        y0.a(this, getContext());
        z zVar = new z(this);
        this.f308a = zVar;
        zVar.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        z zVar = this.f308a;
        Drawable drawable = zVar.e;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(zVar.d.getDrawableState())) {
            return;
        }
        zVar.d.invalidateDrawable(drawable);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f308a.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f308a.d(canvas);
    }
}
