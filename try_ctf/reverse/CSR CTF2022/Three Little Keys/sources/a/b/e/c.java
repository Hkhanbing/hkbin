package a.b.e;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f76a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f77b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f78c;
    public Configuration d;
    public Resources e;

    public c() {
        super(null);
    }

    public c(Context context, int i) {
        super(context);
        this.f76a = i;
    }

    public void a(Configuration configuration) {
        if (this.e == null) {
            if (this.d != null) {
                throw new IllegalStateException("Override configuration has already been set");
            }
            this.d = new Configuration(configuration);
            return;
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f77b == null) {
            this.f77b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f77b.setTo(theme);
            }
        }
        this.f77b.applyStyle(this.f76a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.e == null) {
            Configuration configuration = this.d;
            this.e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f78c == null) {
                this.f78c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f78c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f77b;
        if (theme != null) {
            return theme;
        }
        if (this.f76a == 0) {
            this.f76a = 2131821062;
        }
        b();
        return this.f77b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f76a != i) {
            this.f76a = i;
            b();
        }
    }
}
