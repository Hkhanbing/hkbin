package androidx.activity;

import a.n.f;
import a.n.h;
import a.n.j;
import a.n.k;
import a.n.t;
import a.n.y;
import a.n.z;
import a.q.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ComponentActivity extends a.h.b.c implements j, z, a.q.c, a.a.c, a.a.e.e {

    /* renamed from: b  reason: collision with root package name */
    public final a.a.d.a f1136b = new a.a.d.a();

    /* renamed from: c  reason: collision with root package name */
    public final k f1137c;
    public final a.q.b d;
    public y e;
    public final OnBackPressedDispatcher f;
    public final a.a.e.d g;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends a.a.e.d {
        public b(ComponentActivity componentActivity) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements a.b {
        public c() {
        }

        @Override // a.q.a.b
        @SuppressLint({"SyntheticAccessor"})
        public Bundle a() {
            Bundle bundle = new Bundle();
            a.a.e.d dVar = ComponentActivity.this.g;
            Objects.requireNonNull(dVar);
            bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(dVar.f8c.values()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(dVar.f8c.keySet()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(dVar.e));
            bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) dVar.h.clone());
            bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", dVar.f6a);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public class d implements a.a.d.b {
        public d() {
        }

        @Override // a.a.d.b
        @SuppressLint({"SyntheticAccessor"})
        public void a(Context context) {
            Bundle a2 = ComponentActivity.this.d.f1072b.a("android:support:activity-result");
            if (a2 != null) {
                a.a.e.d dVar = ComponentActivity.this.g;
                Objects.requireNonNull(dVar);
                ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                if (stringArrayList == null || integerArrayList == null) {
                    return;
                }
                dVar.e = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                dVar.f6a = (Random) a2.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                dVar.h.putAll(a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (dVar.f8c.containsKey(str)) {
                        Integer remove = dVar.f8c.remove(str);
                        if (!dVar.h.containsKey(str)) {
                            dVar.f7b.remove(remove);
                        }
                    }
                    int intValue = integerArrayList.get(i).intValue();
                    String str2 = stringArrayList.get(i);
                    dVar.f7b.put(Integer.valueOf(intValue), str2);
                    dVar.f8c.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public y f1144a;
    }

    public ComponentActivity() {
        k kVar = new k(this);
        this.f1137c = kVar;
        a.q.b bVar = new a.q.b(this);
        this.d = bVar;
        this.f = new OnBackPressedDispatcher(new a());
        new AtomicInteger();
        this.g = new b(this);
        if (kVar != null) {
            kVar.a(new h() { // from class: androidx.activity.ComponentActivity.3
                @Override // a.n.h
                public void g(j jVar, f.a aVar) {
                    if (aVar == f.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView == null) {
                            return;
                        }
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            });
            kVar.a(new h() { // from class: androidx.activity.ComponentActivity.4
                @Override // a.n.h
                public void g(j jVar, f.a aVar) {
                    if (aVar == f.a.ON_DESTROY) {
                        ComponentActivity.this.f1136b.f3b = null;
                        if (ComponentActivity.this.isChangingConfigurations()) {
                            return;
                        }
                        ComponentActivity.this.e().a();
                    }
                }
            });
            kVar.a(new h() { // from class: androidx.activity.ComponentActivity.5
                @Override // a.n.h
                public void g(j jVar, f.a aVar) {
                    ComponentActivity.this.l();
                    k kVar2 = ComponentActivity.this.f1137c;
                    kVar2.c("removeObserver");
                    kVar2.f968a.e(this);
                }
            });
            bVar.f1072b.b("android:support:activity-result", new c());
            k(new d());
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Override // a.n.j
    public f a() {
        return this.f1137c;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m();
        super.addContentView(view, layoutParams);
    }

    @Override // a.a.c
    public final OnBackPressedDispatcher c() {
        return this.f;
    }

    @Override // a.q.c
    public final a.q.a d() {
        return this.d.f1072b;
    }

    @Override // a.n.z
    public y e() {
        if (getApplication() != null) {
            l();
            return this.e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // a.a.e.e
    public final a.a.e.d g() {
        return this.g;
    }

    public final void k(a.a.d.b bVar) {
        a.a.d.a aVar = this.f1136b;
        if (aVar.f3b != null) {
            bVar.a(aVar.f3b);
        }
        aVar.f2a.add(bVar);
    }

    public void l() {
        if (this.e == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.e = eVar.f1144a;
            }
            if (this.e != null) {
                return;
            }
            this.e = new y();
        }
    }

    public final void m() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.g.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f.a();
    }

    @Override // a.h.b.c, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.a(bundle);
        a.a.d.a aVar = this.f1136b;
        aVar.f3b = this;
        for (a.a.d.b bVar : aVar.f2a) {
            bVar.a(this);
        }
        super.onCreate(bundle);
        t.c(this);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.g.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        y yVar = this.e;
        if (yVar == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            yVar = eVar.f1144a;
        }
        if (yVar == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f1144a = yVar;
        return eVar2;
    }

    @Override // a.h.b.c, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        k kVar = this.f1137c;
        if (kVar instanceof k) {
            f.b bVar = f.b.CREATED;
            kVar.c("setCurrentState");
            kVar.f(bVar);
        }
        super.onSaveInstanceState(bundle);
        this.d.b(bundle);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (a.r.c.a()) {
                Trace.beginSection("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
