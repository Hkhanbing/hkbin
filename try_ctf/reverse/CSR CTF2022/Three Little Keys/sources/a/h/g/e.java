package a.h.g;

import android.util.Base64;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f556a;

    /* renamed from: b  reason: collision with root package name */
    public final String f557b;

    /* renamed from: c  reason: collision with root package name */
    public final String f558c;
    public final List<List<byte[]>> d;
    public final String e;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        Objects.requireNonNull(str);
        this.f556a = str;
        Objects.requireNonNull(str2);
        this.f557b = str2;
        this.f558c = str3;
        Objects.requireNonNull(list);
        this.d = list;
        this.e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder f = b.a.a.a.a.f("FontRequest {mProviderAuthority: ");
        f.append(this.f556a);
        f.append(", mProviderPackage: ");
        f.append(this.f557b);
        f.append(", mQuery: ");
        f.append(this.f558c);
        f.append(", mCertificates:");
        sb.append(f.toString());
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}
