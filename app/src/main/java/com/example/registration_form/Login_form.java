package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        getSupportActionBar().setTitle("Login Form");
    }

    public void btn_newreg(View view) {
        startActivity(new Intent(this, Signup_form.class));
    }
    public void btn_fp(View view){
        startActivity(new Intent(this, Forget_password.class));
    }
}