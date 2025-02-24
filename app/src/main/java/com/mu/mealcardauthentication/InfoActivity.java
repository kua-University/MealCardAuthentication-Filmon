package com.mu.mealcardauthentication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Button BackButton = findViewById(R.id.btn_back);
        BackButton.setOnClickListener(v -> {
            Intent intent = new Intent(InfoActivity.this, HomeActivity.class);
            startActivity(intent);
        });

    }
}
