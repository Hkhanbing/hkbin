package b.b.a.a.b0;

import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class d implements MaterialButtonToggleGroup.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f1367a;

    public d(TimePickerView timePickerView) {
        this.f1367a = timePickerView;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
    public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        TimePickerView timePickerView = this.f1367a;
        int i2 = TimePickerView.y;
        Objects.requireNonNull(timePickerView);
    }
}
