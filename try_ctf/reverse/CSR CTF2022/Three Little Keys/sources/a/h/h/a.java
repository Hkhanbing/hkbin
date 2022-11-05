package a.h.h;

import a.h.h.d;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {
    public static final c d;
    public static final String e;
    public static final String f;
    public static final a g;
    public static final a h;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f585a;

    /* renamed from: b  reason: collision with root package name */
    public final int f586b;

    /* renamed from: c  reason: collision with root package name */
    public final c f587c;

    /* renamed from: a.h.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0015a {
        public static final byte[] e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f588a;

        /* renamed from: b  reason: collision with root package name */
        public final int f589b;

        /* renamed from: c  reason: collision with root package name */
        public int f590c;
        public char d;

        static {
            for (int i = 0; i < 1792; i++) {
                e[i] = Character.getDirectionality(i);
            }
        }

        public C0015a(CharSequence charSequence, boolean z) {
            this.f588a = charSequence;
            this.f589b = charSequence.length();
        }

        public byte a() {
            char charAt = this.f588a.charAt(this.f590c - 1);
            this.d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f588a, this.f590c);
                this.f590c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f590c--;
            char c2 = this.d;
            return c2 < 1792 ? e[c2] : Character.getDirectionality(c2);
        }
    }

    static {
        c cVar = d.f596c;
        d = cVar;
        e = Character.toString((char) 8206);
        f = Character.toString((char) 8207);
        g = new a(false, 2, cVar);
        h = new a(true, 2, cVar);
    }

    public a(boolean z, int i, c cVar) {
        this.f585a = z;
        this.f586b = i;
        this.f587c = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r3 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r4 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r0.f590c <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        switch(r0.a()) {
            case 14: goto L64;
            case 15: goto L64;
            case 16: goto L59;
            case 17: goto L59;
            case 18: goto L55;
            default: goto L67;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r3 != r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
        if (r3 != r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            a.h.h.a$a r0 = new a.h.h.a$a
            r1 = 0
            r0.<init>(r9, r1)
            r0.f590c = r1
            r9 = -1
            r2 = 1
            r3 = r1
            r4 = r3
            r5 = r4
        Ld:
            int r6 = r0.f590c
            int r7 = r0.f589b
            if (r6 >= r7) goto L70
            if (r3 != 0) goto L70
            java.lang.CharSequence r7 = r0.f588a
            char r6 = r7.charAt(r6)
            r0.d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L39
            java.lang.CharSequence r6 = r0.f588a
            int r7 = r0.f590c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f590c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f590c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L4d
        L39:
            int r6 = r0.f590c
            int r6 = r6 + r2
            r0.f590c = r6
            char r6 = r0.d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L49
            byte[] r7 = a.h.h.a.C0015a.e
            r6 = r7[r6]
            goto L4d
        L49:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L4d:
            if (r6 == 0) goto L6b
            if (r6 == r2) goto L68
            r7 = 2
            if (r6 == r7) goto L68
            r7 = 9
            if (r6 == r7) goto Ld
            switch(r6) {
                case 14: goto L64;
                case 15: goto L64;
                case 16: goto L60;
                case 17: goto L60;
                case 18: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L6e
        L5c:
            int r5 = r5 + (-1)
            r4 = r1
            goto Ld
        L60:
            int r5 = r5 + 1
            r4 = r2
            goto Ld
        L64:
            int r5 = r5 + 1
            r4 = r9
            goto Ld
        L68:
            if (r5 != 0) goto L6e
            goto L88
        L6b:
            if (r5 != 0) goto L6e
            goto L8c
        L6e:
            r3 = r5
            goto Ld
        L70:
            if (r3 != 0) goto L73
            goto L91
        L73:
            if (r4 == 0) goto L77
            r1 = r4
            goto L91
        L77:
            int r4 = r0.f590c
            if (r4 <= 0) goto L91
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L8a;
                case 15: goto L8a;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r5 = r5 + 1
            goto L77
        L86:
            if (r3 != r5) goto L8e
        L88:
            r1 = r2
            goto L91
        L8a:
            if (r3 != r5) goto L8e
        L8c:
            r1 = r9
            goto L91
        L8e:
            int r5 = r5 + (-1)
            goto L77
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.h.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.CharSequence r6) {
        /*
            a.h.h.a$a r0 = new a.h.h.a$a
            r1 = 0
            r0.<init>(r6, r1)
            int r6 = r0.f589b
            r0.f590c = r6
            r6 = r1
        Lb:
            r2 = r6
        Lc:
            int r3 = r0.f590c
            r4 = 1
            if (r3 <= 0) goto L41
            byte r3 = r0.a()
            if (r3 == 0) goto L39
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r6 != 0) goto Lc
            goto L3f
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            if (r6 != r2) goto L2f
            goto L34
        L2c:
            if (r6 != r2) goto L2f
            goto L3b
        L2f:
            int r2 = r2 + (-1)
            goto Lc
        L32:
            if (r2 != 0) goto L36
        L34:
            r1 = r4
            goto L41
        L36:
            if (r6 != 0) goto Lc
            goto L3f
        L39:
            if (r2 != 0) goto L3d
        L3b:
            r1 = -1
            goto L41
        L3d:
            if (r6 != 0) goto Lc
        L3f:
            r6 = r2
            goto Lb
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.h.a.b(java.lang.CharSequence):int");
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        Locale locale2 = e.f600a;
        boolean z = true;
        if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
            z = false;
        }
        c cVar = d;
        if (cVar == d) {
            return z ? h : g;
        }
        return new a(z, 2, cVar);
    }

    public CharSequence d(CharSequence charSequence, c cVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean b2 = ((d.c) cVar).b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (((this.f586b & 2) != 0) && z) {
            boolean b3 = ((d.c) (b2 ? d.f595b : d.f594a)).b(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((this.f585a || (!b3 && a(charSequence) != 1)) ? (!this.f585a || (b3 && a(charSequence) != -1)) ? str : f : e));
        }
        if (b2 != this.f585a) {
            spannableStringBuilder.append(b2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean b4 = ((d.c) (b2 ? d.f595b : d.f594a)).b(charSequence, 0, charSequence.length());
            if (!this.f585a && (b4 || b(charSequence) == 1)) {
                str = e;
            } else if (this.f585a && (!b4 || b(charSequence) == -1)) {
                str = f;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        return spannableStringBuilder;
    }
}
