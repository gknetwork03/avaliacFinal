package com.tim0122.avaliaofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float Gasolina ;
    float Etanol ;
    float x ;
     String mensagem;

    EditText idGasolina, idEtanol;
    TextView idResultado;
    Button idCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idGasolina = (EditText) findViewById(R.id.IdGasolina);
        idEtanol = (EditText) findViewById(R.id.idEtanol);
        idResultado = (TextView) findViewById(R.id.IdResultado);

        idCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Etanol = Float.parseFloat(idEtanol.getText().toString());
                Gasolina = Float.parseFloat(idGasolina.getText().toString());

                x = Etanol / Gasolina;

                if(x <= 0.7){
                    mensagem = ("É melhor abastecer com Etanol!");

                }else {
                    mensagem = ("É melhor abastecer com Gasolina!");
                }

                idResultado.setText("O melhor é: "+ String.valueOf(idResultado) + "\nmensagem:" + mensagem);
            }
        });


    }
}