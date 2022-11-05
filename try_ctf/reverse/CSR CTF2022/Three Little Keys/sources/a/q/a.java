package a.q;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public Bundle f1069b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1070c;
    public Recreator.a d;

    /* renamed from: a  reason: collision with root package name */
    public a.c.a.b.b<String, b> f1068a = new a.c.a.b.b<>();
    public boolean e = true;

    /* renamed from: a.q.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0030a {
        void a(c cVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.f1070c) {
            Bundle bundle = this.f1069b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f1069b.remove(str);
            if (this.f1069b.isEmpty()) {
                this.f1069b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void b(String str, b bVar) {
        if (this.f1068a.d(str, bVar) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public void c(Class<? extends InterfaceC0030a> cls) {
        if (this.e) {
            if (this.d == null) {
                this.d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar = this.d;
                aVar.f1357a.add(cls.getName());
                return;
            } catch (NoSuchMethodException e) {
                StringBuilder f = b.a.a.a.a.f("Class");
                f.append(cls.getSimpleName());
                f.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(f.toString(), e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
