package com.example.neycasilla.androidlayouts.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.neycasilla.androidlayouts.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linearButton = findViewById(R.id.linearLayoutButton);
        Button relativeButton = findViewById(R.id.realtiveLayoutButton);
        Button tableButton = findViewById(R.id.tableLayoutButton);
        Button frameButton = findViewById(R.id.frameLayoutButton);
        Button constrainButton = findViewById(R.id.constrainLayoutButton);
        Button weightButton = findViewById(R.id.weightLayoutButton);

        linearButton.setOnClickListener(this);
        relativeButton.setOnClickListener(this);
        tableButton.setOnClickListener(this);
        frameButton.setOnClickListener(this);
        constrainButton.setOnClickListener(this);
        weightButton.setOnClickListener(this);

        findViewById(R.id.pass_data).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.linearLayoutButton:
                intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.realtiveLayoutButton:
                intent = new Intent(MainActivity.this, RealiteveActivity.class);
                startActivity(intent);
                break;
            case R.id.tableLayoutButton:
                intent = new Intent(MainActivity.this, TableActivity.class);
                startActivity(intent);
                break;
            case R.id.frameLayoutButton:
                intent = new Intent(MainActivity.this, FrameActivity.class);
                startActivity(intent);
                break;
            case R.id.constrainLayoutButton:
                intent = new Intent(MainActivity.this, ConstrainActivity.class);
                startActivity(intent);
                break;
            case R.id.weightLayoutButton:
                intent = new Intent(MainActivity.this, weightActivity.class);
                startActivity(intent);
                break;
            case R.id.pass_data:
                intent = new Intent(MainActivity.this, AutoCompleteActivity.class);

                intent.putExtra("boolVal",false);
                intent.putExtra("hint","Esto es un hint");

                Bundle bundle = new Bundle();
                bundle.putString("name","Texto");
                bundle.putBoolean("boolval",true);
                bundle.putString("surename","Nombre");
                bundle.putString("realHint","Este es el verdadero hint");


                intent.putExtras(bundle);
                intent.putExtra("bundelPack",bundle);

                startActivity(intent);
                break;
        }
    }
}
