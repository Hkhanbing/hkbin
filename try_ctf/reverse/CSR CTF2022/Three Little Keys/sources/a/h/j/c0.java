package a.h.j;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f624a;

    /* loaded from: classes.dex */
    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Window f625a;

        public a(Window window, View view) {
            this.f625a = window;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        @Override // a.h.j.c0.e
        public void b(boolean z) {
            if (z) {
                this.f625a.clearFlags(67108864);
                this.f625a.addFlags(Integer.MIN_VALUE);
                View decorView = this.f625a.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
            View decorView2 = this.f625a.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        @Override // a.h.j.c0.e
        public void a(boolean z) {
            if (z) {
                this.f625a.clearFlags(134217728);
                this.f625a.addFlags(Integer.MIN_VALUE);
                View decorView = this.f625a.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
            View decorView2 = this.f625a.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsController f626a;

        /* renamed from: b  reason: collision with root package name */
        public Window f627b;

        public d(Window window, c0 c0Var) {
            this.f626a = window.getInsetsController();
            this.f627b = window;
        }

        public d(WindowInsetsController windowInsetsController, c0 c0Var) {
            this.f626a = windowInsetsController;
        }

        @Override // a.h.j.c0.e
        public void a(boolean z) {
            if (z) {
                this.f626a.setSystemBarsAppearance(16, 16);
            } else {
                this.f626a.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // a.h.j.c0.e
        public void b(boolean z) {
            if (!z) {
                this.f626a.setSystemBarsAppearance(0, 8);
                return;
            }
            Window window = this.f627b;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
            }
            this.f626a.setSystemBarsAppearance(8, 8);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public void a(boolean z) {
        }

        public void b(boolean z) {
        }
    }

    public c0(Window window, View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f624a = new d(window, this);
        } else {
            this.f624a = new c(window, view);
        }
    }

    public c0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f624a = new d(windowInsetsController, this);
        } else {
            this.f624a = new e();
        }
    }
}
