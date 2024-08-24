package com.szs.formulario;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.szs.formulario.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Button botonCancelar,botonoEnviar,alert;
    EditText editNombre,editDocumento,editEdad,editMatricula;
    TextView nombre, documento,edad,matricula;
    String name,age,document,matricul,TAG="test";
    int contresume=0,contstop=0,contstar=0,contpause=0,contcreate=0,contdestroy=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            botonCancelar = findViewById(R.id.botonCancelar);
            botonoEnviar =findViewById(R.id.botonCancelar);
            editNombre = findViewById(R.id.editNombre);
            editDocumento = findViewById(R.id.editDocumento);
            editEdad = findViewById(R.id.editEdad);
            editMatricula = findViewById(R.id.editMatricula);
            nombre = findViewById(R.id.nombre);
            documento = findViewById(R.id.documento);
            edad = findViewById(R.id.edad);
            matricula = findViewById(R.id.matricula);





    }

    @Override
    protected void onStart() {
        super.onStart();
        contstar = contstar + 1 ;

        botonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(MainActivity.this, pantallaInicial.class);
                startActivity(p);
            }
        });

        botonoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = String.valueOf(editNombre.getText());
                document = String.valueOf(editDocumento.getText());
                age = String.valueOf(editEdad.getText());
                matricul = String.valueOf(editMatricula.getText());
            }
        });

        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alerta =new AlertDialog.Builder(MainActivity.this);
                alerta.setTitle("infromacion guardada");
                alerta.setMessage("Nombre: "+name+" documento: "+document+" Matricula "+ matricul);
                alerta.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                alerta.show();
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