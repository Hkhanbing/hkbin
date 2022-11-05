package a.h.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a.h.h.c f594a = new C0016d(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final a.h.h.c f595b = new C0016d(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final a.h.h.c f596c;
    public static final a.h.h.c d;

    /* loaded from: classes.dex */
    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f597a = new a();

        @Override // a.h.h.d.b
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i));
                a.h.h.c cVar = d.f594a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i4 = 2;
                                break;
                        }
                        i++;
                    }
                    i4 = 0;
                    i++;
                }
                i4 = 1;
                i++;
            }
            return i4;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* loaded from: classes.dex */
    public static abstract class c implements a.h.h.c {

        /* renamed from: a  reason: collision with root package name */
        public final b f598a;

        public c(b bVar) {
            this.f598a = bVar;
        }

        public abstract boolean a();

        public boolean b(CharSequence charSequence, int i, int i2) {
            if (i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f598a;
            if (bVar == null) {
                return a();
            }
            int a2 = bVar.a(charSequence, i, i2);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                return false;
            }
            return a();
        }
    }

    /* renamed from: a.h.h.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0016d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f599b;

        public C0016d(b bVar, boolean z) {
            super(bVar);
            this.f599b = z;
        }

        @Override // a.h.h.d.c
        public boolean a() {
            return this.f599b;
        }
    }

    static {
        a aVar = a.f597a;
        f596c = new C0016d(aVar, false);
        d = new C0016d(aVar, true);
    }
}
