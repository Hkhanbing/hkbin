package a.b.c;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* loaded from: classes.dex */
public class r {
    public static r d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f61a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f62b;

    /* renamed from: c  reason: collision with root package name */
    public final a f63c = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f64a;

        /* renamed from: b  reason: collision with root package name */
        public long f65b;
    }

    public r(Context context, LocationManager locationManager) {
        this.f61a = context;
        this.f62b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (!this.f62b.isProviderEnabled(str)) {
                return null;
            }
            return this.f62b.getLastKnownLocation(str);
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
