package a.o.a;

import a.n.j;
import a.n.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {
    public static <T extends j & z> a b(T t) {
        return new b(t, t.e());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
