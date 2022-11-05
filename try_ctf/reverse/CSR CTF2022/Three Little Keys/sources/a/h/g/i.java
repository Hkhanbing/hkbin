package a.h.g;

import a.h.g.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i implements a.h.i.a<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f566a;

    public i(String str) {
        this.f566a = str;
    }

    @Override // a.h.i.a
    /* renamed from: b */
    public void a(j.a aVar) {
        synchronized (j.f569c) {
            a.e.h<String, ArrayList<a.h.i.a<j.a>>> hVar = j.d;
            ArrayList<a.h.i.a<j.a>> arrayList = hVar.get(this.f566a);
            if (arrayList == null) {
                return;
            }
            hVar.remove(this.f566a);
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).a(aVar);
            }
        }
    }
}
