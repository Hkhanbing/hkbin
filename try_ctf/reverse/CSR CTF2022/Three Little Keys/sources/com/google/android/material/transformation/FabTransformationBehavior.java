package com.google.android.material.transformation;

import a.h.j.w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.b.a.a.c.d;
import b.b.a.a.c.g;
import b.b.a.a.c.h;
import b.b.a.a.c.i;
import b.b.a.a.c0.e;
import b.b.a.a.l.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1766c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f1767a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1768b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f1769c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f1767a = z;
            this.f1768b = view;
            this.f1769c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f1767a) {
                this.f1768b.setVisibility(4);
                this.f1769c.setAlpha(1.0f);
                this.f1769c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f1767a) {
                this.f1768b.setVisibility(0);
                this.f1769c.setAlpha(0.0f);
                this.f1769c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f1770a;

        /* renamed from: b  reason: collision with root package name */
        public i f1771b;
    }

    public FabTransformationBehavior() {
        this.f1766c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1766c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet D(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList;
        b bVar;
        c cVar;
        Animator animator;
        ArrayList arrayList2;
        ObjectAnimator ofInt;
        b N = N(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        L(view, view2, z, z2, N, arrayList3);
        RectF rectF = this.d;
        M(view, view2, z, z2, N, arrayList3, rectF);
        float width = rectF.width();
        float height = rectF.height();
        float F = F(view, view2, N.f1771b);
        float G = G(view, view2, N.f1771b);
        Pair<h, h> E = E(F, G, z, N);
        h hVar = (h) E.first;
        h hVar2 = (h) E.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            F = this.g;
        }
        fArr[0] = F;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            G = this.h;
        }
        fArr2[0] = G;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        hVar.a(ofFloat);
        hVar2.a(ofFloat2);
        arrayList3.add(ofFloat);
        arrayList3.add(ofFloat2);
        boolean z3 = view2 instanceof c;
        if (z3 && (view instanceof ImageView)) {
            c cVar2 = (c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    ofInt = ObjectAnimator.ofInt(drawable, d.f1375b, 0);
                } else {
                    ofInt = ObjectAnimator.ofInt(drawable, d.f1375b, 255);
                }
                ofInt.addUpdateListener(new b.b.a.a.c0.a(this, view2));
                N.f1770a.d("iconFade").a(ofInt);
                arrayList3.add(ofInt);
                arrayList4.add(new b.b.a.a.c0.b(this, cVar2, drawable));
            }
        }
        if (!z3) {
            bVar = N;
            arrayList2 = arrayList4;
        } else {
            c cVar3 = (c) view2;
            i iVar = N.f1771b;
            RectF rectF2 = this.d;
            RectF rectF3 = this.e;
            I(view, rectF2);
            rectF2.offset(this.g, this.h);
            I(view2, rectF3);
            rectF3.offset(-F(view, view2, iVar), 0.0f);
            float centerX = rectF2.centerX() - rectF3.left;
            i iVar2 = N.f1771b;
            RectF rectF4 = this.d;
            RectF rectF5 = this.e;
            I(view, rectF4);
            rectF4.offset(this.g, this.h);
            I(view2, rectF5);
            rectF5.offset(0.0f, -G(view, view2, iVar2));
            float centerY = rectF4.centerY() - rectF5.top;
            ((FloatingActionButton) view).g(this.f1766c);
            float width2 = this.f1766c.width() / 2.0f;
            h d = N.f1770a.d("expansion");
            if (z) {
                if (!z2) {
                    cVar3.setRevealInfo(new c.e(centerX, centerY, width2));
                }
                if (z2) {
                    width2 = cVar3.getRevealInfo().f1444c;
                }
                float d2 = b.b.a.a.a.d(centerX, centerY, 0.0f, 0.0f);
                float d3 = b.b.a.a.a.d(centerX, centerY, width, 0.0f);
                float d4 = b.b.a.a.a.d(centerX, centerY, width, height);
                float d5 = b.b.a.a.a.d(centerX, centerY, 0.0f, height);
                if (d2 <= d3 || d2 <= d4 || d2 <= d5) {
                    d2 = (d3 <= d4 || d3 <= d5) ? d4 > d5 ? d4 : d5 : d3;
                }
                animator = b.b.a.a.a.b(cVar3, centerX, centerY, d2);
                animator.addListener(new b.b.a.a.c0.c(this, cVar3));
                long j = d.f1383a;
                int i = (int) centerX;
                int i2 = (int) centerY;
                if (j > 0) {
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i, i2, width2, width2);
                    createCircularReveal.setStartDelay(0L);
                    createCircularReveal.setDuration(j);
                    arrayList3.add(createCircularReveal);
                }
                cVar = cVar3;
                arrayList = arrayList4;
                bVar = N;
            } else {
                float f = cVar3.getRevealInfo().f1444c;
                Animator b2 = b.b.a.a.a.b(cVar3, centerX, centerY, width2);
                long j2 = d.f1383a;
                int i3 = (int) centerX;
                int i4 = (int) centerY;
                if (j2 > 0) {
                    Animator createCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i3, i4, f, f);
                    createCircularReveal2.setStartDelay(0L);
                    createCircularReveal2.setDuration(j2);
                    arrayList3.add(createCircularReveal2);
                }
                long j3 = d.f1383a;
                long j4 = d.f1384b;
                g gVar = N.f1770a;
                int i5 = gVar.f1381a.f358c;
                arrayList = arrayList4;
                bVar = N;
                int i6 = 0;
                long j5 = 0;
                while (i6 < i5) {
                    int i7 = i5;
                    h k = gVar.f1381a.k(i6);
                    j5 = Math.max(j5, k.f1383a + k.f1384b);
                    i6++;
                    i5 = i7;
                    cVar3 = cVar3;
                    i3 = i3;
                    gVar = gVar;
                }
                cVar = cVar3;
                int i8 = i3;
                long j6 = j3 + j4;
                if (j6 < j5) {
                    Animator createCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i8, i4, width2, width2);
                    createCircularReveal3.setStartDelay(j6);
                    createCircularReveal3.setDuration(j5 - j6);
                    arrayList3.add(createCircularReveal3);
                }
                animator = b2;
            }
            d.a(animator);
            arrayList3.add(animator);
            arrayList2 = arrayList;
            arrayList2.add(new b.b.a.a.l.a(cVar));
        }
        K(view, view2, z, z2, bVar, arrayList3);
        J(view2, z, z2, bVar, arrayList3);
        AnimatorSet animatorSet = new AnimatorSet();
        b.b.a.a.a.u(animatorSet, arrayList3);
        animatorSet.addListener(new a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i9));
        }
        return animatorSet;
    }

    public final Pair<h, h> E(float f, float f2, boolean z, b bVar) {
        h d;
        g gVar;
        String str;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            d = bVar.f1770a.d("translationXLinear");
            gVar = bVar.f1770a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            d = bVar.f1770a.d("translationXCurveDownwards");
            gVar = bVar.f1770a;
            str = "translationYCurveDownwards";
        } else {
            d = bVar.f1770a.d("translationXCurveUpwards");
            gVar = bVar.f1770a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(d, gVar.d(str));
    }

    public final float F(View view, View view2, i iVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        I(view, rectF);
        rectF.offset(this.g, this.h);
        I(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float G(View view, View view2, i iVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        I(view, rectF);
        rectF.offset(this.g, this.h);
        I(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float H(b bVar, h hVar, float f, float f2) {
        long j = hVar.f1383a;
        long j2 = hVar.f1384b;
        h d = bVar.f1770a.d("expansion");
        return b.b.a.a.c.a.a(f, f2, hVar.b().getInterpolation(((float) (((d.f1383a + d.f1384b) + 17) - j)) / ((float) j2)));
    }

    public final void I(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void J(View view, boolean z, boolean z2, b bVar, List list) {
        ViewGroup O;
        ObjectAnimator ofFloat;
        if (!(view instanceof ViewGroup)) {
            return;
        }
        boolean z3 = view instanceof c;
        View findViewById = view.findViewById(R.id.mtrl_child_content_container);
        if (findViewById != null) {
            O = O(findViewById);
        } else {
            if ((view instanceof e) || (view instanceof b.b.a.a.c0.d)) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            O = O(view);
        }
        if (O == null) {
            return;
        }
        if (z) {
            if (!z2) {
                b.b.a.a.c.c.f1374a.set(O, Float.valueOf(0.0f));
            }
            ofFloat = ObjectAnimator.ofFloat(O, b.b.a.a.c.c.f1374a, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(O, b.b.a.a.c.c.f1374a, 0.0f);
        }
        bVar.f1770a.d("contentFade").a(ofFloat);
        list.add(ofFloat);
    }

    public final void K(View view, View view2, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator ofInt;
        if (!(view2 instanceof c)) {
            return;
        }
        c cVar = (c) view2;
        AtomicInteger atomicInteger = w.f667a;
        ColorStateList g = w.i.g(view);
        int colorForState = g != null ? g.getColorForState(view.getDrawableState(), g.getDefaultColor()) : 0;
        int i = 16777215 & colorForState;
        if (z) {
            if (!z2) {
                cVar.setCircularRevealScrimColor(colorForState);
            }
            ofInt = ObjectAnimator.ofInt(cVar, c.d.f1441a, i);
        } else {
            ofInt = ObjectAnimator.ofInt(cVar, c.d.f1441a, colorForState);
        }
        ofInt.setEvaluator(b.b.a.a.c.b.f1373a);
        bVar.f1770a.d("color").a(ofInt);
        list.add(ofInt);
    }

    @TargetApi(21)
    public final void L(View view, View view2, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator ofFloat;
        AtomicInteger atomicInteger = w.f667a;
        float i = w.i.i(view2) - w.i.i(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-i);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -i);
        }
        bVar.f1770a.d("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    public final void M(View view, View view2, boolean z, boolean z2, b bVar, List list, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float F = F(view, view2, bVar.f1771b);
        float G = G(view, view2, bVar.f1771b);
        Pair<h, h> E = E(F, G, z, bVar);
        h hVar = (h) E.first;
        h hVar2 = (h) E.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-F);
                view2.setTranslationY(-G);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            float H = H(bVar, hVar, -F, 0.0f);
            float H2 = H(bVar, hVar2, -G, 0.0f);
            Rect rect = this.f1766c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.d;
            rectF2.set(rect);
            RectF rectF3 = this.e;
            I(view2, rectF3);
            rectF3.offset(H, H2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -F);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -G);
        }
        hVar.a(ofFloat);
        hVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public abstract b N(Context context, boolean z);

    public final ViewGroup O(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void f(CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }
}
