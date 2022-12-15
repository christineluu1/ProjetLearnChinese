package com.example.projetlearnchinese;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Faq extends AppCompatActivity {

    Button button_backHome;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_faq);

        button_backHome= findViewById(R.id.button_back_home);


        button_backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Faq.this, HomeFragment2.class);
                startActivity(intent);
            }
        });
    }
}