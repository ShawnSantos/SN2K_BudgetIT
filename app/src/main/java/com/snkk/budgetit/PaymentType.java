package com.snkk.budgetit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentType extends AppCompatActivity implements View.OnClickListener {

    Button cash, debit, credit, bankTransfer, mobilePayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_type);

        cash = (Button) findViewById(R.id.cash);
        debit = (Button) findViewById(R.id.debit);
        credit = (Button) findViewById(R.id.credit);
        bankTransfer = (Button) findViewById(R.id.bankTransfer);
        mobilePayment = (Button) findViewById(R.id.mobilePayment);
        cash.setOnClickListener(this);
        debit.setOnClickListener(this);
        credit.setOnClickListener(this);
        bankTransfer.setOnClickListener(this);
        mobilePayment.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cash:
                cash.setEnabled(true);
                debit.setEnabled(false);
                credit.setEnabled(false);
                bankTransfer.setEnabled(false);
                mobilePayment.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#81C784"));
            break;
            case R.id.debit:
                cash.setEnabled(false);
                debit.setEnabled(true);
                credit.setEnabled(false);
                bankTransfer.setEnabled(false);
                mobilePayment.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#81C784"));
                break;
            case R.id.credit:
                cash.setEnabled(false);
                debit.setEnabled(false);
                credit.setEnabled(true);
                bankTransfer.setEnabled(false);
                mobilePayment.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#81C784"));
                break;
            case R.id.bankTransfer:
                cash.setEnabled(false);
                debit.setEnabled(false);
                credit.setEnabled(false);
                bankTransfer.setEnabled(true);
                mobilePayment.setEnabled(false);
                v.setBackgroundColor(Color.parseColor("#81C784"));
                break;
            case R.id.mobilePayment:
                cash.setEnabled(false);
                debit.setEnabled(false);
                credit.setEnabled(false);
                bankTransfer.setEnabled(false);
                mobilePayment.setEnabled(true);
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