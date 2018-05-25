package com.example.mmut.exr_fecha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private Date fecha = new Date();
    private SimpleDateFormat sdfDate = new SimpleDateFormat("dd MMM");
    private SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tvFecha);

    }

    public void updateDate(View view) {
        tv.setText(sdfDate.format(fecha));
    }
}
