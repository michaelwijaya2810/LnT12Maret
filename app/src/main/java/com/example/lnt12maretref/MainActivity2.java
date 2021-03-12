package com.example.lnt12maretref;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.lnt12maretref.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    String TAG = "MainActivity2Log";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate()");
        setContentView(R.layout.activity_main2);
    }
    //onStart()
    @Override
    protected void onStart() {
        Log.i(TAG, "onStart()");
        super.onStart();
    }
    //onResume()
    @Override
    protected void onResume() {
        Log.i(TAG, "onResume()");
        super.onResume();
    }
    //onPause()
    @Override
    protected void onPause() {
        Log.i(TAG, "onPause()");
        super.onPause();
    }
    //onStop()
    @Override
    protected void onStop() {
        Log.i(TAG, "onStop()");
        super.onStop();
    }
    //onRestart
    @Override
    protected void onRestart() {
        Log.i(TAG, "onRestart()");
        super.onRestart();
    }
    //onDestroy
    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy()");
        super.onDestroy();
    }
}