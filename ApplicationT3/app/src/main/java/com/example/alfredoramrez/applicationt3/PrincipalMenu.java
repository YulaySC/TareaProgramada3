package com.example.alfredoramrez.applicationt3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Alfredo Ramírez on 15/11/2014.
 */
public class PrincipalMenu extends MainActivity{

    //Objetos de la clase
    Button buttonVolverMActivity;
    Button buttonIniciar;
    Button buttonRegistrar;

    //Se selecciona la pantalla o activity al que ira dirigido
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //A continuacion a cada Objeto se le define el parametro dentro del layout
        setContentView(R.layout.menu_principal);

        buttonVolverMActivity=(Button) findViewById(R.id.buttonvolveraMainActyvity);
        buttonIniciar=(Button) findViewById(R.id.buttonInicarSeccion);
        buttonRegistrar=(Button)findViewById(R.id.buttonRegistrarse);
    }

    //definicion de funciones de los botones
    public void onClickVolverMainActivity (View view){
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void onClickIraIniciar (View view){
        Intent i=new Intent(this,InicioSeccion.class);
        startActivity(i);
    }
    public void onClickIraRegistrar (View view){
        Intent i=new Intent(this,Registrar.class);
        startActivity(i);
    }

}

