package com.snkk.budgetit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

      BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
      bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.dashboard:
                            selectedFragment = new Dashboard();
                            break;

                        case R.id.stats:
                            selectedFragment = new Statistics();
                            break;

                        case R.id.add_trans:
                            selectedFragment = new AddTransaction();
                            break;

                        case R.id.categories:
                            selectedFragment = new category();
                            break;

                        case R.id.forum:
                            selectedFragment = new Forum();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();

                    return true;
                }
            };

}