package com.example.logincw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;


public class OutputScreen extends AppCompatActivity {
    Button SecondButton;
    Button RouteButton;
    Button startTime;
    Button endTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output_screen);
        SecondButton= findViewById(R.id.BtnToFirst);
        RouteButton = findViewById(R.id.buttonRoute);
        startTime = findViewById(R.id.startTimeButton);
        endTime = findViewById(R.id.endTimeButton);

        Bundle bundle = getIntent().getExtras();

        String route = bundle.get("route").toString();

        final DatabaseReference timeref = FirebaseDatabase.getInstance().getReference("routes");

        DatabaseReference pointref = timeref.child(route);

        








        SecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (OutputScreen.this,HomeScreen.class);
                startActivity(intent);
            }
        });
        RouteButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent (OutputScreen.this, MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}
// test commit