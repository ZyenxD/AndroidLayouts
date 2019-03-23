package com.example.neycasilla.androidlayouts.activities;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.neycasilla.androidlayouts.R;

public class AlertDialogActivity extends AppCompatActivity implements View.OnClickListener,
        DialogInterface.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        Button button =  findViewById(R.id.alter_button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        new AlertDialog.Builder(this)
                .setTitle("Titulo")
                .setMessage("Mensaje")
                .setPositiveButton("Yes",this)
                .setNegativeButton("No",this)
                .setNeutralButton("Cancel",this)
                .create()
                .show();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

        switch (which){
            case AlertDialog.BUTTON_POSITIVE:
                Toast.makeText(this,"Positivity",Toast.LENGTH_LONG).show();
                break;
            case AlertDialog.BUTTON_NEGATIVE:
                Toast.makeText(this,"Negativity",Toast.LENGTH_LONG).show();
                break;
            case AlertDialog.BUTTON_NEUTRAL:
                Toast.makeText(this,"neutrality",Toast.LENGTH_LONG).show();
                break;
        }

    }
}
