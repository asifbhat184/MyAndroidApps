package com.example.android.myserverapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mBinder;

    }
    private final IMyAidlInterface.Stub mBinder=new IMyAidlInterface.Stub(){


        @Override
        public int calculate(int num1, int num2) throws RemoteException {
            return num1+num2;
        }
    };
}
