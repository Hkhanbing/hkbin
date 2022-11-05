package a.b.f;

import a.b.f.l;
import a.h.c.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import de.cybersecurityrumble.threelittlekeys.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class t0 {
    public static t0 i;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, a.e.i<ColorStateList>> f287a;

    /* renamed from: b  reason: collision with root package name */
    public a.e.h<String, b> f288b;

    /* renamed from: c  reason: collision with root package name */
    public a.e.i<String> f289c;
    public final WeakHashMap<Context, a.e.e<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    public TypedValue e;
    public boolean f;
    public c g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final a j = new a(6);

    /* loaded from: classes.dex */
    public static class a extends a.e.f<Integer, PorterDuffColorFilter> {
        public a(int i) {
            super(i);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public static synchronized t0 c() {
        t0 t0Var;
        synchronized (t0.class) {
            if (i == null) {
                i = new t0();
            }
            t0Var = i;
        }
        return t0Var;
    }

    public static synchronized PorterDuffColorFilter g(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (t0.class) {
            a aVar = j;
            Objects.requireNonNull(aVar);
            int i3 = (i2 + 31) * 31;
            a2 = aVar.a(Integer.valueOf(mode.hashCode() + i3));
            if (a2 == null) {
                a2 = new PorterDuffColorFilter(i2, mode);
                Objects.requireNonNull(aVar);
                aVar.b(Integer.valueOf(mode.hashCode() + i3), a2);
            }
        }
        return a2;
    }

    public final synchronized boolean a(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            a.e.e<WeakReference<Drawable.ConstantState>> eVar = this.d.get(context);
            if (eVar == null) {
                eVar = new a.e.e<>();
                this.d.put(context, eVar);
            }
            eVar.f(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final Drawable b(Context context, int i2) {
        int i3;
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable d = d(context, j2);
        if (d != null) {
            return d;
        }
        c cVar = this.g;
        LayerDrawable layerDrawable = null;
        if (cVar != null) {
            l.a aVar = (l.a) cVar;
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i2 == R.drawable.abc_ratingbar_material) {
                    i3 = R.dimen.abc_star_big;
                } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                    i3 = R.dimen.abc_star_medium;
                } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                    i3 = R.dimen.abc_star_small;
                }
                layerDrawable = aVar.c(this, context, i3);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable d(Context context, long j2) {
        a.e.e<WeakReference<Drawable.ConstantState>> eVar = this.d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> e = eVar.e(j2, null);
        if (e != null) {
            Drawable.ConstantState constantState = e.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b2 = a.e.d.b(eVar.f339b, eVar.d, j2);
            if (b2 >= 0) {
                Object[] objArr = eVar.f340c;
                Object obj = objArr[b2];
                Object obj2 = a.e.e.e;
                if (obj != obj2) {
                    objArr[b2] = obj2;
                    eVar.f338a = true;
                }
            }
        }
        return null;
    }

    public synchronized Drawable e(Context context, int i2) {
        return f(context, i2, false);
    }

    public synchronized Drawable f(Context context, int i2, boolean z) {
        Drawable i3;
        if (!this.f) {
            boolean z2 = true;
            this.f = true;
            Drawable e = e(context, R.drawable.abc_vector_test);
            if (e != null) {
                if (!(e instanceof a.t.a.a.b) && !"android.graphics.drawable.VectorDrawable".equals(e.getClass().getName())) {
                    z2 = false;
                }
            }
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        i3 = i(context, i2);
        if (i3 == null) {
            i3 = b(context, i2);
        }
        if (i3 == null) {
            Object obj = a.h.c.a.f500a;
            i3 = a.b.b(context, i2);
        }
        if (i3 != null) {
            i3 = j(context, i2, z, i3);
        }
        if (i3 != null) {
            k0.b(i3);
        }
        return i3;
    }

    public synchronized ColorStateList h(Context context, int i2) {
        ColorStateList d;
        a.e.i<ColorStateList> iVar;
        WeakHashMap<Context, a.e.i<ColorStateList>> weakHashMap = this.f287a;
        ColorStateList colorStateList = null;
        d = (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) ? null : iVar.d(i2, null);
        if (d == null) {
            c cVar = this.g;
            if (cVar != null) {
                colorStateList = ((l.a) cVar).d(context, i2);
            }
            if (colorStateList != null) {
                if (this.f287a == null) {
                    this.f287a = new WeakHashMap<>();
                }
                a.e.i<ColorStateList> iVar2 = this.f287a.get(context);
                if (iVar2 == null) {
                    iVar2 = new a.e.i<>();
                    this.f287a.put(context, iVar2);
                }
                iVar2.a(i2, colorStateList);
            }
            d = colorStateList;
        }
        return d;
    }

    public final Drawable i(Context context, int i2) {
        int next;
        a.e.h<String, b> hVar = this.f288b;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        a.e.i<String> iVar = this.f289c;
        if (iVar != null) {
            String d = iVar.d(i2, null);
            if ("appcompat_skip_skip".equals(d) || (d != null && this.f288b.getOrDefault(d, null) == null)) {
                return null;
            }
        } else {
            this.f289c = new a.e.i<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable d2 = d(context, j2);
        if (d2 != null) {
            return d2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f289c.a(i2, name);
                b bVar = this.f288b.get(name);
                if (bVar != null) {
                    d2 = bVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (d2 != null) {
                    d2.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, j2, d2);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (d2 == null) {
            this.f289c.a(i2, "appcompat_skip_skip");
        }
        return d2;
    }

    public final Drawable j(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList h2 = h(context, i2);
        PorterDuff.Mode mode = null;
        if (h2 != null) {
            if (k0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(h2);
            c cVar = this.g;
            if (cVar != null) {
                l.a aVar = (l.a) cVar;
                if (i2 == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return drawable;
            }
            drawable.setTintMode(mode);
            return drawable;
        }
        c cVar2 = this.g;
        if (cVar2 != null) {
            l.a aVar2 = (l.a) cVar2;
            Objects.requireNonNull(aVar2);
            boolean z2 = true;
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c2 = y0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = l.f240b;
                aVar2.e(findDrawableByLayerId, c2, mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908303), y0.c(context, R.attr.colorControlNormal), mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908301), y0.c(context, R.attr.colorControlActivated), mode2);
            } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b2 = y0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = l.f240b;
                aVar2.e(findDrawableByLayerId2, b2, mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908303), y0.c(context, R.attr.colorControlActivated), mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908301), y0.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (!k(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            a.b.f.t0$c r0 = r7.g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L72
            a.b.f.l$a r0 = (a.b.f.l.a) r0
            java.util.Objects.requireNonNull(r0)
            android.graphics.PorterDuff$Mode r3 = a.b.f.l.f240b
            int[] r4 = r0.f243a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L1d
            r5 = 2130903264(0x7f0300e0, float:1.7413341E38)
            goto L49
        L1d:
            int[] r4 = r0.f245c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L29
            r5 = 2130903262(0x7f0300de, float:1.7413337E38)
            goto L49
        L29:
            int[] r4 = r0.d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L34
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L49
        L34:
            r0 = 2131165228(0x7f07002c, float:1.7944667E38)
            if (r9 != r0) goto L44
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L4b
        L44:
            r0 = 2131165210(0x7f07001a, float:1.794463E38)
            if (r9 != r0) goto L4d
        L49:
            r9 = r5
            r0 = r6
        L4b:
            r4 = r1
            goto L50
        L4d:
            r9 = r2
            r4 = r9
            r0 = r6
        L50:
            if (r4 == 0) goto L6e
            boolean r4 = a.b.f.k0.a(r10)
            if (r4 == 0) goto L5c
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L5c:
            int r8 = a.b.f.y0.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = a.b.f.l.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L6c
            r10.setAlpha(r0)
        L6c:
            r8 = r1
            goto L6f
        L6e:
            r8 = r2
        L6f:
            if (r8 == 0) goto L72
            goto L73
        L72:
            r1 = r2
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.f.t0.k(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
