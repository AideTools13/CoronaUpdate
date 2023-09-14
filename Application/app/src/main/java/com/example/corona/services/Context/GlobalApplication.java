package com.example.corona.services.Context;

import android.app.Application;
import android.content.Context;
import androidx.multidex.MultiDexApplication;

public class GlobalApplication extends MultiDexApplication {

    private static Context appContext;
    
    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
    }

    public static Context getAppContext(){
        return appContext;
    }
}
