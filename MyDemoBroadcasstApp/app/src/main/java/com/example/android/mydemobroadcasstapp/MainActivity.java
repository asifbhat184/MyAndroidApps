package com.example.android.mydemobroadcasstapp;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
private  static String TAG="MainActivity";
//Create an instance of BroadcastReceiver
    MyBroadcastReceiver myBroadcastReceiver=new MyBroadcastReceiver();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"onCreate++");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    protected void onResume() {
        super.onResume();
        //register the receiver
        Log.d(TAG,"onResume--Registering Reciever");
        registerReceiver(myBroadcastReceiver,new IntentFilter("com.example.broadcast.MY_NOTIFICATION"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        //UnRegistering Reciever
        Log.d(TAG,"onResume--UnRegistering Reciever");
       unregisterReceiver(myBroadcastReceiver);
    }

    public void sendBroadcast(View view){
        Log.d(TAG,"sendBroadcast++");
        Intent intent = new Intent();
        intent.setAction("com.example.broadcast.MY_NOTIFICATION");
        intent.putExtra("data","Notice me senpai!");
        //sending Broadcast
        sendBroadcast(intent);

    }
}
