package com.snkk.budgetit;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AddTransaction extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_add_transaction, container, false);

        Button note = (Button) v.findViewById(R.id.note);
        Button paymentType = (Button) v.findViewById(R.id.paymentType);
        Button status = (Button) v.findViewById(R.id.status);
        Button attachPhoto = (Button) v.findViewById(R.id.attachPhoto);
        note.setOnClickListener(this);
        paymentType.setOnClickListener(this);
        status.setOnClickListener(this);
        attachPhoto.setOnClickListener(this);



        return v;
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