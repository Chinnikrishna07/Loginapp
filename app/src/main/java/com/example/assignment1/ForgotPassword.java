package com.example.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ForgotPassword extends Activity {
    @Override
    protected void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.forgot_password);
        Spinner spinnerQ1 = findViewById(R.id.spinner_Q1);
        Spinner spinnerQ2 = findViewById(R.id.spinner_Q2);
        ArrayAdapter<String> questions = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"Which place were you born in?", "What is your pet's name?", "What is your favourite hobby?"});
        spinnerQ1.setAdapter(questions);
        spinnerQ2.setAdapter(questions);
    }
}
