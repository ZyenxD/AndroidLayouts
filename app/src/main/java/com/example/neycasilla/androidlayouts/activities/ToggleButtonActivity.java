package com.example.neycasilla.androidlayouts.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.neycasilla.androidlayouts.R;

public class ToggleButtonActivity extends AppCompatActivity implements View.OnClickListener {

    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        toggleButton = findViewById(R.id.my_toogle_button);
        toggleButton.setTextOn("Hello");
        toggleButton.setTextOff("Goodbye");
        toggleButton.setOnClickListener(this);
        Button button = findViewById(R.id.my_toggle_check_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,
                toggleButton.isChecked() ? toggleButton.getTextOn() : toggleButton.getTextOff(),
                Toast.LENGTH_LONG)
                .show();
    }
}
