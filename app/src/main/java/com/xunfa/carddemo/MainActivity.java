package com.xunfa.carddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xunfa.cardnfclib.activity.CardNFC;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startView(View view)
    {
        String action="";
        switch (view.getId())
        {
            case R.id.btn_native_read:
                action="native_read";
                break;
            case R.id.btn_native_write:
                action="native_write";
                break;
            case R.id.btn_write_inspection:
                action="native_write_inspection";
                break;
            case R.id.btn_write_cancel:
                action="native_write_cancel";
                break;
        }
        Intent intentRead =new Intent(this, CardNFC.class);
        intentRead.putExtra("isOnLineMode", true);
        intentRead.putExtra("action", action);
        startActivity(intentRead);//启动Activity
    }
}