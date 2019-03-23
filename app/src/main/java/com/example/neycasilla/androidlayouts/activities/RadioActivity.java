package com.example.neycasilla.androidlayouts.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.neycasilla.androidlayouts.R;

public class RadioActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton radioButton;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        Button radioCheckButton = findViewById(R.id.my_radio_check_button);
        Button radioGroupButton = findViewById(R.id.my_radio_group_check_button);

         radioButton = findViewById(R.id.my_radio_button);

         radioGroup = findViewById(R.id.my_new_radio_group);

         radioCheckButton.setOnClickListener(this);
         radioGroupButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.my_radio_check_button:

                Toast.makeText(this,
                        "Radio Button" +
                                (radioButton.isChecked()
                                        ? "Is Checked":" is Not Checked")
                        ,Toast.LENGTH_LONG)
                        .show();

                radioButton.setChecked(false);

                break;
            case R.id.my_radio_group_check_button:

                RadioButton selected =
                        findViewById(radioGroup.getCheckedRadioButtonId());

                if(selected == null){
                    Toast.makeText(this,
                            "Please Selected an Animal",
                            Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this,
                            selected.getText() + "was selected",
                            Toast.LENGTH_SHORT).show();
                }

                break;
        }

    }
}
