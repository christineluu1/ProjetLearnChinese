package com.example.projetlearnchinese;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CoursPrincipal extends AppCompatActivity {

    Button button_module1, button_module2, button_module3, button_test_blanc1;
    Button button_next;


    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_course1);

        button_module1= findViewById(R.id.button_module1);
        button_module2= findViewById(R.id.button_module2);
        button_module3= findViewById(R.id.button_module3);
        button_test_blanc1= findViewById(R.id.button_test_blanc1);

        button_next = findViewById(R.id.button_next);

        button_module1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoursPrincipal.this, Cours.class);
                startActivity(intent);
            }
        });

        button_module2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoursPrincipal.this, Exercice1.class);
                startActivity(intent);
            }
        });

        button_module3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoursPrincipal.this,Exercice2.class);
                startActivity(intent);
            }
        });

        button_test_blanc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoursPrincipal.this,Exercice3.class);
                startActivity(intent);
            }
        });

        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoursPrincipal.this,HomeFragment2.class);
                startActivity(intent);
            }
        });

    }
}
