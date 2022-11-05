package a.b.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class g0 {
    public static final RectF k = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> l = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f218a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f219b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f220c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public final TextView h;
    public final Context i;
    public final c j;

    /* loaded from: classes.dex */
    public static class a extends c {
    }

    /* loaded from: classes.dex */
    public static class b extends a {
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    public g0(TextView textView) {
        this.h = textView;
        this.i = textView.getContext();
        this.j = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
    }

    public final int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public final boolean b() {
        if (!d() || this.f218a != 1) {
            this.f219b = false;
        } else {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.e - this.d) / this.f220c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f220c) + this.d);
                }
                this.f = a(iArr);
            }
            this.f219b = true;
        }
        return this.f219b;
    }

    public final boolean c() {
        int[] iArr = this.f;
        int length = iArr.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.f218a = 1;
            this.d = iArr[0];
            this.e = iArr[length - 1];
            this.f220c = -1.0f;
        }
        return z;
    }

    public final boolean d() {
        return !(this.h instanceof m);
    }

    public final void e(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.f218a = 1;
            this.d = f;
            this.e = f2;
            this.f220c = f3;
            this.g = false;
        }
    }
}
