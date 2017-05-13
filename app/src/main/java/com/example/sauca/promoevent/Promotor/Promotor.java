package com.example.sauca.promoevent.Promotor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.sauca.promoevent.Main;
import com.example.sauca.promoevent.R;

public class Promotor extends AppCompatActivity implements View.OnClickListener{

    ImageButton ibBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotor);

        ibBack=(ImageButton)findViewById(R.id.IB_BackP);

        ibBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v==findViewById(R.id.IB_BackP)){
            startActivity(new Intent(this,Main.class));
            finish();
        }
    }
}

