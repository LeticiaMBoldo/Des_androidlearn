package br.com.mieteste.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){
        TextView texto = findViewById(R.id.textoResultado);

        /*Gerar valor randomico, numero aleatorio de 0 até 9*/
        int numero = new Random().nextInt(11);

        texto.setText("Número:" + numero);
    }
}