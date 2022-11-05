package a.h.j.e0;

import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final b f655a;

    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f656a;

        public a(Object obj) {
            this.f656a = (InputContentInfo) obj;
        }

        public Object a() {
            return this.f656a;
        }

        public void b() {
            this.f656a.requestPermission();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public e(b bVar) {
        this.f655a = bVar;
    }
}
