package com.aptech.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Variables/Class Fields are defined here

    private EditText email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.emailID);
        pass = findViewById(R.id.passID);
    }

    public void onsubmit(View view) {
        String Email = email.getText().toString();
        Log.d("Check", "Email is :"+ Email);
    }
}