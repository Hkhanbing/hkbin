package a.b;

import a.b.f.i1;
import a.b.f.t0;
import a.f.a.i.c;
import a.f.a.i.d;
import a.f.a.i.f;
import a.f.a.i.h;
import a.f.a.i.l.n;
import a.h.c.b.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02e1, code lost:
        if (r3[r17].f.d == r9) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0148, code lost:
        if (r4[r2].f.d == r5) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x050e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x060a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0718 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0759 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0776 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(a.f.a.i.e r37, a.f.a.d r38, java.util.ArrayList<a.f.a.i.d> r39, int r40) {
        /*
            Method dump skipped, instructions count: 1925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.a.a(a.f.a.i.e, a.f.a.d, java.util.ArrayList, int):void");
    }

    public static n b(d dVar, int i, ArrayList<n> arrayList, n nVar) {
        c cVar;
        int i2;
        int i3 = i == 0 ? dVar.p0 : dVar.q0;
        int i4 = 0;
        if (i3 != -1 && (nVar == null || i3 != nVar.f425b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                n nVar2 = arrayList.get(i5);
                if (nVar2.f425b == i3) {
                    if (nVar != null) {
                        nVar.d(i, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i5++;
                }
            }
        } else if (i3 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof h) {
                h hVar = (h) dVar;
                int i6 = 0;
                while (true) {
                    if (i6 >= hVar.s0) {
                        i2 = -1;
                        break;
                    }
                    d dVar2 = hVar.r0[i6];
                    if ((i == 0 && (i2 = dVar2.p0) != -1) || (i == 1 && (i2 = dVar2.q0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i2 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = arrayList.get(i7);
                        if (nVar3.f425b == i2) {
                            nVar = nVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n(i);
            }
            arrayList.add(nVar);
        }
        if (nVar.a(dVar)) {
            if (dVar instanceof f) {
                f fVar = (f) dVar;
                c cVar2 = fVar.u0;
                if (fVar.v0 == 0) {
                    i4 = 1;
                }
                cVar2.b(i4, arrayList, nVar);
            }
            if (i == 0) {
                dVar.p0 = nVar.f425b;
                dVar.J.b(i, arrayList, nVar);
                cVar = dVar.L;
            } else {
                dVar.q0 = nVar.f425b;
                dVar.K.b(i, arrayList, nVar);
                dVar.N.b(i, arrayList, nVar);
                cVar = dVar.M;
            }
            cVar.b(i, arrayList, nVar);
            dVar.Q.b(i, arrayList, nVar);
        }
        return nVar;
    }

    public static n c(ArrayList<n> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            n nVar = arrayList.get(i2);
            if (i == nVar.f425b) {
                return nVar;
            }
        }
        return null;
    }

    public static ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        h.a aVar;
        Object obj = a.h.c.a.f500a;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        h.b bVar = new h.b(resources, theme);
        synchronized (a.h.c.b.h.f517c) {
            SparseArray<h.a> sparseArray = a.h.c.b.h.f516b.get(bVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i)) != null) {
                if (aVar.f519b.equals(bVar.f520a.getConfiguration())) {
                    colorStateList2 = aVar.f518a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = a.h.c.b.h.f515a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        if (!z) {
            try {
                colorStateList = a.h.c.b.c.a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList != null) {
            synchronized (a.h.c.b.h.f517c) {
                WeakHashMap<h.b, SparseArray<h.a>> weakHashMap = a.h.c.b.h.f516b;
                SparseArray<h.a> sparseArray2 = weakHashMap.get(bVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    weakHashMap.put(bVar, sparseArray2);
                }
                sparseArray2.append(i, new h.a(colorStateList, bVar.f520a.getConfiguration()));
            }
            return colorStateList;
        }
        return resources.getColorStateList(i, theme);
    }

    public static Drawable e(Context context, int i) {
        return t0.c().e(context, i);
    }

    public static String f(Context context, int i) {
        if (i != -1) {
            try {
                return context.getResources().getResourceEntryName(i);
            } catch (Exception unused) {
                return "?" + i;
            }
        }
        return "UNKNOWN";
    }

    public static String g(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static InputConnection h(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof i1) {
                    editorInfo.hintText = ((i1) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    public static boolean i(d.a aVar, d.a aVar2, d.a aVar3, d.a aVar4) {
        d.a aVar5 = d.a.MATCH_PARENT;
        d.a aVar6 = d.a.WRAP_CONTENT;
        d.a aVar7 = d.a.FIXED;
        return (aVar3 == aVar7 || aVar3 == aVar6 || (aVar3 == aVar5 && aVar != aVar6)) || (aVar4 == aVar7 || aVar4 == aVar6 || (aVar4 == aVar5 && aVar2 != aVar6));
    }
}
