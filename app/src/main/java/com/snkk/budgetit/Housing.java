package com.snkk.budgetit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Housing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing);
        Button backBt = (Button)findViewById(R.id.backBT);
    }

    public void BackButton (View v){
        Intent i = new Intent(Housing.this, category.class);
        startActivity(i);
    }
}