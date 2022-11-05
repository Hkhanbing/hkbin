package c.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class c {
    private static final byte[] FLAG = {9, 122, -88, 120, -13, -71, 85, 104, 90, 115, 12, -91, -65, 54, -89, 96, -52, 74, 106, 82, 101, -14, 41, -56, -119, -46, 55, -40, -125, 43, -127, -4, -114, -113, 86, 35, 31, -18, -81, -56, -127, 102, -48, 22, 76, 62, 101, Byte.MAX_VALUE};
    public static c d;

    /* renamed from: a  reason: collision with root package name */
    public String f1665a;

    /* renamed from: b  reason: collision with root package name */
    public String f1666b;

    /* renamed from: c  reason: collision with root package name */
    public String f1667c;

    public c(Context context) {
        if (d.f1668c == null) {
            d.f1668c = new d(context.getApplicationContext());
        }
        d a2 = d.a();
        SharedPreferences.Editor edit = a2.f1669a.edit();
        a2.f1670b = edit;
        edit.putString("KeyChain", "2a");
        a2.f1670b.apply();
        this.f1665a = "";
        this.f1666b = "";
        this.f1667c = "";
    }

    public static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    public static c getInstance() {
        c cVar = d;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Initialize with context before use.");
    }

    public static c getInstance(Context context) {
        if (d == null) {
            d = new c(context.getApplicationContext());
        }
        return d;
    }

    public boolean checkFirstKey() {
        String num = Integer.toString(new Random(3762L).nextInt(8000));
        this.f1665a = num;
        Log.i("Key Created", num);
        return !this.f1665a.isEmpty();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(6:2|3|4|(1:6)(1:55)|7|8)|(2:12|(16:14|15|16|(3:18|19|(12:21|22|23|(3:26|27|24)|28|29|(3:31|32|(2:40|41)(1:38))|42|32|(0)|40|41))|47|22|23|(1:24)|28|29|(0)|42|32|(0)|40|41))|51|15|16|(0)|47|22|23|(1:24)|28|29|(0)|42|32|(0)|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #2 {Exception -> 0x0064, blocks: (B:16:0x0033, B:18:0x0043), top: B:55:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055 A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #3 {Exception -> 0x0062, blocks: (B:23:0x004f, B:24:0x0052, B:26:0x0055), top: B:57:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkSecondKey(java.lang.String r9) {
        /*
            r8 = this;
            r8.f1666b = r9
            r0 = 1
            r1 = 0
            char r2 = r9.charAt(r0)     // Catch: java.lang.Exception -> L6a
            r3 = 99
            if (r2 != r3) goto Le
            r2 = r0
            goto Lf
        Le:
            r2 = r1
        Lf:
            char r3 = r9.charAt(r1)     // Catch: java.lang.Exception -> L67
            r4 = 2
            char r5 = r9.charAt(r4)     // Catch: java.lang.Exception -> L67
            if (r3 != r5) goto L32
            char r3 = r9.charAt(r4)     // Catch: java.lang.Exception -> L67
            r4 = 5
            char r5 = r9.charAt(r4)     // Catch: java.lang.Exception -> L67
            if (r3 != r5) goto L32
            char r3 = r9.charAt(r4)     // Catch: java.lang.Exception -> L67
            r4 = 6
            char r4 = r9.charAt(r4)     // Catch: java.lang.Exception -> L67
            if (r3 != r4) goto L32
            r3 = r0
            goto L33
        L32:
            r3 = r1
        L33:
            byte[] r9 = a(r9)     // Catch: java.lang.Exception -> L64
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Exception -> L64
            r4.<init>(r9)     // Catch: java.lang.Exception -> L64
            int r5 = r4.length()     // Catch: java.lang.Exception -> L64
            r6 = 4
            if (r5 != r6) goto L4e
            r5 = 3
            char r4 = r4.charAt(r5)     // Catch: java.lang.Exception -> L64
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L4e
            r4 = r0
            goto L4f
        L4e:
            r4 = r1
        L4f:
            r5 = r9[r1]     // Catch: java.lang.Exception -> L62
            r6 = r0
        L52:
            int r7 = r9.length     // Catch: java.lang.Exception -> L62
            if (r6 >= r7) goto L5c
            r7 = r9[r6]     // Catch: java.lang.Exception -> L62
            r5 = r5 & r7
            byte r5 = (byte) r5
            int r6 = r6 + 1
            goto L52
        L5c:
            r9 = 100
            if (r5 != r9) goto L77
            r9 = r0
            goto L78
        L62:
            r9 = move-exception
            goto L6e
        L64:
            r9 = move-exception
            r4 = r1
            goto L6e
        L67:
            r9 = move-exception
            r3 = r1
            goto L6d
        L6a:
            r9 = move-exception
            r2 = r1
            r3 = r2
        L6d:
            r4 = r3
        L6e:
            java.lang.String r9 = r9.getMessage()
            java.lang.String r5 = "KeyHelper"
            android.util.Log.d(r5, r9)
        L77:
            r9 = r1
        L78:
            java.lang.String r5 = r8.f1666b
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L89
            if (r2 == 0) goto L89
            if (r3 == 0) goto L89
            if (r4 == 0) goto L89
            if (r9 == 0) goto L89
            goto L8a
        L89:
            r0 = r1
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.c.checkSecondKey(java.lang.String):boolean");
    }

    public boolean checkThirdKey() {
        String string = d.a().f1669a.getString("ThirdKey", "");
        this.f1667c = string;
        Log.d("Key Found", string);
        boolean z = !this.f1667c.isEmpty() && Pattern.compile("\\d{2}[*!=()%?$#]\\p{Upper}\\d+!").matcher(this.f1667c).find() && this.f1667c.length() == 8 && this.f1667c.charAt(0) == this.f1667c.charAt(6) && this.f1667c.charAt(1) == this.f1667c.charAt(4);
        if (this.f1667c.isEmpty() || z) {
            return !this.f1667c.isEmpty() && z;
        }
        throw new IllegalArgumentException("You're looking at the right place, but are still missing something.");
    }

    public String openLock() {
        String str = this.f1665a;
        String str2 = this.f1666b;
        String str3 = this.f1667c;
        String string = d.a().f1669a.getString("KeyChain", "");
        byte[] a2 = a(str + string + str2 + string);
        byte[] bytes = str3.getBytes();
        byte[] bArr = new byte[a2.length + bytes.length];
        System.arraycopy(a2, 0, bArr, 0, a2.length);
        System.arraycopy(bytes, 0, bArr, a2.length, bytes.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            byte[] bArr2 = FLAG;
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(bArr2), "UTF-8");
        } catch (Exception e) {
            Log.d("KeyHelper", e.getMessage());
            return "";
        }
    }
}
