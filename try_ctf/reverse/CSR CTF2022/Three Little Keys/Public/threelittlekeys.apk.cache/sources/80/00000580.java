package de.cybersecurityrumble.threelittlekeys;

import a.b.c.g;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import c.a.a.c;
import de.cybersecurityrumble.threelittlekeys.KeyRack;
import de.cybersecurityrumble.threelittlekeys.R;
import java.util.Objects;

/* loaded from: classes.dex */
public class KeyRack extends g {
    public EditText n;
    public ImageView o;
    public TextView p;
    public Button q;
    public boolean r;
    public boolean s;
    public boolean t = false;

    public void onClickFirstKey(View view) {
        x();
        y(view);
        try {
            boolean checkFirstKey = c.getInstance().checkFirstKey();
            this.r = checkFirstKey;
            v(checkFirstKey, (ImageButton) view);
            z("First key found. Did you see it?", false);
            w();
        } catch (IllegalArgumentException e) {
            z(e.getMessage(), false);
        }
    }

    public void onClickSecondKey(View view) {
        this.n.setVisibility(0);
        this.n.setFocusableInTouchMode(true);
        this.n.requestFocus();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).toggleSoftInput(2, 0);
    }

    public void onClickThirdKey(View view) {
        x();
        y(view);
        try {
            boolean checkThirdKey = c.getInstance().checkThirdKey();
            this.t = checkThirdKey;
            v(checkThirdKey, (ImageButton) view);
            z(!this.t ? "Your third key is incorrect. Did you look in the right place?" : "Third key looks plausible.", false);
            w();
        } catch (IllegalArgumentException e) {
            z(e.getMessage(), false);
        }
    }

    public void onClickUnlock(View view) {
        String str;
        if (w()) {
            try {
                String openLock = c.getInstance().openLock();
                if (!openLock.equals("")) {
                    z(openLock, true);
                } else {
                    z("Your keys don't fit. Secret cannot be unlocked.", false);
                }
                return;
            } catch (Exception unused) {
                str = "Something is wrong with your keys.";
            }
        } else {
            str = "You're missing a key.";
        }
        z(str, false);
    }

    @Override // a.l.b.p, androidx.activity.ComponentActivity, a.h.b.c, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_key_rack);
        c.getInstance(getApplicationContext());
        EditText editText = (EditText) findViewById(R.id.input_second_key);
        this.n = editText;
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: c.a.a.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                String str;
                KeyRack keyRack = KeyRack.this;
                Objects.requireNonNull(keyRack);
                if (i == 6 || i == 0) {
                    try {
                        keyRack.s = c.getInstance().checkSecondKey(textView.getText().toString());
                        keyRack.v(keyRack.s, (ImageButton) keyRack.findViewById(R.id.second_key));
                        if (keyRack.s) {
                            keyRack.x();
                            str = "Second key found. Good job!";
                        } else {
                            str = "Your second key is incorrect.";
                        }
                        keyRack.z(str, false);
                        keyRack.w();
                    } catch (IllegalArgumentException e) {
                        keyRack.z(e.getMessage(), false);
                    }
                    keyRack.y(textView);
                    return true;
                }
                return false;
            }
        });
        this.o = (ImageView) findViewById(R.id.scroll_background);
        this.p = (TextView) findViewById(R.id.scroll_message);
        this.q = (Button) findViewById(R.id.unlock_button);
        x();
        this.q.setVisibility(8);
        this.o.setVisibility(4);
        this.p.setVisibility(4);
    }

    public final void v(boolean z, ImageButton imageButton) {
        imageButton.setImageResource(z ? R.drawable.px_key_active : R.drawable.px_key_inactive);
    }

    public final boolean w() {
        if (this.r && this.s && this.t) {
            x();
            this.q.setVisibility(0);
            return true;
        }
        this.q.setVisibility(8);
        return false;
    }

    public final void x() {
        this.n.clearFocus();
        this.n.setVisibility(8);
    }

    public final void y(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public final void z(String str, boolean z) {
        this.p.setText(str);
        this.o.setVisibility(0);
        this.p.setVisibility(0);
        if (!z) {
            this.o.postDelayed(new Runnable() { // from class: c.a.a.b
                @Override // java.lang.Runnable
                public final void run() {
                    KeyRack keyRack = KeyRack.this;
                    keyRack.o.setVisibility(4);
                    keyRack.p.setVisibility(4);
                    keyRack.p.setText("");
                }
            }, 3000L);
        }
    }
}