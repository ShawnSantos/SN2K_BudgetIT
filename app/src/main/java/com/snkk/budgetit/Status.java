package com.snkk.budgetit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Status extends AppCompatActivity implements View.OnClickListener {

    Button reconciled, cleared, uncleared, voided;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        reconciled = (Button) findViewById(R.id.reconciled);
        cleared = (Button) findViewById(R.id.cleared);
        uncleared = (Button) findViewById(R.id.uncleared);
        voided = (Button) findViewById(R.id.voided);
        reconciled.setOnClickListener(this);
        cleared.setOnClickListener(this);
        uncleared.setOnClickListener(this);
        voided.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.reconciled:
                reconciled.setEnabled(true);
                cleared.setEnabled(false);
                uncleared.setEnabled(false);
                voided.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#81C784"));
                break;
            case R.id.cleared:
                reconciled.setEnabled(false);
                cleared.setEnabled(true);
                uncleared.setEnabled(false);
                voided.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#81C784"));
                break;
            case R.id.uncleared:
                reconciled.setEnabled(false);
                cleared.setEnabled(false);
                uncleared.setEnabled(true);
                voided.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#81C784"));
                break;
            case R.id.voided:
                reconciled.setEnabled(false);
                cleared.setEnabled(false);
                uncleared.setEnabled(false);
                voided.setEnabled(true);
                v.setBackgroundColor(Color.parseColor("#81C784"));
                break;
            default:
                break;
        }
    }

    //finish goes back to the fragment(in this case sa addtransaction)
    public void Nextbtn(View v){
        finish();
    }
}