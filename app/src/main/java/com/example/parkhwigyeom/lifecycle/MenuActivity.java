package com.example.parkhwigyeom.lifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MenuActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Log.i("박휘겸", "Menu : onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("박휘겸", "Menu : onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("박휘겸", "Menu : onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("박휘겸", "Menu : onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("박휘겸", "Menu : onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("박휘겸", "Menu : onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("박휘겸", "Menu : onDestroy()");
    }
}
