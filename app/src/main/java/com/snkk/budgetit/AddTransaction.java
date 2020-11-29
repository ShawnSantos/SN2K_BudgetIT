package com.snkk.budgetit;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AddTransaction extends Fragment implements View.OnClickListener {

    TextView textViewAmount;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_add_transaction,container,false);

        Button note = (Button) view.findViewById(R.id.note);
        Button paymentType = (Button) view.findViewById(R.id.paymentType);
        Button status = (Button) view.findViewById(R.id.status);
        Button attachPhoto = (Button) view.findViewById(R.id.attachPhoto);
        note.setOnClickListener(this);
        paymentType.setOnClickListener(this);
        status.setOnClickListener(this);
        attachPhoto.setOnClickListener(this);

        textViewAmount = (TextView) view.findViewById(R.id.textView_amount);
        textViewAmount.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        return view;
    }

    public void openDialog() {

        final AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
        View mView = getLayoutInflater().inflate(R.layout.layout_dialog,null);

        final EditText editTextInputAmount = (EditText) mView.findViewById(R.id.input_amount);
        Button btn_cancel = (Button) mView.findViewById(R.id.btn_cancel);
        Button btn_okay = (Button) mView.findViewById(R.id.btn_okay);

        alert.setView(mView);

        final AlertDialog alertDialog = alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialog.dismiss();
            }
        });

        btn_okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewAmount.setText(editTextInputAmount.getText().toString());
                alertDialog.dismiss();
            }
        });

        alertDialog.show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.note:
                Intent note = new Intent(getActivity(), Note.class);
                startActivity(note);
                break;
            case R.id.paymentType:
                Intent paymentType = new Intent(getActivity(), PaymentType.class);
                startActivity(paymentType);
                break;
            case R.id.status:
                Intent status = new Intent(getActivity(), Status.class);
                startActivity(status);
                break;
            case R.id.attachPhoto:
                Intent attachPhoto = new Intent(getActivity(), AttachPhoto.class);
                startActivity(attachPhoto);
                break;
            default:
                break;
        }
    }

}