package com.example.neycasilla.androidlayouts.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.neycasilla.androidlayouts.R;
import com.example.neycasilla.androidlayouts.models.User;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Context context, ArrayList<User> users) {
        super(context, 0,users);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        User user = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater
                    .from(getContext())
                    .inflate(R.layout.item_user,parent,false);
        }

        TextView nameTextView = convertView.findViewById(R.id.textView1);
        TextView addressTextView = convertView.findViewById(R.id.textView2);

        nameTextView.setText(user.name);
        addressTextView.setText(user.addres);

        return convertView;
    }
}
