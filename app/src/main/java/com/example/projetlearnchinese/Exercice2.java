package com.example.projetlearnchinese;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Exercice2 extends AppCompatActivity {

    Button validate1, validate2, bt_next;
    EditText editText1, editText2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercice2);

        validate1 = (Button) findViewById(R.id.button_validate1);
        validate2 = (Button) findViewById(R.id.button_validate2);
        editText1 = (EditText) findViewById(R.id.edit_responseQ1);
        editText2 = (EditText) findViewById(R.id.edit_responseQ2);
        bt_next = (Button) findViewById(R.id.button_next);

        String response1 = "c";
        String response2 = "b";


        validate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Q1 = editText1.getText().toString();
                if (Q1 != response1) {
                    Intent intent = new Intent(Exercice2.this, PopupFalse.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent (Exercice2.this, PopupCorrect.class);
                    startActivity(intent);
                }
            }
        });

        validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Q2 = editText2.getText().toString();
                if (Q2 != response2) {
                    Intent intent = new Intent(Exercice2.this,PopupFalse.class);
                    startActivity(intent);
                }
                else {
                    Intent intent =new Intent (Exercice2.this,PopupCorrect.class);
                    startActivity(intent);
                }
            }
        });

        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Exercice2.this,Exercice3.class);
                startActivity(intent);
            }

        });

    }
}