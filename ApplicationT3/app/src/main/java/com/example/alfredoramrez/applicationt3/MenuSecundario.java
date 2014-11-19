package com.example.alfredoramrez.applicationt3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Alfredo Ramírez on 16/11/2014.
 */
public class MenuSecundario extends MainActivity {
    //Objetos de la clase
    Button buttonverPREG;
    Button buttonverResp;
    Button buttonSALIR;
    TextView texPREG;
    TextView texRES;
    TextView ELEGIR;
    TextView texedRES;
    TextView texedPREG;
    EditText edEditaroResp;
    EditText edEditarPre;

//Se selecciona la pantalla o activity al que ira dirigido

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //A continuacion a cada Objeto se le define el parametro dentro del layout
        setContentView(R.layout.menu_secundario);
        buttonverPREG=(Button)findViewById(R.id.buttonverpreguntas);
        buttonverResp=(Button)findViewById(R.id.buttonverrespuestas);
        buttonSALIR=(Button)findViewById(R.id.buttonsalir);
        texPREG=(TextView) findViewById(R.id.textViewpreguntas);
        texRES=(TextView)findViewById(R.id.textViewrespuestas);
        ELEGIR=(TextView) findViewById(R.id.categoria);
        texedPREG=(TextView)findViewById(R.id.textVieweditpregunta);
        texedRES=(TextView) findViewById(R.id.editTexteditrespuesta);

        edEditaroResp=(EditText)findViewById(R.id.editTexteditrespuesta);
        edEditarPre=(EditText)findViewById(R.id.editTexteditpregunta);

        //Se obtienen los valores de entrada de los editText(Campos que llena el Usuario)
        String EscribirPreguntas= edEditarPre.getText().toString();
        String EscribirRespuestas=edEditaroResp.getText().toString();
    }
    public void onClickPreguntas(View view){
        Intent i=new Intent(this,Preguntas.class);
        startActivity(i);
    }
    public void onClickRespuestas(View view) {
        Intent i = new Intent(this, Respuestas.class);
        startActivity(i);
    }
    public void onClickSalir(View view) {
        Intent i = new Intent(this,PrincipalMenu.class);
        startActivity(i);
    }
}
