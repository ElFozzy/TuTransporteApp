package com.example.y2jmo.tutransporteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroUsario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usario);

        Button btnreg =(Button)findViewById(R.id.btnRegistrarme);
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentReg = new Intent(RegistroUsario.this, Login.class);
                startActivity(intentReg);
            }
        });

    }
}
