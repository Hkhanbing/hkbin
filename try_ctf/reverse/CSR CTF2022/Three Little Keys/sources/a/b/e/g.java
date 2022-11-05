package a.b.e;

import a.h.j.x;
import a.h.j.y;
import a.h.j.z;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f96c;
    public y d;
    public boolean e;

    /* renamed from: b  reason: collision with root package name */
    public long f95b = -1;
    public final z f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<x> f94a = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a extends z {

        /* renamed from: a  reason: collision with root package name */
        public boolean f97a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f98b = 0;

        public a() {
        }

        @Override // a.h.j.y
        public void a(View view) {
            int i = this.f98b + 1;
            this.f98b = i;
            if (i == g.this.f94a.size()) {
                y yVar = g.this.d;
                if (yVar != null) {
                    yVar.a(null);
                }
                this.f98b = 0;
                this.f97a = false;
                g.this.e = false;
            }
        }

        @Override // a.h.j.z, a.h.j.y
        public void b(View view) {
            if (this.f97a) {
                return;
            }
            this.f97a = true;
            y yVar = g.this.d;
            if (yVar == null) {
                return;
            }
            yVar.b(null);
        }
    }

    public void a() {
        if (!this.e) {
            return;
        }
        Iterator<x> it = this.f94a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.e = false;
    }

    public void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator<x> it = this.f94a.iterator();
        while (it.hasNext()) {
            x next = it.next();
            long j = this.f95b;
            if (j >= 0) {
                next.c(j);
            }
            Interpolator interpolator = this.f96c;
            if (interpolator != null && (view = next.f678a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                next.d(this.f);
            }
            View view2 = next.f678a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
