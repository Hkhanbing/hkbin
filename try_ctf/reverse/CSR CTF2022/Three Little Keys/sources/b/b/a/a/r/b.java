package b.b.a.a.r;

import android.view.View;
import android.view.ViewGroup;
import b.b.a.a.r.i;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class b<T extends i<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, T> f1527a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Set<Integer> f1528b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public a f1529c;
    public boolean d;
    public boolean e;

    /* loaded from: classes.dex */
    public interface a {
    }

    public final boolean a(i<T> iVar) {
        int id = iVar.getId();
        if (this.f1528b.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.f1527a.get(Integer.valueOf(c()));
        if (t != null) {
            e(t, false);
        }
        boolean add = this.f1528b.add(Integer.valueOf(id));
        if (!iVar.isChecked()) {
            iVar.setChecked(true);
        }
        return add;
    }

    public List<Integer> b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f1528b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof i) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int c() {
        if (!this.d || this.f1528b.isEmpty()) {
            return -1;
        }
        return this.f1528b.iterator().next().intValue();
    }

    public final void d() {
        a aVar = this.f1529c;
        if (aVar != null) {
            new HashSet(this.f1528b);
            ChipGroup chipGroup = ((b.b.a.a.k.d) aVar).f1436a;
            ChipGroup.d dVar = chipGroup.g;
            if (dVar == null) {
                return;
            }
            chipGroup.h.b(chipGroup);
            ChipGroup.a aVar2 = (ChipGroup.a) dVar;
            ChipGroup chipGroup2 = ChipGroup.this;
            if (!chipGroup2.h.d) {
                return;
            }
            aVar2.f1718a.a(chipGroup, chipGroup2.getCheckedChipId());
        }
    }

    public final boolean e(i<T> iVar, boolean z) {
        int id = iVar.getId();
        if (!this.f1528b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.f1528b.size() == 1 && this.f1528b.contains(Integer.valueOf(id))) {
            iVar.setChecked(true);
            return false;
        }
        boolean remove = this.f1528b.remove(Integer.valueOf(id));
        if (iVar.isChecked()) {
            iVar.setChecked(false);
        }
        return remove;
    }
}
