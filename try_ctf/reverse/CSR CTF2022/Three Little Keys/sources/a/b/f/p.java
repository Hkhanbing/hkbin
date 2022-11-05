package a.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public class p extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    public final f f266a;

    /* renamed from: b  reason: collision with root package name */
    public final q f267b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f268c;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.a(context);
        this.f268c = false;
        y0.a(this, getContext());
        f fVar = new f(this);
        this.f266a = fVar;
        fVar.d(attributeSet, i);
        q qVar = new q(this);
        this.f267b = qVar;
        qVar.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f266a;
        if (fVar != null) {
            fVar.a();
        }
        q qVar = this.f267b;
        if (qVar != null) {
            qVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f266a;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f266a;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        b1 b1Var;
        q qVar = this.f267b;
        if (qVar == null || (b1Var = qVar.f271b) == null) {
            return null;
        }
        return b1Var.f177a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        b1 b1Var;
        q qVar = this.f267b;
        if (qVar == null || (b1Var = qVar.f271b) == null) {
            return null;
        }
        return b1Var.f178b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.f267b.f270a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f266a;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f266a;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        q qVar = this.f267b;
        if (qVar != null) {
            qVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        q qVar = this.f267b;
        if (qVar != null && drawable != null && !this.f268c) {
            qVar.f272c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        q qVar2 = this.f267b;
        if (qVar2 != null) {
            qVar2.a();
            if (this.f268c) {
                return;
            }
            q qVar3 = this.f267b;
            if (qVar3.f270a.getDrawable() == null) {
                return;
            }
            qVar3.f270a.getDrawable().setLevel(qVar3.f272c);
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f268c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f267b.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        q qVar = this.f267b;
        if (qVar != null) {
            qVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f266a;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f266a;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        q qVar = this.f267b;
        if (qVar != null) {
            qVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        q qVar = this.f267b;
        if (qVar != null) {
            qVar.e(mode);
        }
    }
}
