package androidx.appcompat.view.menu;

import a.b.b;
import a.b.e.i.i;
import a.b.e.i.n;
import a.b.f.d1;
import a.h.j.w;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    public i f1167a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f1168b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f1169c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView g;
    public ImageView h;
    public LinearLayout i;
    public Drawable j;
    public int k;
    public Context l;
    public boolean m;
    public Drawable n;
    public boolean o;
    public LayoutInflater p;
    public boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d1 q = d1.q(getContext(), attributeSet, b.r, R.attr.listMenuViewStyle, 0);
        this.j = q.g(5);
        this.k = q.l(1, -1);
        this.m = q.a(7, false);
        this.l = context;
        this.n = q.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.o = obtainStyledAttributes.hasValue(0);
        q.f193b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.p == null) {
            this.p = LayoutInflater.from(getContext());
        }
        return this.p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.e = checkBox;
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
        rect.top = this.h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f1169c = radioButton;
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public void c(boolean z) {
        int i;
        String sb;
        int i2 = (!z || !this.f1167a.m()) ? 8 : 0;
        if (i2 == 0) {
            TextView textView = this.f;
            i iVar = this.f1167a;
            char e = iVar.e();
            if (e == 0) {
                sb = "";
            } else {
                Resources resources = iVar.n.f129a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(iVar.n.f129a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = iVar.n.n() ? iVar.k : iVar.i;
                i.c(sb2, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                i.c(sb2, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                i.c(sb2, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                i.c(sb2, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                i.c(sb2, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                i.c(sb2, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e == '\b') {
                    i = R.string.abc_menu_delete_shortcut_label;
                } else if (e == '\n') {
                    i = R.string.abc_menu_enter_shortcut_label;
                } else if (e != ' ') {
                    sb2.append(e);
                    sb = sb2.toString();
                } else {
                    i = R.string.abc_menu_space_shortcut_label;
                }
                sb2.append(resources.getString(i));
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f.getVisibility() != i2) {
            this.f.setVisibility(i2);
        }
    }

    @Override // a.b.e.i.n.a
    public void d(i iVar, int i) {
        this.f1167a = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.e);
        setCheckable(iVar.isCheckable());
        boolean m = iVar.m();
        iVar.e();
        c(m);
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.q);
    }

    @Override // a.b.e.i.n.a
    public i getItemData() {
        return this.f1167a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.j;
        AtomicInteger atomicInteger = w.f667a;
        w.d.q(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.k;
        if (i != -1) {
            textView.setTextAppearance(this.l, i);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1168b != null && this.m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1168b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f1169c == null && this.e == null) {
            return;
        }
        if (this.f1167a.h()) {
            if (this.f1169c == null) {
                b();
            }
            compoundButton = this.f1169c;
            compoundButton2 = this.e;
        } else {
            if (this.e == null) {
                a();
            }
            compoundButton = this.e;
            compoundButton2 = this.f1169c;
        }
        if (z) {
            compoundButton.setChecked(this.f1167a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1169c;
        if (radioButton == null) {
            return;
        }
        radioButton.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1167a.h()) {
            if (this.f1169c == null) {
                b();
            }
            compoundButton = this.f1169c;
        } else {
            if (this.e == null) {
                a();
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.q = z;
        this.m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility((this.o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f1167a.n);
        boolean z = this.q;
        if (z || this.m) {
            ImageView imageView = this.f1168b;
            if (imageView == null && drawable == null && !this.m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1168b = imageView2;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.m) {
                this.f1168b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1168b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1168b.getVisibility() == 0) {
                return;
            }
            this.f1168b.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.d.setText(charSequence);
            if (this.d.getVisibility() == 0) {
                return;
            }
            textView = this.d;
            i = 0;
        } else {
            i = 8;
            if (this.d.getVisibility() == 8) {
                return;
            }
            textView = this.d;
        }
        textView.setVisibility(i);
    }
}
