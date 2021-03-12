package com.example.lnt12maretref;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.lnt12maretref.databinding.ActivityMainBinding;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {
//    ActivityMainBinding mb;
    String TAG = "MainActivityLog";
    boolean isLoggedIn;
    boolean isPaused;

    //Activity Lifecycle's Callbacks
    //onCreate()
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        mb = ActivityMainBinding.inflate(getLayoutInflater());
//        View view = mb.getRoot();
        Log.i(TAG, "onCreate()");
        setContentView(R.layout.activity_main);
        isLoggedIn = true;
        Button button = findViewById(R.id.btn_next);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
    //onStart()
    @Override
    protected void onStart() {
        Log.i(TAG, "onStart()");
        super.onStart();
        //checkPermission
        checkPermission();
        //checkLoginStatus
        checkLoginStatus();
    }
    //onResume()
    @Override
    protected void onResume() {
        Log.i(TAG, "onResume()");
        super.onResume();
        isPaused = true;
        Log.i(TAG, "Video Resumed");
    }
    //onPause()
    @Override
    protected void onPause() {
        Log.i(TAG, "onPause()");
        super.onPause();
        isPaused = true;
        Log.i(TAG, "Video Paused");
    }
    //onStop()
    @Override
    protected void onStop() {
        Log.i(TAG, "onStop()");
        super.onStop();
        isLoggedIn = false;
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

    protected void checkPermission(){
        Log.i(TAG, "Checking permission");
    }

    protected void checkLoginStatus(){
        if(isLoggedIn){
            Log.i(TAG, "Logged In");
        }else{
            Log.i(TAG, "Logged out");
        }
    }
}