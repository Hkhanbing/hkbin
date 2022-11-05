package a.h.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f545a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC0014a f546b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f547c;

    /* renamed from: a.h.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0014a {
        void a();
    }

    public void a() {
        synchronized (this) {
            if (this.f545a) {
                return;
            }
            this.f545a = true;
            this.f547c = true;
            InterfaceC0014a interfaceC0014a = this.f546b;
            if (interfaceC0014a != null) {
                try {
                    interfaceC0014a.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f547c = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.f547c = false;
                notifyAll();
            }
        }
    }

    public void b(InterfaceC0014a interfaceC0014a) {
        synchronized (this) {
            while (this.f547c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f546b == interfaceC0014a) {
                return;
            }
            this.f546b = interfaceC0014a;
            if (!this.f545a) {
                return;
            }
            interfaceC0014a.a();
        }
    }
}
