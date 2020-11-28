package com.snkk.budgetit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class AttachPhoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attach_photo);
    }

    //finish goes back to the fragment(in this case sa addtransaction)
    public void Nextbtn(View v){
        finish();
    }
}