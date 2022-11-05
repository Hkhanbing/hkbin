package a.n;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, u> f983a = new HashMap<>();

    public final void a() {
        for (u uVar : this.f983a.values()) {
            Map<String, Object> map = uVar.f982a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : uVar.f982a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            uVar.a();
        }
        this.f983a.clear();
    }
}
