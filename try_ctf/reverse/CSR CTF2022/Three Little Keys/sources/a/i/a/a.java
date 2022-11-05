package a.i.a;

import a.i.a.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f694a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f695b;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f696c;
    public Context d;
    public int e;
    public C0019a f;
    public DataSetObserver g;
    public a.i.a.b h;

    /* renamed from: a.i.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0019a extends ContentObserver {
        public C0019a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (!aVar.f695b || (cursor = aVar.f696c) == null || cursor.isClosed()) {
                return;
            }
            aVar.f694a = aVar.f696c.requery();
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f694a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f694a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        b bVar;
        boolean z2 = true;
        boolean z3 = z ? true : true;
        if (z3 && true) {
            z3 |= true;
            this.f695b = true;
        } else {
            this.f695b = false;
        }
        z2 = cursor == null ? false : z2;
        this.f696c = cursor;
        this.f694a = z2;
        this.d = context;
        this.e = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if (z3 & true) {
            this.f = new C0019a();
            bVar = new b();
        } else {
            bVar = null;
            this.f = null;
        }
        this.g = bVar;
        if (z2) {
            C0019a c0019a = this.f;
            if (c0019a != null) {
                cursor.registerContentObserver(c0019a);
            }
            DataSetObserver dataSetObserver = this.g;
            if (dataSetObserver == null) {
                return;
            }
            cursor.registerDataSetObserver(dataSetObserver);
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f696c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0019a c0019a = this.f;
                if (c0019a != null) {
                    cursor2.unregisterContentObserver(c0019a);
                }
                DataSetObserver dataSetObserver = this.g;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f696c = cursor;
            if (cursor != null) {
                C0019a c0019a2 = this.f;
                if (c0019a2 != null) {
                    cursor.registerContentObserver(c0019a2);
                }
                DataSetObserver dataSetObserver2 = this.g;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.e = cursor.getColumnIndexOrThrow("_id");
                this.f694a = true;
                notifyDataSetChanged();
            } else {
                this.e = -1;
                this.f694a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f694a || (cursor = this.f696c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f694a) {
            this.f696c.moveToPosition(i);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.k.inflate(cVar.j, viewGroup, false);
            }
            a(view, this.d, this.f696c);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.h == null) {
            this.h = new a.i.a.b(this);
        }
        return this.h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f694a || (cursor = this.f696c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f696c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f694a || (cursor = this.f696c) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.f696c.getLong(this.e);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f694a) {
            if (this.f696c.moveToPosition(i)) {
                if (view == null) {
                    view = d(this.d, this.f696c, viewGroup);
                }
                a(view, this.d, this.f696c);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
