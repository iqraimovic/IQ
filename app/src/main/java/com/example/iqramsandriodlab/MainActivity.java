package com.example.iqramsandriodlab;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import com.example.iqramsandriodlab.databinding.ActivityMainBinding;



import algonquin.cst2335.olor0008.databinding.ActivityMainBinding;

public class MainActivity<btn> extends AppCompatActivity {
    private static String TAG= "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        EditText mail = findViewById(R.id.editTextTextEmailAddress);

        binding.loginButton.setOnClickListener(btn ->{

            Intent intent = new Intent(MainActivity.this,SecondActivity.class );
            intent.putExtra("Email Address", mail.getText().toString());
            startActivity(intent);
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.w( "MainActivity", "In onStart() - The application is now visible on screen" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w( "MainActivity", "In onResume() - The application is now responding to user input" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w( "MainActivity", "In onPause() - The application no longer responds to user input" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w( "MainActivity", "In onCreate() - The application is no longer visible" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w( "MainActivity", "In onDestroy() - Any memory used by the application is freed");}
}