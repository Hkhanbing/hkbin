package a.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f451a;

    /* renamed from: b  reason: collision with root package name */
    public int f452b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f453c = -1;
    public SparseArray<a> d = new SparseArray<>();
    public SparseArray<d> e = new SparseArray<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f454a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f455b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f456c;
        public d d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f456c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f454a = obtainStyledAttributes.getResourceId(index, this.f454a);
                } else if (index == 1) {
                    this.f456c = obtainStyledAttributes.getResourceId(index, this.f456c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f456c);
                    context.getResources().getResourceName(this.f456c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.d = dVar;
                        dVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f456c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public int a(float f, float f2) {
            for (int i = 0; i < this.f455b.size(); i++) {
                if (this.f455b.get(i).a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public float f457a;

        /* renamed from: b  reason: collision with root package name */
        public float f458b;

        /* renamed from: c  reason: collision with root package name */
        public float f459c;
        public float d;
        public int e;
        public d f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f457a = Float.NaN;
            this.f458b = Float.NaN;
            this.f459c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f = dVar;
                        dVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(this.e, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.f458b = obtainStyledAttributes.getDimension(index, this.f458b);
                } else if (index == 3) {
                    this.f459c = obtainStyledAttributes.getDimension(index, this.f459c);
                } else if (index == 4) {
                    this.f457a = obtainStyledAttributes.getDimension(index, this.f457a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f, float f2) {
            if (Float.isNaN(this.f457a) || f >= this.f457a) {
                if (!Float.isNaN(this.f458b) && f2 < this.f458b) {
                    return false;
                }
                if (!Float.isNaN(this.f459c) && f > this.f459c) {
                    return false;
                }
                return Float.isNaN(this.d) || f2 <= this.d;
            }
            return false;
        }
    }

    public c(Context context, ConstraintLayout constraintLayout, int i) {
        this.f451a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                boolean z = true;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            z = true;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                z = true;
                                break;
                            }
                            z = true;
                            break;
                        default:
                            z = true;
                            break;
                    }
                    if (z) {
                        a aVar2 = new a(context, xml);
                        this.d.put(aVar2.f454a, aVar2);
                        aVar = aVar2;
                        continue;
                    } else if (z) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.f455b.add(bVar);
                            continue;
                        } else {
                            continue;
                        }
                    } else if (!z) {
                        continue;
                    } else {
                        a(context, xml);
                        continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0229, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.c.c.a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
