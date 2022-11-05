package a.k.b;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f774a;

    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f775a;

        /* renamed from: b  reason: collision with root package name */
        public final d f776b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f777c = true;

        public a(TextView textView) {
            this.f775a = textView;
            this.f776b = new d(textView);
        }

        @Override // a.k.b.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f777c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    if (inputFilterArr[i] instanceof d) {
                        sparseArray.put(i, inputFilterArr[i]);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f776b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
            inputFilterArr3[length2] = this.f776b;
            return inputFilterArr3;
        }

        @Override // a.k.b.f.b
        public void b(boolean z) {
            if (z) {
                d();
            }
        }

        @Override // a.k.b.f.b
        public void c(boolean z) {
            this.f777c = z;
            d();
            this.f775a.setFilters(a(this.f775a.getFilters()));
        }

        public void d() {
            TransformationMethod transformationMethod = this.f775a.getTransformationMethod();
            if (this.f777c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new h(transformationMethod);
                }
            } else if (transformationMethod instanceof h) {
                transformationMethod = ((h) transformationMethod).f783a;
            }
            this.f775a.setTransformationMethod(transformationMethod);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public void b(boolean z) {
            throw null;
        }

        public void c(boolean z) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f778a;

        public c(TextView textView) {
            this.f778a = new a(textView);
        }

        @Override // a.k.b.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return d() ? inputFilterArr : this.f778a.a(inputFilterArr);
        }

        @Override // a.k.b.f.b
        public void b(boolean z) {
            if (d()) {
                return;
            }
            a aVar = this.f778a;
            Objects.requireNonNull(aVar);
            if (!z) {
                return;
            }
            aVar.d();
        }

        @Override // a.k.b.f.b
        public void c(boolean z) {
            if (d()) {
                this.f778a.f777c = z;
                return;
            }
            a aVar = this.f778a;
            aVar.f777c = z;
            aVar.d();
            aVar.f775a.setFilters(aVar.a(aVar.f775a.getFilters()));
        }

        public final boolean d() {
            return !a.k.a.h.c();
        }
    }

    public f(TextView textView, boolean z) {
        a.h.b.b.g(textView, "textView cannot be null");
        this.f774a = !z ? new c(textView) : new a(textView);
    }
}
