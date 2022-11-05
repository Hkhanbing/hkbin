package b.b.a.a.m;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicReference<a0> f1457a = new AtomicReference<>();

    public static long a(long j) {
        Calendar e = e();
        e.setTimeInMillis(j);
        return b(e).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar f = f(calendar);
        Calendar e = e();
        e.set(f.get(1), f.get(2), f.get(5));
        return e;
    }

    public static TimeZone c() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar d() {
        a0 a0Var = f1457a.get();
        if (a0Var == null) {
            a0Var = a0.f1451c;
        }
        TimeZone timeZone = a0Var.f1453b;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = a0Var.f1452a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(c());
        return calendar;
    }

    public static Calendar e() {
        return f(null);
    }

    public static Calendar f(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(c());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
