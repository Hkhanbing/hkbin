package a.f.a;

import a.f.a.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: b  reason: collision with root package name */
    public final b f363b;

    /* renamed from: c  reason: collision with root package name */
    public final c f364c;

    /* renamed from: a  reason: collision with root package name */
    public int f362a = 0;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public a(b bVar, c cVar) {
        this.f363b = bVar;
        this.f364c = cVar;
    }

    @Override // a.f.a.b.a
    public float a(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f362a; i3++) {
            if (i3 == i) {
                return this.g[i2];
            }
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    @Override // a.f.a.b.a
    public final float b(g gVar) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f362a; i2++) {
            if (this.e[i] == gVar.f379b) {
                return this.g[i];
            }
            i = this.f[i];
        }
        return 0.0f;
    }

    @Override // a.f.a.b.a
    public final float c(g gVar, boolean z) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f362a) {
            if (this.e[i] == gVar.f379b) {
                if (i == this.h) {
                    this.h = this.f[i];
                } else {
                    int[] iArr = this.f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    gVar.b(this.f363b);
                }
                gVar.l--;
                this.f362a--;
                this.e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.g[i];
            }
            i2++;
            i3 = i;
            i = this.f[i];
        }
        return 0.0f;
    }

    @Override // a.f.a.b.a
    public final void clear() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f362a; i2++) {
            g gVar = this.f364c.d[this.e[i]];
            if (gVar != null) {
                gVar.b(this.f363b);
            }
            i = this.f[i];
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.f362a = 0;
    }

    @Override // a.f.a.b.a
    public g d(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f362a; i3++) {
            if (i3 == i) {
                return this.f364c.d[this.e[i2]];
            }
            i2 = this.f[i2];
        }
        return null;
    }

    @Override // a.f.a.b.a
    public void e(g gVar, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.h;
            if (i == -1) {
                this.h = 0;
                this.g[0] = f;
                this.e[0] = gVar.f379b;
                this.f[0] = -1;
                gVar.l++;
                gVar.a(this.f363b);
                this.f362a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.e;
                if (i2 < iArr.length) {
                    return;
                }
                this.j = true;
                this.i = iArr.length - 1;
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f362a; i4++) {
                int[] iArr2 = this.e;
                int i5 = iArr2[i];
                int i6 = gVar.f379b;
                if (i5 == i6) {
                    float[] fArr = this.g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 != 0.0f) {
                        return;
                    }
                    if (i == this.h) {
                        this.h = this.f[i];
                    } else {
                        int[] iArr3 = this.f;
                        iArr3[i3] = iArr3[i];
                    }
                    if (z) {
                        gVar.b(this.f363b);
                    }
                    if (this.j) {
                        this.i = i;
                    }
                    gVar.l--;
                    this.f362a--;
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.j) {
                int[] iArr4 = this.e;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.e;
            if (i7 >= iArr5.length && this.f362a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.e;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.e;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.j = false;
                this.i = i7 - 1;
                this.g = Arrays.copyOf(this.g, i10);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.e[i7] = gVar.f379b;
            this.g[i7] = f;
            int[] iArr8 = this.f;
            if (i3 != -1) {
                iArr8[i7] = iArr8[i3];
                iArr8[i3] = i7;
            } else {
                iArr8[i7] = this.h;
                this.h = i7;
            }
            gVar.l++;
            gVar.a(this.f363b);
            this.f362a++;
            if (!this.j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr9 = this.e;
            if (i11 < iArr9.length) {
                return;
            }
            this.j = true;
            this.i = iArr9.length - 1;
        }
    }

    @Override // a.f.a.b.a
    public boolean f(g gVar) {
        int i = this.h;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f362a; i2++) {
            if (this.e[i] == gVar.f379b) {
                return true;
            }
            i = this.f[i];
        }
        return false;
    }

    @Override // a.f.a.b.a
    public void g(float f) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f362a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] / f;
            i = this.f[i];
        }
    }

    @Override // a.f.a.b.a
    public float h(b bVar, boolean z) {
        float b2 = b(bVar.f365a);
        c(bVar.f365a, z);
        b.a aVar = bVar.d;
        int k = aVar.k();
        for (int i = 0; i < k; i++) {
            g d = aVar.d(i);
            e(d, aVar.b(d) * b2, z);
        }
        return b2;
    }

    @Override // a.f.a.b.a
    public void i() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f362a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f[i];
        }
    }

    @Override // a.f.a.b.a
    public final void j(g gVar, float f) {
        if (f == 0.0f) {
            c(gVar, true);
            return;
        }
        int i = this.h;
        if (i == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = gVar.f379b;
            this.f[0] = -1;
            gVar.l++;
            gVar.a(this.f363b);
            this.f362a++;
            if (this.j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.e;
            if (i2 < iArr.length) {
                return;
            }
            this.j = true;
            this.i = iArr.length - 1;
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f362a; i4++) {
            int[] iArr2 = this.e;
            int i5 = iArr2[i];
            int i6 = gVar.f379b;
            if (i5 == i6) {
                this.g[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.j) {
            int[] iArr3 = this.e;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.e;
        if (i7 >= iArr4.length && this.f362a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.e;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.e;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.j = false;
            this.i = i7 - 1;
            this.g = Arrays.copyOf(this.g, i10);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[i7] = gVar.f379b;
        this.g[i7] = f;
        int[] iArr7 = this.f;
        if (i3 != -1) {
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            iArr7[i7] = this.h;
            this.h = i7;
        }
        gVar.l++;
        gVar.a(this.f363b);
        int i11 = this.f362a + 1;
        this.f362a = i11;
        if (!this.j) {
            this.i++;
        }
        int[] iArr8 = this.e;
        if (i11 >= iArr8.length) {
            this.j = true;
        }
        if (this.i < iArr8.length) {
            return;
        }
        this.j = true;
        this.i = iArr8.length - 1;
    }

    @Override // a.f.a.b.a
    public int k() {
        return this.f362a;
    }

    public String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f362a; i2++) {
            StringBuilder f = b.a.a.a.a.f(b.a.a.a.a.d(str, " -> "));
            f.append(this.g[i]);
            f.append(" : ");
            StringBuilder f2 = b.a.a.a.a.f(f.toString());
            f2.append(this.f364c.d[this.e[i]]);
            str = f2.toString();
            i = this.f[i];
        }
        return str;
    }
}
