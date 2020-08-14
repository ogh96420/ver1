package com.example.ver1.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.ver1.R;
import com.example.ver1.ui.home.Astetic.AsteticActivity;
import com.google.android.material.tabs.TabLayout;

import java.util.Arrays;
import java.util.List;


public class HomeFragment extends Fragment {

    private View view;
    private ImageButton btn1;
    private ImageButton btn2;
    private ImageButton btn3;
    private ImageButton btn4;
    private ImageButton btn5;
    private String result;
    private Intent intent1;
    private FragmentPagerAdapter fragmentPagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_home, container, false);

        ViewPager viewPager = (ViewPager)view.findViewById(R.id.tab_View);
        fragmentPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());


        TabLayout tabLayout = (TabLayout)view.findViewById(R.id.tab_home);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        btn1 = view.findViewById(R.id.btn_ast);
        btn2 = view.findViewById(R.id.btn_half);
        btn3 = view.findViewById(R.id.btn_nail);
        btn4 = view.findViewById(R.id.btn_wax);
        btn5 = view.findViewById(R.id.btn_in);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), AsteticActivity.class);
                startActivity(in);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), AsteticActivity.class);
                startActivity(in);

            }
        });

        return view;
    }


}
