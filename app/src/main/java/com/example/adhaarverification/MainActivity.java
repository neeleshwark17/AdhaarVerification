package com.example.adhaarverification;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static int SPLASH_SCREEN_TIMEOUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(() -> {
            startActivity(new Intent(getApplicationContext(), Activity2.class));
            finish();
        }, SPLASH_SCREEN_TIMEOUT);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}