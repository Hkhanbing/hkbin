package b.b.a.a.f;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes.dex */
public class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1412a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f1413b;

    /* loaded from: classes.dex */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public void b(FloatingActionButton floatingActionButton) {
            BottomAppBar.x(b.this.f1413b);
        }
    }

    public b(BottomAppBar bottomAppBar, int i) {
        this.f1413b = bottomAppBar;
        this.f1412a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public void a(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.f1413b;
        int i = this.f1412a;
        int i2 = BottomAppBar.c0;
        floatingActionButton.setTranslationX(bottomAppBar.C(i));
        floatingActionButton.m(new a(), true);
    }
}
