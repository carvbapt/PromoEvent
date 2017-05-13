package com.example.sauca.promoevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.sauca.promoevent.Eventos.Eventos;
import com.example.sauca.promoevent.Promotor.Promotor;

public class Main extends AppCompatActivity implements View.OnClickListener{

    ImageButton ibBack;
    Button bPromotor,bEventos,bHistorico,bSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibBack=(ImageButton)findViewById(R.id.IB_Back);

        bPromotor=(Button)findViewById(R.id.B_Promotor);
        bEventos=(Button)findViewById(R.id.B_Eventos);
        bHistorico=(Button)findViewById(R.id.B_Historico);
        bSair=(Button)findViewById(R.id.B_Sair);

        ibBack.setOnClickListener(this);

        bPromotor.setOnClickListener(this);
        bEventos.setOnClickListener(this);
        bHistorico.setOnClickListener(this);
        bSair.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v == findViewById(R.id.IB_Back)) {
            finish();
            startActivity(new Intent(this, Splash.class));
        } else if (v == findViewById(R.id.B_Promotor)) {
            startActivity(new Intent(this, Promotor.class));
        } else if (v == findViewById(R.id.B_Eventos)) {
            startActivity(new Intent(this, Eventos.class));
        } else if (v == findViewById(R.id.B_Historico)) {
            startActivity(new Intent(this, Historico.class));
        } else if (v == findViewById(R.id.B_Sair)) {
            moveTaskToBack(true);
            finish();
            System.exit(0);
        }
    }
}
