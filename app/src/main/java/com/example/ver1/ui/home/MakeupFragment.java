package com.example.ver1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ver1.R;

public class MakeupFragment extends Fragment {

    private View view;

    public static MakeupFragment newInstance() {
        MakeupFragment makeupFragment = new MakeupFragment();
        return makeupFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tabitem_makeup, container, false);
        return view;
    }
}