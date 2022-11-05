package b.b.a.a.h;

import a.h.j.w;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import b.b.a.a.w.g;
import b.b.a.a.w.j;
import b.b.a.a.w.n;
import com.google.android.material.button.MaterialButton;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f1431a;

    /* renamed from: b  reason: collision with root package name */
    public j f1432b;

    /* renamed from: c  reason: collision with root package name */
    public int f1433c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public LayerDrawable r;
    public int s;

    public a(MaterialButton materialButton, j jVar) {
        this.f1431a = materialButton;
        this.f1432b = jVar;
    }

    public n a() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.r.getNumberOfLayers() > 2 ? this.r.getDrawable(2) : this.r.getDrawable(1));
    }

    public g b() {
        return c(false);
    }

    public final g c(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final g d() {
        return c(true);
    }

    public void e(j jVar) {
        this.f1432b = jVar;
        if (b() != null) {
            g b2 = b();
            b2.f1578a.f1582a = jVar;
            b2.invalidateSelf();
        }
        if (d() != null) {
            g d = d();
            d.f1578a.f1582a = jVar;
            d.invalidateSelf();
        }
        if (a() != null) {
            a().setShapeAppearanceModel(jVar);
        }
    }

    public final void f(int i, int i2) {
        MaterialButton materialButton = this.f1431a;
        AtomicInteger atomicInteger = w.f667a;
        int f = w.e.f(materialButton);
        int paddingTop = this.f1431a.getPaddingTop();
        int e = w.e.e(this.f1431a);
        int paddingBottom = this.f1431a.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            g();
        }
        w.e.k(this.f1431a, f, (paddingTop + i) - i3, e, (paddingBottom + i2) - i4);
    }

    public final void g() {
        MaterialButton materialButton = this.f1431a;
        g gVar = new g(this.f1432b);
        gVar.o(this.f1431a.getContext());
        gVar.setTintList(this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            gVar.setTintMode(mode);
        }
        gVar.t(this.h, this.k);
        g gVar2 = new g(this.f1432b);
        gVar2.setTint(0);
        gVar2.s(this.h, this.n ? b.b.a.a.a.f(this.f1431a, R.attr.colorSurface) : 0);
        g gVar3 = new g(this.f1432b);
        this.m = gVar3;
        gVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(b.b.a.a.u.a.a(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f1433c, this.e, this.d, this.f), this.m);
        this.r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b2 = b();
        if (b2 != null) {
            b2.p(this.s);
        }
    }

    public final void h() {
        g b2 = b();
        g d = d();
        if (b2 != null) {
            b2.t(this.h, this.k);
            if (d == null) {
                return;
            }
            d.s(this.h, this.n ? b.b.a.a.a.f(this.f1431a, R.attr.colorSurface) : 0);
        }
    }
}
