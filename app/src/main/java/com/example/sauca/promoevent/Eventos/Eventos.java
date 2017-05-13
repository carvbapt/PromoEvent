package com.example.sauca.promoevent.Eventos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.sauca.promoevent.Main;
import com.example.sauca.promoevent.R;

public class Eventos extends AppCompatActivity implements View.OnClickListener {

    ImageButton ibBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        ibBack = (ImageButton) findViewById(R.id.IB_BackE);

        ibBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == findViewById(R.id.IB_BackE)) {
            startActivity(new Intent(this, Main.class));
            finish();
        }
    }
}