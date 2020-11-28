package com.snkk.budgetit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AddTransaction extends Fragment {

    private TextView textViewAmount;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_add_transaction,container,false);

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
        AmountDialog amountDialog = new AmountDialog();
        amountDialog.show(getActivity().getSupportFragmentManager(), "amount dialog");
    }
}