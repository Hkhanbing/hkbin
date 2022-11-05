package a.b.f;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* loaded from: classes.dex */
public class c extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f180a;

    public c(ActionBarContainer actionBarContainer) {
        this.f180a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f180a;
        if (actionBarContainer.h) {
            Drawable drawable = actionBarContainer.g;
            if (drawable == null) {
                return;
            }
            drawable.draw(canvas);
            return;
        }
        Drawable drawable2 = actionBarContainer.e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f180a;
        Drawable drawable3 = actionBarContainer2.f;
        if (drawable3 == null || !actionBarContainer2.i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f180a;
        if (actionBarContainer.h) {
            drawable = actionBarContainer.g;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.e;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
