package com.szs.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class pantallaInicial extends AppCompatActivity {

    Button botonEntrar;
    String TAG="test";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_inicial);
        Log.d(TAG,"Estoy en el onCreate");

        botonEntrar = findViewById(R.id.botonEntrar);


    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Estoy en el onStar");

        botonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent r = new Intent(pantallaInicial.this, MainActivity.class);
                startActivity(r);
            }
        });



    }




    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Estoy en el onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Estoy en el onPause");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG,"Estoy en el onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Estoy en el onDestroy");
    }


}
