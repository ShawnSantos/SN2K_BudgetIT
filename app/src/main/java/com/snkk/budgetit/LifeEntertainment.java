package com.snkk.budgetit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LifeEntertainment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_entertainment);
        Button backBt = (Button)findViewById(R.id.backBT);
    }

    public void BackButton (View v){
        /*Intent i = new Intent(LifeEntertainment.this, category.class);
        startActivity(i);*/
        finish();
    }
}