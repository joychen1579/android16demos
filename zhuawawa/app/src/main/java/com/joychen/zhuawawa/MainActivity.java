package com.joychen.zhuawawa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到Button控件
        Button mybutton = (Button)findViewById(R.id.mybutton);

        //设置点击事件
        mybutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               // Toast.makeText(MainActivity.this,"你点我了!",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,ZhuaWaWa.class);
                startActivity(intent);


            }
        } );



//        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//                startActivity(intent);
//
//
//            }
//        });
    }
}
