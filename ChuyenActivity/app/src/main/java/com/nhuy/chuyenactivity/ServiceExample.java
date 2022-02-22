package com.nhuy.chuyenactivity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
//import android.support.annotation.Nullable;

import androidx.annotation.Nullable;

public class ServiceExample extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();

        Log.e("NhuY-Intent-manifest ", "Servise da duoc khopi tao");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();

        Log.e("nhu y", "service duoc huy");
    }

}

