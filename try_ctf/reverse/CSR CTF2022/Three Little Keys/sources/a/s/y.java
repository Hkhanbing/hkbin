package a.s;

import a.s.h;
import android.view.View;
import android.view.ViewGroup;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class y extends k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1124a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1125b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1126c;
    public final /* synthetic */ z d;

    public y(z zVar, ViewGroup viewGroup, View view, View view2) {
        this.d = zVar;
        this.f1124a = viewGroup;
        this.f1125b = view;
        this.f1126c = view2;
    }

    @Override // a.s.h.d
    public void c(h hVar) {
        this.f1126c.setTag(R.id.save_overlay_view, null);
        this.f1124a.getOverlay().remove(this.f1125b);
        hVar.v(this);
    }

    @Override // a.s.k, a.s.h.d
    public void d(h hVar) {
        this.f1124a.getOverlay().remove(this.f1125b);
    }

    @Override // a.s.k, a.s.h.d
    public void e(h hVar) {
        if (this.f1125b.getParent() == null) {
            this.f1124a.getOverlay().add(this.f1125b);
            return;
        }
        z zVar = this.d;
        int size = zVar.m.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            zVar.m.get(size).cancel();
        }
        ArrayList<h.d> arrayList = zVar.q;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) zVar.q.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((h.d) arrayList2.get(i)).b(zVar);
        }
    }
}
