package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        ChainHead[] chainHeadArr;
        int i2;
        int i3;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            int i4 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i2 = i4;
            i3 = 2;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            ChainHead chainHead = chainHeadArr[i5];
            chainHead.define();
            if (arrayList == null || (arrayList != null && arrayList.contains(chainHead.mFirst))) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r2.mHorizontalChainStyle == 2) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (r2.mVerticalChainStyle == 2) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer r36, androidx.constraintlayout.solver.LinearSystem r37, int r38, int r39, androidx.constraintlayout.solver.widgets.ChainHead r40) {
        /*
            Method dump skipped, instructions count: 1391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.Chain.applyChainConstraints(androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer, androidx.constraintlayout.solver.LinearSystem, int, int, androidx.constraintlayout.solver.widgets.ChainHead):void");
    }
}