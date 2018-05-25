package com.example.mmut.miaplicacion;

import android.content.DialogInterface;
import android.net.sip.SipSession;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EmptyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
    }

    public void showAlert(View view) {
        // Mostrar alerta
        AlertDialog.Builder alerta = new AlertDialog.Builder(this);

        alerta.setIcon(R.drawable.ic_launcher_background);
        alerta.setCancelable(true);
        //alerta.setCustomTitle("Alerta!!!");
        alerta.setTitle("Alerta!!");
        alerta.setMessage("Aquest és un missatge d'alerta");
        alerta.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(EmptyActivity.this, "Has contestat: SÍ", Toast.LENGTH_SHORT).show();
            }
        });
        alerta.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(EmptyActivity.this, "Has contestat: NO",Toast.LENGTH_SHORT).show();
            }
        });

        alerta.show();
    }
}
