package a.h.j;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f659a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f660b;

    /* renamed from: c  reason: collision with root package name */
    public final View f661c;
    public boolean d;
    public int[] e;

    public k(View view) {
        this.f661c = view;
    }

    public boolean a(float f, float f2, boolean z) {
        ViewParent g;
        if (!this.d || (g = g(0)) == null) {
            return false;
        }
        try {
            return g.onNestedFling(this.f661c, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + g + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public boolean b(float f, float f2) {
        ViewParent g;
        if (!this.d || (g = g(0)) == null) {
            return false;
        }
        try {
            return g.onNestedPreFling(this.f661c, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + g + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public boolean c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent g;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.d || (g = g(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f661c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.f661c;
        if (g instanceof l) {
            ((l) g).n(view, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                g.onNestedPreScroll(view, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + g + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            this.f661c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        f(i, i2, i3, i4, null, i5, iArr2);
    }

    public boolean e(int i, int i2, int i3, int i4, int[] iArr) {
        return f(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent g;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (g = g(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f661c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f661c;
        if (g instanceof m) {
            ((m) g).k(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (g instanceof l) {
                ((l) g).l(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    g.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + g + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            this.f661c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent g(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.f660b;
            }
            return null;
        }
        return this.f659a;
    }

    public boolean h(int i) {
        return g(i) != null;
    }

    public boolean i(int i, int i2) {
        boolean onStartNestedScroll;
        if (g(i2) != null) {
            return true;
        }
        if (this.d) {
            View view = this.f661c;
            for (ViewParent parent = this.f661c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f661c;
                boolean z = parent instanceof l;
                if (z) {
                    onStartNestedScroll = ((l) parent).o(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view, view2, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i2 == 0) {
                        this.f659a = parent;
                    } else if (i2 == 1) {
                        this.f660b = parent;
                    }
                    View view3 = this.f661c;
                    if (z) {
                        ((l) parent).i(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = parent;
                }
            }
        }
        return false;
    }

    public void j(int i) {
        ViewParent g = g(i);
        if (g != null) {
            View view = this.f661c;
            if (g instanceof l) {
                ((l) g).m(view, i);
            } else if (i == 0) {
                try {
                    g.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + g + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f659a = null;
            } else if (i != 1) {
            } else {
                this.f660b = null;
            }
        }
    }
}
