package com.example.mmut.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.example.mmut.myapplication.R.layout.activity_main;

public class exr_Data extends AppCompatActivity {

    private TextView tvData, tvHora;
    private Date fecha = new Date();
    private SimpleDateFormat sdfDate = new SimpleDateFormat("dd MMM");
    private SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        tvData = findViewById(R.id.tvData);
        tvHora = findViewById(R.id.tvHora);

        updateDate(null);

    }

    public void updateDate(View view) {
        tvData.setText(sdfDate.format(fecha));
        tvHora.setText(sdfTime.format(fecha));
    }
}

