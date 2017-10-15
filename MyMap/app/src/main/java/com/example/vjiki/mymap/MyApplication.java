package com.example.vjiki.mymap;

import android.app.Application;
import android.content.res.Configuration;

public class MyApplication extends Application {
    private static MyApplication singleton;
    // Returns the application instance
    public static MyApplication getInstance() {
        return singleton;
    }
    @Override
    public final void onCreate() {
        super.onCreate();
        singleton = this;
        //Object value = MyApplication.getInstance().getGlobalStateValue();
        //MyApplication.getInstance().setGlobalStateValue(myObjectValue);
    }

    @Override
    public final void onLowMemory () {
        super.onLowMemory();
        // clear cache and unnecessary resources
    }

    @Override
    public final void onTrimMemory (int level) {
        super.onTrimMemory(level);
        // clear cache and unnecessary resources
    }

    @Override
    public final void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}