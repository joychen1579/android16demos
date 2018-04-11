package com.joychen.baseuiweiget;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText userEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.username_txt);
        textView.setTextColor(getResources().getColor(R.color.blue));
        textView.setTextSize(18);

        userEdt = findViewById(R.id.username_edt);

        Button regBtn = findViewById(R.id.regiest_btn);
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = textView.getText().toString();
                userEdt.setText(username);
                // Toast.makeText(MainActivity.this,"注册成功",Toast.LENGTH_LONG).show();
            }
        });




    }
}
