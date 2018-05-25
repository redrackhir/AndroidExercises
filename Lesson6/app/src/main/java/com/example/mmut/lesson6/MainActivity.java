package com.example.mmut.lesson6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    

    public void openDetailView(View view) {
        startActivity(new android.content.Intent(this, ScrollingActivity.class));
    }

    public void openListScroll(View view) {
        startActivity(new android.content.Intent(this, RecyclerViewDemo.class));
    }
}
