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
        cin(view);
        try { // GetInstance创建类 并且获得一个由随机数生成的FirstKey
            boolean checkFirstKey = c.getInstance().checkFirstKey(); // GetInstance创建类 并且获得一个由随机数生成的FirstKey
            this.r = checkFirstKey; // r标记key的有无
            v(checkFirstKey, (ImageButton) view);
            cout("First key found. Did you see it?", false);
            w();
        } catch (IllegalArgumentException e) { // 非法参数异常
            cout(e.getMessage(), false); // getMessage获得异常信息
        }
    }

    public void onClickSecondKey(View view) {
        this.n.setVisibility(0);
        this.n.setFocusableInTouchMode(true);
        this.n.requestFocus();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).toggleSoftInput(2, 0); // 获得输入
    }

    public void onClickThirdKey(View view) {
        x();
        cin(view);
        try {
            boolean checkThirdKey = c.getInstance().checkThirdKey();
            this.t = checkThirdKey; // 创建ThirdKey
            v(checkThirdKey, (ImageButton) view);
            cout(!this.t ? "Your third key is incorrect. Did you look in the right place?" : "Third key looks plausible.", false);
            w();
        } catch (IllegalArgumentException e) {
            cout(e.getMessage(), false); // 输出错误信息
        }
    }

    public void onClickUnlock(View view) {
        String str;
        if (w()) {
            try {
                String openLock = c.getInstance().openLock();
                if (!openLock.equals("")) {
                    cout(openLock, true);
                } else {
                    cout("Your keys don't fit. Secret cannot be unlocked.", false);
                }
                return;
            } catch (Exception unused) {
                str = "Something is wrong with your keys.";
            }
        } else {
            str = "You're missing a key.";
        }
        cout(str, false);
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
                        keyRack.cout(str, false);
                        keyRack.w();
                    } catch (IllegalArgumentException e) {
                        keyRack.cout(e.getMessage(), false);
                    }
                    keyRack.cin(textView);
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
        imageButton.setImageResource(z ? R.drawable.px_key_active : R.drawable.px_key_inactive); // 标记key的有无？？
    }

    public final boolean w() {
        if (this.r && this.s && this.t) { // r s t 分别代表第一第二第三把钥匙
            x();
            this.q.setVisibility(0);
            return true;
        }
        this.q.setVisibility(8);
        return false;
    }

    public final void x() {
        this.n.clearFocus(); // ???清空焦点
        this.n.setVisibility(8); // 不可见
    }

    /* renamed from: y */
    public final void cin(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0); // 读入操作
    }

    /* renamed from: z */
    public final void cout(String str, boolean z) {
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
