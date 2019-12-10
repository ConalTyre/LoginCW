package com.example.logincw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class HomeScreen extends AppCompatActivity implements OnItemSelectedListener {

    Button firstButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        final Spinner dropdown = (Spinner) findViewById(R.id.routeSpinner);

        dropdown.setOnItemSelectedListener(this);

        String [] routes = new String[] {"Coleraine to Belfast", "Derry to Belfast", "Derry to Omagh"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, routes);

        dropdown.setAdapter(adapter);

        firstButton = findViewById(R.id.BtnToSecond);
        firstButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreen.this, OutputScreen.class);
                intent.putExtra("route", String.valueOf(dropdown.getSelectedItem()));
                startActivity(intent);

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
