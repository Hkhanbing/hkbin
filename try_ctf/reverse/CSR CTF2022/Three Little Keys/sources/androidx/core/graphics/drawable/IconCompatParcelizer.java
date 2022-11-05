package androidx.core.graphics.drawable;

import a.u.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1249a = aVar.k(iconCompat.f1249a, 1);
        byte[] bArr = iconCompat.f1251c;
        if (aVar.i(2)) {
            bArr = aVar.g();
        }
        iconCompat.f1251c = bArr;
        iconCompat.d = aVar.m(iconCompat.d, 3);
        iconCompat.e = aVar.k(iconCompat.e, 4);
        iconCompat.f = aVar.k(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) aVar.m(iconCompat.g, 6);
        String str = iconCompat.i;
        if (aVar.i(7)) {
            str = aVar.n();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (aVar.i(8)) {
            str2 = aVar.n();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.f1249a) {
            case -1:
                parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1250b = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.d;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.f1251c;
                    iconCompat.f1250b = bArr2;
                    iconCompat.f1249a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr2.length;
                    break;
                }
                iconCompat.f1250b = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1251c, Charset.forName("UTF-16"));
                iconCompat.f1250b = str3;
                if (iconCompat.f1249a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f1250b = iconCompat.f1251c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        Objects.requireNonNull(aVar);
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f1249a) {
            case -1:
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1250b;
                break;
            case 2:
                iconCompat.f1251c = ((String) iconCompat.f1250b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1251c = (byte[]) iconCompat.f1250b;
                break;
            case 4:
            case 6:
                iconCompat.f1251c = iconCompat.f1250b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1249a;
        if (-1 != i) {
            aVar.p(1);
            aVar.t(i);
        }
        byte[] bArr = iconCompat.f1251c;
        if (bArr != null) {
            aVar.p(2);
            aVar.r(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            aVar.p(3);
            aVar.u(parcelable);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            aVar.p(4);
            aVar.t(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            aVar.p(5);
            aVar.t(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.p(6);
            aVar.u(colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.p(7);
            aVar.v(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            aVar.p(8);
            aVar.v(str2);
        }
    }
}
