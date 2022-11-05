package a.b.f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class s0 extends q0 implements r0 {
    public static Method D;
    public r0 C;

    /* loaded from: classes.dex */
    public static class a extends l0 {
        public final int n;
        public final int o;
        public r0 p;
        public MenuItem q;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.n = 21;
                this.o = 22;
                return;
            }
            this.n = 22;
            this.o = 21;
        }

        @Override // a.b.f.l0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                a.b.e.i.f fVar = (a.b.e.i.f) adapter;
                a.b.e.i.i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.q;
                if (menuItem != iVar) {
                    a.b.e.i.g gVar = fVar.f126a;
                    if (menuItem != null) {
                        this.p.k(gVar, menuItem);
                    }
                    this.q = iVar;
                    if (iVar != null) {
                        this.p.g(gVar, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.o) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((a.b.e.i.f) adapter).f126a.c(false);
                return true;
            }
        }

        public void setHoverListener(r0 r0Var) {
            this.p = r0Var;
        }

        @Override // a.b.f.l0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return;
            }
            D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public s0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // a.b.f.r0
    public void g(a.b.e.i.g gVar, MenuItem menuItem) {
        r0 r0Var = this.C;
        if (r0Var != null) {
            r0Var.g(gVar, menuItem);
        }
    }

    @Override // a.b.f.r0
    public void k(a.b.e.i.g gVar, MenuItem menuItem) {
        r0 r0Var = this.C;
        if (r0Var != null) {
            r0Var.k(gVar, menuItem);
        }
    }

    @Override // a.b.f.q0
    public l0 q(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
