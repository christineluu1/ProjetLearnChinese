package com.example.projetlearnchinese;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Exercice1 extends AppCompatActivity {

    Button bt_trueQ1,bt_trueQ2,bt_falseQ1,bt_falseQ2,bt_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercice1);


        bt_trueQ1= findViewById(R.id.button_trueQ1);
        bt_trueQ2= findViewById(R.id.button_trueQ2);
        bt_falseQ1= findViewById(R.id.button_falseQ1);
        bt_falseQ2= findViewById(R.id.button_falseQ2);
        bt_next = findViewById(R.id.button_next);

        bt_trueQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercice1.this, PopupFalse.class);
                startActivity(intent);
            }
        });

        bt_trueQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercice1.this, PopupCorrect.class);
                startActivity(intent);
            }
        });

        bt_falseQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercice1.this,PopupCorrect.class);
                startActivity(intent);
            }
        });

        bt_falseQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercice1.this,PopupFalse.class);
                startActivity(intent);
            }
        });

        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercice1.this,Exercice2.class);
                startActivity(intent);
            }
        });


    }
}


