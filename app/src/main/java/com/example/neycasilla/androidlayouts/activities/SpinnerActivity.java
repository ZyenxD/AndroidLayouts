package com.example.neycasilla.androidlayouts.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.example.neycasilla.androidlayouts.R;

public class SpinnerActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner spinner;

    private String[] data = {"Cat", "Dog", "Mouse"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = findViewById(R.id.my_spinner);
        Button button = findViewById(R.id.my_spinner_button);

        ArrayAdapter adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                data);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(this,
                spinner.getSelectedItem().toString(),
                Toast.LENGTH_SHORT)
                .show();

    }
}
