package com.example.login3.control;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.login3.R;

public class Retrieve extends AppCompatActivity {

    private TextView user,psw;
    private CheckBox cb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);
        //InitView();
    }

}
