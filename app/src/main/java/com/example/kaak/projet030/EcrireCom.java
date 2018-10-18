package com.example.kaak.projet030;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kaak.projet030.controller.MainActivity;

public class EcrireCom extends AppCompatActivity {


    Button btnComOK, btnComCancel;
    EditText etCom;
    String comDuJour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecrire_com);

        //int valeurRecuperee = getIntent().get

        btnComOK = findViewById(R.id.btnComOK);
        btnComCancel = findViewById(R.id.btnComCancel);
        etCom = findViewById(R.id.etCom);

        btnComOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // regarder les bundle et communication entre activity
                comDuJour = etCom.getText().toString();
                Toast.makeText(EcrireCom.this, "le com du jour est " + comDuJour, Toast.LENGTH_SHORT).show();
                //Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                //startActivity(mainActivity);//ne fournit pas derniere humeur
                finish();
            }
        });


    }
}
