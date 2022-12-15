package com.example.projetlearnchinese;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Exercice3 extends AppCompatActivity {

    Button validate1, validate2, validate3, bt_next;
    EditText reponseUser1, reponseUser2, reponseUser3;
    String response1 = "d";
    String response2 = "c";
    String response3="d";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercice3);

        validate1 = findViewById(R.id.button_validate1);
        validate2 = (Button) findViewById(R.id.button_validate2);
        validate3 = (Button) findViewById(R.id.button_validate3);
        reponseUser1 = findViewById(R.id.name_responseQ1);
        reponseUser2 = (EditText) findViewById(R.id.name_responseQ2);
        reponseUser3 = (EditText) findViewById(R.id.name_responseQ3);
        bt_next = (Button) findViewById(R.id.button_next);


        validate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Q1 = reponseUser1.getText().toString();
                if (Q1 != response1) {
                    Intent intent = new Intent(Exercice3.this, PopupFalse.class);
                    startActivity(intent);
                }
                else {
                    Intent intent =new Intent (Exercice3.this, PopupCorrect.class);
                    startActivity(intent);
                }
            }
        });

        validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Q2 = reponseUser2.getText().toString();
                if (Q2 != response2) {
                    Intent intent = new Intent(Exercice3.this,PopupFalse.class);
                    startActivity(intent);
                }
                else {
                    Intent intent =new Intent (Exercice3.this,PopupCorrect.class);
                    startActivity(intent);
                }
            }
        });

        validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Q3 = reponseUser3.getText().toString();
                if (Q3 != response3) {
                    Intent intent = new Intent(Exercice3.this,PopupFalse.class);
                    startActivity(intent);
                }
                else {
                    Intent intent =new Intent (Exercice3.this,PopupCorrect.class);
                    startActivity(intent);
                }
            }
        });


        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercice3.this, CoursPrincipal.class); // préciser vers quelle page envoyer
                startActivity(intent);
            }
        });
}
}
