package com.example.mmut.miaplicacion;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    static final String TAG = "MiApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toast.makeText(this, "Activity created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Activity created!");

    }

    // Lanzar otra activity
    public void launchAnotherActivity(View view) {
        Context context = getApplicationContext();
        startActivity( new Intent(context, EmptyActivity.class));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity started!!", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Activity started!!");
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity paused!!", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Activity paused!!");
        
    }
    
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Activity restarted!!", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Activity restarted!!");
        
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity destroyed!", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Activity destroyed!!");
    }



}
