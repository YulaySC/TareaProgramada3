package com.example.alfredoramrez.applicationt3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Alfredo Ramírez on 15/11/2014.
 */
public class Registrar extends MainActivity{
    //Objetos de la clase
        Button buttonvolveraMPrincipal;
        Button buttonIaMenuSec;
        TextView texNombreUsuRe;
        TextView texContraseñaRe;
       EditText edNombreUsuarioRe;
       EditText edContraseñaRe;


     //Se selecciona la pantalla o activity al que ira dirigido
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //A continuacion a cada Objeto se le define el parametro dentro del layout
            setContentView(R.layout.registrar);
            buttonvolveraMPrincipal=(Button)findViewById(R.id.buttonregresarfromregistrar);
            buttonIaMenuSec=(Button)findViewById(R.id.buttonEntrerfromregistrar);
            texNombreUsuRe=(TextView) findViewById(R.id.textViewNombreUsuarioRegistro);
            texContraseñaRe=(TextView)findViewById(R.id.textViewContraseñaRegistro);
            edNombreUsuarioRe=(EditText)findViewById(R.id.editTextNombreUsuarioRegistro);
            edContraseñaRe=(EditText)findViewById(R.id.editTextContraseñaRegistro);

            //Se obtienen los valores de entrada de los editText(Campos que llena el Usuario)
            String nombreusuariore= edNombreUsuarioRe.getText().toString();
            String contraseñare=edContraseñaRe.getText().toString();

        }
    //definicion de funciones de los botones

    public void onClickRegresarfromRegistrar(View view){
        Intent i=new Intent(this,PrincipalMenu.class);
        startActivity(i);
    }
    public void onClickIraMenuSfromRegistrar(View view){
        Intent i=new Intent(this,MenuSecundario.class);
        startActivity(i);
    }
}
