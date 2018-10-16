package com.example.android.mydemobroadcasstapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;



public class MyBroadcastReceiver extends BroadcastReceiver {
    private static String TAG="MyBroadcastReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG,"onRecieve++");
        Toast.makeText(context,"From broadcast reciever",Toast.LENGTH_LONG).show();

    }
}
