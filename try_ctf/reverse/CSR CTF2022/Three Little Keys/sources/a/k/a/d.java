package a.k.a;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class d {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
