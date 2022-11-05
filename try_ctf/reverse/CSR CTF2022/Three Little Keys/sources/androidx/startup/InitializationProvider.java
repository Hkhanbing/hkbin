package androidx.startup;

import a.r.a;
import a.r.b;
import a.r.d;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            a b2 = a.b(context);
            Objects.requireNonNull(b2);
            try {
                try {
                    Trace.beginSection("Startup");
                    Bundle bundle = b2.f1075c.getPackageManager().getProviderInfo(new ComponentName(b2.f1075c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                    String string = b2.f1075c.getString(R.string.androidx_startup);
                    if (bundle != null) {
                        HashSet hashSet = new HashSet();
                        for (String str : bundle.keySet()) {
                            if (string.equals(bundle.getString(str, null))) {
                                Class<?> cls = Class.forName(str);
                                if (b.class.isAssignableFrom(cls)) {
                                    b2.f1074b.add(cls);
                                    b2.a(cls, hashSet);
                                }
                            }
                        }
                    }
                    Trace.endSection();
                    return true;
                } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
                    throw new d(e);
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        throw new d("Context cannot be null");
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
