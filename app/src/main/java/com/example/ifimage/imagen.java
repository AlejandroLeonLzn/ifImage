package com.example.ifimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class imagen extends AppCompatActivity {
    private TextView tv1;
    private ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen);
        tv1 = (TextView)findViewById(R.id.tv1);
        iv1 = (ImageView) findViewById(R.id.iv1);
        String nomb=getIntent().getStringExtra("nom");
        String edad=getIntent().getStringExtra("eda");
        int e=Integer.parseInt(edad);
        if(e>=18){
            tv1.setText("Hola "+nomb+" eres mayor de edad");
            iv1.setBackgroundResource(R.drawable.playboy);


        }else{
            tv1.setText("Hola "+nomb+" eres menor de edad");
            iv1.setBackgroundResource(R.drawable.caballo);
        }
    }
    //Regresar
    public void regresar (View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}