package com.example.neycasilla.androidlayouts.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.neycasilla.androidlayouts.R;

public class EditTextActivity extends AppCompatActivity implements View.OnClickListener
{
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        editText = findViewById(R.id.my_edit_text);
        Button button = findViewById(R.id.my_edit_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(editText.getText().toString().equals("") ){
            Toast.makeText(this,"Favor de escribir algo",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,editText.getText(),Toast.LENGTH_LONG).show();
        }

    }
}
