package a.b.e;

import a.b.e.i.i;
import a.b.e.i.j;
import a.b.f.d1;
import a.b.f.k0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class f extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f85a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f86b;

    /* renamed from: c  reason: collision with root package name */
    public Context f87c;
    public Object d;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f88c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f89a;

        /* renamed from: b  reason: collision with root package name */
        public Method f90b;

        public a(Object obj, String str) {
            this.f89a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f90b = cls.getMethod(str, f88c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f90b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f90b.invoke(this.f89a, menuItem)).booleanValue();
                }
                this.f90b.invoke(this.f89a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public a.h.j.d A;
        public CharSequence B;
        public CharSequence C;

        /* renamed from: a  reason: collision with root package name */
        public Menu f91a;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: b  reason: collision with root package name */
        public int f92b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f93c = 0;
        public int d = 0;
        public int e = 0;
        public boolean f = true;
        public boolean g = true;

        public b(Menu menu) {
            this.f91a = menu;
        }

        public SubMenu a() {
            this.h = true;
            SubMenu addSubMenu = this.f91a.addSubMenu(this.f92b, this.i, this.j, this.k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f87c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (f.this.f87c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                f fVar = f.this;
                if (fVar.d == null) {
                    fVar.d = fVar.a(fVar.f87c);
                }
                menuItem.setOnMenuItemClickListener(new a(fVar.d, this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof i) {
                    i iVar = (i) menuItem;
                    iVar.x = (iVar.x & (-5)) | 4;
                } else if (menuItem instanceof j) {
                    j jVar = (j) menuItem;
                    try {
                        if (jVar.e == null) {
                            jVar.e = jVar.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        jVar.e.invoke(jVar.d, Boolean.TRUE);
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) b(str, f.e, f.this.f85a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            a.h.j.d dVar = this.A;
            if (dVar != null) {
                if (menuItem instanceof a.h.e.a.b) {
                    ((a.h.e.a.b) menuItem).b(dVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.B;
            boolean z2 = menuItem instanceof a.h.e.a.b;
            if (z2) {
                ((a.h.e.a.b) menuItem).mo2setContentDescription(charSequence);
            } else {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z2) {
                ((a.h.e.a.b) menuItem).mo3setTooltipText(charSequence2);
            } else {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.n;
            int i3 = this.o;
            if (z2) {
                ((a.h.e.a.b) menuItem).setAlphabeticShortcut(c2, i3);
            } else {
                menuItem.setAlphabeticShortcut(c2, i3);
            }
            char c3 = this.p;
            int i4 = this.q;
            if (z2) {
                ((a.h.e.a.b) menuItem).setNumericShortcut(c3, i4);
            } else {
                menuItem.setNumericShortcut(c3, i4);
            }
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                if (z2) {
                    ((a.h.e.a.b) menuItem).setIconTintMode(mode);
                } else {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                if (z2) {
                    ((a.h.e.a.b) menuItem).setIconTintList(colorStateList);
                } else {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f87c = context;
        Object[] objArr = {context};
        this.f85a = objArr;
        this.f86b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        a.h.j.d dVar;
        ColorStateList colorStateList;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(b.a.a.a.a.d("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.f92b = 0;
                        bVar.f93c = 0;
                        bVar.d = 0;
                        bVar.e = 0;
                        bVar.f = true;
                        bVar.g = true;
                    } else if (name2.equals("item")) {
                        if (!bVar.h) {
                            a.h.j.d dVar2 = bVar.A;
                            if (dVar2 == null || !dVar2.a()) {
                                bVar.h = true;
                                bVar.c(bVar.f91a.add(bVar.f92b, bVar.i, bVar.j, bVar.k));
                            } else {
                                bVar.a();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray obtainStyledAttributes = f.this.f87c.obtainStyledAttributes(attributeSet, a.b.b.p);
                    bVar.f92b = obtainStyledAttributes.getResourceId(1, 0);
                    bVar.f93c = obtainStyledAttributes.getInt(3, 0);
                    bVar.d = obtainStyledAttributes.getInt(4, 0);
                    bVar.e = obtainStyledAttributes.getInt(5, 0);
                    bVar.f = obtainStyledAttributes.getBoolean(2, true);
                    bVar.g = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    d1 p = d1.p(f.this.f87c, attributeSet, a.b.b.q);
                    bVar.i = p.l(2, 0);
                    bVar.j = (p.j(5, bVar.f93c) & (-65536)) | (p.j(6, bVar.d) & 65535);
                    bVar.k = p.n(7);
                    bVar.l = p.n(8);
                    bVar.m = p.l(0, 0);
                    String m = p.m(9);
                    bVar.n = m == null ? (char) 0 : m.charAt(0);
                    bVar.o = p.j(16, 4096);
                    String m2 = p.m(10);
                    bVar.p = m2 == null ? (char) 0 : m2.charAt(0);
                    bVar.q = p.j(20, 4096);
                    bVar.r = p.o(11) ? p.a(11, false) : bVar.e;
                    bVar.s = p.a(3, false);
                    bVar.t = p.a(4, bVar.f);
                    bVar.u = p.a(1, bVar.g);
                    bVar.v = p.j(21, -1);
                    bVar.z = p.m(12);
                    bVar.w = p.l(13, 0);
                    bVar.x = p.m(15);
                    String m3 = p.m(14);
                    bVar.y = m3;
                    boolean z3 = m3 != null;
                    if (z3 && bVar.w == 0 && bVar.x == null) {
                        dVar = (a.h.j.d) bVar.b(m3, f, f.this.f86b);
                    } else {
                        if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        dVar = null;
                    }
                    bVar.A = dVar;
                    bVar.B = p.n(17);
                    bVar.C = p.n(22);
                    if (p.o(19)) {
                        bVar.E = k0.d(p.j(19, -1), bVar.E);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        bVar.E = null;
                    }
                    if (p.o(18)) {
                        colorStateList = p.c(18);
                    }
                    bVar.D = colorStateList;
                    p.f193b.recycle();
                    bVar.h = false;
                } else if (name3.equals("menu")) {
                    b(xmlPullParser, attributeSet, bVar.a());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof a.h.e.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f87c.getResources().getLayout(i);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
