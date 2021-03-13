package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextNum1;
    EditText editTextTextNum2;
    EditText editTextResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextNum1 = findViewById(R.id.editTextTextNum1);
        editTextTextNum2 = findViewById(R.id.editTextTextNum2);
        editTextResult = findViewById(R.id.editTextResult);
        editTextResult.setText("");
    }
    public void buttonSomar(View view){
        int num1 =Integer.parseInt(editTextTextNum1.getText().toString());
        int num2 = Integer.parseInt(editTextTextNum2.getText().toString());
        editTextResult.setText(String.valueOf(num1+num2));
    }
    public void buttonSubtracao(View view){
        int num1 =Integer.parseInt(editTextTextNum1.getText().toString());
        int num2 = Integer.parseInt(editTextTextNum2.getText().toString());
        editTextResult.setText(String.valueOf(num1-num2));
    }
    public void buttonMultiplicacao(View view){
        int num1 =Integer.parseInt(editTextTextNum1.getText().toString());
        int num2 = Integer.parseInt(editTextTextNum2.getText().toString());
        editTextResult.setText(String.valueOf(num1*num2));
    }
    public void buttonDivisao(View view){
        int num1 =Integer.parseInt(editTextTextNum1.getText().toString());
        int num2 = Integer.parseInt(editTextTextNum2.getText().toString());
        if(num2 == 0){
            Toast.makeText(MainActivity.this,"Divisão infinita", Toast.LENGTH_LONG).show();
            editTextResult.setText("");
        }
        else{
            editTextResult.setText(String.valueOf(num1/num2));
        }
    }
}