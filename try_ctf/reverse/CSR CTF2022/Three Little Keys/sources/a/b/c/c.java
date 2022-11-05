package a.b.c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class c implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AlertController f19a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f20b;

    public c(AlertController.b bVar, AlertController alertController) {
        this.f20b = bVar;
        this.f19a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f20b.h.onClick(this.f19a.f1156b, i);
        if (!this.f20b.i) {
            this.f19a.f1156b.dismiss();
        }
    }
}
