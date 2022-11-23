package com.example.ifimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.etnom);
        et2 = (EditText)findViewById(R.id.eteda);

    }
    public void enviar (View view){
        Intent i = new Intent(this,imagen.class);
        i.putExtra("nom", et1.getText().toString());
        i.putExtra("eda", et2.getText().toString());
        startActivity(i);
    }
}