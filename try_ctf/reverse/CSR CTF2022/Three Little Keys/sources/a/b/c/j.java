package a.b.c;

import a.b.e.a;
import a.b.e.i.g;
import a.b.e.i.m;
import a.b.f.d1;
import a.b.f.h1;
import a.b.f.i0;
import a.b.f.t0;
import a.h.c.a;
import a.h.j.b0;
import a.h.j.w;
import a.h.j.x;
import a.h.j.z;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import de.cybersecurityrumble.threelittlekeys.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class j extends a.b.c.i implements g.a, LayoutInflater.Factory2 {
    public static final a.e.h<String, Integer> Y = new a.e.h<>();
    public static final int[] Z = {16842836};
    public static final boolean a0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean b0 = true;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public i[] E;
    public i F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public Configuration K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public f P;
    public f Q;
    public boolean R;
    public int S;
    public boolean U;
    public Rect V;
    public Rect W;
    public p X;

    /* renamed from: c  reason: collision with root package name */
    public final Object f28c;
    public final Context d;
    public Window e;
    public d f;
    public final a.b.c.h g;
    public a.b.c.a h;
    public MenuInflater i;
    public CharSequence j;
    public i0 k;
    public b l;
    public C0002j m;
    public a.b.e.a n;
    public ActionBarContextView o;
    public PopupWindow p;
    public Runnable q;
    public boolean s;
    public ViewGroup t;
    public TextView u;
    public View v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public x r = null;
    public final Runnable T = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            if ((jVar.S & 1) != 0) {
                jVar.H(0);
            }
            j jVar2 = j.this;
            if ((jVar2.S & 4096) != 0) {
                jVar2.H(108);
            }
            j jVar3 = j.this;
            jVar3.R = false;
            jVar3.S = 0;
        }
    }

    /* loaded from: classes.dex */
    public final class b implements m.a {
        public b() {
        }

        @Override // a.b.e.i.m.a
        public void b(a.b.e.i.g gVar, boolean z) {
            j.this.D(gVar);
        }

        @Override // a.b.e.i.m.a
        public boolean c(a.b.e.i.g gVar) {
            Window.Callback O = j.this.O();
            if (O != null) {
                O.onMenuOpened(108, gVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class c implements a.InterfaceC0003a {

        /* renamed from: a  reason: collision with root package name */
        public a.InterfaceC0003a f31a;

        /* loaded from: classes.dex */
        public class a extends z {
            public a() {
            }

            @Override // a.h.j.y
            public void a(View view) {
                j.this.o.setVisibility(8);
                j jVar = j.this;
                PopupWindow popupWindow = jVar.p;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (jVar.o.getParent() instanceof View) {
                    AtomicInteger atomicInteger = w.f667a;
                    w.h.c((View) j.this.o.getParent());
                }
                j.this.o.h();
                j.this.r.d(null);
                j jVar2 = j.this;
                jVar2.r = null;
                ViewGroup viewGroup = jVar2.t;
                AtomicInteger atomicInteger2 = w.f667a;
                w.h.c(viewGroup);
            }
        }

        public c(a.InterfaceC0003a interfaceC0003a) {
            this.f31a = interfaceC0003a;
        }

        @Override // a.b.e.a.InterfaceC0003a
        public boolean a(a.b.e.a aVar, Menu menu) {
            ViewGroup viewGroup = j.this.t;
            AtomicInteger atomicInteger = w.f667a;
            w.h.c(viewGroup);
            return this.f31a.a(aVar, menu);
        }

        @Override // a.b.e.a.InterfaceC0003a
        public void b(a.b.e.a aVar) {
            this.f31a.b(aVar);
            j jVar = j.this;
            if (jVar.p != null) {
                jVar.e.getDecorView().removeCallbacks(j.this.q);
            }
            j jVar2 = j.this;
            if (jVar2.o != null) {
                jVar2.I();
                j jVar3 = j.this;
                x b2 = w.b(jVar3.o);
                b2.a(0.0f);
                jVar3.r = b2;
                x xVar = j.this.r;
                a aVar2 = new a();
                View view = xVar.f678a.get();
                if (view != null) {
                    xVar.e(view, aVar2);
                }
            }
            j jVar4 = j.this;
            a.b.c.h hVar = jVar4.g;
            if (hVar != null) {
                hVar.f(jVar4.n);
            }
            j jVar5 = j.this;
            jVar5.n = null;
            ViewGroup viewGroup = jVar5.t;
            AtomicInteger atomicInteger = w.f667a;
            w.h.c(viewGroup);
        }

        @Override // a.b.e.a.InterfaceC0003a
        public boolean c(a.b.e.a aVar, MenuItem menuItem) {
            return this.f31a.c(aVar, menuItem);
        }

        @Override // a.b.e.a.InterfaceC0003a
        public boolean d(a.b.e.a aVar, Menu menu) {
            return this.f31a.d(aVar, menu);
        }
    }

    /* loaded from: classes.dex */
    public class d extends a.b.e.h {
        public d(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r10) {
            /*
                Method dump skipped, instructions count: 509
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.c.j.d.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return j.this.G(keyEvent) || this.f100a.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
            if (r3 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
            if (r7 != false) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        @Override // android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            /*
                r6 = this;
                android.view.Window$Callback r0 = r6.f100a
                boolean r0 = r0.dispatchKeyShortcutEvent(r7)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L70
                a.b.c.j r0 = a.b.c.j.this
                int r3 = r7.getKeyCode()
                r0.P()
                a.b.c.a r4 = r0.h
                if (r4 == 0) goto L3f
                a.b.c.s r4 = (a.b.c.s) r4
                a.b.c.s$d r4 = r4.i
                if (r4 != 0) goto L1e
                goto L3b
            L1e:
                a.b.e.i.g r4 = r4.d
                if (r4 == 0) goto L3b
                int r5 = r7.getDeviceId()
                android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
                int r5 = r5.getKeyboardType()
                if (r5 == r2) goto L32
                r5 = r2
                goto L33
            L32:
                r5 = r1
            L33:
                r4.setQwertyMode(r5)
                boolean r3 = r4.performShortcut(r3, r7, r1)
                goto L3c
            L3b:
                r3 = r1
            L3c:
                if (r3 == 0) goto L3f
                goto L6b
            L3f:
                a.b.c.j$i r3 = r0.F
                if (r3 == 0) goto L54
                int r4 = r7.getKeyCode()
                boolean r3 = r0.T(r3, r4, r7, r2)
                if (r3 == 0) goto L54
                a.b.c.j$i r7 = r0.F
                if (r7 == 0) goto L6b
                r7.l = r2
                goto L6b
            L54:
                a.b.c.j$i r3 = r0.F
                if (r3 != 0) goto L6d
                a.b.c.j$i r3 = r0.N(r1)
                r0.U(r3, r7)
                int r4 = r7.getKeyCode()
                boolean r7 = r0.T(r3, r4, r7, r2)
                r3.k = r1
                if (r7 == 0) goto L6d
            L6b:
                r7 = r2
                goto L6e
            L6d:
                r7 = r1
            L6e:
                if (r7 == 0) goto L71
            L70:
                r1 = r2
            L71:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.c.j.d.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof a.b.e.i.g)) {
                return this.f100a.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return this.f100a.onCreatePanelView(i);
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            this.f100a.onMenuOpened(i, menu);
            j jVar = j.this;
            Objects.requireNonNull(jVar);
            if (i == 108) {
                jVar.P();
                a.b.c.a aVar = jVar.h;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            this.f100a.onPanelClosed(i, menu);
            j jVar = j.this;
            Objects.requireNonNull(jVar);
            if (i == 108) {
                jVar.P();
                a.b.c.a aVar = jVar.h;
                if (aVar == null) {
                    return;
                }
                aVar.a(false);
            } else if (i != 0) {
            } else {
                i N = jVar.N(i);
                if (!N.m) {
                    return;
                }
                jVar.E(N, false);
            }
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            a.b.e.i.g gVar = menu instanceof a.b.e.i.g ? (a.b.e.i.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.x = true;
            }
            boolean onPreparePanel = this.f100a.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.x = false;
            }
            return onPreparePanel;
        }

        @Override // android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            a.b.e.i.g gVar = j.this.N(0).h;
            if (gVar != null) {
                this.f100a.onProvideKeyboardShortcuts(list, gVar, i);
            } else {
                this.f100a.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            Objects.requireNonNull(j.this);
            if (i != 0) {
                return this.f100a.onWindowStartingActionMode(callback, i);
            }
            return a(callback);
        }
    }

    /* loaded from: classes.dex */
    public class e extends f {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f35c;

        public e(Context context) {
            super();
            this.f35c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // a.b.c.j.f
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // a.b.c.j.f
        public int c() {
            return this.f35c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // a.b.c.j.f
        public void d() {
            j.this.z();
        }
    }

    /* loaded from: classes.dex */
    public abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f36a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                f.this.d();
            }
        }

        public f() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f36a;
            if (broadcastReceiver != null) {
                try {
                    j.this.d.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f36a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 == null || b2.countActions() == 0) {
                return;
            }
            if (this.f36a == null) {
                this.f36a = new a();
            }
            j.this.d.registerReceiver(this.f36a, b2);
        }
    }

    /* loaded from: classes.dex */
    public class g extends f {

        /* renamed from: c  reason: collision with root package name */
        public final r f39c;

        public g(r rVar) {
            super();
            this.f39c = rVar;
        }

        @Override // a.b.c.j.f
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x00ec A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // a.b.c.j.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int c() {
            /*
                Method dump skipped, instructions count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.c.j.g.c():int");
        }

        @Override // a.b.c.j.f
        public void d() {
            j.this.z();
        }
    }

    /* loaded from: classes.dex */
    public class h extends ContentFrameLayout {
        public h(Context context) {
            super(context, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return j.this.G(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    j jVar = j.this;
                    jVar.E(jVar.N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(a.b.a.e(getContext(), i));
        }
    }

    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public int f40a;

        /* renamed from: b  reason: collision with root package name */
        public int f41b;

        /* renamed from: c  reason: collision with root package name */
        public int f42c;
        public int d;
        public ViewGroup e;
        public View f;
        public View g;
        public a.b.e.i.g h;
        public a.b.e.i.e i;
        public Context j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o = false;
        public boolean p;
        public Bundle q;

        public i(int i) {
            this.f40a = i;
        }

        public void a(a.b.e.i.g gVar) {
            a.b.e.i.e eVar;
            a.b.e.i.g gVar2 = this.h;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.u(this.i);
            }
            this.h = gVar;
            if (gVar == null || (eVar = this.i) == null) {
                return;
            }
            gVar.b(eVar, gVar.f129a);
        }
    }

    /* renamed from: a.b.c.j$j  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0002j implements m.a {
        public C0002j() {
        }

        @Override // a.b.e.i.m.a
        public void b(a.b.e.i.g gVar, boolean z) {
            a.b.e.i.g k = gVar.k();
            boolean z2 = k != gVar;
            j jVar = j.this;
            if (z2) {
                gVar = k;
            }
            i L = jVar.L(gVar);
            if (L != null) {
                if (!z2) {
                    j.this.E(L, z);
                    return;
                }
                j.this.C(L.f40a, L, k);
                j.this.E(L, true);
            }
        }

        @Override // a.b.e.i.m.a
        public boolean c(a.b.e.i.g gVar) {
            Window.Callback O;
            if (gVar == gVar.k()) {
                j jVar = j.this;
                if (!jVar.y || (O = jVar.O()) == null || j.this.J) {
                    return true;
                }
                O.onMenuOpened(108, gVar);
                return true;
            }
            return true;
        }
    }

    public j(Context context, Window window, a.b.c.h hVar, Object obj) {
        a.e.h<String, Integer> hVar2;
        Integer orDefault;
        a.b.c.g gVar;
        this.L = -100;
        this.d = context;
        this.g = hVar;
        this.f28c = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof a.b.c.g)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    gVar = (a.b.c.g) context;
                    break;
                }
            }
            gVar = null;
            if (gVar != null) {
                this.L = gVar.q().f();
            }
        }
        if (this.L == -100 && (orDefault = (hVar2 = Y).getOrDefault(this.f28c.getClass().getName(), null)) != null) {
            this.L = orDefault.intValue();
            hVar2.remove(this.f28c.getClass().getName());
        }
        if (window != null) {
            B(window);
        }
        a.b.f.l.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
        if (r1 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010a, code lost:
        if (r10.J == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010c, code lost:
        r11.onConfigurationChanged(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A(boolean r11) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.c.j.A(boolean):boolean");
    }

    public final void B(Window window) {
        if (this.e == null) {
            Window.Callback callback = window.getCallback();
            if (callback instanceof d) {
                throw new IllegalStateException("AppCompat has already installed itself into the Window");
            }
            d dVar = new d(callback);
            this.f = dVar;
            window.setCallback(dVar);
            d1 p = d1.p(this.d, null, Z);
            Drawable h2 = p.h(0);
            if (h2 != null) {
                window.setBackgroundDrawable(h2);
            }
            p.f193b.recycle();
            this.e = window;
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public void C(int i2, i iVar, Menu menu) {
        if (menu == null && iVar != null) {
            menu = iVar.h;
        }
        if ((iVar == null || iVar.m) && !this.J) {
            this.f.f100a.onPanelClosed(i2, menu);
        }
    }

    public void D(a.b.e.i.g gVar) {
        if (this.D) {
            return;
        }
        this.D = true;
        this.k.j();
        Window.Callback O = O();
        if (O != null && !this.J) {
            O.onPanelClosed(108, gVar);
        }
        this.D = false;
    }

    public void E(i iVar, boolean z) {
        ViewGroup viewGroup;
        i0 i0Var;
        if (z && iVar.f40a == 0 && (i0Var = this.k) != null && i0Var.e()) {
            D(iVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.d.getSystemService("window");
        if (windowManager != null && iVar.m && (viewGroup = iVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                C(iVar.f40a, iVar, null);
            }
        }
        iVar.k = false;
        iVar.l = false;
        iVar.m = false;
        iVar.f = null;
        iVar.o = true;
        if (this.F != iVar) {
            return;
        }
        this.F = null;
    }

    public final Configuration F(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x011e, code lost:
        if (r7 != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean G(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.c.j.G(android.view.KeyEvent):boolean");
    }

    public void H(int i2) {
        i N = N(i2);
        if (N.h != null) {
            Bundle bundle = new Bundle();
            N.h.w(bundle);
            if (bundle.size() > 0) {
                N.q = bundle;
            }
            N.h.z();
            N.h.clear();
        }
        N.p = true;
        N.o = true;
        if ((i2 == 108 || i2 == 0) && this.k != null) {
            i N2 = N(0);
            N2.k = false;
            U(N2, null);
        }
    }

    public void I() {
        x xVar = this.r;
        if (xVar != null) {
            xVar.b();
        }
    }

    public final void J() {
        ViewGroup viewGroup;
        if (!this.s) {
            TypedArray obtainStyledAttributes = this.d.obtainStyledAttributes(a.b.b.j);
            if (!obtainStyledAttributes.hasValue(117)) {
                obtainStyledAttributes.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (obtainStyledAttributes.getBoolean(126, false)) {
                t(1);
            } else if (obtainStyledAttributes.getBoolean(117, false)) {
                t(108);
            }
            if (obtainStyledAttributes.getBoolean(118, false)) {
                t(109);
            }
            if (obtainStyledAttributes.getBoolean(119, false)) {
                t(10);
            }
            this.B = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            K();
            this.e.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.d);
            if (this.C) {
                viewGroup = (ViewGroup) from.inflate(this.A ? R.layout.abc_screen_simple_overlay_action_mode : R.layout.abc_screen_simple, (ViewGroup) null);
            } else if (this.B) {
                viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                this.z = false;
                this.y = false;
            } else if (this.y) {
                TypedValue typedValue = new TypedValue();
                this.d.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new a.b.e.c(this.d, typedValue.resourceId) : this.d).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                i0 i0Var = (i0) viewGroup.findViewById(R.id.decor_content_parent);
                this.k = i0Var;
                i0Var.setWindowCallback(O());
                if (this.z) {
                    this.k.h(109);
                }
                if (this.w) {
                    this.k.h(2);
                }
                if (this.x) {
                    this.k.h(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                k kVar = new k(this);
                AtomicInteger atomicInteger = w.f667a;
                w.i.u(viewGroup, kVar);
                if (this.k == null) {
                    this.u = (TextView) viewGroup.findViewById(R.id.title);
                }
                Method method = h1.f228a;
                try {
                    Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                    if (!method2.isAccessible()) {
                        method2.setAccessible(true);
                    }
                    method2.invoke(viewGroup, new Object[0]);
                } catch (IllegalAccessException e2) {
                    e = e2;
                    Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                } catch (NoSuchMethodException unused) {
                    Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                } catch (InvocationTargetException e3) {
                    e = e3;
                    Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                }
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.e.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.e.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new l(this));
                this.t = viewGroup;
                Object obj = this.f28c;
                CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.j;
                if (!TextUtils.isEmpty(title)) {
                    i0 i0Var2 = this.k;
                    if (i0Var2 != null) {
                        i0Var2.setWindowTitle(title);
                    } else {
                        a.b.c.a aVar = this.h;
                        if (aVar != null) {
                            ((s) aVar).e.setWindowTitle(title);
                        } else {
                            TextView textView = this.u;
                            if (textView != null) {
                                textView.setText(title);
                            }
                        }
                    }
                }
                ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.t.findViewById(16908290);
                View decorView = this.e.getDecorView();
                contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                AtomicInteger atomicInteger2 = w.f667a;
                if (w.g.c(contentFrameLayout2)) {
                    contentFrameLayout2.requestLayout();
                }
                TypedArray obtainStyledAttributes2 = this.d.obtainStyledAttributes(a.b.b.j);
                obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                if (obtainStyledAttributes2.hasValue(122)) {
                    obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                }
                if (obtainStyledAttributes2.hasValue(123)) {
                    obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                }
                if (obtainStyledAttributes2.hasValue(120)) {
                    obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                }
                if (obtainStyledAttributes2.hasValue(121)) {
                    obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                }
                obtainStyledAttributes2.recycle();
                contentFrameLayout2.requestLayout();
                this.s = true;
                i N = N(0);
                if (this.J || N.h != null) {
                    return;
                }
                Q(108);
                return;
            }
            StringBuilder f2 = b.a.a.a.a.f("AppCompat does not support the current theme features: { windowActionBar: ");
            f2.append(this.y);
            f2.append(", windowActionBarOverlay: ");
            f2.append(this.z);
            f2.append(", android:windowIsFloating: ");
            f2.append(this.B);
            f2.append(", windowActionModeOverlay: ");
            f2.append(this.A);
            f2.append(", windowNoTitle: ");
            f2.append(this.C);
            f2.append(" }");
            throw new IllegalArgumentException(f2.toString());
        }
    }

    public final void K() {
        if (this.e == null) {
            Object obj = this.f28c;
            if (obj instanceof Activity) {
                B(((Activity) obj).getWindow());
            }
        }
        if (this.e != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public i L(Menu menu) {
        i[] iVarArr = this.E;
        int length = iVarArr != null ? iVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            i iVar = iVarArr[i2];
            if (iVar != null && iVar.h == menu) {
                return iVar;
            }
        }
        return null;
    }

    public final f M(Context context) {
        if (this.P == null) {
            if (r.d == null) {
                Context applicationContext = context.getApplicationContext();
                r.d = new r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.P = new g(r.d);
        }
        return this.P;
    }

    public i N(int i2) {
        i[] iVarArr = this.E;
        if (iVarArr == null || iVarArr.length <= i2) {
            i[] iVarArr2 = new i[i2 + 1];
            if (iVarArr != null) {
                System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
            }
            this.E = iVarArr2;
            iVarArr = iVarArr2;
        }
        i iVar = iVarArr[i2];
        if (iVar == null) {
            i iVar2 = new i(i2);
            iVarArr[i2] = iVar2;
            return iVar2;
        }
        return iVar;
    }

    public final Window.Callback O() {
        return this.e.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P() {
        /*
            r3 = this;
            r3.J()
            boolean r0 = r3.y
            if (r0 == 0) goto L37
            a.b.c.a r0 = r3.h
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f28c
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            a.b.c.s r0 = new a.b.c.s
            java.lang.Object r1 = r3.f28c
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.z
            r0.<init>(r1, r2)
        L1d:
            r3.h = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            a.b.c.s r0 = new a.b.c.s
            java.lang.Object r1 = r3.f28c
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            a.b.c.a r0 = r3.h
            if (r0 == 0) goto L37
            boolean r1 = r3.U
            r0.c(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.c.j.P():void");
    }

    public final void Q(int i2) {
        this.S = (1 << i2) | this.S;
        if (!this.R) {
            View decorView = this.e.getDecorView();
            Runnable runnable = this.T;
            AtomicInteger atomicInteger = w.f667a;
            w.d.m(decorView, runnable);
            this.R = true;
        }
    }

    public int R(Context context, int i2) {
        f M;
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.Q == null) {
                            this.Q = new e(context);
                        }
                        M = this.Q;
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                } else {
                    M = M(context);
                }
                return M.c();
            }
            return i2;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (r15 != null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(a.b.c.j.i r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.c.j.S(a.b.c.j$i, android.view.KeyEvent):void");
    }

    public final boolean T(i iVar, int i2, KeyEvent keyEvent, int i3) {
        a.b.e.i.g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((iVar.k || U(iVar, keyEvent)) && (gVar = iVar.h) != null) {
            z = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.k == null) {
            E(iVar, true);
        }
        return z;
    }

    public final boolean U(i iVar, KeyEvent keyEvent) {
        i0 i0Var;
        i0 i0Var2;
        Resources.Theme theme;
        i0 i0Var3;
        i0 i0Var4;
        if (this.J) {
            return false;
        }
        if (iVar.k) {
            return true;
        }
        i iVar2 = this.F;
        if (iVar2 != null && iVar2 != iVar) {
            E(iVar2, false);
        }
        Window.Callback O = O();
        if (O != null) {
            iVar.g = O.onCreatePanelView(iVar.f40a);
        }
        int i2 = iVar.f40a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (i0Var4 = this.k) != null) {
            i0Var4.d();
        }
        if (iVar.g == null) {
            a.b.e.i.g gVar = iVar.h;
            if (gVar == null || iVar.p) {
                if (gVar == null) {
                    Context context = this.d;
                    int i3 = iVar.f40a;
                    if ((i3 == 0 || i3 == 108) && this.k != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            a.b.e.c cVar = new a.b.e.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    a.b.e.i.g gVar2 = new a.b.e.i.g(context);
                    gVar2.e = this;
                    iVar.a(gVar2);
                    if (iVar.h == null) {
                        return false;
                    }
                }
                if (z && (i0Var2 = this.k) != null) {
                    if (this.l == null) {
                        this.l = new b();
                    }
                    i0Var2.b(iVar.h, this.l);
                }
                iVar.h.z();
                if (!O.onCreatePanelMenu(iVar.f40a, iVar.h)) {
                    iVar.a(null);
                    if (z && (i0Var = this.k) != null) {
                        i0Var.b(null, this.l);
                    }
                    return false;
                }
                iVar.p = false;
            }
            iVar.h.z();
            Bundle bundle = iVar.q;
            if (bundle != null) {
                iVar.h.v(bundle);
                iVar.q = null;
            }
            if (!O.onPreparePanel(0, iVar.g, iVar.h)) {
                if (z && (i0Var3 = this.k) != null) {
                    i0Var3.b(null, this.l);
                }
                iVar.h.y();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            iVar.n = z2;
            iVar.h.setQwertyMode(z2);
            iVar.h.y();
        }
        iVar.k = true;
        iVar.l = false;
        this.F = iVar;
        return true;
    }

    public final boolean V() {
        ViewGroup viewGroup;
        if (this.s && (viewGroup = this.t) != null) {
            AtomicInteger atomicInteger = w.f667a;
            if (w.g.c(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    public final void W() {
        if (!this.s) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final int X(b0 b0Var, Rect rect) {
        boolean z;
        boolean z2;
        Context context;
        int i2;
        int e2 = b0Var.e();
        ActionBarContextView actionBarContextView = this.o;
        int i3 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            boolean z3 = true;
            if (this.o.isShown()) {
                if (this.V == null) {
                    this.V = new Rect();
                    this.W = new Rect();
                }
                Rect rect2 = this.V;
                Rect rect3 = this.W;
                rect2.set(b0Var.c(), b0Var.e(), b0Var.d(), b0Var.b());
                h1.a(this.t, rect2, rect3);
                int i4 = rect2.top;
                int i5 = rect2.left;
                int i6 = rect2.right;
                b0 i7 = w.i(this.t);
                int c2 = i7 == null ? 0 : i7.c();
                int d2 = i7 == null ? 0 : i7.d();
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z2 = true;
                }
                if (i4 <= 0 || this.v != null) {
                    View view = this.v;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i8 = marginLayoutParams2.height;
                        int i9 = marginLayoutParams.topMargin;
                        if (i8 != i9 || marginLayoutParams2.leftMargin != c2 || marginLayoutParams2.rightMargin != d2) {
                            marginLayoutParams2.height = i9;
                            marginLayoutParams2.leftMargin = c2;
                            marginLayoutParams2.rightMargin = d2;
                            this.v.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.d);
                    this.v = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = c2;
                    layoutParams.rightMargin = d2;
                    this.t.addView(this.v, -1, layoutParams);
                }
                View view3 = this.v;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.v;
                    AtomicInteger atomicInteger = w.f667a;
                    if ((w.d.g(view4) & 8192) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        context = this.d;
                        i2 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = this.d;
                        i2 = R.color.abc_decor_view_status_guard;
                    }
                    Object obj = a.h.c.a.f500a;
                    view4.setBackgroundColor(a.c.a(context, i2));
                }
                if (!this.A && z) {
                    e2 = 0;
                }
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z3 = false;
                z = false;
            }
            if (z3) {
                this.o.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.v;
        if (view5 != null) {
            if (z) {
                i3 = 0;
            }
            view5.setVisibility(i3);
        }
        return e2;
    }

    @Override // a.b.e.i.g.a
    public void a(a.b.e.i.g gVar) {
        i0 i0Var = this.k;
        if (i0Var == null || !i0Var.f() || (ViewConfiguration.get(this.d).hasPermanentMenuKey() && !this.k.c())) {
            i N = N(0);
            N.o = true;
            E(N, false);
            S(N, null);
            return;
        }
        Window.Callback O = O();
        if (this.k.e()) {
            this.k.g();
            if (this.J) {
                return;
            }
            O.onPanelClosed(108, N(0).h);
        } else if (O == null || this.J) {
        } else {
            if (this.R && (1 & this.S) != 0) {
                this.e.getDecorView().removeCallbacks(this.T);
                this.T.run();
            }
            i N2 = N(0);
            a.b.e.i.g gVar2 = N2.h;
            if (gVar2 == null || N2.p || !O.onPreparePanel(0, N2.g, gVar2)) {
                return;
            }
            O.onMenuOpened(108, N2.h);
            this.k.a();
        }
    }

    @Override // a.b.e.i.g.a
    public boolean b(a.b.e.i.g gVar, MenuItem menuItem) {
        i L;
        Window.Callback O = O();
        if (O == null || this.J || (L = L(gVar.k())) == null) {
            return false;
        }
        return O.onMenuItemSelected(L.f40a, menuItem);
    }

    @Override // a.b.c.i
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ((ViewGroup) this.t.findViewById(16908290)).addView(view, layoutParams);
        this.f.f100a.onContentChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0183  */
    @Override // a.b.c.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.Context d(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.c.j.d(android.content.Context):android.content.Context");
    }

    @Override // a.b.c.i
    public <T extends View> T e(int i2) {
        J();
        return (T) this.e.findViewById(i2);
    }

    @Override // a.b.c.i
    public int f() {
        return this.L;
    }

    @Override // a.b.c.i
    public MenuInflater g() {
        if (this.i == null) {
            P();
            a.b.c.a aVar = this.h;
            this.i = new a.b.e.f(aVar != null ? aVar.b() : this.d);
        }
        return this.i;
    }

    @Override // a.b.c.i
    public a.b.c.a h() {
        P();
        return this.h;
    }

    @Override // a.b.c.i
    public void i() {
        LayoutInflater from = LayoutInflater.from(this.d);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (from.getFactory2() instanceof j) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // a.b.c.i
    public void j() {
        P();
        a.b.c.a aVar = this.h;
        Q(0);
    }

    @Override // a.b.c.i
    public void k(Configuration configuration) {
        if (this.y && this.s) {
            P();
            a.b.c.a aVar = this.h;
            if (aVar != null) {
                s sVar = (s) aVar;
                sVar.f(sVar.f66a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        a.b.f.l a2 = a.b.f.l.a();
        Context context = this.d;
        synchronized (a2) {
            t0 t0Var = a2.f242a;
            synchronized (t0Var) {
                a.e.e<WeakReference<Drawable.ConstantState>> eVar = t0Var.d.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        this.K = new Configuration(this.d.getResources().getConfiguration());
        A(false);
    }

    @Override // a.b.c.i
    public void l(Bundle bundle) {
        this.H = true;
        A(false);
        K();
        Object obj = this.f28c;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = a.h.b.b.x(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a.b.c.a aVar = this.h;
                if (aVar == null) {
                    this.U = true;
                } else {
                    aVar.c(true);
                }
            }
            synchronized (a.b.c.i.f27b) {
                a.b.c.i.s(this);
                a.b.c.i.f26a.add(new WeakReference<>(this));
            }
        }
        this.K = new Configuration(this.d.getResources().getConfiguration());
        this.I = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // a.b.c.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f28c
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = a.b.c.i.f27b
            monitor-enter(r0)
            a.b.c.i.s(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.R
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.e
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.T
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.J = r0
            int r0 = r3.L
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f28c
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            a.e.h<java.lang.String, java.lang.Integer> r0 = a.b.c.j.Y
            java.lang.Object r1 = r3.f28c
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.L
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            a.e.h<java.lang.String, java.lang.Integer> r0 = a.b.c.j.Y
            java.lang.Object r1 = r3.f28c
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            a.b.c.a r0 = r3.h
            if (r0 == 0) goto L63
            java.util.Objects.requireNonNull(r0)
        L63:
            a.b.c.j$f r0 = r3.P
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            a.b.c.j$f r0 = r3.Q
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.c.j.m():void");
    }

    @Override // a.b.c.i
    public void n(Bundle bundle) {
        J();
    }

    @Override // a.b.c.i
    public void o() {
        P();
        a.b.c.a aVar = this.h;
        if (aVar != null) {
            ((s) aVar).u = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010f, code lost:
        if (r8.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01f2 -> B:145:0x01f8). Please submit an issue!!! */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r7, java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.c.j.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // a.b.c.i
    public void p(Bundle bundle) {
    }

    @Override // a.b.c.i
    public void q() {
        z();
    }

    @Override // a.b.c.i
    public void r() {
        P();
        a.b.c.a aVar = this.h;
        if (aVar != null) {
            s sVar = (s) aVar;
            sVar.u = false;
            a.b.e.g gVar = sVar.t;
            if (gVar == null) {
                return;
            }
            gVar.a();
        }
    }

    @Override // a.b.c.i
    public boolean t(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (!this.C || i2 != 108) {
            if (this.y && i2 == 1) {
                this.y = false;
            }
            if (i2 == 1) {
                W();
                this.C = true;
                return true;
            } else if (i2 == 2) {
                W();
                this.w = true;
                return true;
            } else if (i2 == 5) {
                W();
                this.x = true;
                return true;
            } else if (i2 == 10) {
                W();
                this.A = true;
                return true;
            } else if (i2 == 108) {
                W();
                this.y = true;
                return true;
            } else if (i2 != 109) {
                return this.e.requestFeature(i2);
            } else {
                W();
                this.z = true;
                return true;
            }
        }
        return false;
    }

    @Override // a.b.c.i
    public void u(int i2) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.t.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.d).inflate(i2, viewGroup);
        this.f.f100a.onContentChanged();
    }

    @Override // a.b.c.i
    public void v(View view) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.t.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f.f100a.onContentChanged();
    }

    @Override // a.b.c.i
    public void w(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.t.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f.f100a.onContentChanged();
    }

    @Override // a.b.c.i
    public void x(int i2) {
        this.M = i2;
    }

    @Override // a.b.c.i
    public final void y(CharSequence charSequence) {
        this.j = charSequence;
        i0 i0Var = this.k;
        if (i0Var != null) {
            i0Var.setWindowTitle(charSequence);
            return;
        }
        a.b.c.a aVar = this.h;
        if (aVar != null) {
            ((s) aVar).e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.u;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public boolean z() {
        return A(true);
    }
}
