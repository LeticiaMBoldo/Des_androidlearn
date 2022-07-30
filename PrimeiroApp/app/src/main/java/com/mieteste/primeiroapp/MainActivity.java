package com.mieteste.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto(View view){
        /*Criando referencias para os componentes da activity_ main*/
        TextView texto = findViewById(R.id.textoExibicao);
        texto.setText("Letícia Boldo");
    }

}