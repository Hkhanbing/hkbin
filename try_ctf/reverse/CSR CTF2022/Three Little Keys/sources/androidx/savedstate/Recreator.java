package androidx.savedstate;

import a.n.f;
import a.n.h;
import a.n.j;
import a.n.k;
import a.q.a;
import a.q.c;
import android.annotation.SuppressLint;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements h {

    /* renamed from: a  reason: collision with root package name */
    public final c f1356a;

    /* loaded from: classes.dex */
    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f1357a = new HashSet();

        public a(a.q.a aVar) {
            aVar.b("androidx.savedstate.Restarter", this);
        }

        @Override // a.q.a.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f1357a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        this.f1356a = cVar;
    }

    @Override // a.n.h
    public void g(j jVar, f.a aVar) {
        Class cls;
        if (aVar == f.a.ON_CREATE) {
            k kVar = (k) jVar.a();
            kVar.c("removeObserver");
            kVar.f968a.e(this);
            Bundle a2 = this.f1356a.d().a("androidx.savedstate.Restarter");
            if (a2 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
            if (stringArrayList == null) {
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    try {
                        Constructor declaredConstructor = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0030a.class).getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        try {
                            ((a.InterfaceC0030a) declaredConstructor.newInstance(new Object[0])).a(this.f1356a);
                        } catch (Exception e) {
                            throw new RuntimeException(b.a.a.a.a.d("Failed to instantiate ", next), e);
                        }
                    } catch (NoSuchMethodException e2) {
                        StringBuilder f = b.a.a.a.a.f("Class");
                        f.append(cls.getSimpleName());
                        f.append(" must have default constructor in order to be automatically recreated");
                        throw new IllegalStateException(f.toString(), e2);
                    }
                } catch (ClassNotFoundException e3) {
                    throw new RuntimeException(b.a.a.a.a.e("Class ", next, " wasn't found"), e3);
                }
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
