package com.example.babyre;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity {
    private EditText editText;

    public native int enc(char[] cArr);

    static {
        System.loadLibrary("babyre");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.editText = (EditText) findViewById(R.id.edit_text);
        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() { // from class: com.example.babyre.MainActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String obj = MainActivity.this.editText.getText().toString();
                if (obj.isEmpty()) {
                    Toast.makeText(MainActivity.this, MainActivity.this.getResources().getString(R.string.s4), 0).show();
                } else if (obj.length() != 21) {
                    Toast.makeText(MainActivity.this, MainActivity.this.getResources().getString(R.string.s5), 0).show();
                }
                int enc = MainActivity.this.enc(obj.toCharArray()); // key
                if (enc == 0) {
                    Toast.makeText(MainActivity.this, MainActivity.this.getResources().getString(R.string.s2), 0).show();
                } else if (enc != 1) {
                } else {
                    Toast.makeText(MainActivity.this, MainActivity.this.getResources().getString(R.string.s3), 0).show();
                }
            }
        });
    }
}