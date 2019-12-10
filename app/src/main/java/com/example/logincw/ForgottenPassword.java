package com.example.logincw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgottenPassword extends AppCompatActivity {
Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotten_password);
        btnBack = (Button) findViewById(R.id.btnBackLogin);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override

            // opens login screen
            public void onClick(View v) {
                startActivity(new Intent(ForgottenPassword.this, MainActivity.class));
            }
        });

    }
}
