package a.b.f;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public class a1 extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f156a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof a1) && !(context.getResources() instanceof c1)) {
            context.getResources();
            int i = g1.f221a;
        }
        return context;
    }
}
