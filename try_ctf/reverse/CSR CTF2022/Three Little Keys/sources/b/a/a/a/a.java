package b.a.a.a;

import a.l.b.m;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: outline */
/* loaded from: classes.dex */
public class a {
    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static String b(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.A());
        return sb.toString();
    }

    public static String c(String str, m mVar, String str2) {
        return str + mVar + str2;
    }

    public static String d(String str, String str2) {
        return str + str2;
    }

    public static String e(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static StringBuilder f(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }
}
