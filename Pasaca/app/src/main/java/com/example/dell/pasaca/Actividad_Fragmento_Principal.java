package com.example.dell.pasaca;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Actividad_Fragmento_Principal extends AppCompatActivity implements View.OnClickListener, Fragmento.OnFragmentInteractionListener{
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__fragmento__principal);

        boton = (Button)findViewById(R.id.botonFrag);

        boton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        Fragmento fragmento = new Fragmento();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmento, fragmento);
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
