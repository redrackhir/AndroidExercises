package com.example.mmut.lesson10;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        // Create a inflater
        LayoutInflater inflater = this.getLayoutInflater();
        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        adb.setView(inflater.inflate(R.layout.dialog_signin, null));

        // Add title, buttons...
        adb.setTitle("Questió de vida o mort")
                .setMessage("Ets una dona?")
                .setPositiveButton("Sí!!", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        mostraQuiEts("Ets supergirl !!!");
                        // MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No!!", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        mostraQuiEts("Ets spiderman !!!");
                        // MainActivity.this.finish();
                    }
                });
        // create alert dialog
        AlertDialog alertDialog = adb.create();

        // show it
        alertDialog.show();
    }

    private void mostraQuiEts(String texte) {
        Toast.makeText(MainActivity.this, texte, Toast.LENGTH_SHORT).show();
    }
}
