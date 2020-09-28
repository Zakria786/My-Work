package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Signup_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
        getSupportActionBar().setTitle("Signup Form");
    }
}