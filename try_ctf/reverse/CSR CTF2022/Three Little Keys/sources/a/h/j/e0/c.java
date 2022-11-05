package a.h.j.e0;

import a.h.j.e;
import a.h.j.e0.e;
import a.h.j.w;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f654a;

    public c(View view) {
        this.f654a = view;
    }

    public boolean a(e eVar, int i, Bundle bundle) {
        if ((i & 1) != 0) {
            try {
                ((e.a) eVar.f655a).b();
                InputContentInfo inputContentInfo = (InputContentInfo) ((e.a) eVar.f655a).a();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipData clipData = new ClipData(((e.a) eVar.f655a).f656a.getDescription(), new ClipData.Item(((e.a) eVar.f655a).f656a.getContentUri()));
        e.b aVar = Build.VERSION.SDK_INT >= 31 ? new e.a(clipData, 2) : new e.c(clipData, 2);
        aVar.b(((e.a) eVar.f655a).f656a.getLinkUri());
        aVar.a(bundle);
        return w.l(this.f654a, aVar.c()) == null;
    }
}
