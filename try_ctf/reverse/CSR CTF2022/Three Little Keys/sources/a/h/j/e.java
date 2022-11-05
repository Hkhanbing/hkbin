package a.h.j;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0017e f643a;

    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f644a;

        public a(ClipData clipData, int i) {
            this.f644a = new ContentInfo.Builder(clipData, i);
        }

        @Override // a.h.j.e.b
        public void a(Bundle bundle) {
            this.f644a.setExtras(bundle);
        }

        @Override // a.h.j.e.b
        public void b(Uri uri) {
            this.f644a.setLinkUri(uri);
        }

        @Override // a.h.j.e.b
        public e c() {
            return new e(new d(this.f644a.build()));
        }

        @Override // a.h.j.e.b
        public void d(int i) {
            this.f644a.setFlags(i);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Bundle bundle);

        void b(Uri uri);

        e c();

        void d(int i);
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public ClipData f645a;

        /* renamed from: b  reason: collision with root package name */
        public int f646b;

        /* renamed from: c  reason: collision with root package name */
        public int f647c;
        public Uri d;
        public Bundle e;

        public c(ClipData clipData, int i) {
            this.f645a = clipData;
            this.f646b = i;
        }

        @Override // a.h.j.e.b
        public void a(Bundle bundle) {
            this.e = bundle;
        }

        @Override // a.h.j.e.b
        public void b(Uri uri) {
            this.d = uri;
        }

        @Override // a.h.j.e.b
        public e c() {
            return new e(new f(this));
        }

        @Override // a.h.j.e.b
        public void d(int i) {
            this.f647c = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements InterfaceC0017e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f648a;

        public d(ContentInfo contentInfo) {
            Objects.requireNonNull(contentInfo);
            this.f648a = contentInfo;
        }

        @Override // a.h.j.e.InterfaceC0017e
        public int a() {
            return this.f648a.getSource();
        }

        @Override // a.h.j.e.InterfaceC0017e
        public ClipData b() {
            return this.f648a.getClip();
        }

        @Override // a.h.j.e.InterfaceC0017e
        public int c() {
            return this.f648a.getFlags();
        }

        @Override // a.h.j.e.InterfaceC0017e
        public ContentInfo d() {
            return this.f648a;
        }

        public String toString() {
            StringBuilder f = b.a.a.a.a.f("ContentInfoCompat{");
            f.append(this.f648a);
            f.append("}");
            return f.toString();
        }
    }

    /* renamed from: a.h.j.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0017e {
        int a();

        ClipData b();

        int c();

        ContentInfo d();
    }

    /* loaded from: classes.dex */
    public static final class f implements InterfaceC0017e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f649a;

        /* renamed from: b  reason: collision with root package name */
        public final int f650b;

        /* renamed from: c  reason: collision with root package name */
        public final int f651c;
        public final Uri d;
        public final Bundle e;

        public f(c cVar) {
            ClipData clipData = cVar.f645a;
            Objects.requireNonNull(clipData);
            this.f649a = clipData;
            int i = cVar.f646b;
            if (i >= 0) {
                if (i <= 5) {
                    this.f650b = i;
                    int i2 = cVar.f647c;
                    if ((i2 & 1) == i2) {
                        this.f651c = i2;
                        this.d = cVar.d;
                        this.e = cVar.e;
                        return;
                    }
                    StringBuilder f = b.a.a.a.a.f("Requested flags 0x");
                    f.append(Integer.toHexString(i2));
                    f.append(", but only 0x");
                    f.append(Integer.toHexString(1));
                    f.append(" are allowed");
                    throw new IllegalArgumentException(f.toString());
                }
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }

        @Override // a.h.j.e.InterfaceC0017e
        public int a() {
            return this.f650b;
        }

        @Override // a.h.j.e.InterfaceC0017e
        public ClipData b() {
            return this.f649a;
        }

        @Override // a.h.j.e.InterfaceC0017e
        public int c() {
            return this.f651c;
        }

        @Override // a.h.j.e.InterfaceC0017e
        public ContentInfo d() {
            return null;
        }

        public String toString() {
            String str;
            String sb;
            StringBuilder f = b.a.a.a.a.f("ContentInfoCompat{clip=");
            f.append(this.f649a.getDescription());
            f.append(", source=");
            int i = this.f650b;
            if (i == 0) {
                str = "SOURCE_APP";
            } else if (i == 1) {
                str = "SOURCE_CLIPBOARD";
            } else if (i == 2) {
                str = "SOURCE_INPUT_METHOD";
            } else if (i == 3) {
                str = "SOURCE_DRAG_AND_DROP";
            } else if (i != 4) {
                str = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
            } else {
                str = "SOURCE_AUTOFILL";
            }
            f.append(str);
            f.append(", flags=");
            int i2 = this.f651c;
            f.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            String str2 = "";
            if (this.d == null) {
                sb = str2;
            } else {
                StringBuilder f2 = b.a.a.a.a.f(", hasLinkUri(");
                f2.append(this.d.toString().length());
                f2.append(")");
                sb = f2.toString();
            }
            f.append(sb);
            if (this.e != null) {
                str2 = ", hasExtras";
            }
            f.append(str2);
            f.append("}");
            return f.toString();
        }
    }

    public e(InterfaceC0017e interfaceC0017e) {
        this.f643a = interfaceC0017e;
    }

    public String toString() {
        return this.f643a.toString();
    }
}
