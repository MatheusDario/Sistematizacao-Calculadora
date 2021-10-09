package com.example.calculadora_sistematizacao_pdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Button btn_somar=(Button)findViewById(R.id.btn_soma);
        Button btn_subtrair=(Button)findViewById(R.id.btn_subtrair);
        Button btn_multiplicar=(Button)findViewById(R.id.btn_multiplicar);
        Button btn_dividir=(Button)findViewById(R.id.btn_dividir);

        TextView tv_resultado=(TextView)findViewById(R.id.tv_resultado);
        EditText et_entrada1=(EditText)findViewById(R.id.et_entrada1);
        EditText et_entrada2=(EditText)findViewById(R.id.et_entrada2);

        btn_somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(et_entrada1.getText().toString());
                num2=Double.parseDouble(et_entrada2.getText().toString());
                result=num1+num2;
                tv_resultado.setText(String.valueOf(result));
            }
        });

        btn_subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(et_entrada1.getText().toString());
                num2=Double.parseDouble(et_entrada2.getText().toString());
                result=num1-num2;
                tv_resultado.setText(String.valueOf(result));
            }
        });

        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(et_entrada1.getText().toString());
                num2=Double.parseDouble(et_entrada2.getText().toString());
                result=num1*num2;
                tv_resultado.setText(String.valueOf(result));
            }
        });

        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(et_entrada1.getText().toString());
                num2=Double.parseDouble(et_entrada2.getText().toString());
                result=num1/num2;
                tv_resultado.setText(String.valueOf(result));
            }
        });

    }
}