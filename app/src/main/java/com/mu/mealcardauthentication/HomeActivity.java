package com.mu.mealcardauthentication;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView rqButton = findViewById(R.id.btn_rq);
        rqButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, QRScannerActivity.class);
            startActivity(intent);
        });

        ImageView infoButton = findViewById(R.id.btn_info);
        infoButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, InfoActivity.class);
            startActivity(intent);
        });

        ImageView logoutButton = findViewById(R.id.btn_logout);
        logoutButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
