package com.example.adhaarverification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    Button verifyAadhaar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        verifyAadhaar = findViewById(R.id.verifyAadhaar);

        verifyAadhaar.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Activity3.class)));

    }
}