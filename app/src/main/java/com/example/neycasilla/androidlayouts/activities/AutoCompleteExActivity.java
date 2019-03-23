package com.example.neycasilla.androidlayouts.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.neycasilla.androidlayouts.R;

public class AutoCompleteExActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_ex);

        String[] data  = {"Cat" ,"Dog", "Cow"};
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.my_autocomplete);

        autoCompleteTextView.setAdapter( new ArrayAdapter<>(this,R.layout.text_view_item,data));

        autoCompleteTextView.setThreshold(1);
    }
}
