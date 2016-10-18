package com.github.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Administrator on 2016/10/18.
 */
public class SecondActivity  extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.e(TAG, "onCreate: 执行了" );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: 执行了" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: 执行了" );

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: 执行了" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: 执行了" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: 执行了" );

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart:执行了 " );
    }

}
