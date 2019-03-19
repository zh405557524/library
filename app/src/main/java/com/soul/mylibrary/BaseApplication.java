package com.soul.mylibrary;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Process;

import com.soul.library.utils.UIUtils;


/**
 * Description:
 * Author: 祝明
 * CreateDate: 2019/3/19 下午8:26
 * UpdateUser:
 * UpdateDate: 2019/3/19 下午8:26
 * UpdateRemark:
 */
public class BaseApplication extends Application {


    private Handler mHandler;
    private Context mContext;
    private int mMainThreadId;
    private Thread mMainThread;

    @Override
    public void onCreate() {
        super.onCreate();
        // 创建一些常见的变量
        // 1 上下文

        mContext = getApplicationContext();
        // 2 创建一个handler
        mHandler = new Handler() {

        };
        // 3 的到一个主线程 id
        mMainThreadId = Process.myTid();
        // 4 得到主线程
        mMainThread = Thread.currentThread();
        UIUtils.init(this, mHandler, mMainThreadId);
    }
}
