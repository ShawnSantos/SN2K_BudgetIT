package com.snkk.budgetit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Statistics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        //Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.stats);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext(), Dashboard.class));
                        return true;

                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.stats:
                        return true;

                    case R.id.add_trans:
                        startActivity(new Intent(getApplicationContext(), AddTransaction.class));
                        return true;

                    case R.id.categories:
                        startActivity(new Intent(getApplicationContext(), Categories.class));
                        return true;

                    case R.id.forum:
                        startActivity(new Intent(getApplicationContext(), Forum.class));
                        return true;


                }
                return false;
            }
        });
    }
}