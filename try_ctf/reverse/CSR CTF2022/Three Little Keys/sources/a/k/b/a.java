package a.k.b;

import a.k.a.h;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f760a;

    /* renamed from: a.k.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0024a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f761a;

        /* renamed from: b  reason: collision with root package name */
        public final g f762b;

        public C0024a(EditText editText, boolean z) {
            this.f761a = editText;
            g gVar = new g(editText, z);
            this.f762b = gVar;
            editText.addTextChangedListener(gVar);
            if (a.k.b.b.f764b == null) {
                synchronized (a.k.b.b.f763a) {
                    if (a.k.b.b.f764b == null) {
                        a.k.b.b.f764b = new a.k.b.b();
                    }
                }
            }
            editText.setEditableFactory(a.k.b.b.f764b);
        }

        @Override // a.k.b.a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener != null) {
                return new e(keyListener);
            }
            return null;
        }

        @Override // a.k.b.a.b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f761a, inputConnection, editorInfo);
        }

        @Override // a.k.b.a.b
        public void c(boolean z) {
            g gVar = this.f762b;
            if (gVar.d != z) {
                if (gVar.f781c != null) {
                    a.k.a.h a2 = a.k.a.h.a();
                    h.e eVar = gVar.f781c;
                    Objects.requireNonNull(a2);
                    a.h.b.b.g(eVar, "initCallback cannot be null");
                    a2.f715a.writeLock().lock();
                    try {
                        a2.f716b.remove(eVar);
                    } finally {
                        a2.f715a.writeLock().unlock();
                    }
                }
                gVar.d = z;
                if (!z) {
                    return;
                }
                g.a(gVar.f779a, a.k.a.h.a().b());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public KeyListener a(KeyListener keyListener) {
            throw null;
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        public void c(boolean z) {
            throw null;
        }
    }

    public a(EditText editText, boolean z) {
        a.h.b.b.g(editText, "editText cannot be null");
        this.f760a = new C0024a(editText, z);
    }
}
