package com.example.parkhwigyeom.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("박휘겸", "Main : onCreate()");
    }

    public void goMenu(View view){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("박휘겸", "Main : onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("박휘겸", "Main : onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("박휘겸", "Main : onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("박휘겸", "Main : onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("박휘겸", "Main : onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("박휘겸", "Main : onDestroy()");
    }
}
