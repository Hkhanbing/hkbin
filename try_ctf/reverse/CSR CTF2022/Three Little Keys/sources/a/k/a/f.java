package a.k.a;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.List;

/* loaded from: classes.dex */
public class f extends e {
    @Override // a.k.a.e
    public ProviderInfo a(ResolveInfo resolveInfo) {
        return resolveInfo.providerInfo;
    }

    @Override // a.k.a.e
    public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i) {
        return packageManager.queryIntentContentProviders(intent, i);
    }
}
