package com.example.iqramsandriodlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w("MainActivity", "In OnCreate() - Loading Widgets");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("MainActivity", "In OnResume() - Application is now visible ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("MainActivity", "In OnPause() - Application no longer responds");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("MainActivity", "In OnStop() - Application no longer responds");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("MainActivity", "In OnDestroy() - Application memory freed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w("MainActivity", "In OnStart() - Application is now visible");
    }
}