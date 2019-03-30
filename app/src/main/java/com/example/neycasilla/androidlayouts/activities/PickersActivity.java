package com.example.neycasilla.androidlayouts.activities;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.neycasilla.androidlayouts.R;

import java.sql.Time;

public class PickersActivity extends AppCompatActivity implements View.OnClickListener {

    private TimePicker timePicker;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickers);

        timePicker = findViewById(R.id.my_time_picker);
        datePicker = findViewById(R.id.my_date_picker);
        Button button = findViewById(R.id.my_button);
        Button buttonDate = findViewById(R.id.my_button_date);
        button.setOnClickListener(this);
        buttonDate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.my_button:
                showTime();
                break;
            case R.id.my_button_date:
                showDate();
                break;

        }
    }

    private void showDate(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(datePicker.getDayOfMonth());
        stringBuilder.append("/");
        stringBuilder.append(datePicker.getMonth());
        stringBuilder.append("/");
        stringBuilder.append(datePicker.getYear());

        Toast.makeText(this,stringBuilder.toString(),Toast.LENGTH_LONG).show();
    }


    private void showTime(){
        StringBuilder stringBuilder = new StringBuilder();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            stringBuilder.append(timePicker.getHour());
            stringBuilder.append(":");
            stringBuilder.append(timePicker.getMinute());
        }else{
            stringBuilder.append(timePicker.getCurrentHour());
            stringBuilder.append(":");
            stringBuilder.append(timePicker.getCurrentMinute());
        }


        Toast.makeText(this,stringBuilder.toString(),Toast.LENGTH_LONG).show();
    }
}
