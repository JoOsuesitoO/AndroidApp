package com.example.practice02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        tv1 = findViewById(R.id.tv1);
    }

    public void sumar (View view){
        int suma = (Integer.parseInt(et1.getText().toString()))+(Integer.parseInt(et2.getText().toString()));
        tv1.setText(String.valueOf("Resultado: "+suma));

    }
}