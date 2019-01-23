package com.yuan.studentdemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2019/1/21 0021.
 */

public class MyApplication extends Application{

    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
