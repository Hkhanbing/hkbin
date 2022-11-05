package a.o.a;

import a.e.i;
import a.n.j;
import a.n.o;
import a.n.p;
import a.n.u;
import a.n.v;
import a.n.w;
import a.n.x;
import a.n.y;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

/* loaded from: classes.dex */
public class b extends a.o.a.a {

    /* renamed from: a  reason: collision with root package name */
    public final j f984a;

    /* renamed from: b  reason: collision with root package name */
    public final C0027b f985b;

    /* loaded from: classes.dex */
    public static class a<D> extends o<D> {
        @Override // androidx.lifecycle.LiveData
        public void d() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public void e() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void f(p<? super D> pVar) {
            super.f(pVar);
        }

        @Override // a.n.o
        public void g(D d) {
            super.g(d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            a.h.b.b.c(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: a.o.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0027b extends u {

        /* renamed from: c  reason: collision with root package name */
        public static final v f986c = new a();

        /* renamed from: b  reason: collision with root package name */
        public i<a> f987b = new i<>();

        /* renamed from: a.o.a.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements v {
            public <T extends u> T a(Class<T> cls) {
                return new C0027b();
            }
        }

        @Override // a.n.u
        public void a() {
            if (this.f987b.g() <= 0) {
                i<a> iVar = this.f987b;
                int i = iVar.f361c;
                Object[] objArr = iVar.f360b;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                iVar.f361c = 0;
                return;
            }
            Objects.requireNonNull(this.f987b.h(0));
            throw null;
        }
    }

    public b(j jVar, y yVar) {
        this.f984a = jVar;
        v vVar = C0027b.f986c;
        String canonicalName = C0027b.class.getCanonicalName();
        if (canonicalName != null) {
            String d = b.a.a.a.a.d("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            u uVar = yVar.f983a.get(d);
            if (!C0027b.class.isInstance(uVar)) {
                uVar = vVar instanceof w ? ((w) vVar).a(d, C0027b.class) : ((C0027b.a) vVar).a(C0027b.class);
                u put = yVar.f983a.put(d, uVar);
                if (put != null) {
                    put.a();
                }
            } else if (vVar instanceof x) {
                x xVar = (x) vVar;
            }
            this.f985b = (C0027b) uVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // a.o.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0027b c0027b = this.f985b;
        if (c0027b.f987b.g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (c0027b.f987b.g() <= 0) {
                return;
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c0027b.f987b.e(0));
            printWriter.print(": ");
            printWriter.println(c0027b.f987b.h(0).toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a.h.b.b.c(this.f984a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
