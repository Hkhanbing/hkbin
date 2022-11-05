package a.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f442a;

    /* renamed from: b  reason: collision with root package name */
    public String f443b;

    /* renamed from: c  reason: collision with root package name */
    public EnumC0010a f444c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    /* renamed from: a.f.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0010a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(a aVar, Object obj) {
        this.f442a = false;
        this.f443b = aVar.f443b;
        this.f444c = aVar.f444c;
        c(obj);
    }

    public a(String str, EnumC0010a enumC0010a, Object obj, boolean z) {
        this.f442a = false;
        this.f443b = str;
        this.f444c = enumC0010a;
        this.f442a = z;
        c(obj);
    }

    public static void a(Context context, XmlPullParser xmlPullParser, HashMap<String, a> hashMap) {
        EnumC0010a enumC0010a;
        int resourceId;
        Object string;
        float dimension;
        EnumC0010a enumC0010a2 = EnumC0010a.DIMENSION_TYPE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0010a enumC0010a3 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC0010a3 = EnumC0010a.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    enumC0010a = EnumC0010a.COLOR_TYPE;
                } else if (index == 2) {
                    enumC0010a = EnumC0010a.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == 7) {
                        dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else {
                        if (index == 5) {
                            enumC0010a = EnumC0010a.FLOAT_TYPE;
                            string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        } else {
                            if (index == 6) {
                                enumC0010a = EnumC0010a.INT_TYPE;
                                resourceId = obtainStyledAttributes.getInteger(index, -1);
                            } else if (index == 9) {
                                enumC0010a = EnumC0010a.STRING_TYPE;
                                string = obtainStyledAttributes.getString(index);
                            } else if (index == 8) {
                                enumC0010a = EnumC0010a.REFERENCE_TYPE;
                                resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                if (resourceId == -1) {
                                    resourceId = obtainStyledAttributes.getInt(index, -1);
                                }
                            }
                            string = Integer.valueOf(resourceId);
                        }
                        Object obj2 = string;
                        enumC0010a3 = enumC0010a;
                        obj = obj2;
                    }
                    obj = Float.valueOf(dimension);
                    enumC0010a3 = enumC0010a2;
                }
                resourceId = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(resourceId);
                Object obj22 = string;
                enumC0010a3 = enumC0010a;
                obj = obj22;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, enumC0010a3, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, a> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = hashMap.get(str);
            String d = !aVar.f442a ? b.a.a.a.a.d("set", str) : str;
            try {
                switch (aVar.f444c.ordinal()) {
                    case 0:
                        cls.getMethod(d, Integer.TYPE).invoke(view, Integer.valueOf(aVar.d));
                        break;
                    case 1:
                        cls.getMethod(d, Float.TYPE).invoke(view, Float.valueOf(aVar.e));
                        break;
                    case 2:
                        cls.getMethod(d, Integer.TYPE).invoke(view, Integer.valueOf(aVar.h));
                        break;
                    case 3:
                        Method method = cls.getMethod(d, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(d, CharSequence.class).invoke(view, aVar.f);
                        break;
                    case 5:
                        cls.getMethod(d, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.g));
                        break;
                    case 6:
                        cls.getMethod(d, Float.TYPE).invoke(view, Float.valueOf(aVar.e));
                        break;
                    case 7:
                        cls.getMethod(d, Integer.TYPE).invoke(view, Integer.valueOf(aVar.d));
                        break;
                }
            } catch (IllegalAccessException e) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" must have a method ");
                sb.append(d);
                Log.e("TransitionLayout", sb.toString());
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    public void c(Object obj) {
        switch (this.f444c.ordinal()) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f = (String) obj;
                return;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
