package com.example.ver1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ver1.R;

public class AestheticFragment extends Fragment {

    private View view;

    public static AestheticFragment newInstance() {
        AestheticFragment aestheticFragment = new AestheticFragment();
        return aestheticFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tabitem_aesthetic, container, false);
        return view;
    }
}