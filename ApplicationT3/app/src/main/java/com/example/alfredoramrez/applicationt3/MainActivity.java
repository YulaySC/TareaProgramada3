package com.example.alfredoramrez.applicationt3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    //Objetos de la clase
    Button buttonSigPriActivity;
    TextView Nombre_de_la_app;

    @Override
    //Se selecciona la pantalla o activity al que ira dirigido
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //A continuacion a cada Objeto se le define el parametro dentro del layout
        setContentView(R.layout.activity_main);
        Nombre_de_la_app=(TextView) findViewById(R.id.textViewText1);
        buttonSigPriActivity=(Button) findViewById(R.id.buttonSiguientePrimeraActivity);
    }
    //definicion de funciones de los botones
    public void onClickIraPrincipalMenu(View view){
        Intent i=new Intent(this,PrincipalMenu.class);
        startActivity(i);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
