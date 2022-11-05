package a.l.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class o implements a.a.d.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f881a;

    public o(p pVar) {
        this.f881a = pVar;
    }

    @Override // a.a.d.b
    public void a(Context context) {
        y<?> yVar = this.f881a.h.f925a;
        yVar.d.b(yVar, yVar, null);
        Bundle a2 = this.f881a.d.f1072b.a("android:support:fragments");
        if (a2 != null) {
            Parcelable parcelable = a2.getParcelable("android:support:fragments");
            y<?> yVar2 = this.f881a.h.f925a;
            if (!(yVar2 instanceof a.n.z)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            yVar2.d.Y(parcelable);
        }
    }
}
