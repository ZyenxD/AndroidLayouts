package com.example.neycasilla.androidlayouts.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.neycasilla.androidlayouts.R;

public class AutoCompleteActivity extends AppCompatActivity implements View.OnClickListener, DialogInterface.OnClickListener {

    protected AutoCompleteTextView autoCompleteTextView;
    private CheckBox mMyCheckbox;
    private RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);
        String[] data = {"Cat", "Dog", "Mouse"};

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        //
        findViewById(R.id.my_button).setOnClickListener(this);

        autoCompleteTextView.setAdapter(new ArrayAdapter<>(this, R.layout.text_view_item, data));        // Number of Chars to Trigger Lookup
        autoCompleteTextView.setThreshold(1);

        mMyCheckbox = findViewById(R.id.my_checkbox);
        findViewById(R.id.my_checkbox_status_button).setOnClickListener(this);

        mRadioGroup = findViewById(R.id.my_radio_group);
        findViewById(R.id.my_button).setOnClickListener(this);

    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case AlertDialog.BUTTON_NEGATIVE:
                Toast.makeText(this, "Negative Message", Toast.LENGTH_SHORT).show();
                break;
            case AlertDialog.BUTTON_POSITIVE:
                Toast.makeText(this, "Positive Message", Toast.LENGTH_SHORT).show();
                break;
            case AlertDialog.BUTTON_NEUTRAL:
                Toast.makeText(this, "Neutral Message", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.my_button:
                new AlertDialog.Builder(this)
                        .setTitle("Titulo").setMessage(autoCompleteTextView.getText())
                        .setPositiveButton("YES", this)
                        .setNegativeButton("NO", this)
                        .setNeutralButton("CANCEL", this)
                        .create().show();
                break;
            case R.id.my_checkbox_status_button:
                Toast.makeText(this, mMyCheckbox.isChecked() ? "Checked" : "Not Checked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.my_button_show:
                RadioButton selected =  findViewById(mRadioGroup.getCheckedRadioButtonId());
                if (selected != null) {

                } else {
                    Toast.makeText(this, "Selected: " + selected.getText(), Toast.LENGTH_SHORT).show();
                    Toast.makeText(this, "Please select an animal", Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }

}
