package com.example.projetlearnchinese;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class HomeFragment2 extends AppCompatActivity {
    Button bt_buttonCours1, bt_buttonCours2, bt_buttonCours3, bt_buttonCours4, bt_buttonCours5,bt_buttonCours6;
    ImageButton bt_buttonFaq;
    Button AboutUsButton;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        bt_buttonCours1 = findViewById(R.id.button_course1);
        bt_buttonCours2 = findViewById(R.id.button_course2);
        bt_buttonCours3 = findViewById(R.id.button_course3);
        bt_buttonCours4 = findViewById(R.id.button_course4);
        bt_buttonCours5 = findViewById(R.id.button_course5);
        bt_buttonCours6 = findViewById(R.id.button_course6);
        bt_buttonFaq = findViewById(R.id.button_faq);
        AboutUsButton = findViewById(R.id.AboutUsButton);


        bt_buttonCours1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeFragment2.this,CoursPrincipal.class));
            }
        });


        bt_buttonCours2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment2.this, ActivityLoading.class);
                startActivity(intent);
            }
        });


        bt_buttonCours3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment2.this,ActivityLoading.class);
                startActivity(intent);
            }
        });

        bt_buttonCours4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment2.this,ActivityLoading.class);
                startActivity(intent);
            }
        });

        bt_buttonCours5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment2.this,ActivityLoading.class);
                startActivity(intent);
            }
        });

        bt_buttonCours6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment2.this,ActivityLoading.class);
                startActivity(intent);
            }
        });



        bt_buttonFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment2.this, Faq.class);
                startActivity(intent);
            }
        });

        AboutUsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeFragment2.this, AboutUs.class);
                startActivity(intent);
            }
        });

    }
}