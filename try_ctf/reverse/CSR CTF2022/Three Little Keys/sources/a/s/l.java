package a.s;

import a.h.j.w;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import de.cybersecurityrumble.threelittlekeys.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static h f1103a = new a.s.a();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<a.e.a<ViewGroup, ArrayList<h>>>> f1104b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f1105c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public h f1106a;

        /* renamed from: b  reason: collision with root package name */
        public ViewGroup f1107b;

        /* renamed from: a.s.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0033a extends k {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a.e.a f1108a;

            public C0033a(a.e.a aVar) {
                this.f1108a = aVar;
            }

            @Override // a.s.h.d
            public void c(h hVar) {
                ((ArrayList) this.f1108a.get(a.this.f1107b)).remove(hVar);
                hVar.v(this);
            }
        }

        public a(h hVar, ViewGroup viewGroup) {
            this.f1106a = hVar;
            this.f1107b = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x01f4 A[EDGE_INSN: B:139:0x01f4->B:93:0x01f4 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01f9  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 697
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a.s.l.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f1107b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f1107b.removeOnAttachStateChangeListener(this);
            l.f1105c.remove(this.f1107b);
            ArrayList<h> arrayList = l.b().get(this.f1107b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<h> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().x(this.f1107b);
                }
            }
            this.f1106a.i(true);
        }
    }

    public static void a(ViewGroup viewGroup, h hVar) {
        if (!f1105c.contains(viewGroup)) {
            AtomicInteger atomicInteger = a.h.j.w.f667a;
            if (!w.g.c(viewGroup)) {
                return;
            }
            f1105c.add(viewGroup);
            if (hVar == null) {
                hVar = f1103a;
            }
            h clone = hVar.clone();
            ArrayList<h> orDefault = b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<h> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().u(viewGroup);
                }
            }
            if (clone != null) {
                clone.h(viewGroup, true);
            }
            if (((g) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (clone == null) {
                    return;
                }
                a aVar = new a(clone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                return;
            }
            throw null;
        }
    }

    public static a.e.a<ViewGroup, ArrayList<h>> b() {
        a.e.a<ViewGroup, ArrayList<h>> aVar;
        WeakReference<a.e.a<ViewGroup, ArrayList<h>>> weakReference = f1104b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            a.e.a<ViewGroup, ArrayList<h>> aVar2 = new a.e.a<>();
            f1104b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }
}
