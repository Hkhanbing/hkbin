package a.b.f;

import a.b.f.t0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import de.cybersecurityrumble.threelittlekeys.R;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f240b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static l f241c;

    /* renamed from: a  reason: collision with root package name */
    public t0 f242a;

    /* loaded from: classes.dex */
    public class a implements t0.c {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f243a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f244b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f245c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        public final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i) {
            int c2 = y0.c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{y0.f310b, y0.d, y0.f311c, y0.f}, new int[]{y0.b(context, R.attr.colorButtonNormal), a.h.d.a.b(c2, i), a.h.d.a.b(c2, i), i});
        }

        public final LayerDrawable c(t0 t0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable e = t0Var.e(context, R.drawable.abc_star_black_48dp);
            Drawable e2 = t0Var.e(context, R.drawable.abc_star_half_black_48dp);
            if ((e instanceof BitmapDrawable) && e.getIntrinsicWidth() == dimensionPixelSize && e.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) e;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                e.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((e2 instanceof BitmapDrawable) && e2.getIntrinsicWidth() == dimensionPixelSize && e2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) e2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                e2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public ColorStateList d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return a.b.a.d(context, R.color.abc_tint_edittext);
            }
            if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                return a.b.a.d(context, R.color.abc_tint_switch_track);
            }
            if (i == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList d = y0.d(context, R.attr.colorSwitchThumbNormal);
                if (d == null || !d.isStateful()) {
                    iArr[0] = y0.f310b;
                    iArr2[0] = y0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = y0.e;
                    iArr2[1] = y0.c(context, R.attr.colorControlActivated);
                    iArr[2] = y0.f;
                    iArr2[2] = y0.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = y0.f310b;
                    iArr2[0] = d.getColorForState(iArr[0], 0);
                    iArr[1] = y0.e;
                    iArr2[1] = y0.c(context, R.attr.colorControlActivated);
                    iArr[2] = y0.f;
                    iArr2[2] = d.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, y0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(context, y0.c(context, R.attr.colorAccent));
                }
                if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    return a.b.a.d(context, R.color.abc_tint_spinner);
                }
                if (a(this.f244b, i)) {
                    return y0.d(context, R.attr.colorControlNormal);
                }
                if (a(this.e, i)) {
                    return a.b.a.d(context, R.color.abc_tint_default);
                }
                if (a(this.f, i)) {
                    return a.b.a.d(context, R.color.abc_tint_btn_checkable);
                }
                if (i != R.drawable.abc_seekbar_thumb_material) {
                    return null;
                }
                return a.b.a.d(context, R.color.abc_tint_seek_thumb);
            }
        }

        public final void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (k0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = l.f240b;
            }
            drawable.setColorFilter(l.c(i, mode));
        }
    }

    public static synchronized l a() {
        l lVar;
        synchronized (l.class) {
            if (f241c == null) {
                e();
            }
            lVar = f241c;
        }
        return lVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter g;
        synchronized (l.class) {
            g = t0.g(i, mode);
        }
        return g;
    }

    public static synchronized void e() {
        synchronized (l.class) {
            if (f241c == null) {
                l lVar = new l();
                f241c = lVar;
                lVar.f242a = t0.c();
                t0 t0Var = f241c.f242a;
                a aVar = new a();
                synchronized (t0Var) {
                    t0Var.g = aVar;
                }
            }
        }
    }

    public static void f(Drawable drawable, b1 b1Var, int[] iArr) {
        PorterDuff.Mode mode = t0.h;
        if (k0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = b1Var.d;
        if (!z && !b1Var.f179c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? b1Var.f177a : null;
        PorterDuff.Mode mode2 = b1Var.f179c ? b1Var.f178b : t0.h;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = t0.g(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public synchronized Drawable b(Context context, int i) {
        return this.f242a.e(context, i);
    }

    public synchronized ColorStateList d(Context context, int i) {
        return this.f242a.h(context, i);
    }
}
