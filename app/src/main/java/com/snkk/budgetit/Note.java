package com.snkk.budgetit;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Note extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
    }


    //finish goes back to the fragment(in this case sa addtransaction)
    public void Nextbtn(View v){
        finish();
    }
}