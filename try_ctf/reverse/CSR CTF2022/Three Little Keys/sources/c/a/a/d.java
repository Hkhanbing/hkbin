package c.a.a;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    public static d f1668c;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f1669a;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences.Editor f1670b;

    public d(Context context) {
        this.f1669a = context.getSharedPreferences("ThreeLittleKeys", 0);
    }

    public static d a() {
        d dVar = f1668c;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Initialize with context before use.");
    }
}
