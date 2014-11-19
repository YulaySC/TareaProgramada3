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
public class InicioSeccion extends MainActivity {

    //Objetos de la clase
    Button buttonvolveraMenuPrincipal;
    Button buttoniraMenuSecundario;
    TextView textNombreUsuarioIni;
    TextView textContraseñaIni;
    EditText edNombreUsuarioIni;
    EditText edContraseñaIni;

    //Se selecciona la pantalla o activity al que ira dirigido
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //A continuacion a cada Objeto se le define el parametro dentro del layout
        setContentView(R.layout.iniciarseccion);
        buttonvolveraMenuPrincipal=(Button) findViewById(R.id.buttonregresarfrominiciar);
        buttoniraMenuSecundario=(Button) findViewById(R.id.buttonEntrerfrominicio);
        textNombreUsuarioIni=(TextView)findViewById(R.id.textViewNombreUsuarioInicio);
        textContraseñaIni=(TextView)findViewById(R.id.textViewContraseñaInicio);
        edNombreUsuarioIni=(EditText)findViewById(R.id.editTextNombreUsuarioInicio);
        edContraseñaIni=(EditText)findViewById(R.id.editTextContraseñaInicio);

        //Se obtienen los valores de entrada de los editText(Campos que llena el Usuario)
        String nombreusuarioini= edNombreUsuarioIni.getText().toString();
        String contraseñaini=edContraseñaIni.getText().toString();

    }
//definicion de funciones de los botones
    public void onClickVolveraMenuP(View view){
        Intent i=new Intent(this,PrincipalMenu.class);
        startActivity(i);
    }
    public void onClickIraMenuS( View view){
        Intent i=new Intent(this,MenuSecundario.class);
        startActivity(i);
    }

}
