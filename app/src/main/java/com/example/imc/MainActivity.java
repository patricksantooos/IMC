package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResultado;
    private EditText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);

    }

    public void calculodoImc(View view){
        String text = "";
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double resultado = peso/(altura * altura);

        if (resultado < 19){
            text= "Abaixo do Peso!";
        }else if (resultado >= 19 && resultado < 25){
            text= "Peso Normal!";;
        }else if (resultado >= 25 && resultado <30){
            text= "Sobrepeso";;
        }else if (resultado >=30 && resultado < 40){
            text= "Obesidade tipo 2";;
        }else if (resultado >=40){
            text= "Obesidade tipo 2";
        }

        txtResultado.setText(text);
    }
}
