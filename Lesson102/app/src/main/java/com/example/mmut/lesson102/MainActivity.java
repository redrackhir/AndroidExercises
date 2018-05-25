package com.example.mmut.lesson102;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (item.getItemId()) {
            case R.id.action_clients:
                Toast.makeText(this, "Pantalla clients", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_comandes:
                Toast.makeText(this, "Pantalla comandes", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_cfg:
                Toast.makeText(this, "Pantalla configuració", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_comandes_direct:
                Toast.makeText(this, "Pantalla comandes", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_factures:
                Toast.makeText(this, "Pantalla factures", Toast.LENGTH_SHORT).show();
                return true;
            default:
                Toast.makeText(this, "ERROR!!!", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
