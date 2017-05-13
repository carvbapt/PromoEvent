package com.example.sauca.promoevent;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Splash extends AppCompatActivity implements View.OnClickListener {

    ImageButton ibSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ibSplash=(ImageButton)findViewById(R.id.IB_Splash);

        ibSplash.setOnClickListener(this);

        int delaye=5;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this,Main.class));
                finish();
            }
        },delaye*1000);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this,Main.class));
    }
}
