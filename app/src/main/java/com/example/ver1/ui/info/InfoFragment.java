package com.example.ver1.ui.info;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.ver1.R;
import com.example.ver1.ui.info.interdesigner.InterdesignerActivity;
import com.example.ver1.ui.info.intershop.IntershopActivity;
import com.example.ver1.ui.info.reserve.ReservationActivity;

public class InfoFragment extends Fragment {

    private Button btn_reser;
    private Button btn_inshop;
    private Button btn_indesign;
    private Button btn_recenshop;
    private View view;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_info, container, false);

        btn_reser = view.findViewById(R.id.btn_reser);
        btn_inshop = view.findViewById(R.id.btn_inshop);
        btn_indesign = view.findViewById(R.id.btn_indesign);
        btn_recenshop = view.findViewById(R.id.btn_recenshop);


        btn_reser.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), ReservationActivity.class);
                startActivity(in);
            }
        });
        btn_inshop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), IntershopActivity.class);
                startActivity(in);
            }
        });
        btn_indesign.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), InterdesignerActivity.class);
                startActivity(in);
            }
        });
        btn_recenshop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), ReservationActivity.class);
                startActivity(in);
            }
        });
        return view;
    }
}

