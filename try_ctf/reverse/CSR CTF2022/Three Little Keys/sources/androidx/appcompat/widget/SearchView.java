package androidx.appcompat.widget;

import a.b.f.d1;
import a.b.f.h1;
import a.b.f.o0;
import a.b.f.x0;
import a.h.j.w;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import de.cybersecurityrumble.threelittlekeys.R;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends o0 implements a.b.e.b {
    public static final n q0;
    public Rect A;
    public int[] B;
    public int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public l K;
    public k L;
    public View.OnFocusChangeListener M;
    public m N;
    public View.OnClickListener O;
    public boolean P;
    public boolean Q;
    public a.i.a.a R;
    public boolean S;
    public CharSequence T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean a0;
    public CharSequence b0;
    public CharSequence c0;
    public boolean d0;
    public int e0;
    public SearchableInfo f0;
    public Bundle g0;
    public final Runnable h0;
    public Runnable i0;
    public final WeakHashMap<String, Drawable.ConstantState> j0;
    public final View.OnClickListener k0;
    public View.OnKeyListener l0;
    public final TextView.OnEditorActionListener m0;
    public final AdapterView.OnItemClickListener n0;
    public final AdapterView.OnItemSelectedListener o0;
    public final SearchAutoComplete p;
    public TextWatcher p0;
    public final View q;
    public final View r;
    public final View s;
    public final ImageView t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public p y;
    public Rect z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends a.b.f.e {
        public int e;
        public SearchView f;
        public boolean g;
        public final Runnable h;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.g = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
            this.h = new a();
            this.e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i >= 600) {
                    return 192;
                }
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 256;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (!enoughToFilter()) {
                    return;
                }
                showDropDown();
                return;
            }
            n nVar = SearchView.q0;
            Objects.requireNonNull(nVar);
            n.a();
            Method method = nVar.f1206c;
            if (method == null) {
                return;
            }
            try {
                method.invoke(this, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // a.b.f.e, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                removeCallbacks(this.h);
                post(this.h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f;
            searchView.G(searchView.Q);
            searchView.post(searchView.h0);
            if (searchView.p.hasFocus()) {
                searchView.s();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (!z || !this.f.hasFocus() || getVisibility() != 0) {
                return;
            }
            boolean z2 = true;
            this.g = true;
            Context context = getContext();
            n nVar = SearchView.q0;
            if (context.getResources().getConfiguration().orientation != 2) {
                z2 = false;
            }
            if (!z2) {
                return;
            }
            a();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.g = true;
            } else {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.p.getText();
            searchView.c0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.F(z);
            searchView.H(!z);
            searchView.B();
            searchView.E();
            if (searchView.K != null && !TextUtils.equals(charSequence, searchView.b0)) {
                searchView.K.b(charSequence.toString());
            }
            searchView.b0 = charSequence.toString();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.C();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.i.a.a aVar = SearchView.this.R;
            if (aVar instanceof x0) {
                aVar.b(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.M;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            if (searchView.x.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.r.getPaddingLeft();
                Rect rect = new Rect();
                boolean b2 = h1.b(searchView);
                int dimensionPixelSize = searchView.P ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.p.getDropDownBackground().getPadding(rect);
                searchView.p.setDropDownHorizontalOffset(b2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.p.setDropDownWidth((((searchView.x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.t) {
                searchView.y();
            } else if (view == searchView.v) {
                searchView.u();
            } else if (view == searchView.u) {
                searchView.z();
            } else if (view == searchView.w) {
                SearchableInfo searchableInfo = searchView.f0;
                if (searchableInfo == null) {
                    return;
                }
                try {
                    if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            return;
                        }
                        searchView.getContext().startActivity(searchView.r(searchView.I, searchableInfo));
                        return;
                    }
                    Intent intent = new Intent(searchView.H);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            } else if (view != searchView.p) {
            } else {
                searchView.s();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f0 == null) {
                return false;
            }
            if (searchView.p.isPopupShowing() && SearchView.this.p.getListSelection() != -1) {
                return SearchView.this.A(i, keyEvent);
            }
            if ((TextUtils.getTrimmedLength(SearchView.this.p.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.t(0, null, searchView2.p.getText().toString());
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.z();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.v(i);
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.w(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(int i);

        boolean b(int i);
    }

    /* loaded from: classes.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public Method f1204a;

        /* renamed from: b  reason: collision with root package name */
        public Method f1205b;

        /* renamed from: c  reason: collision with root package name */
        public Method f1206c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            this.f1204a = null;
            this.f1205b = null;
            this.f1206c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1204a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1205b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1206c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    /* loaded from: classes.dex */
    public static class o extends a.j.a.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f1207c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<o> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new o[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1207c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder f = b.a.a.a.a.f("SearchView.SavedState{");
            f.append(Integer.toHexString(System.identityHashCode(this)));
            f.append(" isIconified=");
            f.append(this.f1207c);
            f.append("}");
            return f.toString();
        }

        @Override // a.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f701a, i);
            parcel.writeValue(Boolean.valueOf(this.f1207c));
        }
    }

    /* loaded from: classes.dex */
    public static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f1208a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1209b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f1210c;
        public final Rect d;
        public final int e;
        public boolean f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1209b = new Rect();
            this.d = new Rect();
            this.f1210c = new Rect();
            a(rect, rect2);
            this.f1208a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1209b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.f1210c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            float f;
            int i;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f1209b.contains(x, y)) {
                    this.f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                if (!z || this.f1210c.contains(x, y)) {
                    Rect rect = this.f1210c;
                    f = x - rect.left;
                    i = y - rect.top;
                } else {
                    f = this.f1208a.getWidth() / 2;
                    i = this.f1208a.getHeight() / 2;
                }
                motionEvent.setLocation(f, i);
                return this.f1208a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        q0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.h0 = new b();
        this.i0 = new c();
        this.j0 = new WeakHashMap<>();
        f fVar = new f();
        this.k0 = fVar;
        this.l0 = new g();
        h hVar = new h();
        this.m0 = hVar;
        i iVar = new i();
        this.n0 = iVar;
        j jVar = new j();
        this.o0 = jVar;
        this.p0 = new a();
        int[] iArr = a.b.b.u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        d1 d1Var = new d1(context, obtainStyledAttributes);
        w.o(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        LayoutInflater.from(context).inflate(d1Var.l(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = imageView5;
        w.d.q(findViewById, d1Var.g(10));
        w.d.q(findViewById2, d1Var.g(14));
        imageView.setImageDrawable(d1Var.g(13));
        imageView2.setImageDrawable(d1Var.g(7));
        imageView3.setImageDrawable(d1Var.g(4));
        imageView4.setImageDrawable(d1Var.g(16));
        imageView5.setImageDrawable(d1Var.g(13));
        this.E = d1Var.g(12);
        imageView.setTooltipText(getResources().getString(R.string.abc_searchview_description_search));
        this.F = d1Var.l(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = d1Var.l(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.p0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.l0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(d1Var.a(8, true));
        int f2 = d1Var.f(1, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.J = d1Var.n(6);
        this.T = d1Var.n(11);
        int j2 = d1Var.j(3, -1);
        if (j2 != -1) {
            setImeOptions(j2);
        }
        int j3 = d1Var.j(2, -1);
        if (j3 != -1) {
            setInputType(j3);
        }
        setFocusable(d1Var.a(0, true));
        d1Var.f193b.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        G(this.P);
        D();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.p.setText(charSequence);
        this.p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public boolean A(int i2, KeyEvent keyEvent) {
        if (this.f0 != null && this.R != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return v(this.p.getListSelection());
            }
            if (i2 == 21 || i2 == 22) {
                this.p.setSelection(i2 == 21 ? 0 : this.p.length());
                this.p.setListSelection(0);
                this.p.clearListSelection();
                this.p.a();
                return true;
            } else if (i2 != 19 || this.p.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    public final void B() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.p.getText());
        int i2 = 0;
        if (!z2 && (!this.P || this.d0)) {
            z = false;
        }
        ImageView imageView = this.v;
        if (!z) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.v.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void C() {
        int[] iArr = this.p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void D() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.p;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.P && this.E != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            this.E.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void E() {
        int i2 = 0;
        if (!((this.S || this.a0) && !this.Q) || (this.u.getVisibility() != 0 && this.w.getVisibility() != 0)) {
            i2 = 8;
        }
        this.s.setVisibility(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r2.a0 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.S
            r1 = 0
            if (r0 == 0) goto L21
            if (r0 != 0) goto Lb
            boolean r0 = r2.a0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.Q
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.a0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.u
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.F(boolean):void");
    }

    public final void G(boolean z) {
        this.Q = z;
        int i2 = 0;
        int i3 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.p.getText());
        this.t.setVisibility(i3);
        F(z2);
        this.q.setVisibility(z ? 8 : 0);
        if (this.D.getDrawable() == null || this.P) {
            i2 = 8;
        }
        this.D.setVisibility(i2);
        B();
        H(!z2);
        E();
    }

    public final void H(boolean z) {
        int i2 = 8;
        if (this.a0 && !this.Q && z) {
            this.u.setVisibility(8);
            i2 = 0;
        }
        this.w.setVisibility(i2);
    }

    @Override // a.b.e.b
    public void a() {
        if (this.d0) {
            return;
        }
        this.d0 = true;
        int imeOptions = this.p.getImeOptions();
        this.e0 = imeOptions;
        this.p.setImeOptions(imeOptions | 33554432);
        this.p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.V = true;
        super.clearFocus();
        this.p.clearFocus();
        this.p.setImeVisibility(false);
        this.V = false;
    }

    @Override // a.b.e.b
    public void e() {
        this.p.setText("");
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.c0 = "";
        clearFocus();
        G(true);
        this.p.setImeOptions(this.e0);
        this.d0 = false;
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.W;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.T;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public a.i.a.a getSuggestionsAdapter() {
        return this.R;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.h0);
        post(this.i0);
        super.onDetachedFromWindow();
    }

    @Override // a.b.f.o0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.p;
            Rect rect = this.z;
            searchAutoComplete.getLocationInWindow(this.B);
            getLocationInWindow(this.C);
            int[] iArr = this.B;
            int i6 = iArr[1];
            int[] iArr2 = this.C;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.A;
            Rect rect3 = this.z;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            p pVar = this.y;
            if (pVar != null) {
                pVar.a(this.A, this.z);
                return;
            }
            p pVar2 = new p(this.A, this.z, this.p);
            this.y = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    @Override // a.b.f.o0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.Q
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.W
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.W
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.W
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.f701a);
        G(oVar.f1207c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f1207c = this.Q;
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.h0);
    }

    public final Intent q(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.c0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.g0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f0.getSearchActivity());
        return intent;
    }

    public final Intent r(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.g0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (!this.V && isFocusable()) {
            if (this.Q) {
                return super.requestFocus(i2, rect);
            }
            boolean requestFocus = this.p.requestFocus(i2, rect);
            if (requestFocus) {
                G(false);
            }
            return requestFocus;
        }
        return false;
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.p.refreshAutoCompleteResults();
            return;
        }
        n nVar = q0;
        SearchAutoComplete searchAutoComplete = this.p;
        Objects.requireNonNull(nVar);
        n.a();
        Method method = nVar.f1204a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        n nVar2 = q0;
        SearchAutoComplete searchAutoComplete2 = this.p;
        Objects.requireNonNull(nVar2);
        n.a();
        Method method2 = nVar2.f1205b;
        if (method2 == null) {
            return;
        }
        try {
            method2.invoke(searchAutoComplete2, new Object[0]);
        } catch (Exception unused2) {
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.g0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            u();
        } else {
            y();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.P == z) {
            return;
        }
        this.P = z;
        G(z);
        D();
    }

    public void setImeOptions(int i2) {
        this.p.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.p.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.W = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.L = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.M = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.K = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.O = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.N = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.T = charSequence;
        D();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.U = z;
        a.i.a.a aVar = this.R;
        if (aVar instanceof x0) {
            ((x0) aVar).q = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L6e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.p
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.p
            android.app.SearchableInfo r3 = r6.f0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L36
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L36
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L36:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.p
            r3.setInputType(r7)
            a.i.a.a r7 = r6.R
            if (r7 == 0) goto L42
            r7.b(r2)
        L42:
            android.app.SearchableInfo r7 = r6.f0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L6b
            a.b.f.x0 r7 = new a.b.f.x0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.j0
            r7.<init>(r3, r6, r4, r5)
            r6.R = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.p
            r3.setAdapter(r7)
            a.i.a.a r7 = r6.R
            a.b.f.x0 r7 = (a.b.f.x0) r7
            boolean r3 = r6.U
            if (r3 == 0) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = r0
        L69:
            r7.q = r3
        L6b:
            r6.D()
        L6e:
            android.app.SearchableInfo r7 = r6.f0
            r3 = 0
            if (r7 == 0) goto L9f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L9f
            android.app.SearchableInfo r7 = r6.f0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L84
            android.content.Intent r2 = r6.H
            goto L8e
        L84:
            android.app.SearchableInfo r7 = r6.f0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L8e
            android.content.Intent r2 = r6.I
        L8e:
            if (r2 == 0) goto L9f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L9f
            goto La0
        L9f:
            r0 = r3
        La0:
            r6.a0 = r0
            if (r0 == 0) goto Lab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.p
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lab:
            boolean r7 = r6.Q
            r6.G(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.S = z;
        G(this.Q);
    }

    public void setSuggestionsAdapter(a.i.a.a aVar) {
        this.R = aVar;
        this.p.setAdapter(aVar);
    }

    public void t(int i2, String str, String str2) {
        getContext().startActivity(q("android.intent.action.SEARCH", null, null, str2, i2, null));
    }

    public void u() {
        if (!TextUtils.isEmpty(this.p.getText())) {
            this.p.setText("");
            this.p.requestFocus();
            this.p.setImeVisibility(true);
        } else if (!this.P) {
        } else {
            k kVar = this.L;
            if (kVar != null && kVar.a()) {
                return;
            }
            clearFocus();
            G(true);
        }
    }

    public boolean v(int i2) {
        int i3;
        String h2;
        m mVar = this.N;
        if (mVar == null || !mVar.b(i2)) {
            Cursor cursor = this.R.f696c;
            if (cursor != null && cursor.moveToPosition(i2)) {
                Intent intent = null;
                try {
                    int i4 = x0.y;
                    String h3 = x0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (h3 == null) {
                        h3 = this.f0.getSuggestIntentAction();
                    }
                    if (h3 == null) {
                        h3 = "android.intent.action.SEARCH";
                    }
                    String str = h3;
                    String h4 = x0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (h4 == null) {
                        h4 = this.f0.getSuggestIntentData();
                    }
                    if (h4 != null && (h2 = x0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        h4 = h4 + "/" + Uri.encode(h2);
                    }
                    intent = q(str, h4 == null ? null : Uri.parse(h4), x0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), x0.h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
                } catch (RuntimeException e2) {
                    try {
                        i3 = cursor.getPosition();
                    } catch (RuntimeException unused) {
                        i3 = -1;
                    }
                    Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
                }
                if (intent != null) {
                    try {
                        getContext().startActivity(intent);
                    } catch (RuntimeException e3) {
                        Log.e("SearchView", "Failed launch activity: " + intent, e3);
                    }
                }
            }
            this.p.setImeVisibility(false);
            this.p.dismissDropDown();
            return true;
        }
        return false;
    }

    public boolean w(int i2) {
        CharSequence c2;
        m mVar = this.N;
        if (mVar == null || !mVar.a(i2)) {
            Editable text = this.p.getText();
            Cursor cursor = this.R.f696c;
            if (cursor == null) {
                return true;
            }
            if (!cursor.moveToPosition(i2) || (c2 = this.R.c(cursor)) == null) {
                setQuery(text);
                return true;
            }
            setQuery(c2);
            return true;
        }
        return false;
    }

    public void x(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void y() {
        G(false);
        this.p.requestFocus();
        this.p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.O;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void z() {
        Editable text = this.p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.K;
        if (lVar != null && lVar.a(text.toString())) {
            return;
        }
        if (this.f0 != null) {
            t(0, null, text.toString());
        }
        this.p.setImeVisibility(false);
        this.p.dismissDropDown();
    }
}
