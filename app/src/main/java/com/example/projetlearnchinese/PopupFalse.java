package com.example.projetlearnchinese;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetlearnchinese.R;

public class PopupFalse extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {

        Button bt_close;
        super.onCreate ( savedInstanceState);
        setContentView (R.layout.activity_popup_false);

        bt_close= (Button)findViewById(R.id.button_close);

        bt_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
    }
}
