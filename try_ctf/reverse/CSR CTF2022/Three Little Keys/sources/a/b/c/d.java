package a.b.c;

import a.b.f.o0;
import a.h.j.w;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class d extends o implements DialogInterface {

    /* renamed from: c  reason: collision with root package name */
    public final AlertController f21c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f22a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23b;

        public a(Context context) {
            int d = d.d(context, 0);
            this.f22a = new AlertController.b(new ContextThemeWrapper(context, d.d(context, d)));
            this.f23b = d;
        }

        public d a() {
            d dVar = new d(this.f22a.f1161a, this.f23b);
            AlertController.b bVar = this.f22a;
            AlertController alertController = dVar.f21c;
            View view = bVar.e;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.d;
                if (charSequence != null) {
                    alertController.e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f1163c;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
            }
            if (bVar.g != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f1162b.inflate(alertController.L, (ViewGroup) null);
                int i = bVar.i ? alertController.N : alertController.O;
                ListAdapter listAdapter = bVar.g;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.f1161a, i, 16908308, null);
                }
                alertController.H = listAdapter;
                alertController.I = bVar.j;
                if (bVar.h != null) {
                    recycleListView.setOnItemClickListener(new c(bVar, alertController));
                }
                if (bVar.i) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.g = recycleListView;
            }
            Objects.requireNonNull(this.f22a);
            dVar.setCancelable(true);
            Objects.requireNonNull(this.f22a);
            dVar.setCanceledOnTouchOutside(true);
            Objects.requireNonNull(this.f22a);
            dVar.setOnCancelListener(null);
            Objects.requireNonNull(this.f22a);
            dVar.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.f22a.f;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }
    }

    public d(Context context, int i) {
        super(context, d(context, i));
        this.f21c = new AlertController(getContext(), this, getWindow());
    }

    public static int d(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // a.b.c.o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        boolean z;
        View view;
        ListAdapter listAdapter;
        View findViewById;
        Button button;
        super.onCreate(bundle);
        AlertController alertController = this.f21c;
        int i = alertController.K;
        alertController.f1156b.setContentView(alertController.J);
        View findViewById2 = alertController.f1157c.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view2 = alertController.h;
        int i2 = 0;
        if (view2 == null) {
            view2 = alertController.i != 0 ? LayoutInflater.from(alertController.f1155a).inflate(alertController.i, viewGroup, false) : null;
        }
        boolean z2 = view2 != null;
        if (!z2 || !AlertController.a(view2)) {
            alertController.f1157c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) alertController.f1157c.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.n) {
                frameLayout.setPadding(alertController.j, alertController.k, alertController.l, alertController.m);
            }
            if (alertController.g != null) {
                ((LinearLayout.LayoutParams) ((o0.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup d = alertController.d(findViewById6, findViewById3);
        ViewGroup d2 = alertController.d(findViewById7, findViewById4);
        ViewGroup d3 = alertController.d(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f1157c.findViewById(R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d2.findViewById(16908299);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    d2.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) d3.findViewById(16908313);
        alertController.o = button2;
        button2.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.p) || alertController.r != null) {
            alertController.o.setText(alertController.p);
            Drawable drawable = alertController.r;
            if (drawable != null) {
                int i3 = alertController.d;
                drawable.setBounds(0, 0, i3, i3);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.o.setVisibility(0);
            z = true;
        } else {
            alertController.o.setVisibility(8);
            z = false;
        }
        Button button3 = (Button) d3.findViewById(16908314);
        alertController.s = button3;
        button3.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.t) || alertController.v != null) {
            alertController.s.setText(alertController.t);
            Drawable drawable2 = alertController.v;
            if (drawable2 != null) {
                int i4 = alertController.d;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.s.setCompoundDrawables(alertController.v, null, null, null);
            }
            alertController.s.setVisibility(0);
            z |= true;
        } else {
            alertController.s.setVisibility(8);
        }
        Button button4 = (Button) d3.findViewById(16908315);
        alertController.w = button4;
        button4.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.x) || alertController.z != null) {
            alertController.w.setText(alertController.x);
            Drawable drawable3 = alertController.z;
            if (drawable3 != null) {
                int i5 = alertController.d;
                drawable3.setBounds(0, 0, i5, i5);
                view = null;
                alertController.w.setCompoundDrawables(alertController.z, null, null, null);
            } else {
                view = null;
            }
            alertController.w.setVisibility(0);
            z |= true;
        } else {
            alertController.w.setVisibility(8);
            view = null;
        }
        Context context = alertController.f1155a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                button = alertController.o;
            } else if (z) {
                button = alertController.s;
            } else if (z) {
                button = alertController.w;
            }
            alertController.b(button);
        }
        if (!(z)) {
            d3.setVisibility(8);
        }
        if (alertController.G != null) {
            d.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f1157c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.f1157c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.e)) || !alertController.P) {
                alertController.f1157c.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                d.setVisibility(8);
            } else {
                TextView textView2 = (TextView) alertController.f1157c.findViewById(R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.e);
                int i6 = alertController.B;
                if (i6 != 0) {
                    alertController.D.setImageResource(i6);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i7 = (d == null || d.getVisibility() == 8) ? 0 : 1;
        boolean z4 = d3.getVisibility() != 8;
        if (!z4 && (findViewById = d2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f == null && alertController.g == null) ? view : d.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = d2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z4 || i7 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i7 != 0 ? recycleListView.getPaddingTop() : recycleListView.f1158a, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.f1159b);
            }
        }
        if (!z3) {
            View view3 = alertController.g;
            if (view3 == null) {
                view3 = alertController.A;
            }
            if (view3 != null) {
                if (z4) {
                    i2 = 2;
                }
                View findViewById11 = alertController.f1157c.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = alertController.f1157c.findViewById(R.id.scrollIndicatorDown);
                AtomicInteger atomicInteger = w.f667a;
                w.j.c(view3, i7 | i2, 3);
                if (findViewById11 != null) {
                    d2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    d2.removeView(findViewById12);
                }
            }
        }
        ListView listView2 = alertController.g;
        if (listView2 == null || (listAdapter = alertController.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i8 = alertController.I;
        if (i8 <= -1) {
            return;
        }
        listView2.setItemChecked(i8, true);
        listView2.setSelection(i8);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f21c.A;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f21c.A;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // a.b.c.o, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f21c;
        alertController.e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
