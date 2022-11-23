package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: classes.dex */
public class MaterialAlertDialogBuilder extends AlertDialog.Builder {
    private static final int DEF_STYLE_ATTR = R.attr.alertDialogStyle;
    private static final int DEF_STYLE_RES = R.style.MaterialAlertDialog_MaterialComponents;
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = R.attr.materialAlertDialogTheme;
    private Drawable background;
    private final Rect backgroundInsets;

    private static int getMaterialAlertDialogThemeOverlay(Context context) {
        TypedValue resolve = MaterialAttributes.resolve(context, MATERIAL_ALERT_DIALOG_THEME_OVERLAY);
        if (resolve == null) {
            return 0;
        }
        return resolve.data;
    }

    private static Context createMaterialAlertDialogThemedContext(Context context) {
        int materialAlertDialogThemeOverlay = getMaterialAlertDialogThemeOverlay(context);
        Context wrap = MaterialThemeOverlay.wrap(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        return materialAlertDialogThemeOverlay == 0 ? wrap : new ContextThemeWrapper(wrap, materialAlertDialogThemeOverlay);
    }

    private static int getOverridingThemeResId(Context context, int i) {
        return i == 0 ? getMaterialAlertDialogThemeOverlay(context) : i;
    }

    public MaterialAlertDialogBuilder(Context context) {
        this(context, 0);
    }

    public MaterialAlertDialogBuilder(Context context, int i) {
        super(createMaterialAlertDialogThemedContext(context), getOverridingThemeResId(context, i));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i2 = DEF_STYLE_ATTR;
        int i3 = DEF_STYLE_RES;
        this.backgroundInsets = MaterialDialogs.getDialogBackgroundInsets(context2, i2, i3);
        int color = MaterialColors.getColor(context2, R.attr.colorSurface, getClass().getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, i2, i3);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                materialShapeDrawable.setCornerSize(dimension);
            }
        }
        this.background = materialShapeDrawable;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    public AlertDialog create() {
        AlertDialog create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.background;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(ViewCompat.getElevation(decorView));
        }
        window.setBackgroundDrawable(MaterialDialogs.insetDrawable(this.background, this.backgroundInsets));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(create, this.backgroundInsets));
        return create;
    }

    public Drawable getBackground() {
        return this.background;
    }

    public MaterialAlertDialogBuilder setBackground(Drawable drawable) {
        this.background = drawable;
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetStart(int i) {
        if (Build.VERSION.SDK_INT >= 17 && getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.right = i;
        } else {
            this.backgroundInsets.left = i;
        }
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetTop(int i) {
        this.backgroundInsets.top = i;
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetEnd(int i) {
        if (Build.VERSION.SDK_INT >= 17 && getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.left = i;
        } else {
            this.backgroundInsets.right = i;
        }
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetBottom(int i) {
        this.backgroundInsets.bottom = i;
        return this;
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setTitle  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo219setTitle(int i) {
        return (MaterialAlertDialogBuilder) super.mo219setTitle(i);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setTitle  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo220setTitle(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.mo220setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setCustomTitle  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo191setCustomTitle(View view) {
        return (MaterialAlertDialogBuilder) super.mo191setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setMessage  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo197setMessage(int i) {
        return (MaterialAlertDialogBuilder) super.mo197setMessage(i);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setMessage  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo198setMessage(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.mo198setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setIcon  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo192setIcon(int i) {
        return (MaterialAlertDialogBuilder) super.mo192setIcon(i);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setIcon  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo193setIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.mo193setIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setIconAttribute  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo194setIconAttribute(int i) {
        return (MaterialAlertDialogBuilder) super.mo194setIconAttribute(i);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setPositiveButton  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo212setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo212setPositiveButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setPositiveButton  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo213setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo213setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setPositiveButtonIcon  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo214setPositiveButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.mo214setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setNegativeButton  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo202setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo202setNegativeButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setNegativeButton  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo203setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo203setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setNegativeButtonIcon  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo204setNegativeButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.mo204setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setNeutralButton  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo205setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo205setNeutralButton(i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setNeutralButton  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo206setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo206setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setNeutralButtonIcon  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo207setNeutralButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.mo207setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setCancelable  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo189setCancelable(boolean z) {
        return (MaterialAlertDialogBuilder) super.mo189setCancelable(z);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setOnCancelListener  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo208setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return (MaterialAlertDialogBuilder) super.mo208setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setOnDismissListener  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo209setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return (MaterialAlertDialogBuilder) super.mo209setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setOnKeyListener  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo211setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        return (MaterialAlertDialogBuilder) super.mo211setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setItems  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo195setItems(int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo195setItems(i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setItems  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo196setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo196setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setAdapter  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo188setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo188setAdapter(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setCursor  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo190setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        return (MaterialAlertDialogBuilder) super.mo190setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setMultiChoiceItems  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo199setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.mo199setMultiChoiceItems(i, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setMultiChoiceItems  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo201setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.mo201setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setMultiChoiceItems  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo200setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.mo200setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setSingleChoiceItems  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo215setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo215setSingleChoiceItems(i, i2, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setSingleChoiceItems  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo216setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo216setSingleChoiceItems(cursor, i, str, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setSingleChoiceItems  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo218setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo218setSingleChoiceItems(charSequenceArr, i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setSingleChoiceItems  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo217setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.mo217setSingleChoiceItems(listAdapter, i, onClickListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setOnItemSelectedListener  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo210setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (MaterialAlertDialogBuilder) super.mo210setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setView  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo221setView(int i) {
        return (MaterialAlertDialogBuilder) super.mo221setView(i);
    }

    @Override // androidx.appcompat.app.AlertDialog.Builder
    /* renamed from: setView  reason: collision with other method in class */
    public MaterialAlertDialogBuilder mo222setView(View view) {
        return (MaterialAlertDialogBuilder) super.mo222setView(view);
    }
}