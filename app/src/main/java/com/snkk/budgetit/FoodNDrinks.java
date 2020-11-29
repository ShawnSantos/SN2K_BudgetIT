package com.snkk.budgetit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodNDrinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_n_drinks);

        Button backBt = (Button)findViewById(R.id.backBT);
    }

    public void BackButton (View v){
        /*Intent i = new Intent(FoodNDrinks.this, category.class);
        startActivity(i);*/
        finish();
    }
}