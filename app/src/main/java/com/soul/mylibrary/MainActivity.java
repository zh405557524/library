package com.soul.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.soul.library.utils.LogUtils;
import com.soul.library.utils.UIUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UIUtils.postTaskSafely(new Runnable() {
            @Override
            public void run() {

                LogUtils.i("Tag","fdsaf");
            }
        });
    }
}
