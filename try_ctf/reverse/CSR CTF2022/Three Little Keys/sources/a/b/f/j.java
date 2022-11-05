package a.b.f;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f232a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f233b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f234c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public j(CheckedTextView checkedTextView) {
        this.f232a = checkedTextView;
    }

    public void a() {
        Drawable checkMarkDrawable = this.f232a.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (!this.d && !this.e) {
                return;
            }
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.d) {
                mutate.setTintList(this.f233b);
            }
            if (this.e) {
                mutate.setTintMode(this.f234c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f232a.getDrawableState());
            }
            this.f232a.setCheckMarkDrawable(mutate);
        }
    }
}
