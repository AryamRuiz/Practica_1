package com.example.practica_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practica_1.R;

public class calcula extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtResultado = (TextView)findViewById(R.id.resultado);
        final EditText edtNumero1 = (EditText) findViewById(R.id.numero1);
        final EditText edtNumero2 = (EditText)findViewById(R.id.numero2);
        Button btnSuma = (Button)findViewById(R.id.btnSuma);
        Button btnResta = (Button)findViewById(R.id.btnResta);

        btnSuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Introduzca ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }
                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);

                txtResultado.setText("Resultado: "+String.valueOf(numero1+numero2));
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Introduzca ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }
                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);

                txtResultado.setText("Resultado: "+String.valueOf(numero1-numero2));
            }
        });
    }
}
