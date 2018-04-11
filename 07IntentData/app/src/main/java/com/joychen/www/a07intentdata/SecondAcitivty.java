package com.joychen.www.a07intentdata;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by joychen on 2018/4/11.
 */

public class SecondAcitivty extends Activity {

    private TextView userInfoTxt;

    private EditText addressEdt;
    private Button callPhoneBtn;
    private Button sendMessageBtn;
    private Button browerUrlBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");
        //    Toast.makeText(this,username+password,Toast.LENGTH_LONG).show();
        userInfoTxt = findViewById(R.id.user_info_txt);
        userInfoTxt.setText("欢迎" + username + "登录");

        initUi();
    }

    private void initUi() {
        addressEdt = findViewById(R.id.address_edt);

        callPhoneBtn = findViewById(R.id.call_phone_btn);
        sendMessageBtn = findViewById(R.id.send_msm_btn);
        browerUrlBtn = findViewById(R.id.borwer_url_btn);

        callPhoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callPhone();
            }
        });

    }

    /**
     * 打电话
     */
    private void callPhone() {
        String address = addressEdt.getText().toString().trim();
        if (address == null || address.length() <= 0) {
            Toast.makeText(this, "输入的内容不能为空!", Toast.LENGTH_LONG).show();
            return;
        }

        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel://" + address));
        startActivity(intent);


    }





}
