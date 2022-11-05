package a.k.a;

import a.k.a.h;
import a.k.a.n;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final h.i f733a;

    /* renamed from: b  reason: collision with root package name */
    public final n f734b;

    /* renamed from: c  reason: collision with root package name */
    public h.d f735c;

    /* loaded from: classes.dex */
    public static class a implements h.d {

        /* renamed from: b  reason: collision with root package name */
        public static final ThreadLocal<StringBuilder> f736b = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f737a;

        public a() {
            TextPaint textPaint = new TextPaint();
            this.f737a = textPaint;
            textPaint.setTextSize(10.0f);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f738a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final n.a f739b;

        /* renamed from: c  reason: collision with root package name */
        public n.a f740c;
        public n.a d;
        public int e;
        public int f;

        public b(n.a aVar, boolean z, int[] iArr) {
            this.f739b = aVar;
            this.f740c = aVar;
        }

        public int a(int i) {
            SparseArray<n.a> sparseArray = this.f740c.f750a;
            n.a aVar = sparseArray == null ? null : sparseArray.get(i);
            int i2 = 3;
            if (this.f738a != 2) {
                if (aVar != null) {
                    this.f738a = 2;
                    this.f740c = aVar;
                    this.f = 1;
                    i2 = 2;
                }
                b();
                i2 = 1;
            } else {
                if (aVar != null) {
                    this.f740c = aVar;
                    this.f++;
                } else {
                    boolean z = false;
                    if (!(i == 65038)) {
                        if (i == 65039) {
                            z = true;
                        }
                        if (!z) {
                            n.a aVar2 = this.f740c;
                            if (aVar2.f751b != null) {
                                if (this.f == 1) {
                                    if (c()) {
                                        aVar2 = this.f740c;
                                    }
                                }
                                this.d = aVar2;
                                b();
                            }
                        }
                    }
                    b();
                    i2 = 1;
                }
                i2 = 2;
            }
            this.e = i;
            return i2;
        }

        public final int b() {
            this.f738a = 1;
            this.f740c = this.f739b;
            this.f = 0;
            return 1;
        }

        public final boolean c() {
            a.k.a.q.a e = this.f740c.f751b.e();
            int a2 = e.a(6);
            if ((a2 == 0 || e.f757b.get(a2 + e.f756a) == 0) ? false : true) {
                return true;
            }
            return this.e == 65039;
        }
    }

    public k(n nVar, h.i iVar, h.d dVar, boolean z, int[] iArr) {
        this.f733a = iVar;
        this.f734b = nVar;
        this.f735c = dVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        l[] lVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (lVarArr = (l[]) editable.getSpans(selectionStart, selectionEnd, l.class)) != null && lVarArr.length > 0) {
            for (l lVar : lVarArr) {
                int spanStart = editable.getSpanStart(lVar);
                int spanEnd = editable.getSpanEnd(lVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i, int i2, j jVar) {
        if (jVar.f732c == 0) {
            h.d dVar = this.f735c;
            a.k.a.q.a e = jVar.e();
            int a2 = e.a(8);
            if (a2 != 0) {
                e.f757b.getShort(a2 + e.f756a);
            }
            a aVar = (a) dVar;
            Objects.requireNonNull(aVar);
            ThreadLocal<StringBuilder> threadLocal = a.f736b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = aVar.f737a;
            String sb2 = sb.toString();
            ThreadLocal<a.h.i.b<Rect, Rect>> threadLocal2 = a.h.d.c.f536a;
            jVar.f732c = textPaint.hasGlyph(sb2) ? 2 : 1;
        }
        return jVar.f732c == 2;
    }
}
