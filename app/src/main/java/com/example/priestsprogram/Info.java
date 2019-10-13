package com.example.priestsprogram;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Info extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


    }

    
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Info.this, SecretInfo.class);
        startActivity(intent);
    }
}
