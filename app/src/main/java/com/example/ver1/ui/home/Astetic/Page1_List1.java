package com.example.ver1.ui.home.Astetic;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;
import android.widget.Button;

import com.example.ver1.R;
import com.example.ver1.ui.home.Shop.ShopActivity;

public class Page1_List1 extends Fragment {
    private Button btn1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_page1_list1, container, false);

        btn1 = view.findViewById(R.id.btn_dange);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), ShopActivity.class);
                startActivity(in);
            }
        });
        return view;
    }
}