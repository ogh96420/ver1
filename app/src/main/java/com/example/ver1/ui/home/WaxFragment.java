package com.example.ver1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ver1.R;

public class WaxFragment extends Fragment {

    private View view;

    public static WaxFragment newInstance() {
        WaxFragment waxFragment = new WaxFragment();
        return waxFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tabitem_wax, container, false);
        return view;
    }
}