package com.escobedo.jees.numeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void checkNumber(View view){
        EditText txtNumber = (EditText) findViewById(R.id.numero);
        TextView resultado = (TextView) findViewById(R.id.resultado);

        String sNumber = txtNumber.getText().toString().trim();
        Integer number = Integer.parseInt(sNumber);


        if (IsSquareNumber(number)) {
            resultado.setText(sNumber + " es un numero cuadrado");
        } else {
            if (IsTriangularNumber(number)) {
                resultado.setText(sNumber + " es un numero triangular");
            } else {
                resultado.setText (sNumber + " no es un numero cuadrado ni triangular");
            }
        }
    }

    public boolean IsSquareNumber(int number) {
        double squareRoot = Math.sqrt(number);

        if (squareRoot == Math.floor(squareRoot)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsTriangularNumber(int number) {
        int x = 1;
        int triangularNumber = 1;

        while (triangularNumber < number) {
            x++;
            triangularNumber += x;
        }

        if (triangularNumber == number) {
            return true;
        } else {
            return false;
        }
    }
}
