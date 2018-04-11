package com.joychen.zhuawawa;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by joychen on 2018/3/16.
 */

public class ZhuaWaWa extends Activity implements View.OnClickListener{

    private Button backBtn;

    public static final String TAG = ZhuaWaWa.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 初使化界面
        setContentView(R.layout.activity_zhuawawa);
        Log.e(TAG,"我调用了-onCreate");
        backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"我调用了-onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"我调用了-onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"我调用了-onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"我调用了-onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"我调用了-onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"我调用了-onDestroy");
    }

    @Override
    public void onClick(View v) {
        finish();
//        Toast.makeText(this,"你点击我了",Toast.LENGTH_LONG).show();
    }
}
