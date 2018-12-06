package com.example.dell.pasaca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad_Suma extends AppCompatActivity {

    EditText num1, num2;
    Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__suma);

        num1 = (EditText)findViewById(R.id.txtnumero1);
        num2 = (EditText)findViewById(R.id.txtnumero2);
        boton = (Button)findViewById(R.id.btnSuma);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int horas=Integer.parseInt(num1.getText().toString());
                double preciohora = Double.parseDouble(num2.getText().toString());
                double sueldo;
                if (horas<=40){
                    sueldo = horas*preciohora;
                }else {
                    int horasE = horas - 40;
                    double precioExtra = preciohora * (1.5);
                    double sueldoExtra = horasE * precioExtra;
                    sueldo = sueldoExtra+(40*preciohora);
                }
                if (sueldo>200){
                    double s = sueldo-200;
                    double impuesto = s*0.10;
                    sueldo = sueldo -impuesto;
                }

                Toast.makeText(Actividad_Suma.this, "Resultado"+sueldo, Toast.LENGTH_SHORT).show();

                }

                });
    }
}
