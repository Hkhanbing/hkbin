package com.example.babyre.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.babyre.R;

/* loaded from: classes.dex */
public final class ActivityMainBinding implements ViewBinding {
    public final Button button;
    public final EditText editText;
    private final LinearLayout rootView;

    private ActivityMainBinding(LinearLayout linearLayout, Button button, EditText editText) {
        this.rootView = linearLayout;
        this.button = button;
        this.editText = editText;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: getRoot  reason: collision with other method in class */
    public LinearLayout mo141getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMainBinding bind(View view) {
        int i = R.id.button;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.button);
        if (button != null) {
            i = R.id.edit_text;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.edit_text);
            if (editText != null) {
                return new ActivityMainBinding((LinearLayout) view, button, editText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}