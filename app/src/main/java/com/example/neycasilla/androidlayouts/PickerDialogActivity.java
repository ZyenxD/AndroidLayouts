package com.example.neycasilla.androidlayouts;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

public class PickerDialogActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView dateDisplayTextView,
            timeDisplayTextView,
            dateTimeDisplayTextView;
    private DatePickerDialog datePickerDialog;
    private TimePickerDialog timePickerDialog;
    private Calendar calendar;
    private SimpleDateFormat dateFormatter,
            timeFormatter,dateTimeFormatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker_dialog);

        calendar = Calendar.getInstance();

        dateFormatter = new SimpleDateFormat
                ("dd/MM/yyy",Locale.getDefault());
        timeFormatter = new SimpleDateFormat
                ("hh:mm",Locale.getDefault());
        dateTimeFormatter = new SimpleDateFormat
                ("dd/MM/yyy hh:mm:ss a",Locale.getDefault());

        datePickerDialog = new DatePickerDialog(this,
                datepickeLinstenr,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DATE));

        timePickerDialog = new TimePickerDialog(this,
                timePickerListener,
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                false);

        findViewById(R.id.time_pick).setOnClickListener(this);
        findViewById(R.id.date_pick).setOnClickListener(this);

        dateDisplayTextView = findViewById(R.id.date_display);
        timeDisplayTextView = findViewById(R.id.time_display);
        dateTimeDisplayTextView = findViewById(R.id.time_date_display);
        refreshDisplay();
    }



    DatePickerDialog.OnDateSetListener datepickeLinstenr =
            new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,month);
            calendar.set(Calendar.DATE,dayOfMonth);
            refreshDisplay();
        }
    };

    private void refreshDisplay() {
        dateDisplayTextView.setText(dateFormatter.format(calendar.getTime()));
        timeDisplayTextView.setText(timeFormatter.format(calendar.getTime()));
        dateTimeDisplayTextView.setText(dateTimeFormatter.format(calendar.getTime()));
    }

    TimePickerDialog.OnTimeSetListener timePickerListener =
            new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view,
                              int hourOfDay,
                              int minute) {
            calendar.set(Calendar.HOUR_OF_DAY,hourOfDay);
            calendar.set(Calendar.MINUTE,minute);
            refreshDisplay();
        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.time_pick:
                timePickerDialog.show();
                break;
            case R.id.date_pick:
                datePickerDialog.show();
                break;
        }

    }
}
