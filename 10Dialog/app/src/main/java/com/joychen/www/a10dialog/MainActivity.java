package com.joychen.www.a10dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("提示")
                .setMessage("确认要删除吗?")
                .setIcon(R.drawable.ic_launcher_background)
                .setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"已经删除",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("取消",null)
                .setCancelable(false)
                .create()
                .show();
    }

    AlertDialog alertDialog;
    public void showMyDialog(View vi){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

       View view =  LayoutInflater.from(this).inflate(R.layout.dialog_my,null);
        view.findViewById(R.id.login_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"我是自定义对话框!",Toast.LENGTH_LONG).show();
                alertDialog.dismiss();
            }
        });
        alertDialog  = builder.setView(view).create();
        alertDialog.show();



    }

    public void toMain(View v){
        startActivity(new Intent(this,MainTabActivity.class));
    }


}
