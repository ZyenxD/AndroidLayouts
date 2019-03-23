package com.example.neycasilla.androidlayouts.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.neycasilla.androidlayouts.R;
import com.example.neycasilla.androidlayouts.adapters.UserAdapter;
import com.example.neycasilla.androidlayouts.models.User;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView =  findViewById(R.id.listViewComponent);
        ArrayList<User> users = new ArrayList<>();
        for (int i=0; i<100;i++){
            users.add(new User("Name "+i,"address "+i));
        }

        UserAdapter userAdapter = new UserAdapter(this,users);

        listView.setAdapter(userAdapter);
    }
}
