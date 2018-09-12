package com.example.kaak.projet030;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EcrireCom extends AppCompatActivity {


    Button btnComOK,btnComCancel;
    EditText etCom;
    String comDuJour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecrire_com);

btnComOK=findViewById(R.id.btnComOK);
btnComCancel=findViewById(R.id.btnComCancel);
etCom=findViewById(R.id.etCom);

btnComOK.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      //  comDuJour=etCom.getText();


    }
});







    }
}
