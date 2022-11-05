package b.b.a.a.m;

import a.h.j.w;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.a.a.m.a;
import com.google.android.material.internal.CheckableImageButton;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o<S> extends a.l.b.l {
    public static final /* synthetic */ int E0 = 0;
    public CheckableImageButton A0;
    public b.b.a.a.w.g B0;
    public Button C0;
    public boolean D0;
    public final LinkedHashSet<r<? super S>> i0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> j0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> k0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> l0 = new LinkedHashSet<>();
    public int m0;
    public d<S> n0;
    public y<S> o0;
    public b.b.a.a.m.a p0;
    public g<S> q0;
    public int r0;
    public CharSequence s0;
    public boolean t0;
    public int u0;
    public int v0;
    public CharSequence w0;
    public int x0;
    public CharSequence y0;
    public TextView z0;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<r<? super S>> it = o.this.i0.iterator();
            while (it.hasNext()) {
                it.next().a((S) o.this.w0().a());
            }
            o.this.t0(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<View.OnClickListener> it = o.this.j0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            o.this.t0(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class c extends x<S> {
        public c() {
        }

        @Override // b.b.a.a.m.x
        public void a(S s) {
            o oVar = o.this;
            int i = o.E0;
            oVar.B0();
            o oVar2 = o.this;
            oVar2.C0.setEnabled(oVar2.w0().b());
        }
    }

    public static int x0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d = b0.d();
        d.set(5, 1);
        Calendar b2 = b0.b(d);
        b2.get(2);
        b2.get(1);
        int maximum = b2.getMaximum(7);
        b2.getActualMaximum(5);
        b2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean y0(Context context) {
        return z0(context, 16843277);
    }

    public static boolean z0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.b.a.a.a.y(context, R.attr.materialCalendarStyle, g.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final void A0() {
        y<S> yVar;
        Context i0 = i0();
        int i = this.m0;
        if (i == 0) {
            i = w0().f(i0);
        }
        d<S> w0 = w0();
        b.b.a.a.m.a aVar = this.p0;
        g<S> gVar = new g<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", w0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.d);
        gVar.n0(bundle);
        this.q0 = gVar;
        if (this.A0.isChecked()) {
            d<S> w02 = w0();
            b.b.a.a.m.a aVar2 = this.p0;
            yVar = new s<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", w02);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            yVar.n0(bundle2);
        } else {
            yVar = this.q0;
        }
        this.o0 = yVar;
        B0();
        a.l.b.a aVar3 = new a.l.b.a(i());
        aVar3.e(R.id.mtrl_calendar_frame, this.o0, null, 2);
        if (!aVar3.g) {
            aVar3.p.D(aVar3, false);
            this.o0.t0(new c());
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void B0() {
        String d = w0().d(j());
        this.z0.setContentDescription(String.format(B(R.string.mtrl_picker_announce_current_selection), d));
        this.z0.setText(d);
    }

    public final void C0(CheckableImageButton checkableImageButton) {
        this.A0.setContentDescription(checkableImageButton.getContext().getString(this.A0.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // a.l.b.l, a.l.b.m
    public final void L(Bundle bundle) {
        super.L(bundle);
        if (bundle == null) {
            bundle = this.f;
        }
        this.m0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.n0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.p0 = (b.b.a.a.m.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.r0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.s0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.u0 = bundle.getInt("INPUT_MODE_KEY");
        this.v0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.w0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.x0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.y0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // a.l.b.m
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        View inflate = layoutInflater.inflate(this.t0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.t0) {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(x0(context), -2);
        } else {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(x0(context), -1);
        }
        findViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.z0 = textView;
        AtomicInteger atomicInteger = a.h.j.w.f667a;
        w.g.f(textView, 1);
        this.A0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.s0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.r0);
        }
        this.A0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.A0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, a.b.a.e(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], a.b.a.e(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.A0.setChecked(this.u0 != 0);
        a.h.j.w.p(this.A0, null);
        C0(this.A0);
        this.A0.setOnClickListener(new q(this));
        this.C0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (w0().b()) {
            this.C0.setEnabled(true);
        } else {
            this.C0.setEnabled(false);
        }
        this.C0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence2 = this.w0;
        if (charSequence2 != null) {
            this.C0.setText(charSequence2);
        } else {
            int i = this.v0;
            if (i != 0) {
                this.C0.setText(i);
            }
        }
        this.C0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.y0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.x0;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // a.l.b.l, a.l.b.m
    public final void Z(Bundle bundle) {
        super.Z(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.m0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.n0);
        a.b bVar = new a.b(this.p0);
        t tVar = this.q0.X;
        if (tVar != null) {
            bVar.f1450c = Long.valueOf(tVar.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.d);
        t l = t.l(bVar.f1448a);
        t l2 = t.l(bVar.f1449b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l3 = bVar.f1450c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b.b.a.a.m.a(l, l2, cVar, l3 == null ? null : t.l(l3.longValue()), null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.r0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.s0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.v0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.w0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.x0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.y0);
    }

    @Override // a.l.b.l, a.l.b.m
    public void a0() {
        super.a0();
        Window window = v0().getWindow();
        if (this.t0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.B0);
            if (!this.D0) {
                View findViewById = j0().findViewById(R.id.fullscreen_header);
                a.h.j.c0 c0Var = null;
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int e = b.b.a.a.a.e(window.getContext(), 16842801, -16777216);
                if (z2) {
                    valueOf = Integer.valueOf(e);
                }
                Integer valueOf2 = Integer.valueOf(e);
                if (i >= 30) {
                    window.setDecorFitsSystemWindows(false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z3 = b.b.a.a.a.k(0) || b.b.a.a.a.k(valueOf.intValue());
                boolean k = b.b.a.a.a.k(valueOf2.intValue());
                if (b.b.a.a.a.k(0) || k) {
                    z = true;
                }
                View decorView2 = window.getDecorView();
                if (i >= 30) {
                    WindowInsetsController insetsController = window.getInsetsController();
                    if (insetsController != null) {
                        c0Var = new a.h.j.c0(insetsController);
                    }
                } else {
                    c0Var = new a.h.j.c0(window, decorView2);
                }
                if (c0Var != null) {
                    c0Var.f624a.b(z3);
                    c0Var.f624a.a(z);
                }
                p pVar = new p(this, findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                AtomicInteger atomicInteger = a.h.j.w.f667a;
                w.i.u(findViewById, pVar);
                this.D0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = x().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.B0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new b.b.a.a.n.a(v0(), rect));
        }
        A0();
    }

    @Override // a.l.b.l, a.l.b.m
    public void b0() {
        this.o0.T.clear();
        this.C = true;
        Dialog dialog = this.e0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // a.l.b.l, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.k0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // a.l.b.l, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.l0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // a.l.b.l
    public final Dialog u0(Bundle bundle) {
        Context i0 = i0();
        Context i02 = i0();
        int i = this.m0;
        if (i == 0) {
            i = w0().f(i02);
        }
        Dialog dialog = new Dialog(i0, i);
        Context context = dialog.getContext();
        this.t0 = y0(context);
        int y = b.b.a.a.a.y(context, R.attr.colorSurface, o.class.getCanonicalName());
        b.b.a.a.w.g gVar = new b.b.a.a.w.g(b.b.a.a.w.j.b(context, null, R.attr.materialCalendarStyle, 2131821529).a());
        this.B0 = gVar;
        gVar.f1578a.f1583b = new b.b.a.a.o.a(context);
        gVar.x();
        this.B0.q(ColorStateList.valueOf(y));
        b.b.a.a.w.g gVar2 = this.B0;
        View decorView = dialog.getWindow().getDecorView();
        AtomicInteger atomicInteger = a.h.j.w.f667a;
        gVar2.p(w.i.i(decorView));
        return dialog;
    }

    public final d<S> w0() {
        if (this.n0 == null) {
            this.n0 = (d) this.f.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.n0;
    }
}
