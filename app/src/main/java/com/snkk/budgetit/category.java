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


public class category extends Fragment implements Categories {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View categView = inflater.inflate(R.layout.activity_categories, container, false);
        Button house_bt = (Button) categView.findViewById(R.id.housing);
        Button food_bt = (Button) categView.findViewById(R.id.food);
        Button general_bt = (Button) categView.findViewById(R.id.general);
        Button life_bt = (Button) categView.findViewById(R.id.lifeentertain);
        food_bt.setOnClickListener(mListener);
        general_bt.setOnClickListener(mListener);
        house_bt.setOnClickListener(mListener);
        life_bt.setOnClickListener(mListener);

        return categView;
    }

    final View.OnClickListener mListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.housing:
                    Intent house = new Intent(getActivity(), Housing.class);
                    startActivity(house);
                    break;

                case R.id.general:
                    Intent general = new Intent(getActivity(), General.class);
                    startActivity(general);
                    break;

                case R.id.lifeentertain:
                    Intent life = new Intent(getActivity(), LifeEntertainment.class);
                    startActivity(life);
                    break;

                case R.id.food:
                    Intent food = new Intent(getActivity(), FoodNDrinks.class);
                    startActivity(food);
                    break;
            }


        }

    };

    @Override
    public void onClick(View v) {

    }
}


