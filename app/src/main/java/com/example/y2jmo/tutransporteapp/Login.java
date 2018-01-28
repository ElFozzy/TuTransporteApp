package com.example.y2jmo.tutransporteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView txtregistro =(TextView)findViewById(R.id.txtRegistrar);
        txtregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login log = new Login();
                Intent intentRegistro = new Intent(Login.this, RegistroUsario.class);
                startActivity(intentRegistro);
                //finishActivity(log);
            }
        });



    }
}
