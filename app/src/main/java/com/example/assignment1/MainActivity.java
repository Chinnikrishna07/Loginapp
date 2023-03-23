package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_login).setOnClickListener(v -> {
            login();
        });
        findViewById(R.id.button_nextcloud).setOnClickListener(v -> {
            linkOpen(0);
        });
        findViewById(R.id.button_affanweb).setOnClickListener(v -> {
            linkOpen(1);
        });
        findViewById(R.id.Text_ForgotPwd).setOnClickListener(v -> {
            forgotPwd();
        });
    }

    void linkOpen(int option) {
        String url;
        if (option == 0)
            url = "https://nextcloud.com";
        else url = "https://nitter.net/affankhan1113/with_replies";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }

    void login() {
        EditText emailText = findViewById(R.id.Text_Email);
        TextView statusLabel = findViewById(R.id.Label_Status);
        EditText passwdText = findViewById(R.id.Text_Password);
        if (Patterns.EMAIL_ADDRESS.matcher(emailText.getText() ).matches())
            if ((emailText.getText().toString() == "rms@gnu.org") && (passwdText.getText().toString() == "Password@123"))
                Toast.makeText(getApplicationContext(), "RIGHT!", Toast.LENGTH_SHORT).show();
            else
                statusLabel.setText("Invalid Email and/or Password");
        else
            statusLabel.setText("Invalid Email Format");

    }

    void forgotPwd() {
        startActivity(new Intent(this, ForgotPassword.class));
    }
}
