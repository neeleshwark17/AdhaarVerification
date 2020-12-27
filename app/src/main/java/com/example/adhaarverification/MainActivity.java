package com.example.adhaarverification;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button verifyAadhaar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        verifyAadhaar = findViewById(R.id.verifyAadhaar);

        verifyAadhaar.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), MainActivity2.class)));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}