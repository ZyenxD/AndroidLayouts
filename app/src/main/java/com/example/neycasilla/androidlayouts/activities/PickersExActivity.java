package com.example.neycasilla.androidlayouts.activities;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.neycasilla.androidlayouts.R;

public class PickersExActivity extends AppCompatActivity implements View.OnClickListener {

    private TimePicker timePicker;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickers_ex);

        timePicker = findViewById(R.id.my_time_picker);
        datePicker = findViewById(R.id.my_date_picker);
        findViewById(R.id.my_button).setOnClickListener(this);
        findViewById(R.id.my_button_2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.my_button:
                showPickedTime();

                break;
            case R.id.my_button_2:
                showPickedDate();
                break;
        }
    }


    private void showPickedTime(){
        StringBuilder stringBuilder =  new StringBuilder();
        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.M){
            stringBuilder.append(timePicker.getHour());
        }else{
            stringBuilder.append(timePicker.getCurrentHour());
        }

        stringBuilder.append(":");
        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.M){
            stringBuilder.append(timePicker.getMinute());
        }else{
            stringBuilder.append(timePicker.getCurrentMinute());
        }

        Toast.makeText(this,stringBuilder.toString(),Toast.LENGTH_LONG).show();
    }

    private void showPickedDate(){
        StringBuilder stringBuilder =  new StringBuilder();
        stringBuilder.append(datePicker.getDayOfMonth());
        stringBuilder.append("/");
        stringBuilder.append(datePicker.getMonth());
        stringBuilder.append("/");
        stringBuilder.append(datePicker.getYear());
        Toast.makeText(this,stringBuilder.toString(),Toast.LENGTH_LONG).show();
    }
}
