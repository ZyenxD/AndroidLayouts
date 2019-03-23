package com.example.neycasilla.androidlayouts.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.neycasilla.androidlayouts.R;

public class CheckBoxActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        checkBox =  findViewById(R.id.my_new_checkbox);
        Button button = findViewById(R.id.my_checkbox_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,
                checkBox.isChecked() ? "Checkbox is checked": " is not Checked",
                Toast.LENGTH_LONG)
                .show();
    }
}
