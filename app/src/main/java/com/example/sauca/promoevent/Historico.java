package com.example.sauca.promoevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Historico extends AppCompatActivity implements View.OnClickListener{

    ImageButton ibBackL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);

        ibBackL=(ImageButton)findViewById(R.id.IB_BackL);

        ibBackL.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v==findViewById(R.id.IB_BackL)){
            startActivity(new Intent(this,Main.class));
            finish();
        }
    }
}

