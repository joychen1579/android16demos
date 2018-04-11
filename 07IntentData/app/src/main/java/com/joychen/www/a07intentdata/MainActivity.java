package com.joychen.www.a07intentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText userNameEdt;
    private EditText passwordEdt;
    private Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //从布局文件中查找对应的控件对象
        userNameEdt = findViewById(R.id.username_edt);
        passwordEdt = findViewById(R.id.password_edt);
        loginBtn = findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }


    private void login(){
        Intent intent =new Intent(this,SecondAcitivty.class);
        intent.putExtra("username",userNameEdt.getText().toString());
        intent.putExtra("password",passwordEdt.getText().toString());
        startActivity(intent);

    }
}
